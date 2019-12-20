package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class scorebord extends Object{
public static scorebord mostCurrent = new scorebord();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.scorebord", null);
		ba.loadHtSubs(scorebord.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.scorebord", ba);
		}
	}
    public static Class<?> getObject() {
		return scorebord.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.b4xdialog _dialog = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
public static anywheresoftware.b4j.objects.Form _frm = null;
public static b4j.example.inactiveclass _inactivecls = null;
public static b4j.example.classcheckconfig _clscheckcfg = null;
public static b4j.example.clxtoastmessage _clstoast = null;
public static b4j.example.classupdate _clsupdate = null;
public static double _pn_promote_top = 0;
public static double _pn_promote_left = 0;
public static boolean _promoterunning = false;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_innings = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_one_moyenne = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_two_moyenne = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_two_100 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_two_10 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_two_1 = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lbl_player_one_name = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lbl_player_two_name = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_one_perc = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_one_make_100 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_one_make_10 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_one_make_1 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_two_make_100 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_two_make_10 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_two_make_1 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_two_perc = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lbl_reset = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_one_hs = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_two_hs = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lbl_clock = null;
public static b4j.example.timerclass _clstmr = null;
public static anywheresoftware.b4j.objects.LabelWrapper _label7 = null;
public static b4j.example.b4xprogressbar _b4xprogressbarp1 = null;
public static b4j.example.b4xprogressbar _b4xprogressbarp2 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _label6 = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lbl_close = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pn_p1_carom = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pn_promote = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_config_update = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_one_1 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_one_10 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_one_100 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_message_1 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_message_2 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_message_3 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_message_4 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_message_5 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_version = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pn_sponsore = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pn_game = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_game_text = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.main _main = null;
public static b4j.example.nieuwe_partij _nieuwe_partij = null;
public static b4j.example.func _func = null;
public static b4j.example.parseconfig _parseconfig = null;
public static b4j.example.getnode _getnode = null;
public static b4j.example.funcinet _funcinet = null;
public static b4j.example.httputils2service _httputils2service = null;
public static void  _show() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_show rsub = new ResumableSub_show(null);
rsub.resume(ba, null);
}
public static class ResumableSub_show extends BA.ResumableSub {
public ResumableSub_show(b4j.example.scorebord parent) {
this.parent = parent;
}
b4j.example.scorebord parent;
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="scorebord";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="frm.Initialize(\"frm\", 1920, 1080)";
parent._frm.Initialize(ba,"frm",1920,1080);
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="frm.RootPane.LoadLayout(\"scorebord\")";
parent._frm.getRootPane().LoadLayout(ba,"scorebord");
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="frm.BackColor  =   fx.Colors.From32Bit(0xFF001A01";
parent._frm.setBackColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit((int) (0xff001a01))));
RDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
parent._frm.SetFormStyle("UTILITY");
RDebugUtils.currentLine=262155;
 //BA.debugLineNum = 262155;BA.debugLine="frm.Stylesheets.Add(File.GetUri(File.DirAssets, \"";
parent._frm.getStylesheets().Add((Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"n205.css")));
RDebugUtils.currentLine=262156;
 //BA.debugLineNum = 262156;BA.debugLine="setFontSize";
_setfontsize();
RDebugUtils.currentLine=262157;
 //BA.debugLineNum = 262157;BA.debugLine="parseConfig.pullConfig";
parent._parseconfig._pullconfig /*String*/ ();
RDebugUtils.currentLine=262159;
 //BA.debugLineNum = 262159;BA.debugLine="CallSub(nieuwe_partij, \"show\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(ba,(Object)(parent._nieuwe_partij.getObject()),"show");
RDebugUtils.currentLine=262160;
 //BA.debugLineNum = 262160;BA.debugLine="frm.Show";
parent._frm.Show();
RDebugUtils.currentLine=262161;
 //BA.debugLineNum = 262161;BA.debugLine="MouseOver(frm.RootPane)";
_mouseover((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(parent._frm.getRootPane().getObject())));
RDebugUtils.currentLine=262163;
 //BA.debugLineNum = 262163;BA.debugLine="Base = frm.RootPane";
parent._base.setObject((java.lang.Object)(parent._frm.getRootPane().getObject()));
RDebugUtils.currentLine=262164;
 //BA.debugLineNum = 262164;BA.debugLine="Dialog.Initialize (Base)";
parent._dialog._initialize /*String*/ (null,ba,parent._base);
RDebugUtils.currentLine=262167;
 //BA.debugLineNum = 262167;BA.debugLine="func.SetCustomCursor1(File.DirAssets, \"mouse.png\"";
parent._func._setcustomcursor1 /*String*/ (anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"mouse.png",370,370,(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(parent._frm.getRootPane().getObject())));
RDebugUtils.currentLine=262171;
 //BA.debugLineNum = 262171;BA.debugLine="clsTmr.Initialize(lbl_clock)";
parent._clstmr._initialize /*String*/ (null,ba,(anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(parent._lbl_clock.getObject())));
RDebugUtils.currentLine=262172;
 //BA.debugLineNum = 262172;BA.debugLine="inactivecls.Initialize";
parent._inactivecls._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=262173;
 //BA.debugLineNum = 262173;BA.debugLine="clsCheckCfg.Initialize";
parent._clscheckcfg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=262174;
 //BA.debugLineNum = 262174;BA.debugLine="clsToast.Initialize(frm.RootPane)";
parent._clstoast._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._frm.getRootPane().getObject())));
RDebugUtils.currentLine=262175;
 //BA.debugLineNum = 262175;BA.debugLine="clsUpdate.Initialize";
parent._clsupdate._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=262176;
 //BA.debugLineNum = 262176;BA.debugLine="lbl_version.Text = func.getVersion";
parent._lbl_version.setText(parent._func._getversion /*String*/ ());
RDebugUtils.currentLine=262177;
 //BA.debugLineNum = 262177;BA.debugLine="func.lblInnings = lbl_innings";
parent._func._lblinnings /*anywheresoftware.b4j.objects.LabelWrapper*/  = parent._lbl_innings;
RDebugUtils.currentLine=262178;
 //BA.debugLineNum = 262178;BA.debugLine="func.lbl_player_one_hs = lbl_player_one_hs";
parent._func._lbl_player_one_hs /*anywheresoftware.b4j.objects.LabelWrapper*/  = parent._lbl_player_one_hs;
RDebugUtils.currentLine=262179;
 //BA.debugLineNum = 262179;BA.debugLine="func.lbl_player_two_hs = lbl_player_two_hs";
parent._func._lbl_player_two_hs /*anywheresoftware.b4j.objects.LabelWrapper*/  = parent._lbl_player_two_hs;
RDebugUtils.currentLine=262181;
 //BA.debugLineNum = 262181;BA.debugLine="func.setP1CaromLables(lstPlayerOneScoreLbl)";
parent._func._setp1caromlables /*String*/ (_lstplayeronescorelbl());
RDebugUtils.currentLine=262182;
 //BA.debugLineNum = 262182;BA.debugLine="func.setP2CaromLables(lstPlayerTwoScoreLbl)";
parent._func._setp2caromlables /*String*/ (_lstplayertwoscorelbl());
RDebugUtils.currentLine=262184;
 //BA.debugLineNum = 262184;BA.debugLine="Wait For (funcInet.testInet) Complete (result As";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "show"), parent._funcinet._testinet /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (boolean) result[0];
