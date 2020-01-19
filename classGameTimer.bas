B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private tmr As Timer
	Private gameStart, playedTime As Int
	
	Private ms As Int = DateTime.TicksPerMinute  '60*1000
	'Private ms As Int = DateTime.TicksPerSecond  '60*1000
	Private lblTimer As Label
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(lbl As Label)
	lblTimer = lbl
	tmr.Initialize("tmr", ms)
	DateTime.DateFormat = "HH:mm"
End Sub


Sub setGameStart
	gameStart = DateTime.Now + 3600000
	
End Sub

Sub tmrEnable(enabled As Boolean)
	tmr.Enabled = enabled
End Sub


Sub tmr_Tick
	CallSub(scorebord, "WriteScoreJson")
	playedTime = DateTime.Now - gameStart
	
	lblTimer.Text = func.padString(DateTime.GetHour(playedTime), "0", 0 ,2)&":"&func.padString(DateTime.GetMinute(playedTime), "0", 0 ,2)'&":"&func.padString(DateTime.GetSecond(playedTime), "0", 0 ,2)
	
	
End Sub