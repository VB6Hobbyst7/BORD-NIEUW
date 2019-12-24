package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class func extends Object{
public static func mostCurrent = new func();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.func", null);
		ba.loadHtSubs(func.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.func", ba);
		}
	}
    public static Class<?> getObject() {
		return func.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4a.keywords.StringBuilderWrapper _regexstr = null;
public static long _timelastclick = 0L;
public static boolean _setnieuwepartij = false;
public static boolean _hasinternetaccess = false;
public static boolean _newgameinitialized = false;
public static int _scoreplayerone = 0;
public static int _scoreplayertwo = 0;
public static int _p1innings = 0;
public static int _p2innings = 0;
public static int _innigs = 0;
public static int _inngset = 0;
public static int _make = 0;
public static int _playeronehs = 0;
public static int _playertwohs = 0;
public static int _score = 0;
public static int _playeronetomake = 0;
public static int _playertwotomake = 0;
public static int _p1hstemp = 0;
public static int _p2hstemp = 0;
public static anywheresoftware.b4j.objects.LabelWrapper _lblinnings = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_one_hs = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbl_player_two_hs = null;
public static anywheresoftware.b4j.objects.LabelWrapper _p1_1 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _p1_10 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _p1_100 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _p1_moyenne = null;
public static anywheresoftware.b4j.objects.LabelWrapper _p2_1 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _p2_10 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _p2_100 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _p2_moyenne = null;
public static float _p1_progress = 0f;
public static float _p2_progress = 0f;
public static b4j.example.b4xprogressbar _p1_progressbar = null;
public static b4j.example.b4xprogressbar _p2_progressbar = null;
public static String _os = "";
public static String _txtscore = "";
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.main _main = null;
public static b4j.example.scorebord _scorebord = null;
public static b4j.example.nieuwe_partij _nieuwe_partij = null;
public static b4j.example.parseconfig _parseconfig = null;
public static b4j.example.funcinet _funcinet = null;
public static b4j.example.getnode _getnode = null;
public static b4j.example.httputils2service _httputils2service = null;
public static String  _calcmoyennep2() throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "calcmoyennep2", false))
	 {return ((String) Debug.delegate(ba, "calcmoyennep2", null));}
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub calcMoyenneP2";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="If innigs > 0 Then";
if (_innigs>0) { 
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="p2_moyenne.Text = NumberFormat2((scorePlayerTwo/(";
_p2_moyenne.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)(_innigs-1)),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
 };
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="If playerTwoToMake > 0 Then";
if (_playertwotomake>0) { 
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="CallSub2(scorebord, \"playertwoPerc\", NumberForma";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playertwoPerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_playertwotomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="p2_progress = (scorePlayerTwo/playerTwoToMake)*1";
_p2_progress = (float) ((_scoreplayertwo/(double)_playertwotomake)*100);
 };
RDebugUtils.currentLine=5308424;
 //BA.debugLineNum = 5308424;BA.debugLine="setProgress(p2_progressBar, p2_progress)";
_setprogress(_p2_progressbar,_p2_progress);
RDebugUtils.currentLine=5308425;
 //BA.debugLineNum = 5308425;BA.debugLine="End Sub";
return "";
}
public static String  _padstring(String _padtext,String _padchr,int _padside,int _padcount) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "padstring", false))
	 {return ((String) Debug.delegate(ba, "padstring", new Object[] {_padtext,_padchr,_padside,_padcount}));}
String _padstr = "";
int _i = 0;
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub padString(padText As String ,padChr As";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Dim padStr As String";
_padstr = "";
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="If padText.Length = padCount Then";
if (_padtext.length()==_padcount) { 
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="Return padText";
if (true) return _padtext;
 };
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="For i = 1 To padCount-padText.Length";
{
final int step5 = 1;
final int limit5 = (int) (_padcount-_padtext.length());
_i = (int) (1) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=5046280;
 //BA.debugLineNum = 5046280;BA.debugLine="padStr = padStr&padChr";
_padstr = _padstr+_padchr;
 }
};
RDebugUtils.currentLine=5046283;
 //BA.debugLineNum = 5046283;BA.debugLine="If padSide = 0 Then";
if (_padside==0) { 
RDebugUtils.currentLine=5046284;
 //BA.debugLineNum = 5046284;BA.debugLine="Return padStr&padText";
if (true) return _padstr+_padtext;
 }else {
RDebugUtils.currentLine=5046286;
 //BA.debugLineNum = 5046286;BA.debugLine="Return padText&padStr";
if (true) return _padtext+_padstr;
 };
RDebugUtils.currentLine=5046289;
 //BA.debugLineNum = 5046289;BA.debugLine="End Sub";
