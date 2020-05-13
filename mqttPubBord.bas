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
	Private pubName As String = "pubbord"
	
	
End Sub

Public Sub Initialize
	pubBordTimer.Initialize("pubBordTimer", 6000)
End Sub

Public Sub PrepTopicName(name As String)
	topicName = name.Replace(" ", "")
End Sub

public Sub EnablePubTimer(enable As Boolean)
	pubBordTimer.Enabled = enable
End Sub

Public Sub ConnectTo()
	If connected Then client.Close
	
	client.Initialize("client", $"tcp://${host}:${port}"$, topicName & Rnd(1, 10000000))
	Dim mo As MqttConnectOptions
	mo.Initialize("", "")
	
	'this message will be sent if the client is disconnected unexpectedly.
	mo.SetLastWill(pubName, serializator.ConvertObjectToBytes(topicName&" DIED"), 0, False)
	client.Connect2(mo)
End Sub

Private Sub client_Connected (Success As Boolean)
	If Success Then
		connected = True
		client.Subscribe(pubName&"/#", 0)
	Else
		Log("Error connecting: " & LastException)
	End If
End Sub

Public Sub StopServer
	SendMessage("bord-died")
	Sleep(1000)
	connected = False
	client.Close
End Sub

Public Sub SendMessage(Body As String)
	Log("BODY " &Body)
	If connected Then
		client.Publish2(pubName,serializator.ConvertObjectToBytes(Body), 0, False)
		'client.Publish2(pubName, CreateMessage(Body), 0, False)
	End If
End Sub

Private Sub CreateMessage(Body As String) As Byte()
	Dim m As Message
	m.Initialize
	m.Body = Body
	m.From = topicName
	Return serializator.ConvertObjectToBytes(m)
End Sub


Private Sub pubBordTimer_Tick
'	Log($"PUBLISH NAME (${pubName}) $Time{DateTime.Now}"$)
	client.Publish2(pubName,serializator.ConvertObjectToBytes(funcScorebord.bordName), 0, False)
End Sub