;
RDebugUtils.currentLine=262185;
 //BA.debugLineNum = 262185;BA.debugLine="If result Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_result) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=262186;
 //BA.debugLineNum = 262186;BA.debugLine="func.hasInternetAccess = True";
parent._func._hasinternetaccess /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=262187;
 //BA.debugLineNum = 262187;BA.debugLine="clsUpdate.checkUpdate";
parent._clsupdate._checkupdate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=262189;
 //BA.debugLineNum = 262189;BA.debugLine="func.hasInternetAccess = False";
parent._func._hasinternetaccess /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=262192;
 //BA.debugLineNum = 262192;BA.debugLine="initPanels";
_initpanels();
RDebugUtils.currentLine=262194;
 //BA.debugLineNum = 262194;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "application_error", false))
	 {return ((Boolean) Debug.delegate(ba, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return false;
}
public static String  _btn_a_begint_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "btn_a_begint_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "btn_a_begint_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub btn_a_begint_MouseReleased (EventData As Mouse";
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="End Sub";
return "";
}
public static String  _btn_b_begint_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "btn_b_begint_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "btn_b_begint_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub btn_b_begint_MouseReleased (EventData As Mouse";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="End Sub";
return "";
}
public static String  _btn_exit_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "btn_exit_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "btn_exit_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub btn_exit_MouseReleased (EventData As MouseEven";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return "";
}
public static void  _checkmatchwonp1() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "checkmatchwonp1", false))
	 {Debug.delegate(ba, "checkmatchwonp1", null); return;}
ResumableSub_checkMatchWonP1 rsub = new ResumableSub_checkMatchWonP1(null);
rsub.resume(ba, null);
}
public static class ResumableSub_checkMatchWonP1 extends BA.ResumableSub {
public ResumableSub_checkMatchWonP1(b4j.example.scorebord parent) {
this.parent = parent;
}
b4j.example.scorebord parent;
int _caroms = 0;
int _make = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="scorebord";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Dim caroms, make As Int";
_caroms = 0;
_make = 0;
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="caroms = lbl_player_one_100.Text&lbl_player_one_1";
_caroms = (int)(Double.parseDouble(parent._lbl_player_one_100.getText()+parent._lbl_player_one_10.getText()+parent._lbl_player_one_1.getText()));
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="make = lbl_player_one_make_100.text&lbl_player_on";
_make = (int)(Double.parseDouble(parent._lbl_player_one_make_100.getText()+parent._lbl_player_one_make_10.getText()+parent._lbl_player_one_make_1.getText()));
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="If make = 0 Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_make==0) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="If caroms >= make Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_caroms>=_make) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="lbl_game_text.Text = $\"Gelijkmakende beurt voor";
parent._lbl_game_text.setText(("Gelijkmakende beurt voor "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._lbl_player_two_name.getText()))+""));
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="pn_game.Top = (frm.RootPane.Height/2)-(pn_game.H";
parent._pn_game.setTop((parent._frm.getRootPane().getHeight()/(double)2)-(parent._pn_game.getHeight()/(double)2));
RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="setP2Name";
_setp2name();
RDebugUtils.currentLine=2490380;
 //BA.debugLineNum = 2490380;BA.debugLine="Sleep(4000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "checkmatchwonp1"),(int) (4000));
this.state = 11;
return;
case 11:
//C
this.state = 10;
;
RDebugUtils.currentLine=2490381;
 //BA.debugLineNum = 2490381;BA.debugLine="pn_game.Top = 1650";
parent._pn_game.setTop(1650);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=2490383;
 //BA.debugLineNum = 2490383;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _setp2name() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "setp2name", false))
	 {return ((String) Debug.delegate(ba, "setp2name", null));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub setP2Name";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="lbl_player_two_name.Color = 0xff3455db'0xFF69D79A";
_lbl_player_two_name.setColor((int) (0xff3455db));
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="lbl_player_one_name.Color = 0xFF001A01";
_lbl_player_one_name.setColor((int) (0xff001a01));
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="lbl_player_one_100.Enabled = False";
_lbl_player_one_100.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="lbl_player_one_10.Enabled = False";
_lbl_player_one_10.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="lbl_player_one_1.Enabled = False";
_lbl_player_one_1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="lbl_player_two_100.Enabled = True";
_lbl_player_two_100.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="lbl_player_two_10.Enabled = True";
_lbl_player_two_10.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="lbl_player_two_1.Enabled = True";
_lbl_player_two_1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2424843;
 //BA.debugLineNum = 2424843;BA.debugLine="End Sub";
return "";
}
public static String  _checkmatchwonp2() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "checkmatchwonp2", false))
	 {return ((String) Debug.delegate(ba, "checkmatchwonp2", null));}
int _caroms = 0;
int _make = 0;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub checkMatchWonP2";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Dim caroms, make As Int";
_caroms = 0;
_make = 0;
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="caroms = lbl_player_two_100.Text&lbl_player_two_1";
_caroms = (int)(Double.parseDouble(_lbl_player_two_100.getText()+_lbl_player_two_10.getText()+_lbl_player_two_1.getText()));
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="make = lbl_player_two_make_100.text&lbl_player_tw";
_make = (int)(Double.parseDouble(_lbl_player_two_make_100.getText()+_lbl_player_two_make_10.getText()+_lbl_player_two_make_1.getText()));
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="If make = 0 Then Return";
if (_make==0) { 
if (true) return "";};
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="If caroms >= make Then";
if (_caroms>=_make) { 
 };
RDebugUtils.currentLine=2555922;
 //BA.debugLineNum = 2555922;BA.debugLine="End Sub";
return "";
}
public static void  _drawpromote(double _x,double _y) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "drawpromote", false))
	 {Debug.delegate(ba, "drawpromote", new Object[] {_x,_y}); return;}
ResumableSub_drawPromote rsub = new ResumableSub_drawPromote(null,_x,_y);
rsub.resume(ba, null);
}
public static class ResumableSub_drawPromote extends BA.ResumableSub {
public ResumableSub_drawPromote(b4j.example.scorebord parent,double _x,double _y) {
this.parent = parent;
this._x = _x;
this._y = _y;
}
b4j.example.scorebord parent;
double _x;
double _y;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="scorebord";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="pn_promote.SetLayoutAnimated(0, x, y, pn_promote.";
parent._pn_promote.SetLayoutAnimated((int) (0),_x,_y,parent._pn_promote.getWidth(),parent._pn_promote.getHeight());
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "drawpromote"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _hideform(boolean _hide) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "hideform", false))
	 {return ((String) Debug.delegate(ba, "hideform", new Object[] {_hide}));}
RDebugUtils.currentLine=32047104;
 //BA.debugLineNum = 32047104;BA.debugLine="Sub hideForm(hide As Boolean)";
RDebugUtils.currentLine=32047105;
 //BA.debugLineNum = 32047105;BA.debugLine="frm.rootpane.Visible = hide";
_frm.getRootPane().setVisible(_hide);
RDebugUtils.currentLine=32047107;
 //BA.debugLineNum = 32047107;BA.debugLine="End Sub";
