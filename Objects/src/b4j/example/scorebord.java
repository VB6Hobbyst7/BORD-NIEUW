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
public static b4j.example.classupdate _clsupdate = null;
public static double _pn_promote_top = 0;
public static double _pn_promote_left = 0;
public static boolean _promoterunning = false;
public static anywheresoftware.b4a.objects.B4XViewWrapper _pnieuwepartij = null;
public static b4j.example.b4xdialog _pnieuwepartijdialog = null;
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
public static anywheresoftware.b4j.objects.Form _xfrm = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pn_game = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_game_text = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pn_a = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.main _main = null;
public static b4j.example.nieuwe_partij _nieuwe_partij = null;
public static b4j.example.func _func = null;
public static b4j.example.parseconfig _parseconfig = null;
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
RDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="xfrm.Initialize(\"frm\", 1920, 1080)";
parent._xfrm.Initialize(ba,"frm",1920,1080);
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="xfrm.SetFormStyle(\"UNDECORATED\")";
parent._xfrm.SetFormStyle("UNDECORATED");
RDebugUtils.currentLine=21299203;
 //BA.debugLineNum = 21299203;BA.debugLine="xfrm.RootPane.LoadLayout(\"nieuwe_partij\")";
parent._xfrm.getRootPane().LoadLayout(ba,"nieuwe_partij");
RDebugUtils.currentLine=21299204;
 //BA.debugLineNum = 21299204;BA.debugLine="xfrm.Stylesheets.Add(File.GetUri(File.DirAssets,";
parent._xfrm.getStylesheets().Add((Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"n205.css")));
RDebugUtils.currentLine=21299205;
 //BA.debugLineNum = 21299205;BA.debugLine="xfrm.BackColor  =   fx.Colors.From32Bit(0xFF001A0";
parent._xfrm.setBackColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit((int) (0xff001a01))));
RDebugUtils.currentLine=21299209;
 //BA.debugLineNum = 21299209;BA.debugLine="frm.Initialize(\"frm\", 1920, 1080)";
parent._frm.Initialize(ba,"frm",1920,1080);
RDebugUtils.currentLine=21299210;
 //BA.debugLineNum = 21299210;BA.debugLine="frm.RootPane.LoadLayout(\"scorebord\")";
parent._frm.getRootPane().LoadLayout(ba,"scorebord");
RDebugUtils.currentLine=21299211;
 //BA.debugLineNum = 21299211;BA.debugLine="frm.BackColor  =   fx.Colors.From32Bit(0xFF001A01";
parent._frm.setBackColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit((int) (0xff001a01))));
RDebugUtils.currentLine=21299213;
 //BA.debugLineNum = 21299213;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
parent._frm.SetFormStyle("UTILITY");
RDebugUtils.currentLine=21299219;
 //BA.debugLineNum = 21299219;BA.debugLine="setFontSize";
_setfontsize();
RDebugUtils.currentLine=21299220;
 //BA.debugLineNum = 21299220;BA.debugLine="frm.Stylesheets.Add(File.GetUri(File.DirAssets, \"";
parent._frm.getStylesheets().Add((Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"n205.css")));
RDebugUtils.currentLine=21299221;
 //BA.debugLineNum = 21299221;BA.debugLine="parseConfig.pullConfig";
parent._parseconfig._pullconfig /*String*/ ();
RDebugUtils.currentLine=21299224;
 //BA.debugLineNum = 21299224;BA.debugLine="frm.Show";
parent._frm.Show();
RDebugUtils.currentLine=21299225;
 //BA.debugLineNum = 21299225;BA.debugLine="MouseOver(frm.RootPane)";
_mouseover((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(parent._frm.getRootPane().getObject())));
RDebugUtils.currentLine=21299227;
 //BA.debugLineNum = 21299227;BA.debugLine="Base = frm.RootPane";
parent._base.setObject((java.lang.Object)(parent._frm.getRootPane().getObject()));
RDebugUtils.currentLine=21299228;
 //BA.debugLineNum = 21299228;BA.debugLine="Dialog.Initialize (Base)";
parent._dialog._initialize /*String*/ (null,ba,parent._base);
RDebugUtils.currentLine=21299231;
 //BA.debugLineNum = 21299231;BA.debugLine="func.SetCustomCursor1(File.DirAssets, \"mouse.png\"";
parent._func._setcustomcursor1 /*String*/ (anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"mouse.png",370,370,(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(parent._frm.getRootPane().getObject())));
RDebugUtils.currentLine=21299232;
 //BA.debugLineNum = 21299232;BA.debugLine="func.SetCustomCursor1(File.DirAssets, \"mouse.png\"";
parent._func._setcustomcursor1 /*String*/ (anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"mouse.png",370,370,(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(parent._xfrm.getRootPane().getObject())));
RDebugUtils.currentLine=21299235;
 //BA.debugLineNum = 21299235;BA.debugLine="clsTmr.Initialize(lbl_clock)";
parent._clstmr._initialize /*String*/ (null,ba,(anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(parent._lbl_clock.getObject())));
RDebugUtils.currentLine=21299236;
 //BA.debugLineNum = 21299236;BA.debugLine="inactivecls.Initialize";
parent._inactivecls._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=21299237;
 //BA.debugLineNum = 21299237;BA.debugLine="clsCheckCfg.Initialize";
parent._clscheckcfg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=21299238;
 //BA.debugLineNum = 21299238;BA.debugLine="clsToast.Initialize(frm.RootPane)";
parent._clstoast._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._frm.getRootPane().getObject())));
RDebugUtils.currentLine=21299239;
 //BA.debugLineNum = 21299239;BA.debugLine="clsUpdate.Initialize";
parent._clsupdate._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=21299240;
 //BA.debugLineNum = 21299240;BA.debugLine="lbl_version.Text = func.getVersion";
parent._lbl_version.setText(parent._func._getversion /*String*/ ());
RDebugUtils.currentLine=21299241;
 //BA.debugLineNum = 21299241;BA.debugLine="func.lblInnings = lbl_innings";
parent._func._lblinnings /*anywheresoftware.b4j.objects.LabelWrapper*/  = parent._lbl_innings;
RDebugUtils.currentLine=21299242;
 //BA.debugLineNum = 21299242;BA.debugLine="func.lbl_player_one_hs = lbl_player_one_hs";
parent._func._lbl_player_one_hs /*anywheresoftware.b4j.objects.LabelWrapper*/  = parent._lbl_player_one_hs;
RDebugUtils.currentLine=21299243;
 //BA.debugLineNum = 21299243;BA.debugLine="func.lbl_player_two_hs = lbl_player_two_hs";
parent._func._lbl_player_two_hs /*anywheresoftware.b4j.objects.LabelWrapper*/  = parent._lbl_player_two_hs;
RDebugUtils.currentLine=21299245;
 //BA.debugLineNum = 21299245;BA.debugLine="func.setP1CaromLables(lstPlayerOneScoreLbl)";
parent._func._setp1caromlables /*String*/ (_lstplayeronescorelbl());
RDebugUtils.currentLine=21299246;
 //BA.debugLineNum = 21299246;BA.debugLine="func.setP2CaromLables(lstPlayerTwoScoreLbl)";
parent._func._setp2caromlables /*String*/ (_lstplayertwoscorelbl());
RDebugUtils.currentLine=21299248;
 //BA.debugLineNum = 21299248;BA.debugLine="Wait For (funcInet.testInet) Complete (result As";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "show"), parent._funcinet._testinet /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (boolean) result[0];
;
RDebugUtils.currentLine=21299249;
 //BA.debugLineNum = 21299249;BA.debugLine="If result Then";
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
RDebugUtils.currentLine=21299250;
 //BA.debugLineNum = 21299250;BA.debugLine="func.hasInternetAccess = True";
parent._func._hasinternetaccess /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=21299251;
 //BA.debugLineNum = 21299251;BA.debugLine="clsUpdate.checkUpdate";
parent._clsupdate._checkupdate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=21299253;
 //BA.debugLineNum = 21299253;BA.debugLine="func.hasInternetAccess = False";
parent._func._hasinternetaccess /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=21299256;
 //BA.debugLineNum = 21299256;BA.debugLine="initPanels";
_initpanels();
RDebugUtils.currentLine=21299258;
 //BA.debugLineNum = 21299258;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "application_error", false))
	 {return ((Boolean) Debug.delegate(ba, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="End Sub";
return false;
}
public static String  _btn_a_begint_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "btn_a_begint_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "btn_a_begint_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=23789568;
 //BA.debugLineNum = 23789568;BA.debugLine="Sub btn_a_begint_MouseReleased (EventData As Mouse";
RDebugUtils.currentLine=23789570;
 //BA.debugLineNum = 23789570;BA.debugLine="End Sub";
return "";
}
public static String  _btn_annuleer_nieuwe_partij_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "btn_annuleer_nieuwe_partij_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "btn_annuleer_nieuwe_partij_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=24313856;
 //BA.debugLineNum = 24313856;BA.debugLine="Sub btn_annuleer_nieuwe_partij_MouseReleased (Even";
RDebugUtils.currentLine=24313857;
 //BA.debugLineNum = 24313857;BA.debugLine="xfrm.Close";
_xfrm.Close();
RDebugUtils.currentLine=24313860;
 //BA.debugLineNum = 24313860;BA.debugLine="End Sub";
return "";
}
public static String  _btn_b_begint_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "btn_b_begint_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "btn_b_begint_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=23855104;
 //BA.debugLineNum = 23855104;BA.debugLine="Sub btn_b_begint_MouseReleased (EventData As Mouse";
RDebugUtils.currentLine=23855106;
 //BA.debugLineNum = 23855106;BA.debugLine="End Sub";
return "";
}
public static String  _btn_exit_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "btn_exit_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "btn_exit_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Sub btn_exit_MouseReleased (EventData As MouseEven";
RDebugUtils.currentLine=22347777;
 //BA.debugLineNum = 22347777;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=22347778;
 //BA.debugLineNum = 22347778;BA.debugLine="End Sub";
return "";
}
public static String  _btn_nieuwe_partij_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "btn_nieuwe_partij_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "btn_nieuwe_partij_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=24248320;
 //BA.debugLineNum = 24248320;BA.debugLine="Sub btn_nieuwe_partij_MouseReleased (EventData As";
