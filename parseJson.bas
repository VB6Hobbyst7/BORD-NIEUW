B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
	
	Public timeOut As Int
	Public timeOutActive As Boolean
	Private appPath As String
	Private cnf As String
	Private parser As JSONParser
End Sub


Sub getAppPath As String
	Dim os As String = DetectOS
	
	Select os
		Case "windows"
			appPath = File.DirApp&"\44"
		Case "linux"
			appPath = File.DirApp&"/44"
	End Select
	
	Return appPath
End Sub


Sub parseConfig
	
	cnf = File.ReadString(appPath, "json.txt")
	
	parser.Initialize(cnf)

	Dim root As Map = parser.NextObject
	Dim showPromote As Map = root.Get("showPromote")
	If showPromote.Get("active") = "1" Then
		timeOutActive = True
	Else
		timeOutActive = False
	End If
	timeOut = showPromote.Get("timeOut")
	
	
	
End Sub

Sub DetectOS As String
	Dim os As String = GetSystemProperty("os.name", "").ToLowerCase
	If os.Contains("win") Then
		Return "windows"
	Else If os.Contains("mac") Then
		Return "mac"
	Else
		Return "linux"
	End If
End Sub