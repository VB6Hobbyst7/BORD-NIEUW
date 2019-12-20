B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
	Private Dialog As B4XDialog
	Private Base As B4XView
'	Private XUI As XUI
	Public frm As Form
	Private inactivecls As inactiveClass
	Private clsCheckCfg As classCheckConfig
	Private clsToast As clXToastMessage
	Private clsUpdate As classUpdate
	Private pn_promote_top, pn_promote_left As Double
	Private promoteRunning As Boolean = False
'	Private pNieuwePartij As B4XView 
'	Private pNieuwePartijDialog As B4XDialog
	Private lbl_innings As Label
	Private lbl_player_one_moyenne As Label
	Private lbl_player_two_moyenne As Label
	Private lbl_player_two_100 As Label
	Private lbl_player_two_10 As Label
	Private lbl_player_two_1 As Label
	Private lbl_player_one_name As B4XView
	Private lbl_player_two_name As B4XView
	Private lbl_player_one_perc As Label
	Private lbl_player_one_make_100 As Label
	Private lbl_player_one_make_10 As Label
	Private lbl_player_one_make_1 As Label
	Private lbl_player_two_make_100 As Label
	Private lbl_player_two_make_10 As Label
	Private lbl_player_two_make_1 As Label
	Private lbl_player_two_perc As Label
	Private lbl_reset As B4XView
'	Private jxui As XUI
	Private lbl_player_one_hs As Label
	Private lbl_player_two_hs As Label
	Private lbl_clock As B4XView
	Private clsTmr As timerClass
	Private Label7 As Label
'	Private edt_speler_a As TextField
'	Private edt_temaken_a As TextField
'	Private edt_speler_b As TextField
'	Private edt_temaken_b As TextField
'	Private btn_a_begint As Button
'	Private btn_b_begint As Button
	Private B4XProgressBarP1 As B4XProgressBar
	Private B4XProgressBarP2 As B4XProgressBar
'	Private btn_nieuwe_partij As Button
'	Private btn_annuleer_nieuwe_partij As Button
	Private Label6 As Label
	Private lbl_close As B4XView
'	Private chk_add_player As CheckBox
	Private pn_p1_carom As Pane
	Private pn_promote As Pane
	Private lbl_config_update As Label
	Private lbl_player_one_1 As Label
	Private lbl_player_one_10 As Label
	Private lbl_player_one_100 As Label
	Private lbl_message_1 As Label
	Private lbl_message_2 As Label
	Private lbl_message_3 As Label
	Private lbl_message_4 As Label
	Private lbl_message_5 As Label
	Private lbl_version As Label
	Private pn_sponsore As Pane
'	Public xfrm As Form
	Private pn_game As Pane
	Private lbl_game_text As Label
'	Private pn_a As Pane
'	Private txt_maken_1 As TextField
'	Private txt_speler_2 As TextField
'	Private txt_maken_2 As TextField
'	Private txt_speler_1 As TextField
End Sub


Public Sub show
	frm.Initialize("frm", 1920, 1080)
	frm.RootPane.LoadLayout("scorebord")
	frm.BackColor  =   fx.Colors.From32Bit(0xFF001A01)
	#if debug
	frm.SetFormStyle("UTILITY")
	#Else
	frm.SetFormStyle("UNDECORATED")
	frm.Resizable = False
	#End If
	
	frm.Stylesheets.Add(File.GetUri(File.DirAssets, "n205.css"))
	setFontSize
	parseConfig.pullConfig
	
	CallSub(nieuwe_partij, "show")
	frm.Show
	MouseOver(frm.RootPane)
	
	Base = frm.RootPane
	Dialog.Initialize (Base)
	
	'func.SetFormCursor(frm, "mouse.png")
	func.SetCustomCursor1(File.DirAssets, "mouse.png", 370, 370, frm.RootPane)
