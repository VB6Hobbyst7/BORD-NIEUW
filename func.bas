B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
	Private regexStr As StringBuilder
	
	Public timeLastClick As Long = 0
	
	Public hasInternetAccess As Boolean = False
	Public scorePlayerOne, scorePlayerTwo As Int
	Public innigs, inngSet, make, playerOneHs = 0, playerTwoHs = 0, score As Int
	Public playerOneToMake = 0, playerTwoToMake = 0, p1HsTemp = 0, p2HsTemp = 0 As Int
	Public lblInnings, lbl_player_one_hs, lbl_player_two_hs As Label
	Public p1_1, p1_10, p1_100, p1_1000, p1_moyenne As Label
	Public p2_1, p2_10, p2_100, p2_1000, p2_moyenne As Label
	Public p1_progress, p2_progress As Float
	Public p1_progressBar, p2_progressBar As B4XProgressBar
	Dim txtScore As String
End Sub


Public Sub testNumber(oldStringToTest As String, newStringToTest As String) As String
	Dim stringToTest As String
	
	If newStringToTest.Length = 1 Then
		stringToTest = newStringToTest
	Else
		stringToTest = 	newStringToTest.Replace(oldStringToTest, "")
	End If
	
	regexStr.Initialize
	regexStr.Append("[0-9]*\.[0-9]*|[0-9]*")
	
	If Regex.IsMatch(regexStr.ToString,stringToTest) = True Then
		Return newStringToTest	
	Else
		Return oldStringToTest
	End If
	
End Sub


Public Sub setP1CaromLables(lst As List)
'	p1_1000		= lst.Get(3)
	p1_100		= lst.Get(2)
	p1_10		= lst.Get(1)
	p1_1		= lst.Get(0)
	p1_moyenne	= lst.Get(3)
	p1_progressBar = lst.Get(4)
End Sub

Public Sub setP2CaromLables(lst As List)
'	p2_1000		= lst.Get(3)
	p2_100		= lst.Get(2)
	p2_10		= lst.Get(1)
	p2_1		= lst.Get(0)
	p2_moyenne	= lst.Get(3)
	p2_progressBar	= lst.Get(4)
End Sub

Public Sub setFont(lbl As Label, size As Int)
	Dim jo As JavaObject=lbl
	jo.runMethod("setFont",Array(fx.LoadFont(File.DirAssets,"digital-7 (mono).ttf", size)))
End Sub

'padText e.g. "9", padChar e.g. "0", padSide 0=left 1=right, padCount e.g. 2
Public Sub padString(padText As String ,padChr As String, padSide As Int, padCount As Int) As String
	Dim padStr As String
	
	If padText.Length = padCount Then
		Return padText
	End If
	
	For i = 1 To padCount-padText.Length
		padStr = padStr&padChr
	Next
	
	If padSide = 0 Then
		Return padStr&padText
	Else
		Return padText&padStr
	End If
	
End Sub


Sub calcScorePlayerOne(points As Int)
'	Dim inning As Int
	CallSubDelayed(scorebord, "lastClick")
	If score > 9999 Or score <= -1 Then
		Return
	End If
	processHs("p2")
	
	p1HsTemp	= p1HsTemp + points
	score		= p1_100.Text&p1_10.Text&p1_1.Text
	score		= score+points
	
	If score > 999 Or score <= -1 Then
		Return
	End If
	
	If lblInnings.Text = "000" Then
		lblInnings.Text	= "001"
		innigs			= 1
		inngSet			= 1
	End If
	
	If inngSet <> 1 And score <> scorePlayerOne Then
		innigs = lblInnings.Text
		innigs = innigs + 1
		lblInnings.Text = padString(innigs, "0", 0, 3)
		inngSet = 1
	End If
	
	scorePlayerOne = score
	
	txtScore = padString(score, "0", 0, 4)

'	p1_1000.Text	= txtScore.SubString2(0,1)
	p1_100.Text		= txtScore.SubString2(1,2)
	p1_10.Text		= txtScore.SubString2(2,3)
	p1_1.Text		= txtScore.SubString2(3,4)

	p1_moyenne.Text = NumberFormat2((scorePlayerOne/innigs),1,3,3,False)
	
	If playerOneToMake > 0 Then
		CallSub2(scorebord, "playerOnePerc", NumberFormat2((scorePlayerOne/playerOneToMake)*100,1,2,2,False)&"%")
		p1_progress = (scorePlayerOne/playerOneToMake)*100
	End If
	setProgress(p1_progressBar, p1_progress)
	checkMatchWon("p1")
	
End Sub

Sub calcScorePlayertwo(points As Int)
	CallSubDelayed(scorebord, "lastClick")
	inngSet = 0
	processHs("p1")
	p2HsTemp = p2HsTemp + points
	
	score = p2_100.Text&p2_10.Text&p2_1.Text
	score = score+points
	
	If score > 999 Or score <= -1 Then
		Return
	End If
	
	If lblInnings.Text = "000" Then
		lblInnings.Text	= "001"
		innigs			= 1
		inngSet			= 1
	End If
	
	playerTwoHs		= scorePlayerTwo - playerTwoHs
	scorePlayerTwo	= score
	txtScore		= padString(score, "0", 0, 4)
	
	'p2_1000.Text	= txtScore.SubString2(0,1)
	p2_100.Text		= txtScore.SubString2(1,2)
	p2_10.Text		= txtScore.SubString2(2,3)
	p2_1.Text		= txtScore.SubString2(3,4)
	p2_moyenne.Text = NumberFormat2((scorePlayerTwo/innigs),1,3,3,False)
	
	If playerTwoToMake > 0 Then
		CallSub2(scorebord, "playerTwoPerc", NumberFormat2((scorePlayerTwo/playerTwoToMake)*100,1,2,2,False)&"%")
		p2_progress = (scorePlayerTwo/playerTwoToMake)*100
	End If
	setProgress(p2_progressBar, p2_progress)
	checkMatchWon("p2")
	
