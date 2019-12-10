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
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_one_1 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_one_10 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_one_100 = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.main _main = null;
public static b4j.example.func _func = null;
public static b4j.example.funcinet _funcinet = null;
public static b4j.example.parseconfig _parseconfig = null;
public static b4j.example.httputils2service _httputils2service = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 242;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return false;
}
public static anywheresoftware.b4j.object.JavaObject  _asjo(anywheresoftware.b4j.object.JavaObject _o) throws Exception{
 //BA.debugLineNum = 822;BA.debugLine="Private Sub asJO(o As JavaObject) As JavaObject";
 //BA.debugLineNum = 823;BA.debugLine="Return o";
if (true) return _o;
 //BA.debugLineNum = 824;BA.debugLine="End Sub";
return null;
}
public static String  _btn_a_begint_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 708;BA.debugLine="Sub btn_a_begint_MouseReleased (EventData As Mouse";
 //BA.debugLineNum = 710;BA.debugLine="End Sub";
return "";
}
public static String  _btn_annuleer_nieuwe_partij_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 756;BA.debugLine="Sub btn_annuleer_nieuwe_partij_MouseReleased (Even";
 //BA.debugLineNum = 757;BA.debugLine="pNieuwePartijDialog.Close(XUI.DialogResponse_Canc";
_pnieuwepartijdialog._close /*boolean*/ (_xui.DialogResponse_Cancel);
 //BA.debugLineNum = 759;BA.debugLine="End Sub";
return "";
}
public static String  _btn_b_begint_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 712;BA.debugLine="Sub btn_b_begint_MouseReleased (EventData As Mouse";
 //BA.debugLineNum = 714;BA.debugLine="End Sub";
return "";
}
public static String  _btn_exit_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 371;BA.debugLine="Sub btn_exit_MouseReleased (EventData As MouseEven";
 //BA.debugLineNum = 372;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return "";
}
public static String  _btn_nieuwe_partij_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 747;BA.debugLine="Sub btn_nieuwe_partij_MouseReleased (EventData As";
 //BA.debugLineNum = 748;BA.debugLine="pNieuwePartijDialog.Close(XUI.DialogResponse_Posi";
_pnieuwepartijdialog._close /*boolean*/ (_xui.DialogResponse_Positive);
 //BA.debugLineNum = 750;BA.debugLine="resetBoard(False)";
_resetboard(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 751;BA.debugLine="If chk_add_player.Checked Then";
if (_chk_add_player.getChecked()) { 
 //BA.debugLineNum = 752;BA.debugLine="iets";
_iets();
 };
 //BA.debugLineNum = 754;BA.debugLine="End Sub";
return "";
}
public static String  _checkmatchwonp1() throws Exception{
int _caroms = 0;
int _make = 0;
 //BA.debugLineNum = 651;BA.debugLine="Sub checkMatchWonP1";
 //BA.debugLineNum = 652;BA.debugLine="Dim caroms, make As Int";
_caroms = 0;
_make = 0;
 //BA.debugLineNum = 654;BA.debugLine="caroms = lbl_player_one_100.Text&lbl_player_one_1";
_caroms = (int)(Double.parseDouble(_lbl_player_one_100.getText()+_lbl_player_one_10.getText()+_lbl_player_one_1.getText()));
 //BA.debugLineNum = 655;BA.debugLine="make = lbl_player_one_make_100.text&lbl_player_on";
_make = (int)(Double.parseDouble(_lbl_player_one_make_100.getText()+_lbl_player_one_make_10.getText()+_lbl_player_one_make_1.getText()));
 //BA.debugLineNum = 657;BA.debugLine="If caroms >= make Then";
if (_caroms>=_make) { 
 //BA.debugLineNum = 658;BA.debugLine="Log($\"Speler 1 wint, nabeurt voor speler 2\"$)";
anywheresoftware.b4a.keywords.Common.Log(("Speler 1 wint, nabeurt voor speler 2"));
 };
 //BA.debugLineNum = 660;BA.debugLine="End Sub";
return "";
}
public static String  _checkmatchwonp2() throws Exception{
int _caroms = 0;
int _make = 0;
 //BA.debugLineNum = 662;BA.debugLine="Sub checkMatchWonP2";
 //BA.debugLineNum = 663;BA.debugLine="Dim caroms, make As Int";
_caroms = 0;
_make = 0;
 //BA.debugLineNum = 665;BA.debugLine="caroms = lbl_player_two_100.Text&lbl_player_two_1";
_caroms = (int)(Double.parseDouble(_lbl_player_two_100.getText()+_lbl_player_two_10.getText()+_lbl_player_two_1.getText()));
 //BA.debugLineNum = 666;BA.debugLine="make = lbl_player_two_make_100.text&lbl_player_tw";
_make = (int)(Double.parseDouble(_lbl_player_two_make_100.getText()+_lbl_player_two_make_10.getText()+_lbl_player_two_make_1.getText()));
 //BA.debugLineNum = 668;BA.debugLine="If caroms >= make Then";
if (_caroms>=_make) { 
 //BA.debugLineNum = 669;BA.debugLine="Log($\"Speler 2 wint, geen nabeurt voor speler 1\"";
anywheresoftware.b4a.keywords.Common.Log(("Speler 2 wint, geen nabeurt voor speler 1"));
 };
 //BA.debugLineNum = 671;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 773;BA.debugLine="pn_promote.SetLayoutAnimated(0, x, y, pn_promote.";
parent._pn_promote.SetLayoutAnimated((int) (0),_x,_y,parent._pn_promote.getWidth(),parent._pn_promote.getHeight());
 //BA.debugLineNum = 774;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 776;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _edt_temaken_a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 716;BA.debugLine="Sub edt_temaken_a_TextChanged (Old As String, New";
 //BA.debugLineNum = 717;BA.debugLine="edt_temaken_a.Text =  func.testNumber(Old, New)";
_edt_temaken_a.setText(_func._testnumber /*String*/ (_old,_new));
 //BA.debugLineNum = 718;BA.debugLine="edt_temaken_a.SetSelection(edt_temaken_a.Text.Len";
_edt_temaken_a.SetSelection(_edt_temaken_a.getText().length(),_edt_temaken_a.getText().length());
 //BA.debugLineNum = 720;BA.debugLine="End Sub";
return "";
}
public static String  _edt_temaken_b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 722;BA.debugLine="Sub edt_temaken_b_TextChanged (Old As String, New";
 //BA.debugLineNum = 723;BA.debugLine="edt_temaken_b.Text =  func.testNumber(Old, New)";
_edt_temaken_b.setText(_func._testnumber /*String*/ (_old,_new));
 //BA.debugLineNum = 724;BA.debugLine="edt_temaken_b.SetSelection(edt_temaken_b.Text.Len";
_edt_temaken_b.SetSelection(_edt_temaken_b.getText().length(),_edt_temaken_b.getText().length());
 //BA.debugLineNum = 725;BA.debugLine="End Sub";