'	func.SetCustomCursor1(File.DirAssets, "mouse.png", 370, 370, xfrm.RootPane)
	
	
	clsTmr.Initialize(lbl_clock)
	inactivecls.Initialize
	clsCheckCfg.Initialize
	clsToast.Initialize(frm.RootPane)
	clsUpdate.Initialize
	lbl_version.Text = func.getVersion
	func.lblInnings = lbl_innings
	func.lbl_player_one_hs = lbl_player_one_hs
	func.lbl_player_two_hs = lbl_player_two_hs
	
	func.setP1CaromLables(lstPlayerOneScoreLbl)
	func.setP2CaromLables(lstPlayerTwoScoreLbl)
		
	Wait For (funcInet.testInet) Complete (result As Boolean)
	If result Then
		func.hasInternetAccess = True
		clsUpdate.checkUpdate
	Else
		func.hasInternetAccess = False
	End If
	
	initPanels
	
End Sub



Public Sub setClearBoard(clear As Boolean)
	func.setNieuwePartij = clear
End Sub

Sub initPanels
'	pNieuwePartijDialog.Initialize (Base)
'	pNieuwePartij = XUI.CreatePanel("")
'	pNieuwePartij.SetLayoutAnimated(0, 100dip, 0, 1000dip, 800dip)
'	pNieuwePartij.LoadLayout("nieuwe_partij")
'	pNieuwePartijDialog.Title = "Nieuwe Partij"
'	pNieuwePartijDialog.PutAtTop = False 'put the dialog at the top of the screen
	
	pn_promote_top = 1130 'pn_promote.Top
	pn_promote_left = 20 'pn_promote.Left
	
	
	inactivecls.frm = frm
	inactivecls.pn_promote = pn_promote
	inactivecls.pnlWidth = pn_promote.Width
	inactivecls.pnlHeight = pn_promote.Height
End Sub


Sub setFontSize
	func.caromLabelCss(lbl_innings, "labelCarom")
	func.caromLabelCss(lbl_player_one_name, "labelCarom")
	func.caromLabelCss(lbl_player_two_name, "labelCarom")

	func.caromLabelCss(lbl_player_one_hs, "labelWhite")
	func.caromLabelCss(lbl_player_one_moyenne, "labelWhite")
	func.caromLabelCss(lbl_player_one_perc, "labelWhite")
	
	
	func.caromLabelCss(lbl_player_one_100, "labelCarom")
	func.caromLabelCss(lbl_player_one_10, "labelCarom")
	func.caromLabelCss(lbl_player_one_1, "labelCarom")

	
	func.caromLabelCss(lbl_player_one_make_100, "labelCarom")
	func.caromLabelCss(lbl_player_one_make_10, "labelCarom")
	func.caromLabelCss(lbl_player_one_make_1, "labelCarom")
	
	func.caromLabelCss(lbl_player_two_hs, "labelWhite")
	func.caromLabelCss(lbl_player_two_moyenne, "labelWhite")
	func.caromLabelCss(lbl_player_two_perc, "labelWhite")
		
	func.caromLabelCss(lbl_player_two_100, "labelCarom")
	func.caromLabelCss(lbl_player_two_10, "labelCarom")
	func.caromLabelCss(lbl_player_two_1, "labelCarom")
	
	func.caromLabelCss(lbl_player_two_make_100, "labelCarom")
	func.caromLabelCss(lbl_player_two_make_10, "labelCarom")
	func.caromLabelCss(lbl_player_two_make_1, "labelCarom")
	
	
	resetBoard
	
End Sub

'Return true to allow the default exceptions handler to handle the uncaught exception.
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Return True
End Sub


'Sub lbl_player_two_MouseReleased (EventData As MouseEvent)
''	CSSUtils.SetBorder(lbl_player_one, 0, fx.Colors.From32Bit(0xFFFFFFFF), 4)
''	CSSUtils.SetBorder(lbl_player_two, 1, fx.Colors.From32Bit(0xFFFFFFFF), 4)
'
'End Sub

Sub lstPlayerOneScoreLbl As List
	Dim List As List
	List.Initialize
	List.AddAll(Array As Object(lbl_player_one_1, lbl_player_one_10, lbl_player_one_100, lbl_player_one_moyenne, B4XProgressBarP1))
	Return List
End Sub