End Sub

Sub calcMoyenne(mPlayerOne As Label, mPlayerTwo As Label)
	mPlayerOne.Text = NumberFormat2((scorePlayerOne/innigs),1,3,3,False)
	mPlayerTwo.Text = NumberFormat2((scorePlayerTwo/innigs),1,3,3,False)
End Sub

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
	
	
	strMaker	= padString(make, "0", 0, 3)
	lbl100.Text = strMaker.SubString2(0,1)
	lbl10.Text	= strMaker.SubString2(1,2)
	lbl1.Text	= strMaker.SubString2(2,3)
	
	playerOneToMake = make
	p1_progress = (scorePlayerOne/playerOneToMake)*100
	setProgress(p1_progressBar, p1_progress)
	CallSub2(scorebord, "playerOnePerc", NumberFormat2((scorePlayerOne/playerOneToMake)*100,1,2,2,False)&"%")
End Sub

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
	
	
	strMaker	= padString(make, "0", 0, 3)
	lbl100.Text = strMaker.SubString2(0,1)
	lbl10.Text	= strMaker.SubString2(1,2)
	lbl1.Text	= strMaker.SubString2(2,3)
	
	playerTwoToMake = make
	p2_progress = (scorePlayerTwo/playerTwoToMake)*100
	setProgress(p1_progressBar, p1_progress)
	CallSub2(scorebord, "playerTwoPerc", NumberFormat2((scorePlayerTwo/playerTwoToMake)*100,1,2,2,False)&"%")
End Sub

Sub processHs(player As String)
	If player = "p1" Then
		If p1HsTemp > 0 And p1HsTemp > playerOneHs Then
			playerOneHs = p1HsTemp
			p1HsTemp = 0
			lbl_player_one_hs.Text = padString(playerOneHs, "0", 0, 3)
'			Log($"player 1 hs is ${playerOneHs}"$)
		End If
	End If

	If player = "p2" Then
		If p2HsTemp > 0 And p2HsTemp > playerTwoHs Then
			playerTwoHs = p2HsTemp
			p2HsTemp = 0
			lbl_player_two_hs.Text = padString(playerTwoHs, "0", 0, 3)
'			Log($"player 2 hs is ${playerTwoHs}"$)
		End If
	End If
	
	If player = "all" Then
		If p1HsTemp > 0 And p1HsTemp > playerOneHs Then
			playerOneHs = p1HsTemp
			p1HsTemp = 0
			lbl_player_one_hs.Text = padString(playerOneHs, "0", 0, 3)
'			Log($"player 1 hs is ${playerOneHs}"$)
		End If
		
		
		If p2HsTemp > 0 And p2HsTemp > playerTwoHs Then
			playerTwoHs = p2HsTemp
			p2HsTemp = 0
			lbl_player_two_hs.Text = padString(playerTwoHs, "0", 0, 3)
'			Log($"player 2 hs is ${playerTwoHs}"$)
		End If
	End If
	
End Sub


Sub checkMatchWon(player As String)
	If player = "p1" Then
		CallSub(scorebord, "checkMatchWonP1")
	End If
	
	If player = "p2" Then
		CallSub(scorebord, "checkMatchWonP2")
	End If
End Sub


' Example: SetFormCursor(MainForm, "arrowup.png")
Sub SetFormCursor(frm As Form, imagefile As String)
	Dim img As Image
	img.Initialize(File.DirAssets, imagefile)
	Dim joImageCursor As JavaObject
	joImageCursor.InitializeNewInstance("javafx.scene.ImageCursor", Array(img))
	Dim joCursor As JavaObject = frm.RootPane
	joCursor.RunMethod("setCursor", Array(joImageCursor))
End Sub

Sub Animacao_Rotacao (v As B4XView, duration As Int, degrees As Int)
	v.SetRotationAnimated(duration, degrees)
	Sleep(duration + 20) '+20 to make sure that the new value is set after animation completes.
	v.Rotation = 0
End Sub

'Sub setVisibleAnimated(v As B4XView, duration As Int, show As Boolean)
'	v.SetVisibleAnimated(duration, show)
'	Sleep(duration + 20) '+20 to make sure that the new value is set after animation completes.
'End Sub

'Sub RotateNode(n As Node, Degree As Double)
'	Dim jo As JavaObject = n
'	jo.RunMethod("setRotate", Array(Degree))
'End Sub

Sub setProgress(v As B4XProgressBar, progress As Float)
	
	v.Progress = progress
'	Log(progress)
	
End Sub

Sub caromLabelCss(lbl As Label, style As String)
	lbl.StyleClasses.Add(style)
End Sub

Sub setNumberCss(lbl As Label)
	CSSUtils.SetStyleProperty(lbl, "-fx-background-color",  "linear-gradient(to bottom,  #cfe7fa 0%,#6393c1 100%)")
	CSSUtils.SetStyleProperty(lbl, "-fx-background-radius", "3,2,1")
End Sub