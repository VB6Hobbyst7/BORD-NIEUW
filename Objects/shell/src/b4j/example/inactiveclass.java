
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class inactiveclass {
    public static RemoteObject myClass;
	public inactiveclass() {
	}
    public static PCBA staticBA = new PCBA(null, inactiveclass.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _tmr = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _tmr_draw_promote = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _minute = RemoteObject.createImmutable(0L);
public static RemoteObject _timeoutperiode = RemoteObject.createImmutable(0);
public static RemoteObject _lastclick = RemoteObject.createImmutable(0L);
public static RemoteObject _timediff = RemoteObject.createImmutable(0L);
public static RemoteObject _frm = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _pn_promote = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _currentx = RemoteObject.createImmutable(0);
public static RemoteObject _currenty = RemoteObject.createImmutable(0);
public static RemoteObject _vx = RemoteObject.createImmutable(0);
public static RemoteObject _vy = RemoteObject.createImmutable(0);
public static RemoteObject _pnlwidth = RemoteObject.createImmutable(0);
public static RemoteObject _pnlheight = RemoteObject.createImmutable(0);
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static b4j.example.main _main = null;
public static b4j.example.scorebord _scorebord = null;
public static b4j.example.func _func = null;
public static b4j.example.funcinet _funcinet = null;
public static b4j.example.parseconfig _parseconfig = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CSSUtils",_ref.getField(false, "_cssutils"),"currentX",_ref.getField(false, "_currentx"),"currentY",_ref.getField(false, "_currenty"),"DateUtils",_ref.getField(false, "_dateutils"),"frm",_ref.getField(false, "_frm"),"fx",_ref.getField(false, "_fx"),"lastClick",_ref.getField(false, "_lastclick"),"minute",_ref.getField(false, "_minute"),"pn_promote",_ref.getField(false, "_pn_promote"),"pnlHeight",_ref.getField(false, "_pnlheight"),"pnlWidth",_ref.getField(false, "_pnlwidth"),"timeDiff",_ref.getField(false, "_timediff"),"timeOutPeriode",_ref.getField(false, "_timeoutperiode"),"tmr",_ref.getField(false, "_tmr"),"tmr_draw_promote",_ref.getField(false, "_tmr_draw_promote"),"vx",_ref.getField(false, "_vx"),"vy",_ref.getField(false, "_vy")};
}
}