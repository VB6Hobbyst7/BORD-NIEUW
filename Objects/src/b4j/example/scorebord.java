package b4j.example;


import anywheresoftware.b4a.BA;

public class scorebord extends Object{
public static scorebord mostCurrent = new scorebord();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.scorebord", null);
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
public static anywheresoftware.b4j.objects.JFX _vvvvvvvv3 = null;
public static b4j.example.b4xdialog _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvvvvv6 = null;
public static anywheresoftware.b4j.objects.Form _vvvvvvvvvv7 = null;
public static b4j.example.inactiveclass _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public static b4j.example.classcheckconfig _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
public static b4j.example.clxtoastmessage _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public static b4j.example.classupdate _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public static double _pn_promote_top = 0;
public static double _pn_promote_left = 0;
public static boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = false;
public static anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public static b4j.example.b4xdialog _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_innings = null;
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
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_one_hs = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_two_hs = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lbl_clock = null;
public static b4j.example.timerclass _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
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
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_one_1 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_one_10 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_one_100 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_message_1 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_message_2 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_message_3 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_message_4 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_message_5 = null;
public static b4j.example.cssutils _vvvvvvvv0 = null;
public static b4j.example.dateutils _vvvvvvvvv1 = null;
public static b4j.example.main _main = null;
public static b4j.example.func _vvvvvvvvv3 = null;
public static b4j.example.parseconfig _vvvvvvvvv4 = null;
public static b4j.example.funcinet _vvvvvvvvv5 = null;
public static b4j.example.httputils2service _vvvvvvvvv6 = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 222;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return false;
}
public static anywheresoftware.b4j.object.JavaObject  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(anywheresoftware.b4j.object.JavaObject _o) throws Exception{
 //BA.debugLineNum = 640;BA.debugLine="Private Sub asJO(o As JavaObject) As JavaObject";
 //BA.debugLineNum = 641;BA.debugLine="Return o";
if (true) return _o;
 //BA.debugLineNum = 642;BA.debugLine="End Sub";
return null;
}
public static String  _btn_a_begint_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 535;BA.debugLine="Sub btn_a_begint_MouseReleased (EventData As Mouse";
 //BA.debugLineNum = 537;BA.debugLine="End Sub";
return "";
}
public static String  _btn_annuleer_nieuwe_partij_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 583;BA.debugLine="Sub btn_annuleer_nieuwe_partij_MouseReleased (Even";
 //BA.debugLineNum = 584;BA.debugLine="pNieuwePartijDialog.Close(XUI.DialogResponse_Canc";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*boolean*/ (_vvvvvvvvvvvv6.DialogResponse_Cancel);
 //BA.debugLineNum = 586;BA.debugLine="End Sub";
return "";
}
public static String  _btn_b_begint_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 539;BA.debugLine="Sub btn_b_begint_MouseReleased (EventData As Mouse";
 //BA.debugLineNum = 541;BA.debugLine="End Sub";
return "";
}
public static String  _btn_exit_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 333;BA.debugLine="Sub btn_exit_MouseReleased (EventData As MouseEven";
 //BA.debugLineNum = 334;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return "";
}
public static String  _btn_nieuwe_partij_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 574;BA.debugLine="Sub btn_nieuwe_partij_MouseReleased (EventData As";
 //BA.debugLineNum = 575;BA.debugLine="pNieuwePartijDialog.Close(XUI.DialogResponse_Posi";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*boolean*/ (_vvvvvvvvvvvv6.DialogResponse_Positive);
 //BA.debugLineNum = 577;BA.debugLine="resetBoard(False)";
_vv3(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 578;BA.debugLine="If chk_add_player.Checked Then";
if (_chk_add_player.getChecked()) { 
 //BA.debugLineNum = 579;BA.debugLine="iets";
_v6();
 };
 //BA.debugLineNum = 581;BA.debugLine="End Sub";
return "";
}
public static String  _checkmatchwonp1() throws Exception{
int _caroms = 0;
int _make = 0;
 //BA.debugLineNum = 485;BA.debugLine="Sub checkMatchWonP1";
 //BA.debugLineNum = 486;BA.debugLine="Dim caroms, make As Int";
_caroms = 0;
_make = 0;
 //BA.debugLineNum = 488;BA.debugLine="caroms = lbl_player_one_100.Text&lbl_player_one_1";
_caroms = (int)(Double.parseDouble(_lbl_player_one_100.getText()+_lbl_player_one_10.getText()+_lbl_player_one_1.getText()));
 //BA.debugLineNum = 489;BA.debugLine="make = lbl_player_one_make_100.text&lbl_player_on";
_make = (int)(Double.parseDouble(_lbl_player_one_make_100.getText()+_lbl_player_one_make_10.getText()+_lbl_player_one_make_1.getText()));
 //BA.debugLineNum = 491;BA.debugLine="If caroms >= make Then";
if (_caroms>=_make) { 
 };
 //BA.debugLineNum = 494;BA.debugLine="End Sub";
return "";
}
public static String  _checkmatchwonp2() throws Exception{
int _caroms = 0;
int _make = 0;
 //BA.debugLineNum = 496;BA.debugLine="Sub checkMatchWonP2";
 //BA.debugLineNum = 497;BA.debugLine="Dim caroms, make As Int";
_caroms = 0;
_make = 0;
 //BA.debugLineNum = 499;BA.debugLine="caroms = lbl_player_two_100.Text&lbl_player_two_1";
_caroms = (int)(Double.parseDouble(_lbl_player_two_100.getText()+_lbl_player_two_10.getText()+_lbl_player_two_1.getText()));
 //BA.debugLineNum = 500;BA.debugLine="make = lbl_player_two_make_100.text&lbl_player_tw";
_make = (int)(Double.parseDouble(_lbl_player_two_make_100.getText()+_lbl_player_two_make_10.getText()+_lbl_player_two_make_1.getText()));
 //BA.debugLineNum = 502;BA.debugLine="If caroms >= make Then";
if (_caroms>=_make) { 
 };
 //BA.debugLineNum = 505;BA.debugLine="End Sub";
return "";
}
public static void  _drawpromote(double _x,double _y) throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 600;BA.debugLine="pn_promote.SetLayoutAnimated(0, x, y, pn_promote.";
parent._pn_promote.SetLayoutAnimated((int) (0),_x,_y,parent._pn_promote.getWidth(),parent._pn_promote.getHeight());
 //BA.debugLineNum = 601;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 603;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _edt_temaken_a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 543;BA.debugLine="Sub edt_temaken_a_TextChanged (Old As String, New";
 //BA.debugLineNum = 544;BA.debugLine="edt_temaken_a.Text =  func.testNumber(Old, New)";
_edt_temaken_a.setText(_vvvvvvvvv3._vvvvvvv1 /*String*/ (_old,_new));
 //BA.debugLineNum = 545;BA.debugLine="edt_temaken_a.SetSelection(edt_temaken_a.Text.Len";
_edt_temaken_a.SetSelection(_edt_temaken_a.getText().length(),_edt_temaken_a.getText().length());
 //BA.debugLineNum = 547;BA.debugLine="End Sub";
return "";
}
public static String  _edt_temaken_b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 549;BA.debugLine="Sub edt_temaken_b_TextChanged (Old As String, New";
 //BA.debugLineNum = 550;BA.debugLine="edt_temaken_b.Text =  func.testNumber(Old, New)";
_edt_temaken_b.setText(_vvvvvvvvv3._vvvvvvv1 /*String*/ (_old,_new));
 //BA.debugLineNum = 551;BA.debugLine="edt_temaken_b.SetSelection(edt_temaken_b.Text.Len";
_edt_temaken_b.SetSelection(_edt_temaken_b.getText().length(),_edt_temaken_b.getText().length());
 //BA.debugLineNum = 552;BA.debugLine="End Sub";
return "";
}
public static String  _v5() throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub getRandomImage";
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public static void  _v6() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 511;BA.debugLine="Dim dlg As B4XDialog";
_dlg = new b4j.example.b4xdialog();
 //BA.debugLineNum = 512;BA.debugLine="dlg.Initialize (Base)";