return "";
}
public static String  _calcmoyenne(anywheresoftware.b4j.objects.LabelWrapper _mplayerone,anywheresoftware.b4j.objects.LabelWrapper _mplayertwo) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "calcmoyenne", false))
	 {return ((String) Debug.delegate(ba, "calcmoyenne", new Object[] {_mplayerone,_mplayertwo}));}
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Sub calcMoyenne(mPlayerOne As Label, mPlayerTwo As";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="mPlayerOne.Text = NumberFormat2((scorePlayerOne/i";
_mplayerone.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="mPlayerTwo.Text = NumberFormat2((scorePlayerTwo/i";
_mplayertwo.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="End Sub";
return "";
}
public static String  _processhs(String _player) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "processhs", false))
	 {return ((String) Debug.delegate(ba, "processhs", new Object[] {_player}));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Sub processHs(player As String)";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="If player = \"p1\" Then";
if ((_player).equals("p1")) { 
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="If p1HsTemp > 0 And p1HsTemp > playerOneHs Then";
if (_p1hstemp>0 && _p1hstemp>_playeronehs) { 
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="playerOneHs = p1HsTemp";
_playeronehs = _p1hstemp;
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="p1HsTemp = 0";
_p1hstemp = (int) (0);
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="lbl_player_one_hs.Text = padString(playerOneHs,";
_lbl_player_one_hs.setText(_padstring(BA.NumberToString(_playeronehs),"0",(int) (0),(int) (3)));
 };
 };
RDebugUtils.currentLine=5570570;
 //BA.debugLineNum = 5570570;BA.debugLine="If player = \"p2\" Then";
if ((_player).equals("p2")) { 
RDebugUtils.currentLine=5570571;
 //BA.debugLineNum = 5570571;BA.debugLine="If p2HsTemp > 0 And p2HsTemp > playerTwoHs Then";
if (_p2hstemp>0 && _p2hstemp>_playertwohs) { 
RDebugUtils.currentLine=5570572;
 //BA.debugLineNum = 5570572;BA.debugLine="playerTwoHs = p2HsTemp";
_playertwohs = _p2hstemp;
RDebugUtils.currentLine=5570573;
 //BA.debugLineNum = 5570573;BA.debugLine="p2HsTemp = 0";
_p2hstemp = (int) (0);
RDebugUtils.currentLine=5570574;
 //BA.debugLineNum = 5570574;BA.debugLine="lbl_player_two_hs.Text = padString(playerTwoHs,";
_lbl_player_two_hs.setText(_padstring(BA.NumberToString(_playertwohs),"0",(int) (0),(int) (3)));
 }else {
RDebugUtils.currentLine=5570577;
 //BA.debugLineNum = 5570577;BA.debugLine="lbl_player_two_hs.Text = padString(0, \"0\", 0, 3";
_lbl_player_two_hs.setText(_padstring(BA.NumberToString(0),"0",(int) (0),(int) (3)));
 };
 };
RDebugUtils.currentLine=5570581;
 //BA.debugLineNum = 5570581;BA.debugLine="If player = \"all\" Then";
if ((_player).equals("all")) { 
RDebugUtils.currentLine=5570588;
 //BA.debugLineNum = 5570588;BA.debugLine="If p1HsTemp > playerOneHs Then";
if (_p1hstemp>_playeronehs) { 
RDebugUtils.currentLine=5570589;
 //BA.debugLineNum = 5570589;BA.debugLine="playerOneHs = p1HsTemp";
_playeronehs = _p1hstemp;
RDebugUtils.currentLine=5570590;
 //BA.debugLineNum = 5570590;BA.debugLine="p1HsTemp = 0";
_p1hstemp = (int) (0);
RDebugUtils.currentLine=5570591;
 //BA.debugLineNum = 5570591;BA.debugLine="lbl_player_one_hs.Text = padString(playerOneHs,";
_lbl_player_one_hs.setText(_padstring(BA.NumberToString(_playeronehs),"0",(int) (0),(int) (3)));
 }else 
{RDebugUtils.currentLine=5570592;
 //BA.debugLineNum = 5570592;BA.debugLine="else If scorePlayerOne < playerOneHs Then";
if (_scoreplayerone<_playeronehs) { 
RDebugUtils.currentLine=5570593;
 //BA.debugLineNum = 5570593;BA.debugLine="playerOneHs = scorePlayerOne";
_playeronehs = _scoreplayerone;
RDebugUtils.currentLine=5570594;
 //BA.debugLineNum = 5570594;BA.debugLine="p1HsTemp = 0";
_p1hstemp = (int) (0);
RDebugUtils.currentLine=5570595;
 //BA.debugLineNum = 5570595;BA.debugLine="lbl_player_one_hs.Text = padString(playerOneHs,";
_lbl_player_one_hs.setText(_padstring(BA.NumberToString(_playeronehs),"0",(int) (0),(int) (3)));
 }}
;
 };
RDebugUtils.currentLine=5570599;
 //BA.debugLineNum = 5570599;BA.debugLine="If p2HsTemp > playerTwoHs Then";
if (_p2hstemp>_playertwohs) { 
RDebugUtils.currentLine=5570600;
 //BA.debugLineNum = 5570600;BA.debugLine="playerTwoHs = p2HsTemp";
_playertwohs = _p2hstemp;
RDebugUtils.currentLine=5570601;
 //BA.debugLineNum = 5570601;BA.debugLine="p2HsTemp = 0";
_p2hstemp = (int) (0);
RDebugUtils.currentLine=5570602;
 //BA.debugLineNum = 5570602;BA.debugLine="lbl_player_two_hs.Text = padString(playerTwoHs,";
_lbl_player_two_hs.setText(_padstring(BA.NumberToString(_playertwohs),"0",(int) (0),(int) (3)));
 }else 
{RDebugUtils.currentLine=5570603;
 //BA.debugLineNum = 5570603;BA.debugLine="Else If scorePlayerTwo < playerTwoHs Then";
if (_scoreplayertwo<_playertwohs) { 
RDebugUtils.currentLine=5570604;
 //BA.debugLineNum = 5570604;BA.debugLine="playerTwoHs = scorePlayerTwo";
_playertwohs = _scoreplayertwo;
RDebugUtils.currentLine=5570605;
 //BA.debugLineNum = 5570605;BA.debugLine="p2HsTemp = 0";
_p2hstemp = (int) (0);
RDebugUtils.currentLine=5570606;
 //BA.debugLineNum = 5570606;BA.debugLine="lbl_player_two_hs.Text = padString(playerTwoHs,";
_lbl_player_two_hs.setText(_padstring(BA.NumberToString(_playertwohs),"0",(int) (0),(int) (3)));
 }}
;
RDebugUtils.currentLine=5570623;
 //BA.debugLineNum = 5570623;BA.debugLine="End Sub";
return "";
}
public static String  _calcscoreplayerone(int _points,boolean _leftmouse) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "calcscoreplayerone", false))
	 {return ((String) Debug.delegate(ba, "calcscoreplayerone", new Object[] {_points,_leftmouse}));}
