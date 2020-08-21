B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8
@EndOfDesignText@
'#IgnoreWarnings: 16, 9

'Static code module
Sub Process_Globals
	Private fx As JFX
	Public frm As Form
	
	Private parser As JSONParser
	Private PartijFolder As String
	Private inactivecls As inactiveClass
	Private clsCheckCfg As classCheckConfig
	Private clsUpdate As classUpdate
	Private clsTmr As timerClass
	Private clsNewGame As classNewGame
	Private clsGameTime As classGameTimer
	Private aanStoot As Int
	
	Private newGame As Boolean = False
	Private pn_promote_top, pn_promote_left As Double
	Private promoteRunning As Boolean = False
	Private lbl_player_one_moyenne, lbl_player_two_moyenne As Label
	Private lbl_player_two_100, lbl_player_two_10, lbl_player_two_1 As Label
	Private lbl_player_one_make_100, lbl_player_one_make_10, lbl_player_one_make_1 As Label
	Private lbl_player_two_make_100, lbl_player_two_make_10, lbl_player_two_make_1 As Label

	Private lbl_player_one_name, lbl_player_two_name As B4XView
	Private lbl_player_one_perc, lbl_player_two_perc As Label
	Private lbl_reset, lbl_clock, lbl_close, lbl_clearBord As B4XView
	Private lbl_player_one_hs, lbl_player_two_hs, lbl_innings As Label
	Private B4XProgressBarP1, B4XProgressBarP2 As B4XProgressBar
	Private pn_p1_carom, pn_promote, pn_sponsore, pn_game As Pane
	Private lbl_config_update As Label
	Private lbl_player_one_1, lbl_player_one_10, lbl_player_one_100 As Label
	Private lbl_message_1, lbl_message_2, lbl_message_3, lbl_message_4, lbl_message_5 As Label
	Private lbl_game_text, lbl_ip, lbl_p1_inning, lbl_p2_inning, Label7, Label6, lbl_version As Label
	Private lbl_img_sponsore, lbl_date_time_dag, lbl_date_time_date, lbl_partij_duur As Label
	Private lbl_spel_soort, lbl_partij_duur_header, lbl_has_inet, lbl_beurten_header As Label

	Dim mqttBordPub As mqttPubBord
	Dim mqttPubDataBord As mqttPubData
	
	Private lblBroker As Label
	Private lblBrokerDead As Label
	Dim starterMqttConnected As Starter
	Private mqttEnabled As Boolean
	Private brokerConnected As Boolean
	
	Private pn_a As Pane
	Private btnResetGameCancel As Button
	Private btnResetGameReset As Button
End Sub

'Return true to allow the default exceptions handler to handle the uncaught exception.
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	LogError("ERR" & Error)
	LogError(StackTrace)
	File.WriteString(File.DirApp, "errStackTrace.txt", StackTrace)
	File.WriteString(File.DirApp, "errError.txt", Error)
	Return True
End Sub


Public Sub show
	frm.Initialize("frm", 1920, 1080)
	frm.RootPane.LoadLayout("scorebord")
	frm.BackColor  =   fx.Colors.From32Bit(0xFF001A01)
	lbl_ip.Text = func.getIpNumber
	
'	CSSUtils.SetBackgroundImage(lbl_img_sponsore, "",parseConfig.getAppImagePath & "start_partij.png")
	CSSUtils.SetBackgroundImage(lbl_img_sponsore, "",parseConfig.getAppImagePath & "biljarter.png")
	
	#if debug
	frm.SetFormStyle("DECORATED")
	#Else
	frm.SetFormStyle("UNDECORATED")
	frm.Resizable = False
	#End If
	
	frm.Stylesheets.Add(File.GetUri(File.DirAssets, "n205.css"))
	parseConfig.pullConfig
	MouseOver(frm.RootPane)
	
	'func.SetFormCursor(frm, "mouse.png")
	func.SetCustomCursor1(File.DirAssets, "mouse.png", 370, 370, frm.RootPane)
	
	clsTmr.Initialize(lbl_clock, lbl_date_time_date, lbl_date_time_dag)
	inactivecls.Initialize(870, 510)
	clsCheckCfg.Initialize
	clsNewGame.Initialize(lbl_reset)
	clsGameTime.Initialize(lbl_partij_duur)
	clsUpdate.Initialize
	mqttBordPub.Initialize
	mqttPubDataBord.Initialize
	funcScorebord.lblInnings = lbl_innings
	funcScorebord.lbl_player_one_hs = lbl_player_one_hs
	funcScorebord.lbl_player_two_hs = lbl_player_two_hs
	
	funcScorebord.setP1CaromLables(lstPlayerOneScoreLbl)
	funcScorebord.setP2CaromLables(lstPlayerTwoScoreLbl)

	lbl_has_inet.Visible = False
	lblBrokerDead.Visible = False
	lblBroker.Visible = False
	
	If func.ipNumber <> "127.0.0.1" Then
		Wait For (funcInet.testInet) Complete (result As Boolean)
		If result Then
			func.hasInternetAccess = True
			'	clsUpdate.checkUpdate
		Else
			func.hasInternetAccess = False
		End If
		lblBroker.Visible = result
		lblBrokerDead.Visible = result
		lbl_has_inet.Visible = result
	End If
	
	initPanels
	nieuwe_partij.show
	CallSub(nieuwe_partij, "dummyShow")
	frm.Show
	setFontStyle
	disableControls
	GetPartijFolder
	'disabeClockFunction(func.hasInternetAccess)
	disabeClockFunction(False)
	func.alignLabelCenter(lbl_player_one_name)
	func.alignLabelCenter(lbl_player_two_name)
	func.alignLabelCenter(lbl_game_text)
	lbl_version.Text = funcScorebord.BordVersion
	CheckGameStop
	
	Dim strRetro As String = File.ReadString(func.appPath, "retro.cnf")
	
	clsCheckCfg.ProcessRetro(strRetro)
	
	If func.hasInternetAccess Then
		'Log("Has internet")
		starterMqttConnected.Initialize
		PubBord
	End If