_dlg._initialize /*String*/ (ba,parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 513;BA.debugLine="Dim p As B4XView = XUI.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._vvvvvvvvvvvv6.CreatePanel(ba,"");
 //BA.debugLineNum = 514;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 600dip)";
_p.SetLayoutAnimated((int) (0),0,0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (600)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (600)));
 //BA.debugLineNum = 515;BA.debugLine="p.LoadLayout(\"players\")";
_p.LoadLayout("players",ba);
 //BA.debugLineNum = 516;BA.debugLine="dlg.Title = \"Spelers Invoer\"";
_dlg._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*Object*/  = (Object)("Spelers Invoer");
 //BA.debugLineNum = 517;BA.debugLine="dlg.PutAtTop = True 'put the dialog at the top of";
_dlg._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 518;BA.debugLine="Wait For (dlg.ShowCustom(p, \"OK\", \"\", \"CANCEL\"))";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _dlg._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_p,(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (int) result[0];
;
 //BA.debugLineNum = 519;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent._vvvvvvvvvvvv6.DialogResponse_Positive) { 
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
 //BA.debugLineNum = 522;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(int _result) throws Exception{
}
public static String  _v7() throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub initPanels";
 //BA.debugLineNum = 158;BA.debugLine="pNieuwePartijDialog.Initialize (Base)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._initialize /*String*/ (ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 159;BA.debugLine="pNieuwePartij = XUI.CreatePanel(\"\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _vvvvvvvvvvvv6.CreatePanel(ba,"");
 //BA.debugLineNum = 160;BA.debugLine="pNieuwePartij.SetLayoutAnimated(0, 100dip, 0, 100";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.SetLayoutAnimated((int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1000)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (800)));
 //BA.debugLineNum = 161;BA.debugLine="pNieuwePartij.LoadLayout(\"nieuwe_partij\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.LoadLayout("nieuwe_partij",ba);
 //BA.debugLineNum = 162;BA.debugLine="pNieuwePartijDialog.Title = \"Nieuwe Partij\"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*Object*/  = (Object)("Nieuwe Partij");
 //BA.debugLineNum = 163;BA.debugLine="pNieuwePartijDialog.PutAtTop = False 'put the dia";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 165;BA.debugLine="pn_promote_top = 1130 'pn_promote.Top";
_pn_promote_top = 1130;
 //BA.debugLineNum = 166;BA.debugLine="pn_promote_left = 20 'pn_promote.Left";
_pn_promote_left = 20;
 //BA.debugLineNum = 169;BA.debugLine="inactivecls.frm = frm";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._vvvvvvvvvv7 /*anywheresoftware.b4j.objects.Form*/  = _vvvvvvvvvv7;
 //BA.debugLineNum = 170;BA.debugLine="inactivecls.pn_promote = pn_promote";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._pn_promote /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/  = _pn_promote;
 //BA.debugLineNum = 171;BA.debugLine="inactivecls.pnlWidth = pn_promote.Width";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._vvvvvvvvvvv4 /*double*/  = _pn_promote.getWidth();
 //BA.debugLineNum = 172;BA.debugLine="inactivecls.pnlHeight = pn_promote.Height";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._vvvvvvvvvvv5 /*double*/  = _pn_promote.getHeight();
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public static String  _lastclick() throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Sub lastClick";
 //BA.debugLineNum = 250;BA.debugLine="inactivecls.lastClick = DateTime.Now";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_close_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 590;BA.debugLine="Sub lbl_close_MouseReleased (EventData As MouseEve";
 //BA.debugLineNum = 591;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 592;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_innings_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
int _points = 0;
 //BA.debugLineNum = 310;BA.debugLine="Sub lbl_innings_MouseReleased (EventData As MouseE";
 //BA.debugLineNum = 311;BA.debugLine="Dim points As Int = lbl_innings.Text";
_points = (int)(Double.parseDouble(_lbl_innings.getText()));
 //BA.debugLineNum = 312;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
 //BA.debugLineNum = 313;BA.debugLine="points = points + 1";
_points = (int) (_points+1);
 }else {
 //BA.debugLineNum = 315;BA.debugLine="points = points - 1";
_points = (int) (_points-1);
 };
 //BA.debugLineNum = 317;BA.debugLine="If points = -1 Then";
