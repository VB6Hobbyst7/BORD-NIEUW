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
	Private lstClubId As List
	Private lvSpelers As ListView
	Private lblP1 As Label
	Private lblP2 As Label
	Private BtnP1Start As Button
	Private Btn2Start As Button
	Private BtnCancel As Button
	Private cmbClub As ComboBox
End Sub


Sub Show
	frm.Initialize("frm", 1920, 1080)
	frm.RootPane.LoadLayout("ClubSpelers")
	frm.SetFormStyle("UNDECORATED")
	frm.Resizable = False
	func.SetCustomCursor1(File.DirAssets, "mouse.png", 370, 370, frm.RootPane)
	frm.BackColor  =   fx.Colors.From32Bit(0xFF001A01)
	frm.Stylesheets.Add(File.GetUri(File.DirAssets, "n205.css"))
'	func.caromLabelCss(lvSpelers, "listview")
	func.caromLabelCss(lblP1, "labelClubPlayer")
	func.caromLabelCss(lblP2, "labelClubPlayer")
	BuildCombo
	
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
		cmbClub.Items.Add(clbName.Replace(".json", ""))
	Next
End Sub

Sub GetMembers(club As String)
'	lvSpelers.Initialize("")
	lvSpelers.Items.Clear
	club = $"${club}.json"$
	Dim Member As String = File.ReadString(func.appPath&"vereniging_spelers", club)
		
	
	
	Dim parser As JSONParser
	parser.Initialize(Member)
	
	Dim root As Map = parser.NextObject
	Dim LedenLijst As List = root.Get("LedenLijst")
	For Each colLedenLijst As Map In LedenLijst
'		Dim name As String = colLedenLijst.Get("name")
		lvSpelers.Items.Add(colLedenLijst.Get("name"))
	Next
	

End Sub

Sub cmbClub_SelectedIndexChanged(Index As Int, Value As Object)
	lblP1.Text = "Speler"
	lblP2.Text = "Speler"
	GetMembers(cmbClub.Items.Get(Index))
End Sub

Sub SelectP1_MouseReleased (EventData As MouseEvent)
	If lvSpelers.Items.Size = 0  Or lvSpelers.SelectedItem = Null Then Return
	If lblP2.Text = lvSpelers.SelectedItem Then Return
	lblP1.Text = lvSpelers.SelectedItem
End Sub

Sub SelectP2_MouseReleased (EventData As MouseEvent)
	If lvSpelers.Items.Size = 0  Or lvSpelers.SelectedItem = Null Then Return
	If lblP1.Text = lvSpelers.SelectedItem Then Return
	lblP2.Text = lvSpelers.SelectedItem
End Sub


Sub BtnP1Start_MouseReleased (EventData As MouseEvent)
	Dim lst As List
	lst.Initialize
	lst.AddAll(Array As String(func.splitNaam(lblP1.Text), "000"))
	lst.AddAll(Array As String(func.splitNaam(lblP2.Text), "000"))
	lst.AddAll(Array As String(""))
	CallSub2(scorebord, "setNewGame", True)
	CallSub2(scorebord, "setSpelerData", lst)
	nieuwe_partij.CloseForm
	frm.Close
	CallSub2(scorebord, "hideForm", True)
End Sub

Sub Btn2Start_MouseReleased (EventData As MouseEvent)
	Dim lst As List
	lst.Initialize
	lst.AddAll(Array As String(func.splitNaam(lblP2.Text), "000"))
	lst.AddAll(Array As String(func.splitNaam(lblP1.Text), "000"))
	lst.AddAll(Array As String(""))
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