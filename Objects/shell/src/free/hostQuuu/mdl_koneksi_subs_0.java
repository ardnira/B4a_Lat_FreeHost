package free.hostQuuu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mdl_koneksi_subs_0 {


public static RemoteObject  _getproc(RemoteObject _ba,RemoteObject _qs) throws Exception{
try {
		Debug.PushSubsStack("GetProc (mdl_koneksi) ","mdl_koneksi",2,_ba,mdl_koneksi.mostCurrent,37);
if (RapidSub.canDelegate("getproc")) { return free.hostQuuu.mdl_koneksi.remoteMe.runUserSub(false, "mdl_koneksi","getproc", _ba, _qs);}
RemoteObject _hsl = RemoteObject.declareNull("mysql.mysqlhandler.ResultSetWrapper");
;
Debug.locals.put("qs", _qs);
 BA.debugLineNum = 37;BA.debugLine="Sub GetProc(qs As String)As ResultSet";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="If KonekKah=False Then Return Null";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_konekkah(_ba),mdl_koneksi.mostCurrent.__c.getField(true,"False"))) { 
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("mysql.mysqlhandler.ResultSetWrapper"), mdl_koneksi.mostCurrent.__c.getField(false,"Null"));};
 BA.debugLineNum = 39;BA.debugLine="Dim hsl As ResultSet =myh.Query(qs)";
Debug.ShouldStop(64);
_hsl = RemoteObject.createNew ("mysql.mysqlhandler.ResultSetWrapper");
_hsl.setObject(mdl_koneksi._myh.runMethod(false,"Query",(Object)(_qs)));Debug.locals.put("hsl", _hsl);
 BA.debugLineNum = 41;BA.debugLine="Return hsl";
Debug.ShouldStop(256);
if (true) return _hsl;
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _konekkah(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("KonekKah (mdl_koneksi) ","mdl_koneksi",2,_ba,mdl_koneksi.mostCurrent,26);
if (RapidSub.canDelegate("konekkah")) { return free.hostQuuu.mdl_koneksi.remoteMe.runUserSub(false, "mdl_koneksi","konekkah", _ba);}
;
 BA.debugLineNum = 26;BA.debugLine="Sub KonekKah()As Boolean";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="myh.Initialize(nmServer, nmDbase ,nmUser,nmPass)";
Debug.ShouldStop(67108864);
mdl_koneksi._myh.runVoidMethod ("Initialize",(Object)(mdl_koneksi._nmserver),(Object)(mdl_koneksi._nmdbase),(Object)(mdl_koneksi._nmuser),(Object)(mdl_koneksi._nmpass));
 BA.debugLineNum = 28;BA.debugLine="If myh.isConnected=False Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",mdl_koneksi._myh.getField(true,"isConnected"),mdl_koneksi.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 29;BA.debugLine="Return False";
Debug.ShouldStop(268435456);
if (true) return mdl_koneksi.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 30;BA.debugLine="Msgbox(\"gk konek\",\"Koneksi Database\")";
Debug.ShouldStop(536870912);
mdl_koneksi.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("gk konek")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Koneksi Database"))),_ba);
 BA.debugLineNum = 31;BA.debugLine="ExitApplication";
Debug.ShouldStop(1073741824);
mdl_koneksi.mostCurrent.__c.runVoidMethod ("ExitApplication");
 }else {
 BA.debugLineNum = 33;BA.debugLine="Return True";
Debug.ShouldStop(1);
if (true) return mdl_koneksi.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _koneksi(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Koneksi (mdl_koneksi) ","mdl_koneksi",2,_ba,mdl_koneksi.mostCurrent,15);
if (RapidSub.canDelegate("koneksi")) { return free.hostQuuu.mdl_koneksi.remoteMe.runUserSub(false, "mdl_koneksi","koneksi", _ba);}
;
 BA.debugLineNum = 15;BA.debugLine="Sub Koneksi";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="myh.Initialize(nmServer, nmDbase ,nmUser,nmPass)";
Debug.ShouldStop(32768);
mdl_koneksi._myh.runVoidMethod ("Initialize",(Object)(mdl_koneksi._nmserver),(Object)(mdl_koneksi._nmdbase),(Object)(mdl_koneksi._nmuser),(Object)(mdl_koneksi._nmpass));
 BA.debugLineNum = 17;BA.debugLine="If myh.isConnected=False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",mdl_koneksi._myh.getField(true,"isConnected"),mdl_koneksi.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 18;BA.debugLine="Msgbox(\"gk konek\",\"info\")";
Debug.ShouldStop(131072);
mdl_koneksi.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("gk konek")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("info"))),_ba);
 BA.debugLineNum = 19;BA.debugLine="ExitApplication";
Debug.ShouldStop(262144);
mdl_koneksi.mostCurrent.__c.runVoidMethod ("ExitApplication");
 }else {
 };
 BA.debugLineNum = 23;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.createImmutable("");
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Dim myh As MysqlHandler";
mdl_koneksi._myh = RemoteObject.createNew ("mysql.mysqlhandler");
 //BA.debugLineNum = 7;BA.debugLine="Dim rst As ResultSet";
mdl_koneksi._rst = RemoteObject.createNew ("mysql.mysqlhandler.ResultSetWrapper");
 //BA.debugLineNum = 9;BA.debugLine="Dim nmServer As String=\"sql12.freemysqlhosting.ne";
mdl_koneksi._nmserver = BA.ObjectToString("sql12.freemysqlhosting.net");
 //BA.debugLineNum = 10;BA.debugLine="Dim nmDbase As String=\"sql12350814\"";
mdl_koneksi._nmdbase = BA.ObjectToString("sql12350814");
 //BA.debugLineNum = 11;BA.debugLine="Dim nmUser As String=\"sql12350814\"";
mdl_koneksi._nmuser = BA.ObjectToString("sql12350814");
 //BA.debugLineNum = 12;BA.debugLine="Dim nmPass As String =\"XhVdBAssyz\"";
mdl_koneksi._nmpass = BA.ObjectToString("XhVdBAssyz");
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setproc(RemoteObject _ba,RemoteObject _qs) throws Exception{
try {
		Debug.PushSubsStack("SetProc (mdl_koneksi) ","mdl_koneksi",2,_ba,mdl_koneksi.mostCurrent,44);
if (RapidSub.canDelegate("setproc")) { return free.hostQuuu.mdl_koneksi.remoteMe.runUserSub(false, "mdl_koneksi","setproc", _ba, _qs);}
;
Debug.locals.put("qs", _qs);
 BA.debugLineNum = 44;BA.debugLine="Sub SetProc(qs As String)As Boolean";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="If KonekKah=False Then Return False";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_konekkah(_ba),mdl_koneksi.mostCurrent.__c.getField(true,"False"))) { 
if (true) return mdl_koneksi.mostCurrent.__c.getField(true,"False");};
 BA.debugLineNum = 46;BA.debugLine="myh.Exec(qs)";
Debug.ShouldStop(8192);
mdl_koneksi._myh.runVoidMethod ("Exec",(Object)(_qs));
 BA.debugLineNum = 47;BA.debugLine="myh.Close";
Debug.ShouldStop(16384);
mdl_koneksi._myh.runVoidMethod ("Close");
 BA.debugLineNum = 48;BA.debugLine="Return True";
Debug.ShouldStop(32768);
if (true) return mdl_koneksi.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}