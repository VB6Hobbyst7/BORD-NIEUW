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
public static b4j.example.funcinet _funcinet = null;
public static b4j.example.httputils2service _httputils2service = null;
public static String  _testnumber(String _oldstringtotest,String _newstringtotest) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "testnumber", false))
	 {return ((String) Debug.delegate(ba, "testnumber", new Object[] {_oldstringtotest,_newstringtotest}));}
String _stringtotest = "";
RDebugUtils.currentLine=25493504;
 //BA.debugLineNum = 25493504;BA.debugLine="Public Sub testNumber(oldStringToTest As String, n";
RDebugUtils.currentLine=25493505;
 //BA.debugLineNum = 25493505;BA.debugLine="Dim stringToTest As String";
_stringtotest = "";
RDebugUtils.currentLine=25493507;
 //BA.debugLineNum = 25493507;BA.debugLine="If newStringToTest.Length = 1 Then";
if (_newstringtotest.length()==1) { 
RDebugUtils.currentLine=25493508;
 //BA.debugLineNum = 25493508;BA.debugLine="stringToTest = newStringToTest";
_stringtotest = _newstringtotest;
 }else {
RDebugUtils.currentLine=25493510;
 //BA.debugLineNum = 25493510;BA.debugLine="stringToTest = 	newStringToTest.Replace(oldStrin";
_stringtotest = _newstringtotest.replace(_oldstringtotest,"");
 };
RDebugUtils.currentLine=25493513;
 //BA.debugLineNum = 25493513;BA.debugLine="regexStr.Initialize";
_regexstr.Initialize();
RDebugUtils.currentLine=25493514;
 //BA.debugLineNum = 25493514;BA.debugLine="regexStr.Append(\"[0-9]*\\.[0-9]*|[0-9]*\")";
_regexstr.Append("[0-9]*\\.[0-9]*|[0-9]*");
RDebugUtils.currentLine=25493516;
 //BA.debugLineNum = 25493516;BA.debugLine="If Regex.IsMatch(regexStr.ToString,stringToTest)";
if (anywheresoftware.b4a.keywords.Common.Regex.IsMatch(_regexstr.ToString(),_stringtotest)==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=25493517;
 //BA.debugLineNum = 25493517;BA.debugLine="Return newStringToTest";
if (true) return _newstringtotest;
 }else {
RDebugUtils.currentLine=25493519;
 //BA.debugLineNum = 25493519;BA.debugLine="Return oldStringToTest";
if (true) return _oldstringtotest;
 };
RDebugUtils.currentLine=25493522;
 //BA.debugLineNum = 25493522;BA.debugLine="End Sub";
return "";
}
public static String  _padstring(String _padtext,String _padchr,int _padside,int _padcount) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "padstring", false))
	 {return ((String) Debug.delegate(ba, "padstring", new Object[] {_padtext,_padchr,_padside,_padcount}));}
String _padstr = "";
int _i = 0;
RDebugUtils.currentLine=25821184;
 //BA.debugLineNum = 25821184;BA.debugLine="Public Sub padString(padText As String ,padChr As";
RDebugUtils.currentLine=25821185;
 //BA.debugLineNum = 25821185;BA.debugLine="Dim padStr As String";
_padstr = "";
RDebugUtils.currentLine=25821187;
 //BA.debugLineNum = 25821187;BA.debugLine="If padText.Length = padCount Then";
if (_padtext.length()==_padcount) { 
RDebugUtils.currentLine=25821188;
 //BA.debugLineNum = 25821188;BA.debugLine="Return padText";
if (true) return _padtext;
 };
RDebugUtils.currentLine=25821191;
 //BA.debugLineNum = 25821191;BA.debugLine="For i = 1 To padCount-padText.Length";
{
final int step5 = 1;
final int limit5 = (int) (_padcount-_padtext.length());
_i = (int) (1) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=25821192;
 //BA.debugLineNum = 25821192;BA.debugLine="padStr = padStr&padChr";
_padstr = _padstr+_padchr;
 }
};
RDebugUtils.currentLine=25821195;
 //BA.debugLineNum = 25821195;BA.debugLine="If padSide = 0 Then";
if (_padside==0) { 
RDebugUtils.currentLine=25821196;
 //BA.debugLineNum = 25821196;BA.debugLine="Return padStr&padText";
if (true) return _padstr+_padtext;
 }else {
RDebugUtils.currentLine=25821198;
 //BA.debugLineNum = 25821198;BA.debugLine="Return padText&padStr";
if (true) return _padtext+_padstr;
 };
RDebugUtils.currentLine=25821201;
 //BA.debugLineNum = 25821201;BA.debugLine="End Sub";
return "";
}
public static String  _calcmoyenne(anywheresoftware.b4j.objects.LabelWrapper _mplayerone,anywheresoftware.b4j.objects.LabelWrapper _mplayertwo) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "calcmoyenne", false))
	 {return ((String) Debug.delegate(ba, "calcmoyenne", new Object[] {_mplayerone,_mplayertwo}));}
RDebugUtils.currentLine=26017792;
 //BA.debugLineNum = 26017792;BA.debugLine="Sub calcMoyenne(mPlayerOne As Label, mPlayerTwo As";
RDebugUtils.currentLine=26017793;
 //BA.debugLineNum = 26017793;BA.debugLine="mPlayerOne.Text = NumberFormat2((scorePlayerOne/i";
_mplayerone.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=26017794;
 //BA.debugLineNum = 26017794;BA.debugLine="mPlayerTwo.Text = NumberFormat2((scorePlayerTwo/i";
_mplayertwo.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=26017795;
 //BA.debugLineNum = 26017795;BA.debugLine="End Sub";
return "";
}
public static String  _processhs(String _player) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "processhs", false))
	 {return ((String) Debug.delegate(ba, "processhs", new Object[] {_player}));}
