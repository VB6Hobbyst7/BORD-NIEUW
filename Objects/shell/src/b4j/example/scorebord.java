
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

public class scorebord implements IRemote{
	public static scorebord mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public scorebord() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new scorebord();
		remoteMe = RemoteObject.declareNull("b4j.example.scorebord");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("scorebord"), "b4j.example.scorebord");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, scorebord.class);
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
		pcBA = new PCBA(this, scorebord.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _dialog = RemoteObject.declareNull("b4j.example.b4xdialog");
public static RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _frm = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _inactivecls = RemoteObject.declareNull("b4j.example.inactiveclass");
public static RemoteObject _clscheckcfg = RemoteObject.declareNull("b4j.example.classcheckconfig");
public static RemoteObject _clstoast = RemoteObject.declareNull("b4j.example.clxtoastmessage");
public static RemoteObject _pn_promote_top = RemoteObject.createImmutable(0);
public static RemoteObject _pn_promote_left = RemoteObject.createImmutable(0);
public static RemoteObject _promoterunning = RemoteObject.createImmutable(false);
public static RemoteObject _pnieuwepartij = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pnieuwepartijdialog = RemoteObject.declareNull("b4j.example.b4xdialog");
public static RemoteObject _lbl_innings = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbl_player_one_10 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbl_player_one_1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbl_player_one_100 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbl_player_one_moyenne = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbl_player_two_moyenne = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbl_player_two_100 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbl_player_two_10 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbl_player_two_1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _btn_exit = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_player_one_name = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_player_two_name = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_player_one_perc = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbl_player_one_make_100 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbl_player_one_make_10 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbl_player_one_make_1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbl_player_two_make_100 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbl_player_two_make_10 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbl_player_two_make_1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbl_player_two_perc = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbl_reset = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _jxui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _lbl_player_one_hs = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbl_player_two_hs = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbl_clock = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _clstmr = RemoteObject.declareNull("b4j.example.timerclass");
public static RemoteObject _label7 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _edt_speler_a = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _edt_temaken_a = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _edt_speler_b = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _edt_temaken_b = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _btn_a_begint = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btn_b_begint = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _b4xprogressbarp1 = RemoteObject.declareNull("b4j.example.b4xprogressbar");
public static RemoteObject _b4xprogressbarp2 = RemoteObject.declareNull("b4j.example.b4xprogressbar");
public static RemoteObject _btn_nieuwe_partij = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btn_annuleer_nieuwe_partij = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _label6 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbl_close = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _chk_add_player = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
public static RemoteObject _img_random = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
public static RemoteObject _pn_p1_carom = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _pn_promote = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _lbl_config_update = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static b4j.example.main _main = null;
public static b4j.example.func _func = null;
public static b4j.example.funcinet _funcinet = null;
public static b4j.example.parseconfig _parseconfig = null;
public static b4j.example.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"B4XProgressBarP1",scorebord._b4xprogressbarp1,"B4XProgressBarP2",scorebord._b4xprogressbarp2,"Base",scorebord._base,"btn_a_begint",scorebord._btn_a_begint,"btn_annuleer_nieuwe_partij",scorebord._btn_annuleer_nieuwe_partij,"btn_b_begint",scorebord._btn_b_begint,"btn_exit",scorebord._btn_exit,"btn_nieuwe_partij",scorebord._btn_nieuwe_partij,"chk_add_player",scorebord._chk_add_player,"clsCheckCfg",scorebord._clscheckcfg,"clsTmr",scorebord._clstmr,"clsToast",scorebord._clstoast,"CSSUtils",scorebord._cssutils,"DateUtils",scorebord._dateutils,"Dialog",scorebord._dialog,"edt_speler_a",scorebord._edt_speler_a,"edt_speler_b",scorebord._edt_speler_b,"edt_temaken_a",scorebord._edt_temaken_a,"edt_temaken_b",scorebord._edt_temaken_b,"frm",scorebord._frm,"func",Debug.moduleToString(b4j.example.func.class),"funcInet",Debug.moduleToString(b4j.example.funcinet.class),"fx",scorebord._fx,"HttpUtils2Service",Debug.moduleToString(b4j.example.httputils2service.class),"img_random",scorebord._img_random,"inactivecls",scorebord._inactivecls,"jxui",scorebord._jxui,"Label6",scorebord._label6,"Label7",scorebord._label7,"lbl_clock",scorebord._lbl_clock,"lbl_close",scorebord._lbl_close,"lbl_config_update",scorebord._lbl_config_update,"lbl_innings",scorebord._lbl_innings,"lbl_player_one_1",scorebord._lbl_player_one_1,"lbl_player_one_10",scorebord._lbl_player_one_10,"lbl_player_one_100",scorebord._lbl_player_one_100,"lbl_player_one_hs",scorebord._lbl_player_one_hs,"lbl_player_one_make_1",scorebord._lbl_player_one_make_1,"lbl_player_one_make_10",scorebord._lbl_player_one_make_10,"lbl_player_one_make_100",scorebord._lbl_player_one_make_100,"lbl_player_one_moyenne",scorebord._lbl_player_one_moyenne,"lbl_player_one_name",scorebord._lbl_player_one_name,"lbl_player_one_perc",scorebord._lbl_player_one_perc,"lbl_player_two_1",scorebord._lbl_player_two_1,"lbl_player_two_10",scorebord._lbl_player_two_10,"lbl_player_two_100",scorebord._lbl_player_two_100,"lbl_player_two_hs",scorebord._lbl_player_two_hs,"lbl_player_two_make_1",scorebord._lbl_player_two_make_1,"lbl_player_two_make_10",scorebord._lbl_player_two_make_10,"lbl_player_two_make_100",scorebord._lbl_player_two_make_100,"lbl_player_two_moyenne",scorebord._lbl_player_two_moyenne,"lbl_player_two_name",scorebord._lbl_player_two_name,"lbl_player_two_perc",scorebord._lbl_player_two_perc,"lbl_reset",scorebord._lbl_reset,"Main",Debug.moduleToString(b4j.example.main.class),"parseConfig",Debug.moduleToString(b4j.example.parseconfig.class),"pn_p1_carom",scorebord._pn_p1_carom,"pn_promote",scorebord._pn_promote,"pn_promote_left",scorebord._pn_promote_left,"pn_promote_top",scorebord._pn_promote_top,"pNieuwePartij",scorebord._pnieuwepartij,"pNieuwePartijDialog",scorebord._pnieuwepartijdialog,"promoteRunning",scorebord._promoterunning,"XUI",scorebord._xui};
}
}