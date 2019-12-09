B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private tmr As Timer
	
	Private lbl As Label
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(label As Label)
	tmr.Initialize("tmr", 1000*60)
	tmr.Enabled = True
	lbl = label
	tmr_Tick
End Sub

Private Sub tmr_Tick
	Dim time As String
	DateTime.DateFormat="EEEE, dd MMMM yyyy HH:mm"
	time = "     " & DateTime.Date(DateTime.Now) 'func.padString(DateTime.Date(DateTime.Now) &"  " & DateTime.GetHour(DateTime.Now), "0", 0, 2)&":"&func.padString(DateTime.GetMinute(DateTime.Now), "0", 0, 2)&":"&func.padString(DateTime.GetSecond(DateTime.Now), "0", 0, 2)
	lbl.Text = time
End Sub