RDebugUtils.currentLine=26214400;
 //BA.debugLineNum = 26214400;BA.debugLine="Sub processHs(player As String)";
RDebugUtils.currentLine=26214401;
 //BA.debugLineNum = 26214401;BA.debugLine="If player = \"p1\" Then";
if ((_player).equals("p1")) { 
RDebugUtils.currentLine=26214402;
 //BA.debugLineNum = 26214402;BA.debugLine="If p1HsTemp > 0 And p1HsTemp > playerOneHs Then";
if (_p1hstemp>0 && _p1hstemp>_playeronehs) { 
RDebugUtils.currentLine=26214403;
 //BA.debugLineNum = 26214403;BA.debugLine="playerOneHs = p1HsTemp";
_playeronehs = _p1hstemp;
RDebugUtils.currentLine=26214404;
 //BA.debugLineNum = 26214404;BA.debugLine="p1HsTemp = 0";
_p1hstemp = (int) (0);
RDebugUtils.currentLine=26214405;
 //BA.debugLineNum = 26214405;BA.debugLine="lbl_player_one_hs.Text = padString(playerOneHs,";
_lbl_player_one_hs.setText(_padstring(BA.NumberToString(_playeronehs),"0",(int) (0),(int) (3)));
 };
 };
RDebugUtils.currentLine=26214410;
 //BA.debugLineNum = 26214410;BA.debugLine="If player = \"p2\" Then";
if ((_player).equals("p2")) { 
RDebugUtils.currentLine=26214411;
 //BA.debugLineNum = 26214411;BA.debugLine="If p2HsTemp > 0 And p2HsTemp > playerTwoHs Then";
if (_p2hstemp>0 && _p2hstemp>_playertwohs) { 
RDebugUtils.currentLine=26214412;
 //BA.debugLineNum = 26214412;BA.debugLine="playerTwoHs = p2HsTemp";
_playertwohs = _p2hstemp;
RDebugUtils.currentLine=26214413;
 //BA.debugLineNum = 26214413;BA.debugLine="p2HsTemp = 0";
_p2hstemp = (int) (0);
RDebugUtils.currentLine=26214414;
 //BA.debugLineNum = 26214414;BA.debugLine="lbl_player_two_hs.Text = padString(playerTwoHs,";
_lbl_player_two_hs.setText(_padstring(BA.NumberToString(_playertwohs),"0",(int) (0),(int) (3)));
 };
 };
RDebugUtils.currentLine=26214419;
 //BA.debugLineNum = 26214419;BA.debugLine="If player = \"all\" Then";
if ((_player).equals("all")) { 
RDebugUtils.currentLine=26214420;
 //BA.debugLineNum = 26214420;BA.debugLine="If p1HsTemp > 0 And p1HsTemp > playerOneHs Then";
if (_p1hstemp>0 && _p1hstemp>_playeronehs) { 
RDebugUtils.currentLine=26214421;
 //BA.debugLineNum = 26214421;BA.debugLine="playerOneHs = p1HsTemp";
_playeronehs = _p1hstemp;
RDebugUtils.currentLine=26214422;
 //BA.debugLineNum = 26214422;BA.debugLine="p1HsTemp = 0";
_p1hstemp = (int) (0);
RDebugUtils.currentLine=26214423;
 //BA.debugLineNum = 26214423;BA.debugLine="lbl_player_one_hs.Text = padString(playerOneHs,";
_lbl_player_one_hs.setText(_padstring(BA.NumberToString(_playeronehs),"0",(int) (0),(int) (3)));
 };
RDebugUtils.currentLine=26214428;
 //BA.debugLineNum = 26214428;BA.debugLine="If p2HsTemp > 0 And p2HsTemp > playerTwoHs Then";
if (_p2hstemp>0 && _p2hstemp>_playertwohs) { 
RDebugUtils.currentLine=26214429;
 //BA.debugLineNum = 26214429;BA.debugLine="playerTwoHs = p2HsTemp";
_playertwohs = _p2hstemp;
RDebugUtils.currentLine=26214430;
 //BA.debugLineNum = 26214430;BA.debugLine="p2HsTemp = 0";
_p2hstemp = (int) (0);
RDebugUtils.currentLine=26214431;
 //BA.debugLineNum = 26214431;BA.debugLine="lbl_player_two_hs.Text = padString(playerTwoHs,";
_lbl_player_two_hs.setText(_padstring(BA.NumberToString(_playertwohs),"0",(int) (0),(int) (3)));
 };
 };
RDebugUtils.currentLine=26214436;
 //BA.debugLineNum = 26214436;BA.debugLine="End Sub";
return "";
}
public static String  _calcscoreplayerone(int _points) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "calcscoreplayerone", false))
	 {return ((String) Debug.delegate(ba, "calcscoreplayerone", new Object[] {_points}));}
RDebugUtils.currentLine=25886720;
 //BA.debugLineNum = 25886720;BA.debugLine="Sub calcScorePlayerOne(points As Int)";
RDebugUtils.currentLine=25886722;
 //BA.debugLineNum = 25886722;BA.debugLine="CallSubDelayed(scorebord, \"lastClick\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(ba,(Object)(_scorebord.getObject()),"lastClick");
RDebugUtils.currentLine=25886723;
 //BA.debugLineNum = 25886723;BA.debugLine="If score > 9999 Or score <= -1 Then";
