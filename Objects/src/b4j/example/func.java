package b4j.example;


import anywheresoftware.b4a.BA;

public class func extends Object{
public static func mostCurrent = new func();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.func", null);
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
public static void  _animacao_rotacao(anywheresoftware.b4a.objects.B4XViewWrapper _v,int _duration,int _degrees) throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 303;BA.debugLine="v.SetRotationAnimated(duration, degrees)";
_v.SetRotationAnimated(_duration,_degrees);
 //BA.debugLineNum = 304;BA.debugLine="Sleep(duration + 20) '+20 to make sure that the n";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (_duration+20));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 305;BA.debugLine="v.Rotation = 0";
_v.setRotation(0);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _calcmoyenne(anywheresoftware.b4j.objects.LabelWrapper _mplayerone,anywheresoftware.b4j.objects.LabelWrapper _mplayertwo) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub calcMoyenne(mPlayerOne As Label, mPlayerTwo As";
 //BA.debugLineNum = 182;BA.debugLine="mPlayerOne.Text = NumberFormat2((scorePlayerOne/i";
_mplayerone.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
 //BA.debugLineNum = 183;BA.debugLine="mPlayerTwo.Text = NumberFormat2((scorePlayerTwo/i";
_mplayertwo.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public static String  _calcscoreplayerone(int _points) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub calcScorePlayerOne(points As Int)";
 //BA.debugLineNum = 96;BA.debugLine="CallSubDelayed(scorebord, \"lastClick\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(ba,(Object)(_scorebord.getObject()),"lastClick");
 //BA.debugLineNum = 97;BA.debugLine="If score > 9999 Or score <= -1 Then";
if (_score>9999 || _score<=-1) { 
 //BA.debugLineNum = 98;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 100;BA.debugLine="processHs(\"p2\")";
_processhs("p2");
 //BA.debugLineNum = 102;BA.debugLine="p1HsTemp	= p1HsTemp + points";
_p1hstemp = (int) (_p1hstemp+_points);
 //BA.debugLineNum = 103;BA.debugLine="score		= p1_100.Text&p1_10.Text&p1_1.Text";
_score = (int)(Double.parseDouble(_p1_100.getText()+_p1_10.getText()+_p1_1.getText()));
 //BA.debugLineNum = 104;BA.debugLine="score		= score+points";
_score = (int) (_score+_points);
 //BA.debugLineNum = 106;BA.debugLine="If score > 999 Or score <= -1 Then";
if (_score>999 || _score<=-1) { 
 //BA.debugLineNum = 107;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 110;BA.debugLine="If lblInnings.Text = \"000\" Then";
if ((_lblinnings.getText()).equals("000")) { 
 //BA.debugLineNum = 111;BA.debugLine="lblInnings.Text	= \"001\"";
_lblinnings.setText("001");
 //BA.debugLineNum = 112;BA.debugLine="innigs			= 1";
_innigs = (int) (1);
 //BA.debugLineNum = 113;BA.debugLine="inngSet			= 1";
_inngset = (int) (1);
 };
 //BA.debugLineNum = 116;BA.debugLine="If inngSet <> 1 And score <> scorePlayerOne Then";
if (_inngset!=1 && _score!=_scoreplayerone) { 
 //BA.debugLineNum = 117;BA.debugLine="innigs = lblInnings.Text";
_innigs = (int)(Double.parseDouble(_lblinnings.getText()));
 //BA.debugLineNum = 118;BA.debugLine="innigs = innigs + 1";
_innigs = (int) (_innigs+1);
 //BA.debugLineNum = 119;BA.debugLine="lblInnings.Text = padString(innigs, \"0\", 0, 3)";
_lblinnings.setText(_padstring(BA.NumberToString(_innigs),"0",(int) (0),(int) (3)));
 //BA.debugLineNum = 120;BA.debugLine="inngSet = 1";
_inngset = (int) (1);
 };
 //BA.debugLineNum = 123;BA.debugLine="scorePlayerOne = score";
_scoreplayerone = _score;
 //BA.debugLineNum = 125;BA.debugLine="txtScore = padString(score, \"0\", 0, 4)";
_txtscore = _padstring(BA.NumberToString(_score),"0",(int) (0),(int) (4));
 //BA.debugLineNum = 128;BA.debugLine="p1_100.Text		= txtScore.SubString2(1,2)";
_p1_100.setText(_txtscore.substring((int) (1),(int) (2)));
 //BA.debugLineNum = 129;BA.debugLine="p1_10.Text		= txtScore.SubString2(2,3)";
_p1_10.setText(_txtscore.substring((int) (2),(int) (3)));
 //BA.debugLineNum = 130;BA.debugLine="p1_1.Text		= txtScore.SubString2(3,4)";
_p1_1.setText(_txtscore.substring((int) (3),(int) (4)));
 //BA.debugLineNum = 132;BA.debugLine="p1_moyenne.Text = NumberFormat2((scorePlayerOne/i";
_p1_moyenne.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
 //BA.debugLineNum = 134;BA.debugLine="If playerOneToMake > 0 Then";
if (_playeronetomake>0) { 
 //BA.debugLineNum = 135;BA.debugLine="CallSub2(scorebord, \"playerOnePerc\", NumberForma";
anywheresoftware.b4a.keywords.Common.CallSubNew2(ba,(Object)(_scorebord.getObject()),"playerOnePerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_playeronetomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
 //BA.debugLineNum = 136;BA.debugLine="p1_progress = (scorePlayerOne/playerOneToMake)*1";
_p1_progress = (float) ((_scoreplayerone/(double)_playeronetomake)*100);
 };
 //BA.debugLineNum = 138;BA.debugLine="setProgress(p1_progressBar, p1_progress)";
_setprogress(_p1_progressbar,_p1_progress);
 //BA.debugLineNum = 139;BA.debugLine="checkMatchWon(\"p1\")";
_checkmatchwon("p1");
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public static String  _calcscoreplayertwo(int _points) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub calcScorePlayertwo(points As Int)";
 //BA.debugLineNum = 144;BA.debugLine="CallSubDelayed(scorebord, \"lastClick\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(ba,(Object)(_scorebord.getObject()),"lastClick");
 //BA.debugLineNum = 145;BA.debugLine="inngSet = 0";
_inngset = (int) (0);
 //BA.debugLineNum = 146;BA.debugLine="processHs(\"p1\")";
_processhs("p1");
 //BA.debugLineNum = 147;BA.debugLine="p2HsTemp = p2HsTemp + points";
_p2hstemp = (int) (_p2hstemp+_points);
 //BA.debugLineNum = 149;BA.debugLine="score = p2_100.Text&p2_10.Text&p2_1.Text";
_score = (int)(Double.parseDouble(_p2_100.getText()+_p2_10.getText()+_p2_1.getText()));
 //BA.debugLineNum = 150;BA.debugLine="score = score+points";
_score = (int) (_score+_points);
 //BA.debugLineNum = 152;BA.debugLine="If score > 999 Or score <= -1 Then";
if (_score>999 || _score<=-1) { 
 //BA.debugLineNum = 153;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 156;BA.debugLine="If lblInnings.Text = \"000\" Then";
if ((_lblinnings.getText()).equals("000")) { 
 //BA.debugLineNum = 157;BA.debugLine="lblInnings.Text	= \"001\"";
_lblinnings.setText("001");
 //BA.debugLineNum = 158;BA.debugLine="innigs			= 1";
_innigs = (int) (1);
 //BA.debugLineNum = 159;BA.debugLine="inngSet			= 1";
_inngset = (int) (1);
 };
 //BA.debugLineNum = 162;BA.debugLine="playerTwoHs		= scorePlayerTwo - playerTwoHs";
_playertwohs = (int) (_scoreplayertwo-_playertwohs);
 //BA.debugLineNum = 163;BA.debugLine="scorePlayerTwo	= score";
_scoreplayertwo = _score;
 //BA.debugLineNum = 164;BA.debugLine="txtScore		= padString(score, \"0\", 0, 4)";
_txtscore = _padstring(BA.NumberToString(_score),"0",(int) (0),(int) (4));
 //BA.debugLineNum = 167;BA.debugLine="p2_100.Text		= txtScore.SubString2(1,2)";
_p2_100.setText(_txtscore.substring((int) (1),(int) (2)));
 //BA.debugLineNum = 168;BA.debugLine="p2_10.Text		= txtScore.SubString2(2,3)";
_p2_10.setText(_txtscore.substring((int) (2),(int) (3)));
 //BA.debugLineNum = 169;BA.debugLine="p2_1.Text		= txtScore.SubString2(3,4)";
_p2_1.setText(_txtscore.substring((int) (3),(int) (4)));
 //BA.debugLineNum = 170;BA.debugLine="p2_moyenne.Text = NumberFormat2((scorePlayerTwo/i";
_p2_moyenne.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
 //BA.debugLineNum = 172;BA.debugLine="If playerTwoToMake > 0 Then";
if (_playertwotomake>0) { 
 //BA.debugLineNum = 173;BA.debugLine="CallSub2(scorebord, \"playerTwoPerc\", NumberForma";
anywheresoftware.b4a.keywords.Common.CallSubNew2(ba,(Object)(_scorebord.getObject()),"playerTwoPerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_playertwotomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
 //BA.debugLineNum = 174;BA.debugLine="p2_progress = (scorePlayerTwo/playerTwoToMake)*1";
_p2_progress = (float) ((_scoreplayertwo/(double)_playertwotomake)*100);
 };
 //BA.debugLineNum = 176;BA.debugLine="setProgress(p2_progressBar, p2_progress)";
_setprogress(_p2_progressbar,_p2_progress);
 //BA.debugLineNum = 177;BA.debugLine="checkMatchWon(\"p2\")";
_checkmatchwon("p2");
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public static String  _caromlabelcss(anywheresoftware.b4j.objects.LabelWrapper _lbl,String _style) throws Exception{
 //BA.debugLineNum = 325;BA.debugLine="Sub caromLabelCss(lbl As Label, style As String)";
 //BA.debugLineNum = 326;BA.debugLine="lbl.StyleClasses.Add(style)";
_lbl.getStyleClasses().Add((Object)(_style));
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return "";
}
public static String  _checkmatchwon(String _player) throws Exception{
 //BA.debugLineNum = 281;BA.debugLine="Sub checkMatchWon(player As String)";
 //BA.debugLineNum = 282;BA.debugLine="If player = \"p1\" Then";
if ((_player).equals("p1")) { 
 //BA.debugLineNum = 283;BA.debugLine="CallSub(scorebord, \"checkMatchWonP1\")";
anywheresoftware.b4a.keywords.Common.CallSubNew(ba,(Object)(_scorebord.getObject()),"checkMatchWonP1");
 };
 //BA.debugLineNum = 286;BA.debugLine="If player = \"p2\" Then";
if ((_player).equals("p2")) { 
 //BA.debugLineNum = 287;BA.debugLine="CallSub(scorebord, \"checkMatchWonP2\")";
anywheresoftware.b4a.keywords.Common.CallSubNew(ba,(Object)(_scorebord.getObject()),"checkMatchWonP2");
 };
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return "";
}
public static String  _padstring(String _padtext,String _padchr,int _padside,int _padcount) throws Exception{
String _padstr = "";
int _i = 0;
 //BA.debugLineNum = 74;BA.debugLine="Public Sub padString(padText As String ,padChr As";
 //BA.debugLineNum = 75;BA.debugLine="Dim padStr As String";
_padstr = "";
 //BA.debugLineNum = 77;BA.debugLine="If padText.Length = padCount Then";
if (_padtext.length()==_padcount) { 
 //BA.debugLineNum = 78;BA.debugLine="Return padText";
if (true) return _padtext;
 };
 //BA.debugLineNum = 81;BA.debugLine="For i = 1 To padCount-padText.Length";
{
final int step5 = 1;
final int limit5 = (int) (_padcount-_padtext.length());
_i = (int) (1) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 82;BA.debugLine="padStr = padStr&padChr";
_padstr = _padstr+_padchr;
 }
};
 //BA.debugLineNum = 85;BA.debugLine="If padSide = 0 Then";
if (_padside==0) { 
 //BA.debugLineNum = 86;BA.debugLine="Return padStr&padText";
if (true) return _padstr+_padtext;
 }else {
 //BA.debugLineNum = 88;BA.debugLine="Return padText&padStr";
if (true) return _padtext+_padstr;
 };
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public static String  _playeronemake(anywheresoftware.b4j.objects.LabelWrapper _lbl100,anywheresoftware.b4j.objects.LabelWrapper _lbl10,anywheresoftware.b4j.objects.LabelWrapper _lbl1,boolean _leftbutton,int _number) throws Exception{
String _strmaker = "";
 //BA.debugLineNum = 186;BA.debugLine="Sub playerOneMake(lbl100 As Label, lbl10 As Label,";
 //BA.debugLineNum = 187;BA.debugLine="Dim strMaker As String";
_strmaker = "";
 //BA.debugLineNum = 188;BA.debugLine="make = $\"${lbl100.Text}${lbl10.Text}${lbl1.Text}\"";
_make = (int)(Double.parseDouble((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl100.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl10.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl1.getText()))+"")));
 //BA.debugLineNum = 190;BA.debugLine="If leftButton Then";
if (_leftbutton) { 
 //BA.debugLineNum = 191;BA.debugLine="make = make+number";
_make = (int) (_make+_number);
 //BA.debugLineNum = 192;BA.debugLine="If make > 999 Then";
if (_make>999) { 
 //BA.debugLineNum = 193;BA.debugLine="Return";
if (true) return "";
 };
 }else {
 //BA.debugLineNum = 196;BA.debugLine="make = make-number";
_make = (int) (_make-_number);
 //BA.debugLineNum = 197;BA.debugLine="If make < 0 Then";
if (_make<0) { 
 //BA.debugLineNum = 198;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 203;BA.debugLine="strMaker	= padString(make, \"0\", 0, 3)";
_strmaker = _padstring(BA.NumberToString(_make),"0",(int) (0),(int) (3));
 //BA.debugLineNum = 204;BA.debugLine="lbl100.Text = strMaker.SubString2(0,1)";
_lbl100.setText(_strmaker.substring((int) (0),(int) (1)));
 //BA.debugLineNum = 205;BA.debugLine="lbl10.Text	= strMaker.SubString2(1,2)";
_lbl10.setText(_strmaker.substring((int) (1),(int) (2)));
 //BA.debugLineNum = 206;BA.debugLine="lbl1.Text	= strMaker.SubString2(2,3)";
_lbl1.setText(_strmaker.substring((int) (2),(int) (3)));
 //BA.debugLineNum = 208;BA.debugLine="playerOneToMake = make";
_playeronetomake = _make;
 //BA.debugLineNum = 209;BA.debugLine="p1_progress = (scorePlayerOne/playerOneToMake)*10";
_p1_progress = (float) ((_scoreplayerone/(double)_playeronetomake)*100);
 //BA.debugLineNum = 210;BA.debugLine="setProgress(p1_progressBar, p1_progress)";
_setprogress(_p1_progressbar,_p1_progress);
 //BA.debugLineNum = 211;BA.debugLine="CallSub2(scorebord, \"playerOnePerc\", NumberFormat";
anywheresoftware.b4a.keywords.Common.CallSubNew2(ba,(Object)(_scorebord.getObject()),"playerOnePerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_playeronetomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return "";
}
public static String  _playertwomake(anywheresoftware.b4j.objects.LabelWrapper _lbl100,anywheresoftware.b4j.objects.LabelWrapper _lbl10,anywheresoftware.b4j.objects.LabelWrapper _lbl1,boolean _leftbutton,int _number) throws Exception{
String _strmaker = "";
 //BA.debugLineNum = 214;BA.debugLine="Sub playerTwoMake(lbl100 As Label, lbl10 As Label,";
 //BA.debugLineNum = 215;BA.debugLine="Dim strMaker As String";
_strmaker = "";
 //BA.debugLineNum = 216;BA.debugLine="make = $\"${lbl100.Text}${lbl10.Text}${lbl1.Text}\"";
_make = (int)(Double.parseDouble((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl100.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl10.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl1.getText()))+"")));
 //BA.debugLineNum = 218;BA.debugLine="If leftButton Then";
if (_leftbutton) { 
 //BA.debugLineNum = 219;BA.debugLine="make = make+number";
_make = (int) (_make+_number);
 //BA.debugLineNum = 220;BA.debugLine="If make > 999 Then";
if (_make>999) { 
 //BA.debugLineNum = 221;BA.debugLine="Return";
if (true) return "";
 };
 }else {
 //BA.debugLineNum = 224;BA.debugLine="make = make-number";
_make = (int) (_make-_number);
 //BA.debugLineNum = 225;BA.debugLine="If make < 0 Then";
if (_make<0) { 
 //BA.debugLineNum = 226;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 231;BA.debugLine="strMaker	= padString(make, \"0\", 0, 3)";
_strmaker = _padstring(BA.NumberToString(_make),"0",(int) (0),(int) (3));
 //BA.debugLineNum = 232;BA.debugLine="lbl100.Text = strMaker.SubString2(0,1)";
_lbl100.setText(_strmaker.substring((int) (0),(int) (1)));
 //BA.debugLineNum = 233;BA.debugLine="lbl10.Text	= strMaker.SubString2(1,2)";
_lbl10.setText(_strmaker.substring((int) (1),(int) (2)));
 //BA.debugLineNum = 234;BA.debugLine="lbl1.Text	= strMaker.SubString2(2,3)";
_lbl1.setText(_strmaker.substring((int) (2),(int) (3)));
 //BA.debugLineNum = 236;BA.debugLine="playerTwoToMake = make";
_playertwotomake = _make;
 //BA.debugLineNum = 237;BA.debugLine="p2_progress = (scorePlayerTwo/playerTwoToMake)*10";
_p2_progress = (float) ((_scoreplayertwo/(double)_playertwotomake)*100);
 //BA.debugLineNum = 238;BA.debugLine="setProgress(p1_progressBar, p1_progress)";
_setprogress(_p1_progressbar,_p1_progress);
 //BA.debugLineNum = 239;BA.debugLine="CallSub2(scorebord, \"playerTwoPerc\", NumberFormat";
anywheresoftware.b4a.keywords.Common.CallSubNew2(ba,(Object)(_scorebord.getObject()),"playerTwoPerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_playertwotomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Private regexStr As StringBuilder";
_regexstr = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Public timeLastClick As Long = 0";
_timelastclick = (long) (0);
 //BA.debugLineNum = 8;BA.debugLine="Public hasInternetAccess As Boolean = False";
_hasinternetaccess = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 9;BA.debugLine="Public scorePlayerOne, scorePlayerTwo As Int";
_scoreplayerone = 0;
_scoreplayertwo = 0;
 //BA.debugLineNum = 10;BA.debugLine="Public innigs, inngSet, make, playerOneHs = 0, pl";
_innigs = 0;
_inngset = 0;
_make = 0;
_playeronehs = (int) (0);
_playertwohs = (int) (0);
_score = 0;
 //BA.debugLineNum = 11;BA.debugLine="Public playerOneToMake = 0, playerTwoToMake = 0,";
_playeronetomake = (int) (0);
_playertwotomake = (int) (0);
_p1hstemp = (int) (0);
_p2hstemp = (int) (0);
 //BA.debugLineNum = 12;BA.debugLine="Public lblInnings, lbl_player_one_hs, lbl_player_";
_lblinnings = new anywheresoftware.b4j.objects.LabelWrapper();
_lbl_player_one_hs = new anywheresoftware.b4j.objects.LabelWrapper();
_lbl_player_two_hs = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Public p1_1, p1_10, p1_100, p1_1000, p1_moyenne A";
_p1_1 = new anywheresoftware.b4j.objects.LabelWrapper();
_p1_10 = new anywheresoftware.b4j.objects.LabelWrapper();
_p1_100 = new anywheresoftware.b4j.objects.LabelWrapper();
_p1_1000 = new anywheresoftware.b4j.objects.LabelWrapper();
_p1_moyenne = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Public p2_1, p2_10, p2_100, p2_1000, p2_moyenne A";
_p2_1 = new anywheresoftware.b4j.objects.LabelWrapper();
_p2_10 = new anywheresoftware.b4j.objects.LabelWrapper();
_p2_100 = new anywheresoftware.b4j.objects.LabelWrapper();
_p2_1000 = new anywheresoftware.b4j.objects.LabelWrapper();
_p2_moyenne = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Public p1_progress, p2_progress As Float";
_p1_progress = 0f;
_p2_progress = 0f;
 //BA.debugLineNum = 16;BA.debugLine="Public p1_progressBar, p2_progressBar As B4XProgr";
_p1_progressbar = new b4j.example.b4xprogressbar();
_p2_progressbar = new b4j.example.b4xprogressbar();
 //BA.debugLineNum = 17;BA.debugLine="Dim txtScore As String";
_txtscore = "";
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public static String  _processhs(String _player) throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub processHs(player As String)";
 //BA.debugLineNum = 243;BA.debugLine="If player = \"p1\" Then";
if ((_player).equals("p1")) { 
 //BA.debugLineNum = 244;BA.debugLine="If p1HsTemp > 0 And p1HsTemp > playerOneHs Then";
if (_p1hstemp>0 && _p1hstemp>_playeronehs) { 
 //BA.debugLineNum = 245;BA.debugLine="playerOneHs = p1HsTemp";
_playeronehs = _p1hstemp;
 //BA.debugLineNum = 246;BA.debugLine="p1HsTemp = 0";
_p1hstemp = (int) (0);
 //BA.debugLineNum = 247;BA.debugLine="lbl_player_one_hs.Text = padString(playerOneHs,";
_lbl_player_one_hs.setText(_padstring(BA.NumberToString(_playeronehs),"0",(int) (0),(int) (3)));
 };
 };
 //BA.debugLineNum = 252;BA.debugLine="If player = \"p2\" Then";
if ((_player).equals("p2")) { 
 //BA.debugLineNum = 253;BA.debugLine="If p2HsTemp > 0 And p2HsTemp > playerTwoHs Then";
if (_p2hstemp>0 && _p2hstemp>_playertwohs) { 
 //BA.debugLineNum = 254;BA.debugLine="playerTwoHs = p2HsTemp";
_playertwohs = _p2hstemp;
 //BA.debugLineNum = 255;BA.debugLine="p2HsTemp = 0";
_p2hstemp = (int) (0);
 //BA.debugLineNum = 256;BA.debugLine="lbl_player_two_hs.Text = padString(playerTwoHs,";
_lbl_player_two_hs.setText(_padstring(BA.NumberToString(_playertwohs),"0",(int) (0),(int) (3)));
 };
 };
 //BA.debugLineNum = 261;BA.debugLine="If player = \"all\" Then";
if ((_player).equals("all")) { 
 //BA.debugLineNum = 262;BA.debugLine="If p1HsTemp > 0 And p1HsTemp > playerOneHs Then";
if (_p1hstemp>0 && _p1hstemp>_playeronehs) { 
 //BA.debugLineNum = 263;BA.debugLine="playerOneHs = p1HsTemp";
_playeronehs = _p1hstemp;
 //BA.debugLineNum = 264;BA.debugLine="p1HsTemp = 0";
_p1hstemp = (int) (0);
 //BA.debugLineNum = 265;BA.debugLine="lbl_player_one_hs.Text = padString(playerOneHs,";
_lbl_player_one_hs.setText(_padstring(BA.NumberToString(_playeronehs),"0",(int) (0),(int) (3)));
 };
 //BA.debugLineNum = 270;BA.debugLine="If p2HsTemp > 0 And p2HsTemp > playerTwoHs Then";
if (_p2hstemp>0 && _p2hstemp>_playertwohs) { 
 //BA.debugLineNum = 271;BA.debugLine="playerTwoHs = p2HsTemp";
_playertwohs = _p2hstemp;
 //BA.debugLineNum = 272;BA.debugLine="p2HsTemp = 0";
_p2hstemp = (int) (0);
 //BA.debugLineNum = 273;BA.debugLine="lbl_player_two_hs.Text = padString(playerTwoHs,";
_lbl_player_two_hs.setText(_padstring(BA.NumberToString(_playertwohs),"0",(int) (0),(int) (3)));
 };
 };
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return "";
}
public static String  _setfont(anywheresoftware.b4j.objects.LabelWrapper _lbl,int _size,boolean _digital) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 60;BA.debugLine="Public Sub setFont(lbl As Label, size As Int, digi";
 //BA.debugLineNum = 61;BA.debugLine="Dim jo As JavaObject=lbl";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 62;BA.debugLine="If digital Then";
if (_digital) { 
 //BA.debugLineNum = 63;BA.debugLine="jo.runMethod(\"setFont\",Array(fx.LoadFont(File.Di";
_jo.RunMethod("setFont",new Object[]{(Object)(_fx.LoadFont(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"digital-7 (mono).ttf",_size).getObject())});
 }else {
 //BA.debugLineNum = 65;BA.debugLine="jo.runMethod(\"setFont\",Array(fx.LoadFont(File.Di";
_jo.RunMethod("setFont",new Object[]{(Object)(_fx.LoadFont(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"Arial.ttf",_size).getObject())});
 };
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public static String  _setformcursor(anywheresoftware.b4j.objects.Form _frm,String _imagefile) throws Exception{
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _img = null;
anywheresoftware.b4j.object.JavaObject _joimagecursor = null;
anywheresoftware.b4j.object.JavaObject _jocursor = null;
 //BA.debugLineNum = 293;BA.debugLine="Sub SetFormCursor(frm As Form, imagefile As String";
 //BA.debugLineNum = 294;BA.debugLine="Dim img As Image";
_img = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
 //BA.debugLineNum = 295;BA.debugLine="img.Initialize(File.DirAssets, imagefile)";
_img.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imagefile);
 //BA.debugLineNum = 296;BA.debugLine="Dim joImageCursor As JavaObject";
_joimagecursor = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 297;BA.debugLine="joImageCursor.InitializeNewInstance(\"javafx.scene";
_joimagecursor.InitializeNewInstance("javafx.scene.ImageCursor",new Object[]{(Object)(_img.getObject())});
 //BA.debugLineNum = 298;BA.debugLine="Dim joCursor As JavaObject = frm.RootPane";
_jocursor = new anywheresoftware.b4j.object.JavaObject();
_jocursor.setObject((java.lang.Object)(_frm.getRootPane().getObject()));
 //BA.debugLineNum = 299;BA.debugLine="joCursor.RunMethod(\"setCursor\", Array(joImageCurs";
_jocursor.RunMethod("setCursor",new Object[]{(Object)(_joimagecursor.getObject())});
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return "";
}
public static String  _setnumbercss(anywheresoftware.b4j.objects.LabelWrapper _lbl) throws Exception{
 //BA.debugLineNum = 329;BA.debugLine="Sub setNumberCss(lbl As Label)";
 //BA.debugLineNum = 330;BA.debugLine="CSSUtils.SetStyleProperty(lbl, \"-fx-background-co";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_lbl.getObject())),"-fx-background-color","linear-gradient(to bottom,  #cfe7fa 0%,#6393c1 100%)");
 //BA.debugLineNum = 331;BA.debugLine="CSSUtils.SetStyleProperty(lbl, \"-fx-background-ra";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_lbl.getObject())),"-fx-background-radius","3,2,1");
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return "";
}
public static String  _setp1caromlables(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Public Sub setP1CaromLables(lst As List)";
 //BA.debugLineNum = 44;BA.debugLine="p1_100		= lst.Get(2)";
_p1_100.setObject((javafx.scene.control.Label)(_lst.Get((int) (2))));
 //BA.debugLineNum = 45;BA.debugLine="p1_10		= lst.Get(1)";
_p1_10.setObject((javafx.scene.control.Label)(_lst.Get((int) (1))));
 //BA.debugLineNum = 46;BA.debugLine="p1_1		= lst.Get(0)";
_p1_1.setObject((javafx.scene.control.Label)(_lst.Get((int) (0))));
 //BA.debugLineNum = 47;BA.debugLine="p1_moyenne	= lst.Get(3)";
_p1_moyenne.setObject((javafx.scene.control.Label)(_lst.Get((int) (3))));
 //BA.debugLineNum = 48;BA.debugLine="p1_progressBar = lst.Get(4)";
_p1_progressbar = (b4j.example.b4xprogressbar)(_lst.Get((int) (4)));
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public static String  _setp2caromlables(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Public Sub setP2CaromLables(lst As List)";
 //BA.debugLineNum = 53;BA.debugLine="p2_100		= lst.Get(2)";
_p2_100.setObject((javafx.scene.control.Label)(_lst.Get((int) (2))));
 //BA.debugLineNum = 54;BA.debugLine="p2_10		= lst.Get(1)";
_p2_10.setObject((javafx.scene.control.Label)(_lst.Get((int) (1))));
 //BA.debugLineNum = 55;BA.debugLine="p2_1		= lst.Get(0)";
_p2_1.setObject((javafx.scene.control.Label)(_lst.Get((int) (0))));
 //BA.debugLineNum = 56;BA.debugLine="p2_moyenne	= lst.Get(3)";
_p2_moyenne.setObject((javafx.scene.control.Label)(_lst.Get((int) (3))));
 //BA.debugLineNum = 57;BA.debugLine="p2_progressBar	= lst.Get(4)";
_p2_progressbar = (b4j.example.b4xprogressbar)(_lst.Get((int) (4)));
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public static String  _setprogress(b4j.example.b4xprogressbar _v,float _progress) throws Exception{
 //BA.debugLineNum = 318;BA.debugLine="Sub setProgress(v As B4XProgressBar, progress As F";
 //BA.debugLineNum = 320;BA.debugLine="v.Progress = progress";
_v._setprogress /*float*/ (_progress);
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return "";
}
public static String  _testnumber(String _oldstringtotest,String _newstringtotest) throws Exception{
String _stringtotest = "";
 //BA.debugLineNum = 21;BA.debugLine="Public Sub testNumber(oldStringToTest As String, n";
 //BA.debugLineNum = 22;BA.debugLine="Dim stringToTest As String";
_stringtotest = "";
 //BA.debugLineNum = 24;BA.debugLine="If newStringToTest.Length = 1 Then";
if (_newstringtotest.length()==1) { 
 //BA.debugLineNum = 25;BA.debugLine="stringToTest = newStringToTest";
_stringtotest = _newstringtotest;
 }else {
 //BA.debugLineNum = 27;BA.debugLine="stringToTest = 	newStringToTest.Replace(oldStrin";
_stringtotest = _newstringtotest.replace(_oldstringtotest,"");
 };
 //BA.debugLineNum = 30;BA.debugLine="regexStr.Initialize";
_regexstr.Initialize();
 //BA.debugLineNum = 31;BA.debugLine="regexStr.Append(\"[0-9]*\\.[0-9]*|[0-9]*\")";
_regexstr.Append("[0-9]*\\.[0-9]*|[0-9]*");
 //BA.debugLineNum = 33;BA.debugLine="If Regex.IsMatch(regexStr.ToString,stringToTest)";
if (anywheresoftware.b4a.keywords.Common.Regex.IsMatch(_regexstr.ToString(),_stringtotest)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 34;BA.debugLine="Return newStringToTest";
if (true) return _newstringtotest;
 }else {
 //BA.debugLineNum = 36;BA.debugLine="Return oldStringToTest";
if (true) return _oldstringtotest;
 };
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
}