int _p1score = 0;
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Sub calcScorePlayerOne(points As Int, leftMouse As";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="If leftMouse = False Then";
if (_leftmouse==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="points = -Abs(points)";
_points = (int) (-anywheresoftware.b4a.keywords.Common.Abs(_points));
 };
RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="Dim P1Score As Int";
_p1score = 0;
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="CallSubDelayed(scorebord, \"lastClick\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(ba,(Object)(_scorebord.getObject()),"lastClick");
RDebugUtils.currentLine=5111818;
 //BA.debugLineNum = 5111818;BA.debugLine="P1Score		= p1_100.Text&p1_10.Text&p1_1.Text";
_p1score = (int)(Double.parseDouble(_p1_100.getText()+_p1_10.getText()+_p1_1.getText()));
RDebugUtils.currentLine=5111819;
 //BA.debugLineNum = 5111819;BA.debugLine="P1Score		= P1Score+points";
_p1score = (int) (_p1score+_points);
RDebugUtils.currentLine=5111821;
 //BA.debugLineNum = 5111821;BA.debugLine="If P1Score < playerOneHs And playerOneHs > 0 Then";
if (_p1score<_playeronehs && _playeronehs>0) { 
RDebugUtils.currentLine=5111822;
 //BA.debugLineNum = 5111822;BA.debugLine="playerOneHs = playerOneHs -1";
_playeronehs = (int) (_playeronehs-1);
RDebugUtils.currentLine=5111823;
 //BA.debugLineNum = 5111823;BA.debugLine="lbl_player_one_hs.Text = padString(playerOneHs,";
_lbl_player_one_hs.setText(_padstring(BA.NumberToString(_playeronehs),"0",(int) (0),(int) (3)));
 };
RDebugUtils.currentLine=5111827;
 //BA.debugLineNum = 5111827;BA.debugLine="If P1Score < 0 Then";
if (_p1score<0) { 
RDebugUtils.currentLine=5111829;
 //BA.debugLineNum = 5111829;BA.debugLine="P1Score = p1_100.Text&p1_10.Text&p1_1.Text";
_p1score = (int)(Double.parseDouble(_p1_100.getText()+_p1_10.getText()+_p1_1.getText()));
 };
RDebugUtils.currentLine=5111832;
 //BA.debugLineNum = 5111832;BA.debugLine="If P1Score > 9999 Then 'Or P1Score <= -1 Then";
if (_p1score>9999) { 
RDebugUtils.currentLine=5111833;
 //BA.debugLineNum = 5111833;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5111836;
 //BA.debugLineNum = 5111836;BA.debugLine="If P1Score < 0 Then";
if (_p1score<0) { 
RDebugUtils.currentLine=5111837;
 //BA.debugLineNum = 5111837;BA.debugLine="playerOneHs = 0";
_playeronehs = (int) (0);
RDebugUtils.currentLine=5111838;
 //BA.debugLineNum = 5111838;BA.debugLine="p1HsTemp = 0";
_p1hstemp = (int) (0);
RDebugUtils.currentLine=5111840;
 //BA.debugLineNum = 5111840;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5111844;
 //BA.debugLineNum = 5111844;BA.debugLine="p1HsTemp	= p1HsTemp + points";
_p1hstemp = (int) (_p1hstemp+_points);
RDebugUtils.currentLine=5111847;
 //BA.debugLineNum = 5111847;BA.debugLine="If p1HsTemp > playerOneHs Then";
if (_p1hstemp>_playeronehs) { 
RDebugUtils.currentLine=5111848;
 //BA.debugLineNum = 5111848;BA.debugLine="lbl_player_one_hs.Text = padString(p1HsTemp, \"0\"";
_lbl_player_one_hs.setText(_padstring(BA.NumberToString(_p1hstemp),"0",(int) (0),(int) (3)));
 };
RDebugUtils.currentLine=5111859;
 //BA.debugLineNum = 5111859;BA.debugLine="If lblInnings.Text = \"000\" Then";
if ((_lblinnings.getText()).equals("000")) { 
RDebugUtils.currentLine=5111860;
 //BA.debugLineNum = 5111860;BA.debugLine="lblInnings.Text	= \"001\"";
_lblinnings.setText("001");
RDebugUtils.currentLine=5111861;
 //BA.debugLineNum = 5111861;BA.debugLine="innigs			= 1";
_innigs = (int) (1);
RDebugUtils.currentLine=5111862;
 //BA.debugLineNum = 5111862;BA.debugLine="inngSet			= 1";
_inngset = (int) (1);
 };
RDebugUtils.currentLine=5111872;
 //BA.debugLineNum = 5111872;BA.debugLine="scorePlayerOne = P1Score";
_scoreplayerone = _p1score;
RDebugUtils.currentLine=5111873;
 //BA.debugLineNum = 5111873;BA.debugLine="txtScore = padString(P1Score, \"0\", 0, 4)";
_txtscore = _padstring(BA.NumberToString(_p1score),"0",(int) (0),(int) (4));
RDebugUtils.currentLine=5111875;
 //BA.debugLineNum = 5111875;BA.debugLine="p1_100.Text		= txtScore.SubString2(1,2)";
_p1_100.setText(_txtscore.substring((int) (1),(int) (2)));
RDebugUtils.currentLine=5111876;
 //BA.debugLineNum = 5111876;BA.debugLine="p1_10.Text		= txtScore.SubString2(2,3)";
_p1_10.setText(_txtscore.substring((int) (2),(int) (3)));
RDebugUtils.currentLine=5111877;
 //BA.debugLineNum = 5111877;BA.debugLine="p1_1.Text		= txtScore.SubString2(3,4)";
_p1_1.setText(_txtscore.substring((int) (3),(int) (4)));
RDebugUtils.currentLine=5111879;
 //BA.debugLineNum = 5111879;BA.debugLine="p1_moyenne.Text = NumberFormat2((scorePlayerOne/i";
_p1_moyenne.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=5111881;
 //BA.debugLineNum = 5111881;BA.debugLine="If playerOneToMake > 0 Then";
if (_playeronetomake>0) { 
RDebugUtils.currentLine=5111882;
 //BA.debugLineNum = 5111882;BA.debugLine="CallSub2(scorebord, \"playerOnePerc\", NumberForma";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerOnePerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_playeronetomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
RDebugUtils.currentLine=5111883;
 //BA.debugLineNum = 5111883;BA.debugLine="p1_progress = (scorePlayerOne/playerOneToMake)*10";
_p1_progress = (float) ((_scoreplayerone/(double)_playeronetomake)*100);
 };
RDebugUtils.currentLine=5111885;
 //BA.debugLineNum = 5111885;BA.debugLine="setProgress(p1_progressBar, p1_progress)";
_setprogress(_p1_progressbar,_p1_progress);
RDebugUtils.currentLine=5111886;
 //BA.debugLineNum = 5111886;BA.debugLine="checkMatchWon(\"p1\")";
_checkmatchwon("p1");
RDebugUtils.currentLine=5111888;
 //BA.debugLineNum = 5111888;BA.debugLine="End Sub";
return "";
}
public static String  _seths(String _hs,boolean _leftmouse) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "seths", false))
	 {return ((String) Debug.delegate(ba, "seths", new Object[] {_hs,_leftmouse}));}
