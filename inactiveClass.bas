B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Public tmr, tmr_draw_promote As Timer
'	Private minute As Long = 60000
	Public timeOutPeriode As Int' = 5000 ' 10*minute
	Public lastClick As Long
	Private timeDiff As Long
	Public frm As Form
	Public pn_promote As Pane
	Private currentX = 10, currentY = 10 As Double
	Public vx = 200, vy = 100 As Double
	Public pnlWidth, pnlHeight As Double
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(promoteWidth As Double, promoteHeight As Double)
	pnlWidth = promoteWidth
	pnlHeight = promoteHeight
	
	timeOutPeriode = (parseConfig.timeOut*(60*1000))
	tmr.Initialize("timeOut", timeOutPeriode)
	tmr.Enabled = parseConfig.timeOutActive
	tmr_draw_promote.Initialize("drawPromote", 5000)
	
	
End Sub


Sub timeOut_Tick()
	timeDiff = DateTime.Now - lastClick
	If timeDiff > timeOutPeriode Then
		enableTime(False)
		CallSubDelayed(scorebord, "showPromote")
'		Log($"TIMEOUT DETECTED"$)
		vx = 50
		vy = 50
		enablePromote(True)
		CallSub2(scorebord, "setPromoteRunning", True)
	End If
	


End Sub

Public Sub enableTime(enable As Boolean)
	tmr.Enabled = enable
End Sub

Sub enablePromote(enable As Boolean)
	tmr_draw_promote.Enabled = enable
	
End Sub


Sub drawPromote_Tick()
	getBounds
End Sub

Sub getBounds
	
	If (currentX+50) + pnlWidth+30 > frm.Width Then
		vx = -Abs(vx)
	Else If currentX < 0 Then
		vx = Abs(vx)
	End If
	
	If (currentY+70) + pnlHeight > frm.Height Then
		vy = -Abs(vy)
	Else If currentY < 0 Then
		vy = Abs(vy)
	End If
	
	currentX = currentX + vx
	currentY = currentY + vy
	
	CallSubDelayed3(scorebord, "drawPromote", currentX, currentY)
End Sub


Sub updatePromote
	timeOutPeriode = (parseConfig.timeOut*(60*1000))
	
	tmr.Enabled = False
	tmr.Interval = timeOutPeriode
	tmr.Enabled = True
	If parseConfig.useDigitalFont Then
'		Log($"useDigitalFont ${parseConfig.useDigitalFont}"$)
		CallSub2(scorebord, "useDigitalFont", parseConfig.useDigitalFont)	
	End If
End Sub