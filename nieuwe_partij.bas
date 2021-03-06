B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8
@EndOfDesignText@
#IgnoreWarnings: 16,9,12,1, 10

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
'	Private lbl_speler_data As Label
	
	Private tmr As Timer
	Private lst As List
	Private lstSpelSoort As List
	Private cmbSpelSoort As B4XComboBox
	Private lbl_max_tekens As Label
	
	
	Private chkAuto_innings As CheckBox
	Private lbl_speler_invoer As Label
	Private lbl_auto_innings As Label
	
	Private chk_beurten_partij As CheckBox
	Private lbl_beurten_1 As Label
	Private lbl_beurten_10 As Label
	Private lbl_beurten_100 As Label
	Private lbl_beurten_partij As Label
	Private lbl_header_left As Label
	Private lbl_warning_beurten As Label
	Private lbl_close As Label
	
	Public verDbExists As Boolean = False
	
End Sub


Sub show
	tmr.Initialize("tmr", 60*1000)
'	tmr.Enabled = True
	frm.Initialize("frm", 1920, 1080)
	frm.RootPane.LoadLayout("nieuwe_partij")
'	MouseOver(frm.RootPane)
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
	lstSpelSoort.Initialize
	lstSpelSoort.AddAll(Array As String("", "Libre", "Bandstoten", "DrieBanden", "Kader 38/2", "Kader 57/2", "Anker-Kader 57/2"))
	cmbSpelSoort.SetItems(lstSpelSoort)
	chkAuto_innings.Checked = True
	func.caromLabelCss(lbl_speler_invoer, "labelCarom")
	func.caromLabelCss(lbl_beurten_1, "labelCarom")
	func.caromLabelCss(lbl_beurten_10, "labelCarom")
	func.caromLabelCss(lbl_beurten_100, "labelCarom")
	func.caromLabelCss(lbl_auto_innings, "labelCarom")
	func.caromLabelCss(lbl_beurten_partij, "labelCarom")
	
	chk_beurten_partij.Visible = False
	lbl_beurten_partij.Visible = False

'	CheckIfClubMembersExist
	enablePlayerInput
	setPlayerName
	useDigitalFont
	useFontYellow
'	setPlayerName
'	frm.Show
	funcScorebord.newGameInitialized = True
		
End Sub


Private Sub CheckIfClubMembersExist
	chk_beurten_partij.Visible = False
	lbl_beurten_partij.Visible = False
	Dim lst As List
	lst.Initialize
	
	lst = File.ListFiles($"${func.appPath}vereniging_spelers"$)
	lst.Sort(True)
	If lst.Size > 0 Then
		verDbExists = True
	Else
		verDbExists = False
	End If
	chk_beurten_partij.Visible = verDbExists
	lbl_beurten_partij.Visible = verDbExists
End Sub


Sub enablePlayerInput
	txt_speler_1.Enabled = chk_add_player.Checked
	txt_speler_2.Enabled = chk_add_player.Checked
	txt_maken_1.Enabled	= chk_add_player.Checked
	txt_maken_2.Enabled	= chk_add_player.Checked
	btn_p1_begint.Enabled = chk_add_player.Checked
	btn_p2_begint.Enabled = chk_add_player.Checked
	
End Sub

Sub dummyShow
	frm.Show
'	Sleep(1000)
	frm.Close
End Sub

Sub setPlayerName
	If txt_speler_1.Text = "" Then
	#If debug
		txt_speler_1.Text = "SJAAK VAN DUIVENVOORDE"
	#Else
		txt_speler_1.Text = "SPELER"&CRLF&" 1" '"Speler 1"
	#End if
	End If
	If txt_speler_2.Text = "" Then
		txt_speler_2.Text = "SPELER"&CRLF&" 2" '"Speler 2"
	End If
End Sub

Sub chk_add_player_CheckedChange(Checked As Boolean)
	enablePlayerInput
	Dim op As Int = 0
	Dim opM, speed As Int
	
	If Checked Then
		op = 1
		opM = 0
		Else
		opM = 1
			
	End If
	
	speed = 100
	
	txt_speler_1.SetAlphaAnimated(speed,op)
	txt_speler_2.SetAlphaAnimated(speed,op)
	txt_maken_1.SetAlphaAnimated(speed,op)
	txt_maken_2.SetAlphaAnimated(speed,op)
	btn_nieuwe_partij.SetAlphaAnimated(speed, opM)
	btn_nieuwe_partij.Enabled = Checked <> True
	btn_p1_begint.SetAlphaAnimated(speed,op)
	btn_p2_begint.SetAlphaAnimated(speed,op)
	lbl_max_tekens.SetAlphaAnimated(speed,op)
	'txt_speler_1.RequestFocus
End Sub


