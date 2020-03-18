B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Dim fw As fileWatcher
	Dim appPath As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	appPath = parseConfig.getAppPath
	fw.Initialize("fw")     'Initialize with the event name
	'fw.SetWatchList(Array As String(appPath))   'Set the current dir to be watched
	fw.StartWatching       'Start Watching
	fw.GetCreationTime("retro.cnf")
	StartMessageLoop
End Sub

Sub fw_ModificationDetected(FileName As String)
	Log("ModificationDetected: " & FileName)   'Logs the modification of a file or folder
End Sub