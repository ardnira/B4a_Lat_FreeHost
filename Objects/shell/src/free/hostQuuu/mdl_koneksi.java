
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

public class mdl_koneksi implements IRemote{
	public static mdl_koneksi mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public mdl_koneksi() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, mdl_koneksi.class);
    static {
		mostCurrent = new mdl_koneksi();
        remoteMe = RemoteObject.declareNull("free.hostQuuu.mdl_koneksi");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("mdl_koneksi"), "free.hostQuuu.mdl_koneksi");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("free.hostQuuu.mdl_koneksi"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _myh = RemoteObject.declareNull("mysql.mysqlhandler");
public static RemoteObject _rst = RemoteObject.declareNull("mysql.mysqlhandler.ResultSetWrapper");
public static RemoteObject _nmserver = RemoteObject.createImmutable("");
public static RemoteObject _nmdbase = RemoteObject.createImmutable("");
public static RemoteObject _nmuser = RemoteObject.createImmutable("");
public static RemoteObject _nmpass = RemoteObject.createImmutable("");
public static free.hostQuuu.main _main = null;
public static free.hostQuuu.starter _starter = null;
public static free.hostQuuu.signup _signup = null;
public static free.hostQuuu.msetting _msetting = null;
  public Object[] GetGlobals() {
		return new Object[] {"Main",Debug.moduleToString(free.hostQuuu.main.class),"mSetting",Debug.moduleToString(free.hostQuuu.msetting.class),"myh",mdl_koneksi._myh,"nmDbase",mdl_koneksi._nmdbase,"nmPass",mdl_koneksi._nmpass,"nmServer",mdl_koneksi._nmserver,"nmUser",mdl_koneksi._nmuser,"rst",mdl_koneksi._rst,"SignUp",Debug.moduleToString(free.hostQuuu.signup.class),"Starter",Debug.moduleToString(free.hostQuuu.starter.class)};
}
}