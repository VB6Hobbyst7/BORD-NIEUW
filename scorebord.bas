﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
	Public frm As Form
	Private inactivecls As inactiveClass
	Private clsCheckCfg As classCheckConfig
	Private clsToast As clXToastMessage
'	Private clsUpdate As classUpdate
	Private pn_promote_top, pn_promote_left As Double
	Private promoteRunning As Boolean = False
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
	Private lbl_player_one_hs As Label
	Private lbl_player_two_hs As Label
	Private lbl_clock As B4XView
	Private clsTmr As timerClass
	Private Label7 As Label
	Private B4XProgressBarP1 As B4XProgressBar
	Private B4XProgressBarP2 As B4XProgressBar
	Private Label6 As Label
	Private lbl_close As B4XView
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
	Private pn_game As Pane
	Private lbl_game_text As Label
	Private lbl_ip As Label
	Private lbl_p1_inning As Label
	Private lbl_p2_inning As Label
End Sub

Public Sub show
	frm.Initialize("frm", 1920, 1080)
	frm.RootPane.LoadLayout("scorebord")
	frm.BackColor  =   fx.Colors.From32Bit(0xFF001A01)
	lbl_ip.Text = func.getIpNumber
	
	
	#if debug
	frm.SetFormStyle("UTILITY")
	#Else
	frm.SetFormStyle("UNDECORATED")
	frm.Resizable = False
	#End If
	
	frm.Stylesheets.Add(File.GetUri(File.DirAssets, "n205.css"))
	parseConfig.pullConfig
	MouseOver(frm.RootPane)
	
	'func.SetFormCursor(frm, "mouse.png")
	func.SetCustomCursor1(File.DirAssets, "mouse.png", 370, 370, frm.RootPane)
	
	clsTmr.Initialize(lbl_clock)
	inactivecls.Initialize(870, 510)
	clsCheckCfg.Initialize
	clsToast.Initialize(frm.RootPane)
	'clsUpdate.Initialize
	
	
	lbl_version.Text = func.getVersion
	funcScorebord.lblInnings = lbl_innings
	funcScorebord.lbl_player_one_hs = lbl_player_one_hs
	funcScorebord.lbl_player_two_hs = lbl_player_two_hs
	
	funcScorebord.setP1CaromLables(lstPlayerOneScoreLbl)
	funcScorebord.setP2CaromLables(lstPlayerTwoScoreLbl)
		
	Wait For (funcInet.testInet) Complete (result As Boolean)
	If result Then
		func.hasInternetAccess = True
	'	clsUpdate.checkUpdate
	Else
		func.hasInternetAccess = False
	End If
	
	initPanels
	frm.Show
	setFontStyle
End Sub



Public Sub setClearBoard(clear As Boolean)
	funcScorebord.setNieuwePartij = clear
End Sub

Sub initPanels
	pn_promote_top = 1130 'pn_promote.Top
	pn_promote_left = 20 'pn_promote.Left
	
	inactivecls.frm = frm
	inactivecls.pn_promote = pn_promote
	'inactivecls.pnlWidth = pn_promote.Width
	'inactivecls.pnlHeight = pn_promote.Height
End Sub


Sub setFontStyle
	func.caromLabelCss(lbl_player_one_hs, "labelWhite")
	func.caromLabelCss(lbl_player_one_moyenne, "labelWhite")
	func.caromLabelCss(lbl_player_one_perc, "labelWhite")
	func.caromLabelCss(lbl_player_two_hs, "labelWhite")
	func.caromLabelCss(lbl_player_two_moyenne, "labelWhite")
	func.caromLabelCss(lbl_player_two_perc, "labelWhite")
	
	func.caromLabelCss(lbl_innings, "labelCarom")
	
	func.caromLabelCss(lbl_player_one_100, "labelCarom")
	func.caromLabelCss(lbl_player_one_10, "labelCarom")
	func.caromLabelCss(lbl_player_one_1, "labelCarom")
	
	func.caromLabelCss(lbl_player_one_make_100, "labelCarom")
	func.caromLabelCss(lbl_player_one_make_10, "labelCarom")
	func.caromLabelCss(lbl_player_one_make_1, "labelCarom")
		
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

