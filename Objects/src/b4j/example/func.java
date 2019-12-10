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
public static String _txtscore = "";
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.main _main = null;
public static b4j.example.scorebord _scorebord = null;
public static b4j.example.funcinet _funcinet = null;
public static b4j.example.parseconfig _parseconfig = null;
public static b4j.example.httputils2service _httputils2service = null;
public static String  _testnumber(String _oldstringtotest,String _newstringtotest) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "testnumber", false))
	 {return ((String) Debug.delegate(ba, "testnumber", new Object[] {_oldstringtotest,_newstringtotest}));}
String _stringtotest = "";
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub testNumber(oldStringToTest As String, n";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Dim stringToTest As String";
_stringtotest = "";
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="If newStringToTest.Length = 1 Then";
if (_newstringtotest.length()==1) { 
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="stringToTest = newStringToTest";
_stringtotest = _newstringtotest;
 }else {
RDebugUtils.currentLine=4128774;
 //BA.debugLineNum = 4128774;BA.debugLine="stringToTest = 	newStringToTest.Replace(oldStrin";
_stringtotest = _newstringtotest.replace(_oldstringtotest,"");
 };
RDebugUtils.currentLine=4128777;
 //BA.debugLineNum = 4128777;BA.debugLine="regexStr.Initialize";
_regexstr.Initialize();
RDebugUtils.currentLine=4128778;
 //BA.debugLineNum = 4128778;BA.debugLine="regexStr.Append(\"[0-9]*\\.[0-9]*|[0-9]*\")";
_regexstr.Append("[0-9]*\\.[0-9]*|[0-9]*");
RDebugUtils.currentLine=4128780;
 //BA.debugLineNum = 4128780;BA.debugLine="If Regex.IsMatch(regexStr.ToString,stringToTest)";
if (anywheresoftware.b4a.keywords.Common.Regex.IsMatch(_regexstr.ToString(),_stringtotest)==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=4128781;
 //BA.debugLineNum = 4128781;BA.debugLine="Return newStringToTest";
if (true) return _newstringtotest;
 }else {
RDebugUtils.currentLine=4128783;
 //BA.debugLineNum = 4128783;BA.debugLine="Return oldStringToTest";
if (true) return _oldstringtotest;
 };
RDebugUtils.currentLine=4128786;
 //BA.debugLineNum = 4128786;BA.debugLine="End Sub";
return "";
}
public static String  _padstring(String _padtext,String _padchr,int _padside,int _padcount) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "padstring", false))
	 {return ((String) Debug.delegate(ba, "padstring", new Object[] {_padtext,_padchr,_padside,_padcount}));}
String _padstr = "";
int _i = 0;
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub padString(padText As String ,padChr As";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Dim padStr As String";
_padstr = "";
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="If padText.Length = padCount Then";
if (_padtext.length()==_padcount) { 
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="Return padText";
if (true) return _padtext;
 };
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="For i = 1 To padCount-padText.Length";
{
final int step5 = 1;
final int limit5 = (int) (_padcount-_padtext.length());
_i = (int) (1) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="padStr = padStr&padChr";
_padstr = _padstr+_padchr;
 }
};
RDebugUtils.currentLine=4390923;
 //BA.debugLineNum = 4390923;BA.debugLine="If padSide = 0 Then";
if (_padside==0) { 
RDebugUtils.currentLine=4390924;
 //BA.debugLineNum = 4390924;BA.debugLine="Return padStr&padText";
if (true) return _padstr+_padtext;
 }else {
RDebugUtils.currentLine=4390926;
 //BA.debugLineNum = 4390926;BA.debugLine="Return padText&padStr";
if (true) return _padtext+_padstr;
 };
RDebugUtils.currentLine=4390929;
 //BA.debugLineNum = 4390929;BA.debugLine="End Sub";
