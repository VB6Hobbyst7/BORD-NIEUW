
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class clxtoastmessage {
    public static RemoteObject myClass;
	public clxtoastmessage() {
	}
    public static PCBA staticBA = new PCBA(null, clxtoastmessage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mpanelpos = RemoteObject.createImmutable(0);
public static RemoteObject _tmlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _tempsettings = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _displaying = RemoteObject.createImmutable(false);
public static RemoteObject _fading = RemoteObject.createImmutable(false);
public static RemoteObject _timer1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _tmpos_top = RemoteObject.createImmutable(0);
public static RemoteObject _tmpos_center = RemoteObject.createImmutable(0);
public static RemoteObject _tmpos_bottom = RemoteObject.createImmutable(0);
public static RemoteObject _vpos_top = RemoteObject.createImmutable(0);
public static RemoteObject _vpos_center = RemoteObject.createImmutable(0);
public static RemoteObject _vpos_bottom = RemoteObject.createImmutable(0);
public static RemoteObject _hpos_left = RemoteObject.createImmutable(0);
public static RemoteObject _hpos_center = RemoteObject.createImmutable(0);
public static RemoteObject _hpos_right = RemoteObject.createImmutable(0);
public static RemoteObject _arhpos = null;
public static RemoteObject _arvpos = null;
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static b4j.example.main _main = null;
public static b4j.example.scorebord _scorebord = null;
public static b4j.example.func _func = null;
public static b4j.example.funcinet _funcinet = null;
public static b4j.example.parseconfig _parseconfig = null;
public static b4j.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"arHpos",_ref.getField(false, "_arhpos"),"arVpos",_ref.getField(false, "_arvpos"),"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"displaying",_ref.getField(false, "_displaying"),"fading",_ref.getField(false, "_fading"),"fx",_ref.getField(false, "_fx"),"HPOS_CENTER",_ref.getField(false, "_hpos_center"),"HPOS_LEFT",_ref.getField(false, "_hpos_left"),"HPOS_RIGHT",_ref.getField(false, "_hpos_right"),"mBase",_ref.getField(false, "_mbase"),"mLbl",_ref.getField(false, "_mlbl"),"mPanel",_ref.getField(false, "_mpanel"),"mPanelPos",_ref.getField(false, "_mpanelpos"),"tempSettings",_ref.getField(false, "_tempsettings"),"timer1",_ref.getField(false, "_timer1"),"TMList",_ref.getField(false, "_tmlist"),"TMPOS_BOTTOM",_ref.getField(false, "_tmpos_bottom"),"TMPOS_CENTER",_ref.getField(false, "_tmpos_center"),"TMPOS_TOP",_ref.getField(false, "_tmpos_top"),"VPOS_BOTTOM",_ref.getField(false, "_vpos_bottom"),"VPOS_CENTER",_ref.getField(false, "_vpos_center"),"VPOS_TOP",_ref.getField(false, "_vpos_top"),"xui",_ref.getField(false, "_xui")};
}
}