End Sub


Sub ShowScoreBord
	frm.Show
End Sub

Sub EnableMqtt
'	Log("ENABLE MQTT")
	PubBord
End Sub

Sub GetPartijFolder
	Dim os As String = parseConfig.DetectOS
	Dim appFolder As String
			
	Select os
		Case "windows"
			appFolder = File.DirApp'&"\44\"
			PartijFolder = $"${appFolder}\gespeelde_partijen"$
			'	clsGen.general
		Case "linux"
			appFolder = File.DirApp'&"/44/"
			PartijFolder = $"${appFolder}/44/gespeelde_partijen"$
	End Select
	If File.IsDirectory("",PartijFolder) = False Then
		File.MakeDir("", PartijFolder)
	End If
End Sub

Public Sub setClearBoard(clear As Boolean)
	funcScorebord.setNieuwePartij = clear
End Sub


Sub SetBrokerStatus(status As Boolean)
	brokerConnected = status
End Sub

Sub DisconnectMqtt
	CallSubDelayed(mqttBordPub, "StopServer")
	CallSubDelayed(mqttPubDataBord, "StopServer")
End Sub


Sub MqttConnected
	
'	Log($"SCOREBORD BROKER CONNECT IS ${brokerConnected}"$)
'	PubBord
'	If brokerConnected = True Then
'		Log($"BROKER CONNECT IS ${brokerConnected}"$)
'		func.mqttClientConnected = brokerConnected
'		SetBrokerIcon(True)
'		mqttBordPub.ConnectTo
'		mqttPubDataBord.ConnectTo
'		Sleep(1000)
'		Return
'	End If
	

	If mqttEnabled = False Then
		func.mqttClientConnected = False
		SetBrokerIcon(False)
		mqttBordPub.StopServer
		mqttPubDataBord.StopServer
		Return
	End If
	
	If brokerConnected = False Or mqttEnabled = False Then
		func.mqttClientConnected = False
		SetBrokerIcon(False)
		mqttBordPub.StopServer
		mqttPubDataBord.StopServer
		Return
	End If
	
	If brokerConnected Then 'And Not(func.mqttClientConnected) Then
'		Log($"BROKER CONNECT IS ${brokerConnected}"$)
		func.mqttClientConnected = brokerConnected
		SetBrokerIcon(True)
		'Sleep(1000)
''		mqttBordPub.ConnectTo
''		mqttPubDataBord.ConnectTo
		
		CallSubDelayed(mqttBordPub, "ConnectTo")
		CallSubDelayed(mqttPubDataBord, "ConnectTo")
'		Log($"NA mqttBordPub.ConnectTo $Time{DateTime.Now}"$)
		'Sleep(1000)
	End If
End Sub

Sub PubBord
		'Log("PB " & func.hasInternetAccess)
	If func.hasInternetAccess Then
		StartStopClientServer
		'funcScorebord.bordName =func.bordName
	End If
End Sub

Sub initPanels
	pn_promote_top = 1130 'pn_promote.Top
	pn_promote_left = 20 'pn_promote.Left
	
	inactivecls.frm = frm
	inactivecls.pn_promote = pn_promote
End Sub


Sub setFontStyle
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
	If funcScorebord.isBordClient = True Then
		Return
	End If
	Dim lbl As Label = Sender
	setP1Name
	funcScorebord.calcScorePlayerOne(lbl.Tag, EventData.PrimaryButtonPressed)
	WriteScoreJson
End Sub

'PROCESS SCORE P2
Sub p2Points_MouseReleased (EventData As MouseEvent)
	If funcScorebord.isBordClient = True Then
		Return
	End If
	Dim lbl As Label = Sender
	setP2Name
	funcScorebord.calcScorePlayertwo(lbl.Tag, EventData.PrimaryButtonPressed)
	WriteScoreJson
End Sub

'PROCESS P1 TO MAKE
Sub p1ToMake_MouseReleased (EventData As MouseEvent)
	If funcScorebord.isBordClient = True Then
		Return
	End If
	Dim lbl As Label = Sender
	funcScorebord.playerOneMake(lbl_player_one_make_100, lbl_player_one_make_10, lbl_player_one_make_1, EventData.PrimaryButtonPressed, lbl.Tag)
	WriteScoreJson
End Sub

'PROCESS P2 TO MAKE
Sub p2ToMake_MouseReleased (EventData As MouseEvent)
	If funcScorebord.isBordClient = True Then
		Return
	End If
	Dim lbl As Label = Sender
	funcScorebord.playerTwoMake(lbl_player_two_make_100, lbl_player_two_make_10, lbl_player_two_make_1, EventData.PrimaryButtonPressed, lbl.Tag)
	WriteScoreJson
End Sub