return "";
}
public static String  _getrandomimage() throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub getRandomImage";
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return "";
}
public static void  _iets() throws Exception{
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
 //BA.debugLineNum = 677;BA.debugLine="Dim dlg As B4XDialog";
_dlg = new b4j.example.b4xdialog();
 //BA.debugLineNum = 678;BA.debugLine="dlg.Initialize (Base)";
_dlg._initialize /*String*/ (ba,parent._base);
 //BA.debugLineNum = 679;BA.debugLine="Dim p As B4XView = XUI.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
 //BA.debugLineNum = 680;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 600dip)";
_p.SetLayoutAnimated((int) (0),0,0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (600)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (600)));
 //BA.debugLineNum = 681;BA.debugLine="p.LoadLayout(\"players\")";
_p.LoadLayout("players",ba);
 //BA.debugLineNum = 682;BA.debugLine="dlg.Title = \"Spelers Invoer\"";
_dlg._title /*Object*/  = (Object)("Spelers Invoer");
 //BA.debugLineNum = 683;BA.debugLine="dlg.PutAtTop = True 'put the dialog at the top of";
_dlg._putattop /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 684;BA.debugLine="Wait For (dlg.ShowCustom(p, \"OK\", \"\", \"CANCEL\"))";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _dlg._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_p,(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (int) result[0];
;
 //BA.debugLineNum = 685;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 688;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(int _result) throws Exception{
}
public static String  _initpanels() throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub initPanels";
 //BA.debugLineNum = 154;BA.debugLine="pNieuwePartijDialog.Initialize (Base)";
_pnieuwepartijdialog._initialize /*String*/ (ba,_base);
 //BA.debugLineNum = 155;BA.debugLine="pNieuwePartij = XUI.CreatePanel(\"\")";
_pnieuwepartij = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 156;BA.debugLine="pNieuwePartij.SetLayoutAnimated(0, 100dip, 0, 100";
_pnieuwepartij.SetLayoutAnimated((int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1000)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (800)));
 //BA.debugLineNum = 157;BA.debugLine="pNieuwePartij.LoadLayout(\"nieuwe_partij\")";
_pnieuwepartij.LoadLayout("nieuwe_partij",ba);
 //BA.debugLineNum = 158;BA.debugLine="pNieuwePartijDialog.Title = \"Nieuwe Partij\"";
_pnieuwepartijdialog._title /*Object*/  = (Object)("Nieuwe Partij");
 //BA.debugLineNum = 159;BA.debugLine="pNieuwePartijDialog.PutAtTop = False 'put the dia";
_pnieuwepartijdialog._putattop /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 161;BA.debugLine="pn_promote_top = 1130 'pn_promote.Top";
_pn_promote_top = 1130;
 //BA.debugLineNum = 162;BA.debugLine="pn_promote_left = 20 'pn_promote.Left";
_pn_promote_left = 20;
 //BA.debugLineNum = 166;BA.debugLine="inactivecls.frm = frm";
_inactivecls._frm /*anywheresoftware.b4j.objects.Form*/  = _frm;
 //BA.debugLineNum = 167;BA.debugLine="inactivecls.pn_promote = pn_promote";
_inactivecls._pn_promote /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/  = _pn_promote;
 //BA.debugLineNum = 168;BA.debugLine="inactivecls.pnlWidth = pn_promote.Width";
_inactivecls._pnlwidth /*double*/  = _pn_promote.getWidth();
 //BA.debugLineNum = 169;BA.debugLine="inactivecls.pnlHeight = pn_promote.Height";
_inactivecls._pnlheight /*double*/  = _pn_promote.getHeight();
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return "";
}
public static String  _lastclick() throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Sub lastClick";
 //BA.debugLineNum = 270;BA.debugLine="inactivecls.lastClick = DateTime.Now";
_inactivecls._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_close_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 763;BA.debugLine="Sub lbl_close_MouseReleased (EventData As MouseEve";
 //BA.debugLineNum = 764;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 765;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_innings_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
int _points = 0;
 //BA.debugLineNum = 348;BA.debugLine="Sub lbl_innings_MouseReleased (EventData As MouseE";
 //BA.debugLineNum = 349;BA.debugLine="Dim points As Int = lbl_innings.Text";
_points = (int)(Double.parseDouble(_lbl_innings.getText()));
 //BA.debugLineNum = 350;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
 //BA.debugLineNum = 351;BA.debugLine="points = points + 1";
_points = (int) (_points+1);
 }else {
 //BA.debugLineNum = 353;BA.debugLine="points = points - 1";
_points = (int) (_points-1);
 };
 //BA.debugLineNum = 355;BA.debugLine="If points = -1 Then";
if (_points==-1) { 
 //BA.debugLineNum = 356;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 359;BA.debugLine="func.innigs = points";
_func._innigs /*int*/  = _points;
 //BA.debugLineNum = 360;BA.debugLine="lbl_innings.Text = func.padString(points, \"0\", 0,";
_lbl_innings.setText(_func._padstring /*String*/ (BA.NumberToString(_points),"0",(int) (0),(int) (3)));
 //BA.debugLineNum = 361;BA.debugLine="func.calcMoyenne(lbl_player_one_moyenne, lbl_play";
_func._calcmoyenne /*String*/ (_lbl_player_one_moyenne,_lbl_player_two_moyenne);
 //BA.debugLineNum = 362;BA.debugLine="func.processHs(\"all\")";
_func._processhs /*String*/ ("all");
 //BA.debugLineNum = 363;BA.debugLine="func.inngSet = 1";
_func._inngset /*int*/  = (int) (1);
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_1_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 401;BA.debugLine="Sub lbl_player_one_1_MouseEntered (EventData As Mo";
 //BA.debugLineNum = 404;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_1_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub lbl_player_one_1_MouseReleased (EventData As M";
 //BA.debugLineNum = 274;BA.debugLine="setP1Name";
_setp1name();
 //BA.debugLineNum = 275;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
 //BA.debugLineNum = 276;BA.debugLine="func.calcScorePlayerOne(1)";
_func._calcscoreplayerone /*String*/ ((int) (1));
 }else if(_eventdata.getSecondaryButtonPressed()) { 
 //BA.debugLineNum = 278;BA.debugLine="func.calcScorePlayerOne(-1)";
_func._calcscoreplayerone /*String*/ ((int) (-1));
 };
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_10_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Sub lbl_player_one_10_MouseReleased (EventData As";
 //BA.debugLineNum = 284;BA.debugLine="setP1Name";
_setp1name();
 //BA.debugLineNum = 285;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
 //BA.debugLineNum = 286;BA.debugLine="func.calcScorePlayerOne(10)";
_func._calcscoreplayerone /*String*/ ((int) (10));
 }else if(_eventdata.getSecondaryButtonPressed()) { 
 //BA.debugLineNum = 288;BA.debugLine="func.calcScorePlayerOne(-10)";
_func._calcscoreplayerone /*String*/ ((int) (-10));
 };
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_100_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 291;BA.debugLine="Sub lbl_player_one_100_MouseReleased (EventData As";
 //BA.debugLineNum = 292;BA.debugLine="setP1Name";
_setp1name();
 //BA.debugLineNum = 293;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
 //BA.debugLineNum = 294;BA.debugLine="func.calcScorePlayerOne(100)";
