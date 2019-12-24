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
	Public setNieuwePartij As Boolean = True
	Public hasInternetAccess As Boolean = False
	Public newGameInitialized As Boolean = False
	Public scorePlayerOne, scorePlayerTwo As Int
	
	Public p1Innings, p2Innings As Int = 0
	
	Public innigs, inngSet, make, playerOneHs = 0, playerTwoHs = 0, score As Int
	Public playerOneToMake = 0, playerTwoToMake = 0, p1HsTemp = 0, p2HsTemp = 0 As Int
	Public lblInnings, lbl_player_one_hs, lbl_player_two_hs As Label
	Public p1_1, p1_10, p1_100,  p1_moyenne As Label
	Public p2_1, p2_10, p2_100, p2_moyenne As Label
	Public p1_progress, p2_progress As Float
	Public p1_progressBar, p2_progressBar As B4XProgressBar
	Public os As String
	Dim txtScore As String
End Sub


Public Sub setHs(hs As String, leftMouse As Boolean) As String
	Dim value As Int = hs
	
	If leftMouse Then
		value = value + 1
	Else 	
		value = value - 1
	End If
	
	If value < 0 Then value = 0
	If value > 999 Then value = 999
	
	Return padString(value, "0", 0, 3)
	
	
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

Public Sub setFont(lbl As Label, size As Int, digital As Boolean)
		Dim jo As JavaObject=lbl
	If digital Then
		jo.runMethod("setFont",Array(fx.LoadFont(File.DirAssets,"digital-7 (mono).ttf", size)))
		'jo.runMethod("setFont",Array(fx.LoadFont(File.DirAssets,"Courier Regular.ttf", size)))
	Else
		'lbl.Style = $"-fx-font-family: Arial; -fx-font-size: ${size};"$
		jo.runMethod("setFont",Array(fx.LoadFont(File.DirAssets,"Crasng.ttf", size)))
	End If
End Sub

Public Sub setFontColor(lbl As Label, yellow As Boolean)
	If yellow Then
		lbl.Style = "-fx-text-fill: #ffff00;" '= fx.Colors.From32Bit(0xFFFFFF00)
	Else
		lbl.Style = "-fx-text-fill: #ffffff;"
		'lbl.TextColor = fx.Colors.From32Bit(0xFFFFFFFF)
	End If
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


Sub calcScorePlayerOne(points As Int, leftMouse As Boolean)
	If leftMouse = False Then
		points = -Abs(points)
	End If
	
	Dim P1Score As Int
	CallSubDelayed(scorebord, "lastClick")
'	Dim tmpScore As Int = p1_100.Text&p1_10.Text&p1_1.Text
'	processHs("p2")
	
	P1Score		= p1_100.Text&p1_10.Text&p1_1.Text
	P1Score		= P1Score+points
	
	If P1Score < playerOneHs And playerOneHs > 0 Then
		playerOneHs = playerOneHs -1
		lbl_player_one_hs.Text = padString(playerOneHs, "0", 0, 3)
	End If
	
	'NO SCORE BELOW 0
	If P1Score < 0 Then
	'	Log("SCORE < 0")
		P1Score = p1_100.Text&p1_10.Text&p1_1.Text
	End If
	
	If P1Score > 9999 Then 'Or P1Score <= -1 Then
		Return
	End If
	
	If P1Score < 0 Then
		playerOneHs = 0
		p1HsTemp = 0
'		processHs("p1")
		Return
	End If
	
	
	p1HsTemp	= p1HsTemp + points
	
	'TEST CODE
	If p1HsTemp > playerOneHs Then
		lbl_player_one_hs.Text = padString(p1HsTemp, "0", 0, 3)
	End If
	'TEST CODE
	
'	P1Score		= p1_100.Text&p1_10.Text&p1_1.Text
'	P1Score		= score+points
	
'	If P1Score > 999 Or P1Score <= -1 Then
'		Return
'	End If
	
	If lblInnings.Text = "000" Then
		lblInnings.Text	= "001"
		innigs			= 1
		inngSet			= 1
	End If
'	
'	If inngSet <> 1 And P1Score <> scorePlayerOne Then
'		innigs = lblInnings.Text
'		innigs = innigs + 1
'		lblInnings.Text = padString(innigs, "0", 0, 3)
'		inngSet = 1
'	End If
	
	scorePlayerOne = P1Score
	txtScore = padString(P1Score, "0", 0, 4)

	p1_100.Text		= txtScore.SubString2(1,2)
	p1_10.Text		= txtScore.SubString2(2,3)
	p1_1.Text		= txtScore.SubString2(3,4)

	p1_moyenne.Text = NumberFormat2((scorePlayerOne/innigs),1,3,3,False)