return "";
}
public static String  _initpanels() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "initpanels", false))
	 {return ((String) Debug.delegate(ba, "initpanels", null));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub initPanels";
RDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="pn_promote_top = 1130 'pn_promote.Top";
_pn_promote_top = 1130;
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="pn_promote_left = 20 'pn_promote.Left";
_pn_promote_left = 20;
RDebugUtils.currentLine=393228;
 //BA.debugLineNum = 393228;BA.debugLine="inactivecls.frm = frm";
_inactivecls._frm /*anywheresoftware.b4j.objects.Form*/  = _frm;
RDebugUtils.currentLine=393229;
 //BA.debugLineNum = 393229;BA.debugLine="inactivecls.pn_promote = pn_promote";
_inactivecls._pn_promote /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/  = _pn_promote;
RDebugUtils.currentLine=393230;
 //BA.debugLineNum = 393230;BA.debugLine="inactivecls.pnlWidth = pn_promote.Width";
_inactivecls._pnlwidth /*double*/  = _pn_promote.getWidth();
RDebugUtils.currentLine=393231;
 //BA.debugLineNum = 393231;BA.debugLine="inactivecls.pnlHeight = pn_promote.Height";
_inactivecls._pnlheight /*double*/  = _pn_promote.getHeight();
RDebugUtils.currentLine=393232;
 //BA.debugLineNum = 393232;BA.debugLine="End Sub";
return "";
}
public static String  _lastclick() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lastclick", false))
	 {return ((String) Debug.delegate(ba, "lastclick", null));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub lastClick";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="inactivecls.lastClick = DateTime.Now";
_inactivecls._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_close_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_close_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_close_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub lbl_close_MouseReleased (EventData As MouseEve";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_innings_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_innings_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_innings_mousereleased", new Object[] {_eventdata}));}
int _points = 0;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub lbl_innings_MouseReleased (EventData As MouseE";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Dim points As Int = lbl_innings.Text";
_points = (int)(Double.parseDouble(_lbl_innings.getText()));
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="points = points + 1";
_points = (int) (_points+1);
 }else {
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="points = points - 1";
_points = (int) (_points-1);
 };
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="If points = -1 Then";
if (_points==-1) { 
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1245195;
 //BA.debugLineNum = 1245195;BA.debugLine="func.innigs = points";
_func._innigs /*int*/  = _points;
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="lbl_innings.Text = func.padString(points, \"0\", 0,";
_lbl_innings.setText(_func._padstring /*String*/ (BA.NumberToString(_points),"0",(int) (0),(int) (3)));
RDebugUtils.currentLine=1245197;
 //BA.debugLineNum = 1245197;BA.debugLine="func.calcMoyenne(lbl_player_one_moyenne, lbl_play";
_func._calcmoyenne /*String*/ (_lbl_player_one_moyenne,_lbl_player_two_moyenne);
RDebugUtils.currentLine=1245198;
 //BA.debugLineNum = 1245198;BA.debugLine="func.processHs(\"all\")";
_func._processhs /*String*/ ("all");
RDebugUtils.currentLine=1245199;
 //BA.debugLineNum = 1245199;BA.debugLine="func.inngSet = 1";
_func._inngset /*int*/  = (int) (1);
RDebugUtils.currentLine=1245201;
 //BA.debugLineNum = 1245201;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_1_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_1_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_1_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub lbl_player_one_1_MouseEntered (EventData As Mo";
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_1_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_1_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_1_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub lbl_player_one_1_MouseReleased (EventData As M";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="func.calcScorePlayerOne(1)";
_func._calcscoreplayerone /*String*/ ((int) (1));
 }else 
{RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="Else If EventData.SecondaryButtonPressed Then";
if (_eventdata.getSecondaryButtonPressed()) { 
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="func.calcScorePlayerOne(-1)";
_func._calcscoreplayerone /*String*/ ((int) (-1));
 }}
;
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="End Sub";
return "";
}
public static String  _setp1name() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "setp1name", false))
	 {return ((String) Debug.delegate(ba, "setp1name", null));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub setP1Name";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="lbl_player_one_name.Color = 0xff3455db'0xFF69D79A";
_lbl_player_one_name.setColor((int) (0xff3455db));
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="lbl_player_two_name.Color = 0xFF001A01";
_lbl_player_two_name.setColor((int) (0xff001a01));
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="lbl_player_one_100.Enabled = True";
_lbl_player_one_100.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="lbl_player_one_10.Enabled = True";
_lbl_player_one_10.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="lbl_player_one_1.Enabled = True";
_lbl_player_one_1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="lbl_player_two_100.Enabled = False";
_lbl_player_two_100.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="lbl_player_two_10.Enabled = False";
_lbl_player_two_10.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2359306;
 //BA.debugLineNum = 2359306;BA.debugLine="lbl_player_two_1.Enabled = False";
_lbl_player_two_1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2359307;
 //BA.debugLineNum = 2359307;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_10_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_10_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_10_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub lbl_player_one_10_MouseReleased (EventData As";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="func.calcScorePlayerOne(10)";
_func._calcscoreplayerone /*String*/ ((int) (10));
 }else 
{RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Else If EventData.SecondaryButtonPressed Then";
if (_eventdata.getSecondaryButtonPressed()) { 
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="func.calcScorePlayerOne(-10)";
_func._calcscoreplayerone /*String*/ ((int) (-10));
 }}
;
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_100_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_100_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_100_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub lbl_player_one_100_MouseReleased (EventData As";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="func.calcScorePlayerOne(100)";
_func._calcscoreplayerone /*String*/ ((int) (100));
 }else 
{RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Else If EventData.SecondaryButtonPressed Then";
if (_eventdata.getSecondaryButtonPressed()) { 
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="func.calcScorePlayerOne(-100)";
_func._calcscoreplayerone /*String*/ ((int) (-100));
 }}
