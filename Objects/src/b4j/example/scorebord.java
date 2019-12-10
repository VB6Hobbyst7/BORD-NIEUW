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
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static anywheresoftware.b4j.objects.Form _frm = null;
public static b4j.example.inactiveclass _inactivecls = null;
public static b4j.example.classcheckconfig _clscheckcfg = null;
public static b4j.example.clxtoastmessage _clstoast = null;
public static double _pn_promote_top = 0;
public static double _pn_promote_left = 0;
public static boolean _promoterunning = false;
public static anywheresoftware.b4a.objects.B4XViewWrapper _pnieuwepartij = null;
public static b4j.example.b4xdialog _pnieuwepartijdialog = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_innings = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_one_10 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_one_1 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_one_100 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_one_moyenne = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_two_moyenne = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_two_100 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_two_10 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_two_1 = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _btn_exit = null;
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
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _jxui = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_one_hs = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_two_hs = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lbl_clock = null;
public static b4j.example.timerclass _clstmr = null;
public static anywheresoftware.b4j.objects.LabelWrapper _label7 = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _edt_speler_a = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _edt_temaken_a = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _edt_speler_b = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _edt_temaken_b = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btn_a_begint = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btn_b_begint = null;
public static b4j.example.b4xprogressbar _b4xprogressbarp1 = null;
public static b4j.example.b4xprogressbar _b4xprogressbarp2 = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btn_nieuwe_partij = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btn_annuleer_nieuwe_partij = null;
public static anywheresoftware.b4j.objects.LabelWrapper _label6 = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lbl_close = null;
public static anywheresoftware.b4j.objects.CheckboxWrapper _chk_add_player = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper _img_random = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pn_p1_carom = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pn_promote = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_config_update = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.main _main = null;
public static b4j.example.func _func = null;
public static b4j.example.funcinet _funcinet = null;
public static b4j.example.parseconfig _parseconfig = null;
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
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="frm.Initialize(\"frm\", 1920, 1080)";
parent._frm.Initialize(ba,"frm",1920,1080);
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="frm.RootPane.LoadLayout(\"scorebord\")";
parent._frm.getRootPane().LoadLayout(ba,"scorebord");
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="frm.Stylesheets.Add(File.GetUri(File.DirAssets, \"";
parent._frm.getStylesheets().Add((Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"n205.css")));
RDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="setFontSize";
_setfontsize();
RDebugUtils.currentLine=262151;
 //BA.debugLineNum = 262151;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
parent._frm.SetFormStyle("UTILITY");
RDebugUtils.currentLine=262157;
 //BA.debugLineNum = 262157;BA.debugLine="frm.Show";
parent._frm.Show();
RDebugUtils.currentLine=262158;
 //BA.debugLineNum = 262158;BA.debugLine="MouseOver(frm.RootPane)";
_mouseover((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(parent._frm.getRootPane().getObject())));
RDebugUtils.currentLine=262160;
 //BA.debugLineNum = 262160;BA.debugLine="Base = frm.RootPane";
parent._base.setObject((java.lang.Object)(parent._frm.getRootPane().getObject()));
RDebugUtils.currentLine=262161;
 //BA.debugLineNum = 262161;BA.debugLine="Dialog.Initialize (Base)";
parent._dialog._initialize /*String*/ (null,ba,parent._base);
RDebugUtils.currentLine=262163;
 //BA.debugLineNum = 262163;BA.debugLine="func.SetFormCursor(frm, \"mouse.png\")";
parent._func._setformcursor /*String*/ (parent._frm,"mouse.png");
RDebugUtils.currentLine=262164;
 //BA.debugLineNum = 262164;BA.debugLine="parseConfig.parseConfig";
parent._parseconfig._parseconfig /*String*/ ();
RDebugUtils.currentLine=262166;
 //BA.debugLineNum = 262166;BA.debugLine="clsTmr.Initialize(lbl_clock)";
parent._clstmr._initialize /*String*/ (null,ba,(anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(parent._lbl_clock.getObject())));
RDebugUtils.currentLine=262167;
 //BA.debugLineNum = 262167;BA.debugLine="inactivecls.Initialize";
parent._inactivecls._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=262168;
 //BA.debugLineNum = 262168;BA.debugLine="clsCheckCfg.Initialize";
parent._clscheckcfg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=262169;
 //BA.debugLineNum = 262169;BA.debugLine="clsToast.Initialize(frm.RootPane)";
parent._clstoast._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._frm.getRootPane().getObject())));
RDebugUtils.currentLine=262172;
 //BA.debugLineNum = 262172;BA.debugLine="func.lblInnings = lbl_innings";
parent._func._lblinnings /*anywheresoftware.b4j.objects.LabelWrapper*/  = parent._lbl_innings;
RDebugUtils.currentLine=262173;
 //BA.debugLineNum = 262173;BA.debugLine="func.lbl_player_one_hs = lbl_player_one_hs";