RDebugUtils.currentLine=24248322;
 //BA.debugLineNum = 24248322;BA.debugLine="xfrm.Close";
_xfrm.Close();
RDebugUtils.currentLine=24248323;
 //BA.debugLineNum = 24248323;BA.debugLine="resetBoard(False)";
_resetboard(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24248324;
 //BA.debugLineNum = 24248324;BA.debugLine="If chk_add_player.Checked Then";
if (_chk_add_player.getChecked()) { 
RDebugUtils.currentLine=24248325;
 //BA.debugLineNum = 24248325;BA.debugLine="iets";
_iets();
 };
RDebugUtils.currentLine=24248327;
 //BA.debugLineNum = 24248327;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23330817;
 //BA.debugLineNum = 23330817;BA.debugLine="If bordStart Then";
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
RDebugUtils.currentLine=23330819;
 //BA.debugLineNum = 23330819;BA.debugLine="Dim sf As Object = jxui.Msgbox2Async(\"Bord reset";
_sf = parent._jxui.Msgbox2Async(ba,"Bord resetten?","","Ja","","Nee",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=23330820;
 //BA.debugLineNum = 23330820;BA.debugLine="Wait For (sf) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "resetboard"), _sf);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_result = (int) result[0];
;
RDebugUtils.currentLine=23330821;
 //BA.debugLineNum = 23330821;BA.debugLine="If Result = jxui.DialogResponse_Negative Then";
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
RDebugUtils.currentLine=23330822;
 //BA.debugLineNum = 23330822;BA.debugLine="Return";
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
RDebugUtils.currentLine=23330829;
 //BA.debugLineNum = 23330829;BA.debugLine="setCaromNumber(lbl_player_one_1, \"0\")";
_setcaromnumber((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._lbl_player_one_1.getObject())),"0");
RDebugUtils.currentLine=23330831;
 //BA.debugLineNum = 23330831;BA.debugLine="setCaromNumber(lbl_player_one_10, \"0\")";
_setcaromnumber((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._lbl_player_one_10.getObject())),"0");
RDebugUtils.currentLine=23330833;
 //BA.debugLineNum = 23330833;BA.debugLine="setCaromNumber(lbl_player_one_100, \"0\")";
_setcaromnumber((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._lbl_player_one_100.getObject())),"0");
RDebugUtils.currentLine=23330836;
 //BA.debugLineNum = 23330836;BA.debugLine="lbl_player_one_1.Text = \"0\"";
parent._lbl_player_one_1.setText("0");
RDebugUtils.currentLine=23330837;
 //BA.debugLineNum = 23330837;BA.debugLine="lbl_player_one_make_100.Text = \"0\"";
parent._lbl_player_one_make_100.setText("0");
RDebugUtils.currentLine=23330838;
 //BA.debugLineNum = 23330838;BA.debugLine="lbl_player_one_make_10.Text = \"0\"";
parent._lbl_player_one_make_10.setText("0");
RDebugUtils.currentLine=23330839;
 //BA.debugLineNum = 23330839;BA.debugLine="lbl_player_one_make_1.Text = \"0\"";
parent._lbl_player_one_make_1.setText("0");
RDebugUtils.currentLine=23330840;
 //BA.debugLineNum = 23330840;BA.debugLine="lbl_player_one_moyenne.Text = \"0.000\"";
parent._lbl_player_one_moyenne.setText("0.000");
RDebugUtils.currentLine=23330841;
 //BA.debugLineNum = 23330841;BA.debugLine="lbl_player_one_perc.Text = \"0.00%\"";
parent._lbl_player_one_perc.setText("0.00%");
RDebugUtils.currentLine=23330843;
 //BA.debugLineNum = 23330843;BA.debugLine="lbl_innings.Text = \"000\"";
parent._lbl_innings.setText("000");
RDebugUtils.currentLine=23330846;
 //BA.debugLineNum = 23330846;BA.debugLine="lbl_player_two_100.Text = \"0\"";
parent._lbl_player_two_100.setText("0");
RDebugUtils.currentLine=23330847;
 //BA.debugLineNum = 23330847;BA.debugLine="lbl_player_two_10.Text = \"0\"";
parent._lbl_player_two_10.setText("0");
RDebugUtils.currentLine=23330848;
 //BA.debugLineNum = 23330848;BA.debugLine="lbl_player_two_1.Text = \"0\"";
parent._lbl_player_two_1.setText("0");
RDebugUtils.currentLine=23330849;
 //BA.debugLineNum = 23330849;BA.debugLine="lbl_player_two_make_100.Text = \"0\"";
parent._lbl_player_two_make_100.setText("0");
RDebugUtils.currentLine=23330850;
 //BA.debugLineNum = 23330850;BA.debugLine="lbl_player_two_make_10.Text = \"0\"";
parent._lbl_player_two_make_10.setText("0");
RDebugUtils.currentLine=23330851;
 //BA.debugLineNum = 23330851;BA.debugLine="lbl_player_two_make_1.Text = \"0\"";
parent._lbl_player_two_make_1.setText("0");
RDebugUtils.currentLine=23330852;
 //BA.debugLineNum = 23330852;BA.debugLine="lbl_player_two_perc.Text = \"0.00%\"";
parent._lbl_player_two_perc.setText("0.00%");
RDebugUtils.currentLine=23330853;
 //BA.debugLineNum = 23330853;BA.debugLine="lbl_player_two_moyenne.Text = \"0.000\"";
parent._lbl_player_two_moyenne.setText("0.000");
RDebugUtils.currentLine=23330854;
 //BA.debugLineNum = 23330854;BA.debugLine="lbl_player_one_hs.Text = \"000\"";
parent._lbl_player_one_hs.setText("000");
RDebugUtils.currentLine=23330855;
 //BA.debugLineNum = 23330855;BA.debugLine="lbl_player_two_hs.Text = \"000\"";
parent._lbl_player_two_hs.setText("000");
RDebugUtils.currentLine=23330857;
 //BA.debugLineNum = 23330857;BA.debugLine="func.inngSet = 0";
parent._func._inngset /*int*/  = (int) (0);
RDebugUtils.currentLine=23330858;
 //BA.debugLineNum = 23330858;BA.debugLine="func.innigs = 0";
parent._func._innigs /*int*/  = (int) (0);
RDebugUtils.currentLine=23330859;
 //BA.debugLineNum = 23330859;BA.debugLine="func.scorePlayerOne = 0";
parent._func._scoreplayerone /*int*/  = (int) (0);
RDebugUtils.currentLine=23330860;
 //BA.debugLineNum = 23330860;BA.debugLine="func.scorePlayerTwo = 0";
parent._func._scoreplayertwo /*int*/  = (int) (0);
RDebugUtils.currentLine=23330861;
 //BA.debugLineNum = 23330861;BA.debugLine="func.playerOneToMake = 0";
parent._func._playeronetomake /*int*/  = (int) (0);
RDebugUtils.currentLine=23330862;
 //BA.debugLineNum = 23330862;BA.debugLine="func.playertwoToMake = 0";
parent._func._playertwotomake /*int*/  = (int) (0);
RDebugUtils.currentLine=23330863;
 //BA.debugLineNum = 23330863;BA.debugLine="func.playerOneHs = 0";
parent._func._playeronehs /*int*/  = (int) (0);
RDebugUtils.currentLine=23330864;
 //BA.debugLineNum = 23330864;BA.debugLine="func.playerTwoHs = 0";
parent._func._playertwohs /*int*/  = (int) (0);
RDebugUtils.currentLine=23330865;
 //BA.debugLineNum = 23330865;BA.debugLine="func.p1HsTemp = 0";
parent._func._p1hstemp /*int*/  = (int) (0);
RDebugUtils.currentLine=23330866;
 //BA.debugLineNum = 23330866;BA.debugLine="func.p2HsTemp = 0";
parent._func._p2hstemp /*int*/  = (int) (0);
RDebugUtils.currentLine=23330867;
 //BA.debugLineNum = 23330867;BA.debugLine="B4XProgressBarP1.Progress = 0";
parent._b4xprogressbarp1._setprogress /*float*/ (null,(float) (0));
RDebugUtils.currentLine=23330868;
 //BA.debugLineNum = 23330868;BA.debugLine="B4XProgressBarP2.Progress = 0";
parent._b4xprogressbarp2._setprogress /*float*/ (null,(float) (0));
RDebugUtils.currentLine=23330869;
 //BA.debugLineNum = 23330869;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=23330871;
 //BA.debugLineNum = 23330871;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23658497;
 //BA.debugLineNum = 23658497;BA.debugLine="Dim dlg As B4XDialog";
_dlg = new b4j.example.b4xdialog();
RDebugUtils.currentLine=23658498;
 //BA.debugLineNum = 23658498;BA.debugLine="dlg.Initialize (Base)";
_dlg._initialize /*String*/ (null,ba,parent._base);
RDebugUtils.currentLine=23658499;
 //BA.debugLineNum = 23658499;BA.debugLine="Dim p As B4XView = XUI.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
RDebugUtils.currentLine=23658500;
 //BA.debugLineNum = 23658500;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 600dip)";
_p.SetLayoutAnimated((int) (0),0,0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (600)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (600)));
RDebugUtils.currentLine=23658501;
 //BA.debugLineNum = 23658501;BA.debugLine="p.LoadLayout(\"players\")";
_p.LoadLayout("players",ba);
RDebugUtils.currentLine=23658502;
 //BA.debugLineNum = 23658502;BA.debugLine="dlg.Title = \"Spelers Invoer\"";
_dlg._title /*Object*/  = (Object)("Spelers Invoer");
RDebugUtils.currentLine=23658503;
 //BA.debugLineNum = 23658503;BA.debugLine="dlg.PutAtTop = True 'put the dialog at the top of";
_dlg._putattop /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=23658504;
 //BA.debugLineNum = 23658504;BA.debugLine="Wait For (dlg.ShowCustom(p, \"OK\", \"\", \"CANCEL\"))";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "iets"), _dlg._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=23658505;
 //BA.debugLineNum = 23658505;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=23658508;
 //BA.debugLineNum = 23658508;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btn_test_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "btn_test_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "btn_test_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=25296896;
 //BA.debugLineNum = 25296896;BA.debugLine="Sub btn_test_MouseReleased (EventData As MouseEven";
