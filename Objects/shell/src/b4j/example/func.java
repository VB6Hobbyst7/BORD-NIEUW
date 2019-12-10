
package b4j.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class func implements IRemote{
	public static func mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public func() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new func();
		remoteMe = RemoteObject.declareNull("b4j.example.func");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("func"), "b4j.example.func");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, func.class);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
    public static RemoteObject getObject() {
		return myClass;
	 }
	public PCBA create(Object[] args) throws ClassNotFoundException{
		ba = (RemoteObject) args[1];
		pcBA = new PCBA(this, func.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _regexstr = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
public static RemoteObject _timelastclick = RemoteObject.createImmutable(0L);
public static RemoteObject _hasinternetaccess = RemoteObject.createImmutable(false);
public static RemoteObject _scoreplayerone = RemoteObject.createImmutable(0);
public static RemoteObject _scoreplayertwo = RemoteObject.createImmutable(0);
public static RemoteObject _innigs = RemoteObject.createImmutable(0);
public static RemoteObject _inngset = RemoteObject.createImmutable(0);
public static RemoteObject _make = RemoteObject.createImmutable(0);
public static RemoteObject _playeronehs = RemoteObject.createImmutable(0);
public static RemoteObject _playertwohs = RemoteObject.createImmutable(0);
public static RemoteObject _score = RemoteObject.createImmutable(0);
public static RemoteObject _playeronetomake = RemoteObject.createImmutable(0);
public static RemoteObject _playertwotomake = RemoteObject.createImmutable(0);
public static RemoteObject _p1hstemp = RemoteObject.createImmutable(0);
public static RemoteObject _p2hstemp = RemoteObject.createImmutable(0);
public static RemoteObject _lblinnings = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbl_player_one_hs = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbl_player_two_hs = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _p1_1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _p1_10 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _p1_100 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _p1_1000 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _p1_moyenne = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _p2_1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _p2_10 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _p2_100 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _p2_1000 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _p2_moyenne = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _p1_progress = RemoteObject.createImmutable(0f);
public static RemoteObject _p2_progress = RemoteObject.createImmutable(0f);
public static RemoteObject _p1_progressbar = RemoteObject.declareNull("b4j.example.b4xprogressbar");
public static RemoteObject _p2_progressbar = RemoteObject.declareNull("b4j.example.b4xprogressbar");
public static RemoteObject _txtscore = RemoteObject.createImmutable("");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static b4j.example.main _main = null;
public static b4j.example.scorebord _scorebord = null;
public static b4j.example.funcinet _funcinet = null;
public static b4j.example.parseconfig _parseconfig = null;
public static b4j.example.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"CSSUtils",func._cssutils,"DateUtils",func._dateutils,"funcInet",Debug.moduleToString(b4j.example.funcinet.class),"fx",func._fx,"hasInternetAccess",func._hasinternetaccess,"HttpUtils2Service",Debug.moduleToString(b4j.example.httputils2service.class),"inngSet",func._inngset,"innigs",func._innigs,"lbl_player_one_hs",func._lbl_player_one_hs,"lbl_player_two_hs",func._lbl_player_two_hs,"lblInnings",func._lblinnings,"Main",Debug.moduleToString(b4j.example.main.class),"make",func._make,"p1_1",func._p1_1,"p1_10",func._p1_10,"p1_100",func._p1_100,"p1_1000",func._p1_1000,"p1_moyenne",func._p1_moyenne,"p1_progress",func._p1_progress,"p1_progressBar",func._p1_progressbar,"p1HsTemp",func._p1hstemp,"p2_1",func._p2_1,"p2_10",func._p2_10,"p2_100",func._p2_100,"p2_1000",func._p2_1000,"p2_moyenne",func._p2_moyenne,"p2_progress",func._p2_progress,"p2_progressBar",func._p2_progressbar,"p2HsTemp",func._p2hstemp,"parseConfig",Debug.moduleToString(b4j.example.parseconfig.class),"playerOneHs",func._playeronehs,"playerOneToMake",func._playeronetomake,"playerTwoHs",func._playertwohs,"playerTwoToMake",func._playertwotomake,"regexStr",func._regexstr,"score",func._score,"scorebord",Debug.moduleToString(b4j.example.scorebord.class),"scorePlayerOne",func._scoreplayerone,"scorePlayerTwo",func._scoreplayertwo,"timeLastClick",func._timelastclick,"txtScore",func._txtscore};
}
}