_func._calcscoreplayerone /*String*/ ((int) (100));
 }else if(_eventdata.getSecondaryButtonPressed()) { 
 //BA.debugLineNum = 296;BA.debugLine="func.calcScorePlayerOne(-100)";
_func._calcscoreplayerone /*String*/ ((int) (-100));
 };
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_active_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Sub lbl_player_one_active_MouseReleased (EventData";
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_make_1_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 502;BA.debugLine="Sub lbl_player_one_make_1_MouseReleased (EventData";
 //BA.debugLineNum = 503;BA.debugLine="setP1Name";
_setp1name();
 //BA.debugLineNum = 504;BA.debugLine="func.playerOneMake(lbl_player_one_make_100, lbl_p";
_func._playeronemake /*String*/ (_lbl_player_one_make_100,_lbl_player_one_make_10,_lbl_player_one_make_1,_eventdata.getPrimaryButtonPressed(),(int) (1));
 //BA.debugLineNum = 505;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_make_10_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 496;BA.debugLine="Sub lbl_player_one_make_10_MouseReleased (EventDat";
 //BA.debugLineNum = 497;BA.debugLine="setP1Name";
_setp1name();
 //BA.debugLineNum = 498;BA.debugLine="func.playerOneMake(lbl_player_one_make_100, lbl_p";
_func._playeronemake /*String*/ (_lbl_player_one_make_100,_lbl_player_one_make_10,_lbl_player_one_make_1,_eventdata.getPrimaryButtonPressed(),(int) (10));
 //BA.debugLineNum = 500;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_make_100_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 491;BA.debugLine="Sub lbl_player_one_make_100_MouseReleased (EventDa";
 //BA.debugLineNum = 492;BA.debugLine="setP1Name";
_setp1name();
 //BA.debugLineNum = 493;BA.debugLine="func.playerOneMake(lbl_player_one_make_100, lbl_p";
_func._playeronemake /*String*/ (_lbl_player_one_make_100,_lbl_player_one_make_10,_lbl_player_one_make_1,_eventdata.getPrimaryButtonPressed(),(int) (100));
 //BA.debugLineNum = 494;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_name_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 455;BA.debugLine="Sub lbl_player_one_name_MouseReleased (EventData A";
 //BA.debugLineNum = 456;BA.debugLine="setP1Name";
_setp1name();
 //BA.debugLineNum = 457;BA.debugLine="func.processHs(\"all\")";
_func._processhs /*String*/ ("all");
 //BA.debugLineNum = 459;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_1_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 434;BA.debugLine="Sub lbl_player_two_1_MouseEntered (EventData As Mo";
 //BA.debugLineNum = 439;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_1_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 441;BA.debugLine="Sub lbl_player_two_1_MouseExited (EventData As Mou";
 //BA.debugLineNum = 445;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_1_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Sub lbl_player_two_1_MouseReleased (EventData As M";
 //BA.debugLineNum = 309;BA.debugLine="setP2Name";
_setp2name();
 //BA.debugLineNum = 310;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
 //BA.debugLineNum = 311;BA.debugLine="func.calcScorePlayertwo(1)";
_func._calcscoreplayertwo /*String*/ ((int) (1));
 }else if(_eventdata.getSecondaryButtonPressed()) { 
 //BA.debugLineNum = 313;BA.debugLine="func.calcScorePlayertwo(-1)";
_func._calcscoreplayertwo /*String*/ ((int) (-1));
 };
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_10_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 316;BA.debugLine="Sub lbl_player_two_10_MouseReleased (EventData As";
 //BA.debugLineNum = 317;BA.debugLine="setP2Name";
_setp2name();
 //BA.debugLineNum = 318;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
 //BA.debugLineNum = 319;BA.debugLine="func.calcScorePlayertwo(10)";
_func._calcscoreplayertwo /*String*/ ((int) (10));
 }else if(_eventdata.getSecondaryButtonPressed()) { 
 //BA.debugLineNum = 321;BA.debugLine="func.calcScorePlayertwo(-10)";
_func._calcscoreplayertwo /*String*/ ((int) (-10));
 };
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_100_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 324;BA.debugLine="Sub lbl_player_two_100_MouseReleased (EventData As";
 //BA.debugLineNum = 325;BA.debugLine="setP2Name";
_setp2name();
 //BA.debugLineNum = 326;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
 //BA.debugLineNum = 327;BA.debugLine="func.calcScorePlayertwo(100)";
_func._calcscoreplayertwo /*String*/ ((int) (100));
 }else if(_eventdata.getSecondaryButtonPressed()) { 
 //BA.debugLineNum = 329;BA.debugLine="func.calcScorePlayertwo(-100)";
_func._calcscoreplayertwo /*String*/ ((int) (-100));
 };
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_make_1_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 540;BA.debugLine="Sub lbl_player_two_make_1_MouseReleased (EventData";
 //BA.debugLineNum = 541;BA.debugLine="func.playertwoMake(lbl_player_two_make_100, lbl_p";
_func._playertwomake /*String*/ (_lbl_player_two_make_100,_lbl_player_two_make_10,_lbl_player_two_make_1,_eventdata.getPrimaryButtonPressed(),(int) (1));
 //BA.debugLineNum = 542;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_make_10_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 528;BA.debugLine="Sub lbl_player_two_make_10_MouseReleased (EventDat";
 //BA.debugLineNum = 529;BA.debugLine="func.playertwoMake(lbl_player_two_make_100, lbl_p";
_func._playertwomake /*String*/ (_lbl_player_two_make_100,_lbl_player_two_make_10,_lbl_player_two_make_1,_eventdata.getPrimaryButtonPressed(),(int) (10));
 //BA.debugLineNum = 530;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_make_100_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 515;BA.debugLine="Sub lbl_player_two_make_100_MouseReleased (EventDa";
 //BA.debugLineNum = 517;BA.debugLine="func.playertwoMake(lbl_player_two_make_100, lbl_p";
_func._playertwomake /*String*/ (_lbl_player_two_make_100,_lbl_player_two_make_10,_lbl_player_two_make_1,_eventdata.getPrimaryButtonPressed(),(int) (100));
 //BA.debugLineNum = 518;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub lbl_player_two_MouseReleased (EventData As Mou";
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_name_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 461;BA.debugLine="Sub lbl_player_two_name_MouseReleased (EventData A";
 //BA.debugLineNum = 462;BA.debugLine="setP2Name";
_setp2name();
 //BA.debugLineNum = 463;BA.debugLine="func.processHs(\"all\")";
_func._processhs /*String*/ ("all");
 //BA.debugLineNum = 464;BA.debugLine="func.inngSet = 0";
_func._inngset /*int*/  = (int) (0);
 //BA.debugLineNum = 465;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_reset_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 728;BA.debugLine="Sub lbl_reset_MouseEntered (EventData As MouseEven";
 //BA.debugLineNum = 729;BA.debugLine="lbl_reset.Color =  0xFF69D79A";
_lbl_reset.setColor((int) (0xff69d79a));
 //BA.debugLineNum = 730;BA.debugLine="lbl_reset.TextColor = 0xFFFFFF00";
