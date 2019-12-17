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
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub testNumber(oldStringToTest As String, n";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="Dim stringToTest As String";
_stringtotest = "";
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="If newStringToTest.Length = 1 Then";
if (_newstringtotest.length()==1) { 
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="stringToTest = newStringToTest";
_stringtotest = _newstringtotest;
 }else {
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="stringToTest = 	newStringToTest.Replace(oldStrin";
_stringtotest = _newstringtotest.replace(_oldstringtotest,"");
 };
RDebugUtils.currentLine=4456457;
 //BA.debugLineNum = 4456457;BA.debugLine="regexStr.Initialize";
_regexstr.Initialize();
RDebugUtils.currentLine=4456458;
 //BA.debugLineNum = 4456458;BA.debugLine="regexStr.Append(\"[0-9]*\\.[0-9]*|[0-9]*\")";
_regexstr.Append("[0-9]*\\.[0-9]*|[0-9]*");
RDebugUtils.currentLine=4456460;
 //BA.debugLineNum = 4456460;BA.debugLine="If Regex.IsMatch(regexStr.ToString,stringToTest)";
if (anywheresoftware.b4a.keywords.Common.Regex.IsMatch(_regexstr.ToString(),_stringtotest)==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=4456461;
 //BA.debugLineNum = 4456461;BA.debugLine="Return newStringToTest";
if (true) return _newstringtotest;
 }else {
RDebugUtils.currentLine=4456463;
 //BA.debugLineNum = 4456463;BA.debugLine="Return oldStringToTest";
if (true) return _oldstringtotest;
 };
RDebugUtils.currentLine=4456466;
 //BA.debugLineNum = 4456466;BA.debugLine="End Sub";
return "";
}
public static String  _padstring(String _padtext,String _padchr,int _padside,int _padcount) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "padstring", false))
	 {return ((String) Debug.delegate(ba, "padstring", new Object[] {_padtext,_padchr,_padside,_padcount}));}
String _padstr = "";
int _i = 0;
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub padString(padText As String ,padChr As";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Dim padStr As String";
_padstr = "";
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="If padText.Length = padCount Then";
if (_padtext.length()==_padcount) { 
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="Return padText";
if (true) return _padtext;
 };
RDebugUtils.currentLine=4784135;
 //BA.debugLineNum = 4784135;BA.debugLine="For i = 1 To padCount-padText.Length";
{
final int step5 = 1;
final int limit5 = (int) (_padcount-_padtext.length());
_i = (int) (1) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=4784136;
 //BA.debugLineNum = 4784136;BA.debugLine="padStr = padStr&padChr";
_padstr = _padstr+_padchr;
 }
};
RDebugUtils.currentLine=4784139;
 //BA.debugLineNum = 4784139;BA.debugLine="If padSide = 0 Then";
if (_padside==0) { 
RDebugUtils.currentLine=4784140;
 //BA.debugLineNum = 4784140;BA.debugLine="Return padStr&padText";
if (true) return _padstr+_padtext;
 }else {
RDebugUtils.currentLine=4784142;
 //BA.debugLineNum = 4784142;BA.debugLine="Return padText&padStr";
if (true) return _padtext+_padstr;
 };
RDebugUtils.currentLine=4784145;
 //BA.debugLineNum = 4784145;BA.debugLine="End Sub";