Sub btn_nieuwe_partij_MouseReleased (EventData As MouseEvent)
	funcScorebord.autoInnings = chkAuto_innings.Checked
	CallSub(scorebord, "resetBoard")
	CallSub2(scorebord, "setSpelSoort", cmbSpelSoort.GetItem(cmbSpelSoort.SelectedIndex))
	CallSub2(scorebord, "setNewGame", True)
	frm.Close
	'CallSub(scorebord, "FormVisible")
End Sub

Sub CloseForm
	frm.Close
End Sub

Sub btn_annuleer_nieuwe_partij_MouseReleased (EventData As MouseEvent)
	frm.Close
'	CallSub(scorebord, "FormVisible")
'	scorebord.ShowScoreBord
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
	'	lbl_speler_data.SetAlphaAnimated(600, 1)
		Sleep(1000)
	'	lbl_speler_data.SetAlphaAnimated(600, 0)
		Return
	End If
	
	Dim lstTest As List
	lstTest.Initialize
	lstTest = Regex.Split(" ", txt_speler_1.Text)
	
	Dim naam1 As String = func.splitNaam(txt_speler_1.Text)
	funcScorebord.autoInnings = chkAuto_innings.Checked
	
	chk_add_player.Checked = False
	
	lst.Initialize
'	lst.AddAll(Array As String(txt_speler_1.Text, txt_maken_1.Text))
	lst.AddAll(Array As String(func.splitNaam(txt_speler_1.Text), txt_maken_1.Text))
'	lst.AddAll(Array As String(txt_speler_2.Text, txt_maken_2.Text))
	lst.AddAll(Array As String(func.splitNaam(txt_speler_2.Text), txt_maken_2.Text))
	lst.AddAll(Array As String(cmbSpelSoort.GetItem(cmbSpelSoort.SelectedIndex)))
	CallSub2(scorebord, "setNewGame", True)
	CallSub2(scorebord, "setSpelerData", lst)
	tmr.Enabled = False
	frm.close
	'frm.RootPane.Visible = False
	CallSub(scorebord, "hideForm")
End Sub

Sub btn_p2_begint_MouseReleased (EventData As MouseEvent)
	If chkSpelerData = False Then
	'	lbl_speler_data.SetAlphaAnimated(200, 1)
		Sleep(1000)
	'	lbl_speler_data.SetAlphaAnimated(200, 0)
		Return
	End If
	funcScorebord.autoInnings = chkAuto_innings.Checked
	chk_add_player.Checked = False
	
	lst.Initialize
'	lst.AddAll(Array As String(txt_speler_2.Text, txt_maken_2.Text))
	lst.AddAll(Array As String(func.splitNaam(txt_speler_2.Text), txt_maken_2.Text))
'	lst.AddAll(Array As String(txt_speler_1.Text, txt_maken_1.Text))
	lst.AddAll(Array As String(func.splitNaam(txt_speler_1.Text), txt_maken_1.Text))
	lst.AddAll(Array As String(cmbSpelSoort.GetItem(cmbSpelSoort.SelectedIndex)))
	CallSub2(scorebord, "setNewGame", True)
	CallSub2(scorebord, "setSpelerData", lst)
	tmr.Enabled = False
	frm.Close
	'frm.RootPane.Visible = False
	CallSub(scorebord, "hideForm")
End Sub

Sub chkSpelerData As Boolean
	Dim teMaken1, teMaken2 As Int
	
	If txt_maken_1.Text = "" Or txt_maken_2.Text = "" Then
		txt_maken_1.Text = "0"
		txt_maken_2.Text = "0"
		
	End If
	
	teMaken1 = txt_maken_1.Text
	teMaken2 = txt_maken_2.Text
	
'	If teMaken1 < 1 Or teMaken2 < 1 Then Return False
	
	If txt_speler_1.text = "" Or txt_speler_2.text = "" Or txt_maken_1.Text = "" Or txt_maken_2.text = "" Then
		Return False
	End If
	Return True
End Sub

Sub showForm
	'tmr.Enabled = True	
'	enablePlayerInput
'	setPlayerName
'	useDigitalFont
'	useFontYellow
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


Sub txt_speler_1_TextChanged (Old As String, New As String)
	txtChanged(txt_speler_1, Old.ToUpperCase, New.ToUpperCase)
End Sub

Sub txt_speler_2_TextChanged (Old As String, New As String)
	txtChanged(txt_speler_2, Old.ToUpperCase, New.ToUpperCase)
End Sub

Sub txtChanged(v As TextField, Old As String, New As String)
	If New.Length > 22 Then
		lbl_max_tekens.TextColor = fx.Colors.From32Bit(0xFFFF0000)
	Else
		lbl_max_tekens.TextColor = fx.Colors.From32Bit(0xFF000000)
	End If
	
End Sub