RDebugUtils.currentLine=25296897;
 //BA.debugLineNum = 25296897;BA.debugLine="clsUpdate.restartApp";
_clsupdate._restartapp /*String*/ (null);
RDebugUtils.currentLine=25296898;
 //BA.debugLineNum = 25296898;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23527425;
 //BA.debugLineNum = 23527425;BA.debugLine="Dim caroms, make As Int";
_caroms = 0;
_make = 0;
RDebugUtils.currentLine=23527427;
 //BA.debugLineNum = 23527427;BA.debugLine="caroms = lbl_player_one_100.Text&lbl_player_one_1";
_caroms = (int)(Double.parseDouble(parent._lbl_player_one_100.getText()+parent._lbl_player_one_10.getText()+parent._lbl_player_one_1.getText()));
RDebugUtils.currentLine=23527428;
 //BA.debugLineNum = 23527428;BA.debugLine="make = lbl_player_one_make_100.text&lbl_player_on";
_make = (int)(Double.parseDouble(parent._lbl_player_one_make_100.getText()+parent._lbl_player_one_make_10.getText()+parent._lbl_player_one_make_1.getText()));
RDebugUtils.currentLine=23527430;
 //BA.debugLineNum = 23527430;BA.debugLine="If make = 0 Then Return";
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
RDebugUtils.currentLine=23527432;
 //BA.debugLineNum = 23527432;BA.debugLine="If caroms >= make Then";
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
RDebugUtils.currentLine=23527433;
 //BA.debugLineNum = 23527433;BA.debugLine="lbl_game_text.Text = $\"Gelijkmakende beurt voor";
parent._lbl_game_text.setText(("Gelijkmakende beurt voor "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._lbl_player_two_name.getText()))+""));
RDebugUtils.currentLine=23527434;
 //BA.debugLineNum = 23527434;BA.debugLine="pn_game.Top = (frm.RootPane.Height/2)-(pn_game.H";
parent._pn_game.setTop((parent._frm.getRootPane().getHeight()/(double)2)-(parent._pn_game.getHeight()/(double)2));
RDebugUtils.currentLine=23527435;
 //BA.debugLineNum = 23527435;BA.debugLine="setP2Name";
_setp2name();
RDebugUtils.currentLine=23527436;
 //BA.debugLineNum = 23527436;BA.debugLine="Sleep(4000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "checkmatchwonp1"),(int) (4000));
this.state = 11;
return;
case 11:
//C
this.state = 10;
;
RDebugUtils.currentLine=23527437;
 //BA.debugLineNum = 23527437;BA.debugLine="pn_game.Top = 1650";
parent._pn_game.setTop(1650);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=23527439;
 //BA.debugLineNum = 23527439;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _setp2name() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "setp2name", false))
	 {return ((String) Debug.delegate(ba, "setp2name", null));}
RDebugUtils.currentLine=23461888;
 //BA.debugLineNum = 23461888;BA.debugLine="Sub setP2Name";
RDebugUtils.currentLine=23461889;
 //BA.debugLineNum = 23461889;BA.debugLine="lbl_player_two_name.Color = 0xff3455db'0xFF69D79A";
_lbl_player_two_name.setColor((int) (0xff3455db));
RDebugUtils.currentLine=23461890;
 //BA.debugLineNum = 23461890;BA.debugLine="lbl_player_one_name.Color = 0xFF001A01";
_lbl_player_one_name.setColor((int) (0xff001a01));
RDebugUtils.currentLine=23461892;
 //BA.debugLineNum = 23461892;BA.debugLine="lbl_player_one_100.Enabled = False";
_lbl_player_one_100.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23461893;
 //BA.debugLineNum = 23461893;BA.debugLine="lbl_player_one_10.Enabled = False";
_lbl_player_one_10.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23461894;
 //BA.debugLineNum = 23461894;BA.debugLine="lbl_player_one_1.Enabled = False";
_lbl_player_one_1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23461896;
 //BA.debugLineNum = 23461896;BA.debugLine="lbl_player_two_100.Enabled = True";
_lbl_player_two_100.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23461897;
 //BA.debugLineNum = 23461897;BA.debugLine="lbl_player_two_10.Enabled = True";
_lbl_player_two_10.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23461898;
 //BA.debugLineNum = 23461898;BA.debugLine="lbl_player_two_1.Enabled = True";
_lbl_player_two_1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23461899;
 //BA.debugLineNum = 23461899;BA.debugLine="End Sub";
return "";
}
public static String  _checkmatchwonp2() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "checkmatchwonp2", false))
	 {return ((String) Debug.delegate(ba, "checkmatchwonp2", null));}
int _caroms = 0;
int _make = 0;
RDebugUtils.currentLine=23592960;
 //BA.debugLineNum = 23592960;BA.debugLine="Sub checkMatchWonP2";
RDebugUtils.currentLine=23592961;
 //BA.debugLineNum = 23592961;BA.debugLine="Dim caroms, make As Int";
_caroms = 0;
_make = 0;
RDebugUtils.currentLine=23592963;
 //BA.debugLineNum = 23592963;BA.debugLine="caroms = lbl_player_two_100.Text&lbl_player_two_1";
_caroms = (int)(Double.parseDouble(_lbl_player_two_100.getText()+_lbl_player_two_10.getText()+_lbl_player_two_1.getText()));
RDebugUtils.currentLine=23592964;
 //BA.debugLineNum = 23592964;BA.debugLine="make = lbl_player_two_make_100.text&lbl_player_tw";
_make = (int)(Double.parseDouble(_lbl_player_two_make_100.getText()+_lbl_player_two_make_10.getText()+_lbl_player_two_make_1.getText()));
RDebugUtils.currentLine=23592965;
 //BA.debugLineNum = 23592965;BA.debugLine="If make = 0 Then Return";
if (_make==0) { 
if (true) return "";};
RDebugUtils.currentLine=23592967;
 //BA.debugLineNum = 23592967;BA.debugLine="If caroms >= make Then";
if (_caroms>=_make) { 
 };
RDebugUtils.currentLine=23592978;
 //BA.debugLineNum = 23592978;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24510465;
 //BA.debugLineNum = 24510465;BA.debugLine="pn_promote.SetLayoutAnimated(0, x, y, pn_promote.";
parent._pn_promote.SetLayoutAnimated((int) (0),_x,_y,parent._pn_promote.getWidth(),parent._pn_promote.getHeight());
RDebugUtils.currentLine=24510466;
 //BA.debugLineNum = 24510466;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "drawpromote"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=24510468;
 //BA.debugLineNum = 24510468;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _edt_temaken_a_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "edt_temaken_a_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edt_temaken_a_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=23920640;
 //BA.debugLineNum = 23920640;BA.debugLine="Sub edt_temaken_a_TextChanged (Old As String, New";
RDebugUtils.currentLine=23920641;
 //BA.debugLineNum = 23920641;BA.debugLine="edt_temaken_a.Text =  func.testNumber(Old, New)";
_edt_temaken_a.setText(_func._testnumber /*String*/ (_old,_new));
RDebugUtils.currentLine=23920642;
 //BA.debugLineNum = 23920642;BA.debugLine="edt_temaken_a.SetSelection(edt_temaken_a.Text.Len";
_edt_temaken_a.SetSelection(_edt_temaken_a.getText().length(),_edt_temaken_a.getText().length());
RDebugUtils.currentLine=23920644;
 //BA.debugLineNum = 23920644;BA.debugLine="End Sub";
return "";
}
public static String  _edt_temaken_b_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "edt_temaken_b_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edt_temaken_b_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=23986176;
 //BA.debugLineNum = 23986176;BA.debugLine="Sub edt_temaken_b_TextChanged (Old As String, New";
RDebugUtils.currentLine=23986177;
 //BA.debugLineNum = 23986177;BA.debugLine="edt_temaken_b.Text =  func.testNumber(Old, New)";
_edt_temaken_b.setText(_func._testnumber /*String*/ (_old,_new));
RDebugUtils.currentLine=23986178;
 //BA.debugLineNum = 23986178;BA.debugLine="edt_temaken_b.SetSelection(edt_temaken_b.Text.Len";
_edt_temaken_b.SetSelection(_edt_temaken_b.getText().length(),_edt_temaken_b.getText().length());
RDebugUtils.currentLine=23986179;
 //BA.debugLineNum = 23986179;BA.debugLine="End Sub";
return "";
}
public static String  _initpanels() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "initpanels", false))
	 {return ((String) Debug.delegate(ba, "initpanels", null));}
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Sub initPanels";
RDebugUtils.currentLine=21430273;
 //BA.debugLineNum = 21430273;BA.debugLine="pNieuwePartijDialog.Initialize (Base)";
_pnieuwepartijdialog._initialize /*String*/ (null,ba,_base);
RDebugUtils.currentLine=21430274;
 //BA.debugLineNum = 21430274;BA.debugLine="pNieuwePartij = XUI.CreatePanel(\"\")";
_pnieuwepartij = _xui.CreatePanel(ba,"");
RDebugUtils.currentLine=21430275;
 //BA.debugLineNum = 21430275;BA.debugLine="pNieuwePartij.SetLayoutAnimated(0, 100dip, 0, 100";
_pnieuwepartij.SetLayoutAnimated((int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1000)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (800)));
RDebugUtils.currentLine=21430276;
 //BA.debugLineNum = 21430276;BA.debugLine="pNieuwePartij.LoadLayout(\"nieuwe_partij\")";
_pnieuwepartij.LoadLayout("nieuwe_partij",ba);
RDebugUtils.currentLine=21430277;
 //BA.debugLineNum = 21430277;BA.debugLine="pNieuwePartijDialog.Title = \"Nieuwe Partij\"";
_pnieuwepartijdialog._title /*Object*/  = (Object)("Nieuwe Partij");
RDebugUtils.currentLine=21430278;
 //BA.debugLineNum = 21430278;BA.debugLine="pNieuwePartijDialog.PutAtTop = False 'put the dia";