Sub lbl_innings_MouseReleased (EventData As MouseEvent)
	If funcScorebord.isBordClient = True Then
		Return
	End If
	
	Dim points As Int = lbl_innings.Text
		
	If EventData.PrimaryButtonPressed Then
		points = points + 1
	Else
		points = points - 1
	End If
	If points = -1 Then
		Return
	End If

	funcScorebord.innings = points
	funcScorebord.prevInnings = funcScorebord.prevInnings+1'points
	lbl_innings.Text = func.padString(points, "0", 0, 3)
	funcScorebord.calcMoyenne(lbl_player_one_moyenne, lbl_player_two_moyenne)
	funcScorebord.processHs("all")
	funcScorebord.inningSet = 1
	WriteScoreJson
	
End Sub

Sub lbl_player_one_name_MouseReleased (EventData As MouseEvent)
	If funcScorebord.isBordClient = True Then
		Return
	End If
	
	funcScorebord.calcMoyenneP2
	setP1Name
	If funcScorebord.inningSet = 0 And funcScorebord.autoInnings = True Then
		funcScorebord.inningSet = 1
		funcScorebord.innings = funcScorebord.innings+1
		lbl_innings.Text = func.padString(funcScorebord.innings, "0", 0, 3)
	End If
	funcScorebord.processHs("all")
	Sleep(100)
	WriteScoreJson
End Sub

Sub lbl_player_two_name_MouseReleased (EventData As MouseEvent)
	If funcScorebord.isBordClient = True Then
		Return
	End If
	
	setP2Name
	funcScorebord.inningSet = 0
	funcScorebord.calcMoyenneP1
	funcScorebord.processHs("all")
	Sleep(100)
	WriteScoreJson
End Sub

Sub playerOnePerc(perc As String)
	lbl_player_one_perc.Text = perc
End Sub

Sub playerTwoPerc(perc As String)
	lbl_player_two_perc.Text = perc
End Sub

Sub resetBoard
	lbl_player_one_name.Text = "SPELER"&CRLF&"1"
	lbl_player_two_name.Text = "SPELER"&CRLF&"2"
	
	lbl_partij_duur.Text = "00:00"
	
	lbl_player_one_1.Text = "0"
	lbl_player_one_10.Text = "0"
	lbl_player_one_100.Text = "0"
	lbl_player_one_make_100.Text = "0"
	lbl_player_one_make_10.Text = "0"
	lbl_player_one_make_1.Text = "0"
	lbl_player_one_moyenne.Text = "0.000"
	lbl_player_one_perc.Text = "0.00%"
	
	lbl_innings.Text = "000"
	
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
	
	If funcScorebord.autoInnings Then
		lbl_innings.Text = "001"
		funcScorebord.inningSet = 1
		funcScorebord.innings = 1
	Else
		funcScorebord.inningSet = 0
		funcScorebord.innings = 0
		funcScorebord.prevInnings = 1
	End If
	
	If funcScorebord.autoInnings Then
		lbl_beurten_header.Style ="-fx-background-color: transparent; -fx-text-fill: #dadada;"
	Else
		lbl_beurten_header.Style ="-fx-background-color: White; -fx-text-fill: #000000;"
		'fx.Colors.From32Bit(0x00FFFFFF)
	End If
	
	funcScorebord.scorePlayerOne = 0
	funcScorebord.scorePlayerTwo = 0
	funcScorebord.p1ToMake = 0
	funcScorebord.p2ToMake = 0
	funcScorebord.p1Hs = 0
	funcScorebord.p2Hs = 0
	funcScorebord.p1HsTemp = 0
	funcScorebord.p2HsTemp = 0
	B4XProgressBarP1.Progress = 0
	B4XProgressBarP2.Progress = 0
	'u
	clsCheckCfg.enabledTimer(True)
End Sub

Sub setBeurten(beurten As String)
	lbl_innings.Text = beurten
End Sub

Sub setSpelSoort(spel As String)
	lbl_spel_soort.Text = spel
End Sub

Sub setNewGame(set As Boolean)
	If func.hasInternetAccess Then
	End If
	
	CSSUtils.SetBackgroundImage(lbl_img_sponsore, "",parseConfig.getAppImagePath & "start_partij.png")
	newGame = set
	disableControls
	enableScoreAndMake
End Sub

Sub enableScoreAndMake
	disableControls
	
	lbl_player_one_make_100.Enabled = True
	lbl_player_one_make_10.Enabled = True
	lbl_player_one_make_1.Enabled = True
	
	lbl_player_two_make_100.Enabled = True
	lbl_player_two_make_10.Enabled = True
	lbl_player_two_make_1.Enabled = True
End Sub


Sub disableControls
	lbl_player_one_name.Enabled = False
	lbl_player_two_name.Enabled = False
	
	lbl_innings.Enabled = False
	lbl_player_one_100.Enabled = False
	lbl_player_one_10.Enabled = False
	lbl_player_one_1.Enabled = False
	lbl_player_one_make_100.Enabled = False
	lbl_player_one_make_10.Enabled = False
	lbl_player_one_make_1.Enabled = False
	lbl_player_one_hs.Enabled = False
	
	
	lbl_player_two_100.Enabled = False
	lbl_player_two_10.Enabled = False
	lbl_player_two_1.Enabled = False
	lbl_player_two_make_100.Enabled = False
	lbl_player_two_make_10.Enabled = False
	lbl_player_two_make_1.Enabled = False
	lbl_player_two_hs.Enabled = False
	
	lbl_p1_inning.Visible = True
	lbl_p2_inning.Visible = False
	
End Sub