parent._func._lbl_player_one_hs /*anywheresoftware.b4j.objects.LabelWrapper*/  = parent._lbl_player_one_hs;
RDebugUtils.currentLine=262174;
 //BA.debugLineNum = 262174;BA.debugLine="func.lbl_player_two_hs = lbl_player_two_hs";
parent._func._lbl_player_two_hs /*anywheresoftware.b4j.objects.LabelWrapper*/  = parent._lbl_player_two_hs;
RDebugUtils.currentLine=262180;
 //BA.debugLineNum = 262180;BA.debugLine="func.setP1CaromLables(lstPlayerOneScoreLbl)";
parent._func._setp1caromlables /*String*/ (_lstplayeronescorelbl());
RDebugUtils.currentLine=262181;
 //BA.debugLineNum = 262181;BA.debugLine="func.setP2CaromLables(lstPlayerTwoScoreLbl)";
parent._func._setp2caromlables /*String*/ (_lstplayertwoscorelbl());
RDebugUtils.currentLine=262182;
 //BA.debugLineNum = 262182;BA.debugLine="Wait For (funcInet.testInet) Complete (result As";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "show"), parent._funcinet._testinet /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (boolean) result[0];
;
RDebugUtils.currentLine=262184;
 //BA.debugLineNum = 262184;BA.debugLine="Log($\"Has internet access is ${result}\"$)";
anywheresoftware.b4a.keywords.Common.Log(("Has internet access is "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_result))+""));
RDebugUtils.currentLine=262186;
 //BA.debugLineNum = 262186;BA.debugLine="If result Then";
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
RDebugUtils.currentLine=262187;
 //BA.debugLineNum = 262187;BA.debugLine="func.hasInternetAccess = True";
parent._func._hasinternetaccess /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=262190;
 //BA.debugLineNum = 262190;BA.debugLine="func.hasInternetAccess = False";
parent._func._hasinternetaccess /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=262194;
 //BA.debugLineNum = 262194;BA.debugLine="initPanels";
