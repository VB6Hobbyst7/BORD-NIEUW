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
public static anywheresoftware.b4j.objects.Form _frm = null;
public static b4j.example.inactiveclass _inactivecls = null;
public static b4j.example.classcheckconfig _clscheckcfg = null;
public static b4j.example.clxtoastmessage _clstoast = null;
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
public static b4j.example.funcinet _funcinet = null;
public static b4j.example.getnode _getnode = null;
public static b4j.example.parseconfig _parseconfig = null;
public static b4j.example.httputils2service _httputils2service = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 148;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return false;
}
public static void  _checkmatchwonp1() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 331;BA.debugLine="Dim caroms, make As Int";
_caroms = 0;
_make = 0;
 //BA.debugLineNum = 333;BA.debugLine="caroms = lbl_player_one_100.Text&lbl_player_one_1";
_caroms = (int)(Double.parseDouble(parent._lbl_player_one_100.getText()+parent._lbl_player_one_10.getText()+parent._lbl_player_one_1.getText()));
 //BA.debugLineNum = 334;BA.debugLine="make = lbl_player_one_make_100.text&lbl_player_on";
_make = (int)(Double.parseDouble(parent._lbl_player_one_make_100.getText()+parent._lbl_player_one_make_10.getText()+parent._lbl_player_one_make_1.getText()));
 //BA.debugLineNum = 336;BA.debugLine="If make = 0 Then Return";
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
 //BA.debugLineNum = 338;BA.debugLine="If caroms >= make Then";
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
 //BA.debugLineNum = 339;BA.debugLine="lbl_game_text.Text = $\"Gelijkmakende beurt voor";
parent._lbl_game_text.setText(("Gelijkmakende beurt voor "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._lbl_player_two_name.getText()))+""));
 //BA.debugLineNum = 340;BA.debugLine="pn_game.Top = (frm.RootPane.Height/2)-(pn_game.H";
parent._pn_game.setTop((parent._frm.getRootPane().getHeight()/(double)2)-(parent._pn_game.getHeight()/(double)2));
 //BA.debugLineNum = 341;BA.debugLine="setP2Name";
_setp2name();
 //BA.debugLineNum = 342;BA.debugLine="Sleep(4000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (4000));
this.state = 11;
return;
case 11:
//C
this.state = 10;
;
 //BA.debugLineNum = 343;BA.debugLine="pn_game.Top = 1650";
parent._pn_game.setTop(1650);
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _checkmatchwonp2() throws Exception{
int _caroms = 0;
int _make = 0;
 //BA.debugLineNum = 347;BA.debugLine="Sub checkMatchWonP2";
 //BA.debugLineNum = 348;BA.debugLine="Dim caroms, make As Int";
_caroms = 0;
_make = 0;
 //BA.debugLineNum = 350;BA.debugLine="caroms = lbl_player_two_100.Text&lbl_player_two_1";
_caroms = (int)(Double.parseDouble(_lbl_player_two_100.getText()+_lbl_player_two_10.getText()+_lbl_player_two_1.getText()));
 //BA.debugLineNum = 351;BA.debugLine="make = lbl_player_two_make_100.text&lbl_player_tw";
_make = (int)(Double.parseDouble(_lbl_player_two_make_100.getText()+_lbl_player_two_make_10.getText()+_lbl_player_two_make_1.getText()));
 //BA.debugLineNum = 352;BA.debugLine="If make = 0 Then Return";
if (_make==0) { 
if (true) return "";};
 //BA.debugLineNum = 354;BA.debugLine="If caroms >= make Then";
if (_caroms>=_make) { 
 };
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 408;BA.debugLine="pn_promote.SetLayoutAnimated(0, x, y, pn_promote.";
parent._pn_promote.SetLayoutAnimated((int) (0),_x,_y,parent._pn_promote.getWidth(),parent._pn_promote.getHeight());
 //BA.debugLineNum = 409;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _hideform(boolean _hide) throws Exception{
 //BA.debugLineNum = 367;BA.debugLine="Sub hideForm(hide As Boolean)";
 //BA.debugLineNum = 368;BA.debugLine="frm.rootpane.Visible = hide";
_frm.getRootPane().setVisible(_hide);
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
return "";
}
public static String  _initpanels() throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub initPanels";
 //BA.debugLineNum = 107;BA.debugLine="pn_promote_top = 1130 'pn_promote.Top";
_pn_promote_top = 1130;
 //BA.debugLineNum = 108;BA.debugLine="pn_promote_left = 20 'pn_promote.Left";
_pn_promote_left = 20;
 //BA.debugLineNum = 110;BA.debugLine="inactivecls.frm = frm";
_inactivecls._frm /*anywheresoftware.b4j.objects.Form*/  = _frm;
 //BA.debugLineNum = 111;BA.debugLine="inactivecls.pn_promote = pn_promote";
_inactivecls._pn_promote /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/  = _pn_promote;
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public static String  _lastclick() throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub lastClick";
 //BA.debugLineNum = 167;BA.debugLine="inactivecls.lastClick = DateTime.Now";
_inactivecls._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_close_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 399;BA.debugLine="Sub lbl_close_MouseReleased (EventData As MouseEve";
 //BA.debugLineNum = 400;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 401;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_innings_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
int _points = 0;
 //BA.debugLineNum = 198;BA.debugLine="Sub lbl_innings_MouseReleased (EventData As MouseE";
 //BA.debugLineNum = 199;BA.debugLine="Dim points As Int = lbl_innings.Text";
_points = (int)(Double.parseDouble(_lbl_innings.getText()));
 //BA.debugLineNum = 201;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
 //BA.debugLineNum = 202;BA.debugLine="points = points + 1";
_points = (int) (_points+1);
 }else {
 //BA.debugLineNum = 204;BA.debugLine="points = points - 1";
_points = (int) (_points-1);
 };
 //BA.debugLineNum = 206;BA.debugLine="If points = -1 Then";