Sub lstPlayerTwoScoreLbl As List
	Dim List As List
	List.Initialize
	List.AddAll(Array As Object(lbl_player_two_1, lbl_player_two_10, lbl_player_two_100, lbl_player_two_moyenne, B4XProgressBarP2))
	Return List
End Sub


Sub lastClick
	inactivecls.lastClick = DateTime.Now
End Sub

Sub lbl_player_one_1_MouseReleased (EventData As MouseEvent)
	setP1Name
	If EventData.PrimaryButtonPressed Then
		func.calcScorePlayerOne(1)
	Else If EventData.SecondaryButtonPressed Then
		func.calcScorePlayerOne(-1)
	End If
End Sub


Sub lbl_player_one_10_MouseReleased (EventData As MouseEvent)
	setP1Name
	If EventData.PrimaryButtonPressed Then
		func.calcScorePlayerOne(10)
	Else If EventData.SecondaryButtonPressed Then
		func.calcScorePlayerOne(-10)
	End If
End Sub
Sub lbl_player_one_100_MouseReleased (EventData As MouseEvent)
	setP1Name
	If EventData.PrimaryButtonPressed Then
		func.calcScorePlayerOne(100)
	Else If EventData.SecondaryButtonPressed Then
		func.calcScorePlayerOne(-100)
	End If
End Sub

Sub lbl_player_two_1_MouseReleased (EventData As MouseEvent)
	setP2Name
	If EventData.PrimaryButtonPressed Then
		func.calcScorePlayertwo(1)
	Else If EventData.SecondaryButtonPressed Then
		func.calcScorePlayertwo(-1)
	End If
End Sub
Sub lbl_player_two_10_MouseReleased (EventData As MouseEvent)
	setP2Name
	If EventData.PrimaryButtonPressed Then
		func.calcScorePlayertwo(10)
	Else If EventData.SecondaryButtonPressed Then
		func.calcScorePlayertwo(-10)
	End If
End Sub
Sub lbl_player_two_100_MouseReleased (EventData As MouseEvent)
	setP2Name
	If EventData.PrimaryButtonPressed Then
		func.calcScorePlayertwo(100)
	Else If EventData.SecondaryButtonPressed Then
		func.calcScorePlayertwo(-100)
	End If
End Sub

Sub lbl_player_one_active_MouseReleased (EventData As MouseEvent)
'	lbl_player_one_active.Color = 0xFF33BB02
	
End Sub

Sub lbl_innings_MouseReleased (EventData As MouseEvent)
	Dim points As Int = lbl_innings.Text
	If EventData.PrimaryButtonPressed Then
		points = points + 1
	Else
		points = points - 1
	End If
	If points = -1 Then
		Return
	End If
	
	func.innigs = points
	lbl_innings.Text = func.padString(points, "0", 0, 3)
	func.calcMoyenne(lbl_player_one_moyenne, lbl_player_two_moyenne)
	func.processHs("all")
	func.inngSet = 1
	
End Sub





Sub btn_exit_MouseReleased (EventData As MouseEvent)
	ExitApplication
End Sub


Sub lbl_player_one_1_MouseEntered (EventData As MouseEvent)
'	lbl_player_one_1.Color = 0xFF69D79A
	'func.setNumberCss(lbl_player_one_1)
End Sub

Sub lbl_player_two_1_MouseEntered (EventData As MouseEvent)
'	lbl_player_two_1.Color = 0xFF69D79A
	'CSSUtils.SetStyleProperty(lbl_player_two_1, "-fx-background-color",  "linear-gradient(to bottom,  #cfe7fa 0%,#6393c1 100%)")
	'CSSUtils.SetStyleProperty(lbl_player_two_1, "-fx-background-radius", "3,2,1")
'	func.setNumberCss(lbl_player_two_1)
End Sub

Sub lbl_player_two_1_MouseExited (EventData As MouseEvent)
	'lbl_player_two_1.Color = 0xFF00008B
'	CSSUtils.SetStyleProperty(lbl_player_two_1, "-fx-background-color",  "#00008B;")
	
End Sub

