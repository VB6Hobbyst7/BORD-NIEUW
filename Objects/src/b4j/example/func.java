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
public static anywheresoftware.b4j.objects.LabelWrapper _p1_1000 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _p1_moyenne = null;
public static anywheresoftware.b4j.objects.LabelWrapper _p2_1 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _p2_10 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _p2_100 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _p2_1000 = null;
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
public static b4j.example.getnode _getnode = null;
public static b4j.example.funcinet _funcinet = null;
public static b4j.example.httputils2service _httputils2service = null;
public static String  _padstring(String _padtext,String _padchr,int _padside,int _padcount) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "padstring", false))
	 {return ((String) Debug.delegate(ba, "padstring", new Object[] {_padtext,_padchr,_padside,_padcount}));}
String _padstr = "";
int _i = 0;
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub padString(padText As String ,padChr As";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="Dim padStr As String";
_padstr = "";
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="If padText.Length = padCount Then";
if (_padtext.length()==_padcount) { 
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="Return padText";
if (true) return _padtext;
 };
RDebugUtils.currentLine=5177351;
 //BA.debugLineNum = 5177351;BA.debugLine="For i = 1 To padCount-padText.Length";
{
final int step5 = 1;
final int limit5 = (int) (_padcount-_padtext.length());
_i = (int) (1) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=5177352;
 //BA.debugLineNum = 5177352;BA.debugLine="padStr = padStr&padChr";
_padstr = _padstr+_padchr;
 }
};
RDebugUtils.currentLine=5177355;
 //BA.debugLineNum = 5177355;BA.debugLine="If padSide = 0 Then";
if (_padside==0) { 
RDebugUtils.currentLine=5177356;
 //BA.debugLineNum = 5177356;BA.debugLine="Return padStr&padText";
if (true) return _padstr+_padtext;
 }else {
RDebugUtils.currentLine=5177358;
 //BA.debugLineNum = 5177358;BA.debugLine="Return padText&padStr";
if (true) return _padtext+_padstr;
 };
RDebugUtils.currentLine=5177361;
 //BA.debugLineNum = 5177361;BA.debugLine="End Sub";
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
public static String  _calcscoreplayerone(int _points) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "calcscoreplayerone", false))
	 {return ((String) Debug.delegate(ba, "calcscoreplayerone", new Object[] {_points}));}
int _p1score = 0;
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub calcScorePlayerOne(points As Int)";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Dim P1Score As Int";
_p1score = 0;
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="CallSubDelayed(scorebord, \"lastClick\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(ba,(Object)(_scorebord.getObject()),"lastClick");
RDebugUtils.currentLine=5242886;
 //BA.debugLineNum = 5242886;BA.debugLine="P1Score		= p1_100.Text&p1_10.Text&p1_1.Text";
_p1score = (int)(Double.parseDouble(_p1_100.getText()+_p1_10.getText()+_p1_1.getText()));
RDebugUtils.currentLine=5242887;
 //BA.debugLineNum = 5242887;BA.debugLine="P1Score		= P1Score+points";
_p1score = (int) (_p1score+_points);
RDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="If P1Score < 0 Then";
if (_p1score<0) { 
RDebugUtils.currentLine=5242891;
 //BA.debugLineNum = 5242891;BA.debugLine="P1Score = p1_100.Text&p1_10.Text&p1_1.Text";
_p1score = (int)(Double.parseDouble(_p1_100.getText()+_p1_10.getText()+_p1_1.getText()));
 };
RDebugUtils.currentLine=5242894;
 //BA.debugLineNum = 5242894;BA.debugLine="If P1Score > 9999 Then 'Or P1Score <= -1 Then";
