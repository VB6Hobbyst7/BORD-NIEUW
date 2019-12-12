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
public static anywheresoftware.b4j.objects.JFX _vvvvvvvv3 = null;
public static anywheresoftware.b4a.keywords.StringBuilderWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
public static long _vv0 = 0L;
public static boolean _vvv1 = false;
public static int _vvv2 = 0;
public static int _vvv3 = 0;
public static int _vvv4 = 0;
public static int _vvv5 = 0;
public static int _vvv6 = 0;
public static int _vvv7 = 0;
public static int _vvv0 = 0;
public static int _vvvv1 = 0;
public static int _vvvv2 = 0;
public static int _vvvv3 = 0;
public static int _vvvv4 = 0;
public static int _vvvv5 = 0;
public static anywheresoftware.b4j.objects.LabelWrapper _vvvv6 = null;
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
public static String _vvvv7 = "";
public static b4j.example.cssutils _vvvvvvvv0 = null;
public static b4j.example.dateutils _vvvvvvvvv1 = null;
public static b4j.example.main _main = null;
public static b4j.example.scorebord _vvvvvvvvv2 = null;
public static b4j.example.parseconfig _vvvvvvvvv4 = null;
public static b4j.example.funcinet _vvvvvvvvv5 = null;
public static b4j.example.httputils2service _vvvvvvvvv6 = null;
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
 //BA.debugLineNum = 322;BA.debugLine="v.SetRotationAnimated(duration, degrees)";
_v.SetRotationAnimated(_duration,_degrees);
 //BA.debugLineNum = 323;BA.debugLine="Sleep(duration + 20) '+20 to make sure that the n";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (_duration+20));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 324;BA.debugLine="v.Rotation = 0";
_v.setRotation(0);
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _vvvv0(anywheresoftware.b4j.objects.LabelWrapper _mplayerone,anywheresoftware.b4j.objects.LabelWrapper _mplayertwo) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub calcMoyenne(mPlayerOne As Label, mPlayerTwo As";
 //BA.debugLineNum = 188;BA.debugLine="mPlayerOne.Text = NumberFormat2((scorePlayerOne/i";
_mplayerone.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_vvv2/(double)_vvv4),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
 //BA.debugLineNum = 189;BA.debugLine="mPlayerTwo.Text = NumberFormat2((scorePlayerTwo/i";
_mplayertwo.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_vvv3/(double)_vvv4),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvv1(int _points) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub calcScorePlayerOne(points As Int)";
 //BA.debugLineNum = 102;BA.debugLine="CallSubDelayed(scorebord, \"lastClick\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(ba,(Object)(_vvvvvvvvv2.getObject()),"lastClick");
 //BA.debugLineNum = 103;BA.debugLine="If score > 9999 Or score <= -1 Then";
