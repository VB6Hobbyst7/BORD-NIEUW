B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
	Public frm As Form
	
	Private p1_100, p1_10, p1_1 As Label
	Private p1_1_8,  p1_10_8,  p1_100_8 As Label
	Private p2_100, p2_10, p2_1 As Label
	Private p2_1_8,  p2_10_8,  p2_100_8 As Label
	Private Inning_10, Inning_1 As Label
	Private Inning_1_8, Inning_10_8 As Label
	Private LblReset As B4XView
	Private lblCopyright As Label
	Public caromP1R As String, caromP2R As String, inningR As String
End Sub


Public Sub show
	frm.Initialize("frm", 1920, 1080)
	frm.RootPane.LoadLayout("retrobord")
	frm.SetFormStyle("UNDECORATED")
	func.SetCustomCursor1(File.DirAssets, "mouse.png", 370, 370, frm.RootPane)
	frm.Resizable = False
	useDigitalFont(True)
	frm.Stylesheets.Add(File.GetUri(File.DirAssets, "n205.css"))
	lblCopyright.Text = $"©2004 BC Heerhugowaard Electronics"$
	setFontStyle
	'frm.Show

End Sub


Public Sub showBord
	func.SetCustomCursor1(File.DirAssets, "mouse.png", 370, 370, frm.RootPane)
	frm.Show
End Sub

Public Sub hideRetro
	frm.RootPane.Visible = False
End Sub

Sub setFontStyle
	func.caromLabelCss(p1_1, "LabelLed")
	func.caromLabelCss(p1_10, "LabelLed")
	func.caromLabelCss(p1_100, "LabelLed")
	func.caromLabelCss(p2_100, "LabelLed")
	func.caromLabelCss(p2_10, "LabelLed")
	func.caromLabelCss(p2_1, "LabelLed")
	func.caromLabelCss(Inning_1, "LabelLed")
	func.caromLabelCss(Inning_10, "LabelLed")
	
End Sub


Sub useDigitalFont(useDigital As Boolean)
	Dim fsCarom, fsInnings As Int
	
	fsCarom = 300'350
	fsInnings = 300'300
	
	func.setFontRetro(p1_100, fsCarom, useDigital)
	func.setFontRetro(p1_10, fsCarom, useDigital)
	func.setFontRetro(p1_1, fsCarom, useDigital)
	func.setFontRetro(p1_1_8, fsCarom, useDigital)
	func.setFontRetro(p1_10_8, fsCarom, useDigital)
	func.setFontRetro(p1_100_8, fsCarom, useDigital)
	func.setFontRetro(p2_1_8, fsCarom, useDigital)
	func.setFontRetro(p2_10_8, fsCarom, useDigital)
	func.setFontRetro(p2_100_8, fsCarom, useDigital)
	func.setFontRetro(p2_1, fsCarom, useDigital)
	func.setFontRetro(p2_10, fsCarom, useDigital)
	func.setFontRetro(p2_100, fsCarom, useDigital)
	func.setFontRetro(Inning_10, fsInnings, useDigital)
	func.setFontRetro(Inning_1, fsInnings, useDigital)
	func.setFontRetro(Inning_1_8, fsInnings, useDigital)
	func.setFontRetro(Inning_10_8, fsInnings, useDigital)
End Sub

Sub lblCopyright_MouseReleased (EventData As MouseEvent)
	'ExitApplication
End Sub

Sub LblReset_MouseReleased (EventData As MouseEvent)
	ResetPartij
End Sub

Sub LblReset_MouseEntered (EventData As MouseEvent)
	LblReset.Color = 0xFFFF0000
End Sub

Sub LblReset_MouseExited (EventData As MouseEvent)
	LblReset.Color = 0xFF001317 '0xFF002529
End Sub


Sub ResetPartij
	Dim st As Int = 200

	p1_1.Text = 8
	p1_10.Text = 8
	p1_100.Text = 8
	p2_1.Text = 8
	p2_10.Text = 8
	p2_100.Text = 8
	Inning_1.Text = 8
	Inning_10.Text = 8
	Sleep(10)
	
	Sleep(300)
	
	AnimatedReset(p1_100,st)
	Sleep(st)
	AnimatedReset(p1_10, st)
	Sleep(st)
	AnimatedReset(p1_1, st)
	Sleep(st)
	
	AnimatedReset(p2_100, st)
	Sleep(st)
	AnimatedReset(p2_10, st)
	Sleep(st)
	AnimatedReset(p2_1, st)
	Sleep(st)
	
	Sleep(st)
	AnimatedReset(Inning_10, st)
	Sleep(st)
	AnimatedReset(Inning_1,st)
	Sleep(st)