int _value = 0;
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub setHs(hs As String, leftMouse As Boolea";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Dim value As Int = hs";
_value = (int)(Double.parseDouble(_hs));
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="If leftMouse Then";
if (_leftmouse) { 
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="value = value + 1";
_value = (int) (_value+1);
 }else {
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="value = value - 1";
_value = (int) (_value-1);
 };
RDebugUtils.currentLine=4653065;
 //BA.debugLineNum = 4653065;BA.debugLine="If value < 0 Then value = 0";
if (_value<0) { 
_value = (int) (0);};
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="If value > 999 Then value = 999";
if (_value>999) { 
_value = (int) (999);};
RDebugUtils.currentLine=4653068;
 //BA.debugLineNum = 4653068;BA.debugLine="Return padString(value, \"0\", 0, 3)";
if (true) return _padstring(BA.NumberToString(_value),"0",(int) (0),(int) (3));
RDebugUtils.currentLine=4653071;
 //BA.debugLineNum = 4653071;BA.debugLine="End Sub";
return "";
}
public static String  _playeronemake(anywheresoftware.b4j.objects.LabelWrapper _lbl100,anywheresoftware.b4j.objects.LabelWrapper _lbl10,anywheresoftware.b4j.objects.LabelWrapper _lbl1,boolean _leftbutton,int _number) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "playeronemake", false))
	 {return ((String) Debug.delegate(ba, "playeronemake", new Object[] {_lbl100,_lbl10,_lbl1,_leftbutton,_number}));}
String _strmaker = "";
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Sub playerOneMake(lbl100 As Label, lbl10 As Label,";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="Dim strMaker As String";
_strmaker = "";
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="make = $\"${lbl100.Text}${lbl10.Text}${lbl1.Text}\"";
_make = (int)(Double.parseDouble((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl100.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl10.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl1.getText()))+"")));
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="If leftButton Then";
if (_leftbutton) { 
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="make = make+number";
_make = (int) (_make+_number);
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="If make > 999 Then";
if (_make>999) { 
RDebugUtils.currentLine=5439495;
 //BA.debugLineNum = 5439495;BA.debugLine="Return";
if (true) return "";
 };
 }else {
RDebugUtils.currentLine=5439498;
 //BA.debugLineNum = 5439498;BA.debugLine="make = make-number";
_make = (int) (_make-_number);
RDebugUtils.currentLine=5439499;
 //BA.debugLineNum = 5439499;BA.debugLine="If make < 0 Then";
if (_make<0) { 
RDebugUtils.currentLine=5439500;
 //BA.debugLineNum = 5439500;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=5439505;
 //BA.debugLineNum = 5439505;BA.debugLine="strMaker	= padString(make, \"0\", 0, 3)";
_strmaker = _padstring(BA.NumberToString(_make),"0",(int) (0),(int) (3));
RDebugUtils.currentLine=5439506;
 //BA.debugLineNum = 5439506;BA.debugLine="lbl100.Text = strMaker.SubString2(0,1)";
_lbl100.setText(_strmaker.substring((int) (0),(int) (1)));
RDebugUtils.currentLine=5439507;
 //BA.debugLineNum = 5439507;BA.debugLine="lbl10.Text	= strMaker.SubString2(1,2)";
_lbl10.setText(_strmaker.substring((int) (1),(int) (2)));
RDebugUtils.currentLine=5439508;
 //BA.debugLineNum = 5439508;BA.debugLine="lbl1.Text	= strMaker.SubString2(2,3)";
_lbl1.setText(_strmaker.substring((int) (2),(int) (3)));
RDebugUtils.currentLine=5439510;
 //BA.debugLineNum = 5439510;BA.debugLine="playerOneToMake = make";
_playeronetomake = _make;
RDebugUtils.currentLine=5439511;
 //BA.debugLineNum = 5439511;BA.debugLine="If playerOneToMake > 0 Then";
if (_playeronetomake>0) { 
RDebugUtils.currentLine=5439512;
 //BA.debugLineNum = 5439512;BA.debugLine="p1_progress = (scorePlayerOne/playerOneToMake)*10";
_p1_progress = (float) ((_scoreplayerone/(double)_playeronetomake)*100);
RDebugUtils.currentLine=5439513;
 //BA.debugLineNum = 5439513;BA.debugLine="CallSub2(scorebord, \"playerOnePerc\", NumberFormat";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerOnePerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_playeronetomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
 }else {
RDebugUtils.currentLine=5439515;
 //BA.debugLineNum = 5439515;BA.debugLine="p1_progress = 0";
_p1_progress = (float) (0);
RDebugUtils.currentLine=5439516;
 //BA.debugLineNum = 5439516;BA.debugLine="CallSub2(scorebord, \"playerOnePerc\", \"n.v.t.\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerOnePerc",(Object)("n.v.t."));
 };
RDebugUtils.currentLine=5439518;
 //BA.debugLineNum = 5439518;BA.debugLine="setProgress(p1_progressBar, p1_progress)";
_setprogress(_p1_progressbar,_p1_progress);
RDebugUtils.currentLine=5439519;
 //BA.debugLineNum = 5439519;BA.debugLine="End Sub";
return "";
}
public static String  _calcscoreplayertwo(int _points,boolean _leftmouse) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "calcscoreplayertwo", false))
	 {return ((String) Debug.delegate(ba, "calcscoreplayertwo", new Object[] {_points,_leftmouse}));}
