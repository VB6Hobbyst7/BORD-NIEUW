B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public timeLastClick As Long = 0
	Public setNieuwePartij As Boolean = True
	Public autoInnings As Boolean = True
	Public beurtenPartij, gameStarted As Boolean = False
	Public beurtenPartijBeurten As Int
	Public kraai As Int = 0
	Public useDigitalFont, isBordClient, bordIsRetro As Boolean
	Public useYellowFont As Boolean
	Public error, bordName, bordDisplayName As String
	Public BordVersion As String = "v1.6.0-082020"
	
	Public newGameInitialized As Boolean = False
	Public scorePlayerOne, scorePlayerTwo As Int
	
	Public p1Innings, p2Innings As Int = 0
	
	Public innings, prevInnings = 1, inningSet, make, p1Hs = 0, p2Hs = 0, score As Int
	Public p1ToMake = 0, p2ToMake = 0, p1HsTemp = 0, p2HsTemp = 0 As Int
	Public lblInnings, lbl_player_one_hs, lbl_player_two_hs As Label
	Public p1_1, p1_10, p1_100,  p1_moyenne As Label
	Public p2_1, p2_10, p2_100, p2_moyenne As Label
	Public p1_progress, p2_progress As Float
	Public p1_progressBar, p2_progressBar As B4XProgressBar
	Public loc As String = "/home/pi/.config/"
	Public ext As String = ".conf"
	Public ixt As String = "pi"
	Dim txtScore As String
End Sub


'SET REFERENCE TO SCOREBORD VIEWS
Public Sub setP1CaromLables(lst As List)
	p1_100		= lst.Get(2)
	p1_10		= lst.Get(1)
	p1_1		= lst.Get(0)
	p1_moyenne	= lst.Get(3)
	p1_progressBar = lst.Get(4)
End Sub

Public Sub setP2CaromLables(lst As List)
	p2_100		= lst.Get(2)
	p2_10		= lst.Get(1)
	p2_1		= lst.Get(0)
	p2_moyenne	= lst.Get(3)
	p2_progressBar	= lst.Get(4)
End Sub
'SET REFERENCE TO SCOREBORD VIEWS

'HANDLE P1 SCORE
Sub calcScorePlayerOne(points As Int, leftMouse As Boolean)
	If leftMouse = False Then
		points = -Abs(points)
	End If
	
	Dim P1Score As Int
	CallSubDelayed(scorebord, "lastClick")
	
	P1Score		= p1_100.Text&p1_10.Text&p1_1.Text
	P1Score		= P1Score+points
	
	If P1Score < p1Hs And p1Hs > 0 Then
		p1Hs = p1Hs -1
		lbl_player_one_hs.Text = func.padString(p1Hs, "0", 0, 3)
	End If
	
	'NO SCORE BELOW 0
	If P1Score < 0 Then
		P1Score = p1_100.Text&p1_10.Text&p1_1.Text
	End If
	
	If P1Score > 9999 Then
		Return
	End If
	
	If P1Score < 0 Then
		p1Hs = 0
		p1HsTemp = 0
		Return
	End If
	
	p1HsTemp	= p1HsTemp + points
	
	'TEST CODE
	If p1HsTemp > p1Hs Then
		lbl_player_one_hs.Text = func.padString(p1HsTemp, "0", 0, 3)
	End If
	'TEST CODE
	
'	If lblInnings.Text = "000" And autoInnings Then
'		lblInnings.Text	= "001"
'		innings	= 1
'		inningSet = 1
'	End If
	
	scorePlayerOne = P1Score
	txtScore = func.padString(P1Score, "0", 0, 4)

	p1_100.Text		= txtScore.SubString2(1,2)
	p1_10.Text		= txtScore.SubString2(2,3)
	p1_1.Text		= txtScore.SubString2(3,4)

'	p1_moyenne.Text = NumberFormat2((scorePlayerOne/innings),1,3,3,False)
	If innings >= 1 And innings = prevInnings And autoInnings = True Then
		p1_moyenne.Text = func.getUnroundedMoyenne(NumberFormat2((scorePlayerOne/innings),1,4,4,False))
		Else
		p1_moyenne.Text = func.getUnroundedMoyenne(NumberFormat2((scorePlayerOne/innings),1,4,4,False))
			
	End If
	
	If p1ToMake > 0 Then
		CallSub2(scorebord, "playerOnePerc", NumberFormat2((scorePlayerOne/p1ToMake)*100,1,2,2,False)&"%")
		p1_progress = (scorePlayerOne/p1ToMake)*100
	End If
	setProgress(p1_progressBar, p1_progress)
'	checkMatchWon("p1")
	
End Sub
'HANDLE P1 SCORE