if (_p1score>9999) { 
RDebugUtils.currentLine=5242895;
 //BA.debugLineNum = 5242895;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5242898;
 //BA.debugLineNum = 5242898;BA.debugLine="If P1Score < 0 Then";
if (_p1score<0) { 
RDebugUtils.currentLine=5242899;
 //BA.debugLineNum = 5242899;BA.debugLine="playerOneHs = 0";
_playeronehs = (int) (0);
RDebugUtils.currentLine=5242900;
 //BA.debugLineNum = 5242900;BA.debugLine="p1HsTemp = 0";
_p1hstemp = (int) (0);
RDebugUtils.currentLine=5242902;
 //BA.debugLineNum = 5242902;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5242906;
 //BA.debugLineNum = 5242906;BA.debugLine="p1HsTemp	= p1HsTemp + points";
_p1hstemp = (int) (_p1hstemp+_points);
RDebugUtils.currentLine=5242914;
 //BA.debugLineNum = 5242914;BA.debugLine="If lblInnings.Text = \"000\" Then";
if ((_lblinnings.getText()).equals("000")) { 
RDebugUtils.currentLine=5242915;
 //BA.debugLineNum = 5242915;BA.debugLine="lblInnings.Text	= \"001\"";
_lblinnings.setText("001");
RDebugUtils.currentLine=5242916;
 //BA.debugLineNum = 5242916;BA.debugLine="innigs			= 1";
_innigs = (int) (1);
RDebugUtils.currentLine=5242917;
 //BA.debugLineNum = 5242917;BA.debugLine="inngSet			= 1";
_inngset = (int) (1);
 };
RDebugUtils.currentLine=5242927;
 //BA.debugLineNum = 5242927;BA.debugLine="scorePlayerOne = P1Score";
_scoreplayerone = _p1score;
RDebugUtils.currentLine=5242928;
 //BA.debugLineNum = 5242928;BA.debugLine="txtScore = padString(P1Score, \"0\", 0, 4)";
_txtscore = _padstring(BA.NumberToString(_p1score),"0",(int) (0),(int) (4));
RDebugUtils.currentLine=5242931;
 //BA.debugLineNum = 5242931;BA.debugLine="p1_100.Text		= txtScore.SubString2(1,2)";
_p1_100.setText(_txtscore.substring((int) (1),(int) (2)));
RDebugUtils.currentLine=5242932;
 //BA.debugLineNum = 5242932;BA.debugLine="p1_10.Text		= txtScore.SubString2(2,3)";
_p1_10.setText(_txtscore.substring((int) (2),(int) (3)));
RDebugUtils.currentLine=5242933;
 //BA.debugLineNum = 5242933;BA.debugLine="p1_1.Text		= txtScore.SubString2(3,4)";
_p1_1.setText(_txtscore.substring((int) (3),(int) (4)));
RDebugUtils.currentLine=5242935;
 //BA.debugLineNum = 5242935;BA.debugLine="p1_moyenne.Text = NumberFormat2((scorePlayerOne/i";
_p1_moyenne.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=5242937;
 //BA.debugLineNum = 5242937;BA.debugLine="If playerOneToMake > 0 Then";
if (_playeronetomake>0) { 
RDebugUtils.currentLine=5242938;
 //BA.debugLineNum = 5242938;BA.debugLine="CallSub2(scorebord, \"playerOnePerc\", NumberForma";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerOnePerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_playeronetomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
RDebugUtils.currentLine=5242939;
 //BA.debugLineNum = 5242939;BA.debugLine="p1_progress = (scorePlayerOne/playerOneToMake)*1";
_p1_progress = (float) ((_scoreplayerone/(double)_playeronetomake)*100);
 };
RDebugUtils.currentLine=5242941;
 //BA.debugLineNum = 5242941;BA.debugLine="setProgress(p1_progressBar, p1_progress)";
_setprogress(_p1_progressbar,_p1_progress);
RDebugUtils.currentLine=5242942;
 //BA.debugLineNum = 5242942;BA.debugLine="checkMatchWon(\"p1\")";
_checkmatchwon("p1");
RDebugUtils.currentLine=5242944;
 //BA.debugLineNum = 5242944;BA.debugLine="End Sub";
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
public static String  _calcscoreplayertwo(int _points) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "calcscoreplayertwo", false))
	 {return ((String) Debug.delegate(ba, "calcscoreplayertwo", new Object[] {_points}));}
int _p2score = 0;
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub calcScorePlayertwo(points As Int)";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Dim p2Score As Int";
_p2score = 0;
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="CallSubDelayed(scorebord, \"lastClick\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(ba,(Object)(_scorebord.getObject()),"lastClick");
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="inngSet = 0";
_inngset = (int) (0);
RDebugUtils.currentLine=5308425;
 //BA.debugLineNum = 5308425;BA.debugLine="p2HsTemp = p2HsTemp + points";
_p2hstemp = (int) (_p2hstemp+_points);
RDebugUtils.currentLine=5308429;
 //BA.debugLineNum = 5308429;BA.debugLine="p2Score = p2_100.Text&p2_10.Text&p2_1.Text";
_p2score = (int)(Double.parseDouble(_p2_100.getText()+_p2_10.getText()+_p2_1.getText()));
RDebugUtils.currentLine=5308430;
 //BA.debugLineNum = 5308430;BA.debugLine="p2Score = p2Score+points";
_p2score = (int) (_p2score+_points);
RDebugUtils.currentLine=5308432;
 //BA.debugLineNum = 5308432;BA.debugLine="If p2Score > 999 Then ' Or score <= -0 Then";
