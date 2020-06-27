B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private tUser As EditText
	Private tPass As EditText 
	Private tAlamat As EditText 
	Private tNama As EditText
	Private tTelp As EditText
	Private lPilihPic As Label
	Dim fd As FileDialog
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("fSignUp")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub btBack_Click
	Activity.Finish
	StartActivity(Main)
End Sub

Sub btPic_Click
	Dim i As Int
	
	fd.FilePath=File.DirRootExternal
	i=fd.Show("File Dialog","Yes","","Cancel",Null)
	'Wait For (i) Dialog_Result(Result As Int)
	If i=DialogResponse.POSITIVE Then
		'pctimg.bitmap=LoadBitmap(fd.FilePath,fd.ChosenName)
		lPilihPic.Text =fd.ChosenName
	End If
End Sub

Sub TboxAda(tx As EditText)As Boolean
	If tx.Text="" Then
		tx.RequestFocus 
		Msgbox( " Harus Terisi","Info Text Kosong")
		Return False
		Else
		Return True
	End If
End Sub

Sub btSave_Click
	If TboxAda(tUser)=False Then Return 
	If TboxAda(tPass)=False Then Return
	 
	Dim res As ResultSet = mdl_koneksi.GetProc("select * from pengguna where username='" & tUser.Text  &"'  ")
	If res.RowCount >0 Then
		res.Position=0
		If res.GetString2("username")<>"" Then
			Msgbox("sudah ada: " & res.GetString2("username"),"info")
			tUser.Text=""
			mdl_koneksi.myh.Close
			Return
		End If
	End If
	Dim qs As String 
	qs="insert into pengguna (username,pass) values('" & tUser.Text & "' , '" & tPass.Text & "') "
	'Msgbox(qs,"query")
	mdl_koneksi.SetProc(qs)
	
End Sub