return "";
}
public static String  _calcmoyenne(anywheresoftware.b4j.objects.LabelWrapper _mplayerone,anywheresoftware.b4j.objects.LabelWrapper _mplayertwo) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "calcmoyenne", false))
	 {return ((String) Debug.delegate(ba, "calcmoyenne", new Object[] {_mplayerone,_mplayertwo}));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Sub calcMoyenne(mPlayerOne As Label, mPlayerTwo As";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="mPlayerOne.Text = NumberFormat2((scorePlayerOne/i";
_mplayerone.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="mPlayerTwo.Text = NumberFormat2((scorePlayerTwo/i";
_mplayertwo.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="End Sub";
return "";
}
public static String  _processhs(String _player) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "processhs", false))
	 {return ((String) Debug.delegate(ba, "processhs", new Object[] {_player}));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Sub processHs(player As String)";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="If player = \"p1\" Then";
if ((_player).equals("p1")) { 
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="If p1HsTemp > 0 And p1HsTemp > playerOneHs Then";
if (_p1hstemp>0 && _p1hstemp>_playeronehs) { 
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="playerOneHs = p1HsTemp";
_playeronehs = _p1hstemp;
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="p1HsTemp = 0";
_p1hstemp = (int) (0);
RDebugUtils.currentLine=5177349;
 //BA.debugLineNum = 5177349;BA.debugLine="lbl_player_one_hs.Text = padString(playerOneHs,";
_lbl_player_one_hs.setText(_padstring(BA.NumberToString(_playeronehs),"0",(int) (0),(int) (3)));
 };
 };
RDebugUtils.currentLine=5177354;
 //BA.debugLineNum = 5177354;BA.debugLine="If player = \"p2\" Then";
if ((_player).equals("p2")) { 
RDebugUtils.currentLine=5177355;
 //BA.debugLineNum = 5177355;BA.debugLine="If p2HsTemp > 0 And p2HsTemp > playerTwoHs Then";
if (_p2hstemp>0 && _p2hstemp>_playertwohs) { 
RDebugUtils.currentLine=5177356;
 //BA.debugLineNum = 5177356;BA.debugLine="playerTwoHs = p2HsTemp";
_playertwohs = _p2hstemp;
RDebugUtils.currentLine=5177357;
 //BA.debugLineNum = 5177357;BA.debugLine="p2HsTemp = 0";
_p2hstemp = (int) (0);
RDebugUtils.currentLine=5177358;
 //BA.debugLineNum = 5177358;BA.debugLine="lbl_player_two_hs.Text = padString(playerTwoHs,";
_lbl_player_two_hs.setText(_padstring(BA.NumberToString(_playertwohs),"0",(int) (0),(int) (3)));
 };
 };
RDebugUtils.currentLine=5177363;
 //BA.debugLineNum = 5177363;BA.debugLine="If player = \"all\" Then";
if ((_player).equals("all")) { 
RDebugUtils.currentLine=5177364;
 //BA.debugLineNum = 5177364;BA.debugLine="If p1HsTemp > 0 And p1HsTemp > playerOneHs Then";
if (_p1hstemp>0 && _p1hstemp>_playeronehs) { 
RDebugUtils.currentLine=5177365;
 //BA.debugLineNum = 5177365;BA.debugLine="playerOneHs = p1HsTemp";
_playeronehs = _p1hstemp;
RDebugUtils.currentLine=5177366;
 //BA.debugLineNum = 5177366;BA.debugLine="p1HsTemp = 0";
_p1hstemp = (int) (0);
RDebugUtils.currentLine=5177367;
 //BA.debugLineNum = 5177367;BA.debugLine="lbl_player_one_hs.Text = padString(playerOneHs,";
_lbl_player_one_hs.setText(_padstring(BA.NumberToString(_playeronehs),"0",(int) (0),(int) (3)));
 };
RDebugUtils.currentLine=5177372;
 //BA.debugLineNum = 5177372;BA.debugLine="If p2HsTemp > 0 And p2HsTemp > playerTwoHs Then";
if (_p2hstemp>0 && _p2hstemp>_playertwohs) { 
RDebugUtils.currentLine=5177373;
 //BA.debugLineNum = 5177373;BA.debugLine="playerTwoHs = p2HsTemp";
_playertwohs = _p2hstemp;
RDebugUtils.currentLine=5177374;
 //BA.debugLineNum = 5177374;BA.debugLine="p2HsTemp = 0";
_p2hstemp = (int) (0);
RDebugUtils.currentLine=5177375;
 //BA.debugLineNum = 5177375;BA.debugLine="lbl_player_two_hs.Text = padString(playerTwoHs,";
_lbl_player_two_hs.setText(_padstring(BA.NumberToString(_playertwohs),"0",(int) (0),(int) (3)));
 };
 };
RDebugUtils.currentLine=5177380;
 //BA.debugLineNum = 5177380;BA.debugLine="End Sub";
return "";
}
public static String  _calcscoreplayerone(int _points) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "calcscoreplayerone", false))
	 {return ((String) Debug.delegate(ba, "calcscoreplayerone", new Object[] {_points}));}
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub calcScorePlayerOne(points As Int)";
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="CallSubDelayed(scorebord, \"lastClick\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(ba,(Object)(_scorebord.getObject()),"lastClick");
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="If score > 9999 Or score <= -1 Then";
if (_score>9999 || _score<=-1) { 
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="processHs(\"p2\")";
_processhs("p2");
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="p1HsTemp	= p1HsTemp + points";
_p1hstemp = (int) (_p1hstemp+_points);
RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="score		= p1_100.Text&p1_10.Text&p1_1.Text";
_score = (int)(Double.parseDouble(_p1_100.getText()+_p1_10.getText()+_p1_1.getText()));
RDebugUtils.currentLine=4849674;
 //BA.debugLineNum = 4849674;BA.debugLine="score		= score+points";
_score = (int) (_score+_points);
RDebugUtils.currentLine=4849676;
 //BA.debugLineNum = 4849676;BA.debugLine="If score > 999 Or score <= -1 Then";
if (_score>999 || _score<=-1) { 
RDebugUtils.currentLine=4849677;
 //BA.debugLineNum = 4849677;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4849680;
 //BA.debugLineNum = 4849680;BA.debugLine="If lblInnings.Text = \"000\" Then";
if ((_lblinnings.getText()).equals("000")) { 
RDebugUtils.currentLine=4849681;
 //BA.debugLineNum = 4849681;BA.debugLine="lblInnings.Text	= \"001\"";
_lblinnings.setText("001");
RDebugUtils.currentLine=4849682;
 //BA.debugLineNum = 4849682;BA.debugLine="innigs			= 1";
_innigs = (int) (1);
RDebugUtils.currentLine=4849683;
 //BA.debugLineNum = 4849683;BA.debugLine="inngSet			= 1";
_inngset = (int) (1);
 };
RDebugUtils.currentLine=4849686;
 //BA.debugLineNum = 4849686;BA.debugLine="If inngSet <> 1 And score <> scorePlayerOne Then";
if (_inngset!=1 && _score!=_scoreplayerone) { 
RDebugUtils.currentLine=4849687;
 //BA.debugLineNum = 4849687;BA.debugLine="innigs = lblInnings.Text";
_innigs = (int)(Double.parseDouble(_lblinnings.getText()));
RDebugUtils.currentLine=4849688;
 //BA.debugLineNum = 4849688;BA.debugLine="innigs = innigs + 1";
_innigs = (int) (_innigs+1);
RDebugUtils.currentLine=4849689;
 //BA.debugLineNum = 4849689;BA.debugLine="lblInnings.Text = padString(innigs, \"0\", 0, 3)";
_lblinnings.setText(_padstring(BA.NumberToString(_innigs),"0",(int) (0),(int) (3)));
RDebugUtils.currentLine=4849690;
 //BA.debugLineNum = 4849690;BA.debugLine="inngSet = 1";
_inngset = (int) (1);
 };
RDebugUtils.currentLine=4849693;
 //BA.debugLineNum = 4849693;BA.debugLine="scorePlayerOne = score";
_scoreplayerone = _score;
RDebugUtils.currentLine=4849695;
 //BA.debugLineNum = 4849695;BA.debugLine="txtScore = padString(score, \"0\", 0, 4)";
_txtscore = _padstring(BA.NumberToString(_score),"0",(int) (0),(int) (4));
RDebugUtils.currentLine=4849698;
 //BA.debugLineNum = 4849698;BA.debugLine="p1_100.Text		= txtScore.SubString2(1,2)";
_p1_100.setText(_txtscore.substring((int) (1),(int) (2)));
RDebugUtils.currentLine=4849699;
 //BA.debugLineNum = 4849699;BA.debugLine="p1_10.Text		= txtScore.SubString2(2,3)";
_p1_10.setText(_txtscore.substring((int) (2),(int) (3)));
RDebugUtils.currentLine=4849700;
 //BA.debugLineNum = 4849700;BA.debugLine="p1_1.Text		= txtScore.SubString2(3,4)";
_p1_1.setText(_txtscore.substring((int) (3),(int) (4)));
RDebugUtils.currentLine=4849702;
 //BA.debugLineNum = 4849702;BA.debugLine="p1_moyenne.Text = NumberFormat2((scorePlayerOne/i";
_p1_moyenne.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=4849704;
 //BA.debugLineNum = 4849704;BA.debugLine="If playerOneToMake > 0 Then";
if (_playeronetomake>0) { 
RDebugUtils.currentLine=4849705;
 //BA.debugLineNum = 4849705;BA.debugLine="CallSub2(scorebord, \"playerOnePerc\", NumberForma";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerOnePerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_playeronetomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
RDebugUtils.currentLine=4849706;
 //BA.debugLineNum = 4849706;BA.debugLine="p1_progress = (scorePlayerOne/playerOneToMake)*1";
_p1_progress = (float) ((_scoreplayerone/(double)_playeronetomake)*100);
 };
RDebugUtils.currentLine=4849708;
 //BA.debugLineNum = 4849708;BA.debugLine="setProgress(p1_progressBar, p1_progress)";
_setprogress(_p1_progressbar,_p1_progress);
RDebugUtils.currentLine=4849709;
 //BA.debugLineNum = 4849709;BA.debugLine="checkMatchWon(\"p1\")";
_checkmatchwon("p1");
RDebugUtils.currentLine=4849711;
 //BA.debugLineNum = 4849711;BA.debugLine="End Sub";
return "";
}
public static String  _playeronemake(anywheresoftware.b4j.objects.LabelWrapper _lbl100,anywheresoftware.b4j.objects.LabelWrapper _lbl10,anywheresoftware.b4j.objects.LabelWrapper _lbl1,boolean _leftbutton,int _number) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "playeronemake", false))
	 {return ((String) Debug.delegate(ba, "playeronemake", new Object[] {_lbl100,_lbl10,_lbl1,_leftbutton,_number}));}
