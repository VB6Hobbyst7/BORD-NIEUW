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
	Public useDigitalFont As Boolean
	Private appPath As String
	Private cnf As String
	Private parser As JSONParser
End Sub


Sub getAppImagePath As String
	Dim os As String = DetectOS
	Dim mediaPath As String
	Select os
		Case "windows"
			mediaPath = File.DirApp&"\44\media\"'cnf.44"
		Case "linux"
			mediaPath = File.DirApp&"/44/media/"'cnf.44"
	End Select
	
	Return mediaPath
	
End Sub

Sub getAppPath As String
	Dim os As String = DetectOS
	
	Select os
		Case "windows"
			appPath = File.DirApp&"\44"'cnf.44"
		Case "linux"
			appPath = File.DirApp&"/44/"'cnf.44"
	End Select
	
	Return appPath
End Sub


Sub pullConfig
	Dim msgList As List
	
	useDigitalFont = False
	cnf = File.ReadString(appPath, "cnf.44")
'	cnf = File.ReadString("", "cnf.44")
	parser.Initialize(cnf)
	msgList.Initialize


	Dim root As Map' = parser.NextObject
	root.Initialize
	root= parser.NextObject
	Dim fontColor As Map = root.Get("fontColor")
	Dim colorYellow As String = fontColor.Get("colorYellow")
	'Dim lightSchema As Map = root.Get("lightSchema")
	'Dim useLightSchema As String = lightSchema.Get("useLightSchema")
	Dim message As Map = root.Get("message")
	Dim line_1 As String = message.Get("line_1")
	Dim line_2 As String = message.Get("line_2")
	Dim line_5 As String = message.Get("line_5")
	Dim line_3 As String = message.Get("line_3")
	Dim line_4 As String = message.Get("line_4")
	Dim fontColor As Map = root.Get("fontColor")

	Dim sponsor As Map = root.Get("reclame")
	Dim sponsorActive As String = sponsor.Get("active")
	
	Dim gameTime As Map = root.Get("partijDuur")
	Dim gameTimeActive As String = gameTime.Get("active")

	
	
	If gameTimeActive = "1" Then
		CallSub2(scorebord, "showHideGameTime", True)
	Else
		CallSub2(scorebord, "showHideGameTime", False)
	End If

	Dim showPromote As Map = root.Get("showPromote")
	If showPromote.Get("active") = "1" Then
		timeOutActive = True
	Else
		timeOutActive = False
	End If
	timeOut = showPromote.Get("timeOut")
	
	Dim digitalFont As Map = root.Get("digitalFont")
	Dim digitalActive As String = digitalFont.Get("active")
	
		If digitalActive  = "1" Then
		useDigitalFont = True
		funcScorebord.useDigitalFont = True
		CallSub2(scorebord, "useDigitalFont", True)
	Else
		funcScorebord.useDigitalFont = False
		CallSub2(scorebord, "useDigitalFont", False)
	End If
	
	If colorYellow = "1"  Then
		CallSub2(scorebord, "useFontYellow", True)
		funcScorebord.useYellowFont = True
	Else
		funcScorebord.useYellowFont = False
		CallSub2(scorebord, "useFontYellow", False)
	End If
	
	msgList.AddAll(Array As String(line_1, line_2, line_3, line_4, line_5))
	CallSub2(scorebord, "setMessage", msgList)
	
	If sponsorActive = "1" Then
		CallSub2(scorebord, "showSponor", True)
	Else
		CallSub2(scorebord, "showSponor", False)
	End If
	
'	If showRetro.Get("active") = "1" Then
'		CallSub(retroBord, "showBord")
'		CallSub2(scorebord, "HideMainForRetro", False)
'		timeOutActive = False
'	Else
'		CallSub2(scorebord, "HideMainForRetro", True)
'		timeOutActive = True
'	End If
	
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