if (_score>9999 || _score<=-1) { 
RDebugUtils.currentLine=25886724;
 //BA.debugLineNum = 25886724;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=25886726;
 //BA.debugLineNum = 25886726;BA.debugLine="processHs(\"p2\")";
_processhs("p2");
RDebugUtils.currentLine=25886728;
 //BA.debugLineNum = 25886728;BA.debugLine="p1HsTemp	= p1HsTemp + points";
_p1hstemp = (int) (_p1hstemp+_points);
RDebugUtils.currentLine=25886729;
 //BA.debugLineNum = 25886729;BA.debugLine="score		= p1_100.Text&p1_10.Text&p1_1.Text";
_score = (int)(Double.parseDouble(_p1_100.getText()+_p1_10.getText()+_p1_1.getText()));
RDebugUtils.currentLine=25886730;
 //BA.debugLineNum = 25886730;BA.debugLine="score		= score+points";
_score = (int) (_score+_points);
RDebugUtils.currentLine=25886732;
 //BA.debugLineNum = 25886732;BA.debugLine="If score > 999 Or score <= -1 Then";
if (_score>999 || _score<=-1) { 
RDebugUtils.currentLine=25886733;
 //BA.debugLineNum = 25886733;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=25886736;
 //BA.debugLineNum = 25886736;BA.debugLine="If lblInnings.Text = \"000\" Then";
if ((_lblinnings.getText()).equals("000")) { 
RDebugUtils.currentLine=25886737;
 //BA.debugLineNum = 25886737;BA.debugLine="lblInnings.Text	= \"001\"";
_lblinnings.setText("001");
RDebugUtils.currentLine=25886738;
 //BA.debugLineNum = 25886738;BA.debugLine="innigs			= 1";
_innigs = (int) (1);
RDebugUtils.currentLine=25886739;
 //BA.debugLineNum = 25886739;BA.debugLine="inngSet			= 1";
_inngset = (int) (1);
 };
RDebugUtils.currentLine=25886742;
 //BA.debugLineNum = 25886742;BA.debugLine="If inngSet <> 1 And score <> scorePlayerOne Then";
if (_inngset!=1 && _score!=_scoreplayerone) { 
RDebugUtils.currentLine=25886743;
 //BA.debugLineNum = 25886743;BA.debugLine="innigs = lblInnings.Text";
_innigs = (int)(Double.parseDouble(_lblinnings.getText()));
RDebugUtils.currentLine=25886744;
 //BA.debugLineNum = 25886744;BA.debugLine="innigs = innigs + 1";
_innigs = (int) (_innigs+1);
RDebugUtils.currentLine=25886745;
 //BA.debugLineNum = 25886745;BA.debugLine="lblInnings.Text = padString(innigs, \"0\", 0, 3)";
_lblinnings.setText(_padstring(BA.NumberToString(_innigs),"0",(int) (0),(int) (3)));
RDebugUtils.currentLine=25886746;
 //BA.debugLineNum = 25886746;BA.debugLine="inngSet = 1";
_inngset = (int) (1);
 };
RDebugUtils.currentLine=25886749;
 //BA.debugLineNum = 25886749;BA.debugLine="scorePlayerOne = score";
_scoreplayerone = _score;
RDebugUtils.currentLine=25886751;
 //BA.debugLineNum = 25886751;BA.debugLine="txtScore = padString(score, \"0\", 0, 4)";
_txtscore = _padstring(BA.NumberToString(_score),"0",(int) (0),(int) (4));
RDebugUtils.currentLine=25886754;
 //BA.debugLineNum = 25886754;BA.debugLine="p1_100.Text		= txtScore.SubString2(1,2)";
_p1_100.setText(_txtscore.substring((int) (1),(int) (2)));
RDebugUtils.currentLine=25886755;
 //BA.debugLineNum = 25886755;BA.debugLine="p1_10.Text		= txtScore.SubString2(2,3)";
_p1_10.setText(_txtscore.substring((int) (2),(int) (3)));
RDebugUtils.currentLine=25886756;
 //BA.debugLineNum = 25886756;BA.debugLine="p1_1.Text		= txtScore.SubString2(3,4)";
_p1_1.setText(_txtscore.substring((int) (3),(int) (4)));
RDebugUtils.currentLine=25886758;
 //BA.debugLineNum = 25886758;BA.debugLine="p1_moyenne.Text = NumberFormat2((scorePlayerOne/i";
_p1_moyenne.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=25886760;
 //BA.debugLineNum = 25886760;BA.debugLine="If playerOneToMake > 0 Then";
if (_playeronetomake>0) { 
RDebugUtils.currentLine=25886761;
 //BA.debugLineNum = 25886761;BA.debugLine="CallSub2(scorebord, \"playerOnePerc\", NumberForma";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerOnePerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_playeronetomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
RDebugUtils.currentLine=25886762;
 //BA.debugLineNum = 25886762;BA.debugLine="p1_progress = (scorePlayerOne/playerOneToMake)*1";
_p1_progress = (float) ((_scoreplayerone/(double)_playeronetomake)*100);
 };
RDebugUtils.currentLine=25886764;
 //BA.debugLineNum = 25886764;BA.debugLine="setProgress(p1_progressBar, p1_progress)";
_setprogress(_p1_progressbar,_p1_progress);
RDebugUtils.currentLine=25886765;
 //BA.debugLineNum = 25886765;BA.debugLine="checkMatchWon(\"p1\")";
_checkmatchwon("p1");
RDebugUtils.currentLine=25886767;
 //BA.debugLineNum = 25886767;BA.debugLine="End Sub";
return "";
}
public static String  _playeronemake(anywheresoftware.b4j.objects.LabelWrapper _lbl100,anywheresoftware.b4j.objects.LabelWrapper _lbl10,anywheresoftware.b4j.objects.LabelWrapper _lbl1,boolean _leftbutton,int _number) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "playeronemake", false))
	 {return ((String) Debug.delegate(ba, "playeronemake", new Object[] {_lbl100,_lbl10,_lbl1,_leftbutton,_number}));}
String _strmaker = "";
RDebugUtils.currentLine=26083328;
 //BA.debugLineNum = 26083328;BA.debugLine="Sub playerOneMake(lbl100 As Label, lbl10 As Label,";
RDebugUtils.currentLine=26083329;
 //BA.debugLineNum = 26083329;BA.debugLine="Dim strMaker As String";
