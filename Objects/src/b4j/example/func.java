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
public static b4j.example.funcinet _funcinet = null;
public static b4j.example.getnode _getnode = null;
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
 //BA.debugLineNum = 421;BA.debugLine="v.SetRotationAnimated(duration, degrees)";
_v.SetRotationAnimated(_duration,_degrees);
 //BA.debugLineNum = 422;BA.debugLine="Sleep(duration + 20) '+20 to make sure that the n";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (_duration+20));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 423;BA.debugLine="v.Rotation = 0";
_v.setRotation(0);
 //BA.debugLineNum = 424;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _calcmoyenne(anywheresoftware.b4j.objects.LabelWrapper _mplayerone,anywheresoftware.b4j.objects.LabelWrapper _mplayertwo) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub calcMoyenne(mPlayerOne As Label, mPlayerTwo As";
 //BA.debugLineNum = 249;BA.debugLine="mPlayerOne.Text = NumberFormat2((scorePlayerOne/i";
_mplayerone.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
 //BA.debugLineNum = 250;BA.debugLine="mPlayerTwo.Text = NumberFormat2((scorePlayerTwo/i";
_mplayertwo.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return "";
}
public static String  _calcscoreplayerone(int _points,boolean _leftmouse) throws Exception{
int _p1score = 0;
 //BA.debugLineNum = 122;BA.debugLine="Sub calcScorePlayerOne(points As Int, leftMouse As";
 //BA.debugLineNum = 123;BA.debugLine="If leftMouse = False Then";
if (_leftmouse==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 124;BA.debugLine="points = -Abs(points)";
_points = (int) (-anywheresoftware.b4a.keywords.Common.Abs(_points));
 };
 //BA.debugLineNum = 127;BA.debugLine="Dim P1Score As Int";
_p1score = 0;
 //BA.debugLineNum = 128;BA.debugLine="CallSubDelayed(scorebord, \"lastClick\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(ba,(Object)(_scorebord.getObject()),"lastClick");
 //BA.debugLineNum = 132;BA.debugLine="P1Score		= p1_100.Text&p1_10.Text&p1_1.Text";
_p1score = (int)(Double.parseDouble(_p1_100.getText()+_p1_10.getText()+_p1_1.getText()));
 //BA.debugLineNum = 133;BA.debugLine="P1Score		= P1Score+points";
_p1score = (int) (_p1score+_points);
 //BA.debugLineNum = 135;BA.debugLine="If P1Score < 0 Then";
if (_p1score<0) { 
 //BA.debugLineNum = 137;BA.debugLine="P1Score = p1_100.Text&p1_10.Text&p1_1.Text";
_p1score = (int)(Double.parseDouble(_p1_100.getText()+_p1_10.getText()+_p1_1.getText()));
 };
 //BA.debugLineNum = 140;BA.debugLine="If P1Score > 9999 Then 'Or P1Score <= -1 Then";
if (_p1score>9999) { 
 //BA.debugLineNum = 141;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 144;BA.debugLine="If P1Score < 0 Then";
if (_p1score<0) { 
 //BA.debugLineNum = 145;BA.debugLine="playerOneHs = 0";
_playeronehs = (int) (0);
 //BA.debugLineNum = 146;BA.debugLine="p1HsTemp = 0";
_p1hstemp = (int) (0);
 //BA.debugLineNum = 148;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 152;BA.debugLine="p1HsTemp	= p1HsTemp + points";
_p1hstemp = (int) (_p1hstemp+_points);
 //BA.debugLineNum = 160;BA.debugLine="If lblInnings.Text = \"000\" Then";
if ((_lblinnings.getText()).equals("000")) { 
 //BA.debugLineNum = 161;BA.debugLine="lblInnings.Text	= \"001\"";
_lblinnings.setText("001");
 //BA.debugLineNum = 162;BA.debugLine="innigs			= 1";
_innigs = (int) (1);
 //BA.debugLineNum = 163;BA.debugLine="inngSet			= 1";
_inngset = (int) (1);
 };
 //BA.debugLineNum = 173;BA.debugLine="scorePlayerOne = P1Score";
_scoreplayerone = _p1score;
 //BA.debugLineNum = 174;BA.debugLine="txtScore = padString(P1Score, \"0\", 0, 4)";
_txtscore = _padstring(BA.NumberToString(_p1score),"0",(int) (0),(int) (4));
 //BA.debugLineNum = 177;BA.debugLine="p1_100.Text		= txtScore.SubString2(1,2)";
_p1_100.setText(_txtscore.substring((int) (1),(int) (2)));
 //BA.debugLineNum = 178;BA.debugLine="p1_10.Text		= txtScore.SubString2(2,3)";
_p1_10.setText(_txtscore.substring((int) (2),(int) (3)));
 //BA.debugLineNum = 179;BA.debugLine="p1_1.Text		= txtScore.SubString2(3,4)";
_p1_1.setText(_txtscore.substring((int) (3),(int) (4)));
 //BA.debugLineNum = 181;BA.debugLine="p1_moyenne.Text = NumberFormat2((scorePlayerOne/i";
_p1_moyenne.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
 //BA.debugLineNum = 183;BA.debugLine="If playerOneToMake > 0 Then";
if (_playeronetomake>0) { 
 //BA.debugLineNum = 184;BA.debugLine="CallSub2(scorebord, \"playerOnePerc\", NumberForma";
anywheresoftware.b4a.keywords.Common.CallSubNew2(ba,(Object)(_scorebord.getObject()),"playerOnePerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_playeronetomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
 //BA.debugLineNum = 185;BA.debugLine="p1_progress = (scorePlayerOne/playerOneToMake)*1";
_p1_progress = (float) ((_scoreplayerone/(double)_playeronetomake)*100);
 };
 //BA.debugLineNum = 187;BA.debugLine="setProgress(p1_progressBar, p1_progress)";
_setprogress(_p1_progressbar,_p1_progress);
 //BA.debugLineNum = 188;BA.debugLine="checkMatchWon(\"p1\")";
_checkmatchwon("p1");
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return "";
}
public static String  _calcscoreplayertwo(int _points,boolean _leftmouse) throws Exception{
int _p2score = 0;
 //BA.debugLineNum = 192;BA.debugLine="Sub calcScorePlayertwo(points As Int, leftMouse As";
 //BA.debugLineNum = 193;BA.debugLine="If leftMouse = False Then";
if (_leftmouse==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 194;BA.debugLine="points = -Abs(points)";
_points = (int) (-anywheresoftware.b4a.keywords.Common.Abs(_points));
 };
 //BA.debugLineNum = 197;BA.debugLine="Dim p2Score As Int";
_p2score = 0;
 //BA.debugLineNum = 199;BA.debugLine="CallSubDelayed(scorebord, \"lastClick\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(ba,(Object)(_scorebord.getObject()),"lastClick");
 //BA.debugLineNum = 202;BA.debugLine="inngSet = 0";
_inngset = (int) (0);
 //BA.debugLineNum = 205;BA.debugLine="p2HsTemp = p2HsTemp + points";
_p2hstemp = (int) (_p2hstemp+_points);
 //BA.debugLineNum = 209;BA.debugLine="p2Score = p2_100.Text&p2_10.Text&p2_1.Text";
_p2score = (int)(Double.parseDouble(_p2_100.getText()+_p2_10.getText()+_p2_1.getText()));
 //BA.debugLineNum = 210;BA.debugLine="p2Score = p2Score+points";
_p2score = (int) (_p2score+_points);
 //BA.debugLineNum = 212;BA.debugLine="If p2Score > 999 Then ' Or score <= -0 Then";
if (_p2score>999) { 
 //BA.debugLineNum = 213;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 216;BA.debugLine="If p2Score < 0 Then";
if (_p2score<0) { 
 //BA.debugLineNum = 217;BA.debugLine="playerTwoHs = 0";
_playertwohs = (int) (0);
 //BA.debugLineNum = 218;BA.debugLine="p2HsTemp = 0";
_p2hstemp = (int) (0);
 //BA.debugLineNum = 220;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 223;BA.debugLine="If lblInnings.Text = \"000\" Then";
if ((_lblinnings.getText()).equals("000")) { 
 //BA.debugLineNum = 224;BA.debugLine="lblInnings.Text	= \"001\"";
_lblinnings.setText("001");
 //BA.debugLineNum = 225;BA.debugLine="innigs			= 1";
_innigs = (int) (1);
 //BA.debugLineNum = 226;BA.debugLine="inngSet			= 1";
_inngset = (int) (1);
 };
 //BA.debugLineNum = 230;BA.debugLine="scorePlayerTwo	= p2Score";
_scoreplayertwo = _p2score;
 //BA.debugLineNum = 231;BA.debugLine="txtScore		= padString(p2Score, \"0\", 0, 4)";
_txtscore = _padstring(BA.NumberToString(_p2score),"0",(int) (0),(int) (4));
 //BA.debugLineNum = 233;BA.debugLine="p2_100.Text		= txtScore.SubString2(1,2)";
_p2_100.setText(_txtscore.substring((int) (1),(int) (2)));
 //BA.debugLineNum = 234;BA.debugLine="p2_10.Text		= txtScore.SubString2(2,3)";
_p2_10.setText(_txtscore.substring((int) (2),(int) (3)));
 //BA.debugLineNum = 235;BA.debugLine="p2_1.Text		= txtScore.SubString2(3,4)";
_p2_1.setText(_txtscore.substring((int) (3),(int) (4)));
 //BA.debugLineNum = 236;BA.debugLine="p2_moyenne.Text = NumberFormat2((scorePlayerTwo/i";
_p2_moyenne.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_innigs),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
 //BA.debugLineNum = 238;BA.debugLine="If playerTwoToMake > 0 Then";
if (_playertwotomake>0) { 
 //BA.debugLineNum = 239;BA.debugLine="CallSub2(scorebord, \"playerTwoPerc\", NumberForma";
anywheresoftware.b4a.keywords.Common.CallSubNew2(ba,(Object)(_scorebord.getObject()),"playerTwoPerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_playertwotomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
 //BA.debugLineNum = 240;BA.debugLine="p2_progress = (scorePlayerTwo/playerTwoToMake)*1";
_p2_progress = (float) ((_scoreplayertwo/(double)_playertwotomake)*100);
 };
 //BA.debugLineNum = 242;BA.debugLine="setProgress(p2_progressBar, p2_progress)";
_setprogress(_p2_progressbar,_p2_progress);
 //BA.debugLineNum = 244;BA.debugLine="checkMatchWon(\"p2\")";
_checkmatchwon("p2");
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return "";
}
public static String  _caromlabelcss(anywheresoftware.b4j.objects.LabelWrapper _lbl,String _style) throws Exception{
 //BA.debugLineNum = 443;BA.debugLine="Sub caromLabelCss(lbl As Label, style As String)";
 //BA.debugLineNum = 444;BA.debugLine="lbl.StyleClasses.Add(style)";
_lbl.getStyleClasses().Add((Object)(_style));
 //BA.debugLineNum = 445;BA.debugLine="End Sub";
return "";
}
public static String  _checkmatchwon(String _player) throws Exception{
 //BA.debugLineNum = 386;BA.debugLine="Sub checkMatchWon(player As String)";
 //BA.debugLineNum = 387;BA.debugLine="If player = \"p1\" Then";
if ((_player).equals("p1")) { 
 //BA.debugLineNum = 388;BA.debugLine="CallSub(scorebord, \"checkMatchWonP1\")";
anywheresoftware.b4a.keywords.Common.CallSubNew(ba,(Object)(_scorebord.getObject()),"checkMatchWonP1");
 };
 //BA.debugLineNum = 391;BA.debugLine="If player = \"p2\" Then";
if ((_player).equals("p2")) { 
 //BA.debugLineNum = 392;BA.debugLine="CallSub(scorebord, \"checkMatchWonP2\")";
anywheresoftware.b4a.keywords.Common.CallSubNew(ba,(Object)(_scorebord.getObject()),"checkMatchWonP2");
 };
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return "";
}
public static String  _detectos() throws Exception{
 //BA.debugLineNum = 468;BA.debugLine="Sub DetectOS As String";
 //BA.debugLineNum = 469;BA.debugLine="Dim os As String = GetSystemProperty(\"os.name\", \"";
_os = anywheresoftware.b4a.keywords.Common.GetSystemProperty("os.name","").toLowerCase();
 //BA.debugLineNum = 470;BA.debugLine="If os.Contains(\"win\") Then";
if (_os.contains("win")) { 
 //BA.debugLineNum = 471;BA.debugLine="Return \"windows\"";
if (true) return "windows";
 }else if(_os.contains("mac")) { 
 //BA.debugLineNum = 473;BA.debugLine="Return \"mac\"";
if (true) return "mac";
 }else {
 //BA.debugLineNum = 475;BA.debugLine="Return \"linux\"";
if (true) return "linux";
 };
 //BA.debugLineNum = 477;BA.debugLine="End Sub";
return "";
}
public static String  _getipnumber() throws Exception{
anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper _server = null;
anywheresoftware.b4a.objects.collections.List _components = null;
String _ip = "";
String _ipstr = "";
int _i = 0;
 //BA.debugLineNum = 479;BA.debugLine="Sub getIpNumber As String";
 //BA.debugLineNum = 480;BA.debugLine="Dim Server As ServerSocket";
_server = new anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper();
 //BA.debugLineNum = 481;BA.debugLine="Dim components As List";
_components = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 482;BA.debugLine="Dim Ip, ipStr As String";
_ip = "";
_ipstr = "";
 //BA.debugLineNum = 484;BA.debugLine="ipStr = \"\"";
_ipstr = "";
 //BA.debugLineNum = 485;BA.debugLine="Server.Initialize(50000, Me)";
_server.Initialize(ba,(int) (50000),BA.ObjectToString(func.getObject()));
 //BA.debugLineNum = 486;BA.debugLine="Ip = Server.GetMyIP";
_ip = _server.GetMyIP();
 //BA.debugLineNum = 487;BA.debugLine="components.Initialize";
_components.Initialize();
 //BA.debugLineNum = 489;BA.debugLine="For i = 0 To Ip.Length - 1";
{
final int step8 = 1;
final int limit8 = (int) (_ip.length()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 490;BA.debugLine="If Ip.SubString2(i,i+1) = \".\" Then";
if ((_ip.substring(_i,(int) (_i+1))).equals(".")) { 
 //BA.debugLineNum = 491;BA.debugLine="ipStr = ipStr &	\",\"";
_ipstr = _ipstr+",";
 }else {
 //BA.debugLineNum = 493;BA.debugLine="ipStr = ipStr &	Ip.SubString2(i,i+1)";
_ipstr = _ipstr+_ip.substring(_i,(int) (_i+1));
 };
 }
};
 //BA.debugLineNum = 496;BA.debugLine="components = Regex.Split(\",\", ipStr)";
_components = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split(",",_ipstr));
 //BA.debugLineNum = 498;BA.debugLine="Return components.Get(3)";
if (true) return BA.ObjectToString(_components.Get((int) (3)));
 //BA.debugLineNum = 499;BA.debugLine="End Sub";
return "";
}
public static String  _getversion() throws Exception{
String _version = "";
String _apppath = "";
 //BA.debugLineNum = 452;BA.debugLine="Sub getVersion As String";
 //BA.debugLineNum = 453;BA.debugLine="Dim version, os, appPath As String";
_version = "";
_os = "";
_apppath = "";
 //BA.debugLineNum = 454;BA.debugLine="os = DetectOS";
_os = _detectos();
 //BA.debugLineNum = 455;BA.debugLine="Select os";
switch (BA.switchObjectToInt(_os,"windows","linux")) {
case 0: {
 //BA.debugLineNum = 457;BA.debugLine="appPath = File.DirApp&\"\\44\\\"";
_apppath = anywheresoftware.b4a.keywords.Common.File.getDirApp()+"\\44\\";
 break; }
case 1: {
 //BA.debugLineNum = 459;BA.debugLine="appPath = File.DirApp&\"/44/\"";
_apppath = anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/44/";
 break; }
}
;
 //BA.debugLineNum = 462;BA.debugLine="version = File.ReadString(appPath, \"ver.pdg\")";
_version = anywheresoftware.b4a.keywords.Common.File.ReadString(_apppath,"ver.pdg");
 //BA.debugLineNum = 464;BA.debugLine="Return $\" v ${version.Trim}\"$";
if (true) return (" v "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_version.trim()))+"");
 //BA.debugLineNum = 466;BA.debugLine="End Sub";
return "";
}
public static String  _padstring(String _padtext,String _padchr,int _padside,int _padcount) throws Exception{
String _padstr = "";
int _i = 0;
 //BA.debugLineNum = 102;BA.debugLine="Public Sub padString(padText As String ,padChr As";
 //BA.debugLineNum = 103;BA.debugLine="Dim padStr As String";
_padstr = "";
 //BA.debugLineNum = 105;BA.debugLine="If padText.Length = padCount Then";
if (_padtext.length()==_padcount) { 
 //BA.debugLineNum = 106;BA.debugLine="Return padText";
if (true) return _padtext;
 };
 //BA.debugLineNum = 109;BA.debugLine="For i = 1 To padCount-padText.Length";
{
final int step5 = 1;
final int limit5 = (int) (_padcount-_padtext.length());
_i = (int) (1) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 110;BA.debugLine="padStr = padStr&padChr";
_padstr = _padstr+_padchr;
 }
};
 //BA.debugLineNum = 113;BA.debugLine="If padSide = 0 Then";
if (_padside==0) { 
 //BA.debugLineNum = 114;BA.debugLine="Return padStr&padText";
if (true) return _padstr+_padtext;
 }else {
 //BA.debugLineNum = 116;BA.debugLine="Return padText&padStr";
if (true) return _padtext+_padstr;
 };
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public static String  _playeronemake(anywheresoftware.b4j.objects.LabelWrapper _lbl100,anywheresoftware.b4j.objects.LabelWrapper _lbl10,anywheresoftware.b4j.objects.LabelWrapper _lbl1,boolean _leftbutton,int _number) throws Exception{
String _strmaker = "";
 //BA.debugLineNum = 253;BA.debugLine="Sub playerOneMake(lbl100 As Label, lbl10 As Label,";
 //BA.debugLineNum = 254;BA.debugLine="Dim strMaker As String";
_strmaker = "";
 //BA.debugLineNum = 255;BA.debugLine="make = $\"${lbl100.Text}${lbl10.Text}${lbl1.Text}\"";
_make = (int)(Double.parseDouble((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl100.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl10.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl1.getText()))+"")));
 //BA.debugLineNum = 257;BA.debugLine="If leftButton Then";
if (_leftbutton) { 
 //BA.debugLineNum = 258;BA.debugLine="make = make+number";
_make = (int) (_make+_number);
 //BA.debugLineNum = 259;BA.debugLine="If make > 999 Then";
if (_make>999) { 
 //BA.debugLineNum = 260;BA.debugLine="Return";
if (true) return "";
 };
 }else {
 //BA.debugLineNum = 263;BA.debugLine="make = make-number";
_make = (int) (_make-_number);
 //BA.debugLineNum = 264;BA.debugLine="If make < 0 Then";
if (_make<0) { 
 //BA.debugLineNum = 265;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 270;BA.debugLine="strMaker	= padString(make, \"0\", 0, 3)";
_strmaker = _padstring(BA.NumberToString(_make),"0",(int) (0),(int) (3));
 //BA.debugLineNum = 271;BA.debugLine="lbl100.Text = strMaker.SubString2(0,1)";
_lbl100.setText(_strmaker.substring((int) (0),(int) (1)));
 //BA.debugLineNum = 272;BA.debugLine="lbl10.Text	= strMaker.SubString2(1,2)";
_lbl10.setText(_strmaker.substring((int) (1),(int) (2)));
 //BA.debugLineNum = 273;BA.debugLine="lbl1.Text	= strMaker.SubString2(2,3)";
_lbl1.setText(_strmaker.substring((int) (2),(int) (3)));
 //BA.debugLineNum = 275;BA.debugLine="playerOneToMake = make";
_playeronetomake = _make;
 //BA.debugLineNum = 276;BA.debugLine="If playerOneToMake > 0 Then";
if (_playeronetomake>0) { 
 //BA.debugLineNum = 277;BA.debugLine="p1_progress = (scorePlayerOne/playerOneToMake)*10";
_p1_progress = (float) ((_scoreplayerone/(double)_playeronetomake)*100);
 //BA.debugLineNum = 278;BA.debugLine="CallSub2(scorebord, \"playerOnePerc\", NumberFormat";
anywheresoftware.b4a.keywords.Common.CallSubNew2(ba,(Object)(_scorebord.getObject()),"playerOnePerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayerone/(double)_playeronetomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
 }else {
 //BA.debugLineNum = 280;BA.debugLine="p1_progress = 0";
_p1_progress = (float) (0);
 //BA.debugLineNum = 281;BA.debugLine="CallSub2(scorebord, \"playerOnePerc\", \"n.v.t.\")";
anywheresoftware.b4a.keywords.Common.CallSubNew2(ba,(Object)(_scorebord.getObject()),"playerOnePerc",(Object)("n.v.t."));
 };
 //BA.debugLineNum = 283;BA.debugLine="setProgress(p1_progressBar, p1_progress)";
_setprogress(_p1_progressbar,_p1_progress);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return "";
}
public static String  _playertwomake(anywheresoftware.b4j.objects.LabelWrapper _lbl100,anywheresoftware.b4j.objects.LabelWrapper _lbl10,anywheresoftware.b4j.objects.LabelWrapper _lbl1,boolean _leftbutton,int _number) throws Exception{
String _strmaker = "";
 //BA.debugLineNum = 286;BA.debugLine="Sub playerTwoMake(lbl100 As Label, lbl10 As Label,";
 //BA.debugLineNum = 287;BA.debugLine="Dim strMaker As String";
_strmaker = "";
 //BA.debugLineNum = 288;BA.debugLine="make = $\"${lbl100.Text}${lbl10.Text}${lbl1.Text}\"";
_make = (int)(Double.parseDouble((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl100.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl10.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl1.getText()))+"")));
 //BA.debugLineNum = 290;BA.debugLine="If leftButton Then";
if (_leftbutton) { 
 //BA.debugLineNum = 291;BA.debugLine="make = make+number";
_make = (int) (_make+_number);
 //BA.debugLineNum = 292;BA.debugLine="If make > 999 Then";
if (_make>999) { 
 //BA.debugLineNum = 293;BA.debugLine="Return";
if (true) return "";
 };
 }else {
 //BA.debugLineNum = 296;BA.debugLine="make = make-number";
_make = (int) (_make-_number);
 //BA.debugLineNum = 297;BA.debugLine="If make < 0 Then";
if (_make<0) { 
 //BA.debugLineNum = 298;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 303;BA.debugLine="strMaker	= padString(make, \"0\", 0, 3)";
_strmaker = _padstring(BA.NumberToString(_make),"0",(int) (0),(int) (3));
 //BA.debugLineNum = 304;BA.debugLine="lbl100.Text = strMaker.SubString2(0,1)";
_lbl100.setText(_strmaker.substring((int) (0),(int) (1)));
 //BA.debugLineNum = 305;BA.debugLine="lbl10.Text	= strMaker.SubString2(1,2)";
_lbl10.setText(_strmaker.substring((int) (1),(int) (2)));
 //BA.debugLineNum = 306;BA.debugLine="lbl1.Text	= strMaker.SubString2(2,3)";
_lbl1.setText(_strmaker.substring((int) (2),(int) (3)));
 //BA.debugLineNum = 308;BA.debugLine="playerTwoToMake = make";
_playertwotomake = _make;
 //BA.debugLineNum = 309;BA.debugLine="If playerTwoToMake > 0 Then";
if (_playertwotomake>0) { 
 //BA.debugLineNum = 310;BA.debugLine="p2_progress = (scorePlayerTwo/playerTwoToMake)*1";
_p2_progress = (float) ((_scoreplayertwo/(double)_playertwotomake)*100);
 //BA.debugLineNum = 311;BA.debugLine="setProgress(p2_progressBar, p2_progress)";
_setprogress(_p2_progressbar,_p2_progress);
 //BA.debugLineNum = 312;BA.debugLine="CallSub2(scorebord, \"playerTwoPerc\", NumberForma";
anywheresoftware.b4a.keywords.Common.CallSubNew2(ba,(Object)(_scorebord.getObject()),"playerTwoPerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_scoreplayertwo/(double)_playertwotomake)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
 }else {
 //BA.debugLineNum = 314;BA.debugLine="p2_progress = 0";
_p2_progress = (float) (0);
 //BA.debugLineNum = 315;BA.debugLine="setProgress(p2_progressBar, p2_progress)";
_setprogress(_p2_progressbar,_p2_progress);
 //BA.debugLineNum = 316;BA.debugLine="CallSub2(scorebord, \"playerTwoPerc\", \"n.v.t\")";
anywheresoftware.b4a.keywords.Common.CallSubNew2(ba,(Object)(_scorebord.getObject()),"playerTwoPerc",(Object)("n.v.t"));
 };
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 7;BA.debugLine="Public setNieuwePartij As Boolean = True";
_setnieuwepartij = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 8;BA.debugLine="Public hasInternetAccess As Boolean = False";
_hasinternetaccess = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 9;BA.debugLine="Public newGameInitialized As Boolean = False";
_newgameinitialized = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 10;BA.debugLine="Public scorePlayerOne, scorePlayerTwo As Int";
_scoreplayerone = 0;
_scoreplayertwo = 0;
 //BA.debugLineNum = 11;BA.debugLine="Public innigs, inngSet, make, playerOneHs = 0, pl";
_innigs = 0;
_inngset = 0;
_make = 0;
_playeronehs = (int) (0);
_playertwohs = (int) (0);
_score = 0;
 //BA.debugLineNum = 12;BA.debugLine="Public playerOneToMake = 0, playerTwoToMake = 0,";
_playeronetomake = (int) (0);
_playertwotomake = (int) (0);
_p1hstemp = (int) (0);
_p2hstemp = (int) (0);
 //BA.debugLineNum = 13;BA.debugLine="Public lblInnings, lbl_player_one_hs, lbl_player_";
_lblinnings = new anywheresoftware.b4j.objects.LabelWrapper();
_lbl_player_one_hs = new anywheresoftware.b4j.objects.LabelWrapper();
_lbl_player_two_hs = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Public p1_1, p1_10, p1_100,  p1_moyenne As Label";
_p1_1 = new anywheresoftware.b4j.objects.LabelWrapper();
_p1_10 = new anywheresoftware.b4j.objects.LabelWrapper();
_p1_100 = new anywheresoftware.b4j.objects.LabelWrapper();
_p1_moyenne = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Public p2_1, p2_10, p2_100, p2_moyenne As Label";
_p2_1 = new anywheresoftware.b4j.objects.LabelWrapper();
_p2_10 = new anywheresoftware.b4j.objects.LabelWrapper();
_p2_100 = new anywheresoftware.b4j.objects.LabelWrapper();
_p2_moyenne = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Public p1_progress, p2_progress As Float";
_p1_progress = 0f;
_p2_progress = 0f;
 //BA.debugLineNum = 17;BA.debugLine="Public p1_progressBar, p2_progressBar As B4XProgr";
_p1_progressbar = new b4j.example.b4xprogressbar();
_p2_progressbar = new b4j.example.b4xprogressbar();
 //BA.debugLineNum = 18;BA.debugLine="Public os As String";
_os = "";
 //BA.debugLineNum = 19;BA.debugLine="Dim txtScore As String";
_txtscore = "";
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public static String  _processhs(String _player) throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Sub processHs(player As String)";
 //BA.debugLineNum = 321;BA.debugLine="If player = \"p1\" Then";
if ((_player).equals("p1")) { 
 //BA.debugLineNum = 322;BA.debugLine="If p1HsTemp > 0 And p1HsTemp > playerOneHs Then";
if (_p1hstemp>0 && _p1hstemp>_playeronehs) { 
 //BA.debugLineNum = 323;BA.debugLine="playerOneHs = p1HsTemp";
_playeronehs = _p1hstemp;
 //BA.debugLineNum = 324;BA.debugLine="p1HsTemp = 0";
_p1hstemp = (int) (0);
 //BA.debugLineNum = 325;BA.debugLine="lbl_player_one_hs.Text = padString(playerOneHs,";
_lbl_player_one_hs.setText(_padstring(BA.NumberToString(_playeronehs),"0",(int) (0),(int) (3)));
 };
 };
 //BA.debugLineNum = 330;BA.debugLine="If player = \"p2\" Then";
if ((_player).equals("p2")) { 
 //BA.debugLineNum = 331;BA.debugLine="If p2HsTemp > 0 And p2HsTemp > playerTwoHs Then";
if (_p2hstemp>0 && _p2hstemp>_playertwohs) { 
 //BA.debugLineNum = 332;BA.debugLine="playerTwoHs = p2HsTemp";
_playertwohs = _p2hstemp;
 //BA.debugLineNum = 333;BA.debugLine="p2HsTemp = 0";
_p2hstemp = (int) (0);
 //BA.debugLineNum = 334;BA.debugLine="lbl_player_two_hs.Text = padString(playerTwoHs,";
_lbl_player_two_hs.setText(_padstring(BA.NumberToString(_playertwohs),"0",(int) (0),(int) (3)));
 }else {
 //BA.debugLineNum = 337;BA.debugLine="lbl_player_two_hs.Text = padString(0, \"0\", 0, 3";
_lbl_player_two_hs.setText(_padstring(BA.NumberToString(0),"0",(int) (0),(int) (3)));
 };
 };
 //BA.debugLineNum = 341;BA.debugLine="If player = \"all\" Then";
if ((_player).equals("all")) { 
 //BA.debugLineNum = 348;BA.debugLine="If p1HsTemp > playerOneHs Then";
if (_p1hstemp>_playeronehs) { 
 //BA.debugLineNum = 349;BA.debugLine="playerOneHs = p1HsTemp";
_playeronehs = _p1hstemp;
 //BA.debugLineNum = 350;BA.debugLine="p1HsTemp = 0";
_p1hstemp = (int) (0);
 //BA.debugLineNum = 351;BA.debugLine="lbl_player_one_hs.Text = padString(playerOneHs,";
_lbl_player_one_hs.setText(_padstring(BA.NumberToString(_playeronehs),"0",(int) (0),(int) (3)));
 }else if(_scoreplayerone<_playeronehs) { 
 //BA.debugLineNum = 353;BA.debugLine="playerOneHs = scorePlayerOne";
_playeronehs = _scoreplayerone;
 //BA.debugLineNum = 354;BA.debugLine="p1HsTemp = 0";
_p1hstemp = (int) (0);
 //BA.debugLineNum = 355;BA.debugLine="lbl_player_one_hs.Text = padString(playerOneHs,";
_lbl_player_one_hs.setText(_padstring(BA.NumberToString(_playeronehs),"0",(int) (0),(int) (3)));
 };
 };
 //BA.debugLineNum = 359;BA.debugLine="If p2HsTemp > playerTwoHs Then";
if (_p2hstemp>_playertwohs) { 
 //BA.debugLineNum = 360;BA.debugLine="playerTwoHs = p2HsTemp";
_playertwohs = _p2hstemp;
 //BA.debugLineNum = 361;BA.debugLine="p2HsTemp = 0";
_p2hstemp = (int) (0);
 //BA.debugLineNum = 362;BA.debugLine="lbl_player_two_hs.Text = padString(playerTwoHs,";
_lbl_player_two_hs.setText(_padstring(BA.NumberToString(_playertwohs),"0",(int) (0),(int) (3)));
 }else if(_scoreplayertwo<_playertwohs) { 
 //BA.debugLineNum = 364;BA.debugLine="playerTwoHs = scorePlayerTwo";
_playertwohs = _scoreplayertwo;
 //BA.debugLineNum = 365;BA.debugLine="p2HsTemp = 0";
_p2hstemp = (int) (0);
 //BA.debugLineNum = 366;BA.debugLine="lbl_player_two_hs.Text = padString(playerTwoHs,";
_lbl_player_two_hs.setText(_padstring(BA.NumberToString(_playertwohs),"0",(int) (0),(int) (3)));
 };
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return "";
}
public static String  _setcustomcursor1(String _dir,String _filename,double _hotspotx,double _hotspoty,anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _targetnode) throws Exception{
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _img = null;
anywheresoftware.b4j.object.JavaObject _cursor = null;
anywheresoftware.b4j.object.JavaObject _joscene = null;
 //BA.debugLineNum = 410;BA.debugLine="Sub SetCustomCursor1(Dir As String, Filename As St";
 //BA.debugLineNum = 411;BA.debugLine="Dim img As Image";
_img = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
 //BA.debugLineNum = 412;BA.debugLine="img.Initialize(Dir, Filename)";
_img.Initialize(_dir,_filename);
 //BA.debugLineNum = 413;BA.debugLine="Dim cursor As JavaObject";
_cursor = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 414;BA.debugLine="cursor.InitializeNewInstance(\"javafx.scene.ImageC";
_cursor.InitializeNewInstance("javafx.scene.ImageCursor",new Object[]{(Object)(_img.getObject()),(Object)(_hotspotx),(Object)(_hotspoty)});
 //BA.debugLineNum = 415;BA.debugLine="Dim joScene As JavaObject = TargetNode";
_joscene = new anywheresoftware.b4j.object.JavaObject();
_joscene.setObject((java.lang.Object)(_targetnode.getObject()));
 //BA.debugLineNum = 416;BA.debugLine="joScene.RunMethod(\"setCursor\", Array(cursor))";
_joscene.RunMethod("setCursor",new Object[]{(Object)(_cursor.getObject())});
 //BA.debugLineNum = 417;BA.debugLine="End Sub";
return "";
}
public static String  _setfont(anywheresoftware.b4j.objects.LabelWrapper _lbl,int _size,boolean _digital) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 80;BA.debugLine="Public Sub setFont(lbl As Label, size As Int, digi";
 //BA.debugLineNum = 81;BA.debugLine="Dim jo As JavaObject=lbl";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 82;BA.debugLine="If digital Then";
if (_digital) { 
 //BA.debugLineNum = 83;BA.debugLine="jo.runMethod(\"setFont\",Array(fx.LoadFont(File.Di";
_jo.RunMethod("setFont",new Object[]{(Object)(_fx.LoadFont(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"digital-7 (mono).ttf",_size).getObject())});
 }else {
 //BA.debugLineNum = 87;BA.debugLine="jo.runMethod(\"setFont\",Array(fx.LoadFont(File.Di";
_jo.RunMethod("setFont",new Object[]{(Object)(_fx.LoadFont(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"Crasng.ttf",_size).getObject())});
 };
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public static String  _setfontcolor(anywheresoftware.b4j.objects.LabelWrapper _lbl,boolean _yellow) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Public Sub setFontColor(lbl As Label, yellow As Bo";
 //BA.debugLineNum = 92;BA.debugLine="If yellow Then";
if (_yellow) { 
 //BA.debugLineNum = 93;BA.debugLine="lbl.Style = \"-fx-text-fill: #ffff00;\" '= fx.Colo";
_lbl.setStyle("-fx-text-fill: #ffff00;");
 }else {
 //BA.debugLineNum = 95;BA.debugLine="lbl.Style = \"-fx-text-fill: #ffffff;\"";
_lbl.setStyle("-fx-text-fill: #ffffff;");
 };
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public static String  _seths(String _hs,boolean _leftmouse) throws Exception{
int _value = 0;
 //BA.debugLineNum = 23;BA.debugLine="Public Sub setHs(hs As String, leftMouse As Boolea";
 //BA.debugLineNum = 24;BA.debugLine="Dim value As Int = hs";
_value = (int)(Double.parseDouble(_hs));
 //BA.debugLineNum = 26;BA.debugLine="If leftMouse Then";
if (_leftmouse) { 
 //BA.debugLineNum = 27;BA.debugLine="value = value + 1";
_value = (int) (_value+1);
 }else {
 //BA.debugLineNum = 29;BA.debugLine="value = value - 1";
_value = (int) (_value-1);
 };
 //BA.debugLineNum = 32;BA.debugLine="If value < 0 Then value = 0";
if (_value<0) { 
_value = (int) (0);};
 //BA.debugLineNum = 33;BA.debugLine="If value > 999 Then value = 999";
if (_value>999) { 
_value = (int) (999);};
 //BA.debugLineNum = 35;BA.debugLine="Return padString(value, \"0\", 0, 3)";
if (true) return _padstring(BA.NumberToString(_value),"0",(int) (0),(int) (3));
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public static String  _setp1caromlables(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Public Sub setP1CaromLables(lst As List)";
 //BA.debugLineNum = 64;BA.debugLine="p1_100		= lst.Get(2)";
_p1_100.setObject((javafx.scene.control.Label)(_lst.Get((int) (2))));
 //BA.debugLineNum = 65;BA.debugLine="p1_10		= lst.Get(1)";
_p1_10.setObject((javafx.scene.control.Label)(_lst.Get((int) (1))));
 //BA.debugLineNum = 66;BA.debugLine="p1_1		= lst.Get(0)";
_p1_1.setObject((javafx.scene.control.Label)(_lst.Get((int) (0))));
 //BA.debugLineNum = 67;BA.debugLine="p1_moyenne	= lst.Get(3)";
_p1_moyenne.setObject((javafx.scene.control.Label)(_lst.Get((int) (3))));
 //BA.debugLineNum = 68;BA.debugLine="p1_progressBar = lst.Get(4)";
_p1_progressbar = (b4j.example.b4xprogressbar)(_lst.Get((int) (4)));
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public static String  _setp2caromlables(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Public Sub setP2CaromLables(lst As List)";
 //BA.debugLineNum = 73;BA.debugLine="p2_100		= lst.Get(2)";
_p2_100.setObject((javafx.scene.control.Label)(_lst.Get((int) (2))));
 //BA.debugLineNum = 74;BA.debugLine="p2_10		= lst.Get(1)";
_p2_10.setObject((javafx.scene.control.Label)(_lst.Get((int) (1))));
 //BA.debugLineNum = 75;BA.debugLine="p2_1		= lst.Get(0)";
_p2_1.setObject((javafx.scene.control.Label)(_lst.Get((int) (0))));
 //BA.debugLineNum = 76;BA.debugLine="p2_moyenne	= lst.Get(3)";
_p2_moyenne.setObject((javafx.scene.control.Label)(_lst.Get((int) (3))));
 //BA.debugLineNum = 77;BA.debugLine="p2_progressBar	= lst.Get(4)";
_p2_progressbar = (b4j.example.b4xprogressbar)(_lst.Get((int) (4)));
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public static String  _setprogress(b4j.example.b4xprogressbar _v,float _progress) throws Exception{
 //BA.debugLineNum = 436;BA.debugLine="Sub setProgress(v As B4XProgressBar, progress As F";
 //BA.debugLineNum = 438;BA.debugLine="v.Progress = progress";
_v._setprogress /*float*/ (_progress);
 //BA.debugLineNum = 441;BA.debugLine="End Sub";
return "";
}
public static String  _testnumber(String _oldstringtotest,String _newstringtotest) throws Exception{
String _stringtotest = "";
 //BA.debugLineNum = 41;BA.debugLine="Public Sub testNumber(oldStringToTest As String, n";
 //BA.debugLineNum = 42;BA.debugLine="Dim stringToTest As String";
_stringtotest = "";
 //BA.debugLineNum = 44;BA.debugLine="If newStringToTest.Length = 1 Then";
if (_newstringtotest.length()==1) { 
 //BA.debugLineNum = 45;BA.debugLine="stringToTest = newStringToTest";
_stringtotest = _newstringtotest;
 }else {
 //BA.debugLineNum = 47;BA.debugLine="stringToTest = 	newStringToTest.Replace(oldStrin";
_stringtotest = _newstringtotest.replace(_oldstringtotest,"");
 };
 //BA.debugLineNum = 50;BA.debugLine="regexStr.Initialize";
_regexstr.Initialize();
 //BA.debugLineNum = 51;BA.debugLine="regexStr.Append(\"[0-9]*\\.[0-9]*|[0-9]*\")";
_regexstr.Append("[0-9]*\\.[0-9]*|[0-9]*");
 //BA.debugLineNum = 53;BA.debugLine="If Regex.IsMatch(regexStr.ToString,stringToTest)";
if (anywheresoftware.b4a.keywords.Common.Regex.IsMatch(_regexstr.ToString(),_stringtotest)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 54;BA.debugLine="Return newStringToTest";
if (true) return _newstringtotest;
 }else {
 //BA.debugLineNum = 56;BA.debugLine="Return oldStringToTest";
if (true) return _oldstringtotest;
 };
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
}
