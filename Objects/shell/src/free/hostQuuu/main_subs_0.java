package free.hostQuuu;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,27);
if (RapidSub.canDelegate("activity_create")) { return free.hostQuuu.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="Activity.LoadLayout(\"lay_login\")";
Debug.ShouldStop(268435456);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("lay_login")),main.mostCurrent.activityBA);
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,37);
if (RapidSub.canDelegate("activity_pause")) { return free.hostQuuu.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,33);
if (RapidSub.canDelegate("activity_resume")) { return free.hostQuuu.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Resume";
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
public static RemoteObject  _bt_exit_click() throws Exception{
try {
		Debug.PushSubsStack("bt_Exit_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,49);
if (RapidSub.canDelegate("bt_exit_click")) { return free.hostQuuu.main.remoteMe.runUserSub(false, "main","bt_exit_click");}
 BA.debugLineNum = 49;BA.debugLine="Sub bt_Exit_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="ExitApplication";
Debug.ShouldStop(131072);
main.mostCurrent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lsignup_click() throws Exception{
try {
		Debug.PushSubsStack("lSignUp_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,43);
if (RapidSub.canDelegate("lsignup_click")) { return free.hostQuuu.main.remoteMe.runUserSub(false, "main","lsignup_click");}
 BA.debugLineNum = 43;BA.debugLine="Sub lSignUp_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2048);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 45;BA.debugLine="StartActivity(SignUp)";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._signup.getObject())));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
mdl_koneksi_subs_0._process_globals();
signup_subs_0._process_globals();
msetting_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("free.hostQuuu.main");
starter.myClass = BA.getDeviceClass ("free.hostQuuu.starter");
mdl_koneksi.myClass = BA.getDeviceClass ("free.hostQuuu.mdl_koneksi");
signup.myClass = BA.getDeviceClass ("free.hostQuuu.signup");
msetting.myClass = BA.getDeviceClass ("free.hostQuuu.msetting");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}