'''	
	If playerOneToMake > 0 Then
		CallSub2(scorebord, "playerOnePerc", NumberFormat2((scorePlayerOne/playerOneToMake)*100,1,2,2,False)&"%")
	p1_progress = (scorePlayerOne/playerOneToMake)*100
	End If
	setProgress(p1_progressBar, p1_progress)
	checkMatchWon("p1")
	
End Sub

Sub calcMoyenneP1
	p1_moyenne.Text = NumberFormat2((scorePlayerOne/innigs),1,3,3,False)
	If playerOneToMake > 0 Then
		CallSub2(scorebord, "playerOnePerc", NumberFormat2((scorePlayerOne/playerOneToMake)*100,1,2,2,False)&"%")
		p1_progress = (scorePlayerOne/playerOneToMake)*100
	End If
	setProgress(p1_progressBar, p1_progress)
End Sub


Sub calcScorePlayertwo(points As Int, leftMouse As Boolean)
	If leftMouse = False Then
		points = -Abs(points)
	End If
	
	Dim p2Score As Int
'	p2HsTemp = 0
	CallSubDelayed(scorebord, "lastClick")
	
	
	inngSet = 0
'	processHs("p1")
'	Log("VOOR " &p2HsTemp)
	p2HsTemp = p2HsTemp + points
'	Log("NA " &p2HsTemp)
'	If p2HsTemp < 0 Then p2HsTemp = 0
	
	p2Score = p2_100.Text&p2_10.Text&p2_1.Text
	p2Score = p2Score+points
	
	If p2Score > 999 Then ' Or score <= -0 Then
		Return
	End If
	
	If p2Score < 0 Then
		playerTwoHs = 0
		p2HsTemp = 0
'		processHs("p2")
		Return
	End If
	
	If lblInnings.Text = "000" Then
		lblInnings.Text	= "001"
		innigs			= 1
		inngSet			= 1
	End If
	
'	playerTwoHs		= p2HsTemp-playerTwoHs 'scorePlayerTwo - playerTwoHs
	scorePlayerTwo	= p2Score
	txtScore		= padString(p2Score, "0", 0, 4)
	
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

Sub calcMoyenneP2
	If innigs > 0 Then
	p2_moyenne.Text = NumberFormat2((scorePlayerTwo/(innigs-1)),1,3,3,False)
	End If
	If playerTwoToMake > 0 Then
		CallSub2(scorebord, "playertwoPerc", NumberFormat2((scorePlayerTwo/playerTwoToMake)*100,1,2,2,False)&"%")
		p2_progress = (scorePlayerTwo/playerTwoToMake)*100
	End If
	setProgress(p2_progressBar, p2_progress)
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
	If playerOneToMake > 0 Then
	p1_progress = (scorePlayerOne/playerOneToMake)*100
	CallSub2(scorebord, "playerOnePerc", NumberFormat2((scorePlayerOne/playerOneToMake)*100,1,2,2,False)&"%")
	Else
		p1_progress = 0
	CallSub2(scorebord, "playerOnePerc", "n.v.t.")
	End If
	setProgress(p1_progressBar, p1_progress)
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
	If playerTwoToMake > 0 Then
		p2_progress = (scorePlayerTwo/playerTwoToMake)*100
		setProgress(p2_progressBar, p2_progress)
		CallSub2(scorebord, "playerTwoPerc", NumberFormat2((scorePlayerTwo/playerTwoToMake)*100,1,2,2,False)&"%")
	Else
		p2_progress = 0
		setProgress(p2_progressBar, p2_progress)
		CallSub2(scorebord, "playerTwoPerc", "n.v.t")
	End If
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
		Else
			lbl_player_two_hs.Text = padString(0, "0", 0, 3)
		End If
	End If
	
	If player = "all" Then
'		If p1HsTemp > 0 And p1HsTemp > playerOneHs Then
'			playerOneHs = p1HsTemp
'			p1HsTemp = 0
'			lbl_player_one_hs.Text = padString(playerOneHs, "0", 0, 3)
		''			Log($"player 1 hs is ${playerOneHs}"$)
'		End If
		If p1HsTemp > playerOneHs Then
			playerOneHs = p1HsTemp
			p1HsTemp = 0
			lbl_player_one_hs.Text = padString(playerOneHs, "0", 0, 3)
		else If scorePlayerOne < playerOneHs Then
			playerOneHs = scorePlayerOne
			p1HsTemp = 0
			lbl_player_one_hs.Text = padString(playerOneHs, "0", 0, 3)
		End If
	End If
		
	If p2HsTemp > playerTwoHs Then
		playerTwoHs = p2HsTemp
		p2HsTemp = 0
		lbl_player_two_hs.Text = padString(playerTwoHs, "0", 0, 3)
	Else If scorePlayerTwo < playerTwoHs Then
		playerTwoHs = scorePlayerTwo
		p2HsTemp = 0
		lbl_player_two_hs.Text = padString(playerTwoHs, "0", 0, 3)
	End If
		
'		If scorePlayerTwo < playerTwoHs Then
'			playerTwoHs = scorePlayerTwo
'			p2HsTemp = 0
'			lbl_player_two_hs.Text = padString(playerTwoHs, "0", 0, 3)
'		End If
		
'		If p2HsTemp > 0 And p2HsTemp > playerTwoHs Or p2HsTemp < scorePlayerTwo Then
'			playerTwoHs = p2HsTemp
'			p2HsTemp = 0
'			lbl_player_two_hs.Text = padString(playerTwoHs, "0", 0, 3)
	''			Log($"player 2 hs is ${playerTwoHs}"$)
'		End If
'	End If
	
End Sub


Sub checkMatchWon(player As String)
	If player = "p1" Then
		CallSub(scorebord, "checkMatchWonP1")
	End If
	
	If player = "p2" Then
		processHs("p2")
		CallSub(scorebord, "checkMatchWonP2")
	End If
End Sub


' Example: SetFormCursor(MainForm, "arrowup.png")
'Sub SetFormCursor(frm As Form, imagefile As String)
'	Dim img As Image
'	img.Initialize(File.DirAssets, imagefile)
'	Dim joImageCursor As JavaObject
'	joImageCursor.InitializeNewInstance("javafx.scene.ImageCursor", Array(img))
'	Dim joCursor As JavaObject = frm.RootPane
'	joCursor.RunMethod("setCursor", Array(joImageCursor))
'End Sub

'Dir, 'Filename: Directory and filename of the cursor image.
'hotspotX, hotspotY: X and Y Position of the hotspot of the cursor (where the click happens).
'TargetNode: The node on which the cursor will be changed.
Sub SetCustomCursor1(Dir As String, Filename As String, hotspotX  As Double, hotspotY  As Double, TargetNode As Node)
	Dim img As Image
	img.Initialize(Dir, Filename)
	Dim cursor As JavaObject
	cursor.InitializeNewInstance("javafx.scene.ImageCursor", Array(img, hotspotX, hotspotY))
	Dim joScene As JavaObject = TargetNode
	joScene.RunMethod("setCursor", Array(cursor))
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

'Sub setNumberCss(lbl As Label)
'	CSSUtils.SetStyleProperty(lbl, "-fx-background-color",  "linear-gradient(to bottom,  #cfe7fa 0%,#6393c1 100%)")
'	CSSUtils.SetStyleProperty(lbl, "-fx-background-radius", "3,2,1")
'End Sub

Sub getVersion As String
	Dim version, os, appPath As String
	os = DetectOS
	Select os
		Case "windows"
			appPath = File.DirApp&"\44\"
		Case "linux"
			appPath = File.DirApp&"/44/"
	End Select
	
	version = File.ReadString(appPath, "ver.pdg")
	
	Return $" v ${version.Trim}"$
	
End Sub

Sub DetectOS As String
	Dim os As String = GetSystemProperty("os.name", "").ToLowerCase
	If os.Contains("win") Then
		Return "windows"
	Else If os.Contains("mac") Then
		Return "mac"
	Else
		Return "linux"
	End If
End Sub

Sub getIpNumber As String
	Dim Server As ServerSocket
	Dim components As List
	Dim Ip, ipStr As String
	
	ipStr = ""
	Server.Initialize(50000, Me)
	Ip = Server.GetMyIP
	components.Initialize
	
	For i = 0 To Ip.Length - 1
		If Ip.SubString2(i,i+1) = "." Then
		ipStr = ipStr &	","
			Else
		ipStr = ipStr &	Ip.SubString2(i,i+1)
		End If
	Next
	components = Regex.Split(",", ipStr)
	
	Return components.Get(3)
End Sub


