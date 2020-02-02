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
	Dim cfgTimeStamp, cfgCurrTimeStamp As Long
	Dim sh As Shell
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	appPath = parseConfig.getAppPath
	cfgTimeStamp = File.LastModified(appPath, "cnf.44")
	
'	Log($"${DateTime.Date(cfgTimeStamp)}"$)
	
	tmr.Initialize("chkConfig", 5000)
	enabledTimer(True)
End Sub


Public Sub enabledTimer(enable As Boolean)
	tmr.Enabled = enable
End Sub

Sub chkConfig_Tick
	cfgCurrTimeStamp = File.LastModified(appPath, "cnf.44")
	
	If cfgCurrTimeStamp <> cfgTimeStamp Then
		parseConfig.pullConfig
'		Log("CHANGE")
		cfgTimeStamp = cfgCurrTimeStamp
		CallSub(scorebord, "updateCfg")
'		Log("USE DIGITAL " & parseConfig.useDigitalFont)
		CallSub2(scorebord, "useDigitalFont", parseConfig.useDigitalFont)
		
	End If

	
'	checkIfUpdated

	
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
	
		Log("UPDATING")
		File.Delete(appFolder, "upd.pdg")
		'sh.Initialize("sh /home/pi/44/restart_bord.sh", Null, Null)
		'sh.Initialize("sh", "sh", Array("/home/pi/44/restart_bord.sh"))
		sh.Initialize("sh", "sh", Array("restart_bord.sh"))
		sh.Run(5000)
		ExitApplication
	End If
End Sub