;
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_active_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_active_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_active_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub lbl_player_one_active_MouseReleased (EventData";
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_make_1_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_make_1_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_make_1_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub lbl_player_one_make_1_MouseReleased (EventData";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="func.playerOneMake(lbl_player_one_make_100, lbl_p";
_func._playeronemake /*String*/ (_lbl_player_one_make_100,_lbl_player_one_make_10,_lbl_player_one_make_1,_eventdata.getPrimaryButtonPressed(),(int) (1));
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_make_10_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_make_10_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_make_10_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub lbl_player_one_make_10_MouseReleased (EventDat";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="func.playerOneMake(lbl_player_one_make_100, lbl_p";
_func._playeronemake /*String*/ (_lbl_player_one_make_100,_lbl_player_one_make_10,_lbl_player_one_make_1,_eventdata.getPrimaryButtonPressed(),(int) (10));
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_make_100_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_make_100_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_make_100_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub lbl_player_one_make_100_MouseReleased (EventDa";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="func.playerOneMake(lbl_player_one_make_100, lbl_p";
_func._playeronemake /*String*/ (_lbl_player_one_make_100,_lbl_player_one_make_10,_lbl_player_one_make_1,_eventdata.getPrimaryButtonPressed(),(int) (100));
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_name_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_name_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_name_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub lbl_player_one_name_MouseReleased (EventData A";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="func.processHs(\"all\")";
_func._processhs /*String*/ ("all");
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_1_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_1_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_1_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub lbl_player_two_1_MouseEntered (EventData As Mo";
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_1_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_1_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_1_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub lbl_player_two_1_MouseExited (EventData As Mou";
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_1_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_1_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_1_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub lbl_player_two_1_MouseReleased (EventData As M";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="setP2Name";
_setp2name();
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="func.calcScorePlayertwo(1)";
_func._calcscoreplayertwo /*String*/ ((int) (1));
 }else 
{RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Else If EventData.SecondaryButtonPressed Then";
if (_eventdata.getSecondaryButtonPressed()) { 
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="func.calcScorePlayertwo(-1)";
_func._calcscoreplayertwo /*String*/ ((int) (-1));
 }}
;
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_10_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_10_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_10_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub lbl_player_two_10_MouseReleased (EventData As";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="setP2Name";
_setp2name();
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="func.calcScorePlayertwo(10)";
_func._calcscoreplayertwo /*String*/ ((int) (10));
 }else 
{RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="Else If EventData.SecondaryButtonPressed Then";
if (_eventdata.getSecondaryButtonPressed()) { 
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="func.calcScorePlayertwo(-10)";
_func._calcscoreplayertwo /*String*/ ((int) (-10));
 }}
;
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_100_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_100_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_100_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub lbl_player_two_100_MouseReleased (EventData As";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="setP2Name";
_setp2name();
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="func.calcScorePlayertwo(100)";
_func._calcscoreplayertwo /*String*/ ((int) (100));
 }else 
{RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="Else If EventData.SecondaryButtonPressed Then";
if (_eventdata.getSecondaryButtonPressed()) { 
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="func.calcScorePlayertwo(-100)";
_func._calcscoreplayertwo /*String*/ ((int) (-100));
 }}
;
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_make_1_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_make_1_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_make_1_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub lbl_player_two_make_1_MouseReleased (EventData";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="func.playertwoMake(lbl_player_two_make_100, lbl_p";
_func._playertwomake /*String*/ (_lbl_player_two_make_100,_lbl_player_two_make_10,_lbl_player_two_make_1,_eventdata.getPrimaryButtonPressed(),(int) (1));
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_make_10_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_make_10_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_make_10_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub lbl_player_two_make_10_MouseReleased (EventDat";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="func.playertwoMake(lbl_player_two_make_100, lbl_p";
_func._playertwomake /*String*/ (_lbl_player_two_make_100,_lbl_player_two_make_10,_lbl_player_two_make_1,_eventdata.getPrimaryButtonPressed(),(int) (10));
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_make_100_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_make_100_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_make_100_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub lbl_player_two_make_100_MouseReleased (EventDa";
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="func.playertwoMake(lbl_player_two_make_100, lbl_p";
_func._playertwomake /*String*/ (_lbl_player_two_make_100,_lbl_player_two_make_10,_lbl_player_two_make_1,_eventdata.getPrimaryButtonPressed(),(int) (100));
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_name_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_name_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_name_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub lbl_player_two_name_MouseReleased (EventData A";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="setP2Name";
_setp2name();
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="func.processHs(\"all\")";
_func._processhs /*String*/ ("all");
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="func.inngSet = 0";
_func._inngset /*int*/  = (int) (0);
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_reset_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_reset_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "lbl_reset_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub lbl_reset_MouseEntered (EventData As MouseEven";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="lbl_reset.Color =  0xFF69D79A";
_lbl_reset.setColor((int) (0xff69d79a));
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="lbl_reset.TextColor = 0xFFFFFF00";
_lbl_reset.setTextColor((int) (0xffffff00));
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_reset_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_reset_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "lbl_reset_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub lbl_reset_MouseExited (EventData As MouseEvent";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="lbl_reset.Color = 0xFFFF0000";
_lbl_reset.setColor((int) (0xffff0000));
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="lbl_reset.TextColor = 0xFFFFFFFF";
_lbl_reset.setTextColor((int) (0xffffffff));
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_reset_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_reset_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_reset_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub lbl_reset_MouseReleased (EventData As MouseEve";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="inactivecls.lastClick = DateTime.Now";
_inactivecls._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="nieuwePartij";
_nieuwepartij();
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="End Sub";
return "";
}
public static String  _nieuwepartij() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "nieuwepartij", false))
	 {return ((String) Debug.delegate(ba, "nieuwepartij", null));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub nieuwePartij";
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="If func.newGameInitialized = True Then";
if (_func._newgameinitialized /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="CallSub(nieuwe_partij, \"showForm\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(ba,(Object)(_nieuwe_partij.getObject()),"showForm");
 }else {
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="nieuwe_partij.show";
_nieuwe_partij._show /*String*/ ();
 };
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _lstplayeronescorelbl() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lstplayeronescorelbl", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "lstplayeronescorelbl", null));}
anywheresoftware.b4a.objects.collections.List _list = null;
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub lstPlayerOneScoreLbl As List";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Dim List As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="List.Initialize";
_list.Initialize();
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="List.AddAll(Array As Object(lbl_player_one_1, lbl";
_list.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_lbl_player_one_1.getObject()),(Object)(_lbl_player_one_10.getObject()),(Object)(_lbl_player_one_100.getObject()),(Object)(_lbl_player_one_moyenne.getObject()),(Object)(_b4xprogressbarp1)}));
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Return List";
if (true) return _list;
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _lstplayertwoscorelbl() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lstplayertwoscorelbl", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "lstplayertwoscorelbl", null));}
anywheresoftware.b4a.objects.collections.List _list = null;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub lstPlayerTwoScoreLbl As List";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Dim List As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="List.Initialize";
_list.Initialize();
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="List.AddAll(Array As Object(lbl_player_two_1, lbl";
_list.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_lbl_player_two_1.getObject()),(Object)(_lbl_player_two_10.getObject()),(Object)(_lbl_player_two_100.getObject()),(Object)(_lbl_player_two_moyenne.getObject()),(Object)(_b4xprogressbarp2)}));
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="Return List";
if (true) return _list;
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="End Sub";
return null;
}
public static String  _mainform_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "mainform_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "mainform_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub MainForm_MouseClicked (EventData As MouseEvent";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="If inactivecls.tmr_draw_promote.Enabled = True Th";
if (_inactivecls._tmr_draw_promote /*anywheresoftware.b4a.objects.Timer*/ .getEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="pn_promote.Top = pn_promote_top";
_pn_promote.setTop(_pn_promote_top);
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="pn_promote_left = pn_promote_left";
_pn_promote_left = _pn_promote_left;
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="inactivecls.lastClick = DateTime.Now";
_inactivecls._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="inactivecls.enableTime(True)";
_inactivecls._enabletime /*String*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="inactivecls.enablePromote(False)";
_inactivecls._enablepromote /*String*/ (null,anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=3866633;
 //BA.debugLineNum = 3866633;BA.debugLine="End Sub";
return "";
}
public static void  _mousein_event(String _m,Object[] _args) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "mousein_event", false))
	 {Debug.delegate(ba, "mousein_event", new Object[] {_m,_args}); return;}
ResumableSub_mouseIn_Event rsub = new ResumableSub_mouseIn_Event(null,_m,_args);
rsub.resume(ba, null);
}
public static class ResumableSub_mouseIn_Event extends BA.ResumableSub {
public ResumableSub_mouseIn_Event(b4j.example.scorebord parent,String _m,Object[] _args) {
this.parent = parent;
this._m = _m;
this._args = _args;
}
b4j.example.scorebord parent;
String _m;
Object[] _args;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="scorebord";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="If promoteRunning = True Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._promoterunning==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="pn_promote.Top = pn_promote_top";
parent._pn_promote.setTop(parent._pn_promote_top);
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="pn_promote.left = pn_promote_left";
parent._pn_promote.setLeft(parent._pn_promote_left);
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "mousein_event"),(int) (0));
this.state = 5;
return;
case 5:
//C
this.state = 4;
;
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="inactivecls.lastClick = DateTime.Now";
parent._inactivecls._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=3670022;
 //BA.debugLineNum = 3670022;BA.debugLine="inactivecls.enableTime(True)";
parent._inactivecls._enabletime /*String*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="inactivecls.enablePromote(False)";
parent._inactivecls._enablepromote /*String*/ (null,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3670024;
 //BA.debugLineNum = 3670024;BA.debugLine="promoteRunning = False";
parent._promoterunning = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=3670025;
 //BA.debugLineNum = 3670025;BA.debugLine="Sleep(300)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "mousein_event"),(int) (300));
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=3670027;
 //BA.debugLineNum = 3670027;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _mouseover(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n1) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "mouseover", false))
	 {return ((String) Debug.delegate(ba, "mouseover", new Object[] {_n1}));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="private Sub MouseOver(n1 As Node)";
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="setHandler(n1,\"setOnMouseMoved\",\"mouseIn\")";
_sethandler((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_n1.getObject())),"setOnMouseMoved","mouseIn");
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="setHandler(n1,\"setOnMouseExited\",\"mouseOut\")";
_sethandler((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_n1.getObject())),"setOnMouseExited","mouseOut");
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="End Sub";
return "";
}
public static String  _sethandler(anywheresoftware.b4j.object.JavaObject _ob,String _eventname,String _handlername) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "sethandler", false))
	 {return ((String) Debug.delegate(ba, "sethandler", new Object[] {_ob,_eventname,_handlername}));}
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="private Sub setHandler(ob As JavaObject,eventName";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="ob.RunMethod(eventName, Array(ob.CreateEventFromU";
_ob.RunMethod(_eventname,new Object[]{_ob.CreateEventFromUI(ba,"javafx.event.EventHandler",_handlername,(Object)(anywheresoftware.b4a.keywords.Common.True))});
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="End Sub";
return "";
}
public static String  _playeroneperc(String _perc) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "playeroneperc", false))
	 {return ((String) Debug.delegate(ba, "playeroneperc", new Object[] {_perc}));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub playerOnePerc(perc As String)";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="lbl_player_one_perc.Text = perc";
_lbl_player_one_perc.setText(_perc);
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="End Sub";
return "";
}
public static String  _playertwoperc(String _perc) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "playertwoperc", false))
	 {return ((String) Debug.delegate(ba, "playertwoperc", new Object[] {_perc}));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub playerTwoPerc(perc As String)";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="lbl_player_two_perc.Text = perc";
_lbl_player_two_perc.setText(_perc);
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public static String  _resetboard() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "resetboard", false))
	 {return ((String) Debug.delegate(ba, "resetboard", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub resetBoard";
RDebugUtils.currentLine=2293773;
 //BA.debugLineNum = 2293773;BA.debugLine="setCaromNumber(lbl_player_one_1, \"0\")";
_setcaromnumber((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl_player_one_1.getObject())),"0");
RDebugUtils.currentLine=2293775;
 //BA.debugLineNum = 2293775;BA.debugLine="setCaromNumber(lbl_player_one_10, \"0\")";
_setcaromnumber((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl_player_one_10.getObject())),"0");
RDebugUtils.currentLine=2293777;
 //BA.debugLineNum = 2293777;BA.debugLine="setCaromNumber(lbl_player_one_100, \"0\")";
_setcaromnumber((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl_player_one_100.getObject())),"0");
RDebugUtils.currentLine=2293780;
 //BA.debugLineNum = 2293780;BA.debugLine="lbl_player_one_1.Text = \"0\"";