Sub lbl_player_one_name_MouseReleased (EventData As MouseEvent)
	setP1Name
	func.processHs("all")
	
End Sub

Sub lbl_player_two_name_MouseReleased (EventData As MouseEvent)
	setP2Name
	func.processHs("all")
	func.inngSet = 0
End Sub

Sub lbl_player_one_make_100_MouseReleased (EventData As MouseEvent)
	setP1Name
	func.playerOneMake(lbl_player_one_make_100, lbl_player_one_make_10, lbl_player_one_make_1, EventData.PrimaryButtonPressed, 100)
End Sub

Sub lbl_player_one_make_10_MouseReleased (EventData As MouseEvent)
	setP1Name
	func.playerOneMake(lbl_player_one_make_100, lbl_player_one_make_10, lbl_player_one_make_1, EventData.PrimaryButtonPressed, 10)
	
End Sub

Sub lbl_player_one_make_1_MouseReleased (EventData As MouseEvent)
	setP1Name
	func.playerOneMake(lbl_player_one_make_100, lbl_player_one_make_10, lbl_player_one_make_1, EventData.PrimaryButtonPressed, 1)
End Sub

Sub playerOnePerc(perc As String)
	lbl_player_one_perc.Text = perc
End Sub

Sub playerTwoPerc(perc As String)
	lbl_player_two_perc.Text = perc
End Sub

Sub lbl_player_two_make_100_MouseReleased (EventData As MouseEvent)
	
	func.playertwoMake(lbl_player_two_make_100, lbl_player_two_make_10, lbl_player_two_make_1, EventData.PrimaryButtonPressed, 100)
End Sub

Sub lbl_player_two_make_10_MouseReleased (EventData As MouseEvent)
	func.playertwoMake(lbl_player_two_make_100, lbl_player_two_make_10, lbl_player_two_make_1, EventData.PrimaryButtonPressed, 10)
End Sub

Sub lbl_player_two_make_1_MouseReleased (EventData As MouseEvent)
	func.playertwoMake(lbl_player_two_make_100, lbl_player_two_make_10, lbl_player_two_make_1, EventData.PrimaryButtonPressed, 1)
End Sub

Sub setCaromNumber(v As B4XView, value As String)
'	func.setVisibleAnimated(v, 200, False)
'	Sleep(200)
'	v.Color = 0x00FFFFFF
	v.Text = value
'	func.setVisibleAnimated(v, 200, True)
	
End Sub

Sub resetBoard
'	If bordStart Then
'	
'		Dim sf As Object = jxui.Msgbox2Async("Bord resetten?", "", "Ja", "", "Nee", Null)
'		Wait For (sf) Msgbox_Result (Result As Int)
'		If Result = jxui.DialogResponse_Negative Then
'			Return
'		End If
'	End If
	
'	lbl_player_one_1000.Text = "0"
	

	setCaromNumber(lbl_player_one_1, "0")
'	Sleep(200)
	setCaromNumber(lbl_player_one_10, "0")
'	Sleep(200)
	setCaromNumber(lbl_player_one_100, "0")
'	Sleep(200)
	
	lbl_player_one_1.Text = "0"
	lbl_player_one_make_100.Text = "0"
	lbl_player_one_make_10.Text = "0"
	lbl_player_one_make_1.Text = "0"
	lbl_player_one_moyenne.Text = "0.000"
	lbl_player_one_perc.Text = "0.00%"
	
	lbl_innings.Text = "000"
	
'	lbl_player_two_1000.Text = "0"
	lbl_player_two_100.Text = "0"
	lbl_player_two_10.Text = "0"
	lbl_player_two_1.Text = "0"
	lbl_player_two_make_100.Text = "0"
	lbl_player_two_make_10.Text = "0"
	lbl_player_two_make_1.Text = "0"
	lbl_player_two_perc.Text = "0.00%"
	lbl_player_two_moyenne.Text = "0.000"
	lbl_player_one_hs.Text = "000"
	lbl_player_two_hs.Text = "000"
	
	func.inngSet = 0
	func.innigs = 0
	func.scorePlayerOne = 0
	func.scorePlayerTwo = 0
	func.playerOneToMake = 0
	func.playertwoToMake = 0
	func.playerOneHs = 0
	func.playerTwoHs = 0
	func.p1HsTemp = 0
	func.p2HsTemp = 0
	B4XProgressBarP1.Progress = 0
	B4XProgressBarP2.Progress = 0
	setP1Name
	