_pnieuwepartijdialog._putattop /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=21430280;
 //BA.debugLineNum = 21430280;BA.debugLine="pn_promote_top = 1130 'pn_promote.Top";
_pn_promote_top = 1130;
RDebugUtils.currentLine=21430281;
 //BA.debugLineNum = 21430281;BA.debugLine="pn_promote_left = 20 'pn_promote.Left";
_pn_promote_left = 20;
RDebugUtils.currentLine=21430284;
 //BA.debugLineNum = 21430284;BA.debugLine="inactivecls.frm = frm";
_inactivecls._frm /*anywheresoftware.b4j.objects.Form*/  = _frm;
RDebugUtils.currentLine=21430285;
 //BA.debugLineNum = 21430285;BA.debugLine="inactivecls.pn_promote = pn_promote";
_inactivecls._pn_promote /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/  = _pn_promote;
RDebugUtils.currentLine=21430286;
 //BA.debugLineNum = 21430286;BA.debugLine="inactivecls.pnlWidth = pn_promote.Width";
_inactivecls._pnlwidth /*double*/  = _pn_promote.getWidth();
RDebugUtils.currentLine=21430287;
 //BA.debugLineNum = 21430287;BA.debugLine="inactivecls.pnlHeight = pn_promote.Height";
_inactivecls._pnlheight /*double*/  = _pn_promote.getHeight();
RDebugUtils.currentLine=21430288;
 //BA.debugLineNum = 21430288;BA.debugLine="End Sub";
return "";
}
public static String  _lastclick() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lastclick", false))
	 {return ((String) Debug.delegate(ba, "lastclick", null));}
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Sub lastClick";
RDebugUtils.currentLine=21757953;
 //BA.debugLineNum = 21757953;BA.debugLine="inactivecls.lastClick = DateTime.Now";
_inactivecls._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_close_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_close_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_close_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=24379392;
 //BA.debugLineNum = 24379392;BA.debugLine="Sub lbl_close_MouseReleased (EventData As MouseEve";
RDebugUtils.currentLine=24379393;
 //BA.debugLineNum = 24379393;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=24379394;
 //BA.debugLineNum = 24379394;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_innings_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_innings_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_innings_mousereleased", new Object[] {_eventdata}));}
int _points = 0;
RDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Sub lbl_innings_MouseReleased (EventData As MouseE";
RDebugUtils.currentLine=22282241;
 //BA.debugLineNum = 22282241;BA.debugLine="Dim points As Int = lbl_innings.Text";
_points = (int)(Double.parseDouble(_lbl_innings.getText()));
RDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
RDebugUtils.currentLine=22282243;
 //BA.debugLineNum = 22282243;BA.debugLine="points = points + 1";
_points = (int) (_points+1);
 }else {
RDebugUtils.currentLine=22282245;
 //BA.debugLineNum = 22282245;BA.debugLine="points = points - 1";
_points = (int) (_points-1);
 };
RDebugUtils.currentLine=22282247;
 //BA.debugLineNum = 22282247;BA.debugLine="If points = -1 Then";
if (_points==-1) { 
RDebugUtils.currentLine=22282248;
 //BA.debugLineNum = 22282248;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=22282251;
 //BA.debugLineNum = 22282251;BA.debugLine="func.innigs = points";
_func._innigs /*int*/  = _points;
RDebugUtils.currentLine=22282252;
 //BA.debugLineNum = 22282252;BA.debugLine="lbl_innings.Text = func.padString(points, \"0\", 0,";
_lbl_innings.setText(_func._padstring /*String*/ (BA.NumberToString(_points),"0",(int) (0),(int) (3)));
RDebugUtils.currentLine=22282253;
 //BA.debugLineNum = 22282253;BA.debugLine="func.calcMoyenne(lbl_player_one_moyenne, lbl_play";
_func._calcmoyenne /*String*/ (_lbl_player_one_moyenne,_lbl_player_two_moyenne);
RDebugUtils.currentLine=22282254;
 //BA.debugLineNum = 22282254;BA.debugLine="func.processHs(\"all\")";
_func._processhs /*String*/ ("all");
RDebugUtils.currentLine=22282255;
 //BA.debugLineNum = 22282255;BA.debugLine="func.inngSet = 1";
_func._inngset /*int*/  = (int) (1);
RDebugUtils.currentLine=22282257;
 //BA.debugLineNum = 22282257;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_1_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_1_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_1_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=22413312;
 //BA.debugLineNum = 22413312;BA.debugLine="Sub lbl_player_one_1_MouseEntered (EventData As Mo";
RDebugUtils.currentLine=22413315;
 //BA.debugLineNum = 22413315;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_1_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_1_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_1_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Sub lbl_player_one_1_MouseReleased (EventData As M";
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
RDebugUtils.currentLine=21823491;
 //BA.debugLineNum = 21823491;BA.debugLine="func.calcScorePlayerOne(1)";
_func._calcscoreplayerone /*String*/ ((int) (1));
 }else 
{RDebugUtils.currentLine=21823492;
 //BA.debugLineNum = 21823492;BA.debugLine="Else If EventData.SecondaryButtonPressed Then";
if (_eventdata.getSecondaryButtonPressed()) { 
RDebugUtils.currentLine=21823493;
 //BA.debugLineNum = 21823493;BA.debugLine="func.calcScorePlayerOne(-1)";
_func._calcscoreplayerone /*String*/ ((int) (-1));
 }}
;
RDebugUtils.currentLine=21823495;
 //BA.debugLineNum = 21823495;BA.debugLine="End Sub";
return "";
}
public static String  _setp1name() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "setp1name", false))
	 {return ((String) Debug.delegate(ba, "setp1name", null));}
RDebugUtils.currentLine=23396352;
 //BA.debugLineNum = 23396352;BA.debugLine="Sub setP1Name";
RDebugUtils.currentLine=23396353;
 //BA.debugLineNum = 23396353;BA.debugLine="lbl_player_one_name.Color = 0xff3455db'0xFF69D79A";
_lbl_player_one_name.setColor((int) (0xff3455db));
RDebugUtils.currentLine=23396354;
 //BA.debugLineNum = 23396354;BA.debugLine="lbl_player_two_name.Color = 0xFF001A01";
_lbl_player_two_name.setColor((int) (0xff001a01));
RDebugUtils.currentLine=23396356;
 //BA.debugLineNum = 23396356;BA.debugLine="lbl_player_one_100.Enabled = True";
_lbl_player_one_100.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23396357;
 //BA.debugLineNum = 23396357;BA.debugLine="lbl_player_one_10.Enabled = True";
_lbl_player_one_10.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23396358;
 //BA.debugLineNum = 23396358;BA.debugLine="lbl_player_one_1.Enabled = True";
_lbl_player_one_1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23396360;
 //BA.debugLineNum = 23396360;BA.debugLine="lbl_player_two_100.Enabled = False";
_lbl_player_two_100.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23396361;
 //BA.debugLineNum = 23396361;BA.debugLine="lbl_player_two_10.Enabled = False";
_lbl_player_two_10.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23396362;
 //BA.debugLineNum = 23396362;BA.debugLine="lbl_player_two_1.Enabled = False";
_lbl_player_two_1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23396363;
 //BA.debugLineNum = 23396363;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_10_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_10_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_10_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Sub lbl_player_one_10_MouseReleased (EventData As";
RDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
RDebugUtils.currentLine=21889027;
 //BA.debugLineNum = 21889027;BA.debugLine="func.calcScorePlayerOne(10)";
_func._calcscoreplayerone /*String*/ ((int) (10));
 }else 
{RDebugUtils.currentLine=21889028;
 //BA.debugLineNum = 21889028;BA.debugLine="Else If EventData.SecondaryButtonPressed Then";
if (_eventdata.getSecondaryButtonPressed()) { 
RDebugUtils.currentLine=21889029;
 //BA.debugLineNum = 21889029;BA.debugLine="func.calcScorePlayerOne(-10)";
_func._calcscoreplayerone /*String*/ ((int) (-10));
 }}
;
RDebugUtils.currentLine=21889031;
 //BA.debugLineNum = 21889031;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_100_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_100_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_100_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Sub lbl_player_one_100_MouseReleased (EventData As";
RDebugUtils.currentLine=21954561;
 //BA.debugLineNum = 21954561;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
RDebugUtils.currentLine=21954563;
 //BA.debugLineNum = 21954563;BA.debugLine="func.calcScorePlayerOne(100)";
_func._calcscoreplayerone /*String*/ ((int) (100));
 }else 
{RDebugUtils.currentLine=21954564;
 //BA.debugLineNum = 21954564;BA.debugLine="Else If EventData.SecondaryButtonPressed Then";
if (_eventdata.getSecondaryButtonPressed()) { 
RDebugUtils.currentLine=21954565;
 //BA.debugLineNum = 21954565;BA.debugLine="func.calcScorePlayerOne(-100)";
_func._calcscoreplayerone /*String*/ ((int) (-100));
 }}
;
RDebugUtils.currentLine=21954567;
 //BA.debugLineNum = 21954567;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_active_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_active_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_active_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Sub lbl_player_one_active_MouseReleased (EventData";
RDebugUtils.currentLine=22216707;
 //BA.debugLineNum = 22216707;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_make_1_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_make_1_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_make_1_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=22872064;
 //BA.debugLineNum = 22872064;BA.debugLine="Sub lbl_player_one_make_1_MouseReleased (EventData";
RDebugUtils.currentLine=22872065;
 //BA.debugLineNum = 22872065;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=22872066;
 //BA.debugLineNum = 22872066;BA.debugLine="func.playerOneMake(lbl_player_one_make_100, lbl_p";
_func._playeronemake /*String*/ (_lbl_player_one_make_100,_lbl_player_one_make_10,_lbl_player_one_make_1,_eventdata.getPrimaryButtonPressed(),(int) (1));
RDebugUtils.currentLine=22872067;
 //BA.debugLineNum = 22872067;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_make_10_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_make_10_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_make_10_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=22806528;
 //BA.debugLineNum = 22806528;BA.debugLine="Sub lbl_player_one_make_10_MouseReleased (EventDat";
