
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class classcheckconfig {
    public static RemoteObject myClass;
	public classcheckconfig() {
	}
    public static PCBA staticBA = new PCBA(null, classcheckconfig.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _tmr = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _apppath = RemoteObject.createImmutable("");
public static RemoteObject _cfgtimestamp = RemoteObject.createImmutable(0L);
public static RemoteObject _cfgcurrtimestamp = RemoteObject.createImmutable(0L);
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static b4j.example.main _main = null;
public static b4j.example.scorebord _scorebord = null;
public static b4j.example.func _func = null;
public static b4j.example.funcinet _funcinet = null;
public static b4j.example.parseconfig _parseconfig = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"appPath",_ref.getField(false, "_apppath"),"cfgCurrTimeStamp",_ref.getField(false, "_cfgcurrtimestamp"),"cfgTimeStamp",_ref.getField(false, "_cfgtimestamp"),"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"fx",_ref.getField(false, "_fx"),"tmr",_ref.getField(false, "_tmr")};
}
}