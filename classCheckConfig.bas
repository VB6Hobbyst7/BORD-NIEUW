B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Dim tmr As Timer
	Dim appPath As String
	Dim cfgTimeStamp, cfgCurrTimeStamp As Long
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	appPath = parseConfig.getAppPath
	cfgTimeStamp = File.LastModified(appPath, "")
	
	Log($"${DateTime.Date(cfgTimeStamp)}"$)
	
	tmr.Initialize("chkConfig", 5000)
	tmr.Enabled = True
End Sub


Sub chkConfig_Tick
	cfgCurrTimeStamp = File.LastModified(appPath, "")
	
	If cfgCurrTimeStamp <> cfgTimeStamp Then
		parseConfig.pullConfig
		Log("CHANGE")
		cfgTimeStamp = cfgCurrTimeStamp
		CallSub(scorebord, "updateCfg")
		Log("USE DIGITAL " & parseConfig.useDigitalFont)
		CallSub2(scorebord, "useDigitalFont", parseConfig.useDigitalFont)
		
	End If
	
End Sub