Sub setP1Name
	lbl_player_one_name.Color = 0xffFFFFFF'0xff3455db'0xFF69D79A
	
	lbl_player_one_name.TextColor = 0xff000000
	lbl_player_two_name.Color = 0xFF001A01'0xFF313030' 0xFF001A01
	lbl_player_two_name.TextColor = 0xffffffff '0xFF81CFE0
	
	lbl_player_one_100.Enabled = True
	lbl_player_one_10.Enabled = True
	lbl_player_one_1.Enabled = True
	lbl_player_one_make_100.Enabled = True
	lbl_player_one_make_10.Enabled = True
	lbl_player_one_make_1.Enabled = True
	lbl_player_one_hs.Enabled = True
	
	
	lbl_player_two_100.Enabled = False
	lbl_player_two_10.Enabled = False
	lbl_player_two_1.Enabled = False
	lbl_player_two_make_100.Enabled = False
	lbl_player_two_make_10.Enabled = False
	lbl_player_two_make_1.Enabled = False
	lbl_player_two_hs.Enabled = False
	
	lbl_p1_inning.Visible = True
	lbl_p2_inning.Visible = False
	aanStoot = 1
End Sub

Sub setP2Name
	lbl_player_two_name.Color = 0xffFFFFFF'0xff3455db'0xFF69D79A
	lbl_player_two_name.TextColor = 0xff000000
	lbl_player_one_name.Color = 0xFF001A01 '0xFF313030 '0xFF001A01
	lbl_player_one_name.TextColor = 0xffffffff '0xFF81CFE0
	
	lbl_player_one_100.Enabled = False
	lbl_player_one_10.Enabled = False
	lbl_player_one_1.Enabled = False
	lbl_player_one_make_100.Enabled = False
	lbl_player_one_make_10.Enabled = False
	lbl_player_one_make_1.Enabled = False
	lbl_player_one_hs.Enabled = False
	
	lbl_player_two_100.Enabled = True
	lbl_player_two_10.Enabled = True
	lbl_player_two_1.Enabled = True
	lbl_player_two_make_100.Enabled = True
	lbl_player_two_make_10.Enabled = True
	lbl_player_two_make_1.Enabled = True
	lbl_player_two_hs.Enabled = True
	
	lbl_p1_inning.Visible = False
	lbl_p2_inning.Visible = True
	aanStoot = 2
End Sub

Sub checkMatchWonP1
	Dim caroms, make As Int
	Dim player As String
	
	caroms = lbl_player_one_100.Text&lbl_player_one_10.Text&lbl_player_one_1.Text
	make = lbl_player_one_make_100.text&lbl_player_one_make_10.text&lbl_player_one_make_1.text
	
	If make = 0 Then Return
	
	If caroms >= make And funcScorebord.beurtenPartij = False Then
		player = lbl_player_two_name.Text.Replace(CRLF, " ")
		
		funcScorebord.calcMoyenneP2
		lbl_game_text.Text = $"Gelijkmakende beurt voor ${player}"$
		pn_game.Top = (frm.RootPane.Height/2)-(pn_game.Height/2)
		setP2Name
		Sleep(4000)
		pn_game.Top = 1650
	End If
		
	
End Sub

Sub checkMatchWonP2
	Dim p2caroms, p2make As Int
	Dim p1caroms, p1Make As Int
	Dim player As String
	
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
		player = lbl_player_two_name.Text.Replace(CRLF, " ")
		lbl_game_text.Text = $"${player} heeft de partij gewonnen"$
		pn_game.Top = (frm.RootPane.Height/2)-(pn_game.Height/2)
		setP2Name
		Sleep(4000)
		pn_game.Top = 1650
	End If
End Sub

Sub hideForm(Hide As Boolean)
	'frm.rootpane.Visible = hide
	frm.show
End Sub

Public Sub HideMainForRetro(showForm As Boolean)
	frm.RootPane.Visible = showForm
End Sub


Sub nieuwePartij
	If funcScorebord.newGameInitialized = False Then
		nieuwe_partij.show
	Else
		CallSub(nieuwe_partij, "showForm")
	End If
End Sub

Sub lbl_clearBord_MouseEntered (EventData As MouseEvent)
	lbl_clearBord.Color = 0xFFFF0000
End Sub

Sub lbl_clearBord_MouseExited (EventData As MouseEvent)
	lbl_clearBord.Color = 0xFF088F00
End Sub

Sub lbl_reset_MouseEntered (EventData As MouseEvent)
	lbl_reset.Color =  0xFF69D79A
	lbl_reset.TextColor = 0xFFFFFF00
End Sub

Sub lbl_reset_MouseExited (EventData As MouseEvent)
	If lbl_reset.Text = "Nieuwe Partij" Then
		lbl_reset.Color = 0xFFFF0000
		lbl_reset.Color = 0xFF205502
		lbl_reset.TextColor = 0xFFFFFFFF
	Else
		lbl_reset.Color = 0xFFFF0000
		lbl_reset.TextColor = 0xFFFFFFFF
	End If
End Sub

Sub lbl_reset_MouseReleased (EventData As MouseEvent)
	inactivecls.lastClick = DateTime.Now
	If lbl_reset.Text = "Nieuwe Partij" Then
		nieuwe_partij.showForm
		'frm.Close
	else If lbl_reset.Text = "Partij Beëindigen" Then
		If CallSub(nieuwe_partij, "TestResponse") = "1" Then
			'CallSub(einde_partij, "show")
			einde_partij.show
		Else
			einde_partij.show
			'CallSub(einde_partij, "show")
		End If
	End If
	