_lbl_player_one_1.setText("0");
RDebugUtils.currentLine=2293781;
 //BA.debugLineNum = 2293781;BA.debugLine="lbl_player_one_make_100.Text = \"0\"";
_lbl_player_one_make_100.setText("0");
RDebugUtils.currentLine=2293782;
 //BA.debugLineNum = 2293782;BA.debugLine="lbl_player_one_make_10.Text = \"0\"";
_lbl_player_one_make_10.setText("0");
RDebugUtils.currentLine=2293783;
 //BA.debugLineNum = 2293783;BA.debugLine="lbl_player_one_make_1.Text = \"0\"";
_lbl_player_one_make_1.setText("0");
RDebugUtils.currentLine=2293784;
 //BA.debugLineNum = 2293784;BA.debugLine="lbl_player_one_moyenne.Text = \"0.000\"";
_lbl_player_one_moyenne.setText("0.000");
RDebugUtils.currentLine=2293785;
 //BA.debugLineNum = 2293785;BA.debugLine="lbl_player_one_perc.Text = \"0.00%\"";
_lbl_player_one_perc.setText("0.00%");
RDebugUtils.currentLine=2293787;
 //BA.debugLineNum = 2293787;BA.debugLine="lbl_innings.Text = \"000\"";
_lbl_innings.setText("000");
RDebugUtils.currentLine=2293790;
 //BA.debugLineNum = 2293790;BA.debugLine="lbl_player_two_100.Text = \"0\"";
_lbl_player_two_100.setText("0");
RDebugUtils.currentLine=2293791;
 //BA.debugLineNum = 2293791;BA.debugLine="lbl_player_two_10.Text = \"0\"";
_lbl_player_two_10.setText("0");
RDebugUtils.currentLine=2293792;
 //BA.debugLineNum = 2293792;BA.debugLine="lbl_player_two_1.Text = \"0\"";
_lbl_player_two_1.setText("0");
RDebugUtils.currentLine=2293793;
 //BA.debugLineNum = 2293793;BA.debugLine="lbl_player_two_make_100.Text = \"0\"";
_lbl_player_two_make_100.setText("0");
RDebugUtils.currentLine=2293794;
 //BA.debugLineNum = 2293794;BA.debugLine="lbl_player_two_make_10.Text = \"0\"";
_lbl_player_two_make_10.setText("0");
RDebugUtils.currentLine=2293795;
 //BA.debugLineNum = 2293795;BA.debugLine="lbl_player_two_make_1.Text = \"0\"";
_lbl_player_two_make_1.setText("0");
RDebugUtils.currentLine=2293796;
 //BA.debugLineNum = 2293796;BA.debugLine="lbl_player_two_perc.Text = \"0.00%\"";
_lbl_player_two_perc.setText("0.00%");
RDebugUtils.currentLine=2293797;
 //BA.debugLineNum = 2293797;BA.debugLine="lbl_player_two_moyenne.Text = \"0.000\"";
_lbl_player_two_moyenne.setText("0.000");
RDebugUtils.currentLine=2293798;
 //BA.debugLineNum = 2293798;BA.debugLine="lbl_player_one_hs.Text = \"000\"";
_lbl_player_one_hs.setText("000");
RDebugUtils.currentLine=2293799;
 //BA.debugLineNum = 2293799;BA.debugLine="lbl_player_two_hs.Text = \"000\"";
_lbl_player_two_hs.setText("000");
RDebugUtils.currentLine=2293801;
 //BA.debugLineNum = 2293801;BA.debugLine="func.inngSet = 0";
_func._inngset /*int*/  = (int) (0);
RDebugUtils.currentLine=2293802;
 //BA.debugLineNum = 2293802;BA.debugLine="func.innigs = 0";
_func._innigs /*int*/  = (int) (0);
RDebugUtils.currentLine=2293803;
 //BA.debugLineNum = 2293803;BA.debugLine="func.scorePlayerOne = 0";
_func._scoreplayerone /*int*/  = (int) (0);
RDebugUtils.currentLine=2293804;
 //BA.debugLineNum = 2293804;BA.debugLine="func.scorePlayerTwo = 0";
_func._scoreplayertwo /*int*/  = (int) (0);
RDebugUtils.currentLine=2293805;
 //BA.debugLineNum = 2293805;BA.debugLine="func.playerOneToMake = 0";