RDebugUtils.currentLine=22806529;
 //BA.debugLineNum = 22806529;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=22806530;
 //BA.debugLineNum = 22806530;BA.debugLine="func.playerOneMake(lbl_player_one_make_100, lbl_p";
_func._playeronemake /*String*/ (_lbl_player_one_make_100,_lbl_player_one_make_10,_lbl_player_one_make_1,_eventdata.getPrimaryButtonPressed(),(int) (10));
RDebugUtils.currentLine=22806532;
 //BA.debugLineNum = 22806532;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_make_100_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_make_100_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_make_100_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=22740992;
 //BA.debugLineNum = 22740992;BA.debugLine="Sub lbl_player_one_make_100_MouseReleased (EventDa";
RDebugUtils.currentLine=22740993;
 //BA.debugLineNum = 22740993;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=22740994;
 //BA.debugLineNum = 22740994;BA.debugLine="func.playerOneMake(lbl_player_one_make_100, lbl_p";
_func._playeronemake /*String*/ (_lbl_player_one_make_100,_lbl_player_one_make_10,_lbl_player_one_make_1,_eventdata.getPrimaryButtonPressed(),(int) (100));
RDebugUtils.currentLine=22740995;
 //BA.debugLineNum = 22740995;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_name_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_one_name_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_one_name_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=22609920;
 //BA.debugLineNum = 22609920;BA.debugLine="Sub lbl_player_one_name_MouseReleased (EventData A";
RDebugUtils.currentLine=22609921;
 //BA.debugLineNum = 22609921;BA.debugLine="setP1Name";
_setp1name();
RDebugUtils.currentLine=22609922;
 //BA.debugLineNum = 22609922;BA.debugLine="func.processHs(\"all\")";
_func._processhs /*String*/ ("all");
RDebugUtils.currentLine=22609924;
 //BA.debugLineNum = 22609924;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_1_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_1_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_1_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=22478848;
 //BA.debugLineNum = 22478848;BA.debugLine="Sub lbl_player_two_1_MouseEntered (EventData As Mo";
RDebugUtils.currentLine=22478853;
 //BA.debugLineNum = 22478853;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_1_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_1_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_1_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=22544384;
 //BA.debugLineNum = 22544384;BA.debugLine="Sub lbl_player_two_1_MouseExited (EventData As Mou";
RDebugUtils.currentLine=22544388;
 //BA.debugLineNum = 22544388;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_1_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_1_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_1_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=22020096;
 //BA.debugLineNum = 22020096;BA.debugLine="Sub lbl_player_two_1_MouseReleased (EventData As M";
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="setP2Name";
_setp2name();
RDebugUtils.currentLine=22020098;
 //BA.debugLineNum = 22020098;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
RDebugUtils.currentLine=22020099;
 //BA.debugLineNum = 22020099;BA.debugLine="func.calcScorePlayertwo(1)";
_func._calcscoreplayertwo /*String*/ ((int) (1));
 }else 
{RDebugUtils.currentLine=22020100;
 //BA.debugLineNum = 22020100;BA.debugLine="Else If EventData.SecondaryButtonPressed Then";
if (_eventdata.getSecondaryButtonPressed()) { 
RDebugUtils.currentLine=22020101;
 //BA.debugLineNum = 22020101;BA.debugLine="func.calcScorePlayertwo(-1)";
_func._calcscoreplayertwo /*String*/ ((int) (-1));
 }}
;
RDebugUtils.currentLine=22020103;
 //BA.debugLineNum = 22020103;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_10_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_10_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_10_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Sub lbl_player_two_10_MouseReleased (EventData As";
RDebugUtils.currentLine=22085633;
 //BA.debugLineNum = 22085633;BA.debugLine="setP2Name";
_setp2name();
RDebugUtils.currentLine=22085634;
 //BA.debugLineNum = 22085634;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
RDebugUtils.currentLine=22085635;
 //BA.debugLineNum = 22085635;BA.debugLine="func.calcScorePlayertwo(10)";
_func._calcscoreplayertwo /*String*/ ((int) (10));
 }else 
{RDebugUtils.currentLine=22085636;
 //BA.debugLineNum = 22085636;BA.debugLine="Else If EventData.SecondaryButtonPressed Then";
if (_eventdata.getSecondaryButtonPressed()) { 
RDebugUtils.currentLine=22085637;
 //BA.debugLineNum = 22085637;BA.debugLine="func.calcScorePlayertwo(-10)";
_func._calcscoreplayertwo /*String*/ ((int) (-10));
 }}
;
RDebugUtils.currentLine=22085639;
 //BA.debugLineNum = 22085639;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_100_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_100_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_100_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Sub lbl_player_two_100_MouseReleased (EventData As";
RDebugUtils.currentLine=22151169;
 //BA.debugLineNum = 22151169;BA.debugLine="setP2Name";
_setp2name();
RDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
RDebugUtils.currentLine=22151171;
 //BA.debugLineNum = 22151171;BA.debugLine="func.calcScorePlayertwo(100)";
_func._calcscoreplayertwo /*String*/ ((int) (100));
 }else 
{RDebugUtils.currentLine=22151172;
 //BA.debugLineNum = 22151172;BA.debugLine="Else If EventData.SecondaryButtonPressed Then";
if (_eventdata.getSecondaryButtonPressed()) { 
RDebugUtils.currentLine=22151173;
 //BA.debugLineNum = 22151173;BA.debugLine="func.calcScorePlayertwo(-100)";
_func._calcscoreplayertwo /*String*/ ((int) (-100));
 }}
;
RDebugUtils.currentLine=22151175;
 //BA.debugLineNum = 22151175;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_make_1_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_make_1_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_make_1_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=23199744;
 //BA.debugLineNum = 23199744;BA.debugLine="Sub lbl_player_two_make_1_MouseReleased (EventData";
RDebugUtils.currentLine=23199745;
 //BA.debugLineNum = 23199745;BA.debugLine="func.playertwoMake(lbl_player_two_make_100, lbl_p";
_func._playertwomake /*String*/ (_lbl_player_two_make_100,_lbl_player_two_make_10,_lbl_player_two_make_1,_eventdata.getPrimaryButtonPressed(),(int) (1));
RDebugUtils.currentLine=23199746;
 //BA.debugLineNum = 23199746;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_make_10_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_make_10_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_make_10_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=23134208;
 //BA.debugLineNum = 23134208;BA.debugLine="Sub lbl_player_two_make_10_MouseReleased (EventDat";
RDebugUtils.currentLine=23134209;
 //BA.debugLineNum = 23134209;BA.debugLine="func.playertwoMake(lbl_player_two_make_100, lbl_p";
_func._playertwomake /*String*/ (_lbl_player_two_make_100,_lbl_player_two_make_10,_lbl_player_two_make_1,_eventdata.getPrimaryButtonPressed(),(int) (10));
RDebugUtils.currentLine=23134210;
 //BA.debugLineNum = 23134210;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_make_100_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_make_100_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_make_100_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=23068672;
 //BA.debugLineNum = 23068672;BA.debugLine="Sub lbl_player_two_make_100_MouseReleased (EventDa";
RDebugUtils.currentLine=23068674;
 //BA.debugLineNum = 23068674;BA.debugLine="func.playertwoMake(lbl_player_two_make_100, lbl_p";
_func._playertwomake /*String*/ (_lbl_player_two_make_100,_lbl_player_two_make_10,_lbl_player_two_make_1,_eventdata.getPrimaryButtonPressed(),(int) (100));
RDebugUtils.currentLine=23068675;
 //BA.debugLineNum = 23068675;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_name_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_player_two_name_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_player_two_name_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=22675456;
 //BA.debugLineNum = 22675456;BA.debugLine="Sub lbl_player_two_name_MouseReleased (EventData A";
RDebugUtils.currentLine=22675457;
 //BA.debugLineNum = 22675457;BA.debugLine="setP2Name";
_setp2name();
RDebugUtils.currentLine=22675458;
 //BA.debugLineNum = 22675458;BA.debugLine="func.processHs(\"all\")";
_func._processhs /*String*/ ("all");
RDebugUtils.currentLine=22675459;
 //BA.debugLineNum = 22675459;BA.debugLine="func.inngSet = 0";
_func._inngset /*int*/  = (int) (0);
RDebugUtils.currentLine=22675460;
 //BA.debugLineNum = 22675460;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_reset_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_reset_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "lbl_reset_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=24051712;
 //BA.debugLineNum = 24051712;BA.debugLine="Sub lbl_reset_MouseEntered (EventData As MouseEven";
RDebugUtils.currentLine=24051713;
 //BA.debugLineNum = 24051713;BA.debugLine="lbl_reset.Color =  0xFF69D79A";
_lbl_reset.setColor((int) (0xff69d79a));
RDebugUtils.currentLine=24051714;
 //BA.debugLineNum = 24051714;BA.debugLine="lbl_reset.TextColor = 0xFFFFFF00";
_lbl_reset.setTextColor((int) (0xffffff00));
RDebugUtils.currentLine=24051715;
 //BA.debugLineNum = 24051715;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_reset_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_reset_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "lbl_reset_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=24117248;
 //BA.debugLineNum = 24117248;BA.debugLine="Sub lbl_reset_MouseExited (EventData As MouseEvent";
RDebugUtils.currentLine=24117249;
 //BA.debugLineNum = 24117249;BA.debugLine="lbl_reset.Color = 0xFFFF0000";
_lbl_reset.setColor((int) (0xffff0000));
RDebugUtils.currentLine=24117250;
 //BA.debugLineNum = 24117250;BA.debugLine="lbl_reset.TextColor = 0xFFFFFFFF";
_lbl_reset.setTextColor((int) (0xffffffff));
RDebugUtils.currentLine=24117251;
 //BA.debugLineNum = 24117251;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_reset_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lbl_reset_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lbl_reset_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=24182784;
 //BA.debugLineNum = 24182784;BA.debugLine="Sub lbl_reset_MouseReleased (EventData As MouseEve";
RDebugUtils.currentLine=24182785;
 //BA.debugLineNum = 24182785;BA.debugLine="inactivecls.lastClick = DateTime.Now";
_inactivecls._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=24182786;
 //BA.debugLineNum = 24182786;BA.debugLine="nieuwePartij";
