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

	Private p1_100 As Label
	Private p1_10 As Label
	Private p1_1 As Label
	Private Inning_10 As Label
	Private Inning_1 As Label
	Private p2_100 As B4XView
	Private p2_10 As B4XView
	Private p2_1 As B4XView
	Private LblReset As B4XView
	
	Private lblCopyright As Label
End Sub


Public Sub show
	frm.Initialize("frm", 1920, 1080)
	frm.RootPane.LoadLayout("retrobord")
	frm.SetFormStyle("UNDECORATED")
	func.SetCustomCursor1(File.DirAssets, "mouse.png", 370, 370, frm.RootPane)
	frm.Resizable = False
	useDigitalFont(True)
	frm.Stylesheets.Add(File.GetUri(File.DirAssets, "n205.css"))
	lblCopyright.Text = $"BeeCee Electronics"$
	setFontStyle
	frm.Show

End Sub

Sub setFontStyle
	func.caromLabelCss(p1_1, "LabelLed")
End Sub


Sub useDigitalFont(useDigital As Boolean)
	Dim fsCarom, fsInnings As Int
	
	fsCarom = 300'350
	fsInnings = 300'300
	
	func.setFontRetro(p1_100, fsCarom, useDigital)
	func.setFontRetro(p1_10, fsCarom, useDigital)
	func.setFontRetro(p1_1, fsCarom, useDigital)
	func.setFontRetro(p2_1, fsCarom, useDigital)
	func.setFontRetro(p2_10, fsCarom, useDigital)
	func.setFontRetro(p2_100, fsCarom, useDigital)
	func.setFontRetro(Inning_10, fsInnings, useDigital)
	func.setFontRetro(Inning_1, fsInnings, useDigital)
End Sub

Sub lblCopyright_MouseReleased (EventData As MouseEvent)
	ExitApplication
End Sub

Sub LblReset_MouseReleased (EventData As MouseEvent)
	ResetPartij
End Sub

Sub LblReset_MouseEntered (EventData As MouseEvent)
	LblReset.Color = 0xFFFF0000
End Sub

Sub LblReset_MouseExited (EventData As MouseEvent)
	LblReset.Color = 0xFF002529
End Sub


Private Sub LedOnEnter(lbl As B4XView)
	lbl.Color = 0xFF000000' 0xFF8F0C02
	lbl.TextColor = 0xFFe50811
End Sub

Private Sub LedOnLeave(lbl As B4XView)
	lbl.Color = 0xFF4B0303
	lbl.TextColor = 0xFFFF0000
End Sub

Sub ResetPartij
	p1_1.Text = 0
	p1_10.Text = 0
	p1_100.Text = 0
	p2_1.Text = 0
	p2_10.Text = 0
	p2_100.Text = 0
	Inning_1.Text = 0
	Inning_10.Text = 0
	
End Sub

Sub Inning_1_MouseEntered (EventData As MouseEvent)
	Dim lbl As Label = Sender
	LedOnEnter(lbl)
End Sub

Sub Inning_1_MouseExited (EventData As MouseEvent)
	Dim lbl As Label = Sender
	LedOnLeave(lbl)
End Sub

Sub Inning_1_MouseReleased (EventData As MouseEvent)
	SetInning(EventData.PrimaryButtonPressed)
End Sub

Sub Inning_10_MouseReleased (EventData As MouseEvent)
	SetInning(EventData.PrimaryButtonPressed)
End Sub

Sub Inning_10_MouseEntered (EventData As MouseEvent)
	Dim lbl As Label = Sender
	LedOnEnter(lbl)
End Sub