if (_points==-1) { 
 //BA.debugLineNum = 207;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 210;BA.debugLine="func.innigs = points";
_func._innigs /*int*/  = _points;
 //BA.debugLineNum = 211;BA.debugLine="lbl_innings.Text = func.padString(points, \"0\", 0,";
_lbl_innings.setText(_func._padstring /*String*/ (BA.NumberToString(_points),"0",(int) (0),(int) (3)));
 //BA.debugLineNum = 212;BA.debugLine="func.calcMoyenne(lbl_player_one_moyenne, lbl_play";
_func._calcmoyenne /*String*/ (_lbl_player_one_moyenne,_lbl_player_two_moyenne);
 //BA.debugLineNum = 213;BA.debugLine="func.processHs(\"all\")";
_func._processhs /*String*/ ("all");
 //BA.debugLineNum = 214;BA.debugLine="func.inngSet = 1";
_func._inngset /*int*/  = (int) (1);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_1_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Sub lbl_player_one_1_MouseReleased (EventData As M";
 //BA.debugLineNum = 171;BA.debugLine="setP1Name";
_setp1name();
 //BA.debugLineNum = 172;BA.debugLine="func.calcScorePlayerOne(1, EventData.PrimaryButto";
_func._calcscoreplayerone /*String*/ ((int) (1),_eventdata.getPrimaryButtonPressed());
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_10_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub lbl_player_one_10_MouseReleased (EventData As";
 //BA.debugLineNum = 177;BA.debugLine="setP1Name";
_setp1name();
 //BA.debugLineNum = 178;BA.debugLine="func.calcScorePlayerOne(10, EventData.PrimaryButt";
_func._calcscoreplayerone /*String*/ ((int) (10),_eventdata.getPrimaryButtonPressed());
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_100_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub lbl_player_one_100_MouseReleased (EventData As";
 //BA.debugLineNum = 181;BA.debugLine="setP1Name";
_setp1name();
 //BA.debugLineNum = 182;BA.debugLine="func.calcScorePlayerOne(100, EventData.PrimaryBut";
_func._calcscoreplayerone /*String*/ ((int) (100),_eventdata.getPrimaryButtonPressed());
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_make_1_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 239;BA.debugLine="Sub lbl_player_one_make_1_MouseReleased (EventData";
 //BA.debugLineNum = 240;BA.debugLine="setP1Name";
_setp1name();
 //BA.debugLineNum = 241;BA.debugLine="func.playerOneMake(lbl_player_one_make_100, lbl_p";
_func._playeronemake /*String*/ (_lbl_player_one_make_100,_lbl_player_one_make_10,_lbl_player_one_make_1,_eventdata.getPrimaryButtonPressed(),(int) (1));
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_make_10_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Sub lbl_player_one_make_10_MouseReleased (EventDat";
 //BA.debugLineNum = 234;BA.debugLine="setP1Name";
_setp1name();
 //BA.debugLineNum = 235;BA.debugLine="func.playerOneMake(lbl_player_one_make_100, lbl_p";
_func._playeronemake /*String*/ (_lbl_player_one_make_100,_lbl_player_one_make_10,_lbl_player_one_make_1,_eventdata.getPrimaryButtonPressed(),(int) (10));
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_make_100_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Sub lbl_player_one_make_100_MouseReleased (EventDa";
 //BA.debugLineNum = 229;BA.debugLine="setP1Name";
_setp1name();
 //BA.debugLineNum = 230;BA.debugLine="func.playerOneMake(lbl_player_one_make_100, lbl_p";
_func._playeronemake /*String*/ (_lbl_player_one_make_100,_lbl_player_one_make_10,_lbl_player_one_make_1,_eventdata.getPrimaryButtonPressed(),(int) (100));
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_one_name_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub lbl_player_one_name_MouseReleased (EventData A";
 //BA.debugLineNum = 218;BA.debugLine="setP1Name";
_setp1name();
 //BA.debugLineNum = 219;BA.debugLine="func.processHs(\"all\")";
_func._processhs /*String*/ ("all");
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_1_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub lbl_player_two_1_MouseReleased (EventData As M";
 //BA.debugLineNum = 186;BA.debugLine="setP2Name";
_setp2name();
 //BA.debugLineNum = 187;BA.debugLine="func.calcScorePlayertwo(1, EventData.PrimaryButto";
_func._calcscoreplayertwo /*String*/ ((int) (1),_eventdata.getPrimaryButtonPressed());
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_10_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub lbl_player_two_10_MouseReleased (EventData As";
 //BA.debugLineNum = 190;BA.debugLine="setP2Name";
_setp2name();
 //BA.debugLineNum = 191;BA.debugLine="func.calcScorePlayertwo(10, EventData.PrimaryButt";
_func._calcscoreplayertwo /*String*/ ((int) (10),_eventdata.getPrimaryButtonPressed());
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_100_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub lbl_player_two_100_MouseReleased (EventData As";
 //BA.debugLineNum = 194;BA.debugLine="setP2Name";
_setp2name();
 //BA.debugLineNum = 195;BA.debugLine="func.calcScorePlayertwo(100, EventData.PrimaryBut";
_func._calcscoreplayertwo /*String*/ ((int) (100),_eventdata.getPrimaryButtonPressed());
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_make_1_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="Sub lbl_player_two_make_1_MouseReleased (EventData";
 //BA.debugLineNum = 262;BA.debugLine="func.playertwoMake(lbl_player_two_make_100, lbl_p";
_func._playertwomake /*String*/ (_lbl_player_two_make_100,_lbl_player_two_make_10,_lbl_player_two_make_1,_eventdata.getPrimaryButtonPressed(),(int) (1));
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_make_10_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Sub lbl_player_two_make_10_MouseReleased (EventDat";
 //BA.debugLineNum = 258;BA.debugLine="func.playertwoMake(lbl_player_two_make_100, lbl_p";
_func._playertwomake /*String*/ (_lbl_player_two_make_100,_lbl_player_two_make_10,_lbl_player_two_make_1,_eventdata.getPrimaryButtonPressed(),(int) (10));
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_make_100_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub lbl_player_two_make_100_MouseReleased (EventDa";
 //BA.debugLineNum = 254;BA.debugLine="func.playertwoMake(lbl_player_two_make_100, lbl_p";
_func._playertwomake /*String*/ (_lbl_player_two_make_100,_lbl_player_two_make_10,_lbl_player_two_make_1,_eventdata.getPrimaryButtonPressed(),(int) (100));
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_player_two_name_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub lbl_player_two_name_MouseReleased (EventData A";
 //BA.debugLineNum = 223;BA.debugLine="setP2Name";
_setp2name();
 //BA.debugLineNum = 224;BA.debugLine="func.processHs(\"all\")";
_func._processhs /*String*/ ("all");
 //BA.debugLineNum = 225;BA.debugLine="func.inngSet = 0";
_func._inngset /*int*/  = (int) (0);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_reset_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 379;BA.debugLine="Sub lbl_reset_MouseEntered (EventData As MouseEven";
 //BA.debugLineNum = 380;BA.debugLine="lbl_reset.Color =  0xFF69D79A";
_lbl_reset.setColor((int) (0xff69d79a));
 //BA.debugLineNum = 381;BA.debugLine="lbl_reset.TextColor = 0xFFFFFF00";
_lbl_reset.setTextColor((int) (0xffffff00));
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_reset_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 384;BA.debugLine="Sub lbl_reset_MouseExited (EventData As MouseEvent";
 //BA.debugLineNum = 385;BA.debugLine="lbl_reset.Color = 0xFFFF0000";
_lbl_reset.setColor((int) (0xffff0000));
 //BA.debugLineNum = 386;BA.debugLine="lbl_reset.TextColor = 0xFFFFFFFF";
_lbl_reset.setTextColor((int) (0xffffffff));
 //BA.debugLineNum = 387;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_reset_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 389;BA.debugLine="Sub lbl_reset_MouseReleased (EventData As MouseEve";
 //BA.debugLineNum = 390;BA.debugLine="inactivecls.lastClick = DateTime.Now";
_inactivecls._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 391;BA.debugLine="If func.newGameInitialized = False Then";
if (_func._newgameinitialized /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 392;BA.debugLine="CallSub(nieuwe_partij, \"show\")";
anywheresoftware.b4a.keywords.Common.CallSubNew(ba,(Object)(_nieuwe_partij.getObject()),"show");
 }else {
 //BA.debugLineNum = 394;BA.debugLine="CallSub(nieuwe_partij, \"showForm\")";
anywheresoftware.b4a.keywords.Common.CallSubNew(ba,(Object)(_nieuwe_partij.getObject()),"showForm");
 };
 //BA.debugLineNum = 396;BA.debugLine="nieuwePartij";
_nieuwepartij();
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _lstplayeronescorelbl() throws Exception{
anywheresoftware.b4a.objects.collections.List _list = null;
 //BA.debugLineNum = 152;BA.debugLine="Sub lstPlayerOneScoreLbl As List";
 //BA.debugLineNum = 153;BA.debugLine="Dim List As List";
_list = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 154;BA.debugLine="List.Initialize";
_list.Initialize();
 //BA.debugLineNum = 155;BA.debugLine="List.AddAll(Array As Object(lbl_player_one_1, lbl";
_list.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_lbl_player_one_1.getObject()),(Object)(_lbl_player_one_10.getObject()),(Object)(_lbl_player_one_100.getObject()),(Object)(_lbl_player_one_moyenne.getObject()),(Object)(_b4xprogressbarp1)}));
 //BA.debugLineNum = 156;BA.debugLine="Return List";
if (true) return _list;
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _lstplayertwoscorelbl() throws Exception{
anywheresoftware.b4a.objects.collections.List _list = null;
 //BA.debugLineNum = 159;BA.debugLine="Sub lstPlayerTwoScoreLbl As List";
 //BA.debugLineNum = 160;BA.debugLine="Dim List As List";
_list = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 161;BA.debugLine="List.Initialize";
_list.Initialize();
 //BA.debugLineNum = 162;BA.debugLine="List.AddAll(Array As Object(lbl_player_two_1, lbl";
_list.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_lbl_player_two_1.getObject()),(Object)(_lbl_player_two_10.getObject()),(Object)(_lbl_player_two_100.getObject()),(Object)(_lbl_player_two_moyenne.getObject()),(Object)(_b4xprogressbarp2)}));
 //BA.debugLineNum = 163;BA.debugLine="Return List";
if (true) return _list;
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public static String  _mainform_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 439;BA.debugLine="Sub MainForm_MouseClicked (EventData As MouseEvent";
 //BA.debugLineNum = 440;BA.debugLine="If inactivecls.tmr_draw_promote.Enabled = True Th";
if (_inactivecls._tmr_draw_promote /*anywheresoftware.b4a.objects.Timer*/ .getEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 441;BA.debugLine="pn_promote.Top = pn_promote_top";
_pn_promote.setTop(_pn_promote_top);
 //BA.debugLineNum = 442;BA.debugLine="pn_promote_left = pn_promote_left";
_pn_promote_left = _pn_promote_left;
 //BA.debugLineNum = 444;BA.debugLine="inactivecls.lastClick = DateTime.Now";
_inactivecls._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 445;BA.debugLine="inactivecls.enableTime(True)";
_inactivecls._enabletime /*String*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 446;BA.debugLine="inactivecls.enablePromote(False)";
_inactivecls._enablepromote /*String*/ (anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 448;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 417;BA.debugLine="If promoteRunning = True Then";
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
 //BA.debugLineNum = 418;BA.debugLine="pn_promote.Top = pn_promote_top";
parent._pn_promote.setTop(parent._pn_promote_top);
 //BA.debugLineNum = 419;BA.debugLine="pn_promote.left = pn_promote_left";
parent._pn_promote.setLeft(parent._pn_promote_left);
 //BA.debugLineNum = 420;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (0));
this.state = 5;
return;
case 5:
//C
this.state = 4;
;
 //BA.debugLineNum = 421;BA.debugLine="inactivecls.lastClick = DateTime.Now";
parent._inactivecls._lastclick /*long*/  = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 422;BA.debugLine="inactivecls.enableTime(True)";
parent._inactivecls._enabletime /*String*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 423;BA.debugLine="inactivecls.enablePromote(False)";
parent._inactivecls._enablepromote /*String*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 424;BA.debugLine="promoteRunning = False";
parent._promoterunning = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 425;BA.debugLine="Sleep(300)";
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
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _mouseover(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n1) throws Exception{
 //BA.debugLineNum = 429;BA.debugLine="private Sub MouseOver(n1 As Node)";
 //BA.debugLineNum = 431;BA.debugLine="setHandler(n1,\"setOnMouseMoved\",\"mouseIn\")";
_sethandler((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_n1.getObject())),"setOnMouseMoved","mouseIn");
 //BA.debugLineNum = 432;BA.debugLine="setHandler(n1,\"setOnMouseExited\",\"mouseOut\")";
_sethandler((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_n1.getObject())),"setOnMouseExited","mouseOut");
 //BA.debugLineNum = 433;BA.debugLine="End Sub";
return "";
}
public static String  _nieuwepartij() throws Exception{
 //BA.debugLineNum = 371;BA.debugLine="Sub nieuwePartij";
 //BA.debugLineNum = 372;BA.debugLine="If func.newGameInitialized = False Then";
if (_func._newgameinitialized /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 373;BA.debugLine="nieuwe_partij.show";
_nieuwe_partij._show /*String*/ ();
 }else {
 //BA.debugLineNum = 375;BA.debugLine="CallSub(nieuwe_partij, \"showForm\")";
anywheresoftware.b4a.keywords.Common.CallSubNew(ba,(Object)(_nieuwe_partij.getObject()),"showForm");
 };
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return "";
}
public static String  _playeroneperc(String _perc) throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Sub playerOnePerc(perc As String)";
 //BA.debugLineNum = 245;BA.debugLine="lbl_player_one_perc.Text = perc";
_lbl_player_one_perc.setText(_perc);
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return "";
}
public static String  _playertwoperc(String _perc) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub playerTwoPerc(perc As String)";
 //BA.debugLineNum = 249;BA.debugLine="lbl_player_two_perc.Text = perc";
_lbl_player_two_perc.setText(_perc);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Public frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 5;BA.debugLine="Private inactivecls As inactiveClass";
_inactivecls = new b4j.example.inactiveclass();
 //BA.debugLineNum = 6;BA.debugLine="Private clsCheckCfg As classCheckConfig";
_clscheckcfg = new b4j.example.classcheckconfig();
 //BA.debugLineNum = 7;BA.debugLine="Private clsToast As clXToastMessage";
_clstoast = new b4j.example.clxtoastmessage();
 //BA.debugLineNum = 9;BA.debugLine="Private pn_promote_top, pn_promote_left As Double";
_pn_promote_top = 0;
_pn_promote_left = 0;
 //BA.debugLineNum = 10;BA.debugLine="Private promoteRunning As Boolean = False";
_promoterunning = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 11;BA.debugLine="Private lbl_innings As Label";
_lbl_innings = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private lbl_player_one_moyenne As Label";
_lbl_player_one_moyenne = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private lbl_player_two_moyenne As Label";
_lbl_player_two_moyenne = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private lbl_player_two_100 As Label";
_lbl_player_two_100 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private lbl_player_two_10 As Label";
_lbl_player_two_10 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private lbl_player_two_1 As Label";
_lbl_player_two_1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private lbl_player_one_name As B4XView";
_lbl_player_one_name = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private lbl_player_two_name As B4XView";
_lbl_player_two_name = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private lbl_player_one_perc As Label";
_lbl_player_one_perc = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private lbl_player_one_make_100 As Label";
_lbl_player_one_make_100 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private lbl_player_one_make_10 As Label";
_lbl_player_one_make_10 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private lbl_player_one_make_1 As Label";
_lbl_player_one_make_1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private lbl_player_two_make_100 As Label";
_lbl_player_two_make_100 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private lbl_player_two_make_10 As Label";
_lbl_player_two_make_10 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private lbl_player_two_make_1 As Label";
_lbl_player_two_make_1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private lbl_player_two_perc As Label";
_lbl_player_two_perc = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private lbl_reset As B4XView";
_lbl_reset = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private lbl_player_one_hs As Label";
_lbl_player_one_hs = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private lbl_player_two_hs As Label";
_lbl_player_two_hs = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private lbl_clock As B4XView";
_lbl_clock = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private clsTmr As timerClass";
_clstmr = new b4j.example.timerclass();
 //BA.debugLineNum = 32;BA.debugLine="Private Label7 As Label";
_label7 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private B4XProgressBarP1 As B4XProgressBar";
_b4xprogressbarp1 = new b4j.example.b4xprogressbar();
 //BA.debugLineNum = 34;BA.debugLine="Private B4XProgressBarP2 As B4XProgressBar";
_b4xprogressbarp2 = new b4j.example.b4xprogressbar();
 //BA.debugLineNum = 35;BA.debugLine="Private Label6 As Label";
_label6 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private lbl_close As B4XView";
_lbl_close = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private pn_p1_carom As Pane";
_pn_p1_carom = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private pn_promote As Pane";
_pn_promote = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private lbl_config_update As Label";
_lbl_config_update = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private lbl_player_one_1 As Label";
_lbl_player_one_1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private lbl_player_one_10 As Label";
_lbl_player_one_10 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private lbl_player_one_100 As Label";
_lbl_player_one_100 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private lbl_message_1 As Label";
_lbl_message_1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private lbl_message_2 As Label";
_lbl_message_2 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private lbl_message_3 As Label";
_lbl_message_3 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private lbl_message_4 As Label";
_lbl_message_4 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private lbl_message_5 As Label";
_lbl_message_5 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Private lbl_version As Label";
_lbl_version = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 49;BA.debugLine="Private pn_sponsore As Pane";
_pn_sponsore = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 50;BA.debugLine="Private pn_game As Pane";
_pn_game = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 51;BA.debugLine="Private lbl_game_text As Label";
_lbl_game_text = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public static String  _resetboard() throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub resetBoard";
 //BA.debugLineNum = 266;BA.debugLine="lbl_player_one_1.Text = \"0\"";
_lbl_player_one_1.setText("0");
 //BA.debugLineNum = 267;BA.debugLine="lbl_player_one_10.Text = \"0\"";
_lbl_player_one_10.setText("0");
 //BA.debugLineNum = 268;BA.debugLine="lbl_player_one_100.Text = \"0\"";
_lbl_player_one_100.setText("0");
 //BA.debugLineNum = 269;BA.debugLine="lbl_player_one_make_100.Text = \"0\"";
_lbl_player_one_make_100.setText("0");
 //BA.debugLineNum = 270;BA.debugLine="lbl_player_one_make_10.Text = \"0\"";
_lbl_player_one_make_10.setText("0");
 //BA.debugLineNum = 271;BA.debugLine="lbl_player_one_make_1.Text = \"0\"";
_lbl_player_one_make_1.setText("0");
 //BA.debugLineNum = 272;BA.debugLine="lbl_player_one_moyenne.Text = \"0.000\"";
_lbl_player_one_moyenne.setText("0.000");
 //BA.debugLineNum = 273;BA.debugLine="lbl_player_one_perc.Text = \"0.00%\"";
_lbl_player_one_perc.setText("0.00%");
 //BA.debugLineNum = 275;BA.debugLine="lbl_innings.Text = \"000\"";
_lbl_innings.setText("000");
 //BA.debugLineNum = 277;BA.debugLine="lbl_player_two_100.Text = \"0\"";
_lbl_player_two_100.setText("0");
 //BA.debugLineNum = 278;BA.debugLine="lbl_player_two_10.Text = \"0\"";
_lbl_player_two_10.setText("0");
 //BA.debugLineNum = 279;BA.debugLine="lbl_player_two_1.Text = \"0\"";
_lbl_player_two_1.setText("0");
 //BA.debugLineNum = 280;BA.debugLine="lbl_player_two_make_100.Text = \"0\"";
_lbl_player_two_make_100.setText("0");
 //BA.debugLineNum = 281;BA.debugLine="lbl_player_two_make_10.Text = \"0\"";
_lbl_player_two_make_10.setText("0");
 //BA.debugLineNum = 282;BA.debugLine="lbl_player_two_make_1.Text = \"0\"";
_lbl_player_two_make_1.setText("0");
 //BA.debugLineNum = 283;BA.debugLine="lbl_player_two_perc.Text = \"0.00%\"";
_lbl_player_two_perc.setText("0.00%");
 //BA.debugLineNum = 284;BA.debugLine="lbl_player_two_moyenne.Text = \"0.000\"";
_lbl_player_two_moyenne.setText("0.000");
 //BA.debugLineNum = 285;BA.debugLine="lbl_player_one_hs.Text = \"000\"";
_lbl_player_one_hs.setText("000");
 //BA.debugLineNum = 286;BA.debugLine="lbl_player_two_hs.Text = \"000\"";
_lbl_player_two_hs.setText("000");
 //BA.debugLineNum = 288;BA.debugLine="func.inngSet = 0";
_func._inngset /*int*/  = (int) (0);
 //BA.debugLineNum = 289;BA.debugLine="func.innigs = 0";
_func._innigs /*int*/  = (int) (0);
 //BA.debugLineNum = 290;BA.debugLine="func.scorePlayerOne = 0";
_func._scoreplayerone /*int*/  = (int) (0);
 //BA.debugLineNum = 291;BA.debugLine="func.scorePlayerTwo = 0";
_func._scoreplayertwo /*int*/  = (int) (0);
 //BA.debugLineNum = 292;BA.debugLine="func.playerOneToMake = 0";
_func._playeronetomake /*int*/  = (int) (0);
 //BA.debugLineNum = 293;BA.debugLine="func.playertwoToMake = 0";
_func._playertwotomake /*int*/  = (int) (0);
 //BA.debugLineNum = 294;BA.debugLine="func.playerOneHs = 0";
_func._playeronehs /*int*/  = (int) (0);
 //BA.debugLineNum = 295;BA.debugLine="func.playerTwoHs = 0";
_func._playertwohs /*int*/  = (int) (0);
 //BA.debugLineNum = 296;BA.debugLine="func.p1HsTemp = 0";
_func._p1hstemp /*int*/  = (int) (0);
 //BA.debugLineNum = 297;BA.debugLine="func.p2HsTemp = 0";
_func._p2hstemp /*int*/  = (int) (0);
 //BA.debugLineNum = 298;BA.debugLine="B4XProgressBarP1.Progress = 0";
_b4xprogressbarp1._setprogress /*float*/ ((float) (0));
 //BA.debugLineNum = 299;BA.debugLine="B4XProgressBarP2.Progress = 0";
_b4xprogressbarp2._setprogress /*float*/ ((float) (0));
 //BA.debugLineNum = 300;BA.debugLine="setP1Name";
_setp1name();
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return "";
}
public static String  _setclearboard(boolean _clear) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Public Sub setClearBoard(clear As Boolean)";
 //BA.debugLineNum = 103;BA.debugLine="func.setNieuwePartij = clear";
_func._setnieuwepartij /*boolean*/  = _clear;
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public static String  _setfontstyle() throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub setFontStyle";
 //BA.debugLineNum = 118;BA.debugLine="func.caromLabelCss(lbl_player_one_hs, \"labelWhite";
_func._caromlabelcss /*String*/ (_lbl_player_one_hs,"labelWhite");
 //BA.debugLineNum = 119;BA.debugLine="func.caromLabelCss(lbl_player_one_moyenne, \"label";
_func._caromlabelcss /*String*/ (_lbl_player_one_moyenne,"labelWhite");
 //BA.debugLineNum = 120;BA.debugLine="func.caromLabelCss(lbl_player_one_perc, \"labelWhi";
_func._caromlabelcss /*String*/ (_lbl_player_one_perc,"labelWhite");
 //BA.debugLineNum = 121;BA.debugLine="func.caromLabelCss(lbl_player_two_hs, \"labelWhite";
_func._caromlabelcss /*String*/ (_lbl_player_two_hs,"labelWhite");
 //BA.debugLineNum = 122;BA.debugLine="func.caromLabelCss(lbl_player_two_moyenne, \"label";
_func._caromlabelcss /*String*/ (_lbl_player_two_moyenne,"labelWhite");
 //BA.debugLineNum = 123;BA.debugLine="func.caromLabelCss(lbl_player_two_perc, \"labelWhi";
_func._caromlabelcss /*String*/ (_lbl_player_two_perc,"labelWhite");
 //BA.debugLineNum = 125;BA.debugLine="func.caromLabelCss(lbl_innings, \"labelCarom\")";
_func._caromlabelcss /*String*/ (_lbl_innings,"labelCarom");
 //BA.debugLineNum = 127;BA.debugLine="func.caromLabelCss(lbl_player_one_100, \"labelCaro";
_func._caromlabelcss /*String*/ (_lbl_player_one_100,"labelCarom");
 //BA.debugLineNum = 128;BA.debugLine="func.caromLabelCss(lbl_player_one_10, \"labelCarom";
_func._caromlabelcss /*String*/ (_lbl_player_one_10,"labelCarom");
 //BA.debugLineNum = 129;BA.debugLine="func.caromLabelCss(lbl_player_one_1, \"labelCarom\"";
_func._caromlabelcss /*String*/ (_lbl_player_one_1,"labelCarom");
 //BA.debugLineNum = 131;BA.debugLine="func.caromLabelCss(lbl_player_one_make_100, \"labe";
_func._caromlabelcss /*String*/ (_lbl_player_one_make_100,"labelCarom");
 //BA.debugLineNum = 132;BA.debugLine="func.caromLabelCss(lbl_player_one_make_10, \"label";
_func._caromlabelcss /*String*/ (_lbl_player_one_make_10,"labelCarom");
 //BA.debugLineNum = 133;BA.debugLine="func.caromLabelCss(lbl_player_one_make_1, \"labelC";
_func._caromlabelcss /*String*/ (_lbl_player_one_make_1,"labelCarom");
 //BA.debugLineNum = 135;BA.debugLine="func.caromLabelCss(lbl_player_two_100, \"labelCaro";
_func._caromlabelcss /*String*/ (_lbl_player_two_100,"labelCarom");
 //BA.debugLineNum = 136;BA.debugLine="func.caromLabelCss(lbl_player_two_10, \"labelCarom";
_func._caromlabelcss /*String*/ (_lbl_player_two_10,"labelCarom");
 //BA.debugLineNum = 137;BA.debugLine="func.caromLabelCss(lbl_player_two_1, \"labelCarom\"";
_func._caromlabelcss /*String*/ (_lbl_player_two_1,"labelCarom");
 //BA.debugLineNum = 139;BA.debugLine="func.caromLabelCss(lbl_player_two_make_100, \"labe";
_func._caromlabelcss /*String*/ (_lbl_player_two_make_100,"labelCarom");
 //BA.debugLineNum = 140;BA.debugLine="func.caromLabelCss(lbl_player_two_make_10, \"label";
_func._caromlabelcss /*String*/ (_lbl_player_two_make_10,"labelCarom");
 //BA.debugLineNum = 141;BA.debugLine="func.caromLabelCss(lbl_player_two_make_1, \"labelC";
_func._caromlabelcss /*String*/ (_lbl_player_two_make_1,"labelCarom");
 //BA.debugLineNum = 143;BA.debugLine="resetBoard";
_resetboard();
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public static String  _sethandler(anywheresoftware.b4j.object.JavaObject _ob,String _eventname,String _handlername) throws Exception{
 //BA.debugLineNum = 435;BA.debugLine="private Sub setHandler(ob As JavaObject,eventName";
 //BA.debugLineNum = 436;BA.debugLine="ob.RunMethod(eventName, Array(ob.CreateEventFromU";
_ob.RunMethod(_eventname,new Object[]{_ob.CreateEventFromUI(ba,"javafx.event.EventHandler",_handlername,(Object)(anywheresoftware.b4a.keywords.Common.True))});
 //BA.debugLineNum = 437;BA.debugLine="End Sub";
return "";
}
public static String  _setmessage(anywheresoftware.b4a.objects.collections.List _msglist) throws Exception{
 //BA.debugLineNum = 511;BA.debugLine="Sub setMessage(msgList As List)";
 //BA.debugLineNum = 512;BA.debugLine="lbl_message_1.Text = msgList.get(0)";
_lbl_message_1.setText(BA.ObjectToString(_msglist.Get((int) (0))));
 //BA.debugLineNum = 513;BA.debugLine="lbl_message_2.Text = msgList.get(1)";
_lbl_message_2.setText(BA.ObjectToString(_msglist.Get((int) (1))));
 //BA.debugLineNum = 514;BA.debugLine="lbl_message_3.Text = msgList.get(2)";
_lbl_message_3.setText(BA.ObjectToString(_msglist.Get((int) (2))));
 //BA.debugLineNum = 515;BA.debugLine="lbl_message_4.Text = msgList.get(3)";
_lbl_message_4.setText(BA.ObjectToString(_msglist.Get((int) (3))));
 //BA.debugLineNum = 516;BA.debugLine="lbl_message_5.Text = msgList.Get(4)";
_lbl_message_5.setText(BA.ObjectToString(_msglist.Get((int) (4))));
 //BA.debugLineNum = 517;BA.debugLine="End Sub";
return "";
}
public static String  _setp1name() throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Sub setP1Name";
 //BA.debugLineNum = 305;BA.debugLine="lbl_player_one_name.Color = 0xff3455db'0xFF69D79A";
_lbl_player_one_name.setColor((int) (0xff3455db));
 //BA.debugLineNum = 306;BA.debugLine="lbl_player_two_name.Color = 0xFF001A01";
_lbl_player_two_name.setColor((int) (0xff001a01));
 //BA.debugLineNum = 308;BA.debugLine="lbl_player_one_100.Enabled = True";
_lbl_player_one_100.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 309;BA.debugLine="lbl_player_one_10.Enabled = True";
_lbl_player_one_10.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 310;BA.debugLine="lbl_player_one_1.Enabled = True";
_lbl_player_one_1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 312;BA.debugLine="lbl_player_two_100.Enabled = False";
_lbl_player_two_100.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 313;BA.debugLine="lbl_player_two_10.Enabled = False";
_lbl_player_two_10.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 314;BA.debugLine="lbl_player_two_1.Enabled = False";
_lbl_player_two_1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return "";
}
public static String  _setp2name() throws Exception{
 //BA.debugLineNum = 317;BA.debugLine="Sub setP2Name";
 //BA.debugLineNum = 318;BA.debugLine="lbl_player_two_name.Color = 0xff3455db'0xFF69D79A";
_lbl_player_two_name.setColor((int) (0xff3455db));
 //BA.debugLineNum = 319;BA.debugLine="lbl_player_one_name.Color = 0xFF001A01";
_lbl_player_one_name.setColor((int) (0xff001a01));
 //BA.debugLineNum = 321;BA.debugLine="lbl_player_one_100.Enabled = False";
_lbl_player_one_100.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 322;BA.debugLine="lbl_player_one_10.Enabled = False";
_lbl_player_one_10.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 323;BA.debugLine="lbl_player_one_1.Enabled = False";
_lbl_player_one_1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 325;BA.debugLine="lbl_player_two_100.Enabled = True";
_lbl_player_two_100.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 326;BA.debugLine="lbl_player_two_10.Enabled = True";
_lbl_player_two_10.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 327;BA.debugLine="lbl_player_two_1.Enabled = True";
_lbl_player_two_1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return "";
}
public static String  _setpromoterunning(boolean _running) throws Exception{
 //BA.debugLineNum = 412;BA.debugLine="Sub setPromoteRunning(running As Boolean)";
 //BA.debugLineNum = 413;BA.debugLine="promoteRunning = running";
_promoterunning = _running;
 //BA.debugLineNum = 414;BA.debugLine="End Sub";
return "";
}
public static String  _setspelerdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
String _temaken = "";
 //BA.debugLineNum = 519;BA.debugLine="Sub setSpelerData(data As List)";
 //BA.debugLineNum = 520;BA.debugLine="resetBoard";
_resetboard();
 //BA.debugLineNum = 521;BA.debugLine="Dim teMaken As String";
_temaken = "";
 //BA.debugLineNum = 522;BA.debugLine="lbl_player_one_name.Text = data.Get(0)";
_lbl_player_one_name.setText(BA.ObjectToString(_data.Get((int) (0))));
 //BA.debugLineNum = 523;BA.debugLine="func.playerOneToMake = data.Get(1)";
_func._playeronetomake /*int*/  = (int)(BA.ObjectToNumber(_data.Get((int) (1))));
 //BA.debugLineNum = 524;BA.debugLine="teMaken =  func.padString(data.Get(1), \"0\", 0, 3)";
_temaken = _func._padstring /*String*/ (BA.ObjectToString(_data.Get((int) (1))),"0",(int) (0),(int) (3));
 //BA.debugLineNum = 525;BA.debugLine="lbl_player_one_make_100.Text	= teMaken.SubString2";
_lbl_player_one_make_100.setText(_temaken.substring((int) (0),(int) (1)));
 //BA.debugLineNum = 526;BA.debugLine="lbl_player_one_make_10.Text		= teMaken.SubString2";
_lbl_player_one_make_10.setText(_temaken.substring((int) (1),(int) (2)));
 //BA.debugLineNum = 527;BA.debugLine="lbl_player_one_make_1.Text		= teMaken.SubString2(";
_lbl_player_one_make_1.setText(_temaken.substring((int) (2),(int) (3)));
 //BA.debugLineNum = 529;BA.debugLine="lbl_player_two_name.Text = data.Get(2)";
_lbl_player_two_name.setText(BA.ObjectToString(_data.Get((int) (2))));
 //BA.debugLineNum = 530;BA.debugLine="teMaken =  func.padString(data.Get(3), \"0\", 0, 3)";
_temaken = _func._padstring /*String*/ (BA.ObjectToString(_data.Get((int) (3))),"0",(int) (0),(int) (3));
 //BA.debugLineNum = 531;BA.debugLine="func.playerTwoToMake = data.Get(3)";
_func._playertwotomake /*int*/  = (int)(BA.ObjectToNumber(_data.Get((int) (3))));
 //BA.debugLineNum = 532;BA.debugLine="lbl_player_two_make_100.Text	= teMaken.SubString2";
_lbl_player_two_make_100.setText(_temaken.substring((int) (0),(int) (1)));
 //BA.debugLineNum = 533;BA.debugLine="lbl_player_two_make_10.Text		= teMaken.SubString2";
_lbl_player_two_make_10.setText(_temaken.substring((int) (1),(int) (2)));
 //BA.debugLineNum = 534;BA.debugLine="lbl_player_two_make_1.Text		= teMaken.SubString2(";
_lbl_player_two_make_1.setText(_temaken.substring((int) (2),(int) (3)));
 //BA.debugLineNum = 535;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 55;BA.debugLine="frm.Initialize(\"frm\", 1920, 1080)";
parent._frm.Initialize(ba,"frm",1920,1080);
 //BA.debugLineNum = 56;BA.debugLine="frm.RootPane.LoadLayout(\"scorebord\")";
parent._frm.getRootPane().LoadLayout(ba,"scorebord");
 //BA.debugLineNum = 57;BA.debugLine="frm.BackColor  =   fx.Colors.From32Bit(0xFF001A01";
parent._frm.setBackColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit((int) (0xff001a01))));
 //BA.debugLineNum = 61;BA.debugLine="frm.SetFormStyle(\"UNDECORATED\")";
parent._frm.SetFormStyle("UNDECORATED");
 //BA.debugLineNum = 62;BA.debugLine="frm.Resizable = False";
parent._frm.setResizable(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 65;BA.debugLine="frm.Stylesheets.Add(File.GetUri(File.DirAssets, \"";
parent._frm.getStylesheets().Add((Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"n205.css")));
 //BA.debugLineNum = 66;BA.debugLine="parseConfig.pullConfig";
parent._parseconfig._pullconfig /*String*/ ();
 //BA.debugLineNum = 67;BA.debugLine="MouseOver(frm.RootPane)";
_mouseover((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(parent._frm.getRootPane().getObject())));
 //BA.debugLineNum = 70;BA.debugLine="func.SetCustomCursor1(File.DirAssets, \"mouse.png\"";
parent._func._setcustomcursor1 /*String*/ (anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"mouse.png",370,370,(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(parent._frm.getRootPane().getObject())));
 //BA.debugLineNum = 72;BA.debugLine="clsTmr.Initialize(lbl_clock)";
parent._clstmr._initialize /*String*/ (ba,(anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(parent._lbl_clock.getObject())));
 //BA.debugLineNum = 73;BA.debugLine="inactivecls.Initialize(870, 510)";
parent._inactivecls._initialize /*String*/ (ba,870,510);
 //BA.debugLineNum = 74;BA.debugLine="clsCheckCfg.Initialize";
parent._clscheckcfg._initialize /*String*/ (ba);
 //BA.debugLineNum = 75;BA.debugLine="clsToast.Initialize(frm.RootPane)";
parent._clstoast._initialize /*String*/ (ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._frm.getRootPane().getObject())));
 //BA.debugLineNum = 79;BA.debugLine="lbl_version.Text = func.getVersion";