_strmaker = "";
RDebugUtils.currentLine=26083330;
 //BA.debugLineNum = 26083330;BA.debugLine="make = $\"${lbl100.Text}${lbl10.Text}${lbl1.Text}\"";
_make = (int)(Double.parseDouble((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl100.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl10.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl1.getText()))+"")));
RDebugUtils.currentLine=26083332;
 //BA.debugLineNum = 26083332;BA.debugLine="If leftButton Then";
if (_leftbutton) { 
RDebugUtils.currentLine=26083333;
 //BA.debugLineNum = 26083333;BA.debugLine="make = make+number";
_make = (int) (_make+_number);
RDebugUtils.currentLine=26083334;
 //BA.debugLineNum = 26083334;BA.debugLine="If make > 999 Then";
if (_make>999) { 
RDebugUtils.currentLine=26083335;
 //BA.debugLineNum = 26083335;BA.debugLine="Return";
if (true) return "";
 };
 }else {
RDebugUtils.currentLine=26083338;
 //BA.debugLineNum = 26083338;BA.debugLine="make = make-number";
_make = (int) (_make-_number);
RDebugUtils.currentLine=26083339;
 //BA.debugLineNum = 26083339;BA.debugLine="If make < 0 Then";
if (_make<0) { 
RDebugUtils.currentLine=26083340;
 //BA.debugLineNum = 26083340;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=26083345;
 //BA.debugLineNum = 26083345;BA.debugLine="strMaker	= padString(make, \"0\", 0, 3)";
_strmaker = _padstring(BA.NumberToString(_make),"0",(int) (0),(int) (3));
RDebugUtils.currentLine=26083346;
 //BA.debugLineNum = 26083346;BA.debugLine="lbl100.Text = strMaker.SubString2(0,1)";
_lbl100.setText(_strmaker.substring((int) (0),(int) (1)));
RDebugUtils.currentLine=26083347;
 //BA.debugLineNum = 26083347;BA.debugLine="lbl10.Text	= strMaker.SubString2(1,2)";
_lbl10.setText(_strmaker.substring((int) (1),(int) (2)));
RDebugUtils.currentLine=26083348;
 //BA.debugLineNum = 26083348;BA.debugLine="lbl1.Text	= strMaker.SubString2(2,3)";
_lbl1.setText(_strmaker.substring((int) (2),(int) (3)));
RDebugUtils.currentLine=26083350;
 //BA.debugLineNum = 26083350;BA.debugLine="playerOneToMake = make";
_playeronetomake = _make;
RDebugUtils.currentLine=26083351;
 //BA.debugLineNum = 26083351;BA.debugLine="If playerOneToMake > 0 Then";
if (_playeronetomake>0) { 
RDebugUtils.currentLine=26083352;
 //BA.debugLineNum = 26083352;BA.debugLine="p1_progress = (scorePlayerOne/playerOneToMake)*10";
_p1_progress = (float) ((_scoreplayerone/(double)_playeronetomake)*100);
RDebugUtils.currentLine=26083353;
 //BA.debugLineNum = 26083353;BA.debugLine="CallSub2(scorebord, \"playerOnePerc\", NumberFormat";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerOnePerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_playeronetomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
 }else {
RDebugUtils.currentLine=26083355;
 //BA.debugLineNum = 26083355;BA.debugLine="p1_progress = 0";
_p1_progress = (float) (0);
RDebugUtils.currentLine=26083356;
 //BA.debugLineNum = 26083356;BA.debugLine="CallSub2(scorebord, \"playerOnePerc\", \"n.v.t.\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerOnePerc",(Object)("n.v.t."));
 };
RDebugUtils.currentLine=26083358;
 //BA.debugLineNum = 26083358;BA.debugLine="setProgress(p1_progressBar, p1_progress)";
_setprogress(_p1_progressbar,_p1_progress);
RDebugUtils.currentLine=26083359;
 //BA.debugLineNum = 26083359;BA.debugLine="End Sub";
return "";
}
public static String  _calcscoreplayertwo(int _points) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "calcscoreplayertwo", false))
	 {return ((String) Debug.delegate(ba, "calcscoreplayertwo", new Object[] {_points}));}
RDebugUtils.currentLine=25952256;
 //BA.debugLineNum = 25952256;BA.debugLine="Sub calcScorePlayertwo(points As Int)";
RDebugUtils.currentLine=25952257;
 //BA.debugLineNum = 25952257;BA.debugLine="CallSubDelayed(scorebord, \"lastClick\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(ba,(Object)(_scorebord.getObject()),"lastClick");
RDebugUtils.currentLine=25952258;
 //BA.debugLineNum = 25952258;BA.debugLine="inngSet = 0";
_inngset = (int) (0);
RDebugUtils.currentLine=25952259;
 //BA.debugLineNum = 25952259;BA.debugLine="processHs(\"p1\")";
_processhs("p1");
RDebugUtils.currentLine=25952260;
 //BA.debugLineNum = 25952260;BA.debugLine="p2HsTemp = p2HsTemp + points";
_p2hstemp = (int) (_p2hstemp+_points);
RDebugUtils.currentLine=25952262;
 //BA.debugLineNum = 25952262;BA.debugLine="score = p2_100.Text&p2_10.Text&p2_1.Text";
_score = (int)(Double.parseDouble(_p2_100.getText()+_p2_10.getText()+_p2_1.getText()));
RDebugUtils.currentLine=25952263;
 //BA.debugLineNum = 25952263;BA.debugLine="score = score+points";
_score = (int) (_score+_points);
RDebugUtils.currentLine=25952265;
 //BA.debugLineNum = 25952265;BA.debugLine="If score > 999 Or score <= -1 Then";
