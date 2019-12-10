
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xprogressbar {
    public static RemoteObject myClass;
	public b4xprogressbar() {
	}
    public static PCBA staticBA = new PCBA(null, b4xprogressbar.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _bcolor = RemoteObject.createImmutable(0);
public static RemoteObject _pcolor = RemoteObject.createImmutable(0);
public static RemoteObject _thickness = RemoteObject.createImmutable(0f);
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _vertical = RemoteObject.createImmutable(false);
public static RemoteObject _currentvalue = RemoteObject.createImmutable(0f);
public static RemoteObject _durationfromzeroto100 = RemoteObject.createImmutable(0);
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static b4j.example.main _main = null;
public static b4j.example.scorebord _scorebord = null;
public static b4j.example.func _func = null;
public static b4j.example.funcinet _funcinet = null;
public static b4j.example.parseconfig _parseconfig = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"bcolor",_ref.getField(false, "_bcolor"),"CSSUtils",_ref.getField(false, "_cssutils"),"currentValue",_ref.getField(false, "_currentvalue"),"cvs",_ref.getField(false, "_cvs"),"DateUtils",_ref.getField(false, "_dateutils"),"DurationFromZeroTo100",_ref.getField(false, "_durationfromzeroto100"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"pcolor",_ref.getField(false, "_pcolor"),"thickness",_ref.getField(false, "_thickness"),"vertical",_ref.getField(false, "_vertical"),"xui",_ref.getField(false, "_xui")};
}
}