if (_points==-1) { 
 //BA.debugLineNum = 318;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 321;BA.debugLine="func.innigs = points";
_vvvvvvvvv3._vvv4 /*int*/  = _points;
 //BA.debugLineNum = 322;BA.debugLine="lbl_innings.Text = func.padString(points, \"0\", 0,";
_lbl_innings.setText(_vvvvvvvvv3._vvvvv5 /*String*/ (BA.NumberToString(_points),"0",(int) (0),(int) (3)));
 //BA.debugLineNum = 323;BA.debugLine="func.calcMoyenne(lbl_player_one_moyenne, lbl_play";
_vvvvvvvvv3._vvvv0 /*String*/ (_lbl_player_one_moyenne,_lbl_player_two_moyenne);
 //BA.debugLineNum = 324;BA.debugLine="func.processHs(\"all\")";
_vvvvvvvvv3._vvvvv0 /*String*/ ("all");
 //BA.debugLineNum = 325;BA.debugLine="func.inngSet = 1";
_vvvvvvvvv3._vvv5 /*int*/  = (int) (1);
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_1_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 338;BA.debugLine="Sub lbl_player_one_1_MouseEntered (EventData As Mo";
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_1_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub lbl_player_one_1_MouseReleased (EventData As M";
 //BA.debugLineNum = 254;BA.debugLine="setP1Name";
_vv6();
 //BA.debugLineNum = 255;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
 //BA.debugLineNum = 256;BA.debugLine="func.calcScorePlayerOne(1)";
_vvvvvvvvv3._vvvvv1 /*String*/ ((int) (1));
 }else if(_eventdata.getSecondaryButtonPressed()) { 
 //BA.debugLineNum = 258;BA.debugLine="func.calcScorePlayerOne(-1)";
_vvvvvvvvv3._vvvvv1 /*String*/ ((int) (-1));
 };
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_10_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Sub lbl_player_one_10_MouseReleased (EventData As";
 //BA.debugLineNum = 264;BA.debugLine="setP1Name";
_vv6();
 //BA.debugLineNum = 265;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
 //BA.debugLineNum = 266;BA.debugLine="func.calcScorePlayerOne(10)";
_vvvvvvvvv3._vvvvv1 /*String*/ ((int) (10));
 }else if(_eventdata.getSecondaryButtonPressed()) { 
 //BA.debugLineNum = 268;BA.debugLine="func.calcScorePlayerOne(-10)";
_vvvvvvvvv3._vvvvv1 /*String*/ ((int) (-10));
 };
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_100_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Sub lbl_player_one_100_MouseReleased (EventData As";
 //BA.debugLineNum = 272;BA.debugLine="setP1Name";
_vv6();
 //BA.debugLineNum = 273;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
 //BA.debugLineNum = 274;BA.debugLine="func.calcScorePlayerOne(100)";
_vvvvvvvvv3._vvvvv1 /*String*/ ((int) (100));
 }else if(_eventdata.getSecondaryButtonPressed()) { 
 //BA.debugLineNum = 276;BA.debugLine="func.calcScorePlayerOne(-100)";
_vvvvvvvvv3._vvvvv1 /*String*/ ((int) (-100));
 };
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_active_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 305;BA.debugLine="Sub lbl_player_one_active_MouseReleased (EventData";
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_make_1_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 379;BA.debugLine="Sub lbl_player_one_make_1_MouseReleased (EventData";
 //BA.debugLineNum = 380;BA.debugLine="setP1Name";
_vv6();
 //BA.debugLineNum = 381;BA.debugLine="func.playerOneMake(lbl_player_one_make_100, lbl_p";
_vvvvvvvvv3._vvvvv6 /*String*/ (_lbl_player_one_make_100,_lbl_player_one_make_10,_lbl_player_one_make_1,_eventdata.getPrimaryButtonPressed(),(int) (1));
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_make_10_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 373;BA.debugLine="Sub lbl_player_one_make_10_MouseReleased (EventDat";
 //BA.debugLineNum = 374;BA.debugLine="setP1Name";
_vv6();
 //BA.debugLineNum = 375;BA.debugLine="func.playerOneMake(lbl_player_one_make_100, lbl_p";
_vvvvvvvvv3._vvvvv6 /*String*/ (_lbl_player_one_make_100,_lbl_player_one_make_10,_lbl_player_one_make_1,_eventdata.getPrimaryButtonPressed(),(int) (10));
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_make_100_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 368;BA.debugLine="Sub lbl_player_one_make_100_MouseReleased (EventDa";
 //BA.debugLineNum = 369;BA.debugLine="setP1Name";
_vv6();
 //BA.debugLineNum = 370;BA.debugLine="func.playerOneMake(lbl_player_one_make_100, lbl_p";
_vvvvvvvvv3._vvvvv6 /*String*/ (_lbl_player_one_make_100,_lbl_player_one_make_10,_lbl_player_one_make_1,_eventdata.getPrimaryButtonPressed(),(int) (100));
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_name_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 356;BA.debugLine="Sub lbl_player_one_name_MouseReleased (EventData A";
 //BA.debugLineNum = 357;BA.debugLine="setP1Name";
_vv6();
 //BA.debugLineNum = 358;BA.debugLine="func.processHs(\"all\")";
_vvvvvvvvv3._vvvvv0 /*String*/ ("all");
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_1_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Sub lbl_player_two_1_MouseEntered (EventData As Mo";
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_1_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 350;BA.debugLine="Sub lbl_player_two_1_MouseExited (EventData As Mou";
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_1_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Sub lbl_player_two_1_MouseReleased (EventData As M";
 //BA.debugLineNum = 281;BA.debugLine="setP2Name";
_vv7();
 //BA.debugLineNum = 282;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
 //BA.debugLineNum = 283;BA.debugLine="func.calcScorePlayertwo(1)";
_vvvvvvvvv3._vvvvv2 /*String*/ ((int) (1));
 }else if(_eventdata.getSecondaryButtonPressed()) { 
 //BA.debugLineNum = 285;BA.debugLine="func.calcScorePlayertwo(-1)";
_vvvvvvvvv3._vvvvv2 /*String*/ ((int) (-1));
 };
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_10_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 288;BA.debugLine="Sub lbl_player_two_10_MouseReleased (EventData As";
 //BA.debugLineNum = 289;BA.debugLine="setP2Name";
_vv7();
 //BA.debugLineNum = 290;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
 //BA.debugLineNum = 291;BA.debugLine="func.calcScorePlayertwo(10)";
_vvvvvvvvv3._vvvvv2 /*String*/ ((int) (10));
 }else if(_eventdata.getSecondaryButtonPressed()) { 
 //BA.debugLineNum = 293;BA.debugLine="func.calcScorePlayertwo(-10)";
_vvvvvvvvv3._vvvvv2 /*String*/ ((int) (-10));
 };
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_100_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub lbl_player_two_100_MouseReleased (EventData As";
 //BA.debugLineNum = 297;BA.debugLine="setP2Name";
_vv7();
 //BA.debugLineNum = 298;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
 //BA.debugLineNum = 299;BA.debugLine="func.calcScorePlayertwo(100)";
_vvvvvvvvv3._vvvvv2 /*String*/ ((int) (100));
 }else if(_eventdata.getSecondaryButtonPressed()) { 
 //BA.debugLineNum = 301;BA.debugLine="func.calcScorePlayertwo(-100)";
_vvvvvvvvv3._vvvvv2 /*String*/ ((int) (-100));
 };
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_make_1_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 401;BA.debugLine="Sub lbl_player_two_make_1_MouseReleased (EventData";
 //BA.debugLineNum = 402;BA.debugLine="func.playertwoMake(lbl_player_two_make_100, lbl_p";
_vvvvvvvvv3._vvvvv7 /*String*/ (_lbl_player_two_make_100,_lbl_player_two_make_10,_lbl_player_two_make_1,_eventdata.getPrimaryButtonPressed(),(int) (1));
 //BA.debugLineNum = 403;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_make_10_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 397;BA.debugLine="Sub lbl_player_two_make_10_MouseReleased (EventDat";
 //BA.debugLineNum = 398;BA.debugLine="func.playertwoMake(lbl_player_two_make_100, lbl_p";
_vvvvvvvvv3._vvvvv7 /*String*/ (_lbl_player_two_make_100,_lbl_player_two_make_10,_lbl_player_two_make_1,_eventdata.getPrimaryButtonPressed(),(int) (10));
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_make_100_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 392;BA.debugLine="Sub lbl_player_two_make_100_MouseReleased (EventDa";
 //BA.debugLineNum = 394;BA.debugLine="func.playertwoMake(lbl_player_two_make_100, lbl_p";
_vvvvvvvvv3._vvvvv7 /*String*/ (_lbl_player_two_make_100,_lbl_player_two_make_10,_lbl_player_two_make_1,_eventdata.getPrimaryButtonPressed(),(int) (100));
 //BA.debugLineNum = 395;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Sub lbl_player_two_MouseReleased (EventData As Mou";
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_name_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 362;BA.debugLine="Sub lbl_player_two_name_MouseReleased (EventData A";
 //BA.debugLineNum = 363;BA.debugLine="setP2Name";
_vv7();
 //BA.debugLineNum = 364;BA.debugLine="func.processHs(\"all\")";
_vvvvvvvvv3._vvvvv0 /*String*/ ("all");
 //BA.debugLineNum = 365;BA.debugLine="func.inngSet = 0";
_vvvvvvvvv3._vvv5 /*int*/  = (int) (0);
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_reset_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 555;BA.debugLine="Sub lbl_reset_MouseEntered (EventData As MouseEven";
 //BA.debugLineNum = 556;BA.debugLine="lbl_reset.Color =  0xFF69D79A";
_lbl_reset.setColor((int) (0xff69d79a));
 //BA.debugLineNum = 557;BA.debugLine="lbl_reset.TextColor = 0xFFFFFF00";
_lbl_reset.setTextColor((int) (0xffffff00));
 //BA.debugLineNum = 558;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_reset_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 560;BA.debugLine="Sub lbl_reset_MouseExited (EventData As MouseEvent";
 //BA.debugLineNum = 561;BA.debugLine="lbl_reset.Color = 0xFFFF0000";
_lbl_reset.setColor((int) (0xffff0000));
 //BA.debugLineNum = 562;BA.debugLine="lbl_reset.TextColor = 0xFFFFFFFF";
_lbl_reset.setTextColor((int) (0xffffffff));
 //BA.debugLineNum = 563;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_reset_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 565;BA.debugLine="Sub lbl_reset_MouseReleased (EventData As MouseEve";
 //BA.debugLineNum = 566;BA.debugLine="inactivecls.lastClick = DateTime.Now";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 567;BA.debugLine="nieuwePartij";
_vv2();
 //BA.debugLineNum = 570;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _v0() throws Exception{
anywheresoftware.b4a.objects.collections.List _list = null;
 //BA.debugLineNum = 232;BA.debugLine="Sub lstPlayerOneScoreLbl As List";
 //BA.debugLineNum = 233;BA.debugLine="Dim List As List";
_list = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 234;BA.debugLine="List.Initialize";
_list.Initialize();
 //BA.debugLineNum = 235;BA.debugLine="List.AddAll(Array As Object(lbl_player_one_1, lbl";
_list.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_lbl_player_one_1.getObject()),(Object)(_lbl_player_one_10.getObject()),(Object)(_lbl_player_one_100.getObject()),(Object)(_lbl_player_one_moyenne.getObject()),(Object)(_b4xprogressbarp1)}));
 //BA.debugLineNum = 236;BA.debugLine="Return List";