_initpanels();
RDebugUtils.currentLine=262197;
 //BA.debugLineNum = 262197;BA.debugLine="End Sub";
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
public static anywheresoftware.b4j.object.JavaObject  _asjo(anywheresoftware.b4j.object.JavaObject _o) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "asjo", false))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "asjo", new Object[] {_o}));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Private Sub asJO(o As JavaObject) As JavaObject";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="Return o";
if (true) return _o;
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="End Sub";
return null;
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
public static String  _btn_annuleer_nieuwe_partij_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "btn_annuleer_nieuwe_partij_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "btn_annuleer_nieuwe_partij_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub btn_annuleer_nieuwe_partij_MouseReleased (Even";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="pNieuwePartijDialog.Close(XUI.DialogResponse_Canc";
_pnieuwepartijdialog._close /*boolean*/ (null,_xui.DialogResponse_Cancel);
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub btn_exit_MouseReleased (EventData As MouseEven";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
public static String  _btn_nieuwe_partij_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "btn_nieuwe_partij_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "btn_nieuwe_partij_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub btn_nieuwe_partij_MouseReleased (EventData As";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="pNieuwePartijDialog.Close(XUI.DialogResponse_Posi";
_pnieuwepartijdialog._close /*boolean*/ (null,_xui.DialogResponse_Positive);
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="resetBoard(False)";
_resetboard(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="If chk_add_player.Checked Then";
if (_chk_add_player.getChecked()) { 
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="iets";
_iets();
 };
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="End Sub";
return "";
}
public static void  _resetboard(boolean _bordstart) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "resetboard", false))
	 {Debug.delegate(ba, "resetboard", new Object[] {_bordstart}); return;}
ResumableSub_resetBoard rsub = new ResumableSub_resetBoard(null,_bordstart);
rsub.resume(ba, null);
}
public static class ResumableSub_resetBoard extends BA.ResumableSub {
public ResumableSub_resetBoard(b4j.example.scorebord parent,boolean _bordstart) {
this.parent = parent;
this._bordstart = _bordstart;
}
b4j.example.scorebord parent;
boolean _bordstart;
Object _sf = null;
int _result = 0;

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
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="If bordStart Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_bordstart) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="Dim sf As Object = jxui.Msgbox2Async(\"Bord reset";
_sf = parent._jxui.Msgbox2Async(ba,"Bord resetten?","","Ja","","Nee",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="Wait For (sf) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "resetboard"), _sf);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_result = (int) result[0];
;
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="If Result = jxui.DialogResponse_Negative Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_result==parent._jxui.DialogResponse_Negative) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=2293773;
 //BA.debugLineNum = 2293773;BA.debugLine="setCaromNumber(lbl_player_one_1, \"0\")";
_setcaromnumber((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._lbl_player_one_1.getObject())),"0");
RDebugUtils.currentLine=2293775;
 //BA.debugLineNum = 2293775;BA.debugLine="setCaromNumber(lbl_player_one_10, \"0\")";
_setcaromnumber((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._lbl_player_one_10.getObject())),"0");
RDebugUtils.currentLine=2293777;
 //BA.debugLineNum = 2293777;BA.debugLine="setCaromNumber(lbl_player_one_100, \"0\")";
_setcaromnumber((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._lbl_player_one_100.getObject())),"0");
RDebugUtils.currentLine=2293780;
 //BA.debugLineNum = 2293780;BA.debugLine="lbl_player_one_1.Text = \"0\"";
parent._lbl_player_one_1.setText("0");
RDebugUtils.currentLine=2293781;
 //BA.debugLineNum = 2293781;BA.debugLine="lbl_player_one_make_100.Text = \"0\"";
parent._lbl_player_one_make_100.setText("0");
RDebugUtils.currentLine=2293782;
 //BA.debugLineNum = 2293782;BA.debugLine="lbl_player_one_make_10.Text = \"0\"";
parent._lbl_player_one_make_10.setText("0");
RDebugUtils.currentLine=2293783;
 //BA.debugLineNum = 2293783;BA.debugLine="lbl_player_one_make_1.Text = \"0\"";
parent._lbl_player_one_make_1.setText("0");
RDebugUtils.currentLine=2293784;
 //BA.debugLineNum = 2293784;BA.debugLine="lbl_player_one_moyenne.Text = \"0.000\"";
parent._lbl_player_one_moyenne.setText("0.000");
RDebugUtils.currentLine=2293785;
 //BA.debugLineNum = 2293785;BA.debugLine="lbl_player_one_perc.Text = \"0.00%\"";
parent._lbl_player_one_perc.setText("0.00%");
RDebugUtils.currentLine=2293787;
 //BA.debugLineNum = 2293787;BA.debugLine="lbl_innings.Text = \"000\"";
parent._lbl_innings.setText("000");
RDebugUtils.currentLine=2293790;
 //BA.debugLineNum = 2293790;BA.debugLine="lbl_player_two_100.Text = \"0\"";
parent._lbl_player_two_100.setText("0");
RDebugUtils.currentLine=2293791;
 //BA.debugLineNum = 2293791;BA.debugLine="lbl_player_two_10.Text = \"0\"";
parent._lbl_player_two_10.setText("0");
RDebugUtils.currentLine=2293792;
 //BA.debugLineNum = 2293792;BA.debugLine="lbl_player_two_1.Text = \"0\"";
parent._lbl_player_two_1.setText("0");
RDebugUtils.currentLine=2293793;
 //BA.debugLineNum = 2293793;BA.debugLine="lbl_player_two_make_100.Text = \"0\"";
parent._lbl_player_two_make_100.setText("0");
RDebugUtils.currentLine=2293794;
 //BA.debugLineNum = 2293794;BA.debugLine="lbl_player_two_make_10.Text = \"0\"";
parent._lbl_player_two_make_10.setText("0");
RDebugUtils.currentLine=2293795;
 //BA.debugLineNum = 2293795;BA.debugLine="lbl_player_two_make_1.Text = \"0\"";
parent._lbl_player_two_make_1.setText("0");
RDebugUtils.currentLine=2293796;
 //BA.debugLineNum = 2293796;BA.debugLine="lbl_player_two_perc.Text = \"0.00%\"";
parent._lbl_player_two_perc.setText("0.00%");
RDebugUtils.currentLine=2293797;
 //BA.debugLineNum = 2293797;BA.debugLine="lbl_player_two_moyenne.Text = \"0.000\"";
parent._lbl_player_two_moyenne.setText("0.000");
RDebugUtils.currentLine=2293798;
 //BA.debugLineNum = 2293798;BA.debugLine="lbl_player_one_hs.Text = \"000\"";
parent._lbl_player_one_hs.setText("000");
RDebugUtils.currentLine=2293799;
 //BA.debugLineNum = 2293799;BA.debugLine="lbl_player_two_hs.Text = \"000\"";
parent._lbl_player_two_hs.setText("000");
RDebugUtils.currentLine=2293801;
 //BA.debugLineNum = 2293801;BA.debugLine="func.inngSet = 0";
parent._func._inngset /*int*/  = (int) (0);
RDebugUtils.currentLine=2293802;
 //BA.debugLineNum = 2293802;BA.debugLine="func.innigs = 0";
parent._func._innigs /*int*/  = (int) (0);
RDebugUtils.currentLine=2293803;
 //BA.debugLineNum = 2293803;BA.debugLine="func.scorePlayerOne = 0";
parent._func._scoreplayerone /*int*/  = (int) (0);
RDebugUtils.currentLine=2293804;
 //BA.debugLineNum = 2293804;BA.debugLine="func.scorePlayerTwo = 0";
parent._func._scoreplayertwo /*int*/  = (int) (0);
RDebugUtils.currentLine=2293805;
 //BA.debugLineNum = 2293805;BA.debugLine="func.playerOneToMake = 0";
parent._func._playeronetomake /*int*/  = (int) (0);
RDebugUtils.currentLine=2293806;
 //BA.debugLineNum = 2293806;BA.debugLine="func.playertwoToMake = 0";
parent._func._playertwotomake /*int*/  = (int) (0);
RDebugUtils.currentLine=2293807;
 //BA.debugLineNum = 2293807;BA.debugLine="func.playerOneHs = 0";
parent._func._playeronehs /*int*/  = (int) (0);
RDebugUtils.currentLine=2293808;
 //BA.debugLineNum = 2293808;BA.debugLine="func.playerTwoHs = 0";
parent._func._playertwohs /*int*/  = (int) (0);
RDebugUtils.currentLine=2293809;
 //BA.debugLineNum = 2293809;BA.debugLine="func.p1HsTemp = 0";
parent._func._p1hstemp /*int*/  = (int) (0);
RDebugUtils.currentLine=2293810;
 //BA.debugLineNum = 2293810;BA.debugLine="func.p2HsTemp = 0";
parent._func._p2hstemp /*int*/  = (int) (0);
RDebugUtils.currentLine=2293811;
 //BA.debugLineNum = 2293811;BA.debugLine="B4XProgressBarP1.Progress = 0";
parent._b4xprogressbarp1._setprogress /*float*/ (null,(float) (0));
RDebugUtils.currentLine=2293812;
 //BA.debugLineNum = 2293812;BA.debugLine="B4XProgressBarP2.Progress = 0";
parent._b4xprogressbarp2._setprogress /*float*/ (null,(float) (0));
RDebugUtils.currentLine=2293813;
 //BA.debugLineNum = 2293813;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=2293815;
 //BA.debugLineNum = 2293815;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _iets() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "iets", false))
	 {Debug.delegate(ba, "iets", null); return;}
ResumableSub_iets rsub = new ResumableSub_iets(null);
rsub.resume(ba, null);
}
public static class ResumableSub_iets extends BA.ResumableSub {
public ResumableSub_iets(b4j.example.scorebord parent) {
this.parent = parent;
}
b4j.example.scorebord parent;
b4j.example.b4xdialog _dlg = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _result = 0;

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
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Dim dlg As B4XDialog";
_dlg = new b4j.example.b4xdialog();
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="dlg.Initialize (Base)";
_dlg._initialize /*String*/ (null,ba,parent._base);
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Dim p As B4XView = XUI.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 600dip)";
_p.SetLayoutAnimated((int) (0),0,0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (600)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (600)));
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="p.LoadLayout(\"players\")";
_p.LoadLayout("players",ba);
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="dlg.Title = \"Spelers Invoer\"";
_dlg._title /*Object*/  = (Object)("Spelers Invoer");
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="dlg.PutAtTop = True 'put the dialog at the top of";
_dlg._putattop /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="Wait For (dlg.ShowCustom(p, \"OK\", \"\", \"CANCEL\"))";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "iets"), _dlg._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=2621452;
 //BA.debugLineNum = 2621452;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _checkmatchwonp1() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "checkmatchwonp1", false))
	 {return ((String) Debug.delegate(ba, "checkmatchwonp1", null));}
