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

	Private p1_100 As B4XView
	Private p1_10 As B4XView
	Private p1_1 As B4XView
	Private Inning_10 As Label
	Private Inning_1 As Label
	Private p2_100 As B4XView
	Private p2_10 As B4XView
	Private p2_1 as B4XView
	Private Label3 As Label
	Private LblReset As B4XView
	
	Private defBgColor As String = "#FF002529"
End Sub


Public Sub show
	frm.Initialize("frm", 1920, 1080)
	frm.RootPane.LoadLayout("retrobord")
	frm.SetFormStyle("UNDECORATED")
	func.SetCustomCursor1(File.DirAssets, "mouse.png", 370, 370, frm.RootPane)
	frm.Resizable = False
	useDigitalFont(True)
	
	frm.Show

End Sub

Sub useDigitalFont(useDigital As Boolean)
	Dim fsCarom, fsInnings As Int
	
	
	fsCarom = 240'350
	
	fsInnings = 240'300
	
	
	func.setFont(p1_100, fsCarom, useDigital)
	func.setFont(p1_10, fsCarom, useDigital)
	func.setFont(p1_1, fsCarom, useDigital)
	func.setFont(p2_1, fsCarom, useDigital)
	func.setFont(p2_10, fsCarom, useDigital)
	func.setFont(p2_100, fsCarom, useDigital)
	func.setFont(Inning_10, fsInnings, useDigital)
	func.setFont(Inning_1, fsInnings, useDigital)
	
	
End Sub

Sub Label3_MouseReleased (EventData As MouseEvent)
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
	
End Sub

Sub Inning_1_MouseExited (EventData As MouseEvent)
	
End Sub

Sub Inning_1_MouseReleased (EventData As MouseEvent)
	SetInning(EventData.PrimaryButtonPressed)
End Sub

Sub Inning_10_MouseReleased (EventData As MouseEvent)
	SetInning(EventData.PrimaryButtonPressed)
End Sub

Sub Inning_10_MouseEntered (EventData As MouseEvent)
	
End Sub

Sub Inning_10_MouseExited (EventData As MouseEvent)
	
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
	
End Sub

Sub p2_100_MouseEntered (EventData As MouseEvent)
	
End Sub

Sub p2_100_MouseExited (EventData As MouseEvent)
	
End Sub

Sub p2_10_MouseReleased (EventData As MouseEvent)
	
End Sub

Sub p2_10_MouseEntered (EventData As MouseEvent)
	
End Sub

Sub p2_10_MouseExited (EventData As MouseEvent)
	
End Sub

Sub p2_1_MouseReleased (EventData As MouseEvent)
	
End Sub

Sub p2_1_MouseEntered (EventData As MouseEvent)
	
End Sub

Sub p2_1_MouseExited (EventData As MouseEvent)
	
End Sub

Sub p1_100_MouseReleased (EventData As MouseEvent)
	
End Sub

Sub p1_100_MouseEntered (EventData As MouseEvent)
	
End Sub

Sub p1_10_MouseReleased (EventData As MouseEvent)
	
End Sub

Sub p1_10_MouseEntered (EventData As MouseEvent)
	
End Sub

Sub p1_10_MouseExited (EventData As MouseEvent)
	
End Sub

Sub p1_1_MouseReleased (EventData As MouseEvent)
	
End Sub

Sub p1_1_MouseEntered (EventData As MouseEvent)
	
End Sub

Sub p1_1_MouseExited (EventData As MouseEvent)
	
End Sub