_nieuwepartij();
RDebugUtils.currentLine=24182789;
 //BA.debugLineNum = 24182789;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23724033;
 //BA.debugLineNum = 23724033;BA.debugLine="xfrm.Show";
parent._xfrm.Show();
RDebugUtils.currentLine=23724034;
 //BA.debugLineNum = 23724034;BA.debugLine="Return";
if (true) return ;
RDebugUtils.currentLine=23724035;
 //BA.debugLineNum = 23724035;BA.debugLine="Wait For (pNieuwePartijDialog.ShowCustom(pNieuweP";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "nieuwepartij"), parent._pnieuwepartijdialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent._pnieuwepartij,(Object)(""),(Object)(""),(Object)("")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=23724036;
 //BA.debugLineNum = 23724036;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=23724041;
 //BA.debugLineNum = 23724041;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Sub lstPlayerOneScoreLbl As List";
RDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="Dim List As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="List.Initialize";
_list.Initialize();
RDebugUtils.currentLine=21626883;
 //BA.debugLineNum = 21626883;BA.debugLine="List.AddAll(Array As Object(lbl_player_one_1, lbl";
_list.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_lbl_player_one_1.getObject()),(Object)(_lbl_player_one_10.getObject()),(Object)(_lbl_player_one_100.getObject()),(Object)(_lbl_player_one_moyenne.getObject()),(Object)(_b4xprogressbarp1)}));
RDebugUtils.currentLine=21626884;
 //BA.debugLineNum = 21626884;BA.debugLine="Return List";
if (true) return _list;
RDebugUtils.currentLine=21626885;
 //BA.debugLineNum = 21626885;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _lstplayertwoscorelbl() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "lstplayertwoscorelbl", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "lstplayertwoscorelbl", null));}
anywheresoftware.b4a.objects.collections.List _list = null;
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Sub lstPlayerTwoScoreLbl As List";
RDebugUtils.currentLine=21692417;
 //BA.debugLineNum = 21692417;BA.debugLine="Dim List As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="List.Initialize";
_list.Initialize();
RDebugUtils.currentLine=21692419;
 //BA.debugLineNum = 21692419;BA.debugLine="List.AddAll(Array As Object(lbl_player_two_1, lbl";
_list.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_lbl_player_two_1.getObject()),(Object)(_lbl_player_two_10.getObject()),(Object)(_lbl_player_two_100.getObject()),(Object)(_lbl_player_two_moyenne.getObject()),(Object)(_b4xprogressbarp2)}));
RDebugUtils.currentLine=21692420;
 //BA.debugLineNum = 21692420;BA.debugLine="Return List";
if (true) return _list;
RDebugUtils.currentLine=21692421;
 //BA.debugLineNum = 21692421;BA.debugLine="End Sub";
return null;
}
public static String  _mainform_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "mainform_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "mainform_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=24903680;
 //BA.debugLineNum = 24903680;BA.debugLine="Sub MainForm_MouseClicked (EventData As MouseEvent";
RDebugUtils.currentLine=24903681;
 //BA.debugLineNum = 24903681;BA.debugLine="If inactivecls.tmr_draw_promote.Enabled = True Th";
if (_inactivecls._tmr_draw_promote /*anywheresoftware.b4a.objects.Timer*/ .getEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=24903682;
 //BA.debugLineNum = 24903682;BA.debugLine="pn_promote.Top = pn_promote_top";
_pn_promote.setTop(_pn_promote_top);
RDebugUtils.currentLine=24903683;
 //BA.debugLineNum = 24903683;BA.debugLine="pn_promote_left = pn_promote_left";
_pn_promote_left = _pn_promote_left;
RDebugUtils.currentLine=24903685;
 //BA.debugLineNum = 24903685;BA.debugLine="inactivecls.lastClick = DateTime.Now";
_inactivecls._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=24903686;
 //BA.debugLineNum = 24903686;BA.debugLine="inactivecls.enableTime(True)";
_inactivecls._enabletime /*String*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=24903687;
 //BA.debugLineNum = 24903687;BA.debugLine="inactivecls.enablePromote(False)";
_inactivecls._enablepromote /*String*/ (null,anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=24903689;
 //BA.debugLineNum = 24903689;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24707073;
 //BA.debugLineNum = 24707073;BA.debugLine="If promoteRunning = True Then";
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
RDebugUtils.currentLine=24707074;
 //BA.debugLineNum = 24707074;BA.debugLine="pn_promote.Top = pn_promote_top";
parent._pn_promote.setTop(parent._pn_promote_top);
RDebugUtils.currentLine=24707075;
 //BA.debugLineNum = 24707075;BA.debugLine="pn_promote.left = pn_promote_left";
parent._pn_promote.setLeft(parent._pn_promote_left);
RDebugUtils.currentLine=24707076;
 //BA.debugLineNum = 24707076;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "mousein_event"),(int) (0));
this.state = 5;
return;
case 5:
//C
this.state = 4;
;
RDebugUtils.currentLine=24707077;
 //BA.debugLineNum = 24707077;BA.debugLine="inactivecls.lastClick = DateTime.Now";
parent._inactivecls._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=24707078;
 //BA.debugLineNum = 24707078;BA.debugLine="inactivecls.enableTime(True)";
parent._inactivecls._enabletime /*String*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=24707079;
 //BA.debugLineNum = 24707079;BA.debugLine="inactivecls.enablePromote(False)";
parent._inactivecls._enablepromote /*String*/ (null,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24707080;
 //BA.debugLineNum = 24707080;BA.debugLine="promoteRunning = False";
parent._promoterunning = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=24707081;
 //BA.debugLineNum = 24707081;BA.debugLine="Sleep(300)";
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
RDebugUtils.currentLine=24707083;
 //BA.debugLineNum = 24707083;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _mouseover(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n1) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "mouseover", false))
	 {return ((String) Debug.delegate(ba, "mouseover", new Object[] {_n1}));}
RDebugUtils.currentLine=24772608;
 //BA.debugLineNum = 24772608;BA.debugLine="private Sub MouseOver(n1 As Node)";
RDebugUtils.currentLine=24772609;
 //BA.debugLineNum = 24772609;BA.debugLine="setHandler(n1,\"setOnMouseMoved\",\"mouseIn\")";
_sethandler((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_n1.getObject())),"setOnMouseMoved","mouseIn");
RDebugUtils.currentLine=24772610;
 //BA.debugLineNum = 24772610;BA.debugLine="setHandler(n1,\"setOnMouseExited\",\"mouseOut\")";
_sethandler((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_n1.getObject())),"setOnMouseExited","mouseOut");
RDebugUtils.currentLine=24772611;
 //BA.debugLineNum = 24772611;BA.debugLine="End Sub";
return "";
}
public static String  _sethandler(anywheresoftware.b4j.object.JavaObject _ob,String _eventname,String _handlername) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "sethandler", false))
	 {return ((String) Debug.delegate(ba, "sethandler", new Object[] {_ob,_eventname,_handlername}));}
RDebugUtils.currentLine=24838144;
 //BA.debugLineNum = 24838144;BA.debugLine="private Sub setHandler(ob As JavaObject,eventName";
RDebugUtils.currentLine=24838145;
 //BA.debugLineNum = 24838145;BA.debugLine="ob.RunMethod(eventName, Array(ob.CreateEventFromU";
_ob.RunMethod(_eventname,new Object[]{_ob.CreateEventFromUI(ba,"javafx.event.EventHandler",_handlername,(Object)(anywheresoftware.b4a.keywords.Common.True))});
RDebugUtils.currentLine=24838146;
 //BA.debugLineNum = 24838146;BA.debugLine="End Sub";
return "";
}
public static String  _playeroneperc(String _perc) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "playeroneperc", false))
	 {return ((String) Debug.delegate(ba, "playeroneperc", new Object[] {_perc}));}
RDebugUtils.currentLine=22937600;
 //BA.debugLineNum = 22937600;BA.debugLine="Sub playerOnePerc(perc As String)";
RDebugUtils.currentLine=22937601;
 //BA.debugLineNum = 22937601;BA.debugLine="lbl_player_one_perc.Text = perc";
_lbl_player_one_perc.setText(_perc);
RDebugUtils.currentLine=22937602;
 //BA.debugLineNum = 22937602;BA.debugLine="End Sub";
return "";
}
public static String  _playertwoperc(String _perc) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "playertwoperc", false))
	 {return ((String) Debug.delegate(ba, "playertwoperc", new Object[] {_perc}));}
RDebugUtils.currentLine=23003136;
 //BA.debugLineNum = 23003136;BA.debugLine="Sub playerTwoPerc(perc As String)";
RDebugUtils.currentLine=23003137;
 //BA.debugLineNum = 23003137;BA.debugLine="lbl_player_two_perc.Text = perc";
_lbl_player_two_perc.setText(_perc);
RDebugUtils.currentLine=23003138;
 //BA.debugLineNum = 23003138;BA.debugLine="End Sub";
return "";
}
public static String  _pn_promote_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "pn_promote_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "pn_promote_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=24576000;
 //BA.debugLineNum = 24576000;BA.debugLine="Sub pn_promote_MouseReleased (EventData As MouseEv";
RDebugUtils.currentLine=24576001;
 //BA.debugLineNum = 24576001;BA.debugLine="pn_promote.Top = pn_promote_top";
_pn_promote.setTop(_pn_promote_top);
RDebugUtils.currentLine=24576002;
 //BA.debugLineNum = 24576002;BA.debugLine="pn_promote.left = pn_promote_left";
_pn_promote.setLeft(_pn_promote_left);
RDebugUtils.currentLine=24576004;
 //BA.debugLineNum = 24576004;BA.debugLine="inactivecls.lastClick = DateTime.Now";
_inactivecls._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=24576005;
 //BA.debugLineNum = 24576005;BA.debugLine="inactivecls.enableTime(True)";
_inactivecls._enabletime /*String*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=24576006;
 //BA.debugLineNum = 24576006;BA.debugLine="inactivecls.enablePromote(False)";
_inactivecls._enablepromote /*String*/ (null,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24576007;
 //BA.debugLineNum = 24576007;BA.debugLine="End Sub";
return "";
}
public static String  _setcaromnumber(anywheresoftware.b4a.objects.B4XViewWrapper _v,String _value) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "setcaromnumber", false))
	 {return ((String) Debug.delegate(ba, "setcaromnumber", new Object[] {_v,_value}));}