int _p2score = 0;
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub calcScorePlayertwo(points As Int, leftMouse As";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="If leftMouse = False Then";
if (_leftmouse==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="points = -Abs(points)";
_points = (int) (-anywheresoftware.b4a.keywords.Common.Abs(_points));
 };
RDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="Dim p2Score As Int";
_p2score = 0;
RDebugUtils.currentLine=5242887;
 //BA.debugLineNum = 5242887;BA.debugLine="CallSubDelayed(scorebord, \"lastClick\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(ba,(Object)(_scorebord.getObject()),"lastClick");
RDebugUtils.currentLine=5242890;
 //BA.debugLineNum = 5242890;BA.debugLine="inngSet = 0";
_inngset = (int) (0);
RDebugUtils.currentLine=5242893;
 //BA.debugLineNum = 5242893;BA.debugLine="p2HsTemp = p2HsTemp + points";
_p2hstemp = (int) (_p2hstemp+_points);
RDebugUtils.currentLine=5242897;
 //BA.debugLineNum = 5242897;BA.debugLine="p2Score = p2_100.Text&p2_10.Text&p2_1.Text";
_p2score = (int)(Double.parseDouble(_p2_100.getText()+_p2_10.getText()+_p2_1.getText()));
RDebugUtils.currentLine=5242898;
 //BA.debugLineNum = 5242898;BA.debugLine="p2Score = p2Score+points";
_p2score = (int) (_p2score+_points);
RDebugUtils.currentLine=5242900;
 //BA.debugLineNum = 5242900;BA.debugLine="If p2Score > 999 Then ' Or score <= -0 Then";
if (_p2score>999) { 
RDebugUtils.currentLine=5242901;
 //BA.debugLineNum = 5242901;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5242904;
 //BA.debugLineNum = 5242904;BA.debugLine="If p2Score < 0 Then";
if (_p2score<0) { 
RDebugUtils.currentLine=5242905;
 //BA.debugLineNum = 5242905;BA.debugLine="playerTwoHs = 0";
_playertwohs = (int) (0);
RDebugUtils.currentLine=5242906;
 //BA.debugLineNum = 5242906;BA.debugLine="p2HsTemp = 0";
_p2hstemp = (int) (0);
RDebugUtils.currentLine=5242908;
 //BA.debugLineNum = 5242908;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5242911;
 //BA.debugLineNum = 5242911;BA.debugLine="If lblInnings.Text = \"000\" Then";
if ((_lblinnings.getText()).equals("000")) { 
RDebugUtils.currentLine=5242912;
 //BA.debugLineNum = 5242912;BA.debugLine="lblInnings.Text	= \"001\"";
_lblinnings.setText("001");
RDebugUtils.currentLine=5242913;
 //BA.debugLineNum = 5242913;BA.debugLine="innigs			= 1";
_innigs = (int) (1);
RDebugUtils.currentLine=5242914;
 //BA.debugLineNum = 5242914;BA.debugLine="inngSet			= 1";
_inngset = (int) (1);
 };
RDebugUtils.currentLine=5242918;
 //BA.debugLineNum = 5242918;BA.debugLine="scorePlayerTwo	= p2Score";
_scoreplayertwo = _p2score;
RDebugUtils.currentLine=5242919;
 //BA.debugLineNum = 5242919;BA.debugLine="txtScore		= padString(p2Score, \"0\", 0, 4)";
_txtscore = _padstring(BA.NumberToString(_p2score),"0",(int) (0),(int) (4));
RDebugUtils.currentLine=5242921;
 //BA.debugLineNum = 5242921;BA.debugLine="p2_100.Text		= txtScore.SubString2(1,2)";
_p2_100.setText(_txtscore.substring((int) (1),(int) (2)));
RDebugUtils.currentLine=5242922;
 //BA.debugLineNum = 5242922;BA.debugLine="p2_10.Text		= txtScore.SubString2(2,3)";
_p2_10.setText(_txtscore.substring((int) (2),(int) (3)));
RDebugUtils.currentLine=5242923;
 //BA.debugLineNum = 5242923;BA.debugLine="p2_1.Text		= txtScore.SubString2(3,4)";
_p2_1.setText(_txtscore.substring((int) (3),(int) (4)));
RDebugUtils.currentLine=5242925;
 //BA.debugLineNum = 5242925;BA.debugLine="p2_moyenne.Text = NumberFormat2((scorePlayerTwo/i";
_p2_moyenne.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=5242926;
 //BA.debugLineNum = 5242926;BA.debugLine="If playerTwoToMake > 0 Then";
if (_playertwotomake>0) { 
RDebugUtils.currentLine=5242927;
 //BA.debugLineNum = 5242927;BA.debugLine="CallSub2(scorebord, \"playerTwoPerc\", NumberForma";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerTwoPerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_playertwotomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
RDebugUtils.currentLine=5242928;
 //BA.debugLineNum = 5242928;BA.debugLine="p2_progress = (scorePlayerTwo/playerTwoToMake)*1";
_p2_progress = (float) ((_scoreplayertwo/(double)_playertwotomake)*100);
 };
RDebugUtils.currentLine=5242930;
 //BA.debugLineNum = 5242930;BA.debugLine="setProgress(p2_progressBar, p2_progress)";
_setprogress(_p2_progressbar,_p2_progress);
RDebugUtils.currentLine=5242932;
 //BA.debugLineNum = 5242932;BA.debugLine="checkMatchWon(\"p2\")";
_checkmatchwon("p2");
RDebugUtils.currentLine=5242934;
 //BA.debugLineNum = 5242934;BA.debugLine="End Sub";
return "";
}
public static String  _playertwomake(anywheresoftware.b4j.objects.LabelWrapper _lbl100,anywheresoftware.b4j.objects.LabelWrapper _lbl10,anywheresoftware.b4j.objects.LabelWrapper _lbl1,boolean _leftbutton,int _number) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "playertwomake", false))
	 {return ((String) Debug.delegate(ba, "playertwomake", new Object[] {_lbl100,_lbl10,_lbl1,_leftbutton,_number}));}