if (_score>999 || _score<=-1) { 
RDebugUtils.currentLine=25952266;
 //BA.debugLineNum = 25952266;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=25952269;
 //BA.debugLineNum = 25952269;BA.debugLine="If lblInnings.Text = \"000\" Then";
if ((_lblinnings.getText()).equals("000")) { 
RDebugUtils.currentLine=25952270;
 //BA.debugLineNum = 25952270;BA.debugLine="lblInnings.Text	= \"001\"";
_lblinnings.setText("001");
RDebugUtils.currentLine=25952271;
 //BA.debugLineNum = 25952271;BA.debugLine="innigs			= 1";
_innigs = (int) (1);
RDebugUtils.currentLine=25952272;
 //BA.debugLineNum = 25952272;BA.debugLine="inngSet			= 1";
_inngset = (int) (1);
 };
RDebugUtils.currentLine=25952275;
 //BA.debugLineNum = 25952275;BA.debugLine="playerTwoHs		= scorePlayerTwo - playerTwoHs";
_playertwohs = (int) (_scoreplayertwo-_playertwohs);
RDebugUtils.currentLine=25952276;
 //BA.debugLineNum = 25952276;BA.debugLine="scorePlayerTwo	= score";
_scoreplayertwo = _score;
RDebugUtils.currentLine=25952277;
 //BA.debugLineNum = 25952277;BA.debugLine="txtScore		= padString(score, \"0\", 0, 4)";
_txtscore = _padstring(BA.NumberToString(_score),"0",(int) (0),(int) (4));
RDebugUtils.currentLine=25952280;
 //BA.debugLineNum = 25952280;BA.debugLine="p2_100.Text		= txtScore.SubString2(1,2)";
_p2_100.setText(_txtscore.substring((int) (1),(int) (2)));
RDebugUtils.currentLine=25952281;
 //BA.debugLineNum = 25952281;BA.debugLine="p2_10.Text		= txtScore.SubString2(2,3)";
_p2_10.setText(_txtscore.substring((int) (2),(int) (3)));
RDebugUtils.currentLine=25952282;
 //BA.debugLineNum = 25952282;BA.debugLine="p2_1.Text		= txtScore.SubString2(3,4)";
_p2_1.setText(_txtscore.substring((int) (3),(int) (4)));
RDebugUtils.currentLine=25952283;
 //BA.debugLineNum = 25952283;BA.debugLine="p2_moyenne.Text = NumberFormat2((scorePlayerTwo/i";
_p2_moyenne.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=25952285;
 //BA.debugLineNum = 25952285;BA.debugLine="If playerTwoToMake > 0 Then";
if (_playertwotomake>0) { 
RDebugUtils.currentLine=25952286;
 //BA.debugLineNum = 25952286;BA.debugLine="CallSub2(scorebord, \"playerTwoPerc\", NumberForma";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerTwoPerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_playertwotomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
RDebugUtils.currentLine=25952287;
 //BA.debugLineNum = 25952287;BA.debugLine="p2_progress = (scorePlayerTwo/playerTwoToMake)*1";
_p2_progress = (float) ((_scoreplayertwo/(double)_playertwotomake)*100);
 };
RDebugUtils.currentLine=25952289;
 //BA.debugLineNum = 25952289;BA.debugLine="setProgress(p2_progressBar, p2_progress)";
_setprogress(_p2_progressbar,_p2_progress);
RDebugUtils.currentLine=25952290;
 //BA.debugLineNum = 25952290;BA.debugLine="checkMatchWon(\"p2\")";
_checkmatchwon("p2");
RDebugUtils.currentLine=25952292;
 //BA.debugLineNum = 25952292;BA.debugLine="End Sub";
return "";
}
public static String  _playertwomake(anywheresoftware.b4j.objects.LabelWrapper _lbl100,anywheresoftware.b4j.objects.LabelWrapper _lbl10,anywheresoftware.b4j.objects.LabelWrapper _lbl1,boolean _leftbutton,int _number) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "playertwomake", false))
	 {return ((String) Debug.delegate(ba, "playertwomake", new Object[] {_lbl100,_lbl10,_lbl1,_leftbutton,_number}));}
String _strmaker = "";
RDebugUtils.currentLine=26148864;
 //BA.debugLineNum = 26148864;BA.debugLine="Sub playerTwoMake(lbl100 As Label, lbl10 As Label,";
RDebugUtils.currentLine=26148865;
 //BA.debugLineNum = 26148865;BA.debugLine="Dim strMaker As String";
_strmaker = "";
RDebugUtils.currentLine=26148866;
 //BA.debugLineNum = 26148866;BA.debugLine="make = $\"${lbl100.Text}${lbl10.Text}${lbl1.Text}\"";
_make = (int)(Double.parseDouble((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl100.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl10.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl1.getText()))+"")));
RDebugUtils.currentLine=26148868;
 //BA.debugLineNum = 26148868;BA.debugLine="If leftButton Then";
