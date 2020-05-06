B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
Sub Class_Globals
'	Private fx As JFX
	Private broker1 As MqttBroker
	Private client As MqttClient
	
	Private const port As Int = 51042
	Private const discoverPort As Int = 51049
	Private autodiscover As UDPSocket
	Private BroadcastTimer As Timer
	Private server As ServerSocket 'ignore
	
	Private serializator As B4XSerializator
	Public connected As Boolean
	Public brokerStarted As Boolean
	Public isServer As Boolean
	Private users As List
	Private fx As JFX
	Private currentName As String
	Private host As String = "127.0.0.1"
	Private name As String = "SomeTable"
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	autodiscover.Initialize("autodiscover",discoverPort , 9192)
	BroadcastTimer.Initialize("BroadcastTimer", 1000)
	
	broker1.Initialize("", port) 'first parameter is the event name. It is currently not used.
	broker1.DebugLog = False
	users.Initialize
'	isServer = True
End Sub

Private Sub BroadcastTimer_Tick
	Dim address As String = GetBroadcastAddress
	If address <> "" Then
		Dim up As UDPPacket
		up.Initialize(serializator.ConvertObjectToBytes(func.ipNumber), address, discoverPort)
		autodiscover.Send(up)
	End If
End Sub

Public Sub EnableBroadcastTimer(enable As Boolean)
	BroadcastTimer.Enabled = enable
End Sub

Public Sub ConnectTo()
	currentName = name
	isServer = host = "127.0.0.1"
	If isServer Then
		If brokerStarted = False Then
			broker1.Start
			brokerStarted = True
		End If
		users.Clear
		host = "127.0.0.1"
	End If
	If connected Then client.Close
	client.Initialize("client", $"tcp://${host}:${port}"$, "android" & Rnd(1, 10000000))
	Dim mo As MqttConnectOptions
	mo.Initialize("", "")
	'this message will be sent if the client is disconnected unexpectedly.
	mo.SetLastWill("all/disconnect", serializator.ConvertObjectToBytes(currentName), 0, False)
	client.Connect2(mo)
End Sub

Private Sub client_Connected (Success As Boolean)
	'Log($"Connected: ${Success}"$)
	If Success Then
		connected = True
		client.Subscribe("all/#", 0)
		client.Publish2("all/connect", serializator.ConvertObjectToBytes(currentName), 0, False)
	Else
		Log("Error connecting: " & LastException)
	End If
End Sub

Private Sub client_MessageArrived (Topic As String, Payload() As Byte)
	Dim receivedObject As Object = serializator.ConvertBytesToObject(Payload)
	If Topic = "all/connect" Or Topic = "all/disconnect" Then
		'new client has connected or disconnected
		Dim newUser As String = receivedObject
		If isServer Then
			Log($"${Topic}: ${newUser}"$)
			Dim index As Int = users.IndexOf(newUser)
			If Topic.EndsWith("connect") And index = -1 Then users.Add(newUser)
			If Topic.EndsWith("disconnect") And index >= 0 Then users.RemoveAt(index)
			client.Publish2("all/users", serializator.ConvertObjectToBytes(users), 0, False)
		End If
	Else if Topic = "all/users" Then
'		Dim newUsers As List = receivedObject
		'CallSubDelayed2(Chat, "NewUsers", newUsers) 'this will start the chat activity if it wasn't started yet.
	Else
		Dim m As Message = receivedObject
		'Log($"NEW MESSAGE : ${m}"$)
		'CallSub2(Chat, "NewMessage", m)
	End If
		
End Sub

Public Sub SendMessage(Body As String)
	If connected Then
		client.Publish2("all", CreateMessage(Body), 0, False)
	End If
End Sub

Public Sub StopServer
	client.Close
	broker1.Stop
	brokerStarted = False
End Sub

Private Sub CreateMessage(Body As String) As Byte()
	Dim m As Message
	m.Initialize
	m.Body = Body
	m.From = currentName
	Return serializator.ConvertObjectToBytes(m)
End Sub

Private Sub GetBroadcastAddress As String
	Dim niIterator As JavaObject
	niIterator = niIterator.InitializeStatic("java.net.NetworkInterface").RunMethod("getNetworkInterfaces", Null)
	Do While niIterator.RunMethod("hasMoreElements", Null)
		Dim ni As JavaObject = niIterator.RunMethod("nextElement", Null)
		If ni.RunMethod("isLoopback", Null) = False Then
			Dim addresses As List = ni.RunMethod("getInterfaceAddresses", Null)
			For Each ia As JavaObject In addresses
				Dim broadcast As Object = ia.RunMethod("getBroadcast", Null)
				If broadcast <> Null Then
					Dim b As String = broadcast
					Return b.SubString(1)
				End If
			Next
		End If
	Loop
	Return ""
End Sub