String _strmaker = "";
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Sub playerTwoMake(lbl100 As Label, lbl10 As Label,";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Dim strMaker As String";
_strmaker = "";
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="make = $\"${lbl100.Text}${lbl10.Text}${lbl1.Text}\"";
_make = (int)(Double.parseDouble((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl100.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl10.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl1.getText()))+"")));
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="If leftButton Then";
if (_leftbutton) { 
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="make = make+number";
_make = (int) (_make+_number);
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="If make > 999 Then";
if (_make>999) { 
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="Return";
if (true) return "";
 };
 }else {
RDebugUtils.currentLine=5505034;
 //BA.debugLineNum = 5505034;BA.debugLine="make = make-number";
_make = (int) (_make-_number);
RDebugUtils.currentLine=5505035;
 //BA.debugLineNum = 5505035;BA.debugLine="If make < 0 Then";
if (_make<0) { 
RDebugUtils.currentLine=5505036;
 //BA.debugLineNum = 5505036;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=5505041;
 //BA.debugLineNum = 5505041;BA.debugLine="strMaker	= padString(make, \"0\", 0, 3)";
_strmaker = _padstring(BA.NumberToString(_make),"0",(int) (0),(int) (3));
RDebugUtils.currentLine=5505042;
 //BA.debugLineNum = 5505042;BA.debugLine="lbl100.Text = strMaker.SubString2(0,1)";
_lbl100.setText(_strmaker.substring((int) (0),(int) (1)));
RDebugUtils.currentLine=5505043;
 //BA.debugLineNum = 5505043;BA.debugLine="lbl10.Text	= strMaker.SubString2(1,2)";
_lbl10.setText(_strmaker.substring((int) (1),(int) (2)));
RDebugUtils.currentLine=5505044;
 //BA.debugLineNum = 5505044;BA.debugLine="lbl1.Text	= strMaker.SubString2(2,3)";
_lbl1.setText(_strmaker.substring((int) (2),(int) (3)));
RDebugUtils.currentLine=5505046;
 //BA.debugLineNum = 5505046;BA.debugLine="playerTwoToMake = make";
_playertwotomake = _make;
RDebugUtils.currentLine=5505047;
 //BA.debugLineNum = 5505047;BA.debugLine="If playerTwoToMake > 0 Then";
if (_playertwotomake>0) { 
RDebugUtils.currentLine=5505048;
 //BA.debugLineNum = 5505048;BA.debugLine="p2_progress = (scorePlayerTwo/playerTwoToMake)*1";
_p2_progress = (float) ((_scoreplayertwo/(double)_playertwotomake)*100);
RDebugUtils.currentLine=5505049;
 //BA.debugLineNum = 5505049;BA.debugLine="setProgress(p2_progressBar, p2_progress)";
_setprogress(_p2_progressbar,_p2_progress);
RDebugUtils.currentLine=5505050;
 //BA.debugLineNum = 5505050;BA.debugLine="CallSub2(scorebord, \"playerTwoPerc\", NumberForma";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerTwoPerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_playertwotomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
 }else {
RDebugUtils.currentLine=5505052;
 //BA.debugLineNum = 5505052;BA.debugLine="p2_progress = 0";
_p2_progress = (float) (0);
RDebugUtils.currentLine=5505053;
 //BA.debugLineNum = 5505053;BA.debugLine="setProgress(p2_progressBar, p2_progress)";
_setprogress(_p2_progressbar,_p2_progress);
RDebugUtils.currentLine=5505054;
 //BA.debugLineNum = 5505054;BA.debugLine="CallSub2(scorebord, \"playerTwoPerc\", \"n.v.t\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerTwoPerc",(Object)("n.v.t"));
 };
RDebugUtils.currentLine=5505056;
 //BA.debugLineNum = 5505056;BA.debugLine="End Sub";
return "";
}
public static String  _calcmoyennep1() throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "calcmoyennep1", false))
	 {return ((String) Debug.delegate(ba, "calcmoyennep1", null));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Sub calcMoyenneP1";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="p1_moyenne.Text = NumberFormat2((scorePlayerOne/i";
_p1_moyenne.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="If playerOneToMake > 0 Then";
if (_playeronetomake>0) { 
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="CallSub2(scorebord, \"playerOnePerc\", NumberForma";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerOnePerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_playeronetomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="p1_progress = (scorePlayerOne/playerOneToMake)*1";
_p1_progress = (float) ((_scoreplayerone/(double)_playeronetomake)*100);
 };
RDebugUtils.currentLine=5177350;
 //BA.debugLineNum = 5177350;BA.debugLine="setProgress(p1_progressBar, p1_progress)";
_setprogress(_p1_progressbar,_p1_progress);
RDebugUtils.currentLine=5177351;
 //BA.debugLineNum = 5177351;BA.debugLine="End Sub";
return "";
}
public static String  _caromlabelcss(anywheresoftware.b4j.objects.LabelWrapper _lbl,String _style) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "caromlabelcss", false))
	 {return ((String) Debug.delegate(ba, "caromlabelcss", new Object[] {_lbl,_style}));}
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Sub caromLabelCss(lbl As Label, style As String)";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="lbl.StyleClasses.Add(style)";
_lbl.getStyleClasses().Add((Object)(_style));
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="End Sub";
return "";
}
public static String  _getipnumber() throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "getipnumber", false))
	 {return ((String) Debug.delegate(ba, "getipnumber", null));}
anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper _server = null;
anywheresoftware.b4a.objects.collections.List _components = null;
String _ip = "";
String _ipstr = "";
int _i = 0;
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Sub getIpNumber As String";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="Dim Server As ServerSocket";
_server = new anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper();
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="Dim components As List";
_components = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="Dim Ip, ipStr As String";
_ip = "";
_ipstr = "";
RDebugUtils.currentLine=6094853;
 //BA.debugLineNum = 6094853;BA.debugLine="ipStr = \"\"";
_ipstr = "";
RDebugUtils.currentLine=6094854;
 //BA.debugLineNum = 6094854;BA.debugLine="Server.Initialize(50000, Me)";
_server.Initialize(ba,(int) (50000),BA.ObjectToString(func.getObject()));
RDebugUtils.currentLine=6094855;
 //BA.debugLineNum = 6094855;BA.debugLine="Ip = Server.GetMyIP";
_ip = _server.GetMyIP();
RDebugUtils.currentLine=6094856;
 //BA.debugLineNum = 6094856;BA.debugLine="components.Initialize";
_components.Initialize();
RDebugUtils.currentLine=6094858;
 //BA.debugLineNum = 6094858;BA.debugLine="For i = 0 To Ip.Length - 1";
{
final int step8 = 1;
final int limit8 = (int) (_ip.length()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=6094859;
 //BA.debugLineNum = 6094859;BA.debugLine="If Ip.SubString2(i,i+1) = \".\" Then";
if ((_ip.substring(_i,(int) (_i+1))).equals(".")) { 
RDebugUtils.currentLine=6094860;
 //BA.debugLineNum = 6094860;BA.debugLine="ipStr = ipStr &	\",\"";
_ipstr = _ipstr+",";
 }else {
RDebugUtils.currentLine=6094862;
 //BA.debugLineNum = 6094862;BA.debugLine="ipStr = ipStr &	Ip.SubString2(i,i+1)";
_ipstr = _ipstr+_ip.substring(_i,(int) (_i+1));
 };
 }
};
RDebugUtils.currentLine=6094865;
 //BA.debugLineNum = 6094865;BA.debugLine="components = Regex.Split(\",\", ipStr)";
_components = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split(",",_ipstr));
RDebugUtils.currentLine=6094867;
 //BA.debugLineNum = 6094867;BA.debugLine="Return components.Get(3)";
if (true) return BA.ObjectToString(_components.Get((int) (3)));
RDebugUtils.currentLine=6094868;
 //BA.debugLineNum = 6094868;BA.debugLine="End Sub";
