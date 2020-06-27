package free.hostQuuu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class mdl_koneksi {
private static mdl_koneksi mostCurrent = new mdl_koneksi();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static mysql.mysqlhandler _myh = null;
public static mysql.mysqlhandler.ResultSetWrapper _rst = null;
public static String _nmserver = "";
public static String _nmdbase = "";
public static String _nmuser = "";
public static String _nmpass = "";
public free.hostQuuu.main _main = null;
public free.hostQuuu.starter _starter = null;
public free.hostQuuu.signup _signup = null;
public free.hostQuuu.msetting _msetting = null;
public static mysql.mysqlhandler.ResultSetWrapper  _getproc(anywheresoftware.b4a.BA _ba,String _qs) throws Exception{
RDebugUtils.currentModule="mdl_koneksi";
if (Debug.shouldDelegate(null, "getproc", false))
	 {return ((mysql.mysqlhandler.ResultSetWrapper) Debug.delegate(null, "getproc", new Object[] {_ba,_qs}));}
mysql.mysqlhandler.ResultSetWrapper _hsl = null;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub GetProc(qs As String)As ResultSet";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="If KonekKah=False Then Return Null";
if (_konekkah(_ba)==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return (mysql.mysqlhandler.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new mysql.mysqlhandler.ResultSetWrapper(), (java.sql.ResultSet)(anywheresoftware.b4a.keywords.Common.Null));};
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Dim hsl As ResultSet =myh.Query(qs)";
_hsl = new mysql.mysqlhandler.ResultSetWrapper();
_hsl.setObject((java.sql.ResultSet)(_myh.Query(_qs)));
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="Return hsl";
if (true) return _hsl;
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="End Sub";
return null;
}
public static boolean  _konekkah(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mdl_koneksi";
if (Debug.shouldDelegate(null, "konekkah", false))
	 {return ((Boolean) Debug.delegate(null, "konekkah", new Object[] {_ba}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub KonekKah()As Boolean";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="myh.Initialize(nmServer, nmDbase ,nmUser,nmPass)";
_myh.Initialize(_nmserver,_nmdbase,_nmuser,_nmpass);
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="If myh.isConnected=False Then";
if (_myh.isConnected==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Msgbox(\"gk konek\",\"Koneksi Database\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("gk konek"),BA.ObjectToCharSequence("Koneksi Database"),_ba);
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 }else {
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="End Sub";
return false;
}
public static String  _koneksi(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mdl_koneksi";
if (Debug.shouldDelegate(null, "koneksi", false))
	 {return ((String) Debug.delegate(null, "koneksi", new Object[] {_ba}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub Koneksi";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="myh.Initialize(nmServer, nmDbase ,nmUser,nmPass)";
_myh.Initialize(_nmserver,_nmdbase,_nmuser,_nmpass);
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="If myh.isConnected=False Then";
if (_myh.isConnected==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Msgbox(\"gk konek\",\"info\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("gk konek"),BA.ObjectToCharSequence("info"),_ba);
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 }else {
 };
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="Return";
if (true) return "";
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="End Sub";
return "";
}
public static boolean  _setproc(anywheresoftware.b4a.BA _ba,String _qs) throws Exception{
RDebugUtils.currentModule="mdl_koneksi";
if (Debug.shouldDelegate(null, "setproc", false))
	 {return ((Boolean) Debug.delegate(null, "setproc", new Object[] {_ba,_qs}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub SetProc(qs As String)As Boolean";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="If KonekKah=False Then Return False";
if (_konekkah(_ba)==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="myh.Exec(qs)";
_myh.Exec(_qs);
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="myh.Close";
_myh.Close();
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="End Sub";
return false;
}
}