'PROCESS SCORE P1
Sub p1Points_MouseReleased (EventData As MouseEvent)
	Dim lbl As Label = Sender
	setP1Name
	funcScorebord.calcScorePlayerOne(lbl.Tag, EventData.PrimaryButtonPressed)
End Sub

'PROCESS SCORE P2
Sub p2Points_MouseReleased (EventData As MouseEvent)
	Dim lbl As Label = Sender
	setP2Name
	funcScorebord.calcScorePlayertwo(lbl.Tag, EventData.PrimaryButtonPressed)
End Sub

'PROCESS P1 TO MAKE
Sub p1ToMake_MouseReleased (EventData As MouseEvent)
	Dim lbl As Label = Sender
	funcScorebord.playerOneMake(lbl_player_one_make_100, lbl_player_one_make_10, lbl_player_one_make_1, EventData.PrimaryButtonPressed, lbl.Tag)
End Sub

'PROCESS P2 TO MAKE
Sub p2ToMake_MouseReleased (EventData As MouseEvent)
	Dim lbl As Label = Sender
	funcScorebord.playerOneMake(lbl_player_two_make_100, lbl_player_two_make_10, lbl_player_two_make_1, EventData.PrimaryButtonPressed, lbl.Tag)
End Sub


'Sub lbl_player_one_1_MouseReleased (EventData As MouseEvent)
'		setP1Name
'	funcScorebord.calcScorePlayerOne(1, EventData.PrimaryButtonPressed)
'End Sub
'Sub lbl_player_one_10_MouseReleased (EventData As MouseEvent)
'	setP1Name
'	funcScorebord.calcScorePlayerOne(10, EventData.PrimaryButtonPressed)
'End Sub
'Sub lbl_player_one_100_MouseReleased (EventData As MouseEvent)
'	setP1Name
'	funcScorebord.calcScorePlayerOne(100, EventData.PrimaryButtonPressed)
'End Sub

'Sub lbl_player_two_1_MouseReleased (EventData As MouseEvent)
'	setP2Name
'	funcScorebord.calcScorePlayertwo(1, EventData.PrimaryButtonPressed)
'End Sub
'Sub lbl_player_two_10_MouseReleased (EventData As MouseEvent)
'	setP2Name
'	funcScorebord.calcScorePlayertwo(10, EventData.PrimaryButtonPressed)
'End Sub
'Sub lbl_player_two_100_MouseReleased (EventData As MouseEvent)
'	setP2Name
'	funcScorebord.calcScorePlayertwo(100, EventData.PrimaryButtonPressed)
'End Sub

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
	
	funcScorebord.innigs = points
	lbl_innings.Text = func.padString(points, "0", 0, 3)
	funcScorebord.calcMoyenne(lbl_player_one_moyenne, lbl_player_two_moyenne)
	funcScorebord.processHs("all")
	funcScorebord.inngSet = 1
End Sub

Sub lbl_player_one_name_MouseReleased (EventData As MouseEvent)
	setP1Name
	If funcScorebord.inngSet = 0 Then
		funcScorebord.inngSet = 1
		funcScorebord.innigs = funcScorebord.innigs+1
		lbl_innings.Text = func.padString(funcScorebord.innigs, "0", 0, 3)
	End If
	funcScorebord.calcMoyenneP2
	funcScorebord.processHs("all")
End Sub

Sub lbl_player_two_name_MouseReleased (EventData As MouseEvent)
	setP2Name
	funcScorebord.calcMoyenneP1
	funcScorebord.processHs("all")
	funcScorebord.inngSet = 0
End Sub