Sub Inning_10_MouseExited (EventData As MouseEvent)
	Dim lbl As Label = Sender
	LedOnLeave(lbl)
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
		p1_100.Text = "0"
		p1_10.Text = "0"
		p1_1.Text = "0"
		Return
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
		p2_100.Text = "0"
		p2_10.Text = "0"
		p2_1.Text = "0"
		Return
	End If
	
	strCarom = func.padString(carom, "0", 0, 3)
	p2_100.Text = strCarom.SubString2(0,1)
	p2_10.Text = strCarom.SubString2(1,2)
	p2_1.Text = strCarom.SubString2(2,3)
	
End Sub


Private Sub SetInning(leftMouse As Boolean)
	Dim inning As Int = Inning_10.Text & Inning_1.Text
	Dim strInning As String
	
	If leftMouse Then
		If inning + 1 > 99 Then
			Inning_10.Text = "0"
			Inning_1.Text = "0"
			Return
		End If
	inning = inning + 1
	End If
	
	If leftMouse = False Then
		If inning - 1 <= 0 Then
			Inning_10.Text = "0"
			Inning_1.Text = "0"
			Return
		End If
		inning = inning - 1
	End If
	
	strInning = func.padString(inning, 0, 0,2)
	Inning_10.Text = strInning.SubString2(0,1)
	Inning_1.Text = strInning.SubString2(1,2)
	
End Sub

Sub p2_100_MouseReleased (EventData As MouseEvent)
	P2CalcCarom(EventData.PrimaryButtonPressed, Sender)
End Sub

Sub p2_100_MouseEntered (EventData As MouseEvent)
	Dim lbl As Label = Sender
	LedOnEnter(lbl)
End Sub

Sub p2_100_MouseExited (EventData As MouseEvent)
	Dim lbl As Label = Sender
	LedOnLeave(lbl)
End Sub

Sub p2_10_MouseReleased (EventData As MouseEvent)
	P2CalcCarom(EventData.PrimaryButtonPressed, Sender)
End Sub

Sub p2_10_MouseEntered (EventData As MouseEvent)
	Dim lbl As Label = Sender
	LedOnEnter(lbl)
End Sub

Sub p2_10_MouseExited (EventData As MouseEvent)
	Dim lbl As Label = Sender
	LedOnLeave(lbl)
End Sub

Sub p2_1_MouseReleased (EventData As MouseEvent)
	P2CalcCarom(EventData.PrimaryButtonPressed, Sender)
End Sub

Sub p2_1_MouseEntered (EventData As MouseEvent)
	Dim lbl As Label = Sender
	LedOnEnter(lbl)
End Sub

Sub p2_1_MouseExited (EventData As MouseEvent)
	Dim lbl As Label = Sender
	LedOnLeave(lbl)
End Sub

Sub p1_100_MouseReleased (EventData As MouseEvent)
	P1CalcCarom(EventData.PrimaryButtonPressed, Sender)
End Sub

Sub p1_100_MouseEntered (EventData As MouseEvent)
	Dim lbl As Label = Sender
	LedOnEnter(lbl)
End Sub

Sub p1_10_MouseReleased (EventData As MouseEvent)
	P1CalcCarom(EventData.PrimaryButtonPressed, Sender)
	
End Sub

Sub p1_10_MouseEntered (EventData As MouseEvent)
	Dim lbl As Label = Sender
	LedOnEnter(lbl)
End Sub

Sub p1_10_MouseExited (EventData As MouseEvent)
	Dim lbl As Label = Sender
	LedOnLeave(lbl)
End Sub

Sub p1_1_MouseReleased (EventData As MouseEvent)
	P1CalcCarom(EventData.PrimaryButtonPressed, Sender)
End Sub

Sub p1_1_MouseEntered (EventData As MouseEvent)
'	Dim lbl As Label = Sender
'	LedOnEnter(lbl)
End Sub

Sub p1_1_MouseExited (EventData As MouseEvent)
'	Dim lbl As Label = Sender
'	LedOnLeave(lbl)
End Sub

Sub p1_100_MouseExited (EventData As MouseEvent)
	Dim lbl As Label = Sender
	LedOnLeave(lbl)
End Sub