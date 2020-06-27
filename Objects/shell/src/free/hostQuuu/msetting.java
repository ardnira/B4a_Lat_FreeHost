
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

public class msetting implements IRemote{
	public static msetting mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public msetting() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, msetting.class);
    static {
		mostCurrent = new msetting();
        remoteMe = RemoteObject.declareNull("free.hostQuuu.msetting");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("msetting"), "free.hostQuuu.msetting");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("free.hostQuuu.msetting"), new java.lang.ref.WeakReference<PCBA> (pcBA));
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
public static free.hostQuuu.main _main = null;
public static free.hostQuuu.starter _starter = null;
public static free.hostQuuu.mdl_koneksi _mdl_koneksi = null;
public static free.hostQuuu.signup _signup = null;
  public Object[] GetGlobals() {
		return new Object[] {"Main",Debug.moduleToString(free.hostQuuu.main.class),"mdl_koneksi",Debug.moduleToString(free.hostQuuu.mdl_koneksi.class),"SignUp",Debug.moduleToString(free.hostQuuu.signup.class),"Starter",Debug.moduleToString(free.hostQuuu.starter.class)};
}
}