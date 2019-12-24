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
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_ip = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_p1_inning = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_p2_innin = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_p2_inning = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.main _main = null;
public static b4j.example.nieuwe_partij _nieuwe_partij = null;
public static b4j.example.func _func = null;
public static b4j.example.parseconfig _parseconfig = null;
public static b4j.example.funcinet _funcinet = null;
public static b4j.example.getnode _getnode = null;
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
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="lbl_ip.Text = func.getIpNumber";
parent._lbl_ip.setText(parent._func._getipnumber /*String*/ ());
RDebugUtils.currentLine=262152;
 //BA.debugLineNum = 262152;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
parent._frm.SetFormStyle("UTILITY");
RDebugUtils.currentLine=262158;
 //BA.debugLineNum = 262158;BA.debugLine="frm.Stylesheets.Add(File.GetUri(File.DirAssets, \"";
parent._frm.getStylesheets().Add((Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"n205.css")));
RDebugUtils.currentLine=262159;
 //BA.debugLineNum = 262159;BA.debugLine="parseConfig.pullConfig";
parent._parseconfig._pullconfig /*String*/ ();
RDebugUtils.currentLine=262160;
 //BA.debugLineNum = 262160;BA.debugLine="MouseOver(frm.RootPane)";
_mouseover((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(parent._frm.getRootPane().getObject())));
RDebugUtils.currentLine=262163;
 //BA.debugLineNum = 262163;BA.debugLine="func.SetCustomCursor1(File.DirAssets, \"mouse.png\"";
parent._func._setcustomcursor1 /*String*/ (anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"mouse.png",370,370,(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(parent._frm.getRootPane().getObject())));
RDebugUtils.currentLine=262165;
 //BA.debugLineNum = 262165;BA.debugLine="clsTmr.Initialize(lbl_clock)";
parent._clstmr._initialize /*String*/ (null,ba,(anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(parent._lbl_clock.getObject())));
RDebugUtils.currentLine=262166;
 //BA.debugLineNum = 262166;BA.debugLine="inactivecls.Initialize(870, 510)";
parent._inactivecls._initialize /*String*/ (null,ba,870,510);
RDebugUtils.currentLine=262167;
 //BA.debugLineNum = 262167;BA.debugLine="clsCheckCfg.Initialize";
parent._clscheckcfg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=262168;
 //BA.debugLineNum = 262168;BA.debugLine="clsToast.Initialize(frm.RootPane)";
parent._clstoast._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._frm.getRootPane().getObject())));
RDebugUtils.currentLine=262172;
 //BA.debugLineNum = 262172;BA.debugLine="lbl_version.Text = func.getVersion";
parent._lbl_version.setText(parent._func._getversion /*String*/ ());
RDebugUtils.currentLine=262173;
 //BA.debugLineNum = 262173;BA.debugLine="func.lblInnings = lbl_innings";
parent._func._lblinnings /*anywheresoftware.b4j.objects.LabelWrapper*/  = parent._lbl_innings;
RDebugUtils.currentLine=262174;
 //BA.debugLineNum = 262174;BA.debugLine="func.lbl_player_one_hs = lbl_player_one_hs";
parent._func._lbl_player_one_hs /*anywheresoftware.b4j.objects.LabelWrapper*/  = parent._lbl_player_one_hs;
RDebugUtils.currentLine=262175;
 //BA.debugLineNum = 262175;BA.debugLine="func.lbl_player_two_hs = lbl_player_two_hs";
parent._func._lbl_player_two_hs /*anywheresoftware.b4j.objects.LabelWrapper*/  = parent._lbl_player_two_hs;
RDebugUtils.currentLine=262177;
 //BA.debugLineNum = 262177;BA.debugLine="func.setP1CaromLables(lstPlayerOneScoreLbl)";
parent._func._setp1caromlables /*String*/ (_lstplayeronescorelbl());
RDebugUtils.currentLine=262178;
 //BA.debugLineNum = 262178;BA.debugLine="func.setP2CaromLables(lstPlayerTwoScoreLbl)";
parent._func._setp2caromlables /*String*/ (_lstplayertwoscorelbl());
RDebugUtils.currentLine=262180;
 //BA.debugLineNum = 262180;BA.debugLine="Wait For (funcInet.testInet) Complete (result As";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "show"), parent._funcinet._testinet /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (boolean) result[0];
;
RDebugUtils.currentLine=262181;
 //BA.debugLineNum = 262181;BA.debugLine="If result Then";
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
RDebugUtils.currentLine=262182;
 //BA.debugLineNum = 262182;BA.debugLine="func.hasInternetAccess = True";
parent._func._hasinternetaccess /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=262185;
 //BA.debugLineNum = 262185;BA.debugLine="func.hasInternetAccess = False";
parent._func._hasinternetaccess /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=262188;
 //BA.debugLineNum = 262188;BA.debugLine="initPanels";
_initpanels();
RDebugUtils.currentLine=262189;
 //BA.debugLineNum = 262189;BA.debugLine="frm.Show";
parent._frm.Show();
RDebugUtils.currentLine=262190;
 //BA.debugLineNum = 262190;BA.debugLine="setFontStyle";
_setfontstyle();
RDebugUtils.currentLine=262191;
 //BA.debugLineNum = 262191;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Dim caroms, make As Int";
_caroms = 0;
_make = 0;
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="caroms = lbl_player_one_100.Text&lbl_player_one_1";
_caroms = (int)(Double.parseDouble(parent._lbl_player_one_100.getText()+parent._lbl_player_one_10.getText()+parent._lbl_player_one_1.getText()));
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="make = lbl_player_one_make_100.text&lbl_player_on";
_make = (int)(Double.parseDouble(parent._lbl_player_one_make_100.getText()+parent._lbl_player_one_make_10.getText()+parent._lbl_player_one_make_1.getText()));
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="If make = 0 Then Return";
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
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="If caroms >= make Then";
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
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="func.calcMoyenneP2";
parent._func._calcmoyennep2 /*String*/ ();
RDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="lbl_game_text.Text = $\"Gelijkmakende beurt voor";
parent._lbl_game_text.setText(("Gelijkmakende beurt voor "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._lbl_player_two_name.getText()))+""));
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="pn_game.Top = (frm.RootPane.Height/2)-(pn_game.H";
parent._pn_game.setTop((parent._frm.getRootPane().getHeight()/(double)2)-(parent._pn_game.getHeight()/(double)2));
RDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="setP2Name";
_setp2name();
RDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="Sleep(4000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "checkmatchwonp1"),(int) (4000));
this.state = 11;
return;
case 11:
//C
this.state = 10;
;
RDebugUtils.currentLine=2097166;
 //BA.debugLineNum = 2097166;BA.debugLine="pn_game.Top = 1650";
