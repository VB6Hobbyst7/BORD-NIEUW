B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
#IgnoreWarnings: 16, 9, 12
Sub Class_Globals
	Private fx As JFX
	Dim tmr As Timer
	Dim appPath As String
	Dim cfgTimeStamp, cfgCurrTimeStamp, retroCurrTimeStamp, retroTimeStamp, mqttTimeStamp, mqttCurrTimeStamp As Long
	Dim sh As Shell
	
	Dim retroVisible As Boolean = False
	
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	appPath = parseConfig.getAppPath
	cfgTimeStamp = File.LastModified(appPath, "cnf.44")
	retroTimeStamp = File.LastModified(appPath, "retro.cnf")
	mqttTimeStamp = File.LastModified(appPath, "mqtt.conf")
	
	tmr.Initialize("chkConfig", 5000)
	enabledTimer(True)
End Sub


Public Sub enabledTimer(enable As Boolean)
	tmr.Enabled = enable
End Sub

Sub chkConfig_Tick
'	If func.mqttClientConnected = False Then
'		CallSub(scorebord, "PubBord")
'	End If
	
	cfgCurrTimeStamp = File.LastModified(appPath, "cnf.44")
	
	If cfgCurrTimeStamp <> cfgTimeStamp Then
		parseConfig.pullConfig
		cfgTimeStamp = cfgCurrTimeStamp
		CallSub(scorebord, "updateCfg")
		CallSub2(scorebord, "useDigitalFont", parseConfig.useDigitalFont)
	End If

	retroCurrTimeStamp = File.LastModified(appPath, "retro.cnf")
	
	If retroTimeStamp <> retroCurrTimeStamp Then
		Dim strRetro As String = File.ReadString(appPath, "retro.cnf")
		ProcessRetro(strRetro)			
	End If
	
	mqttCurrTimeStamp = File.LastModified(appPath, "mqtt.conf")
	If mqttTimeStamp <> mqttCurrTimeStamp Then
		mqttTimeStamp = mqttCurrTimeStamp
		'Log($"$Time{DateTime.Now} MQTT CHANGED"$)
		CallSub(scorebord, "EnableMqtt")
	End If
End Sub


public Sub ProcessRetro(strRetro As String)
	Dim parser As JSONParser
	parser.Initialize(strRetro)
	Dim root As Map = parser.NextObject
	Dim retro As Map = root.Get("retroBord")
	Dim active As String = retro.Get("active")
	
	If active = "1"  And retroVisible = True Then
		Return
	End If
	
	
	If active = "1" Then
		funcScorebord.bordIsRetro = True
		retroVisible = True
		scorebord.frm.RootPane.Visible = False
		retroBord.showBord
	Else
		funcScorebord.bordIsRetro = False
		retroVisible = False
		retroBord.frm.Close
		scorebord.frm.RootPane.Visible = True
	End If
	
	
End Sub


Sub checkIfUpdated
	Dim appPath As String = parseConfig.getAppPath
	Dim os As String = parseConfig.DetectOS
	Dim appFolder As String
	Select os
		Case "windows"
			appFolder = File.DirApp&"\44\"
		Case "linux"
			appFolder = File.DirApp&"/44/"
	End Select
	If File.Exists(appFolder, "upd.pdg") Then
	
		'Log("UPDATING")
		File.Delete(appFolder, "upd.pdg")
		'sh.Initialize("sh /home/pi/44/restart_bord.sh", Null, Null)
		'sh.Initialize("sh", "sh", Array("/home/pi/44/restart_bord.sh"))
		sh.Initialize("sh", "sh", Array("restart_bord.sh"))
		sh.Run(5000)
		ExitApplication
	End If
End Sub