if (true) return _list;
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _vv1() throws Exception{
anywheresoftware.b4a.objects.collections.List _list = null;
 //BA.debugLineNum = 239;BA.debugLine="Sub lstPlayerTwoScoreLbl As List";
 //BA.debugLineNum = 240;BA.debugLine="Dim List As List";
_list = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 241;BA.debugLine="List.Initialize";
_list.Initialize();
 //BA.debugLineNum = 242;BA.debugLine="List.AddAll(Array As Object(lbl_player_two_1, lbl";
_list.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_lbl_player_two_1.getObject()),(Object)(_lbl_player_two_10.getObject()),(Object)(_lbl_player_two_100.getObject()),(Object)(_lbl_player_two_moyenne.getObject()),(Object)(_b4xprogressbarp2)}));
 //BA.debugLineNum = 243;BA.debugLine="Return List";
if (true) return _list;
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public static String  _mainform_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 644;BA.debugLine="Sub MainForm_MouseClicked (EventData As MouseEvent";
 //BA.debugLineNum = 645;BA.debugLine="If inactivecls.tmr_draw_promote.Enabled = True Th";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._tmr_draw_promote /*anywheresoftware.b4a.objects.Timer*/ .getEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 646;BA.debugLine="pn_promote.Top = pn_promote_top";
_pn_promote.setTop(_pn_promote_top);
 //BA.debugLineNum = 647;BA.debugLine="pn_promote_left = pn_promote_left";
_pn_promote_left = _pn_promote_left;
 //BA.debugLineNum = 649;BA.debugLine="inactivecls.lastClick = DateTime.Now";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 650;BA.debugLine="inactivecls.enableTime(True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._vvvvvvvvv0 /*String*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 651;BA.debugLine="inactivecls.enablePromote(False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._vvvvvvvvv7 /*String*/ (anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 653;BA.debugLine="End Sub";
return "";
}
public static void  _mousein_event(String _m,Object[] _args) throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 619;BA.debugLine="If promoteRunning = True Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 620;BA.debugLine="pn_promote.Top = pn_promote_top";
parent._pn_promote.setTop(parent._pn_promote_top);
 //BA.debugLineNum = 621;BA.debugLine="pn_promote.left = pn_promote_left";
parent._pn_promote.setLeft(parent._pn_promote_left);
 //BA.debugLineNum = 622;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (0));
this.state = 5;
return;
case 5:
//C
this.state = 4;
;
 //BA.debugLineNum = 623;BA.debugLine="inactivecls.lastClick = DateTime.Now";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 624;BA.debugLine="inactivecls.enableTime(True)";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._vvvvvvvvv0 /*String*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 625;BA.debugLine="inactivecls.enablePromote(False)";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._vvvvvvvvv7 /*String*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 626;BA.debugLine="promoteRunning = False";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 627;BA.debugLine="Sleep(300)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (300));
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
 //BA.debugLineNum = 629;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n1) throws Exception{
 //BA.debugLineNum = 631;BA.debugLine="private Sub MouseOver(n1 As Node)";
 //BA.debugLineNum = 632;BA.debugLine="setHandler(n1,\"setOnMouseMoved\",\"mouseIn\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_n1.getObject())),"setOnMouseMoved","mouseIn");
 //BA.debugLineNum = 633;BA.debugLine="setHandler(n1,\"setOnMouseExited\",\"mouseOut\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_n1.getObject())),"setOnMouseExited","mouseOut");
 //BA.debugLineNum = 634;BA.debugLine="End Sub";
return "";
}
public static void  _vv2() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 526;BA.debugLine="Wait For (pNieuwePartijDialog.ShowCustom(pNieuweP";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5,(Object)(""),(Object)(""),(Object)("")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (int) result[0];
;
 //BA.debugLineNum = 527;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent._vvvvvvvvvvvv6.DialogResponse_Positive) { 
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
 //BA.debugLineNum = 532;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _playeroneperc(String _perc) throws Exception{
 //BA.debugLineNum = 384;BA.debugLine="Sub playerOnePerc(perc As String)";
 //BA.debugLineNum = 385;BA.debugLine="lbl_player_one_perc.Text = perc";
_lbl_player_one_perc.setText(_perc);
 //BA.debugLineNum = 386;BA.debugLine="End Sub";
return "";
}
public static String  _playertwoperc(String _perc) throws Exception{
 //BA.debugLineNum = 388;BA.debugLine="Sub playerTwoPerc(perc As String)";
 //BA.debugLineNum = 389;BA.debugLine="lbl_player_two_perc.Text = perc";
_lbl_player_two_perc.setText(_perc);
 //BA.debugLineNum = 390;BA.debugLine="End Sub";
return "";
}
public static String  _pn_promote_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 605;BA.debugLine="Sub pn_promote_MouseReleased (EventData As MouseEv";
 //BA.debugLineNum = 606;BA.debugLine="pn_promote.Top = pn_promote_top";
_pn_promote.setTop(_pn_promote_top);
 //BA.debugLineNum = 607;BA.debugLine="pn_promote.left = pn_promote_left";
_pn_promote.setLeft(_pn_promote_left);
 //BA.debugLineNum = 609;BA.debugLine="inactivecls.lastClick = DateTime.Now";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 610;BA.debugLine="inactivecls.enableTime(True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._vvvvvvvvv0 /*String*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 611;BA.debugLine="inactivecls.enablePromote(False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._vvvvvvvvv7 /*String*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 612;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private fx As JFX";
_vvvvvvvv3 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 7;BA.debugLine="Private Dialog As B4XDialog";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new b4j.example.b4xdialog();
 //BA.debugLineNum = 8;BA.debugLine="Private Base As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private XUI As XUI";
_vvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Private frm As Form";
_vvvvvvvvvv7 = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 12;BA.debugLine="Private inactivecls As inactiveClass";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new b4j.example.inactiveclass();
 //BA.debugLineNum = 13;BA.debugLine="Private clsCheckCfg As classCheckConfig";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new b4j.example.classcheckconfig();
 //BA.debugLineNum = 14;BA.debugLine="Private clsToast As clXToastMessage";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new b4j.example.clxtoastmessage();
 //BA.debugLineNum = 15;BA.debugLine="Private clsUpdate as classUpdate";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new b4j.example.classupdate();
 //BA.debugLineNum = 17;BA.debugLine="Private pn_promote_top, pn_promote_left As Double";
_pn_promote_top = 0;
_pn_promote_left = 0;
 //BA.debugLineNum = 18;BA.debugLine="Private promoteRunning As Boolean = False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 19;BA.debugLine="Private pNieuwePartij As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private pNieuwePartijDialog As B4XDialog";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new b4j.example.b4xdialog();
 //BA.debugLineNum = 27;BA.debugLine="Private lbl_innings As Label";
_lbl_innings = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private lbl_player_one_moyenne As Label";
_lbl_player_one_moyenne = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private lbl_player_two_moyenne As Label";
_lbl_player_two_moyenne = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private lbl_player_two_100 As Label";
_lbl_player_two_100 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private lbl_player_two_10 As Label";
_lbl_player_two_10 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private lbl_player_two_1 As Label";
_lbl_player_two_1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private btn_exit As B4XView";
_btn_exit = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private lbl_player_one_name As B4XView";
_lbl_player_one_name = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private lbl_player_two_name As B4XView";
_lbl_player_two_name = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private lbl_player_one_perc As Label";
_lbl_player_one_perc = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private lbl_player_one_make_100 As Label";
_lbl_player_one_make_100 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private lbl_player_one_make_10 As Label";
_lbl_player_one_make_10 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private lbl_player_one_make_1 As Label";
_lbl_player_one_make_1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private lbl_player_two_make_100 As Label";
_lbl_player_two_make_100 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private lbl_player_two_make_10 As Label";
_lbl_player_two_make_10 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private lbl_player_two_make_1 As Label";
_lbl_player_two_make_1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private lbl_player_two_perc As Label";
_lbl_player_two_perc = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 49;BA.debugLine="Private lbl_reset As B4XView";
_lbl_reset = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 50;BA.debugLine="Private jxui As XUI";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 51;BA.debugLine="Private lbl_player_one_hs As Label";
_lbl_player_one_hs = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Private lbl_player_two_hs As Label";
_lbl_player_two_hs = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Private lbl_clock As B4XView";
_lbl_clock = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 54;BA.debugLine="Private clsTmr As timerClass";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new b4j.example.timerclass();
 //BA.debugLineNum = 58;BA.debugLine="Private Label7 As Label";