return "";
}
public static String  _setcustomcursor1(String _dir,String _filename,double _hotspotx,double _hotspoty,anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _targetnode) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setcustomcursor1", false))
	 {return ((String) Debug.delegate(ba, "setcustomcursor1", new Object[] {_dir,_filename,_hotspotx,_hotspoty,_targetnode}));}
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _img = null;
anywheresoftware.b4j.object.JavaObject _cursor = null;
anywheresoftware.b4j.object.JavaObject _joscene = null;
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Sub SetCustomCursor1(Dir As String, Filename As St";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Dim img As Image";
_img = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="img.Initialize(Dir, Filename)";
_img.Initialize(_dir,_filename);
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="Dim cursor As JavaObject";
_cursor = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="cursor.InitializeNewInstance(\"javafx.scene.ImageC";
_cursor.InitializeNewInstance("javafx.scene.ImageCursor",new Object[]{(Object)(_img.getObject()),(Object)(_hotspotx),(Object)(_hotspoty)});
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="Dim joScene As JavaObject = TargetNode";
_joscene = new anywheresoftware.b4j.object.JavaObject();
_joscene.setObject((java.lang.Object)(_targetnode.getObject()));
RDebugUtils.currentLine=5701638;
 //BA.debugLineNum = 5701638;BA.debugLine="joScene.RunMethod(\"setCursor\", Array(cursor))";
_joscene.RunMethod("setCursor",new Object[]{(Object)(_cursor.getObject())});
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="End Sub";
return "";
}
public static String  _getversion() throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "getversion", false))
	 {return ((String) Debug.delegate(ba, "getversion", null));}
String _version = "";
String _apppath = "";
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub getVersion As String";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Dim version, os, appPath As String";
_version = "";
_os = "";
_apppath = "";
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="os = DetectOS";
_os = _detectos();
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="Select os";
switch (BA.switchObjectToInt(_os,"windows","linux")) {
case 0: {
RDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="appPath = File.DirApp&\"\\44\\\"";
_apppath = anywheresoftware.b4a.keywords.Common.File.getDirApp()+"\\44\\";
 break; }
case 1: {
RDebugUtils.currentLine=5963783;
 //BA.debugLineNum = 5963783;BA.debugLine="appPath = File.DirApp&\"/44/\"";
_apppath = anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/44/";
 break; }
}
;
RDebugUtils.currentLine=5963786;
 //BA.debugLineNum = 5963786;BA.debugLine="version = File.ReadString(appPath, \"ver.pdg\")";
_version = anywheresoftware.b4a.keywords.Common.File.ReadString(_apppath,"ver.pdg");
RDebugUtils.currentLine=5963788;
 //BA.debugLineNum = 5963788;BA.debugLine="Return $\" v ${version.Trim}\"$";
if (true) return (" v "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_version.trim()))+"");
RDebugUtils.currentLine=5963790;
 //BA.debugLineNum = 5963790;BA.debugLine="End Sub";