if (_leftbutton) { 
RDebugUtils.currentLine=26148869;
 //BA.debugLineNum = 26148869;BA.debugLine="make = make+number";
_make = (int) (_make+_number);
RDebugUtils.currentLine=26148870;
 //BA.debugLineNum = 26148870;BA.debugLine="If make > 999 Then";
if (_make>999) { 
RDebugUtils.currentLine=26148871;
 //BA.debugLineNum = 26148871;BA.debugLine="Return";
if (true) return "";
 };
 }else {
RDebugUtils.currentLine=26148874;
 //BA.debugLineNum = 26148874;BA.debugLine="make = make-number";
_make = (int) (_make-_number);
RDebugUtils.currentLine=26148875;
 //BA.debugLineNum = 26148875;BA.debugLine="If make < 0 Then";
if (_make<0) { 
RDebugUtils.currentLine=26148876;
 //BA.debugLineNum = 26148876;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=26148881;
 //BA.debugLineNum = 26148881;BA.debugLine="strMaker	= padString(make, \"0\", 0, 3)";
_strmaker = _padstring(BA.NumberToString(_make),"0",(int) (0),(int) (3));
RDebugUtils.currentLine=26148882;
 //BA.debugLineNum = 26148882;BA.debugLine="lbl100.Text = strMaker.SubString2(0,1)";
_lbl100.setText(_strmaker.substring((int) (0),(int) (1)));
RDebugUtils.currentLine=26148883;
 //BA.debugLineNum = 26148883;BA.debugLine="lbl10.Text	= strMaker.SubString2(1,2)";
_lbl10.setText(_strmaker.substring((int) (1),(int) (2)));
RDebugUtils.currentLine=26148884;
 //BA.debugLineNum = 26148884;BA.debugLine="lbl1.Text	= strMaker.SubString2(2,3)";
_lbl1.setText(_strmaker.substring((int) (2),(int) (3)));
RDebugUtils.currentLine=26148886;
 //BA.debugLineNum = 26148886;BA.debugLine="playerTwoToMake = make";
_playertwotomake = _make;
RDebugUtils.currentLine=26148887;
 //BA.debugLineNum = 26148887;BA.debugLine="If playerTwoToMake > 0 Then";
if (_playertwotomake>0) { 
RDebugUtils.currentLine=26148888;
 //BA.debugLineNum = 26148888;BA.debugLine="p2_progress = (scorePlayerTwo/playerTwoToMake)*1";
_p2_progress = (float) ((_scoreplayertwo/(double)_playertwotomake)*100);
RDebugUtils.currentLine=26148889;
 //BA.debugLineNum = 26148889;BA.debugLine="setProgress(p2_progressBar, p2_progress)";
_setprogress(_p2_progressbar,_p2_progress);
RDebugUtils.currentLine=26148890;
 //BA.debugLineNum = 26148890;BA.debugLine="CallSub2(scorebord, \"playerTwoPerc\", NumberForma";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerTwoPerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_playertwotomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
 }else {
RDebugUtils.currentLine=26148892;
 //BA.debugLineNum = 26148892;BA.debugLine="p2_progress = 0";
_p2_progress = (float) (0);
RDebugUtils.currentLine=26148893;
 //BA.debugLineNum = 26148893;BA.debugLine="setProgress(p2_progressBar, p2_progress)";
_setprogress(_p2_progressbar,_p2_progress);
RDebugUtils.currentLine=26148894;
 //BA.debugLineNum = 26148894;BA.debugLine="CallSub2(scorebord, \"playerTwoPerc\", \"n.v.t\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerTwoPerc",(Object)("n.v.t"));
 };
RDebugUtils.currentLine=26148896;
 //BA.debugLineNum = 26148896;BA.debugLine="End Sub";
return "";
}
public static String  _caromlabelcss(anywheresoftware.b4j.objects.LabelWrapper _lbl,String _style) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "caromlabelcss", false))
	 {return ((String) Debug.delegate(ba, "caromlabelcss", new Object[] {_lbl,_style}));}
RDebugUtils.currentLine=26542080;
 //BA.debugLineNum = 26542080;BA.debugLine="Sub caromLabelCss(lbl As Label, style As String)";
RDebugUtils.currentLine=26542081;
 //BA.debugLineNum = 26542081;BA.debugLine="lbl.StyleClasses.Add(style)";
_lbl.getStyleClasses().Add((Object)(_style));
RDebugUtils.currentLine=26542082;
 //BA.debugLineNum = 26542082;BA.debugLine="End Sub";
return "";
}
public static String  _setcustomcursor1(String _dir,String _filename,double _hotspotx,double _hotspoty,anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _targetnode) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setcustomcursor1", false))
	 {return ((String) Debug.delegate(ba, "setcustomcursor1", new Object[] {_dir,_filename,_hotspotx,_hotspoty,_targetnode}));}
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _img = null;
anywheresoftware.b4j.object.JavaObject _cursor = null;
anywheresoftware.b4j.object.JavaObject _joscene = null;
RDebugUtils.currentLine=26345472;
 //BA.debugLineNum = 26345472;BA.debugLine="Sub SetCustomCursor1(Dir As String, Filename As St";
RDebugUtils.currentLine=26345473;
 //BA.debugLineNum = 26345473;BA.debugLine="Dim img As Image";
_img = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=26345474;
 //BA.debugLineNum = 26345474;BA.debugLine="img.Initialize(Dir, Filename)";
_img.Initialize(_dir,_filename);
RDebugUtils.currentLine=26345475;
 //BA.debugLineNum = 26345475;BA.debugLine="Dim cursor As JavaObject";
_cursor = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=26345476;
 //BA.debugLineNum = 26345476;BA.debugLine="cursor.InitializeNewInstance(\"javafx.scene.ImageC";
_cursor.InitializeNewInstance("javafx.scene.ImageCursor",new Object[]{(Object)(_img.getObject()),(Object)(_hotspotx),(Object)(_hotspoty)});
RDebugUtils.currentLine=26345477;
 //BA.debugLineNum = 26345477;BA.debugLine="Dim joScene As JavaObject = TargetNode";
_joscene = new anywheresoftware.b4j.object.JavaObject();
_joscene.setObject((java.lang.Object)(_targetnode.getObject()));
RDebugUtils.currentLine=26345478;
 //BA.debugLineNum = 26345478;BA.debugLine="joScene.RunMethod(\"setCursor\", Array(cursor))";
_joscene.RunMethod("setCursor",new Object[]{(Object)(_cursor.getObject())});
RDebugUtils.currentLine=26345479;
 //BA.debugLineNum = 26345479;BA.debugLine="End Sub";
return "";
}
public static String  _getversion() throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "getversion", false))
	 {return ((String) Debug.delegate(ba, "getversion", null));}
String _version = "";
String _apppath = "";
RDebugUtils.currentLine=26607616;
 //BA.debugLineNum = 26607616;BA.debugLine="Sub getVersion As String";
RDebugUtils.currentLine=26607617;
 //BA.debugLineNum = 26607617;BA.debugLine="Dim version, os, appPath As String";
