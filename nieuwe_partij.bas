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
	
	Private chk_add_player As CheckBox
	Private btn_nieuwe_partij As Button
	Private btn_annuleer_nieuwe_partij As Button
	Private lbl_header As Label
	Private lbl_text_1 As Label
	Private lbl_text_2 As Label
	Private txt_speler_1 As TextField
	Private txt_speler_2 As TextField
	Private txt_maken_1 As TextField
	Private txt_maken_2 As TextField
	Private btn_p1_begint As Button
	Private btn_p2_begint As Button
	Private lbl_speler_data As Label
	
	Private tmr As Timer
	Private lst As List
	
End Sub


Sub show
	tmr.Initialize("tmr", 60*1000)
	tmr.Enabled = True
	frm.Initialize("frm", 1920, 1080)
	frm.RootPane.LoadLayout("nieuwe_partij")
	MouseOver(frm.RootPane)
	frm.BackColor  =   fx.Colors.From32Bit(0xFF001A01)
	frm.Stylesheets.Add(File.GetUri(File.DirAssets, "n205.css"))
	func.SetCustomCursor1(File.DirAssets, "mouse.png", 370, 370, frm.RootPane)

	#if debug
		frm.SetFormStyle("UTILITY")
	#Else
		frm.SetFormStyle("UNDECORATED")
		frm.Resizable = False
	#End If
	
	lst.Initialize
	setPlayerName
	frm.Show
	funcScorebord.newGameInitialized = True
		
End Sub

Sub setPlayerName
	If txt_speler_1.Text = "" Then
		txt_speler_1.Text = "Speler 1"
	End If
	If txt_speler_2.Text = "" Then
		txt_speler_2.Text = "Speler 2"
	End If
End Sub

Sub chk_add_player_CheckedChange(Checked As Boolean)
	Dim op As Int = 0
	Dim opM As Int
	
	If Checked Then
		op = 1
		opM = 0
		Else
		opM = 1
			
	End If
	
	txt_speler_1.SetAlphaAnimated(0,op)
	txt_speler_2.SetAlphaAnimated(0,op)
	txt_maken_1.SetAlphaAnimated(0,op)
	txt_maken_2.SetAlphaAnimated(0,op)
	btn_nieuwe_partij.SetAlphaAnimated(0, opM)
	btn_nieuwe_partij.Enabled = Checked <> True
	btn_p1_begint.SetAlphaAnimated(0,op)
	btn_p2_begint.SetAlphaAnimated(0,op)
	txt_speler_1.RequestFocus
End Sub


Sub btn_nieuwe_partij_MouseReleased (EventData As MouseEvent)
	CallSub(scorebord, "resetBoard")
	CallSub2(scorebord, "setNewGame", True)
	frm.Close
End Sub

Sub btn_annuleer_nieuwe_partij_MouseReleased (EventData As MouseEvent)
	frm.Close
	'CallSub2(scorebord, "hideForm", True)
End Sub

Sub txt_maken_1_TextChanged (Old As String, New As String)
	If New.Length > 3 Then 
		txt_maken_1.Text = Old
	New = Old
	End If
	txt_maken_1.Text =  func.testNumber(Old, New)
	txt_maken_1.SetSelection(txt_maken_1.Text.Length, txt_maken_1.Text.Length)
End Sub

Sub txt_maken_2_TextChanged (Old As String, New As String)
	If New.Length > 3 Then 
		txt_maken_2.Text = Old
		New = Old
	End If
	txt_maken_2.Text =  func.testNumber(Old, New)
	txt_maken_2.SetSelection(txt_maken_2.Text.Length, txt_maken_2.Text.Length)
End Sub


Sub btn_p1_begint_MouseReleased (EventData As MouseEvent)
	If chkSpelerData = False Then
		lbl_speler_data.SetAlphaAnimated(200, 1)
		Sleep(1000)
		lbl_speler_data.SetAlphaAnimated(200, 0)
		Return
	End If
	lst.Initialize
	lst.AddAll(Array As String(txt_speler_1.Text, txt_maken_1.Text))
	lst.AddAll(Array As String(txt_speler_2.Text, txt_maken_2.Text))
	CallSub2(scorebord, "setNewGame", True)
	CallSub2(scorebord, "setSpelerData", lst)
	tmr.Enabled = False
	frm.close
	'frm.RootPane.Visible = False
	CallSub2(scorebord, "hideForm", True)
End Sub

Sub btn_p2_begint_MouseReleased (EventData As MouseEvent)
	If chkSpelerData = False Then
		lbl_speler_data.SetAlphaAnimated(200, 1)
		Sleep(1000)
		lbl_speler_data.SetAlphaAnimated(200, 0)
		Return
	End If
	lst.Initialize
	lst.AddAll(Array As String(txt_speler_2.Text, txt_maken_2.Text))
	lst.AddAll(Array As String(txt_speler_1.Text, txt_maken_1.Text))
	CallSub2(scorebord, "setNewGame", True)
	CallSub2(scorebord, "setSpelerData", lst)
	tmr.Enabled = False
	frm.Close
	'frm.RootPane.Visible = False
	CallSub2(scorebord, "hideForm", True)
End Sub

Sub chkSpelerData As Boolean
	Dim teMaken1, teMaken2 As Int
	
	teMaken1 = txt_maken_1.Text
	teMaken2 = txt_maken_2.Text
	
	If teMaken1 < 1 Or teMaken2 < 1 Then Return False
	
	If txt_speler_1.text = "" Or txt_speler_2.text = "" Or txt_maken_1.Text = "" Or txt_maken_2.text = "" Then
		Return False
	End If
	Return True
End Sub

Sub showForm
	tmr.Enabled = True	
	setPlayerName
	frm.Show
End Sub


Sub tmr_Tick
	frm.Close
	
End Sub

Sub mouseIn_Event(m As String,args() As Object)
	tmr.Enabled = False
	tmr.Enabled = True
	
End Sub

private Sub MouseOver(n1 As Node)
	
	setHandler(n1,"setOnMouseMoved","mouseIn")
	setHandler(n1,"setOnMouseExited","mouseOut")
End Sub

private Sub setHandler(ob As JavaObject,eventName As String,handlerName As String)
	ob.RunMethod(eventName, Array(ob.CreateEventFromUI("javafx.event.EventHandler",handlerName,True)))
End Sub