int _caroms = 0;
int _make = 0;
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub checkMatchWonP1";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Dim caroms, make As Int";
_caroms = 0;
_make = 0;
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="caroms = lbl_player_one_100.Text&lbl_player_one_1";
_caroms = (int)(Double.parseDouble(_lbl_player_one_100.getText()+_lbl_player_one_10.getText()+_lbl_player_one_1.getText()));
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="make = lbl_player_one_make_100.text&lbl_player_on";
_make = (int)(Double.parseDouble(_lbl_player_one_make_100.getText()+_lbl_player_one_make_10.getText()+_lbl_player_one_make_1.getText()));
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="If caroms >= make Then";
if (_caroms>=_make) { 
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="Log($\"Speler 1 wint, nabeurt voor speler 2\"$)";
anywheresoftware.b4a.keywords.Common.Log(("Speler 1 wint, nabeurt voor speler 2"));
 };
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="If caroms >= make Then";
if (_caroms>=_make) { 
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="Log($\"Speler 2 wint, geen nabeurt voor speler 1\"";
anywheresoftware.b4a.keywords.Common.Log(("Speler 2 wint, geen nabeurt voor speler 1"));
 };
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="End Sub";
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
public static String  _edt_temaken_a_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "edt_temaken_a_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edt_temaken_a_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub edt_temaken_a_TextChanged (Old As String, New";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="edt_temaken_a.Text =  func.testNumber(Old, New)";
_edt_temaken_a.setText(_func._testnumber /*String*/ (_old,_new));
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="edt_temaken_a.SetSelection(edt_temaken_a.Text.Len";
_edt_temaken_a.SetSelection(_edt_temaken_a.getText().length(),_edt_temaken_a.getText().length());
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="End Sub";
return "";
}
public static String  _edt_temaken_b_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "edt_temaken_b_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edt_temaken_b_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub edt_temaken_b_TextChanged (Old As String, New";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="edt_temaken_b.Text =  func.testNumber(Old, New)";
_edt_temaken_b.setText(_func._testnumber /*String*/ (_old,_new));
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="edt_temaken_b.SetSelection(edt_temaken_b.Text.Len";
_edt_temaken_b.SetSelection(_edt_temaken_b.getText().length(),_edt_temaken_b.getText().length());
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="End Sub";
return "";
}
public static String  _getrandomimage() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "getrandomimage", false))
	 {return ((String) Debug.delegate(ba, "getrandomimage", null));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub getRandomImage";
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="End Sub";
return "";
}
public static String  _initpanels() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "initpanels", false))
	 {return ((String) Debug.delegate(ba, "initpanels", null));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub initPanels";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="pNieuwePartijDialog.Initialize (Base)";
_pnieuwepartijdialog._initialize /*String*/ (null,ba,_base);
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="pNieuwePartij = XUI.CreatePanel(\"\")";
_pnieuwepartij = _xui.CreatePanel(ba,"");
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="pNieuwePartij.SetLayoutAnimated(0, 100dip, 0, 100";
_pnieuwepartij.SetLayoutAnimated((int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1000)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (800)));
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="pNieuwePartij.LoadLayout(\"nieuwe_partij\")";
_pnieuwepartij.LoadLayout("nieuwe_partij",ba);
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="pNieuwePartijDialog.Title = \"Nieuwe Partij\"";
_pnieuwepartijdialog._title /*Object*/  = (Object)("Nieuwe Partij");
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="pNieuwePartijDialog.PutAtTop = False 'put the dia";
_pnieuwepartijdialog._putattop /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="pn_promote_top = 1130 'pn_promote.Top";
_pn_promote_top = 1130;
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="pn_promote_left = 20 'pn_promote.Left";
_pn_promote_left = 20;
RDebugUtils.currentLine=327693;
 //BA.debugLineNum = 327693;BA.debugLine="inactivecls.frm = frm";