End Sub

Sub eindePartij
	clsGameTime.tmrEnable(False)
	lbl_reset.Text = "Nieuwe Partij"
	lbl_reset.Color = 0xFF205502
'	resetBoard
	If File.Exists(PartijFolder, "currscore.json")  Then
		File.Delete(PartijFolder, "currscore.json")
		Sleep(300)
	End If
	disableControls
	
	If mqttPubDataBord.connected Then
		mqttPubDataBord.SendMessage("game-ended", "game-ended")
	End If
End Sub

Sub lbl_close_MouseReleased (EventData As MouseEvent)
	'ExitApplication
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
	
	Try
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
	Catch
		func.WriteErrorToFile("lastErr.txt", LastException)
		File.WriteString(File.DirApp,"lastErr.txt", LastException.Message)
	End Try
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
	'lbl_config_update.Visible = True
	lbl_config_update.SetAlphaAnimated(0, 1)
	Sleep(5000)
	lbl_config_update.SetAlphaAnimated(0, 0)
	'lbl_config_update.Visible = False
End Sub

Sub useDigitalFont(useDigital As Boolean)
	Dim fsCarom, fsMake, fsInnings As Int
	
	If useDigital Then
		fsCarom = 300'350
		fsMake = 200'225
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
	
	Dim teMaken As String
	lbl_player_one_name.Text = data.Get(0)
	funcScorebord.p1ToMake = data.Get(1)
	teMaken =  func.padString(data.Get(1), "0", 0, 3)
	lbl_player_one_make_100.Text	= teMaken.SubString2(0,1)
	lbl_player_one_make_10.Text		= teMaken.SubString2(1,2)
	lbl_player_one_make_1.Text		= teMaken.SubString2(2,3)
		
	lbl_player_two_name.Text = data.Get(2)
	teMaken =  func.padString(data.Get(3), "0", 0, 3)
	funcScorebord.p2ToMake = data.Get(3)
	lbl_player_two_make_100.Text	= teMaken.SubString2(0,1)
	lbl_player_two_make_10.Text		= teMaken.SubString2(1,2)
	lbl_player_two_make_1.Text		= teMaken.SubString2(2,3)
	
	lbl_spel_soort.Text = data.get(4)
End Sub


Sub lbl_player_two_hs_MouseReleased (EventData As MouseEvent)
	lbl_player_two_hs.Text = func.setHs(lbl_player_two_hs.Text, EventData.PrimaryButtonPressed)
End Sub

Sub lbl_player_one_hs_MouseReleased (EventData As MouseEvent)
	lbl_player_one_hs.Text = func.setHs(lbl_player_one_hs.Text, EventData.PrimaryButtonPressed)
End Sub

Sub lbl_img_sponsore_MouseReleased (EventData As MouseEvent)
	If newGame = False Then Return
	
	CSSUtils.SetBackgroundImage(lbl_img_sponsore, "",parseConfig.getAppImagePath & "biljarter.png")
	lbl_player_two_name.Enabled = True
	lbl_player_one_name.Enabled = True
	lbl_innings.Enabled = True
	lbl_player_one_hs.Enabled = True
	lbl_player_two_hs.Enabled = True
	
	clsGameTime.setGameStart
	clsGameTime.tmrEnable(True)
	If lbl_player_one_make_1.Text+lbl_player_one_make_10.Text+lbl_player_one_make_100.Text = 0 Then
		lbl_player_one_perc.Text = "n.v.t."
	End If
	If lbl_player_two_make_1.Text+lbl_player_two_make_10.Text+lbl_player_two_make_100.Text = 0 Then
		lbl_player_two_perc.Text = "n.v.t."
	End If
	
	
'	enableScoreAndMake
	setP1Name
	newGame = False
	lbl_reset.Text = "Partij Beëindigen"
	lbl_reset.Color = 0xFFFF0000
	
	If File.Exists(PartijFolder, "currscore.json")  Then
		'File.Copy(PartijFolder,"currscore.json", PartijFolder,$"${DateTime.Now}.json"$)
		File.Delete(PartijFolder, "currscore.json")
		Sleep(200)
	End If
'PETER	
	File.Copy(File.DirAssets, "score.json", PartijFolder, "currscore.json")
	
	Sleep(200)
	WriteScoreJson
End Sub

Sub lbl_img_sponsore_MouseMoved (EventData As MouseEvent)
	If newGame Then
		CSSUtils.SetBackgroundImage(lbl_img_sponsore, "",parseConfig.getAppImagePath & "begin_partij.png")
	End If
End Sub

Sub lbl_img_sponsore_MouseExited (EventData As MouseEvent)
	If newGame Then
		CSSUtils.SetBackgroundImage(lbl_img_sponsore, "",parseConfig.getAppImagePath & "start_partij.png")
	End If
End Sub


Sub showHideGameTime(enable As Boolean)
	Dim op As Double
	frm.RootPane.MouseCursor = fx.Cursors.NONE
	If enable = True Then
		op = 1.0
	Else
		op = 0.0
	End If
	
	lbl_partij_duur_header.SetAlphaAnimated(2500, op)
	lbl_partij_duur.SetAlphaAnimated(2500, op)
	Sleep(2500)
	func.SetCustomCursor1(File.DirAssets, "mouse.png", 370, 370, frm.RootPane)
	
End Sub