'CALC MOYENNE P1
Sub calcMoyenneP1
	'p1_moyenne.Text = NumberFormat2((scorePlayerOne/innings),1,3,3,False)
	If innings < 1 Then
		p1_moyenne.Text = "0.000"
		Return
	End If
	
	p1_moyenne.Text = func.getUnroundedMoyenne(NumberFormat2((scorePlayerOne/innings),1,4,4,False))
	If p1ToMake > 0 Then
		CallSub2(scorebord, "playerOnePerc", NumberFormat2((scorePlayerOne/p1ToMake)*100,1,2,2,False)&"%")
		p1_progress = (scorePlayerOne/p1ToMake)*100
	End If
	setProgress(p1_progressBar, p1_progress)
End Sub


'P1 MAKE
Sub playerOneMake(lbl100 As Label, lbl10 As Label, lbl1 As Label, leftButton As Boolean, number As Int)
	Dim strMaker As String
	make = $"${lbl100.Text}${lbl10.Text}${lbl1.Text}"$
	
	If leftButton Then
		make = make+number
		If make > 999 Then
			Return
		End If
	Else
		make = make-number
		If make < 0 Then
			Return
		End If
	End If
	
	
	strMaker	= func.padString(make, "0", 0, 3)
	lbl100.Text = strMaker.SubString2(0,1)
	lbl10.Text	= strMaker.SubString2(1,2)
	lbl1.Text	= strMaker.SubString2(2,3)
	
	p1ToMake = make
	If p1ToMake > 0 Then
		p1_progress = (scorePlayerOne/p1ToMake)*100
		CallSub2(scorebord, "playerOnePerc", NumberFormat2((scorePlayerOne/p1ToMake)*100,1,2,2,False)&"%")
	Else
		p1_progress = 0
		CallSub2(scorebord, "playerOnePerc", "n.v.t.")
	End If
	setProgress(p1_progressBar, p1_progress)
End Sub
'P1 MAKE


'HANDLE SCORE P2
Sub calcScorePlayerTwo(points As Int, leftMouse As Boolean)
	
	If leftMouse = False Then
		points = -Abs(points)
	End If
	
	Dim P2Score As Int
	CallSubDelayed(scorebord, "lastClick")
	
	P2Score		= p2_100.Text&p2_10.Text&p2_1.Text
	P2Score		= P2Score+points
	
	If P2Score < p2Hs And p2Hs > 0 Then
		p2Hs = p2Hs -1
		lbl_player_two_hs.Text = func.padString(p2Hs, "0", 0, 3)
	End If
	
	'NO SCORE BELOW 0
	If P2Score < 0 Then
		P2Score = p2_100.Text&p2_10.Text&p2_1.Text
	End If
	
	If P2Score > 9999 Then
		Return
	End If
	
	If P2Score < 0 Then
		p2Hs = 0
		p2HsTemp = 0
		Return
	End If
	
	p2HsTemp	= p2HsTemp + points
	
	'TEST CODE
	If p2HsTemp > p2Hs Then
		lbl_player_two_hs.Text = func.padString(p2HsTemp, "0", 0, 3)
	End If
	'TEST CODE
	
	If lblInnings.Text = "000" And autoInnings = True Then
		lblInnings.Text	= "001"
		innings	= 1
		inningSet = 1
	End If
	
	scorePlayerTwo = P2Score
	txtScore = func.padString(P2Score, "0", 0, 4)

	p2_100.Text		= txtScore.SubString2(1,2)
	p2_10.Text		= txtScore.SubString2(2,3)
	p2_1.Text		= txtScore.SubString2(3,4)

'	p2_moyenne.Text = NumberFormat2((scorePlayerTwo/innings),1,3,3,False)
	If innings >= 1 Then
		p2_moyenne.Text =  func.getUnroundedMoyenne(NumberFormat2((scorePlayerTwo/innings),1,4,4,False))
	End If

	If p2ToMake > 0 Then
		CallSub2(scorebord, "playerTwoPerc", NumberFormat2((scorePlayerTwo/p2ToMake)*100,1,2,2,False)&"%")
		p2_progress = (scorePlayerTwo/p2ToMake)*100
	End If
	setProgress(p2_progressBar, p2_progress)
'	checkMatchWon("p2")
	
End Sub
'HANDLE SCORE P2

'CALC MOYENNE P2
Sub calcMoyenneP2
	
	
	
	If innings > 0 Then
		
		p2_moyenne.Text = func.getUnroundedMoyenne(NumberFormat2((scorePlayerTwo/innings),1,4,4,False))
	End If
	If p2ToMake > 0 Then
		CallSub2(scorebord, "playertwoPerc", NumberFormat2((scorePlayerTwo/p2ToMake)*100,1,2,2,False)&"%")
		p2_progress = (scorePlayerTwo/p2ToMake)*100
	End If
	setProgress(p2_progressBar, p2_progress)
End Sub
'CALC MOYENNE P2

