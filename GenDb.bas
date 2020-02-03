B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
'	Dim Sql As SQL
'	Dim appDbFolder As String
'	Dim rs As ResultSet
End Sub
'
'Private Sub SqlInit
'	If Sql.IsInitialized = False Then
'		Sql.InitializeSQLite(appDbFolder, "bord_leden.db", False)
'	End If
'End Sub
'
'Public Sub GetVereniging As ResultSet
'	'SQL INITIALIZED
'	SqlInit
'	
'	Dim qry As String
'	
'	qry = "SELECT * FROM vereniging ORDER BY Naam"
'	rs = Sql.ExecQuery(qry)
'		
'	Return rs
'	
'End Sub
'
'Public Sub GetMembers(id As String) As ResultSet
'	SqlInit
'	
'	Dim qry As String
'	
'	qry = "SELECT name FROM leden WHERE Ver_Id = ? ORDER BY Name"
'	rs = Sql.ExecQuery2(qry, Array As String(id))
'	
'	Return rs
'End Sub
'
'Sub CloseRs
'	rs.Close
'End Sub
'
'Public Sub CheckDbFolder
'	Dim os As String = parseConfig.DetectOS
'	Select os
'		Case "windows"
'			If File.IsDirectory(File.DirApp, "\db\") = False Then
'				File.MakeDir(File.DirApp, "\db\")
'			End If
'			appDbFolder = File.DirApp&"\db\"
'		Case "linux"
'			If File.IsDirectory(File.DirApp, "/44/db/") = False Then
'				File.MakeDir(File.DirApp, "/44/db/")
'			End If
'			appDbFolder = File.DirApp&"/44/db/"
'	End Select
'	
'	If File.Exists(appDbFolder, "bord_leden.db") = False Then
'		If File.Exists(File.DirAssets, "bord_leden.db") = True Then
'			File.Copy(File.DirAssets, "bord_leden.db", appDbFolder, "bord_leden.db")
'			Sleep(300)
'			nieuwe_partij.verDbExists = True
'		Else
'			nieuwe_partij.verDbExists = False
'		End If
'	Else 
'		nieuwe_partij.verDbExists = True	
'	End If
'	
'End Sub