return "";
}
public static String  _calcmoyenne(anywheresoftware.b4j.objects.LabelWrapper _mplayerone,anywheresoftware.b4j.objects.LabelWrapper _mplayertwo) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "calcmoyenne", false))
	 {return ((String) Debug.delegate(ba, "calcmoyenne", new Object[] {_mplayerone,_mplayertwo}));}
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Sub calcMoyenne(mPlayerOne As Label, mPlayerTwo As";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="mPlayerOne.Text = NumberFormat2((scorePlayerOne/i";
_mplayerone.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="mPlayerTwo.Text = NumberFormat2((scorePlayerTwo/i";
_mplayertwo.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="End Sub";
return "";
}
public static String  _processhs(String _player) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "processhs", false))
	 {return ((String) Debug.delegate(ba, "processhs", new Object[] {_player}));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Sub processHs(player As String)";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="If player = \"p1\" Then";
if ((_player).equals("p1")) { 
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="If p1HsTemp > 0 And p1HsTemp > playerOneHs Then";
if (_p1hstemp>0 && _p1hstemp>_playeronehs) { 
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="playerOneHs = p1HsTemp";
_playeronehs = _p1hstemp;
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="p1HsTemp = 0";
_p1hstemp = (int) (0);
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="lbl_player_one_hs.Text = padString(playerOneHs,";
_lbl_player_one_hs.setText(_padstring(BA.NumberToString(_playeronehs),"0",(int) (0),(int) (3)));
 };
 };
RDebugUtils.currentLine=4784138;
 //BA.debugLineNum = 4784138;BA.debugLine="If player = \"p2\" Then";
if ((_player).equals("p2")) { 
RDebugUtils.currentLine=4784139;
 //BA.debugLineNum = 4784139;BA.debugLine="If p2HsTemp > 0 And p2HsTemp > playerTwoHs Then";
if (_p2hstemp>0 && _p2hstemp>_playertwohs) { 
RDebugUtils.currentLine=4784140;
 //BA.debugLineNum = 4784140;BA.debugLine="playerTwoHs = p2HsTemp";
_playertwohs = _p2hstemp;
RDebugUtils.currentLine=4784141;
 //BA.debugLineNum = 4784141;BA.debugLine="p2HsTemp = 0";
_p2hstemp = (int) (0);
RDebugUtils.currentLine=4784142;
 //BA.debugLineNum = 4784142;BA.debugLine="lbl_player_two_hs.Text = padString(playerTwoHs,";
_lbl_player_two_hs.setText(_padstring(BA.NumberToString(_playertwohs),"0",(int) (0),(int) (3)));
 };
 };
RDebugUtils.currentLine=4784147;
 //BA.debugLineNum = 4784147;BA.debugLine="If player = \"all\" Then";
if ((_player).equals("all")) { 
RDebugUtils.currentLine=4784148;
 //BA.debugLineNum = 4784148;BA.debugLine="If p1HsTemp > 0 And p1HsTemp > playerOneHs Then";
if (_p1hstemp>0 && _p1hstemp>_playeronehs) { 
RDebugUtils.currentLine=4784149;
 //BA.debugLineNum = 4784149;BA.debugLine="playerOneHs = p1HsTemp";
_playeronehs = _p1hstemp;
RDebugUtils.currentLine=4784150;
 //BA.debugLineNum = 4784150;BA.debugLine="p1HsTemp = 0";
_p1hstemp = (int) (0);
RDebugUtils.currentLine=4784151;
 //BA.debugLineNum = 4784151;BA.debugLine="lbl_player_one_hs.Text = padString(playerOneHs,";
_lbl_player_one_hs.setText(_padstring(BA.NumberToString(_playeronehs),"0",(int) (0),(int) (3)));
 };
RDebugUtils.currentLine=4784156;
 //BA.debugLineNum = 4784156;BA.debugLine="If p2HsTemp > 0 And p2HsTemp > playerTwoHs Then";
if (_p2hstemp>0 && _p2hstemp>_playertwohs) { 
RDebugUtils.currentLine=4784157;
 //BA.debugLineNum = 4784157;BA.debugLine="playerTwoHs = p2HsTemp";
_playertwohs = _p2hstemp;
RDebugUtils.currentLine=4784158;
 //BA.debugLineNum = 4784158;BA.debugLine="p2HsTemp = 0";
_p2hstemp = (int) (0);
RDebugUtils.currentLine=4784159;
 //BA.debugLineNum = 4784159;BA.debugLine="lbl_player_two_hs.Text = padString(playerTwoHs,";
_lbl_player_two_hs.setText(_padstring(BA.NumberToString(_playertwohs),"0",(int) (0),(int) (3)));
 };
 };
RDebugUtils.currentLine=4784164;
 //BA.debugLineNum = 4784164;BA.debugLine="End Sub";
return "";
}
public static String  _calcscoreplayerone(int _points) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "calcscoreplayerone", false))
	 {return ((String) Debug.delegate(ba, "calcscoreplayerone", new Object[] {_points}));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Sub calcScorePlayerOne(points As Int)";
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="CallSubDelayed(scorebord, \"lastClick\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(ba,(Object)(_scorebord.getObject()),"lastClick");
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="If score > 9999 Or score <= -1 Then";
if (_score>9999 || _score<=-1) { 
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="processHs(\"p2\")";
_processhs("p2");
RDebugUtils.currentLine=4456456;
 //BA.debugLineNum = 4456456;BA.debugLine="p1HsTemp	= p1HsTemp + points";
_p1hstemp = (int) (_p1hstemp+_points);
RDebugUtils.currentLine=4456457;
 //BA.debugLineNum = 4456457;BA.debugLine="score		= p1_100.Text&p1_10.Text&p1_1.Text";
_score = (int)(Double.parseDouble(_p1_100.getText()+_p1_10.getText()+_p1_1.getText()));
RDebugUtils.currentLine=4456458;
 //BA.debugLineNum = 4456458;BA.debugLine="score		= score+points";
_score = (int) (_score+_points);
RDebugUtils.currentLine=4456460;
 //BA.debugLineNum = 4456460;BA.debugLine="If score > 999 Or score <= -1 Then";
if (_score>999 || _score<=-1) { 
RDebugUtils.currentLine=4456461;
 //BA.debugLineNum = 4456461;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4456464;
 //BA.debugLineNum = 4456464;BA.debugLine="If lblInnings.Text = \"000\" Then";
if ((_lblinnings.getText()).equals("000")) { 
RDebugUtils.currentLine=4456465;
 //BA.debugLineNum = 4456465;BA.debugLine="lblInnings.Text	= \"001\"";
_lblinnings.setText("001");
RDebugUtils.currentLine=4456466;
 //BA.debugLineNum = 4456466;BA.debugLine="innigs			= 1";
_innigs = (int) (1);
RDebugUtils.currentLine=4456467;
 //BA.debugLineNum = 4456467;BA.debugLine="inngSet			= 1";
_inngset = (int) (1);
 };
RDebugUtils.currentLine=4456470;
 //BA.debugLineNum = 4456470;BA.debugLine="If inngSet <> 1 And score <> scorePlayerOne Then";
if (_inngset!=1 && _score!=_scoreplayerone) { 
RDebugUtils.currentLine=4456471;
 //BA.debugLineNum = 4456471;BA.debugLine="innigs = lblInnings.Text";
_innigs = (int)(Double.parseDouble(_lblinnings.getText()));
RDebugUtils.currentLine=4456472;
 //BA.debugLineNum = 4456472;BA.debugLine="innigs = innigs + 1";
_innigs = (int) (_innigs+1);
RDebugUtils.currentLine=4456473;
 //BA.debugLineNum = 4456473;BA.debugLine="lblInnings.Text = padString(innigs, \"0\", 0, 3)";
_lblinnings.setText(_padstring(BA.NumberToString(_innigs),"0",(int) (0),(int) (3)));
RDebugUtils.currentLine=4456474;
 //BA.debugLineNum = 4456474;BA.debugLine="inngSet = 1";
_inngset = (int) (1);
 };
RDebugUtils.currentLine=4456477;
 //BA.debugLineNum = 4456477;BA.debugLine="scorePlayerOne = score";
_scoreplayerone = _score;
RDebugUtils.currentLine=4456479;
 //BA.debugLineNum = 4456479;BA.debugLine="txtScore = padString(score, \"0\", 0, 4)";
_txtscore = _padstring(BA.NumberToString(_score),"0",(int) (0),(int) (4));
RDebugUtils.currentLine=4456482;
 //BA.debugLineNum = 4456482;BA.debugLine="p1_100.Text		= txtScore.SubString2(1,2)";
_p1_100.setText(_txtscore.substring((int) (1),(int) (2)));
RDebugUtils.currentLine=4456483;
 //BA.debugLineNum = 4456483;BA.debugLine="p1_10.Text		= txtScore.SubString2(2,3)";
_p1_10.setText(_txtscore.substring((int) (2),(int) (3)));
RDebugUtils.currentLine=4456484;
 //BA.debugLineNum = 4456484;BA.debugLine="p1_1.Text		= txtScore.SubString2(3,4)";
_p1_1.setText(_txtscore.substring((int) (3),(int) (4)));
RDebugUtils.currentLine=4456486;
 //BA.debugLineNum = 4456486;BA.debugLine="p1_moyenne.Text = NumberFormat2((scorePlayerOne/i";
_p1_moyenne.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=4456488;
 //BA.debugLineNum = 4456488;BA.debugLine="If playerOneToMake > 0 Then";
if (_playeronetomake>0) { 
RDebugUtils.currentLine=4456489;
 //BA.debugLineNum = 4456489;BA.debugLine="CallSub2(scorebord, \"playerOnePerc\", NumberForma";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerOnePerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_playeronetomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
RDebugUtils.currentLine=4456490;
 //BA.debugLineNum = 4456490;BA.debugLine="p1_progress = (scorePlayerOne/playerOneToMake)*1";
_p1_progress = (float) ((_scoreplayerone/(double)_playeronetomake)*100);
 };
RDebugUtils.currentLine=4456492;
 //BA.debugLineNum = 4456492;BA.debugLine="setProgress(p1_progressBar, p1_progress)";
_setprogress(_p1_progressbar,_p1_progress);
RDebugUtils.currentLine=4456493;
 //BA.debugLineNum = 4456493;BA.debugLine="checkMatchWon(\"p1\")";
_checkmatchwon("p1");
RDebugUtils.currentLine=4456495;
 //BA.debugLineNum = 4456495;BA.debugLine="End Sub";
return "";
}
public static String  _playeronemake(anywheresoftware.b4j.objects.LabelWrapper _lbl100,anywheresoftware.b4j.objects.LabelWrapper _lbl10,anywheresoftware.b4j.objects.LabelWrapper _lbl1,boolean _leftbutton,int _number) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "playeronemake", false))
	 {return ((String) Debug.delegate(ba, "playeronemake", new Object[] {_lbl100,_lbl10,_lbl1,_leftbutton,_number}));}