_lbl_reset.setTextColor((int) (0xffffff00));
 //BA.debugLineNum = 731;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_reset_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 733;BA.debugLine="Sub lbl_reset_MouseExited (EventData As MouseEvent";
 //BA.debugLineNum = 734;BA.debugLine="lbl_reset.Color = 0xFFFF0000";
_lbl_reset.setColor((int) (0xffff0000));
 //BA.debugLineNum = 735;BA.debugLine="lbl_reset.TextColor = 0xFFFFFFFF";
_lbl_reset.setTextColor((int) (0xffffffff));
 //BA.debugLineNum = 736;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_reset_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 738;BA.debugLine="Sub lbl_reset_MouseReleased (EventData As MouseEve";
 //BA.debugLineNum = 739;BA.debugLine="inactivecls.lastClick = DateTime.Now";
_inactivecls._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 740;BA.debugLine="nieuwePartij";
_nieuwepartij();
 //BA.debugLineNum = 743;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _lstplayeronescorelbl() throws Exception{
anywheresoftware.b4a.objects.collections.List _list = null;
 //BA.debugLineNum = 252;BA.debugLine="Sub lstPlayerOneScoreLbl As List";
 //BA.debugLineNum = 253;BA.debugLine="Dim List As List";
_list = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 254;BA.debugLine="List.Initialize";
_list.Initialize();
 //BA.debugLineNum = 255;BA.debugLine="List.AddAll(Array As Object(lbl_player_one_1, lbl";
_list.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_lbl_player_one_1.getObject()),(Object)(_lbl_player_one_10.getObject()),(Object)(_lbl_player_one_100.getObject()),(Object)(_lbl_player_one_moyenne.getObject()),(Object)(_b4xprogressbarp1)}));
 //BA.debugLineNum = 256;BA.debugLine="Return List";
if (true) return _list;
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _lstplayertwoscorelbl() throws Exception{
anywheresoftware.b4a.objects.collections.List _list = null;
 //BA.debugLineNum = 259;BA.debugLine="Sub lstPlayerTwoScoreLbl As List";
 //BA.debugLineNum = 260;BA.debugLine="Dim List As List";
_list = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 261;BA.debugLine="List.Initialize";
_list.Initialize();
 //BA.debugLineNum = 262;BA.debugLine="List.AddAll(Array As Object(lbl_player_two_1, lbl";
_list.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_lbl_player_two_1.getObject()),(Object)(_lbl_player_two_10.getObject()),(Object)(_lbl_player_two_100.getObject()),(Object)(_lbl_player_two_moyenne.getObject()),(Object)(_b4xprogressbarp2)}));
 //BA.debugLineNum = 263;BA.debugLine="Return List";
if (true) return _list;
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public static String  _mainform_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 826;BA.debugLine="Sub MainForm_MouseClicked (EventData As MouseEvent";
 //BA.debugLineNum = 827;BA.debugLine="If inactivecls.tmr_draw_promote.Enabled = True Th";