parent._lbl_version.setText(parent._func._getversion /*String*/ ());
 //BA.debugLineNum = 80;BA.debugLine="func.lblInnings = lbl_innings";
parent._func._lblinnings /*anywheresoftware.b4j.objects.LabelWrapper*/  = parent._lbl_innings;
 //BA.debugLineNum = 81;BA.debugLine="func.lbl_player_one_hs = lbl_player_one_hs";
parent._func._lbl_player_one_hs /*anywheresoftware.b4j.objects.LabelWrapper*/  = parent._lbl_player_one_hs;
 //BA.debugLineNum = 82;BA.debugLine="func.lbl_player_two_hs = lbl_player_two_hs";
parent._func._lbl_player_two_hs /*anywheresoftware.b4j.objects.LabelWrapper*/  = parent._lbl_player_two_hs;
 //BA.debugLineNum = 84;BA.debugLine="func.setP1CaromLables(lstPlayerOneScoreLbl)";
parent._func._setp1caromlables /*String*/ (_lstplayeronescorelbl());
 //BA.debugLineNum = 85;BA.debugLine="func.setP2CaromLables(lstPlayerTwoScoreLbl)";
parent._func._setp2caromlables /*String*/ (_lstplayertwoscorelbl());
 //BA.debugLineNum = 87;BA.debugLine="Wait For (funcInet.testInet) Complete (result As";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, parent._funcinet._testinet /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (boolean) result[0];