return "";
}
public static String  _setp1caromlables(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setp1caromlables", false))
	 {return ((String) Debug.delegate(ba, "setp1caromlables", new Object[] {_lst}));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub setP1CaromLables(lst As List)";
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="p1_100		= lst.Get(2)";
_p1_100.setObject((javafx.scene.control.Label)(_lst.Get((int) (2))));
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="p1_10		= lst.Get(1)";
_p1_10.setObject((javafx.scene.control.Label)(_lst.Get((int) (1))));
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="p1_1		= lst.Get(0)";
_p1_1.setObject((javafx.scene.control.Label)(_lst.Get((int) (0))));
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="p1_moyenne	= lst.Get(3)";
_p1_moyenne.setObject((javafx.scene.control.Label)(_lst.Get((int) (3))));
RDebugUtils.currentLine=4784134;
 //BA.debugLineNum = 4784134;BA.debugLine="p1_progressBar = lst.Get(4)";
_p1_progressbar = (b4j.example.b4xprogressbar)(_lst.Get((int) (4)));
RDebugUtils.currentLine=4784135;
 //BA.debugLineNum = 4784135;BA.debugLine="End Sub";
return "";
}
public static String  _setp2caromlables(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setp2caromlables", false))
	 {return ((String) Debug.delegate(ba, "setp2caromlables", new Object[] {_lst}));}
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub setP2CaromLables(lst As List)";
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="p2_100		= lst.Get(2)";
_p2_100.setObject((javafx.scene.control.Label)(_lst.Get((int) (2))));
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="p2_10		= lst.Get(1)";
_p2_10.setObject((javafx.scene.control.Label)(_lst.Get((int) (1))));
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="p2_1		= lst.Get(0)";
_p2_1.setObject((javafx.scene.control.Label)(_lst.Get((int) (0))));
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="p2_moyenne	= lst.Get(3)";
_p2_moyenne.setObject((javafx.scene.control.Label)(_lst.Get((int) (3))));
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="p2_progressBar	= lst.Get(4)";
_p2_progressbar = (b4j.example.b4xprogressbar)(_lst.Get((int) (4)));
RDebugUtils.currentLine=4849671;
 //BA.debugLineNum = 4849671;BA.debugLine="End Sub";
return "";
}
public static String  _setfont(anywheresoftware.b4j.objects.LabelWrapper _lbl,int _size,boolean _digital) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setfont", false))
	 {return ((String) Debug.delegate(ba, "setfont", new Object[] {_lbl,_size,_digital}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub setFont(lbl As Label, size As Int, digi";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Dim jo As JavaObject=lbl";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="If digital Then";
if (_digital) { 
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="jo.runMethod(\"setFont\",Array(fx.LoadFont(File.Di";
_jo.RunMethod("setFont",new Object[]{(Object)(_fx.LoadFont(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"digital-7 (mono).ttf",_size).getObject())});
 }else {
RDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="jo.runMethod(\"setFont\",Array(fx.LoadFont(File.Di";
_jo.RunMethod("setFont",new Object[]{(Object)(_fx.LoadFont(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"Crasng.ttf",_size).getObject())});
 };
RDebugUtils.currentLine=4915209;
 //BA.debugLineNum = 4915209;BA.debugLine="End Sub";
return "";
}
public static String  _setfontcolor(anywheresoftware.b4j.objects.LabelWrapper _lbl,boolean _yellow) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setfontcolor", false))
	 {return ((String) Debug.delegate(ba, "setfontcolor", new Object[] {_lbl,_yellow}));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub setFontColor(lbl As Label, yellow As Bo";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="If yellow Then";
if (_yellow) { 
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="lbl.Style = \"-fx-text-fill: #ffff00;\" '= fx.Colo";
_lbl.setStyle("-fx-text-fill: #ffff00;");
 }else {
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="lbl.Style = \"-fx-text-fill: #ffffff;\"";
_lbl.setStyle("-fx-text-fill: #ffffff;");
 };
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="End Sub";
return "";
}
public static String  _testnumber(String _oldstringtotest,String _newstringtotest) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "testnumber", false))
	 {return ((String) Debug.delegate(ba, "testnumber", new Object[] {_oldstringtotest,_newstringtotest}));}
String _stringtotest = "";
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub testNumber(oldStringToTest As String, n";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Dim stringToTest As String";
_stringtotest = "";
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="If newStringToTest.Length = 1 Then";
if (_newstringtotest.length()==1) { 
RDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="stringToTest = newStringToTest";
_stringtotest = _newstringtotest;
 }else {
RDebugUtils.currentLine=4718598;
 //BA.debugLineNum = 4718598;BA.debugLine="stringToTest = 	newStringToTest.Replace(oldStrin";
_stringtotest = _newstringtotest.replace(_oldstringtotest,"");
 };
RDebugUtils.currentLine=4718601;
 //BA.debugLineNum = 4718601;BA.debugLine="regexStr.Initialize";
_regexstr.Initialize();
RDebugUtils.currentLine=4718602;
 //BA.debugLineNum = 4718602;BA.debugLine="regexStr.Append(\"[0-9]*\\.[0-9]*|[0-9]*\")";
_regexstr.Append("[0-9]*\\.[0-9]*|[0-9]*");
RDebugUtils.currentLine=4718604;
 //BA.debugLineNum = 4718604;BA.debugLine="If Regex.IsMatch(regexStr.ToString,stringToTest)";
if (anywheresoftware.b4a.keywords.Common.Regex.IsMatch(_regexstr.ToString(),_stringtotest)==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=4718605;
 //BA.debugLineNum = 4718605;BA.debugLine="Return newStringToTest";
if (true) return _newstringtotest;
 }else {
RDebugUtils.currentLine=4718607;
 //BA.debugLineNum = 4718607;BA.debugLine="Return oldStringToTest";
if (true) return _oldstringtotest;
 };
RDebugUtils.currentLine=4718610;
 //BA.debugLineNum = 4718610;BA.debugLine="End Sub";
return "";
}
public static void  _animacao_rotacao(anywheresoftware.b4a.objects.B4XViewWrapper _v,int _duration,int _degrees) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "animacao_rotacao", false))
	 {Debug.delegate(ba, "animacao_rotacao", new Object[] {_v,_duration,_degrees}); return;}
ResumableSub_Animacao_Rotacao rsub = new ResumableSub_Animacao_Rotacao(null,_v,_duration,_degrees);
rsub.resume(ba, null);
}
public static class ResumableSub_Animacao_Rotacao extends BA.ResumableSub {
public ResumableSub_Animacao_Rotacao(b4j.example.func parent,anywheresoftware.b4a.objects.B4XViewWrapper _v,int _duration,int _degrees) {
this.parent = parent;
this._v = _v;
this._duration = _duration;
this._degrees = _degrees;
}
b4j.example.func parent;
anywheresoftware.b4a.objects.B4XViewWrapper _v;
int _duration;
int _degrees;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="func";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="v.SetRotationAnimated(duration, degrees)";
_v.SetRotationAnimated(_duration,_degrees);
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="Sleep(duration + 20) '+20 to make sure that the n";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "func", "animacao_rotacao"),(int) (_duration+20));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="v.Rotation = 0";
_v.setRotation(0);
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _setprogress(b4j.example.b4xprogressbar _v,float _progress) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setprogress", false))
	 {return ((String) Debug.delegate(ba, "setprogress", new Object[] {_v,_progress}));}
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Sub setProgress(v As B4XProgressBar, progress As F";
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="v.Progress = progress";
_v._setprogress /*float*/ (null,_progress);
RDebugUtils.currentLine=5832709;
 //BA.debugLineNum = 5832709;BA.debugLine="End Sub";
return "";
}
public static String  _checkmatchwon(String _player) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "checkmatchwon", false))
	 {return ((String) Debug.delegate(ba, "checkmatchwon", new Object[] {_player}));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Sub checkMatchWon(player As String)";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="If player = \"p1\" Then";
if ((_player).equals("p1")) { 
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="CallSub(scorebord, \"checkMatchWonP1\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(ba,(Object)(_scorebord.getObject()),"checkMatchWonP1");
 };
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="If player = \"p2\" Then";
if ((_player).equals("p2")) { 
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="processHs(\"p2\")";
_processhs("p2");
RDebugUtils.currentLine=5636103;
 //BA.debugLineNum = 5636103;BA.debugLine="CallSub(scorebord, \"checkMatchWonP2\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(ba,(Object)(_scorebord.getObject()),"checkMatchWonP2");
 };
RDebugUtils.currentLine=5636105;
 //BA.debugLineNum = 5636105;BA.debugLine="End Sub";
return "";
}
public static String  _detectos() throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "detectos", false))
	 {return ((String) Debug.delegate(ba, "detectos", null));}
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Sub DetectOS As String";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="Dim os As String = GetSystemProperty(\"os.name\", \"";
_os = anywheresoftware.b4a.keywords.Common.GetSystemProperty("os.name","").toLowerCase();
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="If os.Contains(\"win\") Then";
if (_os.contains("win")) { 
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="Return \"windows\"";
if (true) return "windows";
 }else 
{RDebugUtils.currentLine=6029316;
 //BA.debugLineNum = 6029316;BA.debugLine="Else If os.Contains(\"mac\") Then";
if (_os.contains("mac")) { 
RDebugUtils.currentLine=6029317;
 //BA.debugLineNum = 6029317;BA.debugLine="Return \"mac\"";
if (true) return "mac";
 }else {
RDebugUtils.currentLine=6029319;
 //BA.debugLineNum = 6029319;BA.debugLine="Return \"linux\"";
if (true) return "linux";
 }}
;
RDebugUtils.currentLine=6029321;
 //BA.debugLineNum = 6029321;BA.debugLine="End Sub";
return "";
}
}