String _strmaker = "";
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Sub playerOneMake(lbl100 As Label, lbl10 As Label,";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Dim strMaker As String";
_strmaker = "";
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="make = $\"${lbl100.Text}${lbl10.Text}${lbl1.Text}\"";
_make = (int)(Double.parseDouble((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl100.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl10.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl1.getText()))+"")));
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="If leftButton Then";
if (_leftbutton) { 
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="make = make+number";
_make = (int) (_make+_number);
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="If make > 999 Then";
if (_make>999) { 
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="Return";
if (true) return "";
 };
 }else {
RDebugUtils.currentLine=5046282;
 //BA.debugLineNum = 5046282;BA.debugLine="make = make-number";
_make = (int) (_make-_number);
RDebugUtils.currentLine=5046283;
 //BA.debugLineNum = 5046283;BA.debugLine="If make < 0 Then";
if (_make<0) { 
RDebugUtils.currentLine=5046284;
 //BA.debugLineNum = 5046284;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=5046289;
 //BA.debugLineNum = 5046289;BA.debugLine="strMaker	= padString(make, \"0\", 0, 3)";
_strmaker = _padstring(BA.NumberToString(_make),"0",(int) (0),(int) (3));
RDebugUtils.currentLine=5046290;
 //BA.debugLineNum = 5046290;BA.debugLine="lbl100.Text = strMaker.SubString2(0,1)";
_lbl100.setText(_strmaker.substring((int) (0),(int) (1)));
RDebugUtils.currentLine=5046291;
 //BA.debugLineNum = 5046291;BA.debugLine="lbl10.Text	= strMaker.SubString2(1,2)";
_lbl10.setText(_strmaker.substring((int) (1),(int) (2)));
RDebugUtils.currentLine=5046292;
 //BA.debugLineNum = 5046292;BA.debugLine="lbl1.Text	= strMaker.SubString2(2,3)";
_lbl1.setText(_strmaker.substring((int) (2),(int) (3)));
RDebugUtils.currentLine=5046294;
 //BA.debugLineNum = 5046294;BA.debugLine="playerOneToMake = make";
_playeronetomake = _make;
RDebugUtils.currentLine=5046295;
 //BA.debugLineNum = 5046295;BA.debugLine="If playerOneToMake > 0 Then";
if (_playeronetomake>0) { 
RDebugUtils.currentLine=5046296;
 //BA.debugLineNum = 5046296;BA.debugLine="p1_progress = (scorePlayerOne/playerOneToMake)*10";
_p1_progress = (float) ((_scoreplayerone/(double)_playeronetomake)*100);
RDebugUtils.currentLine=5046297;
 //BA.debugLineNum = 5046297;BA.debugLine="CallSub2(scorebord, \"playerOnePerc\", NumberFormat";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerOnePerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_playeronetomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
 }else {
RDebugUtils.currentLine=5046299;
 //BA.debugLineNum = 5046299;BA.debugLine="p1_progress = 0";
_p1_progress = (float) (0);
RDebugUtils.currentLine=5046300;
 //BA.debugLineNum = 5046300;BA.debugLine="CallSub2(scorebord, \"playerOnePerc\", \"n.v.t.\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerOnePerc",(Object)("n.v.t."));
 };
RDebugUtils.currentLine=5046302;
 //BA.debugLineNum = 5046302;BA.debugLine="setProgress(p1_progressBar, p1_progress)";
_setprogress(_p1_progressbar,_p1_progress);
RDebugUtils.currentLine=5046303;
 //BA.debugLineNum = 5046303;BA.debugLine="End Sub";
return "";
}
public static String  _calcscoreplayertwo(int _points) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "calcscoreplayertwo", false))
	 {return ((String) Debug.delegate(ba, "calcscoreplayertwo", new Object[] {_points}));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Sub calcScorePlayertwo(points As Int)";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="CallSubDelayed(scorebord, \"lastClick\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(ba,(Object)(_scorebord.getObject()),"lastClick");
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="inngSet = 0";
_inngset = (int) (0);
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="processHs(\"p1\")";
_processhs("p1");
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="p2HsTemp = p2HsTemp + points";
_p2hstemp = (int) (_p2hstemp+_points);
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="score = p2_100.Text&p2_10.Text&p2_1.Text";
_score = (int)(Double.parseDouble(_p2_100.getText()+_p2_10.getText()+_p2_1.getText()));
RDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="score = score+points";
_score = (int) (_score+_points);
RDebugUtils.currentLine=4915209;
 //BA.debugLineNum = 4915209;BA.debugLine="If score > 999 Or score <= -1 Then";
if (_score>999 || _score<=-1) { 
RDebugUtils.currentLine=4915210;
 //BA.debugLineNum = 4915210;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4915213;
 //BA.debugLineNum = 4915213;BA.debugLine="If lblInnings.Text = \"000\" Then";
if ((_lblinnings.getText()).equals("000")) { 
RDebugUtils.currentLine=4915214;
 //BA.debugLineNum = 4915214;BA.debugLine="lblInnings.Text	= \"001\"";
_lblinnings.setText("001");
RDebugUtils.currentLine=4915215;
 //BA.debugLineNum = 4915215;BA.debugLine="innigs			= 1";
_innigs = (int) (1);
RDebugUtils.currentLine=4915216;
 //BA.debugLineNum = 4915216;BA.debugLine="inngSet			= 1";
_inngset = (int) (1);
 };
RDebugUtils.currentLine=4915219;
 //BA.debugLineNum = 4915219;BA.debugLine="playerTwoHs		= scorePlayerTwo - playerTwoHs";
_playertwohs = (int) (_scoreplayertwo-_playertwohs);
RDebugUtils.currentLine=4915220;
 //BA.debugLineNum = 4915220;BA.debugLine="scorePlayerTwo	= score";
_scoreplayertwo = _score;
RDebugUtils.currentLine=4915221;
 //BA.debugLineNum = 4915221;BA.debugLine="txtScore		= padString(score, \"0\", 0, 4)";
_txtscore = _padstring(BA.NumberToString(_score),"0",(int) (0),(int) (4));
RDebugUtils.currentLine=4915224;
 //BA.debugLineNum = 4915224;BA.debugLine="p2_100.Text		= txtScore.SubString2(1,2)";
_p2_100.setText(_txtscore.substring((int) (1),(int) (2)));
RDebugUtils.currentLine=4915225;
 //BA.debugLineNum = 4915225;BA.debugLine="p2_10.Text		= txtScore.SubString2(2,3)";
_p2_10.setText(_txtscore.substring((int) (2),(int) (3)));
RDebugUtils.currentLine=4915226;
 //BA.debugLineNum = 4915226;BA.debugLine="p2_1.Text		= txtScore.SubString2(3,4)";
_p2_1.setText(_txtscore.substring((int) (3),(int) (4)));
RDebugUtils.currentLine=4915227;
 //BA.debugLineNum = 4915227;BA.debugLine="p2_moyenne.Text = NumberFormat2((scorePlayerTwo/i";
_p2_moyenne.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=4915229;
 //BA.debugLineNum = 4915229;BA.debugLine="If playerTwoToMake > 0 Then";
if (_playertwotomake>0) { 
RDebugUtils.currentLine=4915230;
 //BA.debugLineNum = 4915230;BA.debugLine="CallSub2(scorebord, \"playerTwoPerc\", NumberForma";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerTwoPerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_playertwotomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
RDebugUtils.currentLine=4915231;
 //BA.debugLineNum = 4915231;BA.debugLine="p2_progress = (scorePlayerTwo/playerTwoToMake)*1";
_p2_progress = (float) ((_scoreplayertwo/(double)_playertwotomake)*100);
 };
RDebugUtils.currentLine=4915233;
 //BA.debugLineNum = 4915233;BA.debugLine="setProgress(p2_progressBar, p2_progress)";
_setprogress(_p2_progressbar,_p2_progress);
RDebugUtils.currentLine=4915234;
 //BA.debugLineNum = 4915234;BA.debugLine="checkMatchWon(\"p2\")";
_checkmatchwon("p2");
RDebugUtils.currentLine=4915236;
 //BA.debugLineNum = 4915236;BA.debugLine="End Sub";
return "";
}
public static String  _playertwomake(anywheresoftware.b4j.objects.LabelWrapper _lbl100,anywheresoftware.b4j.objects.LabelWrapper _lbl10,anywheresoftware.b4j.objects.LabelWrapper _lbl1,boolean _leftbutton,int _number) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "playertwomake", false))
	 {return ((String) Debug.delegate(ba, "playertwomake", new Object[] {_lbl100,_lbl10,_lbl1,_leftbutton,_number}));}
