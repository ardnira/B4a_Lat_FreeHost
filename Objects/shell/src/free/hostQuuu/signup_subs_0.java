package free.hostQuuu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class signup_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (signup) ","signup",3,signup.mostCurrent.activityBA,signup.mostCurrent,24);
if (RapidSub.canDelegate("activity_create")) { return free.hostQuuu.signup.remoteMe.runUserSub(false, "signup","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="Activity.LoadLayout(\"LaySignUp\")";
Debug.ShouldStop(33554432);
signup.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LaySignUp")),signup.mostCurrent.activityBA);
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (signup) ","signup",3,signup.mostCurrent.activityBA,signup.mostCurrent,33);
if (RapidSub.canDelegate("activity_pause")) { return free.hostQuuu.signup.remoteMe.runUserSub(false, "signup","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (signup) ","signup",3,signup.mostCurrent.activityBA,signup.mostCurrent,29);
if (RapidSub.canDelegate("activity_resume")) { return free.hostQuuu.signup.remoteMe.runUserSub(false, "signup","activity_resume");}
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btback_click() throws Exception{
try {
		Debug.PushSubsStack("btBack_Click (signup) ","signup",3,signup.mostCurrent.activityBA,signup.mostCurrent,38);
if (RapidSub.canDelegate("btback_click")) { return free.hostQuuu.signup.remoteMe.runUserSub(false, "signup","btback_click");}
 BA.debugLineNum = 38;BA.debugLine="Sub btBack_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Activity.Finish";
Debug.ShouldStop(64);
signup.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 40;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(128);
signup.mostCurrent.__c.runVoidMethod ("StartActivity",signup.processBA,(Object)((signup.mostCurrent._main.getObject())));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btpic_click() throws Exception{
try {
		Debug.PushSubsStack("btPic_Click (signup) ","signup",3,signup.mostCurrent.activityBA,signup.mostCurrent,43);
if (RapidSub.canDelegate("btpic_click")) { return free.hostQuuu.signup.remoteMe.runUserSub(false, "signup","btpic_click");}
RemoteObject _i = RemoteObject.createImmutable(0);
 BA.debugLineNum = 43;BA.debugLine="Sub btPic_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="Dim i As Int";
Debug.ShouldStop(2048);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 46;BA.debugLine="fd.FilePath=File.DirRootExternal";
Debug.ShouldStop(8192);
signup.mostCurrent._fd.runMethod(true,"setFilePath",signup.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirRootExternal"));
 BA.debugLineNum = 47;BA.debugLine="i=fd.Show(\"File Dialog\",\"Yes\",\"\",\"Cancel\",Null)";
Debug.ShouldStop(16384);
_i = signup.mostCurrent._fd.runMethod(true,"Show",(Object)(BA.ObjectToCharSequence("File Dialog")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Cancel")),signup.mostCurrent.activityBA,(Object)((signup.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("i", _i);
 BA.debugLineNum = 49;BA.debugLine="If i=DialogResponse.POSITIVE Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, signup.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 51;BA.debugLine="lPilihPic.Text =fd.ChosenName";
Debug.ShouldStop(262144);
signup.mostCurrent._lpilihpic.runMethod(true,"setText",BA.ObjectToCharSequence(signup.mostCurrent._fd.runMethod(true,"getChosenName")));
 };
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btsave_click() throws Exception{
try {
		Debug.PushSubsStack("btSave_Click (signup) ","signup",3,signup.mostCurrent.activityBA,signup.mostCurrent,65);
if (RapidSub.canDelegate("btsave_click")) { return free.hostQuuu.signup.remoteMe.runUserSub(false, "signup","btsave_click");}
RemoteObject _res = RemoteObject.declareNull("mysql.mysqlhandler.ResultSetWrapper");
RemoteObject _qs = RemoteObject.createImmutable("");
RemoteObject _hsl = RemoteObject.createImmutable(false);
 BA.debugLineNum = 65;BA.debugLine="Sub btSave_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="If TboxAda(tUser)=False Then Return";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_tboxada(signup.mostCurrent._tuser),signup.mostCurrent.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 67;BA.debugLine="If TboxAda(tPass)=False Then Return";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_tboxada(signup.mostCurrent._tpass),signup.mostCurrent.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 69;BA.debugLine="Dim res As ResultSet = mdl_koneksi.GetProc(\"selec";
Debug.ShouldStop(16);
_res = RemoteObject.createNew ("mysql.mysqlhandler.ResultSetWrapper");
_res = signup.mostCurrent._mdl_koneksi.runMethod(false,"_getproc" /*RemoteObject*/ ,signup.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from pengguna where username='"),signup.mostCurrent._tuser.runMethod(true,"getText"),RemoteObject.createImmutable("'  "))));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 70;BA.debugLine="If res.RowCount >0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_res.runMethod(true,"RowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 71;BA.debugLine="res.Position=0";
Debug.ShouldStop(64);
_res.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 72;BA.debugLine="If res.GetString2(\"username\")<>\"\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("!",_res.runMethod(true,"GetString2",(Object)(RemoteObject.createImmutable("username"))),BA.ObjectToString(""))) { 
 BA.debugLineNum = 73;BA.debugLine="Msgbox(\"sudah ada: \" & res.GetString2(\"username";
Debug.ShouldStop(256);
signup.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("sudah ada: "),_res.runMethod(true,"GetString2",(Object)(RemoteObject.createImmutable("username")))))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("info"))),signup.mostCurrent.activityBA);
 BA.debugLineNum = 74;BA.debugLine="tUser.Text=\"\"";
Debug.ShouldStop(512);
signup.mostCurrent._tuser.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 75;BA.debugLine="mdl_koneksi.myh.Close";
Debug.ShouldStop(1024);
signup.mostCurrent._mdl_koneksi._myh /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 76;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return RemoteObject.createImmutable("");
 };
 };
 BA.debugLineNum = 79;BA.debugLine="Dim qs As String";
Debug.ShouldStop(16384);
_qs = RemoteObject.createImmutable("");Debug.locals.put("qs", _qs);
 BA.debugLineNum = 80;BA.debugLine="qs=\"insert into pengguna (username,pass) values('";
Debug.ShouldStop(32768);
_qs = RemoteObject.concat(RemoteObject.createImmutable("insert into pengguna (username,pass) values('"),signup.mostCurrent._tuser.runMethod(true,"getText"),RemoteObject.createImmutable("' , '"),signup.mostCurrent._tpass.runMethod(true,"getText"),RemoteObject.createImmutable("') "));Debug.locals.put("qs", _qs);
 BA.debugLineNum = 82;BA.debugLine="Dim hsl As Boolean=mdl_koneksi.SetProc(qs)";
Debug.ShouldStop(131072);
_hsl = signup.mostCurrent._mdl_koneksi.runMethod(true,"_setproc" /*RemoteObject*/ ,signup.mostCurrent.activityBA,(Object)(_qs));Debug.locals.put("hsl", _hsl);Debug.locals.put("hsl", _hsl);
 BA.debugLineNum = 83;BA.debugLine="If hsl=True Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_hsl,signup.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 84;BA.debugLine="Msgbox(\"sukses\",\"info nyimpan\")";
Debug.ShouldStop(524288);
signup.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("sukses")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("info nyimpan"))),signup.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 86;BA.debugLine="Msgbox(\"GAGAL\",\"info nyimpan\")";
Debug.ShouldStop(2097152);
signup.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("GAGAL")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("info nyimpan"))),signup.mostCurrent.activityBA);
 };
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private tUser As EditText";
signup.mostCurrent._tuser = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private tPass As EditText";
signup.mostCurrent._tpass = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private tAlamat As EditText";
signup.mostCurrent._talamat = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private tNama As EditText";
signup.mostCurrent._tnama = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private tTelp As EditText";
signup.mostCurrent._ttelp = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private lPilihPic As Label";
signup.mostCurrent._lpilihpic = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim fd As FileDialog";
signup.mostCurrent._fd = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.FileDialog");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _tboxada(RemoteObject _tx) throws Exception{
try {
		Debug.PushSubsStack("TboxAda (signup) ","signup",3,signup.mostCurrent.activityBA,signup.mostCurrent,55);
if (RapidSub.canDelegate("tboxada")) { return free.hostQuuu.signup.remoteMe.runUserSub(false, "signup","tboxada", _tx);}
Debug.locals.put("tx", _tx);
 BA.debugLineNum = 55;BA.debugLine="Sub TboxAda(tx As EditText)As Boolean";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="If tx.Text=\"\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_tx.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 57;BA.debugLine="tx.RequestFocus";
Debug.ShouldStop(16777216);
_tx.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 58;BA.debugLine="Msgbox( \" Harus Terisi\",\"Info Text Kosong\")";
Debug.ShouldStop(33554432);
signup.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(" Harus Terisi")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info Text Kosong"))),signup.mostCurrent.activityBA);
 BA.debugLineNum = 59;BA.debugLine="Return False";
Debug.ShouldStop(67108864);
if (true) return signup.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 61;BA.debugLine="Return True";
Debug.ShouldStop(268435456);
if (true) return signup.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}