if (_inactivecls._tmr_draw_promote /*anywheresoftware.b4a.objects.Timer*/ .getEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 828;BA.debugLine="pn_promote.Top = pn_promote_top";
_pn_promote.setTop(_pn_promote_top);
 //BA.debugLineNum = 829;BA.debugLine="pn_promote_left = pn_promote_left";
_pn_promote_left = _pn_promote_left;
 //BA.debugLineNum = 831;BA.debugLine="inactivecls.lastClick = DateTime.Now";
_inactivecls._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 832;BA.debugLine="inactivecls.enableTime(True)";
_inactivecls._enabletime /*String*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 833;BA.debugLine="inactivecls.enablePromote(False)";
_inactivecls._enablepromote /*String*/ (anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 835;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 800;BA.debugLine="If promoteRunning = True Then";
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
 //BA.debugLineNum = 801;BA.debugLine="pn_promote.Top = pn_promote_top";
parent._pn_promote.setTop(parent._pn_promote_top);
 //BA.debugLineNum = 802;BA.debugLine="pn_promote.left = pn_promote_left";
parent._pn_promote.setLeft(parent._pn_promote_left);
 //BA.debugLineNum = 803;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (0));
this.state = 5;
return;
case 5:
//C
this.state = 4;
;
 //BA.debugLineNum = 804;BA.debugLine="inactivecls.lastClick = DateTime.Now";
parent._inactivecls._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 805;BA.debugLine="inactivecls.enableTime(True)";
parent._inactivecls._enabletime /*String*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 806;BA.debugLine="inactivecls.enablePromote(False)";
parent._inactivecls._enablepromote /*String*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 807;BA.debugLine="promoteRunning = False";
parent._promoterunning = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 809;BA.debugLine="Sleep(300)";
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
 //BA.debugLineNum = 811;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _mouseover(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n1) throws Exception{
 //BA.debugLineNum = 813;BA.debugLine="private Sub MouseOver(n1 As Node)";
 //BA.debugLineNum = 814;BA.debugLine="setHandler(n1,\"setOnMouseMoved\",\"mouseIn\")";
_sethandler((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_n1.getObject())),"setOnMouseMoved","mouseIn");
 //BA.debugLineNum = 815;BA.debugLine="setHandler(n1,\"setOnMouseExited\",\"mouseOut\")";
_sethandler((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_n1.getObject())),"setOnMouseExited","mouseOut");
 //BA.debugLineNum = 816;BA.debugLine="End Sub";
return "";
}
public static void  _nieuwepartij() throws Exception{
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
 //BA.debugLineNum = 699;BA.debugLine="Wait For (pNieuwePartijDialog.ShowCustom(pNieuweP";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, parent._pnieuwepartijdialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._pnieuwepartij,(Object)(""),(Object)(""),(Object)("")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (int) result[0];
;
 //BA.debugLineNum = 700;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 705;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _playeroneperc(String _perc) throws Exception{
 //BA.debugLineNum = 507;BA.debugLine="Sub playerOnePerc(perc As String)";
 //BA.debugLineNum = 508;BA.debugLine="lbl_player_one_perc.Text = perc";
_lbl_player_one_perc.setText(_perc);
 //BA.debugLineNum = 509;BA.debugLine="End Sub";
return "";
}
public static String  _playertwoperc(String _perc) throws Exception{
 //BA.debugLineNum = 511;BA.debugLine="Sub playerTwoPerc(perc As String)";
 //BA.debugLineNum = 512;BA.debugLine="lbl_player_two_perc.Text = perc";
_lbl_player_two_perc.setText(_perc);
 //BA.debugLineNum = 513;BA.debugLine="End Sub";
return "";
}
public static String  _pn_promote_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 783;BA.debugLine="Sub pn_promote_MouseReleased (EventData As MouseEv";
 //BA.debugLineNum = 784;BA.debugLine="pn_promote.Top = pn_promote_top";
_pn_promote.setTop(_pn_promote_top);
 //BA.debugLineNum = 785;BA.debugLine="pn_promote.left = pn_promote_left";
_pn_promote.setLeft(_pn_promote_left);
 //BA.debugLineNum = 787;BA.debugLine="inactivecls.lastClick = DateTime.Now";
_inactivecls._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 788;BA.debugLine="inactivecls.enableTime(True)";
_inactivecls._enabletime /*String*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 789;BA.debugLine="inactivecls.enablePromote(False)";
_inactivecls._enablepromote /*String*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 790;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 7;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.example.b4xdialog();
 //BA.debugLineNum = 8;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 12;BA.debugLine="Private inactivecls As inactiveClass";
_inactivecls = new b4j.example.inactiveclass();
 //BA.debugLineNum = 13;BA.debugLine="Private clsCheckCfg As classCheckConfig";
_clscheckcfg = new b4j.example.classcheckconfig();
 //BA.debugLineNum = 14;BA.debugLine="Private clsToast As clXToastMessage";
_clstoast = new b4j.example.clxtoastmessage();
 //BA.debugLineNum = 16;BA.debugLine="Private pn_promote_top, pn_promote_left As Double";
_pn_promote_top = 0;
_pn_promote_left = 0;
 //BA.debugLineNum = 17;BA.debugLine="Private promoteRunning As Boolean = False";
_promoterunning = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 18;BA.debugLine="Private pNieuwePartij As B4XView";
_pnieuwepartij = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private pNieuwePartijDialog As B4XDialog";
_pnieuwepartijdialog = new b4j.example.b4xdialog();
 //BA.debugLineNum = 26;BA.debugLine="Private lbl_innings As Label";
_lbl_innings = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private lbl_player_one_moyenne As Label";
_lbl_player_one_moyenne = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private lbl_player_two_moyenne As Label";
_lbl_player_two_moyenne = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private lbl_player_two_100 As Label";
_lbl_player_two_100 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private lbl_player_two_10 As Label";
_lbl_player_two_10 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private lbl_player_two_1 As Label";
_lbl_player_two_1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private btn_exit As B4XView";
_btn_exit = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private lbl_player_one_name As B4XView";
_lbl_player_one_name = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private lbl_player_two_name As B4XView";
_lbl_player_two_name = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private lbl_player_one_perc As Label";
_lbl_player_one_perc = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private lbl_player_one_make_100 As Label";
_lbl_player_one_make_100 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private lbl_player_one_make_10 As Label";
_lbl_player_one_make_10 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private lbl_player_one_make_1 As Label";
_lbl_player_one_make_1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private lbl_player_two_make_100 As Label";
_lbl_player_two_make_100 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private lbl_player_two_make_10 As Label";
_lbl_player_two_make_10 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private lbl_player_two_make_1 As Label";
_lbl_player_two_make_1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private lbl_player_two_perc As Label";
_lbl_player_two_perc = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Private lbl_reset As B4XView";
_lbl_reset = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 49;BA.debugLine="Private jxui As XUI";
_jxui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 50;BA.debugLine="Private lbl_player_one_hs As Label";
_lbl_player_one_hs = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 51;BA.debugLine="Private lbl_player_two_hs As Label";
_lbl_player_two_hs = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Private lbl_clock As B4XView";
_lbl_clock = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Private clsTmr As timerClass";
_clstmr = new b4j.example.timerclass();
 //BA.debugLineNum = 57;BA.debugLine="Private Label7 As Label";
_label7 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 59;BA.debugLine="Private edt_speler_a As TextField";
_edt_speler_a = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 60;BA.debugLine="Private edt_temaken_a As TextField";
_edt_temaken_a = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 61;BA.debugLine="Private edt_speler_b As TextField";
_edt_speler_b = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 62;BA.debugLine="Private edt_temaken_b As TextField";
_edt_temaken_b = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 63;BA.debugLine="Private btn_a_begint As Button";
_btn_a_begint = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 64;BA.debugLine="Private btn_b_begint As Button";
_btn_b_begint = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 69;BA.debugLine="Private B4XProgressBarP1 As B4XProgressBar";
_b4xprogressbarp1 = new b4j.example.b4xprogressbar();
 //BA.debugLineNum = 70;BA.debugLine="Private B4XProgressBarP2 As B4XProgressBar";
_b4xprogressbarp2 = new b4j.example.b4xprogressbar();
 //BA.debugLineNum = 72;BA.debugLine="Private btn_nieuwe_partij As Button";
_btn_nieuwe_partij = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 73;BA.debugLine="Private btn_annuleer_nieuwe_partij As Button";
_btn_annuleer_nieuwe_partij = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 77;BA.debugLine="Private Label6 As Label";
_label6 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 78;BA.debugLine="Private lbl_close As B4XView";
_lbl_close = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 79;BA.debugLine="Private chk_add_player As CheckBox";
_chk_add_player = new anywheresoftware.b4j.objects.CheckboxWrapper();
 //BA.debugLineNum = 80;BA.debugLine="Private img_random As ImageView";
_img_random = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 83;BA.debugLine="Private pn_p1_carom As Pane";
_pn_p1_carom = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 85;BA.debugLine="Private pn_promote As Pane";
_pn_promote = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 86;BA.debugLine="Private lbl_config_update As Label";
_lbl_config_update = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 89;BA.debugLine="Private lbl_player_one_1 As Label";
_lbl_player_one_1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 90;BA.debugLine="Private lbl_player_one_10 As Label";
_lbl_player_one_10 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 91;BA.debugLine="Private lbl_player_one_100 As Label";
_lbl_player_one_100 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public static void  _resetboard(boolean _bordstart) throws Exception{
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
 //BA.debugLineNum = 565;BA.debugLine="If bordStart Then";
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
 //BA.debugLineNum = 567;BA.debugLine="Dim sf As Object = jxui.Msgbox2Async(\"Bord reset";
_sf = parent._jxui.Msgbox2Async(ba,"Bord resetten?","","Ja","","Nee",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 568;BA.debugLine="Wait For (sf) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, this, _sf);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_result = (int) result[0];
;
 //BA.debugLineNum = 569;BA.debugLine="If Result = jxui.DialogResponse_Negative Then";
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
 //BA.debugLineNum = 570;BA.debugLine="Return";
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
 //BA.debugLineNum = 577;BA.debugLine="setCaromNumber(lbl_player_one_1, \"0\")";
_setcaromnumber((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._lbl_player_one_1.getObject())),"0");
 //BA.debugLineNum = 579;BA.debugLine="setCaromNumber(lbl_player_one_10, \"0\")";
_setcaromnumber((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._lbl_player_one_10.getObject())),"0");
 //BA.debugLineNum = 581;BA.debugLine="setCaromNumber(lbl_player_one_100, \"0\")";
_setcaromnumber((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._lbl_player_one_100.getObject())),"0");
 //BA.debugLineNum = 584;BA.debugLine="lbl_player_one_1.Text = \"0\"";
parent._lbl_player_one_1.setText("0");
 //BA.debugLineNum = 585;BA.debugLine="lbl_player_one_make_100.Text = \"0\"";
parent._lbl_player_one_make_100.setText("0");
 //BA.debugLineNum = 586;BA.debugLine="lbl_player_one_make_10.Text = \"0\"";
parent._lbl_player_one_make_10.setText("0");
 //BA.debugLineNum = 587;BA.debugLine="lbl_player_one_make_1.Text = \"0\"";
parent._lbl_player_one_make_1.setText("0");
 //BA.debugLineNum = 588;BA.debugLine="lbl_player_one_moyenne.Text = \"0.000\"";
parent._lbl_player_one_moyenne.setText("0.000");
 //BA.debugLineNum = 589;BA.debugLine="lbl_player_one_perc.Text = \"0.00%\"";
parent._lbl_player_one_perc.setText("0.00%");
 //BA.debugLineNum = 591;BA.debugLine="lbl_innings.Text = \"000\"";
parent._lbl_innings.setText("000");
 //BA.debugLineNum = 594;BA.debugLine="lbl_player_two_100.Text = \"0\"";
parent._lbl_player_two_100.setText("0");
 //BA.debugLineNum = 595;BA.debugLine="lbl_player_two_10.Text = \"0\"";
parent._lbl_player_two_10.setText("0");
 //BA.debugLineNum = 596;BA.debugLine="lbl_player_two_1.Text = \"0\"";
parent._lbl_player_two_1.setText("0");
 //BA.debugLineNum = 597;BA.debugLine="lbl_player_two_make_100.Text = \"0\"";
parent._lbl_player_two_make_100.setText("0");
 //BA.debugLineNum = 598;BA.debugLine="lbl_player_two_make_10.Text = \"0\"";
parent._lbl_player_two_make_10.setText("0");
 //BA.debugLineNum = 599;BA.debugLine="lbl_player_two_make_1.Text = \"0\"";
parent._lbl_player_two_make_1.setText("0");
 //BA.debugLineNum = 600;BA.debugLine="lbl_player_two_perc.Text = \"0.00%\"";
parent._lbl_player_two_perc.setText("0.00%");
 //BA.debugLineNum = 601;BA.debugLine="lbl_player_two_moyenne.Text = \"0.000\"";
parent._lbl_player_two_moyenne.setText("0.000");
 //BA.debugLineNum = 602;BA.debugLine="lbl_player_one_hs.Text = \"000\"";
parent._lbl_player_one_hs.setText("000");
 //BA.debugLineNum = 603;BA.debugLine="lbl_player_two_hs.Text = \"000\"";
parent._lbl_player_two_hs.setText("000");
 //BA.debugLineNum = 605;BA.debugLine="func.inngSet = 0";
parent._func._inngset /*int*/  = (int) (0);
 //BA.debugLineNum = 606;BA.debugLine="func.innigs = 0";
parent._func._innigs /*int*/  = (int) (0);
 //BA.debugLineNum = 607;BA.debugLine="func.scorePlayerOne = 0";
parent._func._scoreplayerone /*int*/  = (int) (0);
 //BA.debugLineNum = 608;BA.debugLine="func.scorePlayerTwo = 0";
parent._func._scoreplayertwo /*int*/  = (int) (0);
 //BA.debugLineNum = 609;BA.debugLine="func.playerOneToMake = 0";
parent._func._playeronetomake /*int*/  = (int) (0);
 //BA.debugLineNum = 610;BA.debugLine="func.playertwoToMake = 0";
parent._func._playertwotomake /*int*/  = (int) (0);
 //BA.debugLineNum = 611;BA.debugLine="func.playerOneHs = 0";
parent._func._playeronehs /*int*/  = (int) (0);
 //BA.debugLineNum = 612;BA.debugLine="func.playerTwoHs = 0";
parent._func._playertwohs /*int*/  = (int) (0);
 //BA.debugLineNum = 613;BA.debugLine="func.p1HsTemp = 0";
parent._func._p1hstemp /*int*/  = (int) (0);
 //BA.debugLineNum = 614;BA.debugLine="func.p2HsTemp = 0";
parent._func._p2hstemp /*int*/  = (int) (0);
 //BA.debugLineNum = 615;BA.debugLine="B4XProgressBarP1.Progress = 0";
parent._b4xprogressbarp1._setprogress /*float*/ ((float) (0));
 //BA.debugLineNum = 616;BA.debugLine="B4XProgressBarP2.Progress = 0";
parent._b4xprogressbarp2._setprogress /*float*/ ((float) (0));
 //BA.debugLineNum = 617;BA.debugLine="setP1Name";
_setp1name();
 //BA.debugLineNum = 619;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _msgbox_result(int _result) throws Exception{
}
public static String  _setcaromnumber(anywheresoftware.b4a.objects.B4XViewWrapper _v,String _value) throws Exception{
 //BA.debugLineNum = 555;BA.debugLine="Sub setCaromNumber(v As B4XView, value As String)";
 //BA.debugLineNum = 558;BA.debugLine="v.Color = 0x00FFFFFF";
_v.setColor((int) (0x00ffffff));
 //BA.debugLineNum = 559;BA.debugLine="v.Text = value";
_v.setText(_value);
 //BA.debugLineNum = 562;BA.debugLine="End Sub";
return "";
}
public static String  _setfontsize() throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub setFontSize";
 //BA.debugLineNum = 207;BA.debugLine="func.caromLabelCss(lbl_innings, \"labelCarom\")";
_func._caromlabelcss /*String*/ (_lbl_innings,"labelCarom");
 //BA.debugLineNum = 209;BA.debugLine="func.caromLabelCss(lbl_player_one_hs, \"labelWhite";
_func._caromlabelcss /*String*/ (_lbl_player_one_hs,"labelWhite");
 //BA.debugLineNum = 210;BA.debugLine="func.caromLabelCss(lbl_player_one_moyenne, \"label";
_func._caromlabelcss /*String*/ (_lbl_player_one_moyenne,"labelWhite");
 //BA.debugLineNum = 211;BA.debugLine="func.caromLabelCss(lbl_player_one_perc, \"labelWhi";
_func._caromlabelcss /*String*/ (_lbl_player_one_perc,"labelWhite");
 //BA.debugLineNum = 214;BA.debugLine="func.caromLabelCss(lbl_player_one_100, \"labelCaro";
_func._caromlabelcss /*String*/ (_lbl_player_one_100,"labelCarom");
 //BA.debugLineNum = 215;BA.debugLine="func.caromLabelCss(lbl_player_one_10, \"labelCarom";
_func._caromlabelcss /*String*/ (_lbl_player_one_10,"labelCarom");
 //BA.debugLineNum = 216;BA.debugLine="func.caromLabelCss(lbl_player_one_1, \"labelCarom\"";
_func._caromlabelcss /*String*/ (_lbl_player_one_1,"labelCarom");
 //BA.debugLineNum = 219;BA.debugLine="func.caromLabelCss(lbl_player_one_make_100, \"labe";
_func._caromlabelcss /*String*/ (_lbl_player_one_make_100,"labelCarom");
 //BA.debugLineNum = 220;BA.debugLine="func.caromLabelCss(lbl_player_one_make_10, \"label";
_func._caromlabelcss /*String*/ (_lbl_player_one_make_10,"labelCarom");
 //BA.debugLineNum = 221;BA.debugLine="func.caromLabelCss(lbl_player_one_make_1, \"labelC";
_func._caromlabelcss /*String*/ (_lbl_player_one_make_1,"labelCarom");
 //BA.debugLineNum = 223;BA.debugLine="func.caromLabelCss(lbl_player_two_hs, \"labelWhite";
_func._caromlabelcss /*String*/ (_lbl_player_two_hs,"labelWhite");
 //BA.debugLineNum = 224;BA.debugLine="func.caromLabelCss(lbl_player_two_moyenne, \"label";
_func._caromlabelcss /*String*/ (_lbl_player_two_moyenne,"labelWhite");
 //BA.debugLineNum = 225;BA.debugLine="func.caromLabelCss(lbl_player_two_perc, \"labelWhi";
_func._caromlabelcss /*String*/ (_lbl_player_two_perc,"labelWhite");
 //BA.debugLineNum = 227;BA.debugLine="func.caromLabelCss(lbl_player_two_100, \"labelCaro";
_func._caromlabelcss /*String*/ (_lbl_player_two_100,"labelCarom");
 //BA.debugLineNum = 228;BA.debugLine="func.caromLabelCss(lbl_player_two_10, \"labelCarom";
_func._caromlabelcss /*String*/ (_lbl_player_two_10,"labelCarom");
 //BA.debugLineNum = 229;BA.debugLine="func.caromLabelCss(lbl_player_two_1, \"labelCarom\"";
_func._caromlabelcss /*String*/ (_lbl_player_two_1,"labelCarom");
 //BA.debugLineNum = 231;BA.debugLine="func.caromLabelCss(lbl_player_two_make_100, \"labe";
_func._caromlabelcss /*String*/ (_lbl_player_two_make_100,"labelCarom");
 //BA.debugLineNum = 232;BA.debugLine="func.caromLabelCss(lbl_player_two_make_10, \"label";
_func._caromlabelcss /*String*/ (_lbl_player_two_make_10,"labelCarom");
 //BA.debugLineNum = 233;BA.debugLine="func.caromLabelCss(lbl_player_two_make_1, \"labelC";
_func._caromlabelcss /*String*/ (_lbl_player_two_make_1,"labelCarom");
 //BA.debugLineNum = 236;BA.debugLine="resetBoard(False)";
_resetboard(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return "";
}
public static String  _sethandler(anywheresoftware.b4j.object.JavaObject _ob,String _eventname,String _handlername) throws Exception{
 //BA.debugLineNum = 818;BA.debugLine="private Sub setHandler(ob As JavaObject,eventName";
 //BA.debugLineNum = 819;BA.debugLine="ob.RunMethod(eventName, Array(ob.CreateEventFromU";
_ob.RunMethod(_eventname,new Object[]{_ob.CreateEventFromUI(ba,"javafx.event.EventHandler",_handlername,(Object)(anywheresoftware.b4a.keywords.Common.True))});
 //BA.debugLineNum = 820;BA.debugLine="End Sub";
return "";
}
public static String  _setp1name() throws Exception{
 //BA.debugLineNum = 622;BA.debugLine="Sub setP1Name";
 //BA.debugLineNum = 623;BA.debugLine="lbl_player_one_name.Color = 0xff3455db'0xFF69D79A";
_lbl_player_one_name.setColor((int) (0xff3455db));
 //BA.debugLineNum = 624;BA.debugLine="lbl_player_two_name.Color = 0xFF001A01";
_lbl_player_two_name.setColor((int) (0xff001a01));
 //BA.debugLineNum = 633;BA.debugLine="End Sub";
return "";
}
public static String  _setp2name() throws Exception{
 //BA.debugLineNum = 635;BA.debugLine="Sub setP2Name";
 //BA.debugLineNum = 636;BA.debugLine="lbl_player_two_name.Color = 0xff3455db'0xFF69D79A";
_lbl_player_two_name.setColor((int) (0xff3455db));
 //BA.debugLineNum = 637;BA.debugLine="lbl_player_one_name.Color = 0xFF001A01";
_lbl_player_one_name.setColor((int) (0xff001a01));
 //BA.debugLineNum = 646;BA.debugLine="End Sub";
return "";
}
public static String  _setpromoterunning(boolean _running) throws Exception{
 //BA.debugLineNum = 794;BA.debugLine="Sub setPromoteRunning(running As Boolean)";
 //BA.debugLineNum = 795;BA.debugLine="promoteRunning = running";
_promoterunning = _running;
 //BA.debugLineNum = 796;BA.debugLine="Log(\"Promote Running \" & promoteRunning)";
anywheresoftware.b4a.keywords.Common.Log("Promote Running "+BA.ObjectToString(_promoterunning));
 //BA.debugLineNum = 797;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 99;BA.debugLine="frm.Initialize(\"frm\", 1920, 1080)";
parent._frm.Initialize(ba,"frm",1920,1080);
 //BA.debugLineNum = 100;BA.debugLine="frm.RootPane.LoadLayout(\"scorebord\")";
parent._frm.getRootPane().LoadLayout(ba,"scorebord");
 //BA.debugLineNum = 101;BA.debugLine="frm.Stylesheets.Add(File.GetUri(File.DirAssets, \"";
parent._frm.getStylesheets().Add((Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"n205.css")));
 //BA.debugLineNum = 102;BA.debugLine="setFontSize";
_setfontsize();
 //BA.debugLineNum = 106;BA.debugLine="frm.SetFormStyle(\"UNDECORATED\")";
parent._frm.SetFormStyle("UNDECORATED");
 //BA.debugLineNum = 107;BA.debugLine="frm.Resizable = False";
parent._frm.setResizable(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 110;BA.debugLine="frm.Show";
parent._frm.Show();
 //BA.debugLineNum = 111;BA.debugLine="MouseOver(frm.RootPane)";
_mouseover((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(parent._frm.getRootPane().getObject())));
 //BA.debugLineNum = 113;BA.debugLine="Base = frm.RootPane";
parent._base.setObject((java.lang.Object)(parent._frm.getRootPane().getObject()));
 //BA.debugLineNum = 114;BA.debugLine="Dialog.Initialize (Base)";
parent._dialog._initialize /*String*/ (ba,parent._base);
 //BA.debugLineNum = 116;BA.debugLine="func.SetFormCursor(frm, \"mouse.png\")";
parent._func._setformcursor /*String*/ (parent._frm,"mouse.png");
 //BA.debugLineNum = 117;BA.debugLine="parseConfig.pullConfig";
parent._parseconfig._pullconfig /*String*/ ();
 //BA.debugLineNum = 119;BA.debugLine="clsTmr.Initialize(lbl_clock)";
parent._clstmr._initialize /*String*/ (ba,(anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(parent._lbl_clock.getObject())));
 //BA.debugLineNum = 120;BA.debugLine="inactivecls.Initialize";
parent._inactivecls._initialize /*String*/ (ba);
 //BA.debugLineNum = 121;BA.debugLine="clsCheckCfg.Initialize";
parent._clscheckcfg._initialize /*String*/ (ba);
 //BA.debugLineNum = 122;BA.debugLine="clsToast.Initialize(frm.RootPane)";
parent._clstoast._initialize /*String*/ (ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._frm.getRootPane().getObject())));
 //BA.debugLineNum = 125;BA.debugLine="func.lblInnings = lbl_innings";