_func._playeronetomake /*int*/  = (int) (0);
RDebugUtils.currentLine=2293806;
 //BA.debugLineNum = 2293806;BA.debugLine="func.playertwoToMake = 0";
_func._playertwotomake /*int*/  = (int) (0);
RDebugUtils.currentLine=2293807;
 //BA.debugLineNum = 2293807;BA.debugLine="func.playerOneHs = 0";
_func._playeronehs /*int*/  = (int) (0);
RDebugUtils.currentLine=2293808;
 //BA.debugLineNum = 2293808;BA.debugLine="func.playerTwoHs = 0";
_func._playertwohs /*int*/  = (int) (0);
RDebugUtils.currentLine=2293809;
 //BA.debugLineNum = 2293809;BA.debugLine="func.p1HsTemp = 0";
_func._p1hstemp /*int*/  = (int) (0);
RDebugUtils.currentLine=2293810;
 //BA.debugLineNum = 2293810;BA.debugLine="func.p2HsTemp = 0";
_func._p2hstemp /*int*/  = (int) (0);
RDebugUtils.currentLine=2293811;
 //BA.debugLineNum = 2293811;BA.debugLine="B4XProgressBarP1.Progress = 0";
_b4xprogressbarp1._setprogress /*float*/ (null,(float) (0));
RDebugUtils.currentLine=2293812;
 //BA.debugLineNum = 2293812;BA.debugLine="B4XProgressBarP2.Progress = 0";
_b4xprogressbarp2._setprogress /*float*/ (null,(float) (0));
RDebugUtils.currentLine=2293813;
 //BA.debugLineNum = 2293813;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=2293815;
 //BA.debugLineNum = 2293815;BA.debugLine="End Sub";
return "";
}
public static String  _setcaromnumber(anywheresoftware.b4a.objects.B4XViewWrapper _v,String _value) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "setcaromnumber", false))
	 {return ((String) Debug.delegate(ba, "setcaromnumber", new Object[] {_v,_value}));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub setCaromNumber(v As B4XView, value As String)";
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="v.Text = value";
_v.setText(_value);
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="End Sub";
return "";
}
public static String  _setclearboard(boolean _clear) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "setclearboard", false))
	 {return ((String) Debug.delegate(ba, "setclearboard", new Object[] {_clear}));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Public Sub setClearBoard(clear As Boolean)";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="func.setNieuwePartij = clear";
_func._setnieuwepartij /*boolean*/  = _clear;
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="End Sub";
return "";
}
public static String  _setfontsize() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "setfontsize", false))
	 {return ((String) Debug.delegate(ba, "setfontsize", null));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub setFontSize";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="func.caromLabelCss(lbl_innings, \"labelCarom\")";
_func._caromlabelcss /*String*/ (_lbl_innings,"labelCarom");
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="func.caromLabelCss(lbl_player_one_name, \"labelCar";
_func._caromlabelcss /*String*/ ((anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_lbl_player_one_name.getObject())),"labelCarom");
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="func.caromLabelCss(lbl_player_two_name, \"labelCar";
_func._caromlabelcss /*String*/ ((anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_lbl_player_two_name.getObject())),"labelCarom");
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="func.caromLabelCss(lbl_player_one_hs, \"labelWhite";
_func._caromlabelcss /*String*/ (_lbl_player_one_hs,"labelWhite");
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="func.caromLabelCss(lbl_player_one_moyenne, \"label";
_func._caromlabelcss /*String*/ (_lbl_player_one_moyenne,"labelWhite");
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="func.caromLabelCss(lbl_player_one_perc, \"labelWhi";
_func._caromlabelcss /*String*/ (_lbl_player_one_perc,"labelWhite");
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="func.caromLabelCss(lbl_player_one_100, \"labelCaro";
_func._caromlabelcss /*String*/ (_lbl_player_one_100,"labelCarom");
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="func.caromLabelCss(lbl_player_one_10, \"labelCarom";
_func._caromlabelcss /*String*/ (_lbl_player_one_10,"labelCarom");
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="func.caromLabelCss(lbl_player_one_1, \"labelCarom\"";
_func._caromlabelcss /*String*/ (_lbl_player_one_1,"labelCarom");
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="func.caromLabelCss(lbl_player_one_make_100, \"labe";
_func._caromlabelcss /*String*/ (_lbl_player_one_make_100,"labelCarom");
RDebugUtils.currentLine=458768;
 //BA.debugLineNum = 458768;BA.debugLine="func.caromLabelCss(lbl_player_one_make_10, \"label";
_func._caromlabelcss /*String*/ (_lbl_player_one_make_10,"labelCarom");
RDebugUtils.currentLine=458769;
 //BA.debugLineNum = 458769;BA.debugLine="func.caromLabelCss(lbl_player_one_make_1, \"labelC";
_func._caromlabelcss /*String*/ (_lbl_player_one_make_1,"labelCarom");
RDebugUtils.currentLine=458771;
 //BA.debugLineNum = 458771;BA.debugLine="func.caromLabelCss(lbl_player_two_hs, \"labelWhite";
_func._caromlabelcss /*String*/ (_lbl_player_two_hs,"labelWhite");
RDebugUtils.currentLine=458772;
 //BA.debugLineNum = 458772;BA.debugLine="func.caromLabelCss(lbl_player_two_moyenne, \"label";
_func._caromlabelcss /*String*/ (_lbl_player_two_moyenne,"labelWhite");
RDebugUtils.currentLine=458773;
 //BA.debugLineNum = 458773;BA.debugLine="func.caromLabelCss(lbl_player_two_perc, \"labelWhi";
_func._caromlabelcss /*String*/ (_lbl_player_two_perc,"labelWhite");
RDebugUtils.currentLine=458775;
 //BA.debugLineNum = 458775;BA.debugLine="func.caromLabelCss(lbl_player_two_100, \"labelCaro";
_func._caromlabelcss /*String*/ (_lbl_player_two_100,"labelCarom");
RDebugUtils.currentLine=458776;
 //BA.debugLineNum = 458776;BA.debugLine="func.caromLabelCss(lbl_player_two_10, \"labelCarom";
_func._caromlabelcss /*String*/ (_lbl_player_two_10,"labelCarom");
RDebugUtils.currentLine=458777;
 //BA.debugLineNum = 458777;BA.debugLine="func.caromLabelCss(lbl_player_two_1, \"labelCarom\"";
_func._caromlabelcss /*String*/ (_lbl_player_two_1,"labelCarom");
RDebugUtils.currentLine=458779;
 //BA.debugLineNum = 458779;BA.debugLine="func.caromLabelCss(lbl_player_two_make_100, \"labe";
_func._caromlabelcss /*String*/ (_lbl_player_two_make_100,"labelCarom");
RDebugUtils.currentLine=458780;
 //BA.debugLineNum = 458780;BA.debugLine="func.caromLabelCss(lbl_player_two_make_10, \"label";
_func._caromlabelcss /*String*/ (_lbl_player_two_make_10,"labelCarom");
RDebugUtils.currentLine=458781;
 //BA.debugLineNum = 458781;BA.debugLine="func.caromLabelCss(lbl_player_two_make_1, \"labelC";
_func._caromlabelcss /*String*/ (_lbl_player_two_make_1,"labelCarom");
RDebugUtils.currentLine=458784;
 //BA.debugLineNum = 458784;BA.debugLine="resetBoard";
_resetboard();
RDebugUtils.currentLine=458786;
 //BA.debugLineNum = 458786;BA.debugLine="End Sub";
