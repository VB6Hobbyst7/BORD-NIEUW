B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
	Public frm As Form
	Private parser As JSONParser
	Private lblP1 As Label
	Private lblP2 As Label
	Private BtnP1Start As Button
	Private Btn2Start As Button
	Private BtnCancel As Button
	Private cmbClub As ComboBox
	Private spPlayer As ScrollPane
	Private playerNameSelected As String
	
End Sub


Sub Show
	frm.Initialize("frm", 1920, 1080)
	frm.RootPane.LoadLayout("ClubSpelers")
	frm.SetFormStyle("UNDECORATED")
	frm.Resizable = False
	func.SetCustomCursor1(File.DirAssets, "mouse.png", 0, 0, frm.RootPane)
	frm.BackColor  =   fx.Colors.From32Bit(0xFF001A01)
	frm.Stylesheets.Add(File.GetUri(File.DirAssets, "n205.css"))
	func.caromLabelCss(lblP1, "labelClubPlayer")
	func.caromLabelCss(lblP2, "labelClubPlayer")
	BuildCombo
	
	spPlayer.LoadLayout("pnPlayer", 300, 0)
	
End Sub

Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	LogError(Error)
	LogError(StackTrace)
	File.WriteString(File.DirApp, "errStackTrace.txt", StackTrace)
	File.WriteString(File.DirApp, "errError.txt", Error)
	Return True
End Sub


Sub ShowForm
	frm.Show
End Sub

Private Sub BuildCombo
	Dim lst As List
	lst.Initialize
	
	lst = File.ListFiles($"${func.appPath}vereniging_spelers"$)
	lst.Sort(True)
	If lst.Size > 0 Then
		GetClubList(lst)
		nieuwe_partij.verDbExists = True
	Else
		nieuwe_partij.verDbExists = False
	End If
End Sub

Sub GetClubList(lstClub As List)
	Dim clbName As String
	
	For i = 0 To lstClub.Size - 1
		clbName = lstClub.Get(i)
		If CheckClubHasMembers(clbName) < 1 Then
			Continue
		End If
		cmbClub.Items.Add(clbName.Replace(".json", ""))
	Next
End Sub

Sub CheckClubHasMembers(club As String) As Int
	Dim Member As String = File.ReadString(func.appPath&"vereniging_spelers", club)
	
	
	Dim parser As JSONParser
	parser.Initialize(Member)
	
	Dim root As Map = parser.NextObject
	Dim LedenLijst As List = root.Get("LedenLijst")
	
	Return LedenLijst.Size
End Sub

Sub PlayerScrollPane(club As String)
	club = $"${club}.json"$
	Dim Member As String = File.ReadString(func.appPath&"vereniging_spelers", club)
	Dim lbl As Button
	Dim top As Int = 0
	Dim parser As JSONParser
	
	Dim p As Pane= spPlayer.InnerNode
	
	p.RemoveAllNodes
	
	parser.Initialize(Member)
	
	Dim root As Map = parser.NextObject
	Dim LedenLijst As List = root.Get("LedenLijst")
	Dim lst As List

	lst.Initialize
	For Each colLedenLijst As Map In LedenLijst
		lst.AddAll(Array As String(colLedenLijst.Get("name")))
	Next
	func.SortListWithDeviceLocale(lst)
	
	For i = 0 To lst.Size - 1
		lbl.Initialize("spLabel")
		lbl.Text = lst.Get(i)&" "&i
		lbl.TextSize = 59
		lbl.Id = "plyer"
		lbl.Alignment = "CENTER_LEFT"
		lbl.Style = "-fx-padding: 0 10 0 0;"
		p.AddNode(lbl , 0, top, spPlayer.Width-30, 30)
		top = top+100
	Next
	
	spPlayer.InnerNode.PrefHeight = lst.Size * 101
	
End Sub

Sub spLabel_MouseReleased (EventData As MouseEvent)
	Dim lbl As B4XView = Sender
	
	playerNameSelected = lbl.Text
End Sub

Sub cmbClub_SelectedIndexChanged(Index As Int, Value As Object)
	lblP1.Text = "Speler"
	lblP2.Text = "Speler"
	PlayerScrollPane(cmbClub.Items.Get(Index))
End Sub

Sub SelectP1_MouseReleased (EventData As MouseEvent)
	If playerNameSelected = "" Then Return
	If lblP2.Text = playerNameSelected Then Return
	lblP1.Text = playerNameSelected
End Sub

Sub SelectP2_MouseReleased (EventData As MouseEvent)
	If playerNameSelected = "" Then Return
	If lblP1.Text = playerNameSelected Then Return
	lblP2.Text = playerNameSelected
End Sub


Sub BtnP1Start_MouseReleased (EventData As MouseEvent)
	Dim lst As List
	lst.Initialize
	lst.AddAll(Array As String(func.splitNaam(lblP1.Text), "000"))
	lst.AddAll(Array As String(func.splitNaam(lblP2.Text), "000"))
	lst.AddAll(Array As String(""))
	StartGame(lst)
End Sub

Sub Btn2Start_MouseReleased (EventData As MouseEvent)
	Dim lst As List
	lst.Initialize
	lst.AddAll(Array As String(func.splitNaam(lblP2.Text), "000"))
	lst.AddAll(Array As String(func.splitNaam(lblP1.Text), "000"))
	lst.AddAll(Array As String(""))
	StartGame(lst)
End Sub


Sub StartGame(lst As List)
	CallSub2(scorebord, "setNewGame", True)
	CallSub2(scorebord, "setSpelerData", lst)
	nieuwe_partij.CloseForm
	frm.Close
	CallSub2(scorebord, "hideForm", True)
End Sub

Sub BtnCancel_MouseReleased (EventData As MouseEvent)
	nieuwe_partij.UncheckVereniging
	frm.Close
End Sub
