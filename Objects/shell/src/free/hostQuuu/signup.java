
package free.hostQuuu;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class signup implements IRemote{
	public static signup mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public signup() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("signup"), "free.hostQuuu.signup");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, signup.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _tuser = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _tpass = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _talamat = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _tnama = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _ttelp = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _lpilihpic = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _fd = RemoteObject.declareNull("anywheresoftware.b4a.agraham.dialogs.InputDialog.FileDialog");
public static free.hostQuuu.main _main = null;
public static free.hostQuuu.starter _starter = null;
public static free.hostQuuu.mdl_koneksi _mdl_koneksi = null;
public static free.hostQuuu.msetting _msetting = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",signup.mostCurrent._activity,"fd",signup.mostCurrent._fd,"lPilihPic",signup.mostCurrent._lpilihpic,"Main",Debug.moduleToString(free.hostQuuu.main.class),"mdl_koneksi",Debug.moduleToString(free.hostQuuu.mdl_koneksi.class),"mSetting",Debug.moduleToString(free.hostQuuu.msetting.class),"Starter",Debug.moduleToString(free.hostQuuu.starter.class),"tAlamat",signup.mostCurrent._talamat,"tNama",signup.mostCurrent._tnama,"tPass",signup.mostCurrent._tpass,"tTelp",signup.mostCurrent._ttelp,"tUser",signup.mostCurrent._tuser};
}
}