return "";
}
public static String  _setmessage(anywheresoftware.b4a.objects.collections.List _msglist) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "setmessage", false))
	 {return ((String) Debug.delegate(ba, "setmessage", new Object[] {_msglist}));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Sub setMessage(msgList As List)";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="lbl_message_1.Text = msgList.get(0)";
_lbl_message_1.setText(BA.ObjectToString(_msglist.Get((int) (0))));
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="lbl_message_2.Text = msgList.get(1)";
_lbl_message_2.setText(BA.ObjectToString(_msglist.Get((int) (1))));
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="lbl_message_3.Text = msgList.get(2)";
_lbl_message_3.setText(BA.ObjectToString(_msglist.Get((int) (2))));
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="lbl_message_4.Text = msgList.get(3)";
_lbl_message_4.setText(BA.ObjectToString(_msglist.Get((int) (3))));
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="lbl_message_5.Text = msgList.Get(4)";
_lbl_message_5.setText(BA.ObjectToString(_msglist.Get((int) (4))));
RDebugUtils.currentLine=4194311;
 //BA.debugLineNum = 4194311;BA.debugLine="End Sub";
return "";
}
public static String  _setpromoterunning(boolean _running) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "setpromoterunning", false))
	 {return ((String) Debug.delegate(ba, "setpromoterunning", new Object[] {_running}));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub setPromoteRunning(running As Boolean)";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="promoteRunning = running";
_promoterunning = _running;
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="End Sub";
return "";
}
public static String  _setspelerdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "setspelerdata", false))
	 {return ((String) Debug.delegate(ba, "setspelerdata", new Object[] {_data}));}
String _temaken = "";
RDebugUtils.currentLine=34406400;
 //BA.debugLineNum = 34406400;BA.debugLine="Sub setSpelerData(data As List)";
RDebugUtils.currentLine=34406401;
 //BA.debugLineNum = 34406401;BA.debugLine="resetBoard";
_resetboard();
RDebugUtils.currentLine=34406402;
 //BA.debugLineNum = 34406402;BA.debugLine="Dim teMaken As String";
_temaken = "";
RDebugUtils.currentLine=34406403;
 //BA.debugLineNum = 34406403;BA.debugLine="lbl_player_one_name.Text = data.Get(0)";
_lbl_player_one_name.setText(BA.ObjectToString(_data.Get((int) (0))));
RDebugUtils.currentLine=34406404;
 //BA.debugLineNum = 34406404;BA.debugLine="func.playerOneToMake = data.Get(1)";
_func._playeronetomake /*int*/  = (int)(BA.ObjectToNumber(_data.Get((int) (1))));
RDebugUtils.currentLine=34406405;
 //BA.debugLineNum = 34406405;BA.debugLine="teMaken =  func.padString(data.Get(1), \"0\", 0, 3)";
_temaken = _func._padstring /*String*/ (BA.ObjectToString(_data.Get((int) (1))),"0",(int) (0),(int) (3));
RDebugUtils.currentLine=34406406;
 //BA.debugLineNum = 34406406;BA.debugLine="lbl_player_one_make_100.Text	= teMaken.SubString2";
_lbl_player_one_make_100.setText(_temaken.substring((int) (0),(int) (1)));
RDebugUtils.currentLine=34406407;
 //BA.debugLineNum = 34406407;BA.debugLine="lbl_player_one_make_10.Text		= teMaken.SubString2";
_lbl_player_one_make_10.setText(_temaken.substring((int) (1),(int) (2)));
RDebugUtils.currentLine=34406408;
 //BA.debugLineNum = 34406408;BA.debugLine="lbl_player_one_make_1.Text		= teMaken.SubString2(";
_lbl_player_one_make_1.setText(_temaken.substring((int) (2),(int) (3)));
RDebugUtils.currentLine=34406410;
 //BA.debugLineNum = 34406410;BA.debugLine="lbl_player_two_name.Text = data.Get(2)";
_lbl_player_two_name.setText(BA.ObjectToString(_data.Get((int) (2))));
RDebugUtils.currentLine=34406411;
 //BA.debugLineNum = 34406411;BA.debugLine="teMaken =  func.padString(data.Get(3), \"0\", 0, 3)";
_temaken = _func._padstring /*String*/ (BA.ObjectToString(_data.Get((int) (3))),"0",(int) (0),(int) (3));
RDebugUtils.currentLine=34406412;
 //BA.debugLineNum = 34406412;BA.debugLine="func.playerTwoToMake = data.Get(3)";
_func._playertwotomake /*int*/  = (int)(BA.ObjectToNumber(_data.Get((int) (3))));
RDebugUtils.currentLine=34406413;
 //BA.debugLineNum = 34406413;BA.debugLine="lbl_player_two_make_100.Text	= teMaken.SubString2";
_lbl_player_two_make_100.setText(_temaken.substring((int) (0),(int) (1)));
RDebugUtils.currentLine=34406414;
 //BA.debugLineNum = 34406414;BA.debugLine="lbl_player_two_make_10.Text		= teMaken.SubString2";
_lbl_player_two_make_10.setText(_temaken.substring((int) (1),(int) (2)));
RDebugUtils.currentLine=34406415;
 //BA.debugLineNum = 34406415;BA.debugLine="lbl_player_two_make_1.Text		= teMaken.SubString2(";
_lbl_player_two_make_1.setText(_temaken.substring((int) (2),(int) (3)));
RDebugUtils.currentLine=34406419;
 //BA.debugLineNum = 34406419;BA.debugLine="End Sub";
return "";
}
public static String  _showpromote() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "showpromote", false))
	 {return ((String) Debug.delegate(ba, "showpromote", null));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub showPromote";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="pn_promote.SetLayoutAnimated(0, 50dip, 50dip, pn_";
_pn_promote.SetLayoutAnimated((int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),_pn_promote.getWidth(),_pn_promote.getHeight());
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="End Sub";
return "";
}
public static String  _showsponor(boolean _enabled) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "showsponor", false))
	 {return ((String) Debug.delegate(ba, "showsponor", new Object[] {_enabled}));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Sub showSponor(enabled As Boolean)";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="pn_sponsore.Visible = enabled";
_pn_sponsore.setVisible(_enabled);
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="End Sub";
return "";
}
public static void  _updatecfg() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "updatecfg", false))
	 {Debug.delegate(ba, "updatecfg", null); return;}
ResumableSub_updateCfg rsub = new ResumableSub_updateCfg(null);
rsub.resume(ba, null);
}
public static class ResumableSub_updateCfg extends BA.ResumableSub {
public ResumableSub_updateCfg(b4j.example.scorebord parent) {
this.parent = parent;
}
b4j.example.scorebord parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="scorebord";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="inactivecls.updatePromote";
parent._inactivecls._updatepromote /*String*/ (null);
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="lbl_config_update.Visible = True";
parent._lbl_config_update.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="Sleep(5000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "updatecfg"),(int) (5000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="lbl_config_update.Visible = False";
parent._lbl_config_update.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _usedigitalfont(boolean _usedigital) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "usedigitalfont", false))
	 {return ((String) Debug.delegate(ba, "usedigitalfont", new Object[] {_usedigital}));}