String _strmaker = "";
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Sub playerTwoMake(lbl100 As Label, lbl10 As Label,";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Dim strMaker As String";
_strmaker = "";
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="make = $\"${lbl100.Text}${lbl10.Text}${lbl1.Text}\"";
_make = (int)(Double.parseDouble((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl100.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl10.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl1.getText()))+"")));
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="If leftButton Then";
if (_leftbutton) { 
RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="make = make+number";
_make = (int) (_make+_number);
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="If make > 999 Then";
if (_make>999) { 
RDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="Return";
if (true) return "";
 };
 }else {
RDebugUtils.currentLine=5111818;
 //BA.debugLineNum = 5111818;BA.debugLine="make = make-number";
_make = (int) (_make-_number);
RDebugUtils.currentLine=5111819;
 //BA.debugLineNum = 5111819;BA.debugLine="If make < 0 Then";
if (_make<0) { 
RDebugUtils.currentLine=5111820;
 //BA.debugLineNum = 5111820;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=5111825;
 //BA.debugLineNum = 5111825;BA.debugLine="strMaker	= padString(make, \"0\", 0, 3)";
_strmaker = _padstring(BA.NumberToString(_make),"0",(int) (0),(int) (3));
RDebugUtils.currentLine=5111826;
 //BA.debugLineNum = 5111826;BA.debugLine="lbl100.Text = strMaker.SubString2(0,1)";
_lbl100.setText(_strmaker.substring((int) (0),(int) (1)));
RDebugUtils.currentLine=5111827;
 //BA.debugLineNum = 5111827;BA.debugLine="lbl10.Text	= strMaker.SubString2(1,2)";
_lbl10.setText(_strmaker.substring((int) (1),(int) (2)));
RDebugUtils.currentLine=5111828;
 //BA.debugLineNum = 5111828;BA.debugLine="lbl1.Text	= strMaker.SubString2(2,3)";
_lbl1.setText(_strmaker.substring((int) (2),(int) (3)));
RDebugUtils.currentLine=5111830;
 //BA.debugLineNum = 5111830;BA.debugLine="playerTwoToMake = make";
_playertwotomake = _make;
RDebugUtils.currentLine=5111831;
 //BA.debugLineNum = 5111831;BA.debugLine="If playerTwoToMake > 0 Then";
if (_playertwotomake>0) { 
RDebugUtils.currentLine=5111832;
 //BA.debugLineNum = 5111832;BA.debugLine="p2_progress = (scorePlayerTwo/playerTwoToMake)*1";
_p2_progress = (float) ((_scoreplayertwo/(double)_playertwotomake)*100);
RDebugUtils.currentLine=5111833;
 //BA.debugLineNum = 5111833;BA.debugLine="setProgress(p2_progressBar, p2_progress)";
_setprogress(_p2_progressbar,_p2_progress);
RDebugUtils.currentLine=5111834;
 //BA.debugLineNum = 5111834;BA.debugLine="CallSub2(scorebord, \"playerTwoPerc\", NumberForma";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerTwoPerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_playertwotomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
 }else {
RDebugUtils.currentLine=5111836;
 //BA.debugLineNum = 5111836;BA.debugLine="p2_progress = 0";
_p2_progress = (float) (0);
RDebugUtils.currentLine=5111837;
 //BA.debugLineNum = 5111837;BA.debugLine="setProgress(p2_progressBar, p2_progress)";
_setprogress(_p2_progressbar,_p2_progress);
RDebugUtils.currentLine=5111838;
 //BA.debugLineNum = 5111838;BA.debugLine="CallSub2(scorebord, \"playerTwoPerc\", \"n.v.t\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"playerTwoPerc",(Object)("n.v.t"));
 };
RDebugUtils.currentLine=5111840;
 //BA.debugLineNum = 5111840;BA.debugLine="End Sub";
return "";
}
public static String  _caromlabelcss(anywheresoftware.b4j.objects.LabelWrapper _lbl,String _style) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "caromlabelcss", false))
	 {return ((String) Debug.delegate(ba, "caromlabelcss", new Object[] {_lbl,_style}));}
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Sub caromLabelCss(lbl As Label, style As String)";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="lbl.StyleClasses.Add(style)";
_lbl.getStyleClasses().Add((Object)(_style));
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="End Sub";
return "";
}
public static String  _setcustomcursor1(String _dir,String _filename,double _hotspotx,double _hotspoty,anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _targetnode) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setcustomcursor1", false))
	 {return ((String) Debug.delegate(ba, "setcustomcursor1", new Object[] {_dir,_filename,_hotspotx,_hotspoty,_targetnode}));}
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _img = null;
anywheresoftware.b4j.object.JavaObject _cursor = null;
anywheresoftware.b4j.object.JavaObject _joscene = null;
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub SetCustomCursor1(Dir As String, Filename As St";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Dim img As Image";
_img = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="img.Initialize(Dir, Filename)";
_img.Initialize(_dir,_filename);
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="Dim cursor As JavaObject";
_cursor = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="cursor.InitializeNewInstance(\"javafx.scene.ImageC";
_cursor.InitializeNewInstance("javafx.scene.ImageCursor",new Object[]{(Object)(_img.getObject()),(Object)(_hotspotx),(Object)(_hotspoty)});
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="Dim joScene As JavaObject = TargetNode";
_joscene = new anywheresoftware.b4j.object.JavaObject();
_joscene.setObject((java.lang.Object)(_targetnode.getObject()));
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="joScene.RunMethod(\"setCursor\", Array(cursor))";
_joscene.RunMethod("setCursor",new Object[]{(Object)(_cursor.getObject())});
RDebugUtils.currentLine=5308423;
 //BA.debugLineNum = 5308423;BA.debugLine="End Sub";
return "";
}
public static String  _getversion() throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "getversion", false))
	 {return ((String) Debug.delegate(ba, "getversion", null));}