String _strmaker = "";
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Sub playerOneMake(lbl100 As Label, lbl10 As Label,";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Dim strMaker As String";
_strmaker = "";
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="make = $\"${lbl100.Text}${lbl10.Text}${lbl1.Text}\"";
_make = (int)(Double.parseDouble((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl100.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl10.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl1.getText()))+"")));
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="If leftButton Then";
if (_leftbutton) { 
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="make = make+number";
_make = (int) (_make+_number);
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="If make > 999 Then";
if (_make>999) { 
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="Return";
if (true) return "";
 };
 }else {
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="make = make-number";
_make = (int) (_make-_number);
RDebugUtils.currentLine=4653067;
 //BA.debugLineNum = 4653067;BA.debugLine="If make < 0 Then";
if (_make<0) { 
RDebugUtils.currentLine=4653068;
 //BA.debugLineNum = 4653068;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=4653073;
 //BA.debugLineNum = 4653073;BA.debugLine="strMaker	= padString(make, \"0\", 0, 3)";
_strmaker = _padstring(BA.NumberToString(_make),"0",(int) (0),(int) (3));
RDebugUtils.currentLine=4653074;
 //BA.debugLineNum = 4653074;BA.debugLine="lbl100.Text = strMaker.SubString2(0,1)";
_lbl100.setText(_strmaker.substring((int) (0),(int) (1)));
RDebugUtils.currentLine=4653075;
 //BA.debugLineNum = 4653075;BA.debugLine="lbl10.Text	= strMaker.SubString2(1,2)";
_lbl10.setText(_strmaker.substring((int) (1),(int) (2)));
RDebugUtils.currentLine=4653076;
 //BA.debugLineNum = 4653076;BA.debugLine="lbl1.Text	= strMaker.SubString2(2,3)";
_lbl1.setText(_strmaker.substring((int) (2),(int) (3)));
RDebugUtils.currentLine=4653078;
 //BA.debugLineNum = 4653078;BA.debugLine="playerOneToMake = make";
_playeronetomake = _make;
RDebugUtils.currentLine=4653079;
 //BA.debugLineNum = 4653079;BA.debugLine="p1_progress = (scorePlayerOne/playerOneToMake)*10";
_p1_progress = (float) ((_scoreplayerone/(double)_playeronetomake)*100);
RDebugUtils.currentLine=4653080;
 //BA.debugLineNum = 4653080;BA.debugLine="setProgress(p1_progressBar, p1_progress)";
_setprogress(_p1_progressbar,_p1_progress);
RDebugUtils.currentLine=4653081;
 //BA.debugLineNum = 4653081;BA.debugLine="CallSub2(scorebord, \"playerOnePerc\", NumberFormat";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerOnePerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_playeronetomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
RDebugUtils.currentLine=4653082;
 //BA.debugLineNum = 4653082;BA.debugLine="End Sub";
return "";
}
public static String  _calcscoreplayertwo(int _points) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "calcscoreplayertwo", false))
	 {return ((String) Debug.delegate(ba, "calcscoreplayertwo", new Object[] {_points}));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Sub calcScorePlayertwo(points As Int)";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="CallSubDelayed(scorebord, \"lastClick\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(ba,(Object)(_scorebord.getObject()),"lastClick");
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="inngSet = 0";
_inngset = (int) (0);
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="processHs(\"p1\")";
_processhs("p1");
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="p2HsTemp = p2HsTemp + points";
_p2hstemp = (int) (_p2hstemp+_points);
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="score = p2_100.Text&p2_10.Text&p2_1.Text";
_score = (int)(Double.parseDouble(_p2_100.getText()+_p2_10.getText()+_p2_1.getText()));
RDebugUtils.currentLine=4521991;
 //BA.debugLineNum = 4521991;BA.debugLine="score = score+points";
_score = (int) (_score+_points);
RDebugUtils.currentLine=4521993;
 //BA.debugLineNum = 4521993;BA.debugLine="If score > 999 Or score <= -1 Then";
if (_score>999 || _score<=-1) { 
RDebugUtils.currentLine=4521994;
 //BA.debugLineNum = 4521994;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4521997;
 //BA.debugLineNum = 4521997;BA.debugLine="If lblInnings.Text = \"000\" Then";
if ((_lblinnings.getText()).equals("000")) { 
RDebugUtils.currentLine=4521998;
 //BA.debugLineNum = 4521998;BA.debugLine="lblInnings.Text	= \"001\"";
_lblinnings.setText("001");
RDebugUtils.currentLine=4521999;
 //BA.debugLineNum = 4521999;BA.debugLine="innigs			= 1";
_innigs = (int) (1);
RDebugUtils.currentLine=4522000;
 //BA.debugLineNum = 4522000;BA.debugLine="inngSet			= 1";
_inngset = (int) (1);
 };
RDebugUtils.currentLine=4522003;
 //BA.debugLineNum = 4522003;BA.debugLine="playerTwoHs		= scorePlayerTwo - playerTwoHs";
_playertwohs = (int) (_scoreplayertwo-_playertwohs);
RDebugUtils.currentLine=4522004;
 //BA.debugLineNum = 4522004;BA.debugLine="scorePlayerTwo	= score";
_scoreplayertwo = _score;
RDebugUtils.currentLine=4522005;
 //BA.debugLineNum = 4522005;BA.debugLine="txtScore		= padString(score, \"0\", 0, 4)";
_txtscore = _padstring(BA.NumberToString(_score),"0",(int) (0),(int) (4));
RDebugUtils.currentLine=4522008;
 //BA.debugLineNum = 4522008;BA.debugLine="p2_100.Text		= txtScore.SubString2(1,2)";
_p2_100.setText(_txtscore.substring((int) (1),(int) (2)));
RDebugUtils.currentLine=4522009;
 //BA.debugLineNum = 4522009;BA.debugLine="p2_10.Text		= txtScore.SubString2(2,3)";
_p2_10.setText(_txtscore.substring((int) (2),(int) (3)));
RDebugUtils.currentLine=4522010;
 //BA.debugLineNum = 4522010;BA.debugLine="p2_1.Text		= txtScore.SubString2(3,4)";
_p2_1.setText(_txtscore.substring((int) (3),(int) (4)));
RDebugUtils.currentLine=4522011;
 //BA.debugLineNum = 4522011;BA.debugLine="p2_moyenne.Text = NumberFormat2((scorePlayerTwo/i";
_p2_moyenne.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=4522013;
 //BA.debugLineNum = 4522013;BA.debugLine="If playerTwoToMake > 0 Then";
if (_playertwotomake>0) { 
RDebugUtils.currentLine=4522014;
 //BA.debugLineNum = 4522014;BA.debugLine="CallSub2(scorebord, \"playerTwoPerc\", NumberForma";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerTwoPerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_playertwotomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
RDebugUtils.currentLine=4522015;
 //BA.debugLineNum = 4522015;BA.debugLine="p2_progress = (scorePlayerTwo/playerTwoToMake)*1";
_p2_progress = (float) ((_scoreplayertwo/(double)_playertwotomake)*100);
 };
RDebugUtils.currentLine=4522017;
 //BA.debugLineNum = 4522017;BA.debugLine="setProgress(p2_progressBar, p2_progress)";
_setprogress(_p2_progressbar,_p2_progress);
RDebugUtils.currentLine=4522018;
 //BA.debugLineNum = 4522018;BA.debugLine="checkMatchWon(\"p2\")";
_checkmatchwon("p2");
RDebugUtils.currentLine=4522020;
 //BA.debugLineNum = 4522020;BA.debugLine="End Sub";
return "";
}
public static String  _playertwomake(anywheresoftware.b4j.objects.LabelWrapper _lbl100,anywheresoftware.b4j.objects.LabelWrapper _lbl10,anywheresoftware.b4j.objects.LabelWrapper _lbl1,boolean _leftbutton,int _number) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "playertwomake", false))
	 {return ((String) Debug.delegate(ba, "playertwomake", new Object[] {_lbl100,_lbl10,_lbl1,_leftbutton,_number}));}
