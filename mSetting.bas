B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=9.8
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Set (Key As String, Value As String)
	Dim M As Map
	If File.Exists(File.DirInternal,"SettingQu") Then
		M = File.ReadMap(File.DirInternal,"SettingQu")
	Else
		M.Initialize
	End If
    
	M.Put(Key,Value)
	File.WriteMap(File.DirInternal,"SettingQu",M)
End Sub

Sub Get (Key As String) As String
	If File.Exists(File.DirInternal,"SettingQu") Then
		'Msgbox(File.DirInternal,"alamat andro")
		Return File.ReadMap(File.DirInternal,"SettingQu").Get(Key)
	End If
End Sub