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
	
	Private pubBordTimer As Timer
	Private serializator As B4XSerializator
	Public connected As Boolean
	Private topicName As String
	Private pubName As String
	Private pubNameAll As String
	Private pubDisconnect As String
	
	
End Sub

Public Sub Initialize
	pubBordTimer.Initialize("pubBordTimer", 6000)
End Sub

public Sub SetPub
	pubName = $"${func.mqttName}${func.mqttbase}"$
	pubNameAll = $"${func.mqttName}${func.mqttbase}pubbord"$
	pubDisconnect = $"${func.mqttName}${func.mqttbase}"$
End Sub

Public Sub PrepTopicName(name As String)
	topicName = name.Replace(" ", "")
End Sub

public Sub EnablePubTimer(enable As Boolean)
	pubBordTimer.Enabled = enable
End Sub

Public Sub ConnectTo
	If connected Then client.Close
	
	Try
'		Log($"SUBSCRIBE : ${pubDisconnect}"$)
'		Log($"TOPICNAME : ${topicName}"$)
		client.Initialize("client", $"tcp://${host}:${port}"$, topicName & Rnd(1, 10000000))
		Dim mo As MqttConnectOptions
		mo.Initialize("", "")
	
		'this message will be sent if the client is disconnected unexpectedly.
		mo.SetLastWill(pubDisconnect, serializator.ConvertObjectToBytes(topicName&" DIED"), 0, False)
		client.Connect2(mo)
	Catch
		Log(LastException)
'		Log($"- $Time{DateTime.Now} LastException"$)
	End Try
End Sub

Private Sub client_Connected (Success As Boolean)
	Try
		If Success Then
			connected = True
'			'client.Subscribe(func.mqttbase&pubName&"/#", 0)
'			Log("CLIENT CONNECTED " & pubNameAll)
			client.Subscribe(pubNameAll, 0)
			
			EnablePubTimer(True)
		Else
			Log("Error connecting: " & LastException)
		End If
	Catch
		Log("Mqtt disconnected")
	End Try
End Sub

Public Sub StopServer
'	Log("STOP SERVER")
	If client.Connected Then
		connected = False
		EnablePubTimer(False)
		client.Unsubscribe(pubName)
		client.Close
	End If
End Sub

Public Sub SendMessage(Body As String)
	Try
		If connected Then
			CallSub2(scorebord, "SetBrokerIcon", True)
			client.Publish2(pubName,serializator.ConvertObjectToBytes(Body), 0, False)
		End If
	Catch
		Log("Mqtt broker lost")
		StopServer
	End Try
End Sub

Private Sub CreateMessage(Body As String) As Byte()
	Dim m As Message
	m.Initialize
	m.Body = Body
	m.From = topicName
	Return serializator.ConvertObjectToBytes(m)
End Sub


Private Sub pubBordTimer_Tick
	func.mqttClientConnected = client.Connected
	Try
		client.Publish2(pubNameAll,serializator.ConvertObjectToBytes(funcScorebord.bordName), 0, False)
	Catch
		pubBordTimer.Enabled = False
		CallSub2(scorebord, "SetBrokerIcon", False)
		'Log("Broker lost")
	End Try
End Sub

Public Sub CLientConnected As Boolean
	Return client.Connected
End Sub