parent._func._lblinnings /*anywheresoftware.b4j.objects.LabelWrapper*/  = parent._lbl_innings;
 //BA.debugLineNum = 126;BA.debugLine="func.lbl_player_one_hs = lbl_player_one_hs";
parent._func._lbl_player_one_hs /*anywheresoftware.b4j.objects.LabelWrapper*/  = parent._lbl_player_one_hs;
 //BA.debugLineNum = 127;BA.debugLine="func.lbl_player_two_hs = lbl_player_two_hs";
parent._func._lbl_player_two_hs /*anywheresoftware.b4j.objects.LabelWrapper*/  = parent._lbl_player_two_hs;
 //BA.debugLineNum = 133;BA.debugLine="func.setP1CaromLables(lstPlayerOneScoreLbl)";
parent._func._setp1caromlables /*String*/ (_lstplayeronescorelbl());
 //BA.debugLineNum = 134;BA.debugLine="func.setP2CaromLables(lstPlayerTwoScoreLbl)";
parent._func._setp2caromlables /*String*/ (_lstplayertwoscorelbl());
 //BA.debugLineNum = 135;BA.debugLine="Wait For (funcInet.testInet) Complete (result As";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, parent._funcinet._testinet /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (boolean) result[0];
;
 //BA.debugLineNum = 137;BA.debugLine="Log($\"Has internet access is ${result}\"$)";
