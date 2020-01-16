B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
#IgnoreWarnings: 16, 9, 12
Sub Class_Globals
	Private fx As JFX
	Private ftp As FTP
	Private os, appDownloadPath, fileName As String
	Private appName As String = "44.jar"
	Private fileDate, fileServerDate As Long
	Private don As String = "pdegrootafr"
	Private dop As String = "hkWpXtB1!"
	Private dos As String = "ftp.pdeg.nl"
	Private clsMAC As GetMac
	
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	clsMAC.Initialize
	os = DetectOS
	Select os
		Case "windows"
			appDownloadPath = File.DirApp&"\44\"
		Case "linux"
			appDownloadPath = File.DirApp&"/44/"
	End Select
	
	'CREATE UPDATE TIMESTAMP
'	updateFileExists
'	If getUpdateTimeStamp = False Then
'		Return
'	End If
	
End Sub

Sub createStartLog
	#if debug
	Return
	#End If
	
	Dim sys As String
	Dim j As HttpJob
	Dim str, strMac As String
	Dim lst As List
	
	Try
		lst.Initialize
	
		lst = clsMAC.GetMacAddresses
	
		For Each macm As Map In lst
			For Each k In macm.Keys
				If k = "mac" Then
					strMac = macm.Get(k)
					Exit
				End If
			Next
		Next
	
		strMac = strMac.Replace("-", "")&".frt"
		j.Initialize("", Me)
		j.Download("https://freegeoip.app/json/")
		Wait For (j) JobDone(j As HttpJob)
		If j.Success Then
			str = j.GetString
			j.Release
	
			'	Log(str)
			If ftp.IsInitialized = False Then
				ftp.Initialize("FTP", dos, 21, don, dop)
			End If
			ftp.PassiveMode = True
	
			If File.Exists(appDownloadPath, strMac) = False Then
				File.WriteString(appDownloadPath, strMac, $"${parseJson(str)} $DateTime{DateTime.Now}"$)
			Else
				sys = File.ReadString(appDownloadPath, strMac)
				sys = $"${sys}${CRLF} ${parseJson(str)}  $DateTime{DateTime.Now}"$
				File.WriteString(appDownloadPath, strMac, sys)
			End If
	
			Sleep(100)
			ftp.UploadFile(appDownloadPath, strMac, False, strMac)
			ftp.Close
		End If
	Catch
		Log("..")
	End Try
		
End Sub


Sub parseJson(data As String) As String
	
	Dim parser As JSONParser
	parser.Initialize(data)
	Dim root As Map = parser.NextObject
'	Dim country_code As String = root.Get("country_code")
'	Dim metro_code As Int = root.Get("metro_code")
	Dim city As String = root.Get("city")
	Dim ip As String = root.Get("ip")
'	Dim latitude As Double = root.Get("latitude")
'	Dim country_name As String = root.Get("country_name")
'	Dim region_name As String = root.Get("region_name")
'	Dim time_zone As String = root.Get("time_zone")
	Dim zip_code As String = root.Get("zip_code")
'	Dim region_code As String = root.Get("region_code")
'	Dim longitude As Double = root.Get("longitude")
	
	Return $"${city} ${ip} ${zip_code}"$
End Sub

Sub checkUpdate As ResumableSub
	If ftp.IsInitialized = False Then
		ftp.Initialize("FTP", dos, 21, don, dop)
	End If
	ftp.PassiveMode = True
	ftp.List("/")
	wait for FTP_ListCompleted(ServerPath As String, Success As Boolean, Folders() As FTPEntry, fileS() As FTPEntry)
	If Success = False Then
		Log(LastException)
		ftp.Close
	Else
		For i = 0 To fileS.Length - 1
			fileName = fileS(i).Name
			
			If fileName.IndexOf("44") <> -1 And fileS(i).Timestamp > fileDate Then
				processVersion(fileName)
				fileServerDate = fileS(i).Timestamp
				'Log(fileS(i))	
				ftp.DownloadFile(ServerPath&fileName, False, appDownloadPath, appName)
			End If
			
		Next
		ftp.Close
	End If
	Return True
End Sub

Sub FTP_DownloadProgress (ServerPath As String, TotalDownloaded As Long, Total As Long)
	Dim s As String
	s = "Downloaded " & Round(TotalDownloaded / 1000) & "KB"
	If Total > 0 Then s = s & " out of " & Round(Total / 1000) & "KB"
'	Log(s)
End Sub

Sub FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
'	Log(ServerPath & ", Success= " & Success)
	If Success = False Then
		Log(LastException.Message)
	Else
		
		Dim str As String
		str = File.ReadString(appDownloadPath & "upd.pdg", "")
		fileDate = str
		File.WriteString(appDownloadPath , "upd.pdg", fileServerDate)
		If os = "linux" Then
			restartApp
		End If
	End If
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


Sub getUpdateTimeStamp As Boolean
	Dim str As String
	str = File.ReadString(appDownloadPath & "upd.pdg", "")
	
	If str.Length < 1 Then
		str = DateTime.Now
		File.WriteString(appDownloadPath , "upd.pdg", str)
		fileDate = str
		Return False
	Else
		fileDate = str	
	End If
	Return True
	
End Sub

Sub updateFileExists
	If File.Exists(appDownloadPath, "upd.pdg") = False Then
		Log("upd created..")
		File.WriteString(appDownloadPath , "upd.pdg", "")
	End If
	
End Sub

Sub processVersion(str As String)
'	Log(str)
	Dim version As String
	Dim lst As List
	
	lst.Initialize
	
	lst = Regex.Split("-", str)
	version = lst.Get(1)
	version = version.Replace("_", ".")
	version = version.Replace(".jar", "")
	Log($"Version : ${version}"$)
	File.WriteString(appDownloadPath, "ver.pdg", version)
	
End Sub

Sub restartApp
	Dim sh As Shell
'	sh.Initialize("sh", "/home/pi/44/run.sh", Null)
'	sh.WorkingDirectory = "/home/pi/44"
	sh.Initialize("sh", "sh", Array("/home/pi/44/run.sh"))
	sh.Run(5000)
	ExitApplication
End Sub

Sub sh_ProcessCompleted (Success As Boolean, ExitCode As Int, StdOut As String, StdErr As String)
	If Success And ExitCode = 0 Then
		Log("Success")
		Log(StdOut)
	Else
		Log("Error: " & StdErr)
	End If
End Sub
