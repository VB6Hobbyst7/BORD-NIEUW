B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private tmr As Timer
	
	Private ms As Int = DateTime.TicksPerMinute  '60*1000
	Private lblTimer As Label
	Dim hours, minutes As Int
End Sub

Public Sub Initialize(lbl As Label)
	lblTimer = lbl
	tmr.Initialize("tmr", ms)
End Sub


Sub setGameStart
	hours = 0
	minutes = 0	
End Sub

Sub tmrEnable(enabled As Boolean)
	tmr.Enabled = enabled
End Sub


Sub tmr_Tick
	minutes = minutes + 1
	If minutes > 59 Then
		minutes = 0
		hours = hours + 1
	End If
	lblTimer.Text = func.padString(hours, "0", 0 ,2)&":"&func.padString(minutes, "0", 0 ,2)	
	
	CallSub(scorebord, "WriteScoreJson")
End Sub