'Sub lbl_player_one_make_100_MouseReleased (EventData As MouseEvent)
'	setP1Name
'	funcScorebord.playerOneMake(lbl_player_one_make_100, lbl_player_one_make_10, lbl_player_one_make_1, EventData.PrimaryButtonPressed, 100)
'End Sub
'Sub lbl_player_one_make_10_MouseReleased (EventData As MouseEvent)
'	setP1Name
'	funcScorebord.playerOneMake(lbl_player_one_make_100, lbl_player_one_make_10, lbl_player_one_make_1, EventData.PrimaryButtonPressed, 10)
'End Sub
'Sub lbl_player_one_make_1_MouseReleased (EventData As MouseEvent)
'	setP1Name
'	funcScorebord.playerOneMake(lbl_player_one_make_100, lbl_player_one_make_10, lbl_player_one_make_1, EventData.PrimaryButtonPressed, 1)
'End Sub

Sub playerOnePerc(perc As String)
	lbl_player_one_perc.Text = perc
End Sub

Sub playerTwoPerc(perc As String)
	lbl_player_two_perc.Text = perc
End Sub

'Sub lbl_player_two_make_100_MouseReleased (EventData As MouseEvent)
'		funcScorebord.playertwoMake(lbl_player_two_make_100, lbl_player_two_make_10, lbl_player_two_make_1, EventData.PrimaryButtonPressed, 100)
'End Sub
'Sub lbl_player_two_make_10_MouseReleased (EventData As MouseEvent)
'	funcScorebord.playertwoMake(lbl_player_two_make_100, lbl_player_two_make_10, lbl_player_two_make_1, EventData.PrimaryButtonPressed, 10)
'End Sub
'Sub lbl_player_two_make_1_MouseReleased (EventData As MouseEvent)
'	funcScorebord.playertwoMake(lbl_player_two_make_100, lbl_player_two_make_10, lbl_player_two_make_1, EventData.PrimaryButtonPressed, 1)
'End Sub

Sub resetBoard
	lbl_player_one_name.Text = "Speler 1"
	lbl_player_two_name.Text = "Speler 2"
	
	lbl_player_one_1.Text = "0"
	lbl_player_one_10.Text = "0"
	lbl_player_one_100.Text = "0"
	lbl_player_one_make_100.Text = "0"
	lbl_player_one_make_10.Text = "0"
	lbl_player_one_make_1.Text = "0"
	lbl_player_one_moyenne.Text = "0.000"
	lbl_player_one_perc.Text = "0.00%"
	
	lbl_innings.Text = "001"
	
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
	
	funcScorebord.inngSet = 1
	funcScorebord.innigs = 1
	funcScorebord.scorePlayerOne = 0
	funcScorebord.scorePlayerTwo = 0
	funcScorebord.playerOneToMake = 0
	funcScorebord.playertwoToMake = 0
	funcScorebord.playerOneHs = 0
	funcScorebord.playerTwoHs = 0
	funcScorebord.p1HsTemp = 0
	funcScorebord.p2HsTemp = 0
	B4XProgressBarP1.Progress = 0
	B4XProgressBarP2.Progress = 0
	setP1Name
	
End Sub

Sub setP1Name
	lbl_player_one_name.Color = 0xffFFFFFF'0xff3455db'0xFF69D79A
	lbl_player_one_name.TextColor = 0xff000000
	lbl_player_two_name.Color = 0xFF001A01
	lbl_player_two_name.TextColor = 0xFF81CFE0
	
	lbl_player_one_100.Enabled = True
	lbl_player_one_10.Enabled = True
	lbl_player_one_1.Enabled = True
	
	lbl_player_two_100.Enabled = False
	lbl_player_two_10.Enabled = False
	lbl_player_two_1.Enabled = False
	
	lbl_p1_inning.Visible = True
	lbl_p2_inning.Visible = False
	
End Sub

Sub setP2Name
	lbl_player_two_name.Color = 0xffFFFFFF'0xff3455db'0xFF69D79A
	lbl_player_two_name.TextColor = 0xff000000
	lbl_player_one_name.Color = 0xFF001A01
	lbl_player_one_name.TextColor =0xFF81CFE0
	
	lbl_player_one_100.Enabled = False
	lbl_player_one_10.Enabled = False
	lbl_player_one_1.Enabled = False
	
	lbl_player_two_100.Enabled = True
	lbl_player_two_10.Enabled = True
	lbl_player_two_1.Enabled = True
	
	lbl_p1_inning.Visible = False
	lbl_p2_inning.Visible = True