_version = "";
_os = "";
_apppath = "";
RDebugUtils.currentLine=26607618;
 //BA.debugLineNum = 26607618;BA.debugLine="os = DetectOS";
_os = _detectos();
RDebugUtils.currentLine=26607619;
 //BA.debugLineNum = 26607619;BA.debugLine="Select os";
switch (BA.switchObjectToInt(_os,"windows","linux")) {
case 0: {
RDebugUtils.currentLine=26607621;
 //BA.debugLineNum = 26607621;BA.debugLine="appPath = File.DirApp&\"\\44\\\"";
_apppath = anywheresoftware.b4a.keywords.Common.File.getDirApp()+"\\44\\";
 break; }
case 1: {
RDebugUtils.currentLine=26607623;
 //BA.debugLineNum = 26607623;BA.debugLine="appPath = File.DirApp&\"/44/\"";
_apppath = anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/44/";
 break; }
}
;
RDebugUtils.currentLine=26607626;
 //BA.debugLineNum = 26607626;BA.debugLine="version = File.ReadString(appPath, \"ver.pdg\")";
_version = anywheresoftware.b4a.keywords.Common.File.ReadString(_apppath,"ver.pdg");
RDebugUtils.currentLine=26607628;
 //BA.debugLineNum = 26607628;BA.debugLine="Return $\" v ${version.Trim}\"$";
if (true) return (" v "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_version.trim()))+"");
RDebugUtils.currentLine=26607630;
 //BA.debugLineNum = 26607630;BA.debugLine="End Sub";
return "";
}
public static String  _setp1caromlables(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setp1caromlables", false))
	 {return ((String) Debug.delegate(ba, "setp1caromlables", new Object[] {_lst}));}
RDebugUtils.currentLine=25559040;
 //BA.debugLineNum = 25559040;BA.debugLine="Public Sub setP1CaromLables(lst As List)";
RDebugUtils.currentLine=25559042;
 //BA.debugLineNum = 25559042;BA.debugLine="p1_100		= lst.Get(2)";
_p1_100.setObject((javafx.scene.control.Label)(_lst.Get((int) (2))));
RDebugUtils.currentLine=25559043;
 //BA.debugLineNum = 25559043;BA.debugLine="p1_10		= lst.Get(1)";
_p1_10.setObject((javafx.scene.control.Label)(_lst.Get((int) (1))));
RDebugUtils.currentLine=25559044;
 //BA.debugLineNum = 25559044;BA.debugLine="p1_1		= lst.Get(0)";
_p1_1.setObject((javafx.scene.control.Label)(_lst.Get((int) (0))));
RDebugUtils.currentLine=25559045;
 //BA.debugLineNum = 25559045;BA.debugLine="p1_moyenne	= lst.Get(3)";
_p1_moyenne.setObject((javafx.scene.control.Label)(_lst.Get((int) (3))));
RDebugUtils.currentLine=25559046;
 //BA.debugLineNum = 25559046;BA.debugLine="p1_progressBar = lst.Get(4)";
_p1_progressbar = (b4j.example.b4xprogressbar)(_lst.Get((int) (4)));
RDebugUtils.currentLine=25559047;
 //BA.debugLineNum = 25559047;BA.debugLine="End Sub";
return "";
}
public static String  _setp2caromlables(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setp2caromlables", false))
	 {return ((String) Debug.delegate(ba, "setp2caromlables", new Object[] {_lst}));}
RDebugUtils.currentLine=25624576;
 //BA.debugLineNum = 25624576;BA.debugLine="Public Sub setP2CaromLables(lst As List)";
RDebugUtils.currentLine=25624578;
 //BA.debugLineNum = 25624578;BA.debugLine="p2_100		= lst.Get(2)";
_p2_100.setObject((javafx.scene.control.Label)(_lst.Get((int) (2))));
RDebugUtils.currentLine=25624579;
 //BA.debugLineNum = 25624579;BA.debugLine="p2_10		= lst.Get(1)";
_p2_10.setObject((javafx.scene.control.Label)(_lst.Get((int) (1))));
RDebugUtils.currentLine=25624580;
 //BA.debugLineNum = 25624580;BA.debugLine="p2_1		= lst.Get(0)";
_p2_1.setObject((javafx.scene.control.Label)(_lst.Get((int) (0))));
RDebugUtils.currentLine=25624581;
 //BA.debugLineNum = 25624581;BA.debugLine="p2_moyenne	= lst.Get(3)";
_p2_moyenne.setObject((javafx.scene.control.Label)(_lst.Get((int) (3))));
RDebugUtils.currentLine=25624582;
 //BA.debugLineNum = 25624582;BA.debugLine="p2_progressBar	= lst.Get(4)";
_p2_progressbar = (b4j.example.b4xprogressbar)(_lst.Get((int) (4)));
RDebugUtils.currentLine=25624583;
 //BA.debugLineNum = 25624583;BA.debugLine="End Sub";
return "";
}
public static String  _setfont(anywheresoftware.b4j.objects.LabelWrapper _lbl,int _size,boolean _digital) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setfont", false))
	 {return ((String) Debug.delegate(ba, "setfont", new Object[] {_lbl,_size,_digital}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=25690112;
 //BA.debugLineNum = 25690112;BA.debugLine="Public Sub setFont(lbl As Label, size As Int, digi";
RDebugUtils.currentLine=25690113;
 //BA.debugLineNum = 25690113;BA.debugLine="Dim jo As JavaObject=lbl";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=25690114;
 //BA.debugLineNum = 25690114;BA.debugLine="If digital Then";
if (_digital) { 
RDebugUtils.currentLine=25690115;
 //BA.debugLineNum = 25690115;BA.debugLine="jo.runMethod(\"setFont\",Array(fx.LoadFont(File.Di";
_jo.RunMethod("setFont",new Object[]{(Object)(_fx.LoadFont(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"digital-7 (mono).ttf",_size).getObject())});
 }else {
RDebugUtils.currentLine=25690118;
 //BA.debugLineNum = 25690118;BA.debugLine="jo.runMethod(\"setFont\",Array(fx.LoadFont(File.Di";
_jo.RunMethod("setFont",new Object[]{(Object)(_fx.LoadFont(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"Arial.ttf",_size).getObject())});
 };
RDebugUtils.currentLine=25690120;
 //BA.debugLineNum = 25690120;BA.debugLine="End Sub";
return "";
}
public static String  _setfontcolor(anywheresoftware.b4j.objects.LabelWrapper _lbl,boolean _yellow) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setfontcolor", false))
	 {return ((String) Debug.delegate(ba, "setfontcolor", new Object[] {_lbl,_yellow}));}
RDebugUtils.currentLine=25755648;
 //BA.debugLineNum = 25755648;BA.debugLine="Public Sub setFontColor(lbl As Label, yellow As Bo";
RDebugUtils.currentLine=25755649;
 //BA.debugLineNum = 25755649;BA.debugLine="If yellow Then";
if (_yellow) { 
RDebugUtils.currentLine=25755650;
 //BA.debugLineNum = 25755650;BA.debugLine="lbl.Style = \"-fx-text-fill: #ffff00;\" '= fx.Colo";
_lbl.setStyle("-fx-text-fill: #ffff00;");
 }else {
RDebugUtils.currentLine=25755652;
 //BA.debugLineNum = 25755652;BA.debugLine="lbl.Style = \"-fx-text-fill: #ffffff;\"";
_lbl.setStyle("-fx-text-fill: #ffffff;");
 };
RDebugUtils.currentLine=25755655;
 //BA.debugLineNum = 25755655;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=26411009;
 //BA.debugLineNum = 26411009;BA.debugLine="v.SetRotationAnimated(duration, degrees)";
_v.SetRotationAnimated(_duration,_degrees);
RDebugUtils.currentLine=26411010;
 //BA.debugLineNum = 26411010;BA.debugLine="Sleep(duration + 20) '+20 to make sure that the n";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "func", "animacao_rotacao"),(int) (_duration+20));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=26411011;
 //BA.debugLineNum = 26411011;BA.debugLine="v.Rotation = 0";
_v.setRotation(0);
RDebugUtils.currentLine=26411012;
 //BA.debugLineNum = 26411012;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _setprogress(b4j.example.b4xprogressbar _v,float _progress) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setprogress", false))
	 {return ((String) Debug.delegate(ba, "setprogress", new Object[] {_v,_progress}));}
RDebugUtils.currentLine=26476544;
 //BA.debugLineNum = 26476544;BA.debugLine="Sub setProgress(v As B4XProgressBar, progress As F";
RDebugUtils.currentLine=26476546;
 //BA.debugLineNum = 26476546;BA.debugLine="v.Progress = progress";
_v._setprogress /*float*/ (null,_progress);
RDebugUtils.currentLine=26476549;
 //BA.debugLineNum = 26476549;BA.debugLine="End Sub";
return "";
}
public static String  _checkmatchwon(String _player) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "checkmatchwon", false))
	 {return ((String) Debug.delegate(ba, "checkmatchwon", new Object[] {_player}));}