End Sub


Sub setP1Name
	lbl_player_one_name.Color = 0xff3455db'0xFF69D79A
	lbl_player_two_name.Color = 0xFF001A01
	
	lbl_player_one_100.Enabled = True
	lbl_player_one_10.Enabled = True
	lbl_player_one_1.Enabled = True
	
	lbl_player_two_100.Enabled = False
	lbl_player_two_10.Enabled = False
	lbl_player_two_1.Enabled = False
End Sub

Sub setP2Name
	lbl_player_two_name.Color = 0xff3455db'0xFF69D79A
	lbl_player_one_name.Color = 0xFF001A01
	
	lbl_player_one_100.Enabled = False
	lbl_player_one_10.Enabled = False
	lbl_player_one_1.Enabled = False
	
	lbl_player_two_100.Enabled = True
	lbl_player_two_10.Enabled = True
	lbl_player_two_1.Enabled = True
End Sub




Sub checkMatchWonP1
	Dim caroms, make As Int
	
	caroms = lbl_player_one_100.Text&lbl_player_one_10.Text&lbl_player_one_1.Text
	make = lbl_player_one_make_100.text&lbl_player_one_make_10.text&lbl_player_one_make_1.text
	
	If make = 0 Then Return
	
	If caroms >= make Then
		lbl_game_text.Text = $"Gelijkmakende beurt voor ${lbl_player_two_name.Text}"$
		pn_game.Top = (frm.RootPane.Height/2)-(pn_game.Height/2)
		setP2Name
		Sleep(4000)
		pn_game.Top = 1650
	End If
End Sub

Sub checkMatchWonP2
	Dim caroms, make As Int
	
	caroms = lbl_player_two_100.Text&lbl_player_two_10.Text&lbl_player_two_1.Text
	make = lbl_player_two_make_100.text&lbl_player_two_make_10.text&lbl_player_two_make_1.text
	If make = 0 Then Return
	
	If caroms >= make Then
'		Dim m As MediaPlayer
'		
'		Dim mv As JavaObject
'		m.Initialize("m",File.GetUri(File.DirApp&"/44","win_vid.mp4"))
'		mv.InitializeNewInstance("javafx.scene.media.MediaView",Array(m))
'		pn_a.AddNode(mv, 0, 0, pn_a.Width, pn_a.Height)
'		m.Play
'		Sleep(5000)
'		m.Stop
	End If
End Sub




'Sub iets
'	Dim dlg As B4XDialog
'	dlg.Initialize (Base)
'	Dim p As B4XView = XUI.CreatePanel("")
'	p.SetLayoutAnimated(0, 0, 0, 600dip, 600dip)
'	p.LoadLayout("players")
'	dlg.Title = "Spelers Invoer"
'	dlg.PutAtTop = True 'put the dialog at the top of the screen
'	Wait For (dlg.ShowCustom(p, "OK", "", "CANCEL")) Complete (Result As Int)
'	If Result = XUI.DialogResponse_Positive Then
'		
'	End If
'End Sub


Sub hideForm(hide As Boolean)
	frm.rootpane.Visible = hide
	
End Sub

Sub nieuwePartij
	'hideForm(False)
	nieuwe_partij.show
End Sub


'Sub btn_a_begint_MouseReleased (EventData As MouseEvent)
'	
'End Sub
'
'Sub btn_b_begint_MouseReleased (EventData As MouseEvent)
'	
'End Sub

'Sub edt_temaken_a_TextChanged (Old As String, New As String)
'	edt_temaken_a.Text =  func.testNumber(Old, New)
'	edt_temaken_a.SetSelection(edt_temaken_a.Text.Length, edt_temaken_a.Text.Length)
'		
'End Sub

