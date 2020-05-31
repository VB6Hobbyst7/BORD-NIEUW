B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
Sub Class_Globals
	Private client As MqttClient
	Private host As String = "pdeg3005.mynetgear.com"
	Private const port As Int = 1883
	Private serializator As B4XSerializator
	Public connected As Boolean
	Public pubName As String
End Sub


Public Sub Initialize
End Sub

Sub PrepPubName
	pubName = $"${func.mqttName}${func.mqttbase}recvdata_${funcScorebord.bordName.Replace(" ", "")}"$  'funcScorebord.bordName.Replace(" ", "")
End Sub

Public Sub ConnectTo
	Try
		If connected Then client.Close
	
		client.Initialize("client", $"tcp://${host}:${port}"$, pubName & Rnd(1, 10000000))
		Dim mo As MqttConnectOptions
		mo.Initialize("", "")
	
		'this message will be sent if the client is disconnected unexpectedly.
		'mo.SetLastWill(pubName, serializator.ConvertObjectToBytes(pubName&" DIED"), 0, False)
		mo.SetLastWill(pubName, CreateMessage(pubName, "recvdied"), 0, False)
		
		client.Connect2(mo)
	Catch
		Log($"CONNECT TO PUBDATA ${LastException}"$)
		func.mqttClientConnected = False
		CallSub2(scorebord, "SetBrokerIcon", False)
	End Try
End Sub

Private Sub client_Connected (Success As Boolean)
	Try
		If Success Then
			connected = True
			CallSub2(scorebord, "SetBrokerIcon", True)
			'client.Subscribe(pubName&"/#", 0)
			client.Subscribe(pubName, 0)
		Else
'			Log("Error connecting: " & LastException)
			func.mqttClientConnected = False
		End If
	Catch
		CallSub2(scorebord, "SetBrokerIcon", False)
		Log($"CLIENT CONNECTED PUBDATA ${LastException}"$)
	End Try
End Sub

Private Sub client_MessageArrived (Topic As String, Payload() As Byte)
	Try
		Dim receivedObject As Object = serializator.ConvertBytesToObject(Payload)
		Dim m As Message = receivedObject
'	Log(m.Body)	
		If m.Body.IndexOf("data please") > -1 Then
			CallSubDelayed(scorebord, "CreateJsonFormMqttClient")
		End If
		If m.Body.IndexOf("players please") > -1 Then
			LogDebug("players please")
			CallSubDelayed(scorebord, "CreateJsonFormMqttClient")
		End If
	Catch
		Log("")
	End Try
End Sub

Public Sub StopServer
	connected = False
	If client.Connected Then
	'	client.Unsubscribe(pubName)
		client.Close
	End If
End Sub

Public Sub SendMessage(Body As String, From As String)
	
	Try
		If connected Then
			client.Publish2(pubName, CreateMessage(Body, From), 0, False)
		End If
	Catch
		StopServer
		'Log("Mqtt broker lost")
	End Try
	
End Sub

Private Sub CreateMessage(Body As String, From As String) As Byte()
	Dim m As Message
	m.Initialize
	m.Body = Body
	m.From = From
	Return serializator.ConvertObjectToBytes(m)
End Sub