parent._pn_game.setTop(1650);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=2097168;
 //BA.debugLineNum = 2097168;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _setp2name() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "setp2name", false))
	 {return ((String) Debug.delegate(ba, "setp2name", null));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub setP2Name";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="lbl_player_two_name.Color = 0xffFFFFFF'0xff3455db";
_lbl_player_two_name.setColor((int) (0xffffffff));
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="lbl_player_two_name.TextColor = 0xff000000";
_lbl_player_two_name.setTextColor((int) (0xff000000));
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="lbl_player_one_name.Color = 0xFF001A01";
_lbl_player_one_name.setColor((int) (0xff001a01));
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="lbl_player_one_name.TextColor =0xFF81CFE0";
_lbl_player_one_name.setTextColor((int) (0xff81cfe0));
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="lbl_player_one_100.Enabled = False";
_lbl_player_one_100.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="lbl_player_one_10.Enabled = False";
_lbl_player_one_10.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="lbl_player_one_1.Enabled = False";
_lbl_player_one_1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2031626;
 //BA.debugLineNum = 2031626;BA.debugLine="lbl_player_two_100.Enabled = True";
_lbl_player_two_100.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="lbl_player_two_10.Enabled = True";
_lbl_player_two_10.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2031628;
 //BA.debugLineNum = 2031628;BA.debugLine="lbl_player_two_1.Enabled = True";
_lbl_player_two_1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2031630;
 //BA.debugLineNum = 2031630;BA.debugLine="lbl_p1_inning.Visible = False";
_lbl_p1_inning.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2031631;
 //BA.debugLineNum = 2031631;BA.debugLine="lbl_p2_inning.Visible = True";
_lbl_p2_inning.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2031632;
 //BA.debugLineNum = 2031632;BA.debugLine="End Sub";
return "";
}
public static void  _checkmatchwonp2() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "checkmatchwonp2", false))
	 {Debug.delegate(ba, "checkmatchwonp2", null); return;}
ResumableSub_checkMatchWonP2 rsub = new ResumableSub_checkMatchWonP2(null);
rsub.resume(ba, null);
}
public static class ResumableSub_checkMatchWonP2 extends BA.ResumableSub {
public ResumableSub_checkMatchWonP2(b4j.example.scorebord parent) {
this.parent = parent;
}
b4j.example.scorebord parent;
int _p2caroms = 0;
int _p2make = 0;
int _p1caroms = 0;
int _p1make = 0;

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
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Dim p2caroms, p2make As Int";
_p2caroms = 0;
_p2make = 0;
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Dim p1caroms, p1make As Int";
_p1caroms = 0;
_p1make = 0;
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="p2caroms = lbl_player_two_100.Text&lbl_player_two";
_p2caroms = (int)(Double.parseDouble(parent._lbl_player_two_100.getText()+parent._lbl_player_two_10.getText()+parent._lbl_player_two_1.getText()));
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="p2make = lbl_player_two_make_100.text&lbl_player_";
_p2make = (int)(Double.parseDouble(parent._lbl_player_two_make_100.getText()+parent._lbl_player_two_make_10.getText()+parent._lbl_player_two_make_1.getText()));
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="If p2make = 0 Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_p2make==0) { 
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
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="p1caroms = lbl_player_one_100.Text&lbl_player_one";
_p1caroms = (int)(Double.parseDouble(parent._lbl_player_one_100.getText()+parent._lbl_player_one_10.getText()+parent._lbl_player_one_1.getText()));
RDebugUtils.currentLine=2162698;
 //BA.debugLineNum = 2162698;BA.debugLine="p1make = lbl_player_one_make_100.text&lbl_player_";
_p1make = (int)(Double.parseDouble(parent._lbl_player_one_make_100.getText()+parent._lbl_player_one_make_10.getText()+parent._lbl_player_one_make_1.getText()));
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="If p2caroms >= p2make And p1make = p1caroms Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_p2caroms>=_p2make && _p1make==_p1caroms) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="lbl_game_text.Text = $\"Remise partij\"$";
parent._lbl_game_text.setText(("Remise partij"));
RDebugUtils.currentLine=2162702;
 //BA.debugLineNum = 2162702;BA.debugLine="pn_game.Top = (frm.RootPane.Height/2)-(pn_game.H";
parent._pn_game.setTop((parent._frm.getRootPane().getHeight()/(double)2)-(parent._pn_game.getHeight()/(double)2));
RDebugUtils.currentLine=2162703;
 //BA.debugLineNum = 2162703;BA.debugLine="setP2Name";
_setp2name();
RDebugUtils.currentLine=2162704;
 //BA.debugLineNum = 2162704;BA.debugLine="Sleep(4000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "checkmatchwonp2"),(int) (4000));
this.state = 14;
return;
case 14:
//C
this.state = 10;
;
RDebugUtils.currentLine=2162705;
 //BA.debugLineNum = 2162705;BA.debugLine="pn_game.Top = 1650";
parent._pn_game.setTop(1650);
RDebugUtils.currentLine=2162706;
 //BA.debugLineNum = 2162706;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=2162710;
 //BA.debugLineNum = 2162710;BA.debugLine="If p2caroms >= p2make Then";

case 10:
//if
this.state = 13;
if (_p2caroms>=_p2make) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=2162711;
 //BA.debugLineNum = 2162711;BA.debugLine="lbl_game_text.Text = $\"${lbl_player_two_name.Tex";
parent._lbl_game_text.setText((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._lbl_player_two_name.getText()))+" heeft de partij gewonnen"));
RDebugUtils.currentLine=2162712;
 //BA.debugLineNum = 2162712;BA.debugLine="pn_game.Top = (frm.RootPane.Height/2)-(pn_game.H";
parent._pn_game.setTop((parent._frm.getRootPane().getHeight()/(double)2)-(parent._pn_game.getHeight()/(double)2));
RDebugUtils.currentLine=2162713;
 //BA.debugLineNum = 2162713;BA.debugLine="setP2Name";
_setp2name();
RDebugUtils.currentLine=2162714;
 //BA.debugLineNum = 2162714;BA.debugLine="Sleep(4000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "checkmatchwonp2"),(int) (4000));
this.state = 15;
return;
case 15:
//C
this.state = 13;
;
RDebugUtils.currentLine=2162715;
 //BA.debugLineNum = 2162715;BA.debugLine="pn_game.Top = 1650";
parent._pn_game.setTop(1650);
 if (true) break;