'Sub edt_temaken_b_TextChanged (Old As String, New As String)
'	edt_temaken_b.Text =  func.testNumber(Old, New)
'	edt_temaken_b.SetSelection(edt_temaken_b.Text.Length, edt_temaken_b.Text.Length)
'End Sub


Sub lbl_reset_MouseEntered (EventData As MouseEvent)
	lbl_reset.Color =  0xFF69D79A
	lbl_reset.TextColor = 0xFFFFFF00
End Sub

Sub lbl_reset_MouseExited (EventData As MouseEvent)
	lbl_reset.Color = 0xFFFF0000
	lbl_reset.TextColor = 0xFFFFFFFF
End Sub

Sub lbl_reset_MouseReleased (EventData As MouseEvent)
	inactivecls.lastClick = DateTime.Now
	nieuwePartij
	'iets
	'resetBoard(True)
End Sub


'
'Sub btn_nieuwe_partij_MouseReleased (EventData As MouseEvent)
'	'pNieuwePartijDialog.Close(XUI.DialogResponse_Positive)
''	xfrm.Close
'	resetBoard(False)
'		
''		Dim p As Pane = xfrm.RootPane.GetNode(0)
''		p.SetLayoutAnimated(1000, p.Left, xfrm.RootPane.Top-300dip, p.Width, p.Height)
''		Sleep(1000)
''		p.SetLayoutAnimated(1000, p.Left, xfrm.RootPane.Top+10dip, p.Width, p.Height)
''	If chk_add_player.Checked Then
''		'iets
''		pn_new.SetLayoutAnimated(1000, pn_new.Left, pn_new.Top-300dip, pn_new.Width, pn_new.Height)
''		
''	End If
'End Sub

'Sub btn_annuleer_nieuwe_partij_MouseReleased (EventData As MouseEvent)
''	xfrm.Close
'	frm.rootpane.Visible = True
'	'pNieuwePartijDialog.Close(XUI.DialogResponse_Cancel)
'	
'End Sub



Sub lbl_close_MouseReleased (EventData As MouseEvent)
	ExitApplication
End Sub


Sub showPromote
	pn_promote.SetLayoutAnimated(0, 50dip, 50dip, pn_promote.Width, pn_promote.Height)
End Sub

Sub drawPromote(x As Double, y As Double)
	pn_promote.SetLayoutAnimated(0, x, y, pn_promote.Width, pn_promote.Height)
	Sleep(0)
	
End Sub

'Sub pn_promote_MouseReleased (EventData As MouseEvent)
'	pn_promote.Top = pn_promote_top
'	pn_promote.left = pn_promote_left
'	
'	inactivecls.lastClick = DateTime.Now
'	inactivecls.enableTime(True)
'	inactivecls.enablePromote(False)
'End Sub

Sub setPromoteRunning(running As Boolean)
	promoteRunning = running
End Sub

private Sub mouseIn_Event(m As String,args() As Object)
	If promoteRunning = True Then
		pn_promote.Top = pn_promote_top
		pn_promote.left = pn_promote_left
		Sleep(0)
		inactivecls.lastClick = DateTime.Now
		inactivecls.enableTime(True)
		inactivecls.enablePromote(False)
		promoteRunning = False
		Sleep(300)
	End If
End Sub

private Sub MouseOver(n1 As Node)
	
	setHandler(n1,"setOnMouseMoved","mouseIn")
	setHandler(n1,"setOnMouseExited","mouseOut")
End Sub

private Sub setHandler(ob As JavaObject,eventName As String,handlerName As String)
	ob.RunMethod(eventName, Array(ob.CreateEventFromUI("javafx.event.EventHandler",handlerName,True)))
End Sub

'Private Sub asJO(o As JavaObject) As JavaObject
'	Return o
'End Sub

Sub MainForm_MouseClicked (EventData As MouseEvent)
	If inactivecls.tmr_draw_promote.Enabled = True Then
		pn_promote.Top = pn_promote_top
		pn_promote_left = pn_promote_left
	
		inactivecls.lastClick = DateTime.Now
		inactivecls.enableTime(True)
		inactivecls.enablePromote(False)
	End If