_label7 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 60;BA.debugLine="Private edt_speler_a As TextField";
_edt_speler_a = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 61;BA.debugLine="Private edt_temaken_a As TextField";
_edt_temaken_a = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 62;BA.debugLine="Private edt_speler_b As TextField";
_edt_speler_b = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 63;BA.debugLine="Private edt_temaken_b As TextField";
_edt_temaken_b = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 64;BA.debugLine="Private btn_a_begint As Button";
_btn_a_begint = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 65;BA.debugLine="Private btn_b_begint As Button";
_btn_b_begint = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 70;BA.debugLine="Private B4XProgressBarP1 As B4XProgressBar";
_b4xprogressbarp1 = new b4j.example.b4xprogressbar();
 //BA.debugLineNum = 71;BA.debugLine="Private B4XProgressBarP2 As B4XProgressBar";
_b4xprogressbarp2 = new b4j.example.b4xprogressbar();
 //BA.debugLineNum = 73;BA.debugLine="Private btn_nieuwe_partij As Button";
_btn_nieuwe_partij = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 74;BA.debugLine="Private btn_annuleer_nieuwe_partij As Button";
_btn_annuleer_nieuwe_partij = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 78;BA.debugLine="Private Label6 As Label";
_label6 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 79;BA.debugLine="Private lbl_close As B4XView";
_lbl_close = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 80;BA.debugLine="Private chk_add_player As CheckBox";
_chk_add_player = new anywheresoftware.b4j.objects.CheckboxWrapper();
 //BA.debugLineNum = 81;BA.debugLine="Private img_random As ImageView";
_img_random = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 84;BA.debugLine="Private pn_p1_carom As Pane";
_pn_p1_carom = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 86;BA.debugLine="Private pn_promote As Pane";
_pn_promote = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 87;BA.debugLine="Private lbl_config_update As Label";
_lbl_config_update = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 90;BA.debugLine="Private lbl_player_one_1 As Label";
_lbl_player_one_1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 91;BA.debugLine="Private lbl_player_one_10 As Label";
_lbl_player_one_10 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 92;BA.debugLine="Private lbl_player_one_100 As Label";
_lbl_player_one_100 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 95;BA.debugLine="Private lbl_message_1 As Label";
_lbl_message_1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 96;BA.debugLine="Private lbl_message_2 As Label";
_lbl_message_2 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 97;BA.debugLine="Private lbl_message_3 As Label";
_lbl_message_3 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 98;BA.debugLine="Private lbl_message_4 As Label";
_lbl_message_4 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 99;BA.debugLine="Private lbl_message_5 As Label";
_lbl_message_5 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public static void  _vv3(boolean _bordstart) throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 415;BA.debugLine="If bordStart Then";
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
 //BA.debugLineNum = 417;BA.debugLine="Dim sf As Object = jxui.Msgbox2Async(\"Bord reset";
_sf = parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Msgbox2Async(ba,"Bord resetten?","","Ja","","Nee",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 418;BA.debugLine="Wait For (sf) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, this, _sf);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_result = (int) result[0];
;
 //BA.debugLineNum = 419;BA.debugLine="If Result = jxui.DialogResponse_Negative Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_result==parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.DialogResponse_Negative) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 420;BA.debugLine="Return";
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
 //BA.debugLineNum = 427;BA.debugLine="setCaromNumber(lbl_player_one_1, \"0\")";
_vv4((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._lbl_player_one_1.getObject())),"0");
 //BA.debugLineNum = 429;BA.debugLine="setCaromNumber(lbl_player_one_10, \"0\")";
_vv4((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._lbl_player_one_10.getObject())),"0");
 //BA.debugLineNum = 431;BA.debugLine="setCaromNumber(lbl_player_one_100, \"0\")";
_vv4((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._lbl_player_one_100.getObject())),"0");
 //BA.debugLineNum = 434;BA.debugLine="lbl_player_one_1.Text = \"0\"";
parent._lbl_player_one_1.setText("0");
 //BA.debugLineNum = 435;BA.debugLine="lbl_player_one_make_100.Text = \"0\"";
parent._lbl_player_one_make_100.setText("0");
 //BA.debugLineNum = 436;BA.debugLine="lbl_player_one_make_10.Text = \"0\"";
parent._lbl_player_one_make_10.setText("0");
 //BA.debugLineNum = 437;BA.debugLine="lbl_player_one_make_1.Text = \"0\"";
parent._lbl_player_one_make_1.setText("0");
 //BA.debugLineNum = 438;BA.debugLine="lbl_player_one_moyenne.Text = \"0.000\"";
parent._lbl_player_one_moyenne.setText("0.000");
 //BA.debugLineNum = 439;BA.debugLine="lbl_player_one_perc.Text = \"0.00%\"";
parent._lbl_player_one_perc.setText("0.00%");
 //BA.debugLineNum = 441;BA.debugLine="lbl_innings.Text = \"000\"";
parent._lbl_innings.setText("000");
 //BA.debugLineNum = 444;BA.debugLine="lbl_player_two_100.Text = \"0\"";
parent._lbl_player_two_100.setText("0");
 //BA.debugLineNum = 445;BA.debugLine="lbl_player_two_10.Text = \"0\"";
parent._lbl_player_two_10.setText("0");
 //BA.debugLineNum = 446;BA.debugLine="lbl_player_two_1.Text = \"0\"";
parent._lbl_player_two_1.setText("0");
 //BA.debugLineNum = 447;BA.debugLine="lbl_player_two_make_100.Text = \"0\"";
parent._lbl_player_two_make_100.setText("0");
 //BA.debugLineNum = 448;BA.debugLine="lbl_player_two_make_10.Text = \"0\"";
parent._lbl_player_two_make_10.setText("0");
 //BA.debugLineNum = 449;BA.debugLine="lbl_player_two_make_1.Text = \"0\"";
parent._lbl_player_two_make_1.setText("0");
 //BA.debugLineNum = 450;BA.debugLine="lbl_player_two_perc.Text = \"0.00%\"";
parent._lbl_player_two_perc.setText("0.00%");
 //BA.debugLineNum = 451;BA.debugLine="lbl_player_two_moyenne.Text = \"0.000\"";
parent._lbl_player_two_moyenne.setText("0.000");
 //BA.debugLineNum = 452;BA.debugLine="lbl_player_one_hs.Text = \"000\"";
parent._lbl_player_one_hs.setText("000");
 //BA.debugLineNum = 453;BA.debugLine="lbl_player_two_hs.Text = \"000\"";
parent._lbl_player_two_hs.setText("000");
 //BA.debugLineNum = 455;BA.debugLine="func.inngSet = 0";
parent._vvvvvvvvv3._vvv5 /*int*/  = (int) (0);
 //BA.debugLineNum = 456;BA.debugLine="func.innigs = 0";
parent._vvvvvvvvv3._vvv4 /*int*/  = (int) (0);
 //BA.debugLineNum = 457;BA.debugLine="func.scorePlayerOne = 0";
parent._vvvvvvvvv3._vvv2 /*int*/  = (int) (0);
 //BA.debugLineNum = 458;BA.debugLine="func.scorePlayerTwo = 0";
parent._vvvvvvvvv3._vvv3 /*int*/  = (int) (0);
 //BA.debugLineNum = 459;BA.debugLine="func.playerOneToMake = 0";