case 13:
//C
this.state = -1;
;
RDebugUtils.currentLine=2162727;
 //BA.debugLineNum = 2162727;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
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
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="pn_promote.SetLayoutAnimated(0, x, y, pn_promote.";
parent._pn_promote.SetLayoutAnimated((int) (0),_x,_y,parent._pn_promote.getWidth(),parent._pn_promote.getHeight());
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "drawpromote"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _hideform(boolean _hide) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "hideform", false))
	 {return ((String) Debug.delegate(ba, "hideform", new Object[] {_hide}));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub hideForm(hide As Boolean)";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="frm.rootpane.Visible = hide";
_frm.getRootPane().setVisible(_hide);
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
public static String  _initpanels() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "initpanels", false))
	 {return ((String) Debug.delegate(ba, "initpanels", null));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub initPanels";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="pn_promote_top = 1130 'pn_promote.Top";
_pn_promote_top = 1130;
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="pn_promote_left = 20 'pn_promote.Left";
_pn_promote_left = 20;
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="inactivecls.frm = frm";
_inactivecls._frm /*anywheresoftware.b4j.objects.Form*/  = _frm;
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="inactivecls.pn_promote = pn_promote";
_inactivecls._pn_promote /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/  = _pn_promote;
RDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub lbl_close_MouseReleased (EventData As MouseEve";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_innings_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_innings_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_innings_mousereleased", new Object[] {_eventdata}));}
int _points = 0;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub lbl_innings_MouseReleased (EventData As MouseE";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Dim points As Int = lbl_innings.Text";
_points = (int)(Double.parseDouble(_lbl_innings.getText()));
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="points = points + 1";
_points = (int) (_points+1);
 }else {
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="points = points - 1";
_points = (int) (_points-1);
 };
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="If points = -1 Then";
if (_points==-1) { 
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1179660;
 //BA.debugLineNum = 1179660;BA.debugLine="func.innigs = points";
_func._innigs /*int*/  = _points;
RDebugUtils.currentLine=1179661;
 //BA.debugLineNum = 1179661;BA.debugLine="lbl_innings.Text = func.padString(points, \"0\", 0,";
_lbl_innings.setText(_func._padstring /*String*/ (BA.NumberToString(_points),"0",(int) (0),(int) (3)));
RDebugUtils.currentLine=1179662;
 //BA.debugLineNum = 1179662;BA.debugLine="func.calcMoyenne(lbl_player_one_moyenne, lbl_play";
_func._calcmoyenne /*String*/ (_lbl_player_one_moyenne,_lbl_player_two_moyenne);
RDebugUtils.currentLine=1179663;
 //BA.debugLineNum = 1179663;BA.debugLine="func.processHs(\"all\")";
_func._processhs /*String*/ ("all");
RDebugUtils.currentLine=1179664;
 //BA.debugLineNum = 1179664;BA.debugLine="func.inngSet = 1";
_func._inngset /*int*/  = (int) (1);
RDebugUtils.currentLine=1179665;
 //BA.debugLineNum = 1179665;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 786434;BA.debugLine="func.calcScorePlayerOne(1, EventData.PrimaryButto";
_func._calcscoreplayerone /*String*/ ((int) (1),_eventdata.getPrimaryButtonPressed());
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="End Sub";
return "";
}
public static String  _setp1name() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "setp1name", false))
	 {return ((String) Debug.delegate(ba, "setp1name", null));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub setP1Name";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="lbl_player_one_name.Color = 0xffFFFFFF'0xff3455db";
_lbl_player_one_name.setColor((int) (0xffffffff));
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="lbl_player_one_name.TextColor = 0xff000000";
_lbl_player_one_name.setTextColor((int) (0xff000000));
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="lbl_player_two_name.Color = 0xFF001A01";
_lbl_player_two_name.setColor((int) (0xff001a01));
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="lbl_player_two_name.TextColor = 0xFF81CFE0";
_lbl_player_two_name.setTextColor((int) (0xff81cfe0));
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="lbl_player_one_100.Enabled = True";
_lbl_player_one_100.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="lbl_player_one_10.Enabled = True";
_lbl_player_one_10.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="lbl_player_one_1.Enabled = True";
_lbl_player_one_1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1966090;
 //BA.debugLineNum = 1966090;BA.debugLine="lbl_player_two_100.Enabled = False";
_lbl_player_two_100.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="lbl_player_two_10.Enabled = False";
_lbl_player_two_10.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1966092;
 //BA.debugLineNum = 1966092;BA.debugLine="lbl_player_two_1.Enabled = False";
_lbl_player_two_1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1966094;
 //BA.debugLineNum = 1966094;BA.debugLine="lbl_p1_inning.Visible = True";
_lbl_p1_inning.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1966095;
 //BA.debugLineNum = 1966095;BA.debugLine="lbl_p2_inning.Visible = False";
_lbl_p2_inning.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1966097;
 //BA.debugLineNum = 1966097;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 851970;BA.debugLine="func.calcScorePlayerOne(10, EventData.PrimaryButt";
_func._calcscoreplayerone /*String*/ ((int) (10),_eventdata.getPrimaryButtonPressed());
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 917506;BA.debugLine="func.calcScorePlayerOne(100, EventData.PrimaryBut";
_func._calcscoreplayerone /*String*/ ((int) (100),_eventdata.getPrimaryButtonPressed());
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_hs_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_hs_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_hs_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub lbl_player_one_hs_MouseReleased (EventData As";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="lbl_player_one_hs.Text = func.setHs(lbl_player_on";
_lbl_player_one_hs.setText(_func._seths /*String*/ (_lbl_player_one_hs.getText(),_eventdata.getPrimaryButtonPressed()));
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_make_1_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_make_1_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_make_1_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub lbl_player_one_make_1_MouseReleased (EventData";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="func.playerOneMake(lbl_player_one_make_100, lbl_p";
_func._playeronemake /*String*/ (_lbl_player_one_make_100,_lbl_player_one_make_10,_lbl_player_one_make_1,_eventdata.getPrimaryButtonPressed(),(int) (1));
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_make_10_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_make_10_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_make_10_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub lbl_player_one_make_10_MouseReleased (EventDat";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="func.playerOneMake(lbl_player_one_make_100, lbl_p";
_func._playeronemake /*String*/ (_lbl_player_one_make_100,_lbl_player_one_make_10,_lbl_player_one_make_1,_eventdata.getPrimaryButtonPressed(),(int) (10));
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_make_100_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_make_100_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_make_100_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub lbl_player_one_make_100_MouseReleased (EventDa";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="func.playerOneMake(lbl_player_one_make_100, lbl_p";
_func._playeronemake /*String*/ (_lbl_player_one_make_100,_lbl_player_one_make_10,_lbl_player_one_make_1,_eventdata.getPrimaryButtonPressed(),(int) (100));
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_name_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_name_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_name_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub lbl_player_one_name_MouseReleased (EventData A";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="If func.inngSet = 0 Then";
if (_func._inngset /*int*/ ==0) { 
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="func.inngSet = 1";
_func._inngset /*int*/  = (int) (1);
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="func.innigs = func.innigs+1";
_func._innigs /*int*/  = (int) (_func._innigs /*int*/ +1);
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="lbl_innings.Text = func.padString(func.innigs, \"";
_lbl_innings.setText(_func._padstring /*String*/ (BA.NumberToString(_func._innigs /*int*/ ),"0",(int) (0),(int) (3)));
 };
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="func.calcMoyenneP2";
_func._calcmoyennep2 /*String*/ ();
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="func.processHs(\"all\")";
_func._processhs /*String*/ ("all");
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 983042;BA.debugLine="func.calcScorePlayertwo(1, EventData.PrimaryButto";
_func._calcscoreplayertwo /*String*/ ((int) (1),_eventdata.getPrimaryButtonPressed());
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 1048578;BA.debugLine="func.calcScorePlayertwo(10, EventData.PrimaryButt";
_func._calcscoreplayertwo /*String*/ ((int) (10),_eventdata.getPrimaryButtonPressed());
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 1114114;BA.debugLine="func.calcScorePlayertwo(100, EventData.PrimaryBut";
_func._calcscoreplayertwo /*String*/ ((int) (100),_eventdata.getPrimaryButtonPressed());
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_hs_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_hs_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_hs_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub lbl_player_two_hs_MouseReleased (EventData As";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="lbl_player_two_hs.Text = func.setHs(lbl_player_tw";
_lbl_player_two_hs.setText(_func._seths /*String*/ (_lbl_player_two_hs.getText(),_eventdata.getPrimaryButtonPressed()));
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_make_1_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_make_1_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_make_1_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub lbl_player_two_make_1_MouseReleased (EventData";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="func.playertwoMake(lbl_player_two_make_100, lbl_p";
_func._playertwomake /*String*/ (_lbl_player_two_make_100,_lbl_player_two_make_10,_lbl_player_two_make_1,_eventdata.getPrimaryButtonPressed(),(int) (1));
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_make_10_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_make_10_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_make_10_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub lbl_player_two_make_10_MouseReleased (EventDat";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="func.playertwoMake(lbl_player_two_make_100, lbl_p";
_func._playertwomake /*String*/ (_lbl_player_two_make_100,_lbl_player_two_make_10,_lbl_player_two_make_1,_eventdata.getPrimaryButtonPressed(),(int) (10));
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_make_100_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_make_100_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_make_100_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub lbl_player_two_make_100_MouseReleased (EventDa";
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="func.playertwoMake(lbl_player_two_make_100, lbl_p";
_func._playertwomake /*String*/ (_lbl_player_two_make_100,_lbl_player_two_make_10,_lbl_player_two_make_1,_eventdata.getPrimaryButtonPressed(),(int) (100));
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_name_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_name_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_name_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub lbl_player_two_name_MouseReleased (EventData A";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="setP2Name";
_setp2name();
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="func.calcMoyenneP1";
_func._calcmoyennep1 /*String*/ ();
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="func.processHs(\"all\")";
_func._processhs /*String*/ ("all");
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="func.inngSet = 0";
_func._inngset /*int*/  = (int) (0);
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_reset_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_reset_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "lbl_reset_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub lbl_reset_MouseEntered (EventData As MouseEven";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="lbl_reset.Color =  0xFF69D79A";
_lbl_reset.setColor((int) (0xff69d79a));
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="lbl_reset.TextColor = 0xFFFFFF00";
_lbl_reset.setTextColor((int) (0xffffff00));
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_reset_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_reset_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "lbl_reset_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub lbl_reset_MouseExited (EventData As MouseEvent";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="lbl_reset.Color = 0xFFFF0000";
_lbl_reset.setColor((int) (0xffff0000));
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="lbl_reset.TextColor = 0xFFFFFFFF";
_lbl_reset.setTextColor((int) (0xffffffff));
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_reset_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_reset_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_reset_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub lbl_reset_MouseReleased (EventData As MouseEve";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="inactivecls.lastClick = DateTime.Now";
_inactivecls._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="If func.newGameInitialized = False Then";
if (_func._newgameinitialized /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="CallSub(nieuwe_partij, \"show\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(ba,(Object)(_nieuwe_partij.getObject()),"show");
 }else {
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="CallSub(nieuwe_partij, \"showForm\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(ba,(Object)(_nieuwe_partij.getObject()),"showForm");
 };
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="nieuwePartij";
_nieuwepartij();
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="End Sub";
return "";
}
public static String  _nieuwepartij() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "nieuwepartij", false))
	 {return ((String) Debug.delegate(ba, "nieuwepartij", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub nieuwePartij";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="If func.newGameInitialized = False Then";
if (_func._newgameinitialized /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="nieuwe_partij.show";
_nieuwe_partij._show /*String*/ ();
 }else {
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="CallSub(nieuwe_partij, \"showForm\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(ba,(Object)(_nieuwe_partij.getObject()),"showForm");
 };
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub MainForm_MouseClicked (EventData As MouseEvent";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="If inactivecls.tmr_draw_promote.Enabled = True Th";
if (_inactivecls._tmr_draw_promote /*anywheresoftware.b4a.objects.Timer*/ .getEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="pn_promote.Top = pn_promote_top";
_pn_promote.setTop(_pn_promote_top);
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="pn_promote_left = pn_promote_left";
_pn_promote_left = _pn_promote_left;
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="inactivecls.lastClick = DateTime.Now";
_inactivecls._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="inactivecls.enableTime(True)";
_inactivecls._enabletime /*String*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="inactivecls.enablePromote(False)";
_inactivecls._enablepromote /*String*/ (null,anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="If promoteRunning = True Then";
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
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="pn_promote.Top = pn_promote_top";
parent._pn_promote.setTop(parent._pn_promote_top);
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="pn_promote.left = pn_promote_left";
parent._pn_promote.setLeft(parent._pn_promote_left);
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "mousein_event"),(int) (0));
this.state = 5;
return;
case 5:
//C
this.state = 4;
;
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="inactivecls.lastClick = DateTime.Now";
parent._inactivecls._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="inactivecls.enableTime(True)";
parent._inactivecls._enabletime /*String*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="inactivecls.enablePromote(False)";
parent._inactivecls._enablepromote /*String*/ (null,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="promoteRunning = False";
parent._promoterunning = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2818057;
 //BA.debugLineNum = 2818057;BA.debugLine="Sleep(300)";
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
RDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _mouseover(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n1) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "mouseover", false))
	 {return ((String) Debug.delegate(ba, "mouseover", new Object[] {_n1}));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="private Sub MouseOver(n1 As Node)";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="setHandler(n1,\"setOnMouseMoved\",\"mouseIn\")";
_sethandler((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_n1.getObject())),"setOnMouseMoved","mouseIn");
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="setHandler(n1,\"setOnMouseExited\",\"mouseOut\")";
_sethandler((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_n1.getObject())),"setOnMouseExited","mouseOut");
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="End Sub";
return "";
}
public static String  _sethandler(anywheresoftware.b4j.object.JavaObject _ob,String _eventname,String _handlername) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "sethandler", false))
	 {return ((String) Debug.delegate(ba, "sethandler", new Object[] {_ob,_eventname,_handlername}));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="private Sub setHandler(ob As JavaObject,eventName";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="ob.RunMethod(eventName, Array(ob.CreateEventFromU";
_ob.RunMethod(_eventname,new Object[]{_ob.CreateEventFromUI(ba,"javafx.event.EventHandler",_handlername,(Object)(anywheresoftware.b4a.keywords.Common.True))});
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="End Sub";
return "";
}
public static String  _playeroneperc(String _perc) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "playeroneperc", false))
	 {return ((String) Debug.delegate(ba, "playeroneperc", new Object[] {_perc}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub playerOnePerc(perc As String)";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="lbl_player_one_perc.Text = perc";
_lbl_player_one_perc.setText(_perc);
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return "";
}
public static String  _playertwoperc(String _perc) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "playertwoperc", false))
	 {return ((String) Debug.delegate(ba, "playertwoperc", new Object[] {_perc}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub playerTwoPerc(perc As String)";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="lbl_player_two_perc.Text = perc";
_lbl_player_two_perc.setText(_perc);
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="End Sub";
return "";
}
public static String  _resetboard() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "resetboard", false))
	 {return ((String) Debug.delegate(ba, "resetboard", null));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub resetBoard";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="lbl_player_one_name.Text = \"Speler 1\"";
_lbl_player_one_name.setText("Speler 1");
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="lbl_player_two_name.Text = \"Speler 2\"";
_lbl_player_two_name.setText("Speler 2");
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="lbl_player_one_1.Text = \"0\"";
_lbl_player_one_1.setText("0");
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="lbl_player_one_10.Text = \"0\"";
_lbl_player_one_10.setText("0");
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="lbl_player_one_100.Text = \"0\"";
_lbl_player_one_100.setText("0");
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="lbl_player_one_make_100.Text = \"0\"";
_lbl_player_one_make_100.setText("0");
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="lbl_player_one_make_10.Text = \"0\"";
_lbl_player_one_make_10.setText("0");
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="lbl_player_one_make_1.Text = \"0\"";
_lbl_player_one_make_1.setText("0");
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="lbl_player_one_moyenne.Text = \"0.000\"";
_lbl_player_one_moyenne.setText("0.000");
RDebugUtils.currentLine=1900555;
 //BA.debugLineNum = 1900555;BA.debugLine="lbl_player_one_perc.Text = \"0.00%\"";
_lbl_player_one_perc.setText("0.00%");
RDebugUtils.currentLine=1900557;
 //BA.debugLineNum = 1900557;BA.debugLine="lbl_innings.Text = \"001\"";
_lbl_innings.setText("001");
RDebugUtils.currentLine=1900559;
 //BA.debugLineNum = 1900559;BA.debugLine="lbl_player_two_100.Text = \"0\"";
_lbl_player_two_100.setText("0");
RDebugUtils.currentLine=1900560;
 //BA.debugLineNum = 1900560;BA.debugLine="lbl_player_two_10.Text = \"0\"";
_lbl_player_two_10.setText("0");
RDebugUtils.currentLine=1900561;
 //BA.debugLineNum = 1900561;BA.debugLine="lbl_player_two_1.Text = \"0\"";
_lbl_player_two_1.setText("0");
RDebugUtils.currentLine=1900562;
 //BA.debugLineNum = 1900562;BA.debugLine="lbl_player_two_make_100.Text = \"0\"";
_lbl_player_two_make_100.setText("0");
RDebugUtils.currentLine=1900563;
 //BA.debugLineNum = 1900563;BA.debugLine="lbl_player_two_make_10.Text = \"0\"";
_lbl_player_two_make_10.setText("0");
RDebugUtils.currentLine=1900564;
 //BA.debugLineNum = 1900564;BA.debugLine="lbl_player_two_make_1.Text = \"0\"";
_lbl_player_two_make_1.setText("0");
RDebugUtils.currentLine=1900565;
 //BA.debugLineNum = 1900565;BA.debugLine="lbl_player_two_perc.Text = \"0.00%\"";
_lbl_player_two_perc.setText("0.00%");
RDebugUtils.currentLine=1900566;
 //BA.debugLineNum = 1900566;BA.debugLine="lbl_player_two_moyenne.Text = \"0.000\"";
_lbl_player_two_moyenne.setText("0.000");
RDebugUtils.currentLine=1900567;
 //BA.debugLineNum = 1900567;BA.debugLine="lbl_player_one_hs.Text = \"000\"";
_lbl_player_one_hs.setText("000");
RDebugUtils.currentLine=1900568;
 //BA.debugLineNum = 1900568;BA.debugLine="lbl_player_two_hs.Text = \"000\"";
_lbl_player_two_hs.setText("000");
RDebugUtils.currentLine=1900570;
 //BA.debugLineNum = 1900570;BA.debugLine="func.inngSet = 1";
_func._inngset /*int*/  = (int) (1);
RDebugUtils.currentLine=1900571;
 //BA.debugLineNum = 1900571;BA.debugLine="func.innigs = 1";
_func._innigs /*int*/  = (int) (1);
RDebugUtils.currentLine=1900572;
 //BA.debugLineNum = 1900572;BA.debugLine="func.scorePlayerOne = 0";
_func._scoreplayerone /*int*/  = (int) (0);
RDebugUtils.currentLine=1900573;
 //BA.debugLineNum = 1900573;BA.debugLine="func.scorePlayerTwo = 0";
_func._scoreplayertwo /*int*/  = (int) (0);
RDebugUtils.currentLine=1900574;
 //BA.debugLineNum = 1900574;BA.debugLine="func.playerOneToMake = 0";
_func._playeronetomake /*int*/  = (int) (0);
RDebugUtils.currentLine=1900575;
 //BA.debugLineNum = 1900575;BA.debugLine="func.playertwoToMake = 0";
_func._playertwotomake /*int*/  = (int) (0);
RDebugUtils.currentLine=1900576;
 //BA.debugLineNum = 1900576;BA.debugLine="func.playerOneHs = 0";
_func._playeronehs /*int*/  = (int) (0);
RDebugUtils.currentLine=1900577;
 //BA.debugLineNum = 1900577;BA.debugLine="func.playerTwoHs = 0";
_func._playertwohs /*int*/  = (int) (0);
RDebugUtils.currentLine=1900578;
 //BA.debugLineNum = 1900578;BA.debugLine="func.p1HsTemp = 0";
_func._p1hstemp /*int*/  = (int) (0);
RDebugUtils.currentLine=1900579;
 //BA.debugLineNum = 1900579;BA.debugLine="func.p2HsTemp = 0";
_func._p2hstemp /*int*/  = (int) (0);
RDebugUtils.currentLine=1900580;
 //BA.debugLineNum = 1900580;BA.debugLine="B4XProgressBarP1.Progress = 0";
_b4xprogressbarp1._setprogress /*float*/ (null,(float) (0));
RDebugUtils.currentLine=1900581;
 //BA.debugLineNum = 1900581;BA.debugLine="B4XProgressBarP2.Progress = 0";
_b4xprogressbarp2._setprogress /*float*/ (null,(float) (0));
RDebugUtils.currentLine=1900582;
 //BA.debugLineNum = 1900582;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=1900584;
 //BA.debugLineNum = 1900584;BA.debugLine="End Sub";
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
public static String  _setfontstyle() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "setfontstyle", false))
	 {return ((String) Debug.delegate(ba, "setfontstyle", null));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub setFontStyle";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="func.caromLabelCss(lbl_player_one_hs, \"labelWhite";
_func._caromlabelcss /*String*/ (_lbl_player_one_hs,"labelWhite");
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="func.caromLabelCss(lbl_player_one_moyenne, \"label";
_func._caromlabelcss /*String*/ (_lbl_player_one_moyenne,"labelWhite");
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="func.caromLabelCss(lbl_player_one_perc, \"labelWhi";
_func._caromlabelcss /*String*/ (_lbl_player_one_perc,"labelWhite");
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="func.caromLabelCss(lbl_player_two_hs, \"labelWhite";
_func._caromlabelcss /*String*/ (_lbl_player_two_hs,"labelWhite");
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="func.caromLabelCss(lbl_player_two_moyenne, \"label";
_func._caromlabelcss /*String*/ (_lbl_player_two_moyenne,"labelWhite");
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="func.caromLabelCss(lbl_player_two_perc, \"labelWhi";
_func._caromlabelcss /*String*/ (_lbl_player_two_perc,"labelWhite");
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="func.caromLabelCss(lbl_innings, \"labelCarom\")";
_func._caromlabelcss /*String*/ (_lbl_innings,"labelCarom");
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="func.caromLabelCss(lbl_player_one_100, \"labelCaro";
_func._caromlabelcss /*String*/ (_lbl_player_one_100,"labelCarom");
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="func.caromLabelCss(lbl_player_one_10, \"labelCarom";
_func._caromlabelcss /*String*/ (_lbl_player_one_10,"labelCarom");
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="func.caromLabelCss(lbl_player_one_1, \"labelCarom\"";
_func._caromlabelcss /*String*/ (_lbl_player_one_1,"labelCarom");
RDebugUtils.currentLine=458766;
 //BA.debugLineNum = 458766;BA.debugLine="func.caromLabelCss(lbl_player_one_make_100, \"labe";
_func._caromlabelcss /*String*/ (_lbl_player_one_make_100,"labelCarom");
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="func.caromLabelCss(lbl_player_one_make_10, \"label";
_func._caromlabelcss /*String*/ (_lbl_player_one_make_10,"labelCarom");
RDebugUtils.currentLine=458768;
 //BA.debugLineNum = 458768;BA.debugLine="func.caromLabelCss(lbl_player_one_make_1, \"labelC";
_func._caromlabelcss /*String*/ (_lbl_player_one_make_1,"labelCarom");
RDebugUtils.currentLine=458770;
 //BA.debugLineNum = 458770;BA.debugLine="func.caromLabelCss(lbl_player_two_100, \"labelCaro";
_func._caromlabelcss /*String*/ (_lbl_player_two_100,"labelCarom");
RDebugUtils.currentLine=458771;
 //BA.debugLineNum = 458771;BA.debugLine="func.caromLabelCss(lbl_player_two_10, \"labelCarom";
_func._caromlabelcss /*String*/ (_lbl_player_two_10,"labelCarom");
RDebugUtils.currentLine=458772;
 //BA.debugLineNum = 458772;BA.debugLine="func.caromLabelCss(lbl_player_two_1, \"labelCarom\"";
_func._caromlabelcss /*String*/ (_lbl_player_two_1,"labelCarom");
RDebugUtils.currentLine=458774;
 //BA.debugLineNum = 458774;BA.debugLine="func.caromLabelCss(lbl_player_two_make_100, \"labe";
_func._caromlabelcss /*String*/ (_lbl_player_two_make_100,"labelCarom");
RDebugUtils.currentLine=458775;
 //BA.debugLineNum = 458775;BA.debugLine="func.caromLabelCss(lbl_player_two_make_10, \"label";
_func._caromlabelcss /*String*/ (_lbl_player_two_make_10,"labelCarom");
RDebugUtils.currentLine=458776;
 //BA.debugLineNum = 458776;BA.debugLine="func.caromLabelCss(lbl_player_two_make_1, \"labelC";
_func._caromlabelcss /*String*/ (_lbl_player_two_make_1,"labelCarom");
RDebugUtils.currentLine=458778;
 //BA.debugLineNum = 458778;BA.debugLine="resetBoard";
_resetboard();
RDebugUtils.currentLine=458779;
 //BA.debugLineNum = 458779;BA.debugLine="End Sub";
return "";
}
public static String  _setmessage(anywheresoftware.b4a.objects.collections.List _msglist) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "setmessage", false))
	 {return ((String) Debug.delegate(ba, "setmessage", new Object[] {_msglist}));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub setMessage(msgList As List)";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="lbl_message_1.Text = msgList.get(0)";
_lbl_message_1.setText(BA.ObjectToString(_msglist.Get((int) (0))));
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="lbl_message_2.Text = msgList.get(1)";
_lbl_message_2.setText(BA.ObjectToString(_msglist.Get((int) (1))));
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="lbl_message_3.Text = msgList.get(2)";
_lbl_message_3.setText(BA.ObjectToString(_msglist.Get((int) (2))));
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="lbl_message_4.Text = msgList.get(3)";
_lbl_message_4.setText(BA.ObjectToString(_msglist.Get((int) (3))));
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="lbl_message_5.Text = msgList.Get(4)";
_lbl_message_5.setText(BA.ObjectToString(_msglist.Get((int) (4))));
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="End Sub";
return "";
}
public static String  _setpromoterunning(boolean _running) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "setpromoterunning", false))
	 {return ((String) Debug.delegate(ba, "setpromoterunning", new Object[] {_running}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub setPromoteRunning(running As Boolean)";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="promoteRunning = running";
_promoterunning = _running;
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="End Sub";
return "";
}
public static String  _setspelerdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "setspelerdata", false))
	 {return ((String) Debug.delegate(ba, "setspelerdata", new Object[] {_data}));}
String _temaken = "";
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub setSpelerData(data As List)";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="resetBoard";
_resetboard();
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="lbl_innings.Text = \"001\"";
_lbl_innings.setText("001");
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="func.inngSet = 1";
_func._inngset /*int*/  = (int) (1);
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="func.innigs = 1";
_func._innigs /*int*/  = (int) (1);
RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="Dim teMaken As String";
_temaken = "";
RDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="lbl_player_one_name.Text = data.Get(0)";
_lbl_player_one_name.setText(BA.ObjectToString(_data.Get((int) (0))));
RDebugUtils.currentLine=3407880;
 //BA.debugLineNum = 3407880;BA.debugLine="func.playerOneToMake = data.Get(1)";
_func._playeronetomake /*int*/  = (int)(BA.ObjectToNumber(_data.Get((int) (1))));
RDebugUtils.currentLine=3407881;
 //BA.debugLineNum = 3407881;BA.debugLine="teMaken =  func.padString(data.Get(1), \"0\", 0, 3)";
_temaken = _func._padstring /*String*/ (BA.ObjectToString(_data.Get((int) (1))),"0",(int) (0),(int) (3));
RDebugUtils.currentLine=3407882;
 //BA.debugLineNum = 3407882;BA.debugLine="lbl_player_one_make_100.Text	= teMaken.SubString2";
_lbl_player_one_make_100.setText(_temaken.substring((int) (0),(int) (1)));
RDebugUtils.currentLine=3407883;
 //BA.debugLineNum = 3407883;BA.debugLine="lbl_player_one_make_10.Text		= teMaken.SubString2";
_lbl_player_one_make_10.setText(_temaken.substring((int) (1),(int) (2)));
RDebugUtils.currentLine=3407884;
 //BA.debugLineNum = 3407884;BA.debugLine="lbl_player_one_make_1.Text		= teMaken.SubString2(";
_lbl_player_one_make_1.setText(_temaken.substring((int) (2),(int) (3)));
RDebugUtils.currentLine=3407886;
 //BA.debugLineNum = 3407886;BA.debugLine="lbl_player_two_name.Text = data.Get(2)";
_lbl_player_two_name.setText(BA.ObjectToString(_data.Get((int) (2))));
RDebugUtils.currentLine=3407887;
 //BA.debugLineNum = 3407887;BA.debugLine="teMaken =  func.padString(data.Get(3), \"0\", 0, 3)";
_temaken = _func._padstring /*String*/ (BA.ObjectToString(_data.Get((int) (3))),"0",(int) (0),(int) (3));
RDebugUtils.currentLine=3407888;
 //BA.debugLineNum = 3407888;BA.debugLine="func.playerTwoToMake = data.Get(3)";
_func._playertwotomake /*int*/  = (int)(BA.ObjectToNumber(_data.Get((int) (3))));
RDebugUtils.currentLine=3407889;
 //BA.debugLineNum = 3407889;BA.debugLine="lbl_player_two_make_100.Text	= teMaken.SubString2";
_lbl_player_two_make_100.setText(_temaken.substring((int) (0),(int) (1)));
RDebugUtils.currentLine=3407890;
 //BA.debugLineNum = 3407890;BA.debugLine="lbl_player_two_make_10.Text		= teMaken.SubString2";
_lbl_player_two_make_10.setText(_temaken.substring((int) (1),(int) (2)));
RDebugUtils.currentLine=3407891;
 //BA.debugLineNum = 3407891;BA.debugLine="lbl_player_two_make_1.Text		= teMaken.SubString2(";
_lbl_player_two_make_1.setText(_temaken.substring((int) (2),(int) (3)));
RDebugUtils.currentLine=3407892;
 //BA.debugLineNum = 3407892;BA.debugLine="End Sub";
return "";
}
public static String  _showpromote() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "showpromote", false))
	 {return ((String) Debug.delegate(ba, "showpromote", null));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub showPromote";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="pn_promote.SetLayoutAnimated(0, 50dip, 50dip, pn_";
_pn_promote.SetLayoutAnimated((int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),_pn_promote.getWidth(),_pn_promote.getHeight());
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="End Sub";
return "";
}
public static String  _showsponor(boolean _enabled) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "showsponor", false))
	 {return ((String) Debug.delegate(ba, "showsponor", new Object[] {_enabled}));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub showSponor(enabled As Boolean)";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="pn_sponsore.Visible = enabled";
_pn_sponsore.setVisible(_enabled);
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="inactivecls.updatePromote";
parent._inactivecls._updatepromote /*String*/ (null);
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="lbl_config_update.Visible = True";
parent._lbl_config_update.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="Sleep(5000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "updatecfg"),(int) (5000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="lbl_config_update.Visible = False";
parent._lbl_config_update.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub useDigitalFont(useDigital As Boolean)";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Dim fsCarom, fsMake, fsInnings As Int";
_fscarom = 0;
_fsmake = 0;
_fsinnings = 0;
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="If useDigital Then";
if (_usedigital) { 
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="fsCarom = 300'350";
_fscarom = (int) (300);
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="fsMake = 225";
_fsmake = (int) (225);
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="fsInnings = 250'300";
_fsinnings = (int) (250);
 }else {
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="fsCarom = 225";
_fscarom = (int) (225);
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="fsMake = 150";
_fsmake = (int) (150);
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="fsInnings = 200";
_fsinnings = (int) (200);
 };
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="func.setFont(lbl_player_one_1, fsCarom, useDigita";
_func._setfont /*String*/ (_lbl_player_one_1,_fscarom,_usedigital);
RDebugUtils.currentLine=3145742;
 //BA.debugLineNum = 3145742;BA.debugLine="func.setFont(lbl_player_one_10, fsCarom, useDigit";
_func._setfont /*String*/ (_lbl_player_one_10,_fscarom,_usedigital);
RDebugUtils.currentLine=3145743;
 //BA.debugLineNum = 3145743;BA.debugLine="func.setFont(lbl_player_one_100, fsCarom, useDigi";
_func._setfont /*String*/ (_lbl_player_one_100,_fscarom,_usedigital);
RDebugUtils.currentLine=3145744;
 //BA.debugLineNum = 3145744;BA.debugLine="func.setFont(lbl_player_two_1, fsCarom, useDigita";
_func._setfont /*String*/ (_lbl_player_two_1,_fscarom,_usedigital);
RDebugUtils.currentLine=3145745;
 //BA.debugLineNum = 3145745;BA.debugLine="func.setFont(lbl_player_two_10, fsCarom, useDigit";
_func._setfont /*String*/ (_lbl_player_two_10,_fscarom,_usedigital);
RDebugUtils.currentLine=3145746;
 //BA.debugLineNum = 3145746;BA.debugLine="func.setFont(lbl_player_two_100, fsCarom, useDigi";
_func._setfont /*String*/ (_lbl_player_two_100,_fscarom,_usedigital);
RDebugUtils.currentLine=3145747;
 //BA.debugLineNum = 3145747;BA.debugLine="func.setFont(lbl_innings, fsInnings, useDigital)";
_func._setfont /*String*/ (_lbl_innings,_fsinnings,_usedigital);
RDebugUtils.currentLine=3145748;
 //BA.debugLineNum = 3145748;BA.debugLine="func.setFont(lbl_player_one_make_100, fsMake, use";
_func._setfont /*String*/ (_lbl_player_one_make_100,_fsmake,_usedigital);
RDebugUtils.currentLine=3145749;
 //BA.debugLineNum = 3145749;BA.debugLine="func.setFont(lbl_player_one_make_10, fsMake, useD";
_func._setfont /*String*/ (_lbl_player_one_make_10,_fsmake,_usedigital);
RDebugUtils.currentLine=3145750;
 //BA.debugLineNum = 3145750;BA.debugLine="func.setFont(lbl_player_one_make_1, fsMake, useDi";
_func._setfont /*String*/ (_lbl_player_one_make_1,_fsmake,_usedigital);
RDebugUtils.currentLine=3145751;
 //BA.debugLineNum = 3145751;BA.debugLine="func.setFont(lbl_player_two_make_100,fsMake, useD";
_func._setfont /*String*/ (_lbl_player_two_make_100,_fsmake,_usedigital);
RDebugUtils.currentLine=3145752;
 //BA.debugLineNum = 3145752;BA.debugLine="func.setFont(lbl_player_two_make_10,fsMake, useDi";
_func._setfont /*String*/ (_lbl_player_two_make_10,_fsmake,_usedigital);
RDebugUtils.currentLine=3145753;
 //BA.debugLineNum = 3145753;BA.debugLine="func.setFont(lbl_player_two_make_1,fsMake, useDig";
_func._setfont /*String*/ (_lbl_player_two_make_1,_fsmake,_usedigital);
RDebugUtils.currentLine=3145755;
 //BA.debugLineNum = 3145755;BA.debugLine="End Sub";
return "";
}
public static String  _usefontyellow(boolean _useyellow) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "usefontyellow", false))
	 {return ((String) Debug.delegate(ba, "usefontyellow", new Object[] {_useyellow}));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub useFontYellow(useYellow As Boolean)";
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="func.setFontColor(lbl_innings, useYellow)";
_func._setfontcolor /*String*/ (_lbl_innings,_useyellow);
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="func.setFontColor(lbl_player_one_1, useYellow)";
_func._setfontcolor /*String*/ (_lbl_player_one_1,_useyellow);
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="func.setFontColor(lbl_player_one_10, useYellow)";
_func._setfontcolor /*String*/ (_lbl_player_one_10,_useyellow);
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="func.setFontColor(lbl_player_one_100, useYellow)";
_func._setfontcolor /*String*/ (_lbl_player_one_100,_useyellow);
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="func.setFontColor(lbl_player_two_1, useYellow)";
_func._setfontcolor /*String*/ (_lbl_player_two_1,_useyellow);
RDebugUtils.currentLine=3211273;
 //BA.debugLineNum = 3211273;BA.debugLine="func.setFontColor(lbl_player_two_10, useYellow)";
_func._setfontcolor /*String*/ (_lbl_player_two_10,_useyellow);
RDebugUtils.currentLine=3211274;
 //BA.debugLineNum = 3211274;BA.debugLine="func.setFontColor(lbl_player_two_100, useYellow)";
_func._setfontcolor /*String*/ (_lbl_player_two_100,_useyellow);
RDebugUtils.currentLine=3211276;
 //BA.debugLineNum = 3211276;BA.debugLine="func.setFontColor(lbl_player_one_make_100, useYel";
_func._setfontcolor /*String*/ (_lbl_player_one_make_100,_useyellow);
RDebugUtils.currentLine=3211277;
 //BA.debugLineNum = 3211277;BA.debugLine="func.setFontColor(lbl_player_one_make_10, useYell";
_func._setfontcolor /*String*/ (_lbl_player_one_make_10,_useyellow);
RDebugUtils.currentLine=3211278;
 //BA.debugLineNum = 3211278;BA.debugLine="func.setFontColor(lbl_player_one_make_1, useYello";
_func._setfontcolor /*String*/ (_lbl_player_one_make_1,_useyellow);
RDebugUtils.currentLine=3211280;
 //BA.debugLineNum = 3211280;BA.debugLine="func.setFontColor(lbl_player_two_make_100, useYel";
_func._setfontcolor /*String*/ (_lbl_player_two_make_100,_useyellow);
RDebugUtils.currentLine=3211281;
 //BA.debugLineNum = 3211281;BA.debugLine="func.setFontColor(lbl_player_two_make_10, useYell";
_func._setfontcolor /*String*/ (_lbl_player_two_make_10,_useyellow);
RDebugUtils.currentLine=3211282;
 //BA.debugLineNum = 3211282;BA.debugLine="func.setFontColor(lbl_player_two_make_1, useYello";
_func._setfontcolor /*String*/ (_lbl_player_two_make_1,_useyellow);
RDebugUtils.currentLine=3211283;
 //BA.debugLineNum = 3211283;BA.debugLine="End Sub";
return "";
}
}