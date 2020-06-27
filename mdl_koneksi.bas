B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
   Dim myh As MysqlHandler
   Dim rst As ResultSet
   
	Dim nmServer As String="sql12.freemysqlhosting.net"
	Dim nmDbase As String="sql12350814"
	Dim nmUser As String="sql12350814"
	Dim nmPass As String ="XhVdBAssyz"
End Sub 

Sub Koneksi
	myh.Initialize(nmServer, nmDbase ,nmUser,nmPass)
	If myh.isConnected=False Then
		Msgbox("gk konek","info")
		ExitApplication
		Else
		'Msgbox("sip konek","info")
	End If
	Return
End Sub

Sub KonekKah()As Boolean
	myh.Initialize(nmServer, nmDbase ,nmUser,nmPass)
	If myh.isConnected=False Then
		Return False
		Msgbox("gk konek","Koneksi Database")
		ExitApplication
	Else
		Return True
	End If
End Sub

Sub GetProc(qs As String)As ResultSet	  
	If KonekKah=False Then Return Null
    Dim hsl As ResultSet =myh.Query(qs)
	'myh.Close
	Return hsl
End Sub

Sub SetProc(qs As String)
	If KonekKah=False Then Return 
	myh.Exec(qs)
	myh.Close
End Sub