parent._vvvvvvvvv3._vvvv2 /*int*/  = (int) (0);
 //BA.debugLineNum = 460;BA.debugLine="func.playertwoToMake = 0";
parent._vvvvvvvvv3._vvvv3 /*int*/  = (int) (0);
 //BA.debugLineNum = 461;BA.debugLine="func.playerOneHs = 0";
parent._vvvvvvvvv3._vvv7 /*int*/  = (int) (0);
 //BA.debugLineNum = 462;BA.debugLine="func.playerTwoHs = 0";
parent._vvvvvvvvv3._vvv0 /*int*/  = (int) (0);
 //BA.debugLineNum = 463;BA.debugLine="func.p1HsTemp = 0";
parent._vvvvvvvvv3._vvvv4 /*int*/  = (int) (0);
 //BA.debugLineNum = 464;BA.debugLine="func.p2HsTemp = 0";
parent._vvvvvvvvv3._vvvv5 /*int*/  = (int) (0);
 //BA.debugLineNum = 465;BA.debugLine="B4XProgressBarP1.Progress = 0";
parent._b4xprogressbarp1._setvvvvvvvvvvvv2 /*float*/ ((float) (0));
 //BA.debugLineNum = 466;BA.debugLine="B4XProgressBarP2.Progress = 0";
parent._b4xprogressbarp2._setvvvvvvvvvvvv2 /*float*/ ((float) (0));
 //BA.debugLineNum = 467;BA.debugLine="setP1Name";
_vv6();
 //BA.debugLineNum = 469;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _msgbox_result(int _result) throws Exception{
}
public static String  _vv4(anywheresoftware.b4a.objects.B4XViewWrapper _v,String _value) throws Exception{
 //BA.debugLineNum = 405;BA.debugLine="Sub setCaromNumber(v As B4XView, value As String)";
 //BA.debugLineNum = 408;BA.debugLine="v.Color = 0x00FFFFFF";
_v.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 409;BA.debugLine="v.Text = value";
_v.setText(_value);
 //BA.debugLineNum = 412;BA.debugLine="End Sub";
return "";
}
public static String  _vv5() throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub setFontSize";
 //BA.debugLineNum = 187;BA.debugLine="func.caromLabelCss(lbl_innings, \"labelCarom\")";
_vvvvvvvvv3._vvvvv3 /*String*/ (_lbl_innings,"labelCarom");
 //BA.debugLineNum = 189;BA.debugLine="func.caromLabelCss(lbl_player_one_hs, \"labelWhite";
_vvvvvvvvv3._vvvvv3 /*String*/ (_lbl_player_one_hs,"labelWhite");
 //BA.debugLineNum = 190;BA.debugLine="func.caromLabelCss(lbl_player_one_moyenne, \"label";
_vvvvvvvvv3._vvvvv3 /*String*/ (_lbl_player_one_moyenne,"labelWhite");
 //BA.debugLineNum = 191;BA.debugLine="func.caromLabelCss(lbl_player_one_perc, \"labelWhi";
_vvvvvvvvv3._vvvvv3 /*String*/ (_lbl_player_one_perc,"labelWhite");
 //BA.debugLineNum = 194;BA.debugLine="func.caromLabelCss(lbl_player_one_100, \"labelCaro";
_vvvvvvvvv3._vvvvv3 /*String*/ (_lbl_player_one_100,"labelCarom");
 //BA.debugLineNum = 195;BA.debugLine="func.caromLabelCss(lbl_player_one_10, \"labelCarom";
_vvvvvvvvv3._vvvvv3 /*String*/ (_lbl_player_one_10,"labelCarom");
 //BA.debugLineNum = 196;BA.debugLine="func.caromLabelCss(lbl_player_one_1, \"labelCarom\"";
_vvvvvvvvv3._vvvvv3 /*String*/ (_lbl_player_one_1,"labelCarom");
 //BA.debugLineNum = 199;BA.debugLine="func.caromLabelCss(lbl_player_one_make_100, \"labe";
_vvvvvvvvv3._vvvvv3 /*String*/ (_lbl_player_one_make_100,"labelCarom");
 //BA.debugLineNum = 200;BA.debugLine="func.caromLabelCss(lbl_player_one_make_10, \"label";
_vvvvvvvvv3._vvvvv3 /*String*/ (_lbl_player_one_make_10,"labelCarom");
 //BA.debugLineNum = 201;BA.debugLine="func.caromLabelCss(lbl_player_one_make_1, \"labelC";
_vvvvvvvvv3._vvvvv3 /*String*/ (_lbl_player_one_make_1,"labelCarom");
 //BA.debugLineNum = 203;BA.debugLine="func.caromLabelCss(lbl_player_two_hs, \"labelWhite";
_vvvvvvvvv3._vvvvv3 /*String*/ (_lbl_player_two_hs,"labelWhite");
 //BA.debugLineNum = 204;BA.debugLine="func.caromLabelCss(lbl_player_two_moyenne, \"label";
_vvvvvvvvv3._vvvvv3 /*String*/ (_lbl_player_two_moyenne,"labelWhite");
 //BA.debugLineNum = 205;BA.debugLine="func.caromLabelCss(lbl_player_two_perc, \"labelWhi";
_vvvvvvvvv3._vvvvv3 /*String*/ (_lbl_player_two_perc,"labelWhite");
 //BA.debugLineNum = 207;BA.debugLine="func.caromLabelCss(lbl_player_two_100, \"labelCaro";
_vvvvvvvvv3._vvvvv3 /*String*/ (_lbl_player_two_100,"labelCarom");
 //BA.debugLineNum = 208;BA.debugLine="func.caromLabelCss(lbl_player_two_10, \"labelCarom";
_vvvvvvvvv3._vvvvv3 /*String*/ (_lbl_player_two_10,"labelCarom");
 //BA.debugLineNum = 209;BA.debugLine="func.caromLabelCss(lbl_player_two_1, \"labelCarom\"";
_vvvvvvvvv3._vvvvv3 /*String*/ (_lbl_player_two_1,"labelCarom");
 //BA.debugLineNum = 211;BA.debugLine="func.caromLabelCss(lbl_player_two_make_100, \"labe";
_vvvvvvvvv3._vvvvv3 /*String*/ (_lbl_player_two_make_100,"labelCarom");
 //BA.debugLineNum = 212;BA.debugLine="func.caromLabelCss(lbl_player_two_make_10, \"label";
_vvvvvvvvv3._vvvvv3 /*String*/ (_lbl_player_two_make_10,"labelCarom");
 //BA.debugLineNum = 213;BA.debugLine="func.caromLabelCss(lbl_player_two_make_1, \"labelC";
_vvvvvvvvv3._vvvvv3 /*String*/ (_lbl_player_two_make_1,"labelCarom");
 //BA.debugLineNum = 216;BA.debugLine="resetBoard(False)";