End Sub

Sub updateCfg
	inactivecls.updatePromote
	lbl_config_update.Visible = True
	Sleep(5000)
	lbl_config_update.Visible = False
End Sub

Sub useDigitalFont(useDigital As Boolean)
	Dim fsCarom, fsMake, fsInnings As Int
	
	If useDigital Then
		fsCarom = 300'350
		fsMake = 225
		fsInnings = 250'300
	Else 
		fsCarom = 225
		fsMake = 150
		fsInnings = 200	
	End If
	
	func.setFont(lbl_player_one_1, fsCarom, useDigital)
	func.setFont(lbl_player_one_10, fsCarom, useDigital)
	func.setFont(lbl_player_one_100, fsCarom, useDigital)
	func.setFont(lbl_player_two_1, fsCarom, useDigital)
	func.setFont(lbl_player_two_10, fsCarom, useDigital)
	func.setFont(lbl_player_two_100, fsCarom, useDigital)
	func.setFont(lbl_innings, fsInnings, useDigital)
	func.setFont(lbl_player_one_make_100, fsMake, useDigital)
	func.setFont(lbl_player_one_make_10, fsMake, useDigital)
	func.setFont(lbl_player_one_make_1, fsMake, useDigital)
	func.setFont(lbl_player_two_make_100,fsMake, useDigital)
	func.setFont(lbl_player_two_make_10,fsMake, useDigital)
	func.setFont(lbl_player_two_make_1,fsMake, useDigital)
	
End Sub

Sub useFontYellow(useYellow As Boolean)
	
	func.setFontColor(lbl_innings, useYellow)
		
	func.setFontColor(lbl_player_one_1, useYellow)
	func.setFontColor(lbl_player_one_10, useYellow)
	func.setFontColor(lbl_player_one_100, useYellow)
	
	func.setFontColor(lbl_player_two_1, useYellow)
	func.setFontColor(lbl_player_two_10, useYellow)
	func.setFontColor(lbl_player_two_100, useYellow)
	
	func.setFontColor(lbl_player_one_make_100, useYellow)
	func.setFontColor(lbl_player_one_make_10, useYellow)
	func.setFontColor(lbl_player_one_make_1, useYellow)
	
	func.setFontColor(lbl_player_two_make_100, useYellow)
	func.setFontColor(lbl_player_two_make_10, useYellow)
	func.setFontColor(lbl_player_two_make_1, useYellow)
End Sub

Sub showSponor(enabled As Boolean)
	pn_sponsore.Visible = enabled
End Sub


Sub setMessage(msgList As List)
	lbl_message_1.Text = msgList.get(0)
	lbl_message_2.Text = msgList.get(1)
	lbl_message_3.Text = msgList.get(2)
	lbl_message_4.Text = msgList.get(3)
	lbl_message_5.Text = msgList.Get(4)
	
End Sub


'Sub btn_test_MouseReleased (EventData As MouseEvent)
'	clsUpdate.restartApp
'End Sub


Sub setSpelerData(data As List)
	resetBoard
	Dim teMaken As String
	lbl_player_one_name.Text = data.Get(0)
	func.playerOneToMake = data.Get(1)
	teMaken =  func.padString(data.Get(1), "0", 0, 3)
	lbl_player_one_make_100.Text	= teMaken.SubString2(0,1)
	lbl_player_one_make_10.Text		= teMaken.SubString2(1,2)
	lbl_player_one_make_1.Text		= teMaken.SubString2(2,3)
		
	lbl_player_two_name.Text = data.Get(2)
	teMaken =  func.padString(data.Get(3), "0", 0, 3)
	func.playerTwoToMake = data.Get(3)
	lbl_player_two_make_100.Text	= teMaken.SubString2(0,1)
	lbl_player_two_make_10.Text		= teMaken.SubString2(1,2)
	lbl_player_two_make_1.Text		= teMaken.SubString2(2,3)
	
'	frm.Stylesheets.Add(File.GetUri(File.DirAssets, "n205.css"))
	
End Sub




