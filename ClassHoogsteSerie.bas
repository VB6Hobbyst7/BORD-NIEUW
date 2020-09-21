B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
'--------------------------
'KEEPS TRACK OF POINTS MADE DURING INNING
'--------------------------

Sub Class_Globals
	Private runningHS, playingHs As Int
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	runningHS = 0
	playingHs = 0
End Sub

Sub AddPoint(points As Int, leftMouse As Boolean)
	If leftMouse = False Then
		points = -Abs(points)
	End If
	playingHs = playingHs + points
	If playingHs < 0 Then playingHs = 0
End Sub

Sub ResetPlayingHS
	If playingHs > runningHS Then
		runningHS = playingHs
	End If
	playingHs = 0
	Log($"Serie Running : ${runningHS}"$)
End Sub