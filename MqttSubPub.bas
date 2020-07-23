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
	pubName = $"${func.mqttName}${func.mqttbase}${funcScorebord.bordName.Replace(" ", "")}"$  'funcScorebord.bordName.Replace(" ", "")
End Sub

Public Sub ConnectTo
	Try
		If connected Then client.Close
	
		client.Initialize("client", $"tcp://${host}:${port}"$, pubName & Rnd(1, 10000000))
		Dim mo As MqttConnectOptions
		mo.Initialize("", "")
	
		'this message will be sent if the client is disconnected unexpectedly.
		mo.SetLastWill(pubName, serializator.ConvertObjectToBytes(pubName&" DIED"), 0, False)
		client.Connect2(mo)
	Catch
		func.WriteErrorToFile("connectpubdata.txt", LastException)
	'	Log($"CONNECTTO PUBDATA ${LastException}"$)
		func.mqttClientConnected = False
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
		func.WriteErrorToFile("clientconnectedpubdata.txt", LastException)
		'Log($"CLIENT CONNECTED PUBDATA ${LastException}"$)
	End Try
End Sub

Private Sub client_MessageArrived (Topic As String, Payload() As Byte)
	
	Try
		Dim receivedObject As Object = serializator.ConvertBytesToObject(Payload)
		Dim m As Message = receivedObject

		If m.Body.IndexOf("data please") > -1 Then
			CallSubDelayed(scorebord, "CreateJsonFormMqttClient")
		End If
	Catch
		func.WriteErrorToFile("msgarrived.txt", LastException)
		'Log("")
	End Try
End Sub

Public Sub StopServer
	If client.Connected Then
		connected = False
		client.Unsubscribe(pubName)
		client.Close
	End If
End Sub

Public Sub SendMessage(Body As String, From As String)
	
	Try
		If connected Then
			client.Publish2(pubName, CreateMessage(Body, From), 0, False)
		End If
	Catch
		func.WriteErrorToFile("sendmessage.txt", LastException)
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