int _fscarom = 0;
int _fsmake = 0;
int _fsinnings = 0;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub useDigitalFont(useDigital As Boolean)";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Dim fsCarom, fsMake, fsInnings As Int";
_fscarom = 0;
_fsmake = 0;
_fsinnings = 0;
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="If useDigital Then";
if (_usedigital) { 
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="fsCarom = 300'350";
_fscarom = (int) (300);
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="fsMake = 225";
_fsmake = (int) (225);
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="fsInnings = 250'300";
_fsinnings = (int) (250);
 }else {
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="fsCarom = 225";
_fscarom = (int) (225);
RDebugUtils.currentLine=3997705;
 //BA.debugLineNum = 3997705;BA.debugLine="fsMake = 150";
_fsmake = (int) (150);
RDebugUtils.currentLine=3997706;
 //BA.debugLineNum = 3997706;BA.debugLine="fsInnings = 200";
_fsinnings = (int) (200);
 };
RDebugUtils.currentLine=3997709;
 //BA.debugLineNum = 3997709;BA.debugLine="func.setFont(lbl_player_one_1, fsCarom, useDigita";
_func._setfont /*String*/ (_lbl_player_one_1,_fscarom,_usedigital);
RDebugUtils.currentLine=3997710;
 //BA.debugLineNum = 3997710;BA.debugLine="func.setFont(lbl_player_one_10, fsCarom, useDigit";
_func._setfont /*String*/ (_lbl_player_one_10,_fscarom,_usedigital);
RDebugUtils.currentLine=3997711;
 //BA.debugLineNum = 3997711;BA.debugLine="func.setFont(lbl_player_one_100, fsCarom, useDigi";
_func._setfont /*String*/ (_lbl_player_one_100,_fscarom,_usedigital);
RDebugUtils.currentLine=3997712;
 //BA.debugLineNum = 3997712;BA.debugLine="func.setFont(lbl_player_two_1, fsCarom, useDigita";
_func._setfont /*String*/ (_lbl_player_two_1,_fscarom,_usedigital);
RDebugUtils.currentLine=3997713;
 //BA.debugLineNum = 3997713;BA.debugLine="func.setFont(lbl_player_two_10, fsCarom, useDigit";
_func._setfont /*String*/ (_lbl_player_two_10,_fscarom,_usedigital);
RDebugUtils.currentLine=3997714;
 //BA.debugLineNum = 3997714;BA.debugLine="func.setFont(lbl_player_two_100, fsCarom, useDigi";
_func._setfont /*String*/ (_lbl_player_two_100,_fscarom,_usedigital);
RDebugUtils.currentLine=3997715;
 //BA.debugLineNum = 3997715;BA.debugLine="func.setFont(lbl_innings, fsInnings, useDigital)";
_func._setfont /*String*/ (_lbl_innings,_fsinnings,_usedigital);
RDebugUtils.currentLine=3997716;
 //BA.debugLineNum = 3997716;BA.debugLine="func.setFont(lbl_player_one_make_100, fsMake, use";
_func._setfont /*String*/ (_lbl_player_one_make_100,_fsmake,_usedigital);
RDebugUtils.currentLine=3997717;
 //BA.debugLineNum = 3997717;BA.debugLine="func.setFont(lbl_player_one_make_10, fsMake, useD";
_func._setfont /*String*/ (_lbl_player_one_make_10,_fsmake,_usedigital);
RDebugUtils.currentLine=3997718;
 //BA.debugLineNum = 3997718;BA.debugLine="func.setFont(lbl_player_one_make_1, fsMake, useDi";
_func._setfont /*String*/ (_lbl_player_one_make_1,_fsmake,_usedigital);
RDebugUtils.currentLine=3997719;
 //BA.debugLineNum = 3997719;BA.debugLine="func.setFont(lbl_player_two_make_100,fsMake, useD";
_func._setfont /*String*/ (_lbl_player_two_make_100,_fsmake,_usedigital);
RDebugUtils.currentLine=3997720;
 //BA.debugLineNum = 3997720;BA.debugLine="func.setFont(lbl_player_two_make_10,fsMake, useDi";
_func._setfont /*String*/ (_lbl_player_two_make_10,_fsmake,_usedigital);
RDebugUtils.currentLine=3997721;
 //BA.debugLineNum = 3997721;BA.debugLine="func.setFont(lbl_player_two_make_1,fsMake, useDig";
_func._setfont /*String*/ (_lbl_player_two_make_1,_fsmake,_usedigital);
RDebugUtils.currentLine=3997723;
 //BA.debugLineNum = 3997723;BA.debugLine="End Sub";
return "";
}
public static String  _usefontyellow(boolean _useyellow) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "usefontyellow", false))
	 {return ((String) Debug.delegate(ba, "usefontyellow", new Object[] {_useyellow}));}
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub useFontYellow(useYellow As Boolean)";
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="func.setFontColor(lbl_innings, useYellow)";
_func._setfontcolor /*String*/ (_lbl_innings,_useyellow);
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="func.setFontColor(lbl_player_one_1, useYellow)";
_func._setfontcolor /*String*/ (_lbl_player_one_1,_useyellow);
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="func.setFontColor(lbl_player_one_10, useYellow)";
_func._setfontcolor /*String*/ (_lbl_player_one_10,_useyellow);
RDebugUtils.currentLine=4063238;
 //BA.debugLineNum = 4063238;BA.debugLine="func.setFontColor(lbl_player_one_100, useYellow)";
_func._setfontcolor /*String*/ (_lbl_player_one_100,_useyellow);
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="func.setFontColor(lbl_player_two_1, useYellow)";
_func._setfontcolor /*String*/ (_lbl_player_two_1,_useyellow);
RDebugUtils.currentLine=4063241;
 //BA.debugLineNum = 4063241;BA.debugLine="func.setFontColor(lbl_player_two_10, useYellow)";
_func._setfontcolor /*String*/ (_lbl_player_two_10,_useyellow);
RDebugUtils.currentLine=4063242;
 //BA.debugLineNum = 4063242;BA.debugLine="func.setFontColor(lbl_player_two_100, useYellow)";
_func._setfontcolor /*String*/ (_lbl_player_two_100,_useyellow);
RDebugUtils.currentLine=4063244;
 //BA.debugLineNum = 4063244;BA.debugLine="func.setFontColor(lbl_player_one_make_100, useYel";
_func._setfontcolor /*String*/ (_lbl_player_one_make_100,_useyellow);
RDebugUtils.currentLine=4063245;
 //BA.debugLineNum = 4063245;BA.debugLine="func.setFontColor(lbl_player_one_make_10, useYell";
_func._setfontcolor /*String*/ (_lbl_player_one_make_10,_useyellow);
RDebugUtils.currentLine=4063246;
 //BA.debugLineNum = 4063246;BA.debugLine="func.setFontColor(lbl_player_one_make_1, useYello";
_func._setfontcolor /*String*/ (_lbl_player_one_make_1,_useyellow);
RDebugUtils.currentLine=4063248;
 //BA.debugLineNum = 4063248;BA.debugLine="func.setFontColor(lbl_player_two_make_100, useYel";
_func._setfontcolor /*String*/ (_lbl_player_two_make_100,_useyellow);
RDebugUtils.currentLine=4063249;
 //BA.debugLineNum = 4063249;BA.debugLine="func.setFontColor(lbl_player_two_make_10, useYell";
_func._setfontcolor /*String*/ (_lbl_player_two_make_10,_useyellow);
RDebugUtils.currentLine=4063250;
 //BA.debugLineNum = 4063250;BA.debugLine="func.setFontColor(lbl_player_two_make_1, useYello";
_func._setfontcolor /*String*/ (_lbl_player_two_make_1,_useyellow);
RDebugUtils.currentLine=4063251;
 //BA.debugLineNum = 4063251;BA.debugLine="End Sub";
return "";
}
}