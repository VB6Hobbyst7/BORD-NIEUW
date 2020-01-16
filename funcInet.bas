B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
'	Dim ftp As FTP
	
	Private url As String
	
	Public imgView As ImageView
End Sub


Sub testInet As ResumableSub
	Dim j As HttpJob
	Dim url As String = "https:\\www.google.com"

	Try
	
		j.Initialize(url, Me)
		j.Download(url)
	
		Wait For (j) JobDone(j As HttpJob)
	Catch
		Log("No Internet")
		Return False
	End Try
	
	If j.Success Then
		Return True
	Else
		Return False
	End If
End Sub


Sub IsOnline As ResumableSub
'	Private inetaddress As JavaObject
'	inetaddress.InitializeStatic("java.net.InetAddress")
'	If inetaddress.RunMethodJO("getByName",Array As String("www.google.nl")).RunMethod("isReachable",Array As Object(2000)) Then
'		Return True
'	Else
'		Return False
'	End If

End Sub


'public Sub newRandomImage(Link As String, iv As ImageView)
'		
'	Dim j As HttpJob
'	url = "http://picsum.photos/1920/1080?random=2"
'	j.Initialize("",  Me)
'	j.Download(Link)
'	j.GetRequest.Timeout = 5000
'	
'	Wait For (j) JobDone(j As HttpJob)
'	
'	If j.Success Then
'		iv.SetImage(j.GetBitmap)		
'	End If
'	j.Release
'	
'End Sub

'Sub processImage(bmp As Image)
'	CallSub2(scorebord, "setRandomImage", bmp)
'	
'End Sub