Sub lbl_player_one_name_MouseEntered (EventData As MouseEvent)
	Dim lbl As B4XView = Sender
	'lbl_player_one_name.SetColorAndBorder(lbl_player_one_name.Color, 10dip, 0xFFff0000, 0dip)
	lbl.SetColorAndBorder(lbl.Color, 10dip, 0xFFff0000, 0dip)
End Sub

Sub lbl_player_one_name_MouseExited (EventData As MouseEvent)
	Dim lbl As B4XView = Sender
	'lbl_player_one_name.SetColorAndBorder(lbl_player_one_name.Color, 0dip, 0xFFFF0000, 0dip)
	lbl.SetColorAndBorder(lbl.Color, 0dip, 0xFFFF0000, 0dip)
End Sub

Sub lbl_player_two_name_MouseEntered (EventData As MouseEvent)
	lbl_player_two_name.SetColorAndBorder(lbl_player_two_name.Color, 10dip, 0xFFff0000, 0dip)
End Sub

Sub lbl_player_two_name_MouseExited (EventData As MouseEvent)
	lbl_player_two_name.SetColorAndBorder(lbl_player_two_name.Color, 0dip, 0xFFFF0000, 0dip)
End Sub

Sub disabeClockFunction(enable As Boolean)
	lbl_clock.Visible = enable
	lbl_date_time_dag.Visible = enable
	lbl_date_time_date.Visible = enable
	clsTmr.enableClock(enable)
End Sub

Sub lbl_beurten_header_MouseReleased (EventData As MouseEvent)
	
	
	
End Sub

Sub lbl_partij_duur_MouseReleased (EventData As MouseEvent)
	If lbl_reset.Text <> "Partij Beëindigen" Then Return
	If funcScorebord.kraai = 0 Then Return
	If lbl_partij_duur.Visible = False Then Return

	CSSUtils.SetBackgroundImage(lbl_img_sponsore, File.DirAssets, "ODT0.gif")
	Sleep(3000)
	CSSUtils.SetBackgroundImage(lbl_img_sponsore, "",parseConfig.getAppImagePath & "biljarter.png")
End Sub

Sub lbl_player_two_moyenne_MouseReleased (EventData As MouseEvent)
	If funcScorebord.kraai = 1 Then
		funcScorebord.kraai = 0
		Else
		funcScorebord.kraai = 1
			
	End If
End Sub

Sub WriteScoreJson
	If newGame Then Return
	
	Dim Scr, strAanStoot As String
	Try
	
		If File.Exists(PartijFolder, "currscore.json") = False Then
			File.Copy(File.DirAssets, "score.json", PartijFolder, "currscore.json")
			Sleep(300)
		End If
		Scr = File.ReadString(PartijFolder, "currscore.json")
	
		strAanStoot = aanStoot
		parser.Initialize(Scr)

		Dim root As Map = parser.NextObject
		Dim score As Map = root.Get("score")
		Dim p1 As Map = score.Get("p1")
		Dim p2 As Map = score.Get("p2")
		Dim aan_stoot As Map = score.Get("aan_stoot")
		Dim beurten As Map = score.Get("beurten")
		Dim spelduur As Map = score.Get("spelduur")
		Dim autoInnings As Map = score.Get("autoinnings")
	
	
		p1.Put("caram", $"${lbl_player_one_100.Text}${lbl_player_one_10.Text}${lbl_player_one_1.Text}"$)
		p1.Put("naam", lbl_player_one_name.Text)
		p1.Put("maken", $"${lbl_player_one_make_100.Text}${lbl_player_one_make_10.Text}${lbl_player_one_make_1.Text}"$)
	
		p2.Put("caram", $"${lbl_player_two_100.Text}${lbl_player_two_10.Text}${lbl_player_two_1.Text}"$)
		p2.Put("naam", lbl_player_two_name.Text)
		p2.Put("maken", $"${lbl_player_two_make_100.Text}${lbl_player_two_make_10.Text}${lbl_player_two_make_1.Text}"$)
	
		beurten.Put("aantal", lbl_innings.Text)
		aan_stoot.Put("speler", strAanStoot)
		spelduur.Put("tijd", lbl_partij_duur.Text)
		If funcScorebord.autoInnings = True Then
			autoInnings.Put("value", "1")
		Else
			autoInnings.Put("value", "0")
		End If
	
		Dim JSONGenerator As JSONGenerator
		JSONGenerator.Initialize(root)
	
'		Log($"currscore : $Time{DateTime.Now}"$)
		File.WriteString(PartijFolder, "currscore.json", JSONGenerator.ToPrettyString(2))
'		Log($"currscore : $Time{DateTime.Now}"$)
		
		Sleep(100)

		If mqttPubDataBord.connected Then
			CreateJsonFormMqttClient
		End If
	
	Catch
		func.WriteErrorToFile("errLastException.txt", LastException)
	'	File.WriteString(File.DirApp, "errLastException.txt", LastException)
	End Try
End Sub