End Sub

Sub checkMatchWonP1
	Dim caroms, make As Int
	
	caroms = lbl_player_one_100.Text&lbl_player_one_10.Text&lbl_player_one_1.Text
	make = lbl_player_one_make_100.text&lbl_player_one_make_10.text&lbl_player_one_make_1.text
	
	If make = 0 Then Return
	
	If caroms >= make Then
		funcScorebord.calcMoyenneP2
		lbl_game_text.Text = $"Gelijkmakende beurt voor ${lbl_player_two_name.Text}"$
		pn_game.Top = (frm.RootPane.Height/2)-(pn_game.Height/2)
		setP2Name
		Sleep(4000)
		pn_game.Top = 1650
	End If
End Sub

Sub checkMatchWonP2
	Dim p2caroms, p2make As Int
	Dim p1caroms, p1Make As Int
	
	p2caroms = lbl_player_two_100.Text&lbl_player_two_10.Text&lbl_player_two_1.Text
	p2make = lbl_player_two_make_100.text&lbl_player_two_make_10.text&lbl_player_two_make_1.text
	
	If p2make = 0 Then Return
	
	p1caroms = lbl_player_one_100.Text&lbl_player_one_10.Text&lbl_player_one_1.Text
	p1Make = lbl_player_one_make_100.text&lbl_player_one_make_10.text&lbl_player_one_make_1.text
	
	If p2caroms >= p2make And p1Make = p1caroms Then
		lbl_game_text.Text = $"Remise partij"$
		pn_game.Top = (frm.RootPane.Height/2)-(pn_game.Height/2)
		setP2Name
		Sleep(4000)
		pn_game.Top = 1650
		Return
	End If
	
	
	If p2caroms >= p2make Then
		lbl_game_text.Text = $"${lbl_player_two_name.Text} heeft de partij gewonnen"$
		pn_game.Top = (frm.RootPane.Height/2)-(pn_game.Height/2)
		setP2Name
		Sleep(4000)
		pn_game.Top = 1650
		
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

Sub hideForm(hide As Boolean)
	frm.rootpane.Visible = hide
End Sub

Sub nieuwePartij
	If funcScorebord.newGameInitialized = False Then
	nieuwe_partij.show
	Else
		CallSub(nieuwe_partij, "showForm")
	End If	
End Sub

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
	If funcScorebord.newGameInitialized = False Then
		CallSub(nieuwe_partij, "show")
		Else
			CallSub(nieuwe_partij, "showForm")
	End If
	nieuwePartij
End Sub

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

Sub setSpelerData(data As List)
	resetBoard
	lbl_innings.Text = "001"
	funcScorebord.inngSet = 1
	funcScorebord.innigs = 1
	
	Dim teMaken As String
	lbl_player_one_name.Text = data.Get(0)
	funcScorebord.playerOneToMake = data.Get(1)
	teMaken =  func.padString(data.Get(1), "0", 0, 3)
	lbl_player_one_make_100.Text	= teMaken.SubString2(0,1)
	lbl_player_one_make_10.Text		= teMaken.SubString2(1,2)
	lbl_player_one_make_1.Text		= teMaken.SubString2(2,3)
		
	lbl_player_two_name.Text = data.Get(2)
	teMaken =  func.padString(data.Get(3), "0", 0, 3)
	funcScorebord.playerTwoToMake = data.Get(3)
	lbl_player_two_make_100.Text	= teMaken.SubString2(0,1)
	lbl_player_two_make_10.Text		= teMaken.SubString2(1,2)
	lbl_player_two_make_1.Text		= teMaken.SubString2(2,3)
End Sub


Sub lbl_player_two_hs_MouseReleased (EventData As MouseEvent)
	lbl_player_two_hs.Text = func.setHs(lbl_player_two_hs.Text, EventData.PrimaryButtonPressed)
End Sub

Sub lbl_player_one_hs_MouseReleased (EventData As MouseEvent)
	lbl_player_one_hs.Text = func.setHs(lbl_player_one_hs.Text, EventData.PrimaryButtonPressed)
End Sub