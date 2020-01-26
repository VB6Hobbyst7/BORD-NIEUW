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
	Private cmbClub As ComboBox
	Private lstClubId, lstClubNaam As List
	Private lvSpelers As ListView
	Private lblP1 As Label
	Private lblP2 As Label
	Private BtnP1Start As Button
	Private Btn2Start As Button
	Private BtnCancel As Button
End Sub


Sub Show
	frm.Initialize("frm", 1920, 1080)
	frm.RootPane.LoadLayout("ClubSpelers")
	func.SetCustomCursor1(File.DirAssets, "mouse.png", 370, 370, frm.RootPane)
	frm.BackColor  =   fx.Colors.From32Bit(0xFF001A01)
	frm.Stylesheets.Add(File.GetUri(File.DirAssets, "n205.css"))
'	func.caromLabelCss(lvSpelers, "listview")
	func.caromLabelCss(lblP1, "labelClubPlayer")
	func.caromLabelCss(lblP2, "labelClubPlayer")
	GetClubList
	
End Sub

Sub ShowForm
	frm.Show
End Sub

Sub GetClubList
	Dim rs As ResultSet
	lstClubId.Initialize
	lstClubNaam.Initialize
	
	
	
	rs = GenDb.GetVereniging
	
	Do While rs.NextRow
		lstClubId.Add(rs.GetString("id"))
		lstClubNaam.Add(rs.GetString("naam"))
	Loop
	
	cmbClub.Items.AddAll(lstClubNaam)
	GenDb.CloseRs
End Sub

Sub GetMembers(clubId As String)
	Dim rs As ResultSet
	lvSpelers.Items.Clear
	rs = GenDb.GetMembers(clubId)
	
	Do While rs.NextRow
		lvSpelers.Items.Add(rs.GetString("name"))
	Loop
	
	GenDb.CloseRs
End Sub

Sub cmbClub_SelectedIndexChanged(Index As Int, Value As Object)
	lblP1.Text = "Speler"
	lblP2.Text = "Speler"
	GetMembers(lstClubId.Get(Index))
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