String _version = "";
String _apppath = "";
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Sub getVersion As String";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Dim version, os, appPath As String";
_version = "";
_os = "";
_apppath = "";
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="os = DetectOS";
_os = _detectos();
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="Select os";
switch (BA.switchObjectToInt(_os,"windows","linux")) {
case 0: {
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="appPath = File.DirApp&\"\\44\\\"";
_apppath = anywheresoftware.b4a.keywords.Common.File.getDirApp()+"\\44\\";
 break; }
case 1: {
RDebugUtils.currentLine=5570567;
 //BA.debugLineNum = 5570567;BA.debugLine="appPath = File.DirApp&\"/44/\"";
_apppath = anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/44/";
 break; }
}
;
RDebugUtils.currentLine=5570570;
 //BA.debugLineNum = 5570570;BA.debugLine="version = File.ReadString(appPath, \"ver.pdg\")";
_version = anywheresoftware.b4a.keywords.Common.File.ReadString(_apppath,"ver.pdg");
RDebugUtils.currentLine=5570572;
 //BA.debugLineNum = 5570572;BA.debugLine="Return $\" v ${version.Trim}\"$";
if (true) return (" v "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_version.trim()))+"");
RDebugUtils.currentLine=5570574;
 //BA.debugLineNum = 5570574;BA.debugLine="End Sub";