;
 //BA.debugLineNum = 88;BA.debugLine="If result Then";
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
 //BA.debugLineNum = 89;BA.debugLine="func.hasInternetAccess = True";
parent._func._hasinternetaccess /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 92;BA.debugLine="func.hasInternetAccess = False";
parent._func._hasinternetaccess /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 95;BA.debugLine="initPanels";
_initpanels();
 //BA.debugLineNum = 96;BA.debugLine="frm.Show";
parent._frm.Show();
 //BA.debugLineNum = 97;BA.debugLine="setFontStyle";
_setfontstyle();
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(boolean _result) throws Exception{
}
public static String  _showpromote() throws Exception{
 //BA.debugLineNum = 403;BA.debugLine="Sub showPromote";
 //BA.debugLineNum = 404;BA.debugLine="pn_promote.SetLayoutAnimated(0, 50dip, 50dip, pn_";
_pn_promote.SetLayoutAnimated((int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),_pn_promote.getWidth(),_pn_promote.getHeight());
 //BA.debugLineNum = 405;BA.debugLine="End Sub";
return "";
}
public static String  _showsponor(boolean _enabled) throws Exception{
 //BA.debugLineNum = 507;BA.debugLine="Sub showSponor(enabled As Boolean)";
 //BA.debugLineNum = 508;BA.debugLine="pn_sponsore.Visible = enabled";
_pn_sponsore.setVisible(_enabled);
 //BA.debugLineNum = 509;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 451;BA.debugLine="inactivecls.updatePromote";
parent._inactivecls._updatepromote /*String*/ ();
 //BA.debugLineNum = 452;BA.debugLine="lbl_config_update.Visible = True";
parent._lbl_config_update.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 453;BA.debugLine="Sleep(5000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (5000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 454;BA.debugLine="lbl_config_update.Visible = False";
parent._lbl_config_update.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 455;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _usedigitalfont(boolean _usedigital) throws Exception{
int _fscarom = 0;
int _fsmake = 0;
int _fsinnings = 0;
 //BA.debugLineNum = 457;BA.debugLine="Sub useDigitalFont(useDigital As Boolean)";
 //BA.debugLineNum = 458;BA.debugLine="Dim fsCarom, fsMake, fsInnings As Int";
_fscarom = 0;
_fsmake = 0;
_fsinnings = 0;
 //BA.debugLineNum = 460;BA.debugLine="If useDigital Then";
if (_usedigital) { 
 //BA.debugLineNum = 461;BA.debugLine="fsCarom = 300'350";
_fscarom = (int) (300);
 //BA.debugLineNum = 462;BA.debugLine="fsMake = 225";
_fsmake = (int) (225);
 //BA.debugLineNum = 463;BA.debugLine="fsInnings = 250'300";
_fsinnings = (int) (250);
 }else {
 //BA.debugLineNum = 465;BA.debugLine="fsCarom = 225";
_fscarom = (int) (225);
 //BA.debugLineNum = 466;BA.debugLine="fsMake = 150";
_fsmake = (int) (150);
 //BA.debugLineNum = 467;BA.debugLine="fsInnings = 200";
_fsinnings = (int) (200);
 };
 //BA.debugLineNum = 470;BA.debugLine="func.setFont(lbl_player_one_1, fsCarom, useDigita";
_func._setfont /*String*/ (_lbl_player_one_1,_fscarom,_usedigital);
 //BA.debugLineNum = 471;BA.debugLine="func.setFont(lbl_player_one_10, fsCarom, useDigit";
_func._setfont /*String*/ (_lbl_player_one_10,_fscarom,_usedigital);
 //BA.debugLineNum = 472;BA.debugLine="func.setFont(lbl_player_one_100, fsCarom, useDigi";
_func._setfont /*String*/ (_lbl_player_one_100,_fscarom,_usedigital);
 //BA.debugLineNum = 473;BA.debugLine="func.setFont(lbl_player_two_1, fsCarom, useDigita";
_func._setfont /*String*/ (_lbl_player_two_1,_fscarom,_usedigital);
 //BA.debugLineNum = 474;BA.debugLine="func.setFont(lbl_player_two_10, fsCarom, useDigit";
_func._setfont /*String*/ (_lbl_player_two_10,_fscarom,_usedigital);
 //BA.debugLineNum = 475;BA.debugLine="func.setFont(lbl_player_two_100, fsCarom, useDigi";
_func._setfont /*String*/ (_lbl_player_two_100,_fscarom,_usedigital);
 //BA.debugLineNum = 476;BA.debugLine="func.setFont(lbl_innings, fsInnings, useDigital)";
_func._setfont /*String*/ (_lbl_innings,_fsinnings,_usedigital);
 //BA.debugLineNum = 477;BA.debugLine="func.setFont(lbl_player_one_make_100, fsMake, use";
_func._setfont /*String*/ (_lbl_player_one_make_100,_fsmake,_usedigital);
 //BA.debugLineNum = 478;BA.debugLine="func.setFont(lbl_player_one_make_10, fsMake, useD";
_func._setfont /*String*/ (_lbl_player_one_make_10,_fsmake,_usedigital);
 //BA.debugLineNum = 479;BA.debugLine="func.setFont(lbl_player_one_make_1, fsMake, useDi";
_func._setfont /*String*/ (_lbl_player_one_make_1,_fsmake,_usedigital);
 //BA.debugLineNum = 480;BA.debugLine="func.setFont(lbl_player_two_make_100,fsMake, useD";
_func._setfont /*String*/ (_lbl_player_two_make_100,_fsmake,_usedigital);
 //BA.debugLineNum = 481;BA.debugLine="func.setFont(lbl_player_two_make_10,fsMake, useDi";
_func._setfont /*String*/ (_lbl_player_two_make_10,_fsmake,_usedigital);
 //BA.debugLineNum = 482;BA.debugLine="func.setFont(lbl_player_two_make_1,fsMake, useDig";
_func._setfont /*String*/ (_lbl_player_two_make_1,_fsmake,_usedigital);
 //BA.debugLineNum = 484;BA.debugLine="End Sub";
return "";
}
public static String  _usefontyellow(boolean _useyellow) throws Exception{
 //BA.debugLineNum = 486;BA.debugLine="Sub useFontYellow(useYellow As Boolean)";
 //BA.debugLineNum = 488;BA.debugLine="func.setFontColor(lbl_innings, useYellow)";
_func._setfontcolor /*String*/ (_lbl_innings,_useyellow);
 //BA.debugLineNum = 490;BA.debugLine="func.setFontColor(lbl_player_one_1, useYellow)";
_func._setfontcolor /*String*/ (_lbl_player_one_1,_useyellow);
 //BA.debugLineNum = 491;BA.debugLine="func.setFontColor(lbl_player_one_10, useYellow)";
_func._setfontcolor /*String*/ (_lbl_player_one_10,_useyellow);
 //BA.debugLineNum = 492;BA.debugLine="func.setFontColor(lbl_player_one_100, useYellow)";
_func._setfontcolor /*String*/ (_lbl_player_one_100,_useyellow);
 //BA.debugLineNum = 494;BA.debugLine="func.setFontColor(lbl_player_two_1, useYellow)";
_func._setfontcolor /*String*/ (_lbl_player_two_1,_useyellow);
 //BA.debugLineNum = 495;BA.debugLine="func.setFontColor(lbl_player_two_10, useYellow)";
_func._setfontcolor /*String*/ (_lbl_player_two_10,_useyellow);
 //BA.debugLineNum = 496;BA.debugLine="func.setFontColor(lbl_player_two_100, useYellow)";
_func._setfontcolor /*String*/ (_lbl_player_two_100,_useyellow);
 //BA.debugLineNum = 498;BA.debugLine="func.setFontColor(lbl_player_one_make_100, useYel";
_func._setfontcolor /*String*/ (_lbl_player_one_make_100,_useyellow);
 //BA.debugLineNum = 499;BA.debugLine="func.setFontColor(lbl_player_one_make_10, useYell";
_func._setfontcolor /*String*/ (_lbl_player_one_make_10,_useyellow);
 //BA.debugLineNum = 500;BA.debugLine="func.setFontColor(lbl_player_one_make_1, useYello";
_func._setfontcolor /*String*/ (_lbl_player_one_make_1,_useyellow);
 //BA.debugLineNum = 502;BA.debugLine="func.setFontColor(lbl_player_two_make_100, useYel";
_func._setfontcolor /*String*/ (_lbl_player_two_make_100,_useyellow);
 //BA.debugLineNum = 503;BA.debugLine="func.setFontColor(lbl_player_two_make_10, useYell";
_func._setfontcolor /*String*/ (_lbl_player_two_make_10,_useyellow);
 //BA.debugLineNum = 504;BA.debugLine="func.setFontColor(lbl_player_two_make_1, useYello";
_func._setfontcolor /*String*/ (_lbl_player_two_make_1,_useyellow);
 //BA.debugLineNum = 505;BA.debugLine="End Sub";
return "";
}
}