_vv3(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(anywheresoftware.b4j.object.JavaObject _ob,String _eventname,String _handlername) throws Exception{
 //BA.debugLineNum = 636;BA.debugLine="private Sub setHandler(ob As JavaObject,eventName";
 //BA.debugLineNum = 637;BA.debugLine="ob.RunMethod(eventName, Array(ob.CreateEventFromU";
_ob.RunMethod(_eventname,new Object[]{_ob.CreateEventFromUI(ba,"javafx.event.EventHandler",_handlername,(Object)(anywheresoftware.b4a.keywords.Common.True))});
 //BA.debugLineNum = 638;BA.debugLine="End Sub";
return "";
}
public static String  _setmessage(anywheresoftware.b4a.objects.collections.List _msglist) throws Exception{
 //BA.debugLineNum = 715;BA.debugLine="Sub setMessage(msgList As List)";
 //BA.debugLineNum = 716;BA.debugLine="lbl_message_1.Text = msgList.get(0)";
_lbl_message_1.setText(BA.ObjectToString(_msglist.Get((int) (0))));
 //BA.debugLineNum = 717;BA.debugLine="lbl_message_2.Text = msgList.get(1)";
_lbl_message_2.setText(BA.ObjectToString(_msglist.Get((int) (1))));
 //BA.debugLineNum = 718;BA.debugLine="lbl_message_3.Text = msgList.get(2)";
_lbl_message_3.setText(BA.ObjectToString(_msglist.Get((int) (2))));
 //BA.debugLineNum = 719;BA.debugLine="lbl_message_4.Text = msgList.get(3)";
_lbl_message_4.setText(BA.ObjectToString(_msglist.Get((int) (3))));
 //BA.debugLineNum = 720;BA.debugLine="lbl_message_5.Text = msgList.Get(4)";
_lbl_message_5.setText(BA.ObjectToString(_msglist.Get((int) (4))));
 //BA.debugLineNum = 722;BA.debugLine="End Sub";
return "";
}
public static String  _vv6() throws Exception{
 //BA.debugLineNum = 472;BA.debugLine="Sub setP1Name";
 //BA.debugLineNum = 473;BA.debugLine="lbl_player_one_name.Color = 0xff3455db'0xFF69D79A";
_lbl_player_one_name.setColor((int) (0xff3455db));
 //BA.debugLineNum = 474;BA.debugLine="lbl_player_two_name.Color = 0xFF001A01";
_lbl_player_two_name.setColor((int) (0xff001a01));
 //BA.debugLineNum = 475;BA.debugLine="End Sub";
return "";
}
public static String  _vv7() throws Exception{
 //BA.debugLineNum = 477;BA.debugLine="Sub setP2Name";
 //BA.debugLineNum = 478;BA.debugLine="lbl_player_two_name.Color = 0xff3455db'0xFF69D79A";
_lbl_player_two_name.setColor((int) (0xff3455db));
 //BA.debugLineNum = 479;BA.debugLine="lbl_player_one_name.Color = 0xFF001A01";
_lbl_player_one_name.setColor((int) (0xff001a01));
 //BA.debugLineNum = 480;BA.debugLine="End Sub";
return "";
}
public static String  _setpromoterunning(boolean _running) throws Exception{
 //BA.debugLineNum = 614;BA.debugLine="Sub setPromoteRunning(running As Boolean)";
 //BA.debugLineNum = 615;BA.debugLine="promoteRunning = running";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _running;
 //BA.debugLineNum = 616;BA.debugLine="End Sub";
return "";
}
public static void  _show() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 105;BA.debugLine="frm.Initialize(\"frm\", 1920, 1080)";
parent._vvvvvvvvvv7.Initialize(ba,"frm",1920,1080);
 //BA.debugLineNum = 106;BA.debugLine="frm.RootPane.LoadLayout(\"scorebord\")";
parent._vvvvvvvvvv7.getRootPane().LoadLayout(ba,"scorebord");
 //BA.debugLineNum = 107;BA.debugLine="setFontSize";
_vv5();
 //BA.debugLineNum = 108;BA.debugLine="frm.Stylesheets.Add(File.GetUri(File.DirAssets, \"";
parent._vvvvvvvvvv7.getStylesheets().Add((Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"n205.css")));
 //BA.debugLineNum = 109;BA.debugLine="parseConfig.pullConfig";
parent._vvvvvvvvv4._vvvvvvv6 /*String*/ ();
 //BA.debugLineNum = 113;BA.debugLine="frm.SetFormStyle(\"UNDECORATED\")";
parent._vvvvvvvvvv7.SetFormStyle("UNDECORATED");
 //BA.debugLineNum = 114;BA.debugLine="frm.Resizable = False";