RDebugUtils.currentLine=26279936;
 //BA.debugLineNum = 26279936;BA.debugLine="Sub checkMatchWon(player As String)";
RDebugUtils.currentLine=26279937;
 //BA.debugLineNum = 26279937;BA.debugLine="If player = \"p1\" Then";
if ((_player).equals("p1")) { 
RDebugUtils.currentLine=26279938;
 //BA.debugLineNum = 26279938;BA.debugLine="CallSub(scorebord, \"checkMatchWonP1\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(ba,(Object)(_scorebord.getObject()),"checkMatchWonP1");
 };
RDebugUtils.currentLine=26279941;
 //BA.debugLineNum = 26279941;BA.debugLine="If player = \"p2\" Then";
if ((_player).equals("p2")) { 
RDebugUtils.currentLine=26279942;
 //BA.debugLineNum = 26279942;BA.debugLine="CallSub(scorebord, \"checkMatchWonP2\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(ba,(Object)(_scorebord.getObject()),"checkMatchWonP2");
 };
RDebugUtils.currentLine=26279944;
 //BA.debugLineNum = 26279944;BA.debugLine="End Sub";
return "";
}
public static String  _detectos() throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "detectos", false))
	 {return ((String) Debug.delegate(ba, "detectos", null));}
RDebugUtils.currentLine=26673152;
 //BA.debugLineNum = 26673152;BA.debugLine="Sub DetectOS As String";
RDebugUtils.currentLine=26673153;
 //BA.debugLineNum = 26673153;BA.debugLine="Dim os As String = GetSystemProperty(\"os.name\", \"";
_os = anywheresoftware.b4a.keywords.Common.GetSystemProperty("os.name","").toLowerCase();
RDebugUtils.currentLine=26673154;
 //BA.debugLineNum = 26673154;BA.debugLine="If os.Contains(\"win\") Then";
if (_os.contains("win")) { 
RDebugUtils.currentLine=26673155;
 //BA.debugLineNum = 26673155;BA.debugLine="Return \"windows\"";
if (true) return "windows";
 }else 
{RDebugUtils.currentLine=26673156;
 //BA.debugLineNum = 26673156;BA.debugLine="Else If os.Contains(\"mac\") Then";
if (_os.contains("mac")) { 
RDebugUtils.currentLine=26673157;
 //BA.debugLineNum = 26673157;BA.debugLine="Return \"mac\"";
if (true) return "mac";
 }else {
RDebugUtils.currentLine=26673159;
 //BA.debugLineNum = 26673159;BA.debugLine="Return \"linux\"";
if (true) return "linux";
 }}
;
RDebugUtils.currentLine=26673161;
 //BA.debugLineNum = 26673161;BA.debugLine="End Sub";
return "";
}
}