Sub CreateJsonFormMqttClient
	Dim template, strAanStoot As String
		
	strAanStoot = aanStoot
	
	template = File.ReadString(File.DirAssets, "share_score.json")
	parser.Initialize(template)
	
	Dim root As Map = parser.NextObject
	Dim score As Map = root.Get("score")
	Dim p1 As Map = score.Get("p1")
	Dim p2 As Map = score.Get("p2")
	Dim aan_stoot As Map = score.Get("aan_stoot")
	Dim beurten As Map = score.Get("beurten")
	Dim spelduur As Map = score.Get("spelduur")
	Dim autoInnings As Map = score.Get("autoinnings")
	
	p1.Put("caram", $"${lbl_player_one_100.Text}${lbl_player_one_10.Text}${lbl_player_one_1.Text}"$)
	p1.Put("naam", lbl_player_one_name.Text)
	p1.Put("maken", $"${lbl_player_one_make_100.Text}${lbl_player_one_make_10.Text}${lbl_player_one_make_1.Text}"$)
	p1.Put("moyenne", lbl_player_one_moyenne.Text)
	p1.Put("percentage", lbl_player_one_perc.Text)
	
	p2.Put("caram", $"${lbl_player_two_100.Text}${lbl_player_two_10.Text}${lbl_player_two_1.Text}"$)
	p2.Put("naam", lbl_player_two_name.Text)
	p2.Put("maken", $"${lbl_player_two_make_100.Text}${lbl_player_two_make_10.Text}${lbl_player_two_make_1.Text}"$)
	p2.Put("moyenne", lbl_player_two_moyenne.Text)
	p2.Put("percentage", lbl_player_two_perc.Text)
	
	beurten.Put("aantal", lbl_innings.Text)
	aan_stoot.Put("speler", strAanStoot)
	spelduur.Put("tijd", lbl_partij_duur.Text)
	autoInnings.Put("value", "0")
	
	Dim JSONGenerator As JSONGenerator
	JSONGenerator.Initialize(root)
	
	'bordServer.SendMessage(JSONGenerator.ToPrettyString(2))
	mqttPubDataBord.SendMessage(JSONGenerator.ToPrettyString(2), mqttPubDataBord.pubName)
	'mqttBordData.SendMessage(JSONGenerator.ToPrettyString(2))
	
End Sub

Sub CheckGameStop
	'Log($"PARTIJ FOLDER ${PartijFolder}"$)
	If File.Exists(PartijFolder, "currscore.json") Then
		Dim Scr, maken, caram="" As String
		Scr = File.ReadString(PartijFolder, "currscore.json")
	
		parser.Initialize(Scr)

		Dim root As Map = parser.NextObject
		Dim score As Map = root.Get("score")
		Dim p1 As Map = score.Get("p1")
		Dim p2 As Map = score.Get("p2")
		Dim aan_stoot As Map = score.Get("aan_stoot")
		Dim beurten As Map = score.Get("beurten")
		Dim spelduur As Map = score.Get("spelduur")
		Dim autoInnings As Map = score.Get("autoinnings")
		Dim nName As String = p1.Get("naam")
		'LogDebug("NAAM " & nName)
		If p1.Get("naam") = Null Then
			Return
		End If
		funcScorebord.innings = beurten.Get("aantal")
		
		maken = p1.Get("maken")
		caram = p1.Get("caram")
		funcScorebord.scorePlayerOne = caram
		funcScorebord.p1ToMake = maken
		lbl_player_one_name.Text = p1.Get("naam")
		lbl_player_one_make_100.Text = maken.SubString2(0,1)
		lbl_player_one_make_10.Text = maken.SubString2(1,2)
		lbl_player_one_make_1.Text = maken.SubString2(2,3)
		lbl_player_one_100.Text = caram.SubString2(0,1)
		lbl_player_one_10.Text = caram.SubString2(1,2)
		lbl_player_one_1.Text = caram.SubString2(2,3)
		
		maken = p2.Get("maken")
		caram = p2.Get("caram")
		funcScorebord.scorePlayerTwo = caram
		funcScorebord.p2ToMake = maken
		lbl_player_two_name.Text = p2.Get("naam")
		lbl_player_two_make_100.Text = maken.SubString2(0,1)
		lbl_player_two_make_10.Text = maken.SubString2(1,2)
		lbl_player_two_make_1.Text = maken.SubString2(2,3)
		lbl_player_two_100.Text = caram.SubString2(0,1)
		lbl_player_two_10.Text = caram.SubString2(1,2)
		lbl_player_two_1.Text = caram.SubString2(2,3)
		
		lbl_innings.Text = beurten.Get("aantal")
		lbl_partij_duur.Text = spelduur.Get("tijd")
		
		'SPLIT DUUR AT : !!!!
		Dim splitDuur() As String = Regex.Split(":", lbl_partij_duur.Text)
		Dim duurHrs As String = splitDuur(0)
		Dim duurMin As String = splitDuur(1)
		
		clsGameTime.hours = duurHrs 'lbl_partij_duur.Text.SubString2(0,2)
		clsGameTime.minutes = duurMin 'lbl_partij_duur.Text.SubString2(3,5)
		If aan_stoot.Get("speler") = "1" Then
			setP1Name
		Else
			setP2Name
		End If
		funcScorebord.inningSet = 0
		lbl_player_one_name.Enabled = True
		lbl_player_two_name.Enabled = True
		lbl_innings.Enabled = True
		
		If autoInnings.Get("value") = "1" Then
			funcScorebord.autoInnings = True
		Else
			funcScorebord.autoInnings = False
		End If
		
		funcScorebord.calcScorePlayerOne(0, True)
		funcScorebord.calcScorePlayerTwo(0, True)
		lbl_reset.Text = "Partij Beëindigen"
		lbl_reset.Color = 0xFFFF0000
		lbl_reset.TextColor = 0xFFFFFFFF
		clsGameTime.tmrEnable(True)
	Else
		resetBoard
	End If
End Sub