End Sub

Sub AnimatedReset(lbl As Label, st As Int)
	lbl.TextColor = fx.Colors.From32Bit(0xFFFFFFFF)
	lbl.Text = 0
	Sleep(st+10)
	lbl.TextColor = fx.Colors.From32Bit(0xFFFF0000)
	End Sub

Private Sub P1CalcCarom(leftMouse As Boolean, lbl As Label)
	Dim carom As Int = p1_100.Text&p1_10.Text&p1_1.Text
	Dim value As Int = lbl.Tag
	Dim strCarom As String
	
	If leftMouse == False Then
		value = -Abs(value)
	End If
	
	carom = carom + value
	
	If carom > 999 Or carom <= 0 Then
		carom = 0
	End If
	
	strCarom = func.padString(carom, "0", 0, 3)
	p1_100.Text = strCarom.SubString2(0,1)
	p1_10.Text = strCarom.SubString2(1,2)
	p1_1.Text = strCarom.SubString2(2,3)
	
End Sub

Private Sub P2CalcCarom(leftMouse As Boolean, lbl As Label)
	Dim carom As Int = p2_100.Text&p2_10.Text&p2_1.Text
	Dim value As Int = lbl.Tag
	Dim strCarom As String
	
	If leftMouse == False Then
		value = -Abs(value)
	End If
	
	carom = carom + value
	
	If carom > 999 Or carom <= 0 Then
		carom = 0
	End If
	
	strCarom = func.padString(carom, "0", 0, 3)
	p2_100.Text = strCarom.SubString2(0,1)
	p2_10.Text = strCarom.SubString2(1,2)
	p2_1.Text = strCarom.SubString2(2,3)
	
End Sub

Private Sub SetInning(leftMouse As Boolean)
	Dim inning As Int = Inning_10.Text & Inning_1.Text
	Dim strInning As String
	Dim value As Int = 1
	Dim newInning As Int
	
	If leftMouse = False Then
		value = -Abs(value)
	End If
	
	newInning = inning + value
	
	If newInning > 99 Or newInning < 0 Then
		newInning = 0
	End If
	
	strInning = func.padString(newInning, 0, 0,2)
	Inning_10.Text = strInning.SubString2(0,1)
	Inning_1.Text = strInning.SubString2(1,2)
	
End Sub

Sub p2_1_MouseReleased (EventData As MouseEvent)
	P2CalcCarom(EventData.PrimaryButtonPressed, Sender)
End Sub

Sub p2_10_MouseReleased (EventData As MouseEvent)
	P2CalcCarom(EventData.PrimaryButtonPressed, Sender)
	End Sub

Sub p2_100_MouseReleased (EventData As MouseEvent)
	P2CalcCarom(EventData.PrimaryButtonPressed, Sender)
End Sub

Sub p1_100_MouseReleased (EventData As MouseEvent)
	P1CalcCarom(EventData.PrimaryButtonPressed, Sender)
End Sub

Sub p1_10_MouseReleased (EventData As MouseEvent)
	P1CalcCarom(EventData.PrimaryButtonPressed, Sender)
	
End Sub

Sub p1_1_MouseReleased (EventData As MouseEvent)
	P1CalcCarom(EventData.PrimaryButtonPressed, Sender)
End Sub

Sub Inning_1_MouseReleased (EventData As MouseEvent)
	SetInning(EventData.PrimaryButtonPressed)
End Sub

Sub Inning_10_MouseReleased (EventData As MouseEvent)
	SetInning(EventData.PrimaryButtonPressed)
End Sub



'Return true to allow the default exceptions handler to handle the uncaught exception.
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	LogError(Error)
	LogError(StackTrace)
	File.WriteString(File.DirApp, "errStackTrace.txt", StackTrace)
	File.WriteString(File.DirApp, "errError.txt", Error)
	Return True
End Sub


Sub lblCopyright_MousePressed (EventData As MouseEvent)
	Log(EventData.ClickCount)
	If EventData.ClickCount >= 3 Then
		ExitApplication
	End If
End Sub

Public Sub SetMirrorScore()
	Log($"RETRO SET MIRROR SCORE"$)
	p1_100.Text = caromP1R.SubString2(0,1)
	p1_10.Text = caromP1R.SubString2(1,2)
	p1_1.Text = caromP1R.SubString2(2,3)
	
	p2_100.Text = caromP2R.SubString2(0,1)
	p2_10.Text = caromP2R.SubString2(1,2)
	p2_1.Text = caromP2R.SubString2(2,3)
	
	Inning_10.Text = inningR.SubString2(1,2)
	Inning_1.Text = inningR.SubString2(2,3)
End Sub

