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
End Sub


Sub GenForm
	frm.Initialize("frm", 1920, 1080)
	frm.RootPane.LoadLayout("ClubSpelers")
	frm.BackColor  =   fx.Colors.From32Bit(0xFF001A01)
	GetClubList
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


Sub SelectP2_MouseReleased (EventData As MouseEvent)
	lblP2.Text = lvSpelers.SelectedItem
End Sub

Sub SelectP1_MouseReleased (EventData As MouseEvent)
	lblP1.Text = lvSpelers.SelectedItem
End Sub