RDebugUtils.currentLine=23265280;
 //BA.debugLineNum = 23265280;BA.debugLine="Sub setCaromNumber(v As B4XView, value As String)";
RDebugUtils.currentLine=23265284;
 //BA.debugLineNum = 23265284;BA.debugLine="v.Text = value";
_v.setText(_value);
RDebugUtils.currentLine=23265287;
 //BA.debugLineNum = 23265287;BA.debugLine="End Sub";
return "";
}
public static String  _setclearboard(boolean _clear) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "setclearboard", false))
	 {return ((String) Debug.delegate(ba, "setclearboard", new Object[] {_clear}));}
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Public Sub setClearBoard(clear As Boolean)";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="func.setNieuwePartij = clear";
_func._setnieuwepartij /*boolean*/  = _clear;
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="End Sub";
return "";
}
public static String  _setfontsize() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "setfontsize", false))
	 {return ((String) Debug.delegate(ba, "setfontsize", null));}
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Sub setFontSize";
RDebugUtils.currentLine=21495809;
 //BA.debugLineNum = 21495809;BA.debugLine="func.caromLabelCss(lbl_innings, \"labelCarom\")";
_func._caromlabelcss /*String*/ (_lbl_innings,"labelCarom");
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="func.caromLabelCss(lbl_player_one_name, \"labelCar";
_func._caromlabelcss /*String*/ ((anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_lbl_player_one_name.getObject())),"labelCarom");
RDebugUtils.currentLine=21495811;
 //BA.debugLineNum = 21495811;BA.debugLine="func.caromLabelCss(lbl_player_two_name, \"labelCar";
_func._caromlabelcss /*String*/ ((anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_lbl_player_two_name.getObject())),"labelCarom");
RDebugUtils.currentLine=21495813;
 //BA.debugLineNum = 21495813;BA.debugLine="func.caromLabelCss(lbl_player_one_hs, \"labelWhite";
_func._caromlabelcss /*String*/ (_lbl_player_one_hs,"labelWhite");
RDebugUtils.currentLine=21495814;
 //BA.debugLineNum = 21495814;BA.debugLine="func.caromLabelCss(lbl_player_one_moyenne, \"label";
_func._caromlabelcss /*String*/ (_lbl_player_one_moyenne,"labelWhite");
RDebugUtils.currentLine=21495815;
 //BA.debugLineNum = 21495815;BA.debugLine="func.caromLabelCss(lbl_player_one_perc, \"labelWhi";
_func._caromlabelcss /*String*/ (_lbl_player_one_perc,"labelWhite");
RDebugUtils.currentLine=21495818;
 //BA.debugLineNum = 21495818;BA.debugLine="func.caromLabelCss(lbl_player_one_100, \"labelCaro";
_func._caromlabelcss /*String*/ (_lbl_player_one_100,"labelCarom");
RDebugUtils.currentLine=21495819;
 //BA.debugLineNum = 21495819;BA.debugLine="func.caromLabelCss(lbl_player_one_10, \"labelCarom";
_func._caromlabelcss /*String*/ (_lbl_player_one_10,"labelCarom");
RDebugUtils.currentLine=21495820;
 //BA.debugLineNum = 21495820;BA.debugLine="func.caromLabelCss(lbl_player_one_1, \"labelCarom\"";
_func._caromlabelcss /*String*/ (_lbl_player_one_1,"labelCarom");
RDebugUtils.currentLine=21495823;
 //BA.debugLineNum = 21495823;BA.debugLine="func.caromLabelCss(lbl_player_one_make_100, \"labe";
_func._caromlabelcss /*String*/ (_lbl_player_one_make_100,"labelCarom");
RDebugUtils.currentLine=21495824;
 //BA.debugLineNum = 21495824;BA.debugLine="func.caromLabelCss(lbl_player_one_make_10, \"label";
_func._caromlabelcss /*String*/ (_lbl_player_one_make_10,"labelCarom");
RDebugUtils.currentLine=21495825;
 //BA.debugLineNum = 21495825;BA.debugLine="func.caromLabelCss(lbl_player_one_make_1, \"labelC";
_func._caromlabelcss /*String*/ (_lbl_player_one_make_1,"labelCarom");
RDebugUtils.currentLine=21495827;
 //BA.debugLineNum = 21495827;BA.debugLine="func.caromLabelCss(lbl_player_two_hs, \"labelWhite";
_func._caromlabelcss /*String*/ (_lbl_player_two_hs,"labelWhite");
RDebugUtils.currentLine=21495828;
 //BA.debugLineNum = 21495828;BA.debugLine="func.caromLabelCss(lbl_player_two_moyenne, \"label";
_func._caromlabelcss /*String*/ (_lbl_player_two_moyenne,"labelWhite");
RDebugUtils.currentLine=21495829;
 //BA.debugLineNum = 21495829;BA.debugLine="func.caromLabelCss(lbl_player_two_perc, \"labelWhi";
_func._caromlabelcss /*String*/ (_lbl_player_two_perc,"labelWhite");
RDebugUtils.currentLine=21495831;
 //BA.debugLineNum = 21495831;BA.debugLine="func.caromLabelCss(lbl_player_two_100, \"labelCaro";
_func._caromlabelcss /*String*/ (_lbl_player_two_100,"labelCarom");
RDebugUtils.currentLine=21495832;
 //BA.debugLineNum = 21495832;BA.debugLine="func.caromLabelCss(lbl_player_two_10, \"labelCarom";
_func._caromlabelcss /*String*/ (_lbl_player_two_10,"labelCarom");
RDebugUtils.currentLine=21495833;
 //BA.debugLineNum = 21495833;BA.debugLine="func.caromLabelCss(lbl_player_two_1, \"labelCarom\"";
_func._caromlabelcss /*String*/ (_lbl_player_two_1,"labelCarom");
RDebugUtils.currentLine=21495835;
 //BA.debugLineNum = 21495835;BA.debugLine="func.caromLabelCss(lbl_player_two_make_100, \"labe";
_func._caromlabelcss /*String*/ (_lbl_player_two_make_100,"labelCarom");
RDebugUtils.currentLine=21495836;
 //BA.debugLineNum = 21495836;BA.debugLine="func.caromLabelCss(lbl_player_two_make_10, \"label";
_func._caromlabelcss /*String*/ (_lbl_player_two_make_10,"labelCarom");
RDebugUtils.currentLine=21495837;
 //BA.debugLineNum = 21495837;BA.debugLine="func.caromLabelCss(lbl_player_two_make_1, \"labelC";
_func._caromlabelcss /*String*/ (_lbl_player_two_make_1,"labelCarom");
RDebugUtils.currentLine=21495840;
 //BA.debugLineNum = 21495840;BA.debugLine="resetBoard(False)";
_resetboard(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=21495842;
 //BA.debugLineNum = 21495842;BA.debugLine="End Sub";
return "";
}
public static String  _setmessage(anywheresoftware.b4a.objects.collections.List _msglist) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "setmessage", false))
	 {return ((String) Debug.delegate(ba, "setmessage", new Object[] {_msglist}));}
RDebugUtils.currentLine=25231360;
 //BA.debugLineNum = 25231360;BA.debugLine="Sub setMessage(msgList As List)";
RDebugUtils.currentLine=25231361;
 //BA.debugLineNum = 25231361;BA.debugLine="lbl_message_1.Text = msgList.get(0)";
_lbl_message_1.setText(BA.ObjectToString(_msglist.Get((int) (0))));
RDebugUtils.currentLine=25231362;
 //BA.debugLineNum = 25231362;BA.debugLine="lbl_message_2.Text = msgList.get(1)";
_lbl_message_2.setText(BA.ObjectToString(_msglist.Get((int) (1))));
RDebugUtils.currentLine=25231363;
 //BA.debugLineNum = 25231363;BA.debugLine="lbl_message_3.Text = msgList.get(2)";
_lbl_message_3.setText(BA.ObjectToString(_msglist.Get((int) (2))));
RDebugUtils.currentLine=25231364;
 //BA.debugLineNum = 25231364;BA.debugLine="lbl_message_4.Text = msgList.get(3)";
_lbl_message_4.setText(BA.ObjectToString(_msglist.Get((int) (3))));
RDebugUtils.currentLine=25231365;
 //BA.debugLineNum = 25231365;BA.debugLine="lbl_message_5.Text = msgList.Get(4)";
_lbl_message_5.setText(BA.ObjectToString(_msglist.Get((int) (4))));
RDebugUtils.currentLine=25231367;
 //BA.debugLineNum = 25231367;BA.debugLine="End Sub";
return "";
}
public static String  _setpromoterunning(boolean _running) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "setpromoterunning", false))
	 {return ((String) Debug.delegate(ba, "setpromoterunning", new Object[] {_running}));}
RDebugUtils.currentLine=24641536;
 //BA.debugLineNum = 24641536;BA.debugLine="Sub setPromoteRunning(running As Boolean)";
RDebugUtils.currentLine=24641537;
 //BA.debugLineNum = 24641537;BA.debugLine="promoteRunning = running";
_promoterunning = _running;
RDebugUtils.currentLine=24641538;
 //BA.debugLineNum = 24641538;BA.debugLine="End Sub";
return "";
}
public static String  _showpromote() throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "showpromote", false))
	 {return ((String) Debug.delegate(ba, "showpromote", null));}
RDebugUtils.currentLine=24444928;
 //BA.debugLineNum = 24444928;BA.debugLine="Sub showPromote";
RDebugUtils.currentLine=24444929;
 //BA.debugLineNum = 24444929;BA.debugLine="pn_promote.SetLayoutAnimated(0, 50dip, 50dip, pn_";
_pn_promote.SetLayoutAnimated((int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),_pn_promote.getWidth(),_pn_promote.getHeight());
RDebugUtils.currentLine=24444930;
 //BA.debugLineNum = 24444930;BA.debugLine="End Sub";
return "";
}
public static String  _showsponor(boolean _enabled) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "showsponor", false))
	 {return ((String) Debug.delegate(ba, "showsponor", new Object[] {_enabled}));}