'P2 MAKE
Sub playerTwoMake(lbl100 As Label, lbl10 As Label, lbl1 As Label, leftButton As Boolean, number As Int)
	Dim strMaker As String
	make = $"${lbl100.Text}${lbl10.Text}${lbl1.Text}"$
	
	If leftButton Then
		make = make+number
		If make > 999 Then
			Return
		End If
	Else
		make = make-number
		If make < 0 Then
			Return
		End If
	End If
	
	
	strMaker	= func.padString(make, "0", 0, 3)
	lbl100.Text = strMaker.SubString2(0,1)
	lbl10.Text	= strMaker.SubString2(1,2)
	lbl1.Text	= strMaker.SubString2(2,3)
	
	p2ToMake = make
	If p2ToMake > 0 Then
		p2_progress = (scorePlayerTwo/p2ToMake)*100
		setProgress(p2_progressBar, p2_progress)
		CallSub2(scorebord, "playerTwoPerc", NumberFormat2((scorePlayerTwo/p2ToMake)*100,1,2,2,False)&"%")
	Else
		p2_progress = 0
		setProgress(p2_progressBar, p2_progress)
		CallSub2(scorebord, "playerTwoPerc", "n.v.t")
	End If
End Sub
'P2 MAKE

'PROCESS HIGHSCORE
Sub processHs(player As String)
	If player = "p1" Then
		If p1HsTemp > 0 And p1HsTemp > p1Hs Then
			p1Hs = p1HsTemp
			p1HsTemp = 0
			lbl_player_one_hs.Text = func.padString(p1Hs, "0", 0, 3)
'			Log($"player 1 hs is ${p1Hs}"$)
		End If
	End If

	If player = "p2" Then
		If p2HsTemp > 0 And p2HsTemp > p2Hs Then
			p2Hs = p2HsTemp
			p2HsTemp = 0
			lbl_player_two_hs.Text = func.padString(p2Hs, "0", 0, 3)
'			Log($"player 2 hs is ${p2Hs}"$)
		Else
		'	lbl_player_two_hs.Text = func.padString(0, "0", 0, 3)
		End If
	End If
	
	If player = "all" Then
		If p1HsTemp > p1Hs Then
			p1Hs = p1HsTemp
			p1HsTemp = 0
			lbl_player_one_hs.Text = func.padString(p1Hs, "0", 0, 3)
		else If scorePlayerOne < p1Hs Then
			p1Hs = scorePlayerOne
			p1HsTemp = 0
			lbl_player_one_hs.Text = func.padString(p1Hs, "0", 0, 3)
		End If
	End If
		
	If p2HsTemp > p2Hs Then
		p2Hs = p2HsTemp
		p2HsTemp = 0
		lbl_player_two_hs.Text = func.padString(p2Hs, "0", 0, 3)
	Else If scorePlayerTwo < p2Hs Then
		p2Hs = scorePlayerTwo
		p2HsTemp = 0
		lbl_player_two_hs.Text = func.padString(p2Hs, "0", 0, 3)
	End If
End Sub
'PROCESS HIGHSCORE

'WINNER
Sub checkMatchWon(player As String)
	If player = "p1" Then
		CallSub(scorebord, "checkMatchWonP1")
	End If
	
	If player = "p2" Then
		'processHs("p2")
		CallSub(scorebord, "checkMatchWonP2")
	End If
End Sub
'WINNER

'SET PLAYER PROGRESSBAR
Sub setProgress(v As B4XProgressBar, progress As Float)
	v.Progress = progress
End Sub
'SET PLAYER PROGRESSBAR


'USED FROM LBL_INNIING MOUSE RELEASED FROM SCOREBORD
Sub calcMoyenne(mPlayerOne As Label, mPlayerTwo As Label)
	If innings < 1 Then
		mPlayerOne.Text = "0.000"	
		mPlayerTwo.Text = "0.000"	
		Return
	End If
	
	mPlayerOne.Text = NumberFormat2((scorePlayerOne/innings),1,3,3,False)
	mPlayerTwo.Text = NumberFormat2((scorePlayerTwo/innings),1,3,3,False)
End Sub


Public Sub SetProgressBarForMirror
	setProgress(p1_progressBar, p1_progress)
	setProgress(p2_progressBar, p2_progress)
End Sub

Public Sub PlayCrow(dir As String, fileName As String)
	'Log(dir&fileName)
	Dim js As  Shell
	js.Initialize("", "omxplayer", Array As String(dir & fileName))
	js.Run(-1)
'	Dim audioSystem As JavaObject
'	audioSystem.InitializeStatic("javax.sound.sampled.AudioSystem")
'	Dim f As JavaObject
'	f.InitializeNewInstance("java.io.File", Array(dir, fileName))
'	Dim in As JavaObject = audioSystem.RunMethod("getAudioInputStream", Array(f))
'	Dim clip As JavaObject = audioSystem.RunMethod("getClip", Null)
'	clip.RunMethod("open", Array(in))
'	clip.RunMethod("start", Null)
'	in.RunMethod("close", Null)
End Sub

'UNKNOWN
'parseConfig.getAppImagePath & "biljarter.png"