String _strmaker = "";
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Sub playerTwoMake(lbl100 As Label, lbl10 As Label,";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Dim strMaker As String";
_strmaker = "";
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="make = $\"${lbl100.Text}${lbl10.Text}${lbl1.Text}\"";
_make = (int)(Double.parseDouble((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl100.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl10.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl1.getText()))+"")));
RDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="If leftButton Then";
if (_leftbutton) { 
RDebugUtils.currentLine=4718597;
 //BA.debugLineNum = 4718597;BA.debugLine="make = make+number";
_make = (int) (_make+_number);
RDebugUtils.currentLine=4718598;
 //BA.debugLineNum = 4718598;BA.debugLine="If make > 999 Then";
if (_make>999) { 
RDebugUtils.currentLine=4718599;
 //BA.debugLineNum = 4718599;BA.debugLine="Return";
if (true) return "";
 };
 }else {
RDebugUtils.currentLine=4718602;
 //BA.debugLineNum = 4718602;BA.debugLine="make = make-number";
_make = (int) (_make-_number);
RDebugUtils.currentLine=4718603;
 //BA.debugLineNum = 4718603;BA.debugLine="If make < 0 Then";
if (_make<0) { 
RDebugUtils.currentLine=4718604;
 //BA.debugLineNum = 4718604;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=4718609;
 //BA.debugLineNum = 4718609;BA.debugLine="strMaker	= padString(make, \"0\", 0, 3)";
_strmaker = _padstring(BA.NumberToString(_make),"0",(int) (0),(int) (3));
RDebugUtils.currentLine=4718610;
 //BA.debugLineNum = 4718610;BA.debugLine="lbl100.Text = strMaker.SubString2(0,1)";
_lbl100.setText(_strmaker.substring((int) (0),(int) (1)));
RDebugUtils.currentLine=4718611;
 //BA.debugLineNum = 4718611;BA.debugLine="lbl10.Text	= strMaker.SubString2(1,2)";
_lbl10.setText(_strmaker.substring((int) (1),(int) (2)));
RDebugUtils.currentLine=4718612;
 //BA.debugLineNum = 4718612;BA.debugLine="lbl1.Text	= strMaker.SubString2(2,3)";
_lbl1.setText(_strmaker.substring((int) (2),(int) (3)));
RDebugUtils.currentLine=4718614;
 //BA.debugLineNum = 4718614;BA.debugLine="playerTwoToMake = make";
_playertwotomake = _make;
RDebugUtils.currentLine=4718615;
 //BA.debugLineNum = 4718615;BA.debugLine="p2_progress = (scorePlayerTwo/playerTwoToMake)*10";
_p2_progress = (float) ((_scoreplayertwo/(double)_playertwotomake)*100);
RDebugUtils.currentLine=4718616;
 //BA.debugLineNum = 4718616;BA.debugLine="setProgress(p1_progressBar, p1_progress)";
_setprogress(_p1_progressbar,_p1_progress);
RDebugUtils.currentLine=4718617;
 //BA.debugLineNum = 4718617;BA.debugLine="CallSub2(scorebord, \"playerTwoPerc\", NumberFormat";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerTwoPerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_playertwotomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
RDebugUtils.currentLine=4718618;
 //BA.debugLineNum = 4718618;BA.debugLine="End Sub";
return "";
}
public static String  _caromlabelcss(anywheresoftware.b4j.objects.LabelWrapper _lbl,String _style) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "caromlabelcss", false))
	 {return ((String) Debug.delegate(ba, "caromlabelcss", new Object[] {_lbl,_style}));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Sub caromLabelCss(lbl As Label, style As String)";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="lbl.StyleClasses.Add(style)";
_lbl.getStyleClasses().Add((Object)(_style));
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="End Sub";
return "";
}
public static String  _setformcursor(anywheresoftware.b4j.objects.Form _frm,String _imagefile) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setformcursor", false))
	 {return ((String) Debug.delegate(ba, "setformcursor", new Object[] {_frm,_imagefile}));}
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _img = null;
anywheresoftware.b4j.object.JavaObject _joimagecursor = null;
anywheresoftware.b4j.object.JavaObject _jocursor = null;
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Sub SetFormCursor(frm As Form, imagefile As String";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Dim img As Image";
_img = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="img.Initialize(File.DirAssets, imagefile)";
_img.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imagefile);
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="Dim joImageCursor As JavaObject";
_joimagecursor = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="joImageCursor.InitializeNewInstance(\"javafx.scene";
_joimagecursor.InitializeNewInstance("javafx.scene.ImageCursor",new Object[]{(Object)(_img.getObject())});
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="Dim joCursor As JavaObject = frm.RootPane";
_jocursor = new anywheresoftware.b4j.object.JavaObject();
_jocursor.setObject((java.lang.Object)(_frm.getRootPane().getObject()));
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="joCursor.RunMethod(\"setCursor\", Array(joImageCurs";
_jocursor.RunMethod("setCursor",new Object[]{(Object)(_joimagecursor.getObject())});
RDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="End Sub";
return "";
}
public static String  _setp1caromlables(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setp1caromlables", false))
	 {return ((String) Debug.delegate(ba, "setp1caromlables", new Object[] {_lst}));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub setP1CaromLables(lst As List)";
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="p1_100		= lst.Get(2)";
_p1_100.setObject((javafx.scene.control.Label)(_lst.Get((int) (2))));
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="p1_10		= lst.Get(1)";
_p1_10.setObject((javafx.scene.control.Label)(_lst.Get((int) (1))));
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="p1_1		= lst.Get(0)";
_p1_1.setObject((javafx.scene.control.Label)(_lst.Get((int) (0))));
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="p1_moyenne	= lst.Get(3)";
_p1_moyenne.setObject((javafx.scene.control.Label)(_lst.Get((int) (3))));
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="p1_progressBar = lst.Get(4)";
_p1_progressbar = (b4j.example.b4xprogressbar)(_lst.Get((int) (4)));
RDebugUtils.currentLine=4194311;
 //BA.debugLineNum = 4194311;BA.debugLine="End Sub";
return "";
}
public static String  _setp2caromlables(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setp2caromlables", false))
	 {return ((String) Debug.delegate(ba, "setp2caromlables", new Object[] {_lst}));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub setP2CaromLables(lst As List)";
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="p2_100		= lst.Get(2)";
_p2_100.setObject((javafx.scene.control.Label)(_lst.Get((int) (2))));
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="p2_10		= lst.Get(1)";
_p2_10.setObject((javafx.scene.control.Label)(_lst.Get((int) (1))));
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="p2_1		= lst.Get(0)";
_p2_1.setObject((javafx.scene.control.Label)(_lst.Get((int) (0))));
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="p2_moyenne	= lst.Get(3)";
_p2_moyenne.setObject((javafx.scene.control.Label)(_lst.Get((int) (3))));
RDebugUtils.currentLine=4259846;
 //BA.debugLineNum = 4259846;BA.debugLine="p2_progressBar	= lst.Get(4)";
_p2_progressbar = (b4j.example.b4xprogressbar)(_lst.Get((int) (4)));
RDebugUtils.currentLine=4259847;
 //BA.debugLineNum = 4259847;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="v.SetRotationAnimated(duration, degrees)";
_v.SetRotationAnimated(_duration,_degrees);
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="Sleep(duration + 20) '+20 to make sure that the n";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "func", "animacao_rotacao"),(int) (_duration+20));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="v.Rotation = 0";
_v.setRotation(0);
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _setprogress(b4j.example.b4xprogressbar _v,float _progress) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setprogress", false))
	 {return ((String) Debug.delegate(ba, "setprogress", new Object[] {_v,_progress}));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Sub setProgress(v As B4XProgressBar, progress As F";
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="v.Progress = progress";
_v._setprogress /*float*/ (null,_progress);
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="End Sub";
return "";
}
public static String  _checkmatchwon(String _player) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "checkmatchwon", false))
	 {return ((String) Debug.delegate(ba, "checkmatchwon", new Object[] {_player}));}
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub checkMatchWon(player As String)";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="If player = \"p1\" Then";
if ((_player).equals("p1")) { 
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="CallSub(scorebord, \"checkMatchWonP1\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(ba,(Object)(_scorebord.getObject()),"checkMatchWonP1");
 };
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="If player = \"p2\" Then";
if ((_player).equals("p2")) { 
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="CallSub(scorebord, \"checkMatchWonP2\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(ba,(Object)(_scorebord.getObject()),"checkMatchWonP2");
 };
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="End Sub";
return "";
}
public static String  _setfont(anywheresoftware.b4j.objects.LabelWrapper _lbl,int _size) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setfont", false))
	 {return ((String) Debug.delegate(ba, "setfont", new Object[] {_lbl,_size}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub setFont(lbl As Label, size As Int)";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Dim jo As JavaObject=lbl";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="jo.runMethod(\"setFont\",Array(fx.LoadFont(File.Dir";
_jo.RunMethod("setFont",new Object[]{(Object)(_fx.LoadFont(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"digital-7 (mono).ttf",_size).getObject())});
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="End Sub";
return "";
}
public static String  _setnumbercss(anywheresoftware.b4j.objects.LabelWrapper _lbl) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setnumbercss", false))
	 {return ((String) Debug.delegate(ba, "setnumbercss", new Object[] {_lbl}));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Sub setNumberCss(lbl As Label)";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="CSSUtils.SetStyleProperty(lbl, \"-fx-background-co";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_lbl.getObject())),"-fx-background-color","linear-gradient(to bottom,  #cfe7fa 0%,#6393c1 100%)");
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="CSSUtils.SetStyleProperty(lbl, \"-fx-background-ra";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_lbl.getObject())),"-fx-background-radius","3,2,1");
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="End Sub";
return "";
}
}