_inactivecls._frm /*anywheresoftware.b4j.objects.Form*/  = _frm;
RDebugUtils.currentLine=327694;
 //BA.debugLineNum = 327694;BA.debugLine="inactivecls.pn_promote = pn_promote";
_inactivecls._pn_promote /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/  = _pn_promote;
RDebugUtils.currentLine=327695;
 //BA.debugLineNum = 327695;BA.debugLine="inactivecls.pnlWidth = pn_promote.Width";
_inactivecls._pnlwidth /*double*/  = _pn_promote.getWidth();
RDebugUtils.currentLine=327696;
 //BA.debugLineNum = 327696;BA.debugLine="inactivecls.pnlHeight = pn_promote.Height";
_inactivecls._pnlheight /*double*/  = _pn_promote.getHeight();
RDebugUtils.currentLine=327699;
 //BA.debugLineNum = 327699;BA.debugLine="End Sub";
return "";
}
public static String  _lastclick() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lastclick", false))
	 {return ((String) Debug.delegate(ba, "lastclick", null));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub lastClick";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="inactivecls.lastClick = DateTime.Now";
_inactivecls._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub lbl_innings_MouseReleased (EventData As MouseE";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Dim points As Int = lbl_innings.Text";
_points = (int)(Double.parseDouble(_lbl_innings.getText()));
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="points = points + 1";
_points = (int) (_points+1);
 }else {
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="points = points - 1";
_points = (int) (_points-1);
 };
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="If points = -1 Then";
if (_points==-1) { 
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="func.innigs = points";
_func._innigs /*int*/  = _points;
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="lbl_innings.Text = func.padString(points, \"0\", 0,";
_lbl_innings.setText(_func._padstring /*String*/ (BA.NumberToString(_points),"0",(int) (0),(int) (3)));
RDebugUtils.currentLine=1310733;
 //BA.debugLineNum = 1310733;BA.debugLine="func.calcMoyenne(lbl_player_one_moyenne, lbl_play";
_func._calcmoyenne /*String*/ (_lbl_player_one_moyenne,_lbl_player_two_moyenne);
RDebugUtils.currentLine=1310734;
 //BA.debugLineNum = 1310734;BA.debugLine="func.processHs(\"all\")";
_func._processhs /*String*/ ("all");
RDebugUtils.currentLine=1310735;
 //BA.debugLineNum = 1310735;BA.debugLine="func.inngSet = 1";
_func._inngset /*int*/  = (int) (1);
RDebugUtils.currentLine=1310737;
 //BA.debugLineNum = 1310737;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_1_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_1_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_1_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=29163520;
 //BA.debugLineNum = 29163520;BA.debugLine="Sub lbl_player_one_1_MouseEntered (EventData As Mo";
RDebugUtils.currentLine=29163523;
 //BA.debugLineNum = 29163523;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_1_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_1_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_1_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub lbl_player_one_1_MouseReleased (EventData As M";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="func.calcScorePlayerOne(1)";
_func._calcscoreplayerone /*String*/ ((int) (1));
 }else 
{RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Else If EventData.SecondaryButtonPressed Then";
if (_eventdata.getSecondaryButtonPressed()) { 
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="func.calcScorePlayerOne(-1)";
_func._calcscoreplayerone /*String*/ ((int) (-1));
 }}
;
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2359307;
 //BA.debugLineNum = 2359307;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_10_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_10_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_10_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub lbl_player_one_10_MouseReleased (EventData As";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="func.calcScorePlayerOne(10)";
_func._calcscoreplayerone /*String*/ ((int) (10));
 }else 
{RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Else If EventData.SecondaryButtonPressed Then";
if (_eventdata.getSecondaryButtonPressed()) { 
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="func.calcScorePlayerOne(-10)";
_func._calcscoreplayerone /*String*/ ((int) (-10));
 }}