return "";
}
public static String  _setp1caromlables(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setp1caromlables", false))
	 {return ((String) Debug.delegate(ba, "setp1caromlables", new Object[] {_lst}));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub setP1CaromLables(lst As List)";
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="p1_100		= lst.Get(2)";
_p1_100.setObject((javafx.scene.control.Label)(_lst.Get((int) (2))));
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="p1_10		= lst.Get(1)";
_p1_10.setObject((javafx.scene.control.Label)(_lst.Get((int) (1))));
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="p1_1		= lst.Get(0)";
_p1_1.setObject((javafx.scene.control.Label)(_lst.Get((int) (0))));
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="p1_moyenne	= lst.Get(3)";
_p1_moyenne.setObject((javafx.scene.control.Label)(_lst.Get((int) (3))));
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="p1_progressBar = lst.Get(4)";
_p1_progressbar = (b4j.example.b4xprogressbar)(_lst.Get((int) (4)));
RDebugUtils.currentLine=4521991;
 //BA.debugLineNum = 4521991;BA.debugLine="End Sub";
return "";
}
public static String  _setp2caromlables(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setp2caromlables", false))
	 {return ((String) Debug.delegate(ba, "setp2caromlables", new Object[] {_lst}));}
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Public Sub setP2CaromLables(lst As List)";
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="p2_100		= lst.Get(2)";
_p2_100.setObject((javafx.scene.control.Label)(_lst.Get((int) (2))));
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="p2_10		= lst.Get(1)";
_p2_10.setObject((javafx.scene.control.Label)(_lst.Get((int) (1))));
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="p2_1		= lst.Get(0)";
_p2_1.setObject((javafx.scene.control.Label)(_lst.Get((int) (0))));
RDebugUtils.currentLine=4587525;
 //BA.debugLineNum = 4587525;BA.debugLine="p2_moyenne	= lst.Get(3)";
_p2_moyenne.setObject((javafx.scene.control.Label)(_lst.Get((int) (3))));
RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="p2_progressBar	= lst.Get(4)";
_p2_progressbar = (b4j.example.b4xprogressbar)(_lst.Get((int) (4)));
RDebugUtils.currentLine=4587527;
 //BA.debugLineNum = 4587527;BA.debugLine="End Sub";
return "";
}
public static String  _setfont(anywheresoftware.b4j.objects.LabelWrapper _lbl,int _size,boolean _digital) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setfont", false))
	 {return ((String) Debug.delegate(ba, "setfont", new Object[] {_lbl,_size,_digital}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub setFont(lbl As Label, size As Int, digi";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Dim jo As JavaObject=lbl";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="If digital Then";
if (_digital) { 
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="jo.runMethod(\"setFont\",Array(fx.LoadFont(File.Di";
_jo.RunMethod("setFont",new Object[]{(Object)(_fx.LoadFont(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"digital-7 (mono).ttf",_size).getObject())});
 }else {
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="jo.runMethod(\"setFont\",Array(fx.LoadFont(File.Di";
_jo.RunMethod("setFont",new Object[]{(Object)(_fx.LoadFont(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"Arial.ttf",_size).getObject())});
 };
RDebugUtils.currentLine=4653064;
 //BA.debugLineNum = 4653064;BA.debugLine="End Sub";
return "";
}
public static String  _setfontcolor(anywheresoftware.b4j.objects.LabelWrapper _lbl,boolean _yellow) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setfontcolor", false))
	 {return ((String) Debug.delegate(ba, "setfontcolor", new Object[] {_lbl,_yellow}));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub setFontColor(lbl As Label, yellow As Bo";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="If yellow Then";
if (_yellow) { 
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="lbl.Style = \"-fx-text-fill: #ffff00;\" '= fx.Colo";
_lbl.setStyle("-fx-text-fill: #ffff00;");
 }else {
RDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="lbl.Style = \"-fx-text-fill: #ffffff;\"";
_lbl.setStyle("-fx-text-fill: #ffffff;");
 };
RDebugUtils.currentLine=4718599;
 //BA.debugLineNum = 4718599;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="v.SetRotationAnimated(duration, degrees)";
_v.SetRotationAnimated(_duration,_degrees);
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="Sleep(duration + 20) '+20 to make sure that the n";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "func", "animacao_rotacao"),(int) (_duration+20));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="v.Rotation = 0";
_v.setRotation(0);
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _setprogress(b4j.example.b4xprogressbar _v,float _progress) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "setprogress", false))
	 {return ((String) Debug.delegate(ba, "setprogress", new Object[] {_v,_progress}));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Sub setProgress(v As B4XProgressBar, progress As F";
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="v.Progress = progress";
_v._setprogress /*float*/ (null,_progress);
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="End Sub";
return "";
}
public static String  _checkmatchwon(String _player) throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "checkmatchwon", false))
	 {return ((String) Debug.delegate(ba, "checkmatchwon", new Object[] {_player}));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub checkMatchWon(player As String)";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="If player = \"p1\" Then";
if ((_player).equals("p1")) { 
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="CallSub(scorebord, \"checkMatchWonP1\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(ba,(Object)(_scorebord.getObject()),"checkMatchWonP1");
 };
RDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="If player = \"p2\" Then";
if ((_player).equals("p2")) { 
RDebugUtils.currentLine=5242886;
 //BA.debugLineNum = 5242886;BA.debugLine="CallSub(scorebord, \"checkMatchWonP2\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(ba,(Object)(_scorebord.getObject()),"checkMatchWonP2");
 };
RDebugUtils.currentLine=5242888;
 //BA.debugLineNum = 5242888;BA.debugLine="End Sub";
return "";
}
public static String  _detectos() throws Exception{
RDebugUtils.currentModule="func";
if (Debug.shouldDelegate(ba, "detectos", false))
	 {return ((String) Debug.delegate(ba, "detectos", null));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Sub DetectOS As String";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="Dim os As String = GetSystemProperty(\"os.name\", \"";
_os = anywheresoftware.b4a.keywords.Common.GetSystemProperty("os.name","").toLowerCase();
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="If os.Contains(\"win\") Then";
if (_os.contains("win")) { 
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="Return \"windows\"";
if (true) return "windows";
 }else 
{RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="Else If os.Contains(\"mac\") Then";
if (_os.contains("mac")) { 
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="Return \"mac\"";
if (true) return "mac";
 }else {
RDebugUtils.currentLine=5636103;
 //BA.debugLineNum = 5636103;BA.debugLine="Return \"linux\"";
if (true) return "linux";
 }}
;
RDebugUtils.currentLine=5636105;
 //BA.debugLineNum = 5636105;BA.debugLine="End Sub";
return "";
}
}