Sub chk_beurten_partij_CheckedChange(Checked As Boolean)
	If chk_beurten_partij.Checked Then
		UncheckVereniging
		selecteer_club.ShowForm
	End If
End Sub

Sub UncheckVereniging
	chk_beurten_partij.Checked = False
End Sub

Sub useDigitalFont
	Dim fsCarom, fsMake, fsInnings As Int
	
	If funcScorebord.useDigitalFont Then
		fsInnings = 200'300
	Else
		fsInnings = 200
	End If
	
	func.setFont(lbl_beurten_1, fsInnings, funcScorebord.useDigitalFont)
	func.setFont(lbl_beurten_10, fsInnings, funcScorebord.useDigitalFont)
	func.setFont(lbl_beurten_100, fsInnings, funcScorebord.useDigitalFont)
End Sub

Sub useFontYellow
	func.setFontColor(lbl_beurten_1, funcScorebord.useYellowFont)
	func.setFontColor(lbl_beurten_10, funcScorebord.useYellowFont)
	func.setFontColor(lbl_beurten_100, funcScorebord.useYellowFont)
	func.setFontColor(lbl_speler_invoer, funcScorebord.useYellowFont)
	func.setFontColor(lbl_auto_innings, funcScorebord.useYellowFont)
	func.setFontColor(lbl_beurten_partij, funcScorebord.useYellowFont)
End Sub


Sub beurtenChanged_MouseReleased (EventData As MouseEvent)
	Dim points, beurten As Int
	Dim lbl As Label = Sender
	Dim beurtenNew As String
	Dim lblValue As Int = lbl.Tag
	
	points = lblValue
	If EventData.PrimaryButtonPressed = False Then
		points = -Abs(lblValue)
	End If
	
	beurten = lbl_beurten_100.Text&lbl_beurten_10.Text&lbl_beurten_1.Text
	beurten = beurten + points
	
	If beurten < 0 Then
		beurten =lbl_beurten_100.Text&lbl_beurten_10.Text&lbl_beurten_1.Text
	End If
	
	beurtenNew = func.padString(beurten, "0", 0, 3)

	lbl_beurten_100.Text= beurtenNew.SubString2(0,1)
	lbl_beurten_10.Text = beurtenNew.SubString2(1,2)
	lbl_beurten_1.Text = beurtenNew.SubString2(2,3)
	funcScorebord.beurtenPartijBeurten = lbl_beurten_100.Text&lbl_beurten_10.Text&lbl_beurten_1.Text
	
End Sub


Sub lbl_beurten_partij_MouseReleased (EventData As MouseEvent)
	If chk_beurten_partij.Checked = False Then
		chk_beurten_partij.Checked = True
	Else
		chk_beurten_partij.Checked = False
	End If
End Sub

Sub lbl_auto_innings_MouseReleased (EventData As MouseEvent)
	If chkAuto_innings.Checked = False Then
		chkAuto_innings.Checked = True
	Else
		chkAuto_innings.Checked = False
	End If
	funcScorebord.autoInnings = chkAuto_innings.Checked
End Sub

Sub lbl_speler_invoer_MouseReleased (EventData As MouseEvent)
	If chk_add_player.Checked = False Then
		chk_add_player.Checked = True
		Else
		chk_add_player.Checked = False
	End If
	chk_add_player_CheckedChange(chk_add_player.Checked)
End Sub

Sub txt_speler_1_FocusChanged (HasFocus As Boolean)
	setTxtSelected(txt_speler_1, HasFocus)
End Sub

Sub txt_speler_2_FocusChanged (HasFocus As Boolean)
	setTxtSelected(txt_speler_2, HasFocus)
End Sub

Sub txt_maken_1_FocusChanged (HasFocus As Boolean)
	setTxtSelected(txt_maken_1, HasFocus)
End Sub

Sub txt_maken_2_FocusChanged (HasFocus As Boolean)
	setTxtSelected(txt_maken_2, HasFocus)
End Sub

Sub setTxtSelected(tBox As TextField, focus As Boolean)
	If focus Then
		tBox.Style = "-fx-text-fill: Yellow; -fx-background-color: #00008B; -fx-font-size: 52; -fx-font-weight: bold; -fx-alignment: center;"
	Else
		tBox.Style = "-fx-text-fill: Black; -fx-background-color: #FFFFFF; -fx-font-size: 52; -fx-font-weight: bold; -fx-alignment: center;"
	End If
End Sub

Sub RotateNode(n As Node, Degree As Double)
	Dim jo As JavaObject = n
	jo.RunMethod("setRotate", Array(Degree))
End Sub


Sub TestResponse As String
	Return "1"
End Sub

Sub lbl_close_MouseReleased (EventData As MouseEvent)
	If EventData.ClickCount <> 3 Then Return
	ExitApplication
End Sub