;
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_100_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_100_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_100_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub lbl_player_one_100_MouseReleased (EventData As";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="func.calcScorePlayerOne(100)";
_func._calcscoreplayerone /*String*/ ((int) (100));
 }else 
{RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Else If EventData.SecondaryButtonPressed Then";
if (_eventdata.getSecondaryButtonPressed()) { 
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="func.calcScorePlayerOne(-100)";
_func._calcscoreplayerone /*String*/ ((int) (-100));
 }}
;
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_active_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_active_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_active_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub lbl_player_one_active_MouseReleased (EventData";
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub lbl_player_two_1_MouseReleased (EventData As M";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="setP2Name";
_setp2name();
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="func.calcScorePlayertwo(1)";
_func._calcscoreplayertwo /*String*/ ((int) (1));
 }else 
{RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="Else If EventData.SecondaryButtonPressed Then";
if (_eventdata.getSecondaryButtonPressed()) { 
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="func.calcScorePlayertwo(-1)";
_func._calcscoreplayertwo /*String*/ ((int) (-1));
 }}
;
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="End Sub";
return "";
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
RDebugUtils.currentLine=2424843;
 //BA.debugLineNum = 2424843;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_10_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_10_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_10_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub lbl_player_two_10_MouseReleased (EventData As";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="setP2Name";
_setp2name();
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="func.calcScorePlayertwo(10)";
_func._calcscoreplayertwo /*String*/ ((int) (10));
 }else 
{RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="Else If EventData.SecondaryButtonPressed Then";
if (_eventdata.getSecondaryButtonPressed()) { 
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="func.calcScorePlayertwo(-10)";
_func._calcscoreplayertwo /*String*/ ((int) (-10));
 }}
;
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_100_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_100_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_100_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub lbl_player_two_100_MouseReleased (EventData As";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="setP2Name";
_setp2name();
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="func.calcScorePlayertwo(100)";
_func._calcscoreplayertwo /*String*/ ((int) (100));
 }else 
{RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="Else If EventData.SecondaryButtonPressed Then";
if (_eventdata.getSecondaryButtonPressed()) { 
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="func.calcScorePlayertwo(-100)";
_func._calcscoreplayertwo /*String*/ ((int) (-100));
 }}
;
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="End Sub";
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
public static String  _lbl_player_two_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub lbl_player_two_MouseReleased (EventData As Mou";
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="End Sub";
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
public static void  _nieuwepartij() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "nieuwepartij", false))
	 {Debug.delegate(ba, "nieuwepartij", null); return;}
ResumableSub_nieuwePartij rsub = new ResumableSub_nieuwePartij(null);
rsub.resume(ba, null);
}
public static class ResumableSub_nieuwePartij extends BA.ResumableSub {
public ResumableSub_nieuwePartij(b4j.example.scorebord parent) {
this.parent = parent;
}
b4j.example.scorebord parent;
int _result = 0;

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
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="Wait For (pNieuwePartijDialog.ShowCustom(pNieuweP";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "nieuwepartij"), parent._pnieuwepartijdialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent._pnieuwepartij,(Object)(""),(Object)(""),(Object)("")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=2686990;
 //BA.debugLineNum = 2686990;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.objects.collections.List  _lstplayeronescorelbl() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lstplayeronescorelbl", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "lstplayeronescorelbl", null));}
