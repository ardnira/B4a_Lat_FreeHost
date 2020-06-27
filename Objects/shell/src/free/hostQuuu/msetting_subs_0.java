package free.hostQuuu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class msetting_subs_0 {


public static RemoteObject  _get(RemoteObject _ba,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("Get (msetting) ","msetting",4,_ba,msetting.mostCurrent,21);
if (RapidSub.canDelegate("get")) { return free.hostQuuu.msetting.remoteMe.runUserSub(false, "msetting","get", _ba, _key);}
;
Debug.locals.put("Key", _key);
 BA.debugLineNum = 21;BA.debugLine="Sub Get (Key As String) As String";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="If File.Exists(File.DirInternal,\"SettingQu\") Then";
Debug.ShouldStop(2097152);
if (msetting.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(msetting.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("SettingQu"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 24;BA.debugLine="Return File.ReadMap(File.DirInternal,\"SettingQu\"";
Debug.ShouldStop(8388608);
if (true) return BA.ObjectToString(msetting.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(msetting.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("SettingQu"))).runMethod(false,"Get",(Object)((_key))));
 };
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _set(RemoteObject _ba,RemoteObject _key,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Set (msetting) ","msetting",4,_ba,msetting.mostCurrent,9);
if (RapidSub.canDelegate("set")) { return free.hostQuuu.msetting.remoteMe.runUserSub(false, "msetting","set", _ba, _key, _value);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("Key", _key);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 9;BA.debugLine="Sub Set (Key As String, Value As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="Dim M As Map";
Debug.ShouldStop(512);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("M", _m);
 BA.debugLineNum = 11;BA.debugLine="If File.Exists(File.DirInternal,\"SettingQu\") Then";
Debug.ShouldStop(1024);
if (msetting.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(msetting.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("SettingQu"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 12;BA.debugLine="M = File.ReadMap(File.DirInternal,\"SettingQu\")";
Debug.ShouldStop(2048);
_m = msetting.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(msetting.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("SettingQu")));Debug.locals.put("M", _m);
 }else {
 BA.debugLineNum = 14;BA.debugLine="M.Initialize";
Debug.ShouldStop(8192);
_m.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 17;BA.debugLine="M.Put(Key,Value)";
Debug.ShouldStop(65536);
_m.runVoidMethod ("Put",(Object)((_key)),(Object)((_value)));
 BA.debugLineNum = 18;BA.debugLine="File.WriteMap(File.DirInternal,\"SettingQu\",M)";
Debug.ShouldStop(131072);
msetting.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(msetting.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("SettingQu")),(Object)(_m));
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}