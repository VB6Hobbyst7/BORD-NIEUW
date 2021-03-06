B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
Sub Class_Globals
	Dim mqtt As MqttClient
	Dim working As Boolean
'	Dim brokerConnected As Boolean
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	working = True
	If File.Exists(func.appPath, "mqtt.conf") Then
		ConnectAndReconnect
	End If
End Sub

Sub ConnectAndReconnect
	Do While working
		If mqtt.IsInitialized Then mqtt.Close
		mqtt.Initialize("mqtt", "tcp://pdeg3005.mynetgear.com:1883", "B4X" & Rnd(0, 999999999))
		Dim mo As MqttConnectOptions
		mo.Initialize("", "")
'		Log("Trying to connect")
		mqtt.Connect2(mo)
		Wait For Mqtt_Connected (Success As Boolean)
		If Success Then
			CallSubDelayed2(scorebord, "SetBrokerStatus", True)
			'CallSub(scorebord, "StartStopClientServer")
			CallSubDelayed(scorebord, "EnableMqtt")
'			CallSub(scorebord, "MqttConnected")
			Do While working And mqtt.Connected
'			Log($"Starter Mqtt connected $Time{DateTime.Now}"$)
				mqtt.Publish2("ping", Array As Byte(0), 1, False) 'change the ping topic as needed
				Sleep(5000)
			Loop
'			Log("Disconnected")
			CallSubDelayed2(scorebord, "SetBrokerStatus", False)
			CallSubDelayed(scorebord, "MqttConnected") 
			CallSubDelayed(scorebord, "DisconnectMqtt")
			If mqtt.IsInitialized Then mqtt.Close
		Else
'			Log("Error connecting.")
			If mqtt.IsInitialized Then mqtt.Close
		End If
		Sleep(5000)
	Loop
End Sub