if (_vvvv1>9999 || _vvvv1<=-1) { 
 //BA.debugLineNum = 104;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 106;BA.debugLine="processHs(\"p2\")";
_vvvvv0("p2");
 //BA.debugLineNum = 108;BA.debugLine="p1HsTemp	= p1HsTemp + points";
_vvvv4 = (int) (_vvvv4+_points);
 //BA.debugLineNum = 109;BA.debugLine="score		= p1_100.Text&p1_10.Text&p1_1.Text";
_vvvv1 = (int)(Double.parseDouble(_p1_100.getText()+_p1_10.getText()+_p1_1.getText()));
 //BA.debugLineNum = 110;BA.debugLine="score		= score+points";
_vvvv1 = (int) (_vvvv1+_points);
 //BA.debugLineNum = 112;BA.debugLine="If score > 999 Or score <= -1 Then";
if (_vvvv1>999 || _vvvv1<=-1) { 
 //BA.debugLineNum = 113;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 116;BA.debugLine="If lblInnings.Text = \"000\" Then";
if ((_vvvv6.getText()).equals("000")) { 
 //BA.debugLineNum = 117;BA.debugLine="lblInnings.Text	= \"001\"";
_vvvv6.setText("001");
 //BA.debugLineNum = 118;BA.debugLine="innigs			= 1";
_vvv4 = (int) (1);
 //BA.debugLineNum = 119;BA.debugLine="inngSet			= 1";
_vvv5 = (int) (1);
 };
 //BA.debugLineNum = 122;BA.debugLine="If inngSet <> 1 And score <> scorePlayerOne Then";
if (_vvv5!=1 && _vvvv1!=_vvv2) { 
 //BA.debugLineNum = 123;BA.debugLine="innigs = lblInnings.Text";
_vvv4 = (int)(Double.parseDouble(_vvvv6.getText()));
 //BA.debugLineNum = 124;BA.debugLine="innigs = innigs + 1";
_vvv4 = (int) (_vvv4+1);
 //BA.debugLineNum = 125;BA.debugLine="lblInnings.Text = padString(innigs, \"0\", 0, 3)";
_vvvv6.setText(_vvvvv5(BA.NumberToString(_vvv4),"0",(int) (0),(int) (3)));
 //BA.debugLineNum = 126;BA.debugLine="inngSet = 1";
_vvv5 = (int) (1);
 };
 //BA.debugLineNum = 129;BA.debugLine="scorePlayerOne = score";
_vvv2 = _vvvv1;
 //BA.debugLineNum = 131;BA.debugLine="txtScore = padString(score, \"0\", 0, 4)";
_vvvv7 = _vvvvv5(BA.NumberToString(_vvvv1),"0",(int) (0),(int) (4));
 //BA.debugLineNum = 134;BA.debugLine="p1_100.Text		= txtScore.SubString2(1,2)";
_p1_100.setText(_vvvv7.substring((int) (1),(int) (2)));
 //BA.debugLineNum = 135;BA.debugLine="p1_10.Text		= txtScore.SubString2(2,3)";
_p1_10.setText(_vvvv7.substring((int) (2),(int) (3)));
 //BA.debugLineNum = 136;BA.debugLine="p1_1.Text		= txtScore.SubString2(3,4)";
_p1_1.setText(_vvvv7.substring((int) (3),(int) (4)));
 //BA.debugLineNum = 138;BA.debugLine="p1_moyenne.Text = NumberFormat2((scorePlayerOne/i";
_p1_moyenne.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_vvv2/(double)_vvv4),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
 //BA.debugLineNum = 140;BA.debugLine="If playerOneToMake > 0 Then";
if (_vvvv2>0) { 
 //BA.debugLineNum = 141;BA.debugLine="CallSub2(scorebord, \"playerOnePerc\", NumberForma";
anywheresoftware.b4a.keywords.Common.CallSubNew2(ba,(Object)(_vvvvvvvvv2.getObject()),"playerOnePerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_vvv2/(double)_vvvv2)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
 //BA.debugLineNum = 142;BA.debugLine="p1_progress = (scorePlayerOne/playerOneToMake)*1";
_p1_progress = (float) ((_vvv2/(double)_vvvv2)*100);
 };
 //BA.debugLineNum = 144;BA.debugLine="setProgress(p1_progressBar, p1_progress)";
_vvvvvv0(_p1_progressbar,_p1_progress);
 //BA.debugLineNum = 145;BA.debugLine="checkMatchWon(\"p1\")";
_vvvvv4("p1");
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvv2(int _points) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub calcScorePlayertwo(points As Int)";
 //BA.debugLineNum = 150;BA.debugLine="CallSubDelayed(scorebord, \"lastClick\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(ba,(Object)(_vvvvvvvvv2.getObject()),"lastClick");
 //BA.debugLineNum = 151;BA.debugLine="inngSet = 0";
_vvv5 = (int) (0);
 //BA.debugLineNum = 152;BA.debugLine="processHs(\"p1\")";
_vvvvv0("p1");
 //BA.debugLineNum = 153;BA.debugLine="p2HsTemp = p2HsTemp + points";
_vvvv5 = (int) (_vvvv5+_points);
 //BA.debugLineNum = 155;BA.debugLine="score = p2_100.Text&p2_10.Text&p2_1.Text";
_vvvv1 = (int)(Double.parseDouble(_p2_100.getText()+_p2_10.getText()+_p2_1.getText()));
 //BA.debugLineNum = 156;BA.debugLine="score = score+points";
_vvvv1 = (int) (_vvvv1+_points);
 //BA.debugLineNum = 158;BA.debugLine="If score > 999 Or score <= -1 Then";
if (_vvvv1>999 || _vvvv1<=-1) { 
 //BA.debugLineNum = 159;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 162;BA.debugLine="If lblInnings.Text = \"000\" Then";
if ((_vvvv6.getText()).equals("000")) { 
 //BA.debugLineNum = 163;BA.debugLine="lblInnings.Text	= \"001\"";
_vvvv6.setText("001");
 //BA.debugLineNum = 164;BA.debugLine="innigs			= 1";
_vvv4 = (int) (1);
 //BA.debugLineNum = 165;BA.debugLine="inngSet			= 1";
_vvv5 = (int) (1);
 };
 //BA.debugLineNum = 168;BA.debugLine="playerTwoHs		= scorePlayerTwo - playerTwoHs";
_vvv0 = (int) (_vvv3-_vvv0);
 //BA.debugLineNum = 169;BA.debugLine="scorePlayerTwo	= score";
_vvv3 = _vvvv1;
 //BA.debugLineNum = 170;BA.debugLine="txtScore		= padString(score, \"0\", 0, 4)";
_vvvv7 = _vvvvv5(BA.NumberToString(_vvvv1),"0",(int) (0),(int) (4));
 //BA.debugLineNum = 173;BA.debugLine="p2_100.Text		= txtScore.SubString2(1,2)";
_p2_100.setText(_vvvv7.substring((int) (1),(int) (2)));
 //BA.debugLineNum = 174;BA.debugLine="p2_10.Text		= txtScore.SubString2(2,3)";
_p2_10.setText(_vvvv7.substring((int) (2),(int) (3)));
 //BA.debugLineNum = 175;BA.debugLine="p2_1.Text		= txtScore.SubString2(3,4)";
_p2_1.setText(_vvvv7.substring((int) (3),(int) (4)));
 //BA.debugLineNum = 176;BA.debugLine="p2_moyenne.Text = NumberFormat2((scorePlayerTwo/i";
_p2_moyenne.setText(anywheresoftware.b4a.keywords.Common.NumberFormat2((_vvv3/(double)_vvv4),(int) (1),(int) (3),(int) (3),anywheresoftware.b4a.keywords.Common.False));
 //BA.debugLineNum = 178;BA.debugLine="If playerTwoToMake > 0 Then";
if (_vvvv3>0) { 
 //BA.debugLineNum = 179;BA.debugLine="CallSub2(scorebord, \"playerTwoPerc\", NumberForma";
anywheresoftware.b4a.keywords.Common.CallSubNew2(ba,(Object)(_vvvvvvvvv2.getObject()),"playerTwoPerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_vvv3/(double)_vvvv3)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
 //BA.debugLineNum = 180;BA.debugLine="p2_progress = (scorePlayerTwo/playerTwoToMake)*1";
_p2_progress = (float) ((_vvv3/(double)_vvvv3)*100);
 };
 //BA.debugLineNum = 182;BA.debugLine="setProgress(p2_progressBar, p2_progress)";
_vvvvvv0(_p2_progressbar,_p2_progress);
 //BA.debugLineNum = 183;BA.debugLine="checkMatchWon(\"p2\")";
_vvvvv4("p2");
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvv3(anywheresoftware.b4j.objects.LabelWrapper _lbl,String _style) throws Exception{
 //BA.debugLineNum = 344;BA.debugLine="Sub caromLabelCss(lbl As Label, style As String)";
 //BA.debugLineNum = 345;BA.debugLine="lbl.StyleClasses.Add(style)";
_lbl.getStyleClasses().Add((Object)(_style));
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvv4(String _player) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub checkMatchWon(player As String)";
 //BA.debugLineNum = 288;BA.debugLine="If player = \"p1\" Then";
if ((_player).equals("p1")) { 
 //BA.debugLineNum = 289;BA.debugLine="CallSub(scorebord, \"checkMatchWonP1\")";
anywheresoftware.b4a.keywords.Common.CallSubNew(ba,(Object)(_vvvvvvvvv2.getObject()),"checkMatchWonP1");
 };
 //BA.debugLineNum = 292;BA.debugLine="If player = \"p2\" Then";
if ((_player).equals("p2")) { 
 //BA.debugLineNum = 293;BA.debugLine="CallSub(scorebord, \"checkMatchWonP2\")";
anywheresoftware.b4a.keywords.Common.CallSubNew(ba,(Object)(_vvvvvvvvv2.getObject()),"checkMatchWonP2");
 };
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvv5(String _padtext,String _padchr,int _padside,int _padcount) throws Exception{
String _padstr = "";
int _i = 0;
 //BA.debugLineNum = 80;BA.debugLine="Public Sub padString(padText As String ,padChr As";
 //BA.debugLineNum = 81;BA.debugLine="Dim padStr As String";
_padstr = "";
 //BA.debugLineNum = 83;BA.debugLine="If padText.Length = padCount Then";
if (_padtext.length()==_padcount) { 
 //BA.debugLineNum = 84;BA.debugLine="Return padText";
if (true) return _padtext;
 };
 //BA.debugLineNum = 87;BA.debugLine="For i = 1 To padCount-padText.Length";
{
final int step5 = 1;
final int limit5 = (int) (_padcount-_padtext.length());
_i = (int) (1) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 88;BA.debugLine="padStr = padStr&padChr";
_padstr = _padstr+_padchr;
 }
};
 //BA.debugLineNum = 91;BA.debugLine="If padSide = 0 Then";
if (_padside==0) { 
 //BA.debugLineNum = 92;BA.debugLine="Return padStr&padText";
if (true) return _padstr+_padtext;
 }else {
 //BA.debugLineNum = 94;BA.debugLine="Return padText&padStr";
if (true) return _padtext+_padstr;
 };
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvv6(anywheresoftware.b4j.objects.LabelWrapper _lbl100,anywheresoftware.b4j.objects.LabelWrapper _lbl10,anywheresoftware.b4j.objects.LabelWrapper _lbl1,boolean _leftbutton,int _number) throws Exception{
String _strmaker = "";
 //BA.debugLineNum = 192;BA.debugLine="Sub playerOneMake(lbl100 As Label, lbl10 As Label,";
 //BA.debugLineNum = 193;BA.debugLine="Dim strMaker As String";
_strmaker = "";
 //BA.debugLineNum = 194;BA.debugLine="make = $\"${lbl100.Text}${lbl10.Text}${lbl1.Text}\"";
_vvv6 = (int)(Double.parseDouble((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl100.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl10.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl1.getText()))+"")));
 //BA.debugLineNum = 196;BA.debugLine="If leftButton Then";
if (_leftbutton) { 
 //BA.debugLineNum = 197;BA.debugLine="make = make+number";
_vvv6 = (int) (_vvv6+_number);
 //BA.debugLineNum = 198;BA.debugLine="If make > 999 Then";
if (_vvv6>999) { 
 //BA.debugLineNum = 199;BA.debugLine="Return";
if (true) return "";
 };
 }else {
 //BA.debugLineNum = 202;BA.debugLine="make = make-number";
_vvv6 = (int) (_vvv6-_number);
 //BA.debugLineNum = 203;BA.debugLine="If make < 0 Then";
if (_vvv6<0) { 
 //BA.debugLineNum = 204;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 209;BA.debugLine="strMaker	= padString(make, \"0\", 0, 3)";
_strmaker = _vvvvv5(BA.NumberToString(_vvv6),"0",(int) (0),(int) (3));
 //BA.debugLineNum = 210;BA.debugLine="lbl100.Text = strMaker.SubString2(0,1)";
_lbl100.setText(_strmaker.substring((int) (0),(int) (1)));
 //BA.debugLineNum = 211;BA.debugLine="lbl10.Text	= strMaker.SubString2(1,2)";
_lbl10.setText(_strmaker.substring((int) (1),(int) (2)));
 //BA.debugLineNum = 212;BA.debugLine="lbl1.Text	= strMaker.SubString2(2,3)";
_lbl1.setText(_strmaker.substring((int) (2),(int) (3)));
 //BA.debugLineNum = 214;BA.debugLine="playerOneToMake = make";
_vvvv2 = _vvv6;
 //BA.debugLineNum = 215;BA.debugLine="p1_progress = (scorePlayerOne/playerOneToMake)*10";
_p1_progress = (float) ((_vvv2/(double)_vvvv2)*100);
 //BA.debugLineNum = 216;BA.debugLine="setProgress(p1_progressBar, p1_progress)";
_vvvvvv0(_p1_progressbar,_p1_progress);
 //BA.debugLineNum = 217;BA.debugLine="CallSub2(scorebord, \"playerOnePerc\", NumberFormat";
anywheresoftware.b4a.keywords.Common.CallSubNew2(ba,(Object)(_vvvvvvvvv2.getObject()),"playerOnePerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_vvv2/(double)_vvvv2)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvv7(anywheresoftware.b4j.objects.LabelWrapper _lbl100,anywheresoftware.b4j.objects.LabelWrapper _lbl10,anywheresoftware.b4j.objects.LabelWrapper _lbl1,boolean _leftbutton,int _number) throws Exception{
String _strmaker = "";
 //BA.debugLineNum = 220;BA.debugLine="Sub playerTwoMake(lbl100 As Label, lbl10 As Label,";
 //BA.debugLineNum = 221;BA.debugLine="Dim strMaker As String";
_strmaker = "";
 //BA.debugLineNum = 222;BA.debugLine="make = $\"${lbl100.Text}${lbl10.Text}${lbl1.Text}\"";
_vvv6 = (int)(Double.parseDouble((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl100.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl10.getText()))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl1.getText()))+"")));
 //BA.debugLineNum = 224;BA.debugLine="If leftButton Then";
if (_leftbutton) { 
 //BA.debugLineNum = 225;BA.debugLine="make = make+number";
_vvv6 = (int) (_vvv6+_number);
 //BA.debugLineNum = 226;BA.debugLine="If make > 999 Then";
if (_vvv6>999) { 
 //BA.debugLineNum = 227;BA.debugLine="Return";
if (true) return "";
 };
 }else {
 //BA.debugLineNum = 230;BA.debugLine="make = make-number";
_vvv6 = (int) (_vvv6-_number);
 //BA.debugLineNum = 231;BA.debugLine="If make < 0 Then";
if (_vvv6<0) { 
 //BA.debugLineNum = 232;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 237;BA.debugLine="strMaker	= padString(make, \"0\", 0, 3)";
_strmaker = _vvvvv5(BA.NumberToString(_vvv6),"0",(int) (0),(int) (3));
 //BA.debugLineNum = 238;BA.debugLine="lbl100.Text = strMaker.SubString2(0,1)";
_lbl100.setText(_strmaker.substring((int) (0),(int) (1)));
 //BA.debugLineNum = 239;BA.debugLine="lbl10.Text	= strMaker.SubString2(1,2)";
_lbl10.setText(_strmaker.substring((int) (1),(int) (2)));
 //BA.debugLineNum = 240;BA.debugLine="lbl1.Text	= strMaker.SubString2(2,3)";
_lbl1.setText(_strmaker.substring((int) (2),(int) (3)));
 //BA.debugLineNum = 242;BA.debugLine="playerTwoToMake = make";
_vvvv3 = _vvv6;
 //BA.debugLineNum = 243;BA.debugLine="p2_progress = (scorePlayerTwo/playerTwoToMake)*10";
_p2_progress = (float) ((_vvv3/(double)_vvvv3)*100);
 //BA.debugLineNum = 244;BA.debugLine="setProgress(p1_progressBar, p1_progress)";
_vvvvvv0(_p1_progressbar,_p1_progress);
 //BA.debugLineNum = 245;BA.debugLine="CallSub2(scorebord, \"playerTwoPerc\", NumberFormat";
anywheresoftware.b4a.keywords.Common.CallSubNew2(ba,(Object)(_vvvvvvvvv2.getObject()),"playerTwoPerc",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2((_vvv3/(double)_vvvv3)*100,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+"%"));
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_vvvvvvvv3 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Private regexStr As StringBuilder";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Public timeLastClick As Long = 0";
_vv0 = (long) (0);
 //BA.debugLineNum = 8;BA.debugLine="Public hasInternetAccess As Boolean = False";
_vvv1 = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 9;BA.debugLine="Public scorePlayerOne, scorePlayerTwo As Int";
_vvv2 = 0;
_vvv3 = 0;
 //BA.debugLineNum = 10;BA.debugLine="Public innigs, inngSet, make, playerOneHs = 0, pl";
_vvv4 = 0;
_vvv5 = 0;
_vvv6 = 0;
_vvv7 = (int) (0);
_vvv0 = (int) (0);
_vvvv1 = 0;
 //BA.debugLineNum = 11;BA.debugLine="Public playerOneToMake = 0, playerTwoToMake = 0,";
_vvvv2 = (int) (0);
_vvvv3 = (int) (0);
_vvvv4 = (int) (0);
_vvvv5 = (int) (0);
 //BA.debugLineNum = 12;BA.debugLine="Public lblInnings, lbl_player_one_hs, lbl_player_";
_vvvv6 = new anywheresoftware.b4j.objects.LabelWrapper();
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
_vvvv7 = "";
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvv0(String _player) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub processHs(player As String)";
 //BA.debugLineNum = 249;BA.debugLine="If player = \"p1\" Then";
if ((_player).equals("p1")) { 
 //BA.debugLineNum = 250;BA.debugLine="If p1HsTemp > 0 And p1HsTemp > playerOneHs Then";
if (_vvvv4>0 && _vvvv4>_vvv7) { 
 //BA.debugLineNum = 251;BA.debugLine="playerOneHs = p1HsTemp";
_vvv7 = _vvvv4;
 //BA.debugLineNum = 252;BA.debugLine="p1HsTemp = 0";
_vvvv4 = (int) (0);
 //BA.debugLineNum = 253;BA.debugLine="lbl_player_one_hs.Text = padString(playerOneHs,";
_lbl_player_one_hs.setText(_vvvvv5(BA.NumberToString(_vvv7),"0",(int) (0),(int) (3)));
 };
 };
 //BA.debugLineNum = 258;BA.debugLine="If player = \"p2\" Then";
if ((_player).equals("p2")) { 
 //BA.debugLineNum = 259;BA.debugLine="If p2HsTemp > 0 And p2HsTemp > playerTwoHs Then";
if (_vvvv5>0 && _vvvv5>_vvv0) { 
 //BA.debugLineNum = 260;BA.debugLine="playerTwoHs = p2HsTemp";
_vvv0 = _vvvv5;
 //BA.debugLineNum = 261;BA.debugLine="p2HsTemp = 0";
_vvvv5 = (int) (0);
 //BA.debugLineNum = 262;BA.debugLine="lbl_player_two_hs.Text = padString(playerTwoHs,";
_lbl_player_two_hs.setText(_vvvvv5(BA.NumberToString(_vvv0),"0",(int) (0),(int) (3)));
 };
 };
 //BA.debugLineNum = 267;BA.debugLine="If player = \"all\" Then";
if ((_player).equals("all")) { 
 //BA.debugLineNum = 268;BA.debugLine="If p1HsTemp > 0 And p1HsTemp > playerOneHs Then";
if (_vvvv4>0 && _vvvv4>_vvv7) { 
 //BA.debugLineNum = 269;BA.debugLine="playerOneHs = p1HsTemp";
_vvv7 = _vvvv4;
 //BA.debugLineNum = 270;BA.debugLine="p1HsTemp = 0";
_vvvv4 = (int) (0);
 //BA.debugLineNum = 271;BA.debugLine="lbl_player_one_hs.Text = padString(playerOneHs,";
_lbl_player_one_hs.setText(_vvvvv5(BA.NumberToString(_vvv7),"0",(int) (0),(int) (3)));
 };
 //BA.debugLineNum = 276;BA.debugLine="If p2HsTemp > 0 And p2HsTemp > playerTwoHs Then";
if (_vvvv5>0 && _vvvv5>_vvv0) { 
 //BA.debugLineNum = 277;BA.debugLine="playerTwoHs = p2HsTemp";
_vvv0 = _vvvv5;
 //BA.debugLineNum = 278;BA.debugLine="p2HsTemp = 0";
_vvvv5 = (int) (0);
 //BA.debugLineNum = 279;BA.debugLine="lbl_player_two_hs.Text = padString(playerTwoHs,";
_lbl_player_two_hs.setText(_vvvvv5(BA.NumberToString(_vvv0),"0",(int) (0),(int) (3)));
 };
 };
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvv1(String _dir,String _filename,double _hotspotx,double _hotspoty,anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _targetnode) throws Exception{
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _img = null;
anywheresoftware.b4j.object.JavaObject _cursor = null;
anywheresoftware.b4j.object.JavaObject _joscene = null;
 //BA.debugLineNum = 311;BA.debugLine="Sub SetCustomCursor1(Dir As String, Filename As St";
 //BA.debugLineNum = 312;BA.debugLine="Dim img As Image";
_img = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
 //BA.debugLineNum = 313;BA.debugLine="img.Initialize(Dir, Filename)";
_img.Initialize(_dir,_filename);
 //BA.debugLineNum = 314;BA.debugLine="Dim cursor As JavaObject";
_cursor = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 315;BA.debugLine="cursor.InitializeNewInstance(\"javafx.scene.ImageC";
_cursor.InitializeNewInstance("javafx.scene.ImageCursor",new Object[]{(Object)(_img.getObject()),(Object)(_hotspotx),(Object)(_hotspoty)});
 //BA.debugLineNum = 316;BA.debugLine="Dim joScene As JavaObject = TargetNode";
_joscene = new anywheresoftware.b4j.object.JavaObject();
_joscene.setObject((java.lang.Object)(_targetnode.getObject()));
 //BA.debugLineNum = 317;BA.debugLine="joScene.RunMethod(\"setCursor\", Array(cursor))";
_joscene.RunMethod("setCursor",new Object[]{(Object)(_cursor.getObject())});
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvv2(anywheresoftware.b4j.objects.LabelWrapper _lbl,int _size,boolean _digital) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 60;BA.debugLine="Public Sub setFont(lbl As Label, size As Int, digi";
 //BA.debugLineNum = 61;BA.debugLine="Dim jo As JavaObject=lbl";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 62;BA.debugLine="If digital Then";
if (_digital) { 
 //BA.debugLineNum = 63;BA.debugLine="jo.runMethod(\"setFont\",Array(fx.LoadFont(File.Di";
_jo.RunMethod("setFont",new Object[]{(Object)(_vvvvvvvv3.LoadFont(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"digital-7 (mono).ttf",_size).getObject())});
 }else {
 //BA.debugLineNum = 65;BA.debugLine="jo.runMethod(\"setFont\",Array(fx.LoadFont(File.Di";
_jo.RunMethod("setFont",new Object[]{(Object)(_vvvvvvvv3.LoadFont(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"Arial.ttf",_size).getObject())});
 };
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvv3(anywheresoftware.b4j.objects.LabelWrapper _lbl,boolean _yellow) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Public Sub setFontColor(lbl As Label, yellow As Bo";
 //BA.debugLineNum = 70;BA.debugLine="If yellow Then";
if (_yellow) { 
 //BA.debugLineNum = 71;BA.debugLine="lbl.Style = \"-fx-text-fill: #ffff00;\" '= fx.Colo";
_lbl.setStyle("-fx-text-fill: #ffff00;");
 }else {
 //BA.debugLineNum = 73;BA.debugLine="lbl.Style = \"-fx-text-fill: #ffffff;\"";
_lbl.setStyle("-fx-text-fill: #ffffff;");
 };
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvv4(anywheresoftware.b4j.objects.Form _frm,String _imagefile) throws Exception{
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _img = null;
anywheresoftware.b4j.object.JavaObject _joimagecursor = null;
anywheresoftware.b4j.object.JavaObject _jocursor = null;
 //BA.debugLineNum = 299;BA.debugLine="Sub SetFormCursor(frm As Form, imagefile As String";
 //BA.debugLineNum = 300;BA.debugLine="Dim img As Image";
_img = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
 //BA.debugLineNum = 301;BA.debugLine="img.Initialize(File.DirAssets, imagefile)";
_img.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imagefile);
 //BA.debugLineNum = 302;BA.debugLine="Dim joImageCursor As JavaObject";
_joimagecursor = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 303;BA.debugLine="joImageCursor.InitializeNewInstance(\"javafx.scene";
_joimagecursor.InitializeNewInstance("javafx.scene.ImageCursor",new Object[]{(Object)(_img.getObject())});
 //BA.debugLineNum = 304;BA.debugLine="Dim joCursor As JavaObject = frm.RootPane";
_jocursor = new anywheresoftware.b4j.object.JavaObject();
_jocursor.setObject((java.lang.Object)(_frm.getRootPane().getObject()));
 //BA.debugLineNum = 305;BA.debugLine="joCursor.RunMethod(\"setCursor\", Array(joImageCurs";
_jocursor.RunMethod("setCursor",new Object[]{(Object)(_joimagecursor.getObject())});
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvv5(anywheresoftware.b4j.objects.LabelWrapper _lbl) throws Exception{
 //BA.debugLineNum = 348;BA.debugLine="Sub setNumberCss(lbl As Label)";
 //BA.debugLineNum = 349;BA.debugLine="CSSUtils.SetStyleProperty(lbl, \"-fx-background-co";
_vvvvvvvv0._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_lbl.getObject())),"-fx-background-color","linear-gradient(to bottom,  #cfe7fa 0%,#6393c1 100%)");
 //BA.debugLineNum = 350;BA.debugLine="CSSUtils.SetStyleProperty(lbl, \"-fx-background-ra";
_vvvvvvvv0._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_lbl.getObject())),"-fx-background-radius","3,2,1");
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvv6(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
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
public static String  _vvvvvv7(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
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
public static String  _vvvvvv0(b4j.example.b4xprogressbar _v,float _progress) throws Exception{
 //BA.debugLineNum = 337;BA.debugLine="Sub setProgress(v As B4XProgressBar, progress As F";
 //BA.debugLineNum = 339;BA.debugLine="v.Progress = progress";
_v._setvvvvvvvvvvvv2 /*float*/ (_progress);
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvv1(String _oldstringtotest,String _newstringtotest) throws Exception{
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
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.Initialize();
 //BA.debugLineNum = 31;BA.debugLine="regexStr.Append(\"[0-9]*\\.[0-9]*|[0-9]*\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.Append("[0-9]*\\.[0-9]*|[0-9]*");
 //BA.debugLineNum = 33;BA.debugLine="If Regex.IsMatch(regexStr.ToString,stringToTest)";
if (anywheresoftware.b4a.keywords.Common.Regex.IsMatch(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.ToString(),_stringtotest)==anywheresoftware.b4a.keywords.Common.True) { 
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