Public Sub DisablePromoTimer(enable As Boolean)
	inactivecls.enablePromote(enable)
End Sub

Sub lbl_innings_MouseEntered (EventData As MouseEvent)
	lbl_innings.Style ="-fx-background-color: #FF00FF; -fx-text-fill: yellow;"
End Sub

Sub lbl_innings_MouseExited (EventData As MouseEvent)
	lbl_innings.Style ="-fx-background-color: #000053; -fx-text-fill: yellow;"
End Sub


Sub SetBrokerIcon(brokerAlive As Boolean)
	
	If brokerAlive Then
		lblBroker.Visible = True
		lblBrokerDead.Visible = False
	Else
		lblBrokerDead.Visible = True
		lblBroker.Visible = False	
	End If
End Sub

Sub StartStopClientServer
	
	
	Dim parser As JSONParser
	parser.Initialize(File.ReadString(func.appPath, "mqtt.conf"))
'	Dim root As Map = parser.NextObject
'	Dim mqttClients As Map = root.Get("mqttClients")
''	Dim server As String = mqttClients.Get("server")
'	Dim enabled As String = mqttClients.Get("enabled")
'	Dim name As String = mqttClients.Get("name")
'	Dim base As String = mqttClients.Get("base")
	
	Dim root As Map = parser.NextObject
	Dim mqttClients As List = root.Get("mqttClients")
	For Each colmqttClients As Map In mqttClients
		Dim server As String = colmqttClients.Get("server")
		Dim name As String = colmqttClients.Get("name")
		Dim enabled As String = colmqttClients.Get("enabled")
		Dim base As String = colmqttClients.Get("base")
	Next
	
	mqttEnabled = enabled = "1"
	func.bordName = name.ToLowerCase
	func.mqttbase = $"${base}/"$
	funcScorebord.bordName = name.ToLowerCase
	funcScorebord.bordDisplayName = name
	mqttPubDataBord.PrepPubName
	mqttBordPub.SetPub
	mqttBordPub.PrepTopicName(name.ToLowerCase)
	
	MqttConnected
End Sub


Sub pn_promote_MouseClicked (EventData As MouseEvent)
	Try
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
	Catch
		File.WriteString(File.DirApp,"lastErr.txt", LastException.Message)
	End Try
End Sub

Sub mqttGetPlayers As List
	Dim lstPlayer As List
	Dim p1Carom As String = $"${lbl_player_one_100.Text}${lbl_player_one_10.Text}${lbl_player_one_1.Text}"$
	Dim p2Carom As String = $"${lbl_player_two_100.Text}${lbl_player_two_10.Text}${lbl_player_two_1.Text}"$
	
	lstPlayer.Initialize
	
	lstPlayer.AddAll(Array As String(lbl_player_one_name.Text, lbl_player_two_name.Text, p1Carom, p2Carom, aanStoot))
	Return lstPlayer
End Sub

Sub SetPlayerNames
	Dim ser As B4XSerializator
	Dim playerData As String =ser.ConvertBytesToObject(File.ReadBytes(parseConfig.getAppPath, "player-config"))
	Dim parser As JSONParser
	parser.Initialize(playerData)
	Dim root As Map = parser.NextObject
	Dim player As Map = root.Get("player")
	Dim p2Make As String = player.Get("p2Make")
	Dim p2Name As String = player.Get("p2Name")
	Dim p1Name As String = player.Get("p1Name")
	Dim p1Make As String = player.Get("p1Make")
	
	lbl_player_one_name.Text = func.splitNaam(p1Name)
	lbl_player_two_name.Text = func.splitNaam(p2Name)
	
	lbl_player_one_make_100.Text = p1Make.SubString2(0,1)
	lbl_player_one_make_10.Text = p1Make.SubString2(1,2)
	lbl_player_one_make_1.Text = p1Make.SubString2(2,3)
	
	lbl_player_two_make_100.Text = p2Make.SubString2(0,1)
	lbl_player_two_make_10.Text = p2Make.SubString2(1,2)
	lbl_player_two_make_1.Text = p2Make.SubString2(2,3)
End Sub

Sub GetCurrentPlayerNames
	Dim p1Name, p2Name, p1Make, p2Make As String
	
	p1Name = lbl_player_one_name.Text.Replace(CRLF, " ")
	p2Name =  lbl_player_two_name.Text.Replace(CRLF, " ")
	
	p1Make = $"${lbl_player_one_make_100.Text}${lbl_player_one_make_10.Text}${lbl_player_one_make_1.Text}"$
	p2Make = $"${lbl_player_two_make_100.Text}${lbl_player_two_make_10.Text}${lbl_player_two_make_1.Text}"$
	mqttPubDataBord.SendMessage("requestPlayerData", $"${p1Name}|${p1Make}|${p2Name}|${p2Make}"$) 
End Sub

Sub lbl_clearBord_MouseReleased (EventData As MouseEvent)
	pn_a.SetLayoutAnimated(0, 343, 200, pn_a.Width, pn_a.Height)
End Sub

Sub btnResetGameCancel_MouseReleased (EventData As MouseEvent)
	HideResetPanel
End Sub

Sub btnResetGameReset_MouseReleased (EventData As MouseEvent)
	HideResetPanel
	clsGameTime.hours = 0
	clsGameTime.minutes = 0
	resetBoard
	setNewGame(True)
End Sub

Sub HideResetPanel
	pn_a.SetLayoutAnimated(0, 940, 1150, pn_a.Width, pn_a.Height)
End Sub