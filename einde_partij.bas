B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
	Private frm As Form
	Private pn_einde_partij As Pane
	Private btn_annuleer_einde_partij As Button
	Private btn_einde_partij As Button
	Public frmInitialized As Boolean = False
	Private lbl_close As Label
End Sub


Sub show
	If frmInitialized = True Then 
		showForm
		Return
	End If
	
	frm.Initialize("frm", 1920, 1080)
	frm.RootPane.LoadLayout("einde_partij")
	#if debug
		frm.SetFormStyle("UTILITY")
	#Else
	frm.SetFormStyle("UNDECORATED")
	frm.Resizable = False
	#End If
	frm.BackColor  =   fx.Colors.From32Bit(0xFF001A01)
	frm.Stylesheets.Add(File.GetUri(File.DirAssets, "n205.css"))
	func.SetCustomCursor1(File.DirAssets, "mouse.png", 370, 370, frm.RootPane)
	frmInitialized = True
	'frm.Show
End Sub

Sub showForm
	frm.Show
End Sub

Sub btn_einde_partij_MouseReleased (EventData As MouseEvent)
	CallSub(scorebord, "eindePartij")
	frm.Close
End Sub

Sub btn_annuleer_einde_partij_MouseReleased (EventData As MouseEvent)
	
	frm.Close
End Sub

Sub lbl_close_MouseReleased (EventData As MouseEvent)
	ExitApplication
End Sub