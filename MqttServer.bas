B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
Sub Class_Globals
'	Private fx As JFX
'	Private broker1 As MqttBroker
	Private client As MqttClient
	
	Private const port As Int = 1883    '51042
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
	Private host As String = "pdeg3005.mynetgear.com"
	Private name As String = funcScorebord.bordName
	Private topicName As String
	Private pubName As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	pubName = PrepTopicName
	name = funcScorebord.bordName
	autodiscover.Initialize("autodiscover",discoverPort , 8192)
	BroadcastTimer.Initialize("BroadcastTimer", 6000)
	
'	broker1.Initialize("", port) 'first parameter is the event name. It is currently not used.
'	broker1.DebugLog = False
	users.Initialize
'	isServer = True
End Sub


Private Sub PrepTopicName As String
	topicName = funcScorebord.bordName.Replace(" ", "")
'	topicName = topicName.Replace(" ", "")
'	Log("TOPIC NAME : " & topicName)
	Return topicName
End Sub

Private Sub BroadcastTimer_Tick
	
'	Log($"PUBNAME : ${PrepTopicName}"$)
	
	Dim address As String = GetBroadcastAddress
	If address <> "" Then
		Dim up As UDPPacket
		Dim bord() As Object = Array As String(func.ipNumber, funcScorebord.bordName)
	'	Log(bord)
		'up.Initialize(serializator.ConvertObjectToBytes(func.ipNumber), address, discoverPort)
		up.Initialize(serializator.ConvertObjectToBytes(Array As String(func.ipNumber, funcScorebord.bordName)), address, discoverPort)
		client.Publish2("pubBord",serializator.ConvertObjectToBytes(funcScorebord.bordName), 0, False)
'		Log("DATA SEND")
		'client.Publish2(funcScorebord.bordName, CreateMessage(Body), 0, False)
		'autodiscover.Send(up)
	End If
End Sub

Public Sub EnableBroadcastTimer(enable As Boolean)
	BroadcastTimer.Enabled = enable
End Sub

Public Sub ConnectTo()
	currentName = funcScorebord.bordName'name
	'isServer = host = "127.0.0.1"
'	If isServer Then
		If brokerStarted = False Then
		'	broker1.Start
			brokerStarted = True
		End If
		users.Clear
		'host = "127.0.0.1"
'	End If
	If connected Then client.Close
	client.Initialize("client", $"tcp://${host}:${port}"$, PrepTopicName & Rnd(1, 10000000))
	Dim mo As MqttConnectOptions
	mo.Initialize("", "")
	
	'this message will be sent if the client is disconnected unexpectedly.
	mo.SetLastWill("all/disconnect", serializator.ConvertObjectToBytes(PrepTopicName), 0, False)
	client.Connect2(mo)
End Sub

Private Sub client_Connected (Success As Boolean)
	'Log($"Connected: ${Success}"$)
	If Success Then
		connected = True
'		client.Subscribe("all/#", 0)

'-----PUBLISH BORD NAME
		client.Subscribe(PrepTopicName&"/#", 0)
		client.Publish(PrepTopicName, serializator.ConvertObjectToBytes(PrepTopicName))
		client.Publish2(PrepTopicName, serializator.ConvertObjectToBytes(PrepTopicName), 0, False)
'-----PUBLISH BORD NAME

		'-----PUBLISH BORD DATA
		client.Subscribe("pubdata"&"/#", 0)
		'client.Publish("pubdata", serializator.ConvertObjectToBytes("pubdata"))
		'client.Publish2("pubdata", serializator.ConvertObjectToBytes("pubdata"), 0, False)
		'-----PUBLISH BORD DATA
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
'		Dim m As Message = receivedObject
		CallSubDelayed(scorebord, "CreateJsonFormMqttClient")
		'Log($"NEW MESSAGE : ${m}"$)
		'CallSub2(Chat, "NewMessage", m)
	End If
		
End Sub

Public Sub SendMessage(Body As String)
	If connected Then
		client.Publish2(PrepTopicName, CreateMessage(Body), 0, False)
	End If
End Sub

Public Sub SendMessageData(Body As String)
	Log($"SEND MESSAGE DATA $Time{DateTime.Now}"$)
	If connected Then
		client.Publish2("pubdata", CreateMessage(Body), 0, False)
	End If
End Sub

Public Sub StopServer
	connected = False
	client.Close
'	broker1.Stop
	brokerStarted = False
End Sub

Private Sub CreateMessage(Body As String) As Byte()
	Dim m As Message
	m.Initialize
	m.Body = Body
	m.From = PrepTopicName
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