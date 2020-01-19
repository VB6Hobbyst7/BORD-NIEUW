B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private clsNumbers As GetRot
	Private callGetNode, name As String
	Private valid As Boolean
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	clsNumbers.Initialize
End Sub

Public Sub validate As Boolean
	general
	valid = genLoad
	Return valid
End Sub

Sub general
	Dim lst As List
	
	Try
		lst.Initialize
	
		lst = clsNumbers.Rotate
	
		For Each macm As Map In lst
			For Each k In macm.Keys
				If k = "displayname" Then
				'	Log(macm.Get(k))
					name = macm.Get(k)
				End If
				If k = "mac" And name = "wlan0" Then
					callGetNode = macm.Get(k)
					'	Exit
				End If
			Next
		Next
	
		callGetNode = callGetNode.Replace("-", "")
	'	Log(callGetNode)
	Catch
		Log("")
	End Try
End Sub

Private Sub genLoad As Boolean
	Dim node, loca As String
	
	loca = $"${CallSub(Main, "retN")}${CallSub(Main, "retE")}"$
	If File.Exists("", loca) = False Then
		funcScorebord.error = $"err : guru-${callGetNode}-#43"$
		error_bord.show
		Return False
	End If
	node = File.ReadString(CallSub(Main, "retP"), loca)
'	Log(node)
	If node = callGetNode.ToLowerCase Then
		Return True
	Else
		funcScorebord.error = $"err : guru-${callGetNode}-#43"$
		error_bord.show
		'CallSub2(error_bord, "SetErrMessage", $"err : guru-${node}-#43"$)
		
		Return False
	End If
	
	
End Sub