anywheresoftware.b4a.keywords.Common.Log(("Has internet access is "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_result))+""));
 //BA.debugLineNum = 139;BA.debugLine="If result Then";
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
 //BA.debugLineNum = 140;BA.debugLine="func.hasInternetAccess = True";
parent._func._hasinternetaccess /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 143;BA.debugLine="func.hasInternetAccess = False";
parent._func._hasinternetaccess /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 147;BA.debugLine="initPanels";
_initpanels();
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _showpromote() throws Exception{
 //BA.debugLineNum = 768;BA.debugLine="Sub showPromote";
 //BA.debugLineNum = 769;BA.debugLine="pn_promote.SetLayoutAnimated(0, 50dip, 50dip, pn_";
_pn_promote.SetLayoutAnimated((int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),_pn_promote.getWidth(),_pn_promote.getHeight());
 //BA.debugLineNum = 770;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 838;BA.debugLine="inactivecls.updatePromote";
parent._inactivecls._updatepromote /*String*/ ();
 //BA.debugLineNum = 839;BA.debugLine="lbl_config_update.Visible = True";
parent._lbl_config_update.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 840;BA.debugLine="Sleep(5000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (5000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 841;BA.debugLine="lbl_config_update.Visible = False";
parent._lbl_config_update.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 842;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _usedigitalfont(boolean _usedigital) throws Exception{
int _fscarom = 0;
int _fsmake = 0;
int _fsinnings = 0;
 //BA.debugLineNum = 844;BA.debugLine="Sub useDigitalFont(useDigital As Boolean)";
 //BA.debugLineNum = 845;BA.debugLine="Dim fsCarom, fsMake, fsInnings As Int";
_fscarom = 0;
_fsmake = 0;
_fsinnings = 0;
 //BA.debugLineNum = 847;BA.debugLine="If useDigital Then";
if (_usedigital) { 
 //BA.debugLineNum = 848;BA.debugLine="fsCarom = 350";
_fscarom = (int) (350);
 //BA.debugLineNum = 849;BA.debugLine="fsMake = 250";
_fsmake = (int) (250);
 //BA.debugLineNum = 850;BA.debugLine="fsInnings = 200";
_fsinnings = (int) (200);
 }else {
 //BA.debugLineNum = 852;BA.debugLine="fsCarom = 225";
_fscarom = (int) (225);
 //BA.debugLineNum = 853;BA.debugLine="fsMake = 150";
_fsmake = (int) (150);
 //BA.debugLineNum = 854;BA.debugLine="fsInnings = 200";
_fsinnings = (int) (200);
 };
 //BA.debugLineNum = 859;BA.debugLine="func.setFont(lbl_player_one_1, fsCarom, useDigita";
_func._setfont /*String*/ (_lbl_player_one_1,_fscarom,_usedigital);
 //BA.debugLineNum = 860;BA.debugLine="func.setFont(lbl_player_one_10, fsCarom, useDigit";
_func._setfont /*String*/ (_lbl_player_one_10,_fscarom,_usedigital);
 //BA.debugLineNum = 861;BA.debugLine="func.setFont(lbl_player_one_100, fsCarom, useDigi";
_func._setfont /*String*/ (_lbl_player_one_100,_fscarom,_usedigital);
 //BA.debugLineNum = 862;BA.debugLine="func.setFont(lbl_player_two_1, fsCarom, useDigita";
_func._setfont /*String*/ (_lbl_player_two_1,_fscarom,_usedigital);
 //BA.debugLineNum = 863;BA.debugLine="func.setFont(lbl_player_two_10, fsCarom, useDigit";
_func._setfont /*String*/ (_lbl_player_two_10,_fscarom,_usedigital);
 //BA.debugLineNum = 864;BA.debugLine="func.setFont(lbl_player_two_100, fsCarom, useDigi";
_func._setfont /*String*/ (_lbl_player_two_100,_fscarom,_usedigital);
 //BA.debugLineNum = 865;BA.debugLine="func.setFont(lbl_innings, fsInnings, useDigital)";
_func._setfont /*String*/ (_lbl_innings,_fsinnings,_usedigital);
 //BA.debugLineNum = 866;BA.debugLine="func.setFont(lbl_player_one_make_100, fsMake, use";
_func._setfont /*String*/ (_lbl_player_one_make_100,_fsmake,_usedigital);
 //BA.debugLineNum = 867;BA.debugLine="func.setFont(lbl_player_one_make_10, fsMake, useD";
_func._setfont /*String*/ (_lbl_player_one_make_10,_fsmake,_usedigital);
 //BA.debugLineNum = 868;BA.debugLine="func.setFont(lbl_player_one_make_1, fsMake, useDi";
_func._setfont /*String*/ (_lbl_player_one_make_1,_fsmake,_usedigital);
 //BA.debugLineNum = 869;BA.debugLine="func.setFont(lbl_player_two_make_100,fsMake, useD";
_func._setfont /*String*/ (_lbl_player_two_make_100,_fsmake,_usedigital);
 //BA.debugLineNum = 870;BA.debugLine="func.setFont(lbl_player_two_make_10,fsMake, useDi";
_func._setfont /*String*/ (_lbl_player_two_make_10,_fsmake,_usedigital);
 //BA.debugLineNum = 871;BA.debugLine="func.setFont(lbl_player_two_make_1,fsMake, useDig";
_func._setfont /*String*/ (_lbl_player_two_make_1,_fsmake,_usedigital);
 //BA.debugLineNum = 873;BA.debugLine="End Sub";
return "";
}
}