if (_p2score>999) { 
RDebugUtils.currentLine=5308433;
 //BA.debugLineNum = 5308433;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5308436;
 //BA.debugLineNum = 5308436;BA.debugLine="If p2Score < 0 Then";
if (_p2score<0) { 
RDebugUtils.currentLine=5308437;
 //BA.debugLineNum = 5308437;BA.debugLine="playerTwoHs = 0";
_playertwohs = (int) (0);
RDebugUtils.currentLine=5308438;
 //BA.debugLineNum = 5308438;BA.debugLine="p2HsTemp = 0";
_p2hstemp = (int) (0);
RDebugUtils.currentLine=5308440;
 //BA.debugLineNum = 5308440;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5308443;
 //BA.debugLineNum = 5308443;BA.debugLine="If lblInnings.Text = \"000\" Then";
if ((_lblinnings.getText()).equals("000")) { 
RDebugUtils.currentLine=5308444;
 //BA.debugLineNum = 5308444;BA.debugLine="lblInnings.Text	= \"001\"";
_lblinnings.setText("001");
RDebugUtils.currentLine=5308445;
 //BA.debugLineNum = 5308445;BA.debugLine="innigs			= 1";
_innigs = (int) (1);
RDebugUtils.currentLine=5308446;
 //BA.debugLineNum = 5308446;BA.debugLine="inngSet			= 1";
_inngset = (int) (1);
 };
RDebugUtils.currentLine=5308450;
 //BA.debugLineNum = 5308450;BA.debugLine="scorePlayerTwo	= p2Score";
_scoreplayertwo = _p2score;
RDebugUtils.currentLine=5308451;
 //BA.debugLineNum = 5308451;BA.debugLine="txtScore		= padString(p2Score, \"0\", 0, 4)";
_txtscore = _padstring(BA.NumberToString(_p2score),"0",(int) (0),(int) (4));
RDebugUtils.currentLine=5308453;
 //BA.debugLineNum = 5308453;BA.debugLine="p2_100.Text		= txtScore.SubString2(1,2)";
_p2_100.setText(_txtscore.substring((int) (1),(int) (2)));
RDebugUtils.currentLine=5308454;
 //BA.debugLineNum = 5308454;BA.debugLine="p2_10.Text		= txtScore.SubString2(2,3)";
_p2_10.setText(_txtscore.substring((int) (2),(int) (3)));
RDebugUtils.currentLine=5308455;
 //BA.debugLineNum = 5308455;BA.debugLine="p2_1.Text		= txtScore.SubString2(3,4)";
_p2_1.setText(_txtscore.substring((int) (3),(int) (4)));
RDebugUtils.currentLine=5308456;
 //BA.debugLineNum = 5308456;BA.debugLine="p2_moyenne.Text = NumberFormat2((scorePlayerTwo/i";
_p2_moyenne.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=5308458;
 //BA.debugLineNum = 5308458;BA.debugLine="If playerTwoToMake > 0 Then";
if (_playertwotomake>0) { 
RDebugUtils.currentLine=5308459;
 //BA.debugLineNum = 5308459;BA.debugLine="CallSub2(scorebord, \"playerTwoPerc\", NumberForma";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerTwoPerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_playertwotomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
RDebugUtils.currentLine=5308460;
 //BA.debugLineNum = 5308460;BA.debugLine="p2_progress = (scorePlayerTwo/playerTwoToMake)*1";
_p2_progress = (float) ((_scoreplayertwo/(double)_playertwotomake)*100);
 };
RDebugUtils.currentLine=5308462;
 //BA.debugLineNum = 5308462;BA.debugLine="setProgress(p2_progressBar, p2_progress)";
_setprogress(_p2_progressbar,_p2_progress);
RDebugUtils.currentLine=5308464;
 //BA.debugLineNum = 5308464;BA.debugLine="checkMatchWon(\"p2\")";
_checkmatchwon("p2");
RDebugUtils.currentLine=5308466;
 //BA.debugLineNum = 5308466;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub setP1CaromLables(lst As List)";
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="p1_100		= lst.Get(2)";
_p1_100.setObject((javafx.scene.control.Label)(_lst.Get((int) (2))));
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="p1_10		= lst.Get(1)";
_p1_10.setObject((javafx.scene.control.Label)(_lst.Get((int) (1))));
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="p1_1		= lst.Get(0)";
_p1_1.setObject((javafx.scene.control.Label)(_lst.Get((int) (0))));
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="p1_moyenne	= lst.Get(3)";
_p1_moyenne.setObject((javafx.scene.control.Label)(_lst.Get((int) (3))));
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="p1_progressBar = lst.Get(4)";
_p1_progressbar = (b4j.example.b4xprogressbar)(_lst.Get((int) (4)));
RDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="End Sub";
return "";
}
public static String  _setp2caromlables(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setp2caromlables", false))
	 {return ((String) Debug.delegate(ba, "setp2caromlables", new Object[] {_lst}));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub setP2CaromLables(lst As List)";
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="p2_100		= lst.Get(2)";
_p2_100.setObject((javafx.scene.control.Label)(_lst.Get((int) (2))));
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="p2_10		= lst.Get(1)";
_p2_10.setObject((javafx.scene.control.Label)(_lst.Get((int) (1))));
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="p2_1		= lst.Get(0)";
_p2_1.setObject((javafx.scene.control.Label)(_lst.Get((int) (0))));
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="p2_moyenne	= lst.Get(3)";
_p2_moyenne.setObject((javafx.scene.control.Label)(_lst.Get((int) (3))));
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="p2_progressBar	= lst.Get(4)";
_p2_progressbar = (b4j.example.b4xprogressbar)(_lst.Get((int) (4)));
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="End Sub";
return "";
}
public static String  _setfont(anywheresoftware.b4j.objects.LabelWrapper _lbl,int _size,boolean _digital) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setfont", false))
	 {return ((String) Debug.delegate(ba, "setfont", new Object[] {_lbl,_size,_digital}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub setFont(lbl As Label, size As Int, digi";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Dim jo As JavaObject=lbl";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="If digital Then";
if (_digital) { 
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="jo.runMethod(\"setFont\",Array(fx.LoadFont(File.Di";
_jo.RunMethod("setFont",new Object[]{(Object)(_fx.LoadFont(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"digital-7 (mono).ttf",_size).getObject())});
 }else {
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="jo.runMethod(\"setFont\",Array(fx.LoadFont(File.Di";
_jo.RunMethod("setFont",new Object[]{(Object)(_fx.LoadFont(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"Arial.ttf",_size).getObject())});
 };
RDebugUtils.currentLine=5046280;
 //BA.debugLineNum = 5046280;BA.debugLine="End Sub";
return "";
}
public static String  _setfontcolor(anywheresoftware.b4j.objects.LabelWrapper _lbl,boolean _yellow) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setfontcolor", false))
	 {return ((String) Debug.delegate(ba, "setfontcolor", new Object[] {_lbl,_yellow}));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub setFontColor(lbl As Label, yellow As Bo";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="If yellow Then";
if (_yellow) { 
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="lbl.Style = \"-fx-text-fill: #ffff00;\" '= fx.Colo";
_lbl.setStyle("-fx-text-fill: #ffff00;");
 }else {
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="lbl.Style = \"-fx-text-fill: #ffffff;\"";
_lbl.setStyle("-fx-text-fill: #ffffff;");
 };
RDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="End Sub";
return "";
}
public static String  _testnumber(String _oldstringtotest,String _newstringtotest) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "testnumber", false))
	 {return ((String) Debug.delegate(ba, "testnumber", new Object[] {_oldstringtotest,_newstringtotest}));}
String _stringtotest = "";
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub testNumber(oldStringToTest As String, n";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Dim stringToTest As String";
_stringtotest = "";
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="If newStringToTest.Length = 1 Then";
if (_newstringtotest.length()==1) { 
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="stringToTest = newStringToTest";
_stringtotest = _newstringtotest;
 }else {
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="stringToTest = 	newStringToTest.Replace(oldStrin";
_stringtotest = _newstringtotest.replace(_oldstringtotest,"");
 };
RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="regexStr.Initialize";
_regexstr.Initialize();
RDebugUtils.currentLine=4849674;
 //BA.debugLineNum = 4849674;BA.debugLine="regexStr.Append(\"[0-9]*\\.[0-9]*|[0-9]*\")";
_regexstr.Append("[0-9]*\\.[0-9]*|[0-9]*");
RDebugUtils.currentLine=4849676;
 //BA.debugLineNum = 4849676;BA.debugLine="If Regex.IsMatch(regexStr.ToString,stringToTest)";
if (anywheresoftware.b4a.keywords.Common.Regex.IsMatch(_regexstr.ToString(),_stringtotest)==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=4849677;
 //BA.debugLineNum = 4849677;BA.debugLine="Return newStringToTest";
if (true) return _newstringtotest;
 }else {
RDebugUtils.currentLine=4849679;
 //BA.debugLineNum = 4849679;BA.debugLine="Return oldStringToTest";
if (true) return _oldstringtotest;
 };
RDebugUtils.currentLine=4849682;
 //BA.debugLineNum = 4849682;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 5636102;BA.debugLine="CallSub(scorebord, \"checkMatchWonP2\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(ba,(Object)(_scorebord.getObject()),"checkMatchWonP2");
 };
RDebugUtils.currentLine=5636104;
 //BA.debugLineNum = 5636104;BA.debugLine="End Sub";
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