anywheresoftware.b4a.objects.collections.List _list = null;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub lstPlayerOneScoreLbl As List";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Dim List As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="List.Initialize";
_list.Initialize();
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="List.AddAll(Array As Object(lbl_player_one_1, lbl";
_list.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_lbl_player_one_1.getObject()),(Object)(_lbl_player_one_10.getObject()),(Object)(_lbl_player_one_100.getObject()),(Object)(_lbl_player_one_moyenne.getObject()),(Object)(_b4xprogressbarp1)}));
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="Return List";
if (true) return _list;
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _lstplayertwoscorelbl() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lstplayertwoscorelbl", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "lstplayertwoscorelbl", null));}
anywheresoftware.b4a.objects.collections.List _list = null;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub lstPlayerTwoScoreLbl As List";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Dim List As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="List.Initialize";
_list.Initialize();
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="List.AddAll(Array As Object(lbl_player_two_1, lbl";
_list.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_lbl_player_two_1.getObject()),(Object)(_lbl_player_two_10.getObject()),(Object)(_lbl_player_two_100.getObject()),(Object)(_lbl_player_two_moyenne.getObject()),(Object)(_b4xprogressbarp2)}));
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="Return List";
if (true) return _list;
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="End Sub";
return null;
}
public static String  _mainform_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "mainform_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "mainform_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub MainForm_MouseClicked (EventData As MouseEvent";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="If inactivecls.tmr_draw_promote.Enabled = True Th";
if (_inactivecls._tmr_draw_promote /*anywheresoftware.b4a.objects.Timer*/ .getEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="pn_promote.Top = pn_promote_top";
_pn_promote.setTop(_pn_promote_top);
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="pn_promote_left = pn_promote_left";
_pn_promote_left = _pn_promote_left;
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="inactivecls.lastClick = DateTime.Now";
_inactivecls._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="inactivecls.enableTime(True)";
_inactivecls._enabletime /*String*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="inactivecls.enablePromote(False)";
_inactivecls._enablepromote /*String*/ (null,anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=3932169;
 //BA.debugLineNum = 3932169;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3670026;
 //BA.debugLineNum = 3670026;BA.debugLine="Sleep(300)";
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
RDebugUtils.currentLine=3670028;
 //BA.debugLineNum = 3670028;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="setHandler(n1,\"setOnMouseMoved\",\"mouseIn\")";
_sethandler((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_n1.getObject())),"setOnMouseMoved","mouseIn");
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="setHandler(n1,\"setOnMouseExited\",\"mouseOut\")";
_sethandler((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_n1.getObject())),"setOnMouseExited","mouseOut");
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="End Sub";
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
public static String  _pn_promote_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "pn_promote_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "pn_promote_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub pn_promote_MouseReleased (EventData As MouseEv";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="pn_promote.Top = pn_promote_top";
_pn_promote.setTop(_pn_promote_top);
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="pn_promote.left = pn_promote_left";
_pn_promote.setLeft(_pn_promote_left);
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="inactivecls.lastClick = DateTime.Now";
_inactivecls._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="inactivecls.enableTime(True)";
_inactivecls._enabletime /*String*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="inactivecls.enablePromote(False)";
_inactivecls._enablepromote /*String*/ (null,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3538951;
 //BA.debugLineNum = 3538951;BA.debugLine="End Sub";
return "";
}
public static String  _setcaromnumber(anywheresoftware.b4a.objects.B4XViewWrapper _v,String _value) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "setcaromnumber", false))
	 {return ((String) Debug.delegate(ba, "setcaromnumber", new Object[] {_v,_value}));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub setCaromNumber(v As B4XView, value As String)";
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="v.Color = 0x00FFFFFF";
_v.setColor((int) (0x00ffffff));
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="v.Text = value";
_v.setText(_value);
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="End Sub";
return "";
}
public static String  _setfontsize() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "setfontsize", false))
	 {return ((String) Debug.delegate(ba, "setfontsize", null));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub setFontSize";
RDebugUtils.currentLine=458806;
 //BA.debugLineNum = 458806;BA.debugLine="func.caromLabelCss(lbl_player_one_hs, \"labelWhite";
_func._caromlabelcss /*String*/ (_lbl_player_one_hs,"labelWhite");
RDebugUtils.currentLine=458807;
 //BA.debugLineNum = 458807;BA.debugLine="func.caromLabelCss(lbl_player_one_moyenne, \"label";
_func._caromlabelcss /*String*/ (_lbl_player_one_moyenne,"labelWhite");
RDebugUtils.currentLine=458808;
 //BA.debugLineNum = 458808;BA.debugLine="func.caromLabelCss(lbl_player_one_perc, \"labelWhi";
_func._caromlabelcss /*String*/ (_lbl_player_one_perc,"labelWhite");
RDebugUtils.currentLine=458809;
 //BA.debugLineNum = 458809;BA.debugLine="func.caromLabelCss(lbl_player_two_hs, \"labelWhite";
_func._caromlabelcss /*String*/ (_lbl_player_two_hs,"labelWhite");
RDebugUtils.currentLine=458810;
 //BA.debugLineNum = 458810;BA.debugLine="func.caromLabelCss(lbl_player_two_moyenne, \"label";
_func._caromlabelcss /*String*/ (_lbl_player_two_moyenne,"labelWhite");
RDebugUtils.currentLine=458811;
 //BA.debugLineNum = 458811;BA.debugLine="func.caromLabelCss(lbl_player_two_perc, \"labelWhi";
_func._caromlabelcss /*String*/ (_lbl_player_two_perc,"labelWhite");
RDebugUtils.currentLine=458812;
 //BA.debugLineNum = 458812;BA.debugLine="func.caromLabelCss(lbl_innings, \"labelCarom\")";
_func._caromlabelcss /*String*/ (_lbl_innings,"labelCarom");
RDebugUtils.currentLine=458813;
 //BA.debugLineNum = 458813;BA.debugLine="func.caromLabelCss(lbl_player_one_100, \"labelCaro";
_func._caromlabelcss /*String*/ (_lbl_player_one_100,"labelCarom");
RDebugUtils.currentLine=458814;
 //BA.debugLineNum = 458814;BA.debugLine="func.caromLabelCss(lbl_player_one_10, \"labelCarom";
_func._caromlabelcss /*String*/ (_lbl_player_one_10,"labelCarom");
RDebugUtils.currentLine=458815;
 //BA.debugLineNum = 458815;BA.debugLine="func.caromLabelCss(lbl_player_one_1, \"labelCarom\"";
_func._caromlabelcss /*String*/ (_lbl_player_one_1,"labelCarom");
RDebugUtils.currentLine=458816;
 //BA.debugLineNum = 458816;BA.debugLine="func.caromLabelCss(lbl_player_two_100, \"labelCaro";
_func._caromlabelcss /*String*/ (_lbl_player_two_100,"labelCarom");
RDebugUtils.currentLine=458817;
 //BA.debugLineNum = 458817;BA.debugLine="func.caromLabelCss(lbl_player_two_10, \"labelCarom";
_func._caromlabelcss /*String*/ (_lbl_player_two_10,"labelCarom");
RDebugUtils.currentLine=458818;
 //BA.debugLineNum = 458818;BA.debugLine="func.caromLabelCss(lbl_player_two_1, \"labelCarom\"";
_func._caromlabelcss /*String*/ (_lbl_player_two_1,"labelCarom");
RDebugUtils.currentLine=458819;
 //BA.debugLineNum = 458819;BA.debugLine="func.caromLabelCss(lbl_player_one_make_100, \"labe";
_func._caromlabelcss /*String*/ (_lbl_player_one_make_100,"labelCarom");
RDebugUtils.currentLine=458820;
 //BA.debugLineNum = 458820;BA.debugLine="func.caromLabelCss(lbl_player_one_make_10, \"label";
_func._caromlabelcss /*String*/ (_lbl_player_one_make_10,"labelCarom");
RDebugUtils.currentLine=458821;
 //BA.debugLineNum = 458821;BA.debugLine="func.caromLabelCss(lbl_player_one_make_1, \"labelC";
_func._caromlabelcss /*String*/ (_lbl_player_one_make_1,"labelCarom");
RDebugUtils.currentLine=458822;
 //BA.debugLineNum = 458822;BA.debugLine="func.caromLabelCss(lbl_player_two_make_100, \"labe";
_func._caromlabelcss /*String*/ (_lbl_player_two_make_100,"labelCarom");
RDebugUtils.currentLine=458823;
 //BA.debugLineNum = 458823;BA.debugLine="func.caromLabelCss(lbl_player_two_make_10, \"label";
_func._caromlabelcss /*String*/ (_lbl_player_two_make_10,"labelCarom");
RDebugUtils.currentLine=458824;
 //BA.debugLineNum = 458824;BA.debugLine="func.caromLabelCss(lbl_player_two_make_1, \"labelC";
_func._caromlabelcss /*String*/ (_lbl_player_two_make_1,"labelCarom");
RDebugUtils.currentLine=458826;
 //BA.debugLineNum = 458826;BA.debugLine="resetBoard(False)";
_resetboard(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=458828;
 //BA.debugLineNum = 458828;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3604482;BA.debugLine="Log(\"Promote Running \" & promoteRunning)";
anywheresoftware.b4a.keywords.Common.Log("Promote Running "+BA.ObjectToString(_promoterunning));
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="inactivecls.updatePromote";
parent._inactivecls._updatepromote /*String*/ (null);
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="lbl_config_update.Visible = True";
parent._lbl_config_update.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="Sleep(5000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "updatecfg"),(int) (5000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="lbl_config_update.Visible = False";
parent._lbl_config_update.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}