parent._vvvvvvvvvv7.setResizable(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 117;BA.debugLine="frm.Show";
parent._vvvvvvvvvv7.Show();
 //BA.debugLineNum = 118;BA.debugLine="MouseOver(frm.RootPane)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(parent._vvvvvvvvvv7.getRootPane().getObject())));
 //BA.debugLineNum = 120;BA.debugLine="Base = frm.RootPane";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setObject((java.lang.Object)(parent._vvvvvvvvvv7.getRootPane().getObject()));
 //BA.debugLineNum = 121;BA.debugLine="Dialog.Initialize (Base)";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2._initialize /*String*/ (ba,parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 124;BA.debugLine="func.SetCustomCursor1(File.DirAssets, \"mouse.png\"";
parent._vvvvvvvvv3._vvvvvv1 /*String*/ (anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"mouse.png",370,370,(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(parent._vvvvvvvvvv7.getRootPane().getObject())));
 //BA.debugLineNum = 127;BA.debugLine="clsTmr.Initialize(lbl_clock)";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._initialize /*String*/ (ba,(anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(parent._lbl_clock.getObject())));
 //BA.debugLineNum = 128;BA.debugLine="inactivecls.Initialize";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._initialize /*String*/ (ba);
 //BA.debugLineNum = 129;BA.debugLine="clsCheckCfg.Initialize";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3._initialize /*String*/ (ba);
 //BA.debugLineNum = 130;BA.debugLine="clsToast.Initialize(frm.RootPane)";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._initialize /*String*/ (ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._vvvvvvvvvv7.getRootPane().getObject())));
 //BA.debugLineNum = 131;BA.debugLine="clsUpdate.Initialize";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5._initialize /*String*/ (ba);
 //BA.debugLineNum = 133;BA.debugLine="clsUpdate.checkUpdate";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ();
 //BA.debugLineNum = 136;BA.debugLine="func.lblInnings = lbl_innings";
parent._vvvvvvvvv3._vvvv6 /*anywheresoftware.b4j.objects.LabelWrapper*/  = parent._lbl_innings;
 //BA.debugLineNum = 137;BA.debugLine="func.lbl_player_one_hs = lbl_player_one_hs";
parent._vvvvvvvvv3._lbl_player_one_hs /*anywheresoftware.b4j.objects.LabelWrapper*/  = parent._lbl_player_one_hs;
 //BA.debugLineNum = 138;BA.debugLine="func.lbl_player_two_hs = lbl_player_two_hs";
parent._vvvvvvvvv3._lbl_player_two_hs /*anywheresoftware.b4j.objects.LabelWrapper*/  = parent._lbl_player_two_hs;
 //BA.debugLineNum = 140;BA.debugLine="func.setP1CaromLables(lstPlayerOneScoreLbl)";
parent._vvvvvvvvv3._vvvvvv6 /*String*/ (_v0());
 //BA.debugLineNum = 141;BA.debugLine="func.setP2CaromLables(lstPlayerTwoScoreLbl)";
parent._vvvvvvvvv3._vvvvvv7 /*String*/ (_vv1());
 //BA.debugLineNum = 143;BA.debugLine="Wait For (funcInet.testInet) Complete (result As";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, parent._vvvvvvvvv5._vvvvvvv0 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (boolean) result[0];
;
 //BA.debugLineNum = 144;BA.debugLine="If result Then";
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
 //BA.debugLineNum = 145;BA.debugLine="func.hasInternetAccess = True";
parent._vvvvvvvvv3._vvv1 /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 147;BA.debugLine="func.hasInternetAccess = False";
parent._vvvvvvvvv3._vvv1 /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 151;BA.debugLine="initPanels";
_v7();
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _showpromote() throws Exception{
 //BA.debugLineNum = 595;BA.debugLine="Sub showPromote";
 //BA.debugLineNum = 596;BA.debugLine="pn_promote.SetLayoutAnimated(0, 50dip, 50dip, pn_";
_pn_promote.SetLayoutAnimated((int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),_pn_promote.getWidth(),_pn_promote.getHeight());
 //BA.debugLineNum = 597;BA.debugLine="End Sub";
return "";
}
public static void  _updatecfg() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 656;BA.debugLine="inactivecls.updatePromote";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._vvvvvvvvvv2 /*String*/ ();
 //BA.debugLineNum = 657;BA.debugLine="lbl_config_update.Visible = True";
parent._lbl_config_update.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 658;BA.debugLine="Sleep(5000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (5000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 659;BA.debugLine="lbl_config_update.Visible = False";
parent._lbl_config_update.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 660;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _usedigitalfont(boolean _usedigital) throws Exception{
int _fscarom = 0;
int _fsmake = 0;
int _fsinnings = 0;
 //BA.debugLineNum = 662;BA.debugLine="Sub useDigitalFont(useDigital As Boolean)";
 //BA.debugLineNum = 663;BA.debugLine="Dim fsCarom, fsMake, fsInnings As Int";
_fscarom = 0;
_fsmake = 0;
_fsinnings = 0;
 //BA.debugLineNum = 665;BA.debugLine="If useDigital Then";
if (_usedigital) { 
 //BA.debugLineNum = 666;BA.debugLine="fsCarom = 350";
_fscarom = (int) (350);
 //BA.debugLineNum = 667;BA.debugLine="fsMake = 225";
_fsmake = (int) (225);
 //BA.debugLineNum = 668;BA.debugLine="fsInnings = 300";
_fsinnings = (int) (300);
 }else {
 //BA.debugLineNum = 670;BA.debugLine="fsCarom = 225";
_fscarom = (int) (225);
 //BA.debugLineNum = 671;BA.debugLine="fsMake = 150";
_fsmake = (int) (150);
 //BA.debugLineNum = 672;BA.debugLine="fsInnings = 200";
_fsinnings = (int) (200);
 };
 //BA.debugLineNum = 675;BA.debugLine="func.setFont(lbl_player_one_1, fsCarom, useDigita";
_vvvvvvvvv3._vvvvvv2 /*String*/ (_lbl_player_one_1,_fscarom,_usedigital);
 //BA.debugLineNum = 676;BA.debugLine="func.setFont(lbl_player_one_10, fsCarom, useDigit";
_vvvvvvvvv3._vvvvvv2 /*String*/ (_lbl_player_one_10,_fscarom,_usedigital);
 //BA.debugLineNum = 677;BA.debugLine="func.setFont(lbl_player_one_100, fsCarom, useDigi";
_vvvvvvvvv3._vvvvvv2 /*String*/ (_lbl_player_one_100,_fscarom,_usedigital);
 //BA.debugLineNum = 678;BA.debugLine="func.setFont(lbl_player_two_1, fsCarom, useDigita";
_vvvvvvvvv3._vvvvvv2 /*String*/ (_lbl_player_two_1,_fscarom,_usedigital);
 //BA.debugLineNum = 679;BA.debugLine="func.setFont(lbl_player_two_10, fsCarom, useDigit";
_vvvvvvvvv3._vvvvvv2 /*String*/ (_lbl_player_two_10,_fscarom,_usedigital);
 //BA.debugLineNum = 680;BA.debugLine="func.setFont(lbl_player_two_100, fsCarom, useDigi";
_vvvvvvvvv3._vvvvvv2 /*String*/ (_lbl_player_two_100,_fscarom,_usedigital);
 //BA.debugLineNum = 681;BA.debugLine="func.setFont(lbl_innings, fsInnings, useDigital)";
_vvvvvvvvv3._vvvvvv2 /*String*/ (_lbl_innings,_fsinnings,_usedigital);
 //BA.debugLineNum = 682;BA.debugLine="func.setFont(lbl_player_one_make_100, fsMake, use";
_vvvvvvvvv3._vvvvvv2 /*String*/ (_lbl_player_one_make_100,_fsmake,_usedigital);
 //BA.debugLineNum = 683;BA.debugLine="func.setFont(lbl_player_one_make_10, fsMake, useD";
_vvvvvvvvv3._vvvvvv2 /*String*/ (_lbl_player_one_make_10,_fsmake,_usedigital);
 //BA.debugLineNum = 684;BA.debugLine="func.setFont(lbl_player_one_make_1, fsMake, useDi";
_vvvvvvvvv3._vvvvvv2 /*String*/ (_lbl_player_one_make_1,_fsmake,_usedigital);
 //BA.debugLineNum = 685;BA.debugLine="func.setFont(lbl_player_two_make_100,fsMake, useD";
_vvvvvvvvv3._vvvvvv2 /*String*/ (_lbl_player_two_make_100,_fsmake,_usedigital);
 //BA.debugLineNum = 686;BA.debugLine="func.setFont(lbl_player_two_make_10,fsMake, useDi";
_vvvvvvvvv3._vvvvvv2 /*String*/ (_lbl_player_two_make_10,_fsmake,_usedigital);
 //BA.debugLineNum = 687;BA.debugLine="func.setFont(lbl_player_two_make_1,fsMake, useDig";
_vvvvvvvvv3._vvvvvv2 /*String*/ (_lbl_player_two_make_1,_fsmake,_usedigital);
 //BA.debugLineNum = 689;BA.debugLine="End Sub";
return "";
}
public static String  _usefontyellow(boolean _useyellow) throws Exception{
 //BA.debugLineNum = 691;BA.debugLine="Sub useFontYellow(useYellow As Boolean)";
 //BA.debugLineNum = 693;BA.debugLine="func.setFontColor(lbl_innings, useYellow)";
_vvvvvvvvv3._vvvvvv3 /*String*/ (_lbl_innings,_useyellow);
 //BA.debugLineNum = 695;BA.debugLine="func.setFontColor(lbl_player_one_1, useYellow)";
_vvvvvvvvv3._vvvvvv3 /*String*/ (_lbl_player_one_1,_useyellow);
 //BA.debugLineNum = 696;BA.debugLine="func.setFontColor(lbl_player_one_10, useYellow)";
_vvvvvvvvv3._vvvvvv3 /*String*/ (_lbl_player_one_10,_useyellow);
 //BA.debugLineNum = 697;BA.debugLine="func.setFontColor(lbl_player_one_100, useYellow)";
_vvvvvvvvv3._vvvvvv3 /*String*/ (_lbl_player_one_100,_useyellow);
 //BA.debugLineNum = 699;BA.debugLine="func.setFontColor(lbl_player_two_1, useYellow)";
_vvvvvvvvv3._vvvvvv3 /*String*/ (_lbl_player_two_1,_useyellow);
 //BA.debugLineNum = 700;BA.debugLine="func.setFontColor(lbl_player_two_10, useYellow)";
_vvvvvvvvv3._vvvvvv3 /*String*/ (_lbl_player_two_10,_useyellow);
 //BA.debugLineNum = 701;BA.debugLine="func.setFontColor(lbl_player_two_100, useYellow)";
_vvvvvvvvv3._vvvvvv3 /*String*/ (_lbl_player_two_100,_useyellow);
 //BA.debugLineNum = 703;BA.debugLine="func.setFontColor(lbl_player_one_make_100, useYel";
_vvvvvvvvv3._vvvvvv3 /*String*/ (_lbl_player_one_make_100,_useyellow);
 //BA.debugLineNum = 704;BA.debugLine="func.setFontColor(lbl_player_one_make_10, useYell";
_vvvvvvvvv3._vvvvvv3 /*String*/ (_lbl_player_one_make_10,_useyellow);
 //BA.debugLineNum = 705;BA.debugLine="func.setFontColor(lbl_player_one_make_1, useYello";
_vvvvvvvvv3._vvvvvv3 /*String*/ (_lbl_player_one_make_1,_useyellow);
 //BA.debugLineNum = 707;BA.debugLine="func.setFontColor(lbl_player_two_make_100, useYel";
_vvvvvvvvv3._vvvvvv3 /*String*/ (_lbl_player_two_make_100,_useyellow);
 //BA.debugLineNum = 708;BA.debugLine="func.setFontColor(lbl_player_two_make_10, useYell";
_vvvvvvvvv3._vvvvvv3 /*String*/ (_lbl_player_two_make_10,_useyellow);
 //BA.debugLineNum = 709;BA.debugLine="func.setFontColor(lbl_player_two_make_1, useYello";
_vvvvvvvvv3._vvvvvv3 /*String*/ (_lbl_player_two_make_1,_useyellow);
 //BA.debugLineNum = 712;BA.debugLine="End Sub";
return "";
}
}
