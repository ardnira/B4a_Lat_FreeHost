package free.hostQuuu;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class msetting {
private static msetting mostCurrent = new msetting();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public free.hostQuuu.main _main = null;
public free.hostQuuu.starter _starter = null;
public free.hostQuuu.mdl_koneksi _mdl_koneksi = null;
public free.hostQuuu.signup _signup = null;
public static String  _get(anywheresoftware.b4a.BA _ba,String _key) throws Exception{
RDebugUtils.currentModule="msetting";
if (Debug.shouldDelegate(null, "get", false))
	 {return ((String) Debug.delegate(null, "get", new Object[] {_ba,_key}));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub Get (Key As String) As String";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="If File.Exists(File.DirInternal,\"SettingQu\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"SettingQu")) { 
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Return File.ReadMap(File.DirInternal,\"SettingQu\"";
if (true) return BA.ObjectToString(anywheresoftware.b4a.keywords.Common.File.ReadMap(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"SettingQu").Get((Object)(_key)));
 };
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="End Sub";
return "";
}
public static String  _set(anywheresoftware.b4a.BA _ba,String _key,String _value) throws Exception{
RDebugUtils.currentModule="msetting";
if (Debug.shouldDelegate(null, "set", false))
	 {return ((String) Debug.delegate(null, "set", new Object[] {_ba,_key,_value}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub Set (Key As String, Value As String)";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Dim M As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="If File.Exists(File.DirInternal,\"SettingQu\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"SettingQu")) { 
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="M = File.ReadMap(File.DirInternal,\"SettingQu\")";
_m = anywheresoftware.b4a.keywords.Common.File.ReadMap(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"SettingQu");
 }else {
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="M.Initialize";
_m.Initialize();
 };
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="M.Put(Key,Value)";
_m.Put((Object)(_key),(Object)(_value));
RDebugUtils.currentLine=1769481;
 //BA.debugLineNum = 1769481;BA.debugLine="File.WriteMap(File.DirInternal,\"SettingQu\",M)";
anywheresoftware.b4a.keywords.Common.File.WriteMap(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"SettingQu",_m);
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="End Sub";
return "";
}
}