RDebugUtils.currentLine=25165824;
 //BA.debugLineNum = 25165824;BA.debugLine="Sub showSponor(enabled As Boolean)";
RDebugUtils.currentLine=25165825;
 //BA.debugLineNum = 25165825;BA.debugLine="pn_sponsore.Visible = enabled";
_pn_sponsore.setVisible(_enabled);
RDebugUtils.currentLine=25165826;
 //BA.debugLineNum = 25165826;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24969217;
 //BA.debugLineNum = 24969217;BA.debugLine="inactivecls.updatePromote";
parent._inactivecls._updatepromote /*String*/ (null);
RDebugUtils.currentLine=24969218;
 //BA.debugLineNum = 24969218;BA.debugLine="lbl_config_update.Visible = True";
parent._lbl_config_update.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=24969219;
 //BA.debugLineNum = 24969219;BA.debugLine="Sleep(5000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scorebord", "updatecfg"),(int) (5000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=24969220;
 //BA.debugLineNum = 24969220;BA.debugLine="lbl_config_update.Visible = False";
parent._lbl_config_update.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24969221;
 //BA.debugLineNum = 24969221;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=25034752;
 //BA.debugLineNum = 25034752;BA.debugLine="Sub useDigitalFont(useDigital As Boolean)";
RDebugUtils.currentLine=25034753;
 //BA.debugLineNum = 25034753;BA.debugLine="Dim fsCarom, fsMake, fsInnings As Int";
_fscarom = 0;
_fsmake = 0;
_fsinnings = 0;
RDebugUtils.currentLine=25034755;
 //BA.debugLineNum = 25034755;BA.debugLine="If useDigital Then";
if (_usedigital) { 
RDebugUtils.currentLine=25034756;
 //BA.debugLineNum = 25034756;BA.debugLine="fsCarom = 300'350";
_fscarom = (int) (300);
RDebugUtils.currentLine=25034757;
 //BA.debugLineNum = 25034757;BA.debugLine="fsMake = 225";
_fsmake = (int) (225);
RDebugUtils.currentLine=25034758;
 //BA.debugLineNum = 25034758;BA.debugLine="fsInnings = 250'300";
_fsinnings = (int) (250);
 }else {
RDebugUtils.currentLine=25034760;
 //BA.debugLineNum = 25034760;BA.debugLine="fsCarom = 225";
_fscarom = (int) (225);
RDebugUtils.currentLine=25034761;
 //BA.debugLineNum = 25034761;BA.debugLine="fsMake = 150";
_fsmake = (int) (150);
RDebugUtils.currentLine=25034762;
 //BA.debugLineNum = 25034762;BA.debugLine="fsInnings = 200";
_fsinnings = (int) (200);
 };
RDebugUtils.currentLine=25034765;
 //BA.debugLineNum = 25034765;BA.debugLine="func.setFont(lbl_player_one_1, fsCarom, useDigita";
_func._setfont /*String*/ (_lbl_player_one_1,_fscarom,_usedigital);
RDebugUtils.currentLine=25034766;
 //BA.debugLineNum = 25034766;BA.debugLine="func.setFont(lbl_player_one_10, fsCarom, useDigit";
_func._setfont /*String*/ (_lbl_player_one_10,_fscarom,_usedigital);
RDebugUtils.currentLine=25034767;
 //BA.debugLineNum = 25034767;BA.debugLine="func.setFont(lbl_player_one_100, fsCarom, useDigi";
_func._setfont /*String*/ (_lbl_player_one_100,_fscarom,_usedigital);
RDebugUtils.currentLine=25034768;
 //BA.debugLineNum = 25034768;BA.debugLine="func.setFont(lbl_player_two_1, fsCarom, useDigita";
_func._setfont /*String*/ (_lbl_player_two_1,_fscarom,_usedigital);
RDebugUtils.currentLine=25034769;
 //BA.debugLineNum = 25034769;BA.debugLine="func.setFont(lbl_player_two_10, fsCarom, useDigit";
_func._setfont /*String*/ (_lbl_player_two_10,_fscarom,_usedigital);
RDebugUtils.currentLine=25034770;
 //BA.debugLineNum = 25034770;BA.debugLine="func.setFont(lbl_player_two_100, fsCarom, useDigi";
_func._setfont /*String*/ (_lbl_player_two_100,_fscarom,_usedigital);
RDebugUtils.currentLine=25034771;
 //BA.debugLineNum = 25034771;BA.debugLine="func.setFont(lbl_innings, fsInnings, useDigital)";
_func._setfont /*String*/ (_lbl_innings,_fsinnings,_usedigital);
RDebugUtils.currentLine=25034772;
 //BA.debugLineNum = 25034772;BA.debugLine="func.setFont(lbl_player_one_make_100, fsMake, use";
_func._setfont /*String*/ (_lbl_player_one_make_100,_fsmake,_usedigital);
RDebugUtils.currentLine=25034773;
 //BA.debugLineNum = 25034773;BA.debugLine="func.setFont(lbl_player_one_make_10, fsMake, useD";
_func._setfont /*String*/ (_lbl_player_one_make_10,_fsmake,_usedigital);
RDebugUtils.currentLine=25034774;
 //BA.debugLineNum = 25034774;BA.debugLine="func.setFont(lbl_player_one_make_1, fsMake, useDi";
_func._setfont /*String*/ (_lbl_player_one_make_1,_fsmake,_usedigital);
RDebugUtils.currentLine=25034775;
 //BA.debugLineNum = 25034775;BA.debugLine="func.setFont(lbl_player_two_make_100,fsMake, useD";
_func._setfont /*String*/ (_lbl_player_two_make_100,_fsmake,_usedigital);
RDebugUtils.currentLine=25034776;
 //BA.debugLineNum = 25034776;BA.debugLine="func.setFont(lbl_player_two_make_10,fsMake, useDi";
_func._setfont /*String*/ (_lbl_player_two_make_10,_fsmake,_usedigital);
RDebugUtils.currentLine=25034777;
 //BA.debugLineNum = 25034777;BA.debugLine="func.setFont(lbl_player_two_make_1,fsMake, useDig";
_func._setfont /*String*/ (_lbl_player_two_make_1,_fsmake,_usedigital);
RDebugUtils.currentLine=25034779;
 //BA.debugLineNum = 25034779;BA.debugLine="End Sub";
return "";
}
public static String  _usefontyellow(boolean _useyellow) throws Exception{
RDebugUtils.currentModule="scorebord";
if (Debug.shouldDelegate(ba, "usefontyellow", false))
	 {return ((String) Debug.delegate(ba, "usefontyellow", new Object[] {_useyellow}));}
RDebugUtils.currentLine=25100288;
 //BA.debugLineNum = 25100288;BA.debugLine="Sub useFontYellow(useYellow As Boolean)";
RDebugUtils.currentLine=25100290;
 //BA.debugLineNum = 25100290;BA.debugLine="func.setFontColor(lbl_innings, useYellow)";
_func._setfontcolor /*String*/ (_lbl_innings,_useyellow);
RDebugUtils.currentLine=25100292;
 //BA.debugLineNum = 25100292;BA.debugLine="func.setFontColor(lbl_player_one_1, useYellow)";
_func._setfontcolor /*String*/ (_lbl_player_one_1,_useyellow);
RDebugUtils.currentLine=25100293;
 //BA.debugLineNum = 25100293;BA.debugLine="func.setFontColor(lbl_player_one_10, useYellow)";
_func._setfontcolor /*String*/ (_lbl_player_one_10,_useyellow);
RDebugUtils.currentLine=25100294;
 //BA.debugLineNum = 25100294;BA.debugLine="func.setFontColor(lbl_player_one_100, useYellow)";
_func._setfontcolor /*String*/ (_lbl_player_one_100,_useyellow);
RDebugUtils.currentLine=25100296;
 //BA.debugLineNum = 25100296;BA.debugLine="func.setFontColor(lbl_player_two_1, useYellow)";
_func._setfontcolor /*String*/ (_lbl_player_two_1,_useyellow);
RDebugUtils.currentLine=25100297;
 //BA.debugLineNum = 25100297;BA.debugLine="func.setFontColor(lbl_player_two_10, useYellow)";
_func._setfontcolor /*String*/ (_lbl_player_two_10,_useyellow);
RDebugUtils.currentLine=25100298;
 //BA.debugLineNum = 25100298;BA.debugLine="func.setFontColor(lbl_player_two_100, useYellow)";
_func._setfontcolor /*String*/ (_lbl_player_two_100,_useyellow);
RDebugUtils.currentLine=25100300;
 //BA.debugLineNum = 25100300;BA.debugLine="func.setFontColor(lbl_player_one_make_100, useYel";
_func._setfontcolor /*String*/ (_lbl_player_one_make_100,_useyellow);
RDebugUtils.currentLine=25100301;
 //BA.debugLineNum = 25100301;BA.debugLine="func.setFontColor(lbl_player_one_make_10, useYell";
_func._setfontcolor /*String*/ (_lbl_player_one_make_10,_useyellow);
RDebugUtils.currentLine=25100302;
 //BA.debugLineNum = 25100302;BA.debugLine="func.setFontColor(lbl_player_one_make_1, useYello";
_func._setfontcolor /*String*/ (_lbl_player_one_make_1,_useyellow);
RDebugUtils.currentLine=25100304;
 //BA.debugLineNum = 25100304;BA.debugLine="func.setFontColor(lbl_player_two_make_100, useYel";
_func._setfontcolor /*String*/ (_lbl_player_two_make_100,_useyellow);
RDebugUtils.currentLine=25100305;
 //BA.debugLineNum = 25100305;BA.debugLine="func.setFontColor(lbl_player_two_make_10, useYell";
_func._setfontcolor /*String*/ (_lbl_player_two_make_10,_useyellow);
RDebugUtils.currentLine=25100306;
 //BA.debugLineNum = 25100306;BA.debugLine="func.setFontColor(lbl_player_two_make_1, useYello";
_func._setfontcolor /*String*/ (_lbl_player_two_make_1,_useyellow);
RDebugUtils.currentLine=25100307;
 //BA.debugLineNum = 25100307;BA.debugLine="End Sub";
return "";
}
}