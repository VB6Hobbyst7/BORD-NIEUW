package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class func_subs_0 {


public static void  _animacao_rotacao(RemoteObject _v,RemoteObject _duration,RemoteObject _degrees) throws Exception{
try {
		Debug.PushSubsStack("Animacao_Rotacao (func) ","func",2,func.ba,func.mostCurrent,294);
if (RapidSub.canDelegate("animacao_rotacao")) { b4j.example.func.remoteMe.runUserSub(false, "func","animacao_rotacao", _v, _duration, _degrees); return;}
ResumableSub_Animacao_Rotacao rsub = new ResumableSub_Animacao_Rotacao(null,_v,_duration,_degrees);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Animacao_Rotacao extends BA.ResumableSub {
public ResumableSub_Animacao_Rotacao(b4j.example.func parent,RemoteObject _v,RemoteObject _duration,RemoteObject _degrees) {
this.parent = parent;
this._v = _v;
this._duration = _duration;
this._degrees = _degrees;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.example.func parent;
RemoteObject _v;
RemoteObject _duration;
RemoteObject _degrees;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Animacao_Rotacao (func) ","func",2,func.ba,func.mostCurrent,294);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("v", _v);
Debug.locals.put("duration", _duration);
Debug.locals.put("degrees", _degrees);
 BA.debugLineNum = 295;BA.debugLine="v.SetRotationAnimated(duration, degrees)";
Debug.ShouldStop(64);
_v.runVoidMethod ("SetRotationAnimated",(Object)(_duration),(Object)(BA.numberCast(double.class, _degrees)));
 BA.debugLineNum = 296;BA.debugLine="Sleep(duration + 20) '+20 to make sure that the n";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("Sleep",func.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "func", "animacao_rotacao"),RemoteObject.solve(new RemoteObject[] {_duration,RemoteObject.createImmutable(20)}, "+",1, 1));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 297;BA.debugLine="v.Rotation = 0";
Debug.ShouldStop(256);
_v.runMethod(true,"setRotation",BA.numberCast(double.class, 0));
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.ShouldStop(512);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _calcmoyenne(RemoteObject _mplayerone,RemoteObject _mplayertwo) throws Exception{
try {
		Debug.PushSubsStack("calcMoyenne (func) ","func",2,func.ba,func.mostCurrent,173);
if (RapidSub.canDelegate("calcmoyenne")) { return b4j.example.func.remoteMe.runUserSub(false, "func","calcmoyenne", _mplayerone, _mplayertwo);}
Debug.locals.put("mPlayerOne", _mplayerone);
Debug.locals.put("mPlayerTwo", _mplayertwo);
 BA.debugLineNum = 173;BA.debugLine="Sub calcMoyenne(mPlayerOne As Label, mPlayerTwo As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 174;BA.debugLine="mPlayerOne.Text = NumberFormat2((scorePlayerOne/i";
Debug.ShouldStop(8192);
_mplayerone.runMethod(true,"setText",func.__c.runMethod(true,"NumberFormat2",(Object)((RemoteObject.solve(new RemoteObject[] {func._scoreplayerone,func._innigs}, "/",0, 0))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 3)),(Object)(func.__c.getField(true,"False"))));
 BA.debugLineNum = 175;BA.debugLine="mPlayerTwo.Text = NumberFormat2((scorePlayerTwo/i";
Debug.ShouldStop(16384);
_mplayertwo.runMethod(true,"setText",func.__c.runMethod(true,"NumberFormat2",(Object)((RemoteObject.solve(new RemoteObject[] {func._scoreplayertwo,func._innigs}, "/",0, 0))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 3)),(Object)(func.__c.getField(true,"False"))));
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calcscoreplayerone(RemoteObject _points) throws Exception{
try {
		Debug.PushSubsStack("calcScorePlayerOne (func) ","func",2,func.ba,func.mostCurrent,86);
if (RapidSub.canDelegate("calcscoreplayerone")) { return b4j.example.func.remoteMe.runUserSub(false, "func","calcscoreplayerone", _points);}
Debug.locals.put("points", _points);
 BA.debugLineNum = 86;BA.debugLine="Sub calcScorePlayerOne(points As Int)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 88;BA.debugLine="CallSubDelayed(scorebord, \"lastClick\")";
Debug.ShouldStop(8388608);
func.__c.runVoidMethod ("CallSubDelayed",func.ba,(Object)((func._scorebord.getObject())),(Object)(RemoteObject.createImmutable("lastClick")));
 BA.debugLineNum = 89;BA.debugLine="If score > 9999 Or score <= -1 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",func._score,BA.numberCast(double.class, 9999)) || RemoteObject.solveBoolean("k",func._score,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 90;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 92;BA.debugLine="processHs(\"p2\")";
Debug.ShouldStop(134217728);
_processhs(RemoteObject.createImmutable("p2"));
 BA.debugLineNum = 94;BA.debugLine="p1HsTemp	= p1HsTemp + points";
Debug.ShouldStop(536870912);
func._p1hstemp = RemoteObject.solve(new RemoteObject[] {func._p1hstemp,_points}, "+",1, 1);
 BA.debugLineNum = 95;BA.debugLine="score		= p1_100.Text&p1_10.Text&p1_1.Text";
Debug.ShouldStop(1073741824);
func._score = BA.numberCast(int.class, RemoteObject.concat(func._p1_100.runMethod(true,"getText"),func._p1_10.runMethod(true,"getText"),func._p1_1.runMethod(true,"getText")));
 BA.debugLineNum = 96;BA.debugLine="score		= score+points";
Debug.ShouldStop(-2147483648);
func._score = RemoteObject.solve(new RemoteObject[] {func._score,_points}, "+",1, 1);
 BA.debugLineNum = 98;BA.debugLine="If score > 999 Or score <= -1 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",func._score,BA.numberCast(double.class, 999)) || RemoteObject.solveBoolean("k",func._score,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 99;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 102;BA.debugLine="If lblInnings.Text = \"000\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",func._lblinnings.runMethod(true,"getText"),BA.ObjectToString("000"))) { 
 BA.debugLineNum = 103;BA.debugLine="lblInnings.Text	= \"001\"";
Debug.ShouldStop(64);
func._lblinnings.runMethod(true,"setText",BA.ObjectToString("001"));
 BA.debugLineNum = 104;BA.debugLine="innigs			= 1";
Debug.ShouldStop(128);
func._innigs = BA.numberCast(int.class, 1);
 BA.debugLineNum = 105;BA.debugLine="inngSet			= 1";
Debug.ShouldStop(256);
func._inngset = BA.numberCast(int.class, 1);
 };
 BA.debugLineNum = 108;BA.debugLine="If inngSet <> 1 And score <> scorePlayerOne Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("!",func._inngset,BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("!",func._score,BA.numberCast(double.class, func._scoreplayerone))) { 
 BA.debugLineNum = 109;BA.debugLine="innigs = lblInnings.Text";
Debug.ShouldStop(4096);
func._innigs = BA.numberCast(int.class, func._lblinnings.runMethod(true,"getText"));
 BA.debugLineNum = 110;BA.debugLine="innigs = innigs + 1";
Debug.ShouldStop(8192);
func._innigs = RemoteObject.solve(new RemoteObject[] {func._innigs,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 111;BA.debugLine="lblInnings.Text = padString(innigs, \"0\", 0, 3)";
Debug.ShouldStop(16384);
func._lblinnings.runMethod(true,"setText",_padstring(BA.NumberToString(func._innigs),BA.ObjectToString("0"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 3)));
 BA.debugLineNum = 112;BA.debugLine="inngSet = 1";
Debug.ShouldStop(32768);
func._inngset = BA.numberCast(int.class, 1);
 };
 BA.debugLineNum = 115;BA.debugLine="scorePlayerOne = score";
Debug.ShouldStop(262144);
func._scoreplayerone = func._score;
 BA.debugLineNum = 117;BA.debugLine="txtScore = padString(score, \"0\", 0, 4)";
Debug.ShouldStop(1048576);
func._txtscore = _padstring(BA.NumberToString(func._score),BA.ObjectToString("0"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 4));
 BA.debugLineNum = 120;BA.debugLine="p1_100.Text		= txtScore.SubString2(1,2)";
Debug.ShouldStop(8388608);
func._p1_100.runMethod(true,"setText",func._txtscore.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 121;BA.debugLine="p1_10.Text		= txtScore.SubString2(2,3)";
Debug.ShouldStop(16777216);
func._p1_10.runMethod(true,"setText",func._txtscore.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 122;BA.debugLine="p1_1.Text		= txtScore.SubString2(3,4)";
Debug.ShouldStop(33554432);
func._p1_1.runMethod(true,"setText",func._txtscore.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 4))));
 BA.debugLineNum = 124;BA.debugLine="p1_moyenne.Text = NumberFormat2((scorePlayerOne/i";
Debug.ShouldStop(134217728);
func._p1_moyenne.runMethod(true,"setText",func.__c.runMethod(true,"NumberFormat2",(Object)((RemoteObject.solve(new RemoteObject[] {func._scoreplayerone,func._innigs}, "/",0, 0))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 3)),(Object)(func.__c.getField(true,"False"))));
 BA.debugLineNum = 126;BA.debugLine="If playerOneToMake > 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",func._playeronetomake,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 127;BA.debugLine="CallSub2(scorebord, \"playerOnePerc\", NumberForma";
Debug.ShouldStop(1073741824);
func.__c.runMethodAndSync(false,"CallSubNew2",func.ba,(Object)((func._scorebord.getObject())),(Object)(BA.ObjectToString("playerOnePerc")),(Object)((RemoteObject.concat(func.__c.runMethod(true,"NumberFormat2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {func._scoreplayerone,func._playeronetomake}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(func.__c.getField(true,"False"))),RemoteObject.createImmutable("%")))));
 BA.debugLineNum = 128;BA.debugLine="p1_progress = (scorePlayerOne/playerOneToMake)*1";
Debug.ShouldStop(-2147483648);
func._p1_progress = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {func._scoreplayerone,func._playeronetomake}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0));
 };
 BA.debugLineNum = 130;BA.debugLine="setProgress(p1_progressBar, p1_progress)";
Debug.ShouldStop(2);
_setprogress(func._p1_progressbar,func._p1_progress);
 BA.debugLineNum = 131;BA.debugLine="checkMatchWon(\"p1\")";
Debug.ShouldStop(4);
_checkmatchwon(RemoteObject.createImmutable("p1"));
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calcscoreplayertwo(RemoteObject _points) throws Exception{
try {
		Debug.PushSubsStack("calcScorePlayertwo (func) ","func",2,func.ba,func.mostCurrent,135);
if (RapidSub.canDelegate("calcscoreplayertwo")) { return b4j.example.func.remoteMe.runUserSub(false, "func","calcscoreplayertwo", _points);}
Debug.locals.put("points", _points);
 BA.debugLineNum = 135;BA.debugLine="Sub calcScorePlayertwo(points As Int)";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="CallSubDelayed(scorebord, \"lastClick\")";
Debug.ShouldStop(128);
func.__c.runVoidMethod ("CallSubDelayed",func.ba,(Object)((func._scorebord.getObject())),(Object)(RemoteObject.createImmutable("lastClick")));
 BA.debugLineNum = 137;BA.debugLine="inngSet = 0";
Debug.ShouldStop(256);
func._inngset = BA.numberCast(int.class, 0);
 BA.debugLineNum = 138;BA.debugLine="processHs(\"p1\")";
Debug.ShouldStop(512);
_processhs(RemoteObject.createImmutable("p1"));
 BA.debugLineNum = 139;BA.debugLine="p2HsTemp = p2HsTemp + points";
Debug.ShouldStop(1024);
func._p2hstemp = RemoteObject.solve(new RemoteObject[] {func._p2hstemp,_points}, "+",1, 1);
 BA.debugLineNum = 141;BA.debugLine="score = p2_100.Text&p2_10.Text&p2_1.Text";
Debug.ShouldStop(4096);
func._score = BA.numberCast(int.class, RemoteObject.concat(func._p2_100.runMethod(true,"getText"),func._p2_10.runMethod(true,"getText"),func._p2_1.runMethod(true,"getText")));
 BA.debugLineNum = 142;BA.debugLine="score = score+points";
Debug.ShouldStop(8192);
func._score = RemoteObject.solve(new RemoteObject[] {func._score,_points}, "+",1, 1);
 BA.debugLineNum = 144;BA.debugLine="If score > 999 Or score <= -1 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",func._score,BA.numberCast(double.class, 999)) || RemoteObject.solveBoolean("k",func._score,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 145;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 148;BA.debugLine="If lblInnings.Text = \"000\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",func._lblinnings.runMethod(true,"getText"),BA.ObjectToString("000"))) { 
 BA.debugLineNum = 149;BA.debugLine="lblInnings.Text	= \"001\"";
Debug.ShouldStop(1048576);
func._lblinnings.runMethod(true,"setText",BA.ObjectToString("001"));
 BA.debugLineNum = 150;BA.debugLine="innigs			= 1";
Debug.ShouldStop(2097152);
func._innigs = BA.numberCast(int.class, 1);
 BA.debugLineNum = 151;BA.debugLine="inngSet			= 1";
Debug.ShouldStop(4194304);
func._inngset = BA.numberCast(int.class, 1);
 };
 BA.debugLineNum = 154;BA.debugLine="playerTwoHs		= scorePlayerTwo - playerTwoHs";
Debug.ShouldStop(33554432);
func._playertwohs = RemoteObject.solve(new RemoteObject[] {func._scoreplayertwo,func._playertwohs}, "-",1, 1);
 BA.debugLineNum = 155;BA.debugLine="scorePlayerTwo	= score";
Debug.ShouldStop(67108864);
func._scoreplayertwo = func._score;
 BA.debugLineNum = 156;BA.debugLine="txtScore		= padString(score, \"0\", 0, 4)";
Debug.ShouldStop(134217728);
func._txtscore = _padstring(BA.NumberToString(func._score),BA.ObjectToString("0"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 4));
 BA.debugLineNum = 159;BA.debugLine="p2_100.Text		= txtScore.SubString2(1,2)";
Debug.ShouldStop(1073741824);
func._p2_100.runMethod(true,"setText",func._txtscore.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 160;BA.debugLine="p2_10.Text		= txtScore.SubString2(2,3)";
Debug.ShouldStop(-2147483648);
func._p2_10.runMethod(true,"setText",func._txtscore.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 161;BA.debugLine="p2_1.Text		= txtScore.SubString2(3,4)";
Debug.ShouldStop(1);
func._p2_1.runMethod(true,"setText",func._txtscore.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 4))));
 BA.debugLineNum = 162;BA.debugLine="p2_moyenne.Text = NumberFormat2((scorePlayerTwo/i";
Debug.ShouldStop(2);
func._p2_moyenne.runMethod(true,"setText",func.__c.runMethod(true,"NumberFormat2",(Object)((RemoteObject.solve(new RemoteObject[] {func._scoreplayertwo,func._innigs}, "/",0, 0))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 3)),(Object)(func.__c.getField(true,"False"))));
 BA.debugLineNum = 164;BA.debugLine="If playerTwoToMake > 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",func._playertwotomake,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 165;BA.debugLine="CallSub2(scorebord, \"playerTwoPerc\", NumberForma";
Debug.ShouldStop(16);
func.__c.runMethodAndSync(false,"CallSubNew2",func.ba,(Object)((func._scorebord.getObject())),(Object)(BA.ObjectToString("playerTwoPerc")),(Object)((RemoteObject.concat(func.__c.runMethod(true,"NumberFormat2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {func._scoreplayertwo,func._playertwotomake}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(func.__c.getField(true,"False"))),RemoteObject.createImmutable("%")))));
 BA.debugLineNum = 166;BA.debugLine="p2_progress = (scorePlayerTwo/playerTwoToMake)*1";
Debug.ShouldStop(32);
func._p2_progress = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {func._scoreplayertwo,func._playertwotomake}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0));
 };
 BA.debugLineNum = 168;BA.debugLine="setProgress(p2_progressBar, p2_progress)";
Debug.ShouldStop(128);
_setprogress(func._p2_progressbar,func._p2_progress);
 BA.debugLineNum = 169;BA.debugLine="checkMatchWon(\"p2\")";
Debug.ShouldStop(256);
_checkmatchwon(RemoteObject.createImmutable("p2"));
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _caromlabelcss(RemoteObject _lbl,RemoteObject _style) throws Exception{
try {
		Debug.PushSubsStack("caromLabelCss (func) ","func",2,func.ba,func.mostCurrent,317);
if (RapidSub.canDelegate("caromlabelcss")) { return b4j.example.func.remoteMe.runUserSub(false, "func","caromlabelcss", _lbl, _style);}
Debug.locals.put("lbl", _lbl);
Debug.locals.put("style", _style);
 BA.debugLineNum = 317;BA.debugLine="Sub caromLabelCss(lbl As Label, style As String)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 318;BA.debugLine="lbl.StyleClasses.Add(style)";
Debug.ShouldStop(536870912);
_lbl.runMethod(false,"getStyleClasses").runVoidMethod ("Add",(Object)((_style)));
 BA.debugLineNum = 319;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkmatchwon(RemoteObject _player) throws Exception{
try {
		Debug.PushSubsStack("checkMatchWon (func) ","func",2,func.ba,func.mostCurrent,273);
if (RapidSub.canDelegate("checkmatchwon")) { return b4j.example.func.remoteMe.runUserSub(false, "func","checkmatchwon", _player);}
Debug.locals.put("player", _player);
 BA.debugLineNum = 273;BA.debugLine="Sub checkMatchWon(player As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 274;BA.debugLine="If player = \"p1\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_player,BA.ObjectToString("p1"))) { 
 BA.debugLineNum = 275;BA.debugLine="CallSub(scorebord, \"checkMatchWonP1\")";
Debug.ShouldStop(262144);
func.__c.runMethodAndSync(false,"CallSubNew",func.ba,(Object)((func._scorebord.getObject())),(Object)(RemoteObject.createImmutable("checkMatchWonP1")));
 };
 BA.debugLineNum = 278;BA.debugLine="If player = \"p2\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_player,BA.ObjectToString("p2"))) { 
 BA.debugLineNum = 279;BA.debugLine="CallSub(scorebord, \"checkMatchWonP2\")";
Debug.ShouldStop(4194304);
func.__c.runMethodAndSync(false,"CallSubNew",func.ba,(Object)((func._scorebord.getObject())),(Object)(RemoteObject.createImmutable("checkMatchWonP2")));
 };
 BA.debugLineNum = 281;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _padstring(RemoteObject _padtext,RemoteObject _padchr,RemoteObject _padside,RemoteObject _padcount) throws Exception{
try {
		Debug.PushSubsStack("padString (func) ","func",2,func.ba,func.mostCurrent,66);
if (RapidSub.canDelegate("padstring")) { return b4j.example.func.remoteMe.runUserSub(false, "func","padstring", _padtext, _padchr, _padside, _padcount);}
RemoteObject _padstr = RemoteObject.createImmutable("");
int _i = 0;
Debug.locals.put("padText", _padtext);
Debug.locals.put("padChr", _padchr);
Debug.locals.put("padSide", _padside);
Debug.locals.put("padCount", _padcount);
 BA.debugLineNum = 66;BA.debugLine="Public Sub padString(padText As String ,padChr As";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="Dim padStr As String";
Debug.ShouldStop(4);
_padstr = RemoteObject.createImmutable("");Debug.locals.put("padStr", _padstr);
 BA.debugLineNum = 69;BA.debugLine="If padText.Length = padCount Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_padtext.runMethod(true,"length"),BA.numberCast(double.class, _padcount))) { 
 BA.debugLineNum = 70;BA.debugLine="Return padText";
Debug.ShouldStop(32);
if (true) return _padtext;
 };
 BA.debugLineNum = 73;BA.debugLine="For i = 1 To padCount-padText.Length";
Debug.ShouldStop(256);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_padcount,_padtext.runMethod(true,"length")}, "-",1, 1).<Integer>get().intValue();
_i = 1 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 74;BA.debugLine="padStr = padStr&padChr";
Debug.ShouldStop(512);
_padstr = RemoteObject.concat(_padstr,_padchr);Debug.locals.put("padStr", _padstr);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 77;BA.debugLine="If padSide = 0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_padside,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 78;BA.debugLine="Return padStr&padText";
Debug.ShouldStop(8192);
if (true) return RemoteObject.concat(_padstr,_padtext);
 }else {
 BA.debugLineNum = 80;BA.debugLine="Return padText&padStr";
Debug.ShouldStop(32768);
if (true) return RemoteObject.concat(_padtext,_padstr);
 };
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playeronemake(RemoteObject _lbl100,RemoteObject _lbl10,RemoteObject _lbl1,RemoteObject _leftbutton,RemoteObject _number) throws Exception{
try {
		Debug.PushSubsStack("playerOneMake (func) ","func",2,func.ba,func.mostCurrent,178);
if (RapidSub.canDelegate("playeronemake")) { return b4j.example.func.remoteMe.runUserSub(false, "func","playeronemake", _lbl100, _lbl10, _lbl1, _leftbutton, _number);}
RemoteObject _strmaker = RemoteObject.createImmutable("");
Debug.locals.put("lbl100", _lbl100);
Debug.locals.put("lbl10", _lbl10);
Debug.locals.put("lbl1", _lbl1);
Debug.locals.put("leftButton", _leftbutton);
Debug.locals.put("number", _number);
 BA.debugLineNum = 178;BA.debugLine="Sub playerOneMake(lbl100 As Label, lbl10 As Label,";
Debug.ShouldStop(131072);
 BA.debugLineNum = 179;BA.debugLine="Dim strMaker As String";
Debug.ShouldStop(262144);
_strmaker = RemoteObject.createImmutable("");Debug.locals.put("strMaker", _strmaker);
 BA.debugLineNum = 180;BA.debugLine="make = $\"${lbl100.Text}${lbl10.Text}${lbl1.Text}\"";
Debug.ShouldStop(524288);
func._make = BA.numberCast(int.class, (RemoteObject.concat(RemoteObject.createImmutable(""),func.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lbl100.runMethod(true,"getText")))),RemoteObject.createImmutable(""),func.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lbl10.runMethod(true,"getText")))),RemoteObject.createImmutable(""),func.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lbl1.runMethod(true,"getText")))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 182;BA.debugLine="If leftButton Then";
Debug.ShouldStop(2097152);
if (_leftbutton.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 183;BA.debugLine="make = make+number";
Debug.ShouldStop(4194304);
func._make = RemoteObject.solve(new RemoteObject[] {func._make,_number}, "+",1, 1);
 BA.debugLineNum = 184;BA.debugLine="If make > 999 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",func._make,BA.numberCast(double.class, 999))) { 
 BA.debugLineNum = 185;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.createImmutable("");
 };
 }else {
 BA.debugLineNum = 188;BA.debugLine="make = make-number";
Debug.ShouldStop(134217728);
func._make = RemoteObject.solve(new RemoteObject[] {func._make,_number}, "-",1, 1);
 BA.debugLineNum = 189;BA.debugLine="If make < 0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("<",func._make,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 190;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.createImmutable("");
 };
 };
 BA.debugLineNum = 195;BA.debugLine="strMaker	= padString(make, \"0\", 0, 3)";
Debug.ShouldStop(4);
_strmaker = _padstring(BA.NumberToString(func._make),BA.ObjectToString("0"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 3));Debug.locals.put("strMaker", _strmaker);
 BA.debugLineNum = 196;BA.debugLine="lbl100.Text = strMaker.SubString2(0,1)";
Debug.ShouldStop(8);
_lbl100.runMethod(true,"setText",_strmaker.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 197;BA.debugLine="lbl10.Text	= strMaker.SubString2(1,2)";
Debug.ShouldStop(16);
_lbl10.runMethod(true,"setText",_strmaker.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 198;BA.debugLine="lbl1.Text	= strMaker.SubString2(2,3)";
Debug.ShouldStop(32);
_lbl1.runMethod(true,"setText",_strmaker.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 200;BA.debugLine="playerOneToMake = make";
Debug.ShouldStop(128);
func._playeronetomake = func._make;
 BA.debugLineNum = 201;BA.debugLine="p1_progress = (scorePlayerOne/playerOneToMake)*10";
Debug.ShouldStop(256);
func._p1_progress = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {func._scoreplayerone,func._playeronetomake}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0));
 BA.debugLineNum = 202;BA.debugLine="setProgress(p1_progressBar, p1_progress)";
Debug.ShouldStop(512);
_setprogress(func._p1_progressbar,func._p1_progress);
 BA.debugLineNum = 203;BA.debugLine="CallSub2(scorebord, \"playerOnePerc\", NumberFormat";
Debug.ShouldStop(1024);
func.__c.runMethodAndSync(false,"CallSubNew2",func.ba,(Object)((func._scorebord.getObject())),(Object)(BA.ObjectToString("playerOnePerc")),(Object)((RemoteObject.concat(func.__c.runMethod(true,"NumberFormat2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {func._scoreplayerone,func._playeronetomake}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(func.__c.getField(true,"False"))),RemoteObject.createImmutable("%")))));
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playertwomake(RemoteObject _lbl100,RemoteObject _lbl10,RemoteObject _lbl1,RemoteObject _leftbutton,RemoteObject _number) throws Exception{
try {
		Debug.PushSubsStack("playerTwoMake (func) ","func",2,func.ba,func.mostCurrent,206);
if (RapidSub.canDelegate("playertwomake")) { return b4j.example.func.remoteMe.runUserSub(false, "func","playertwomake", _lbl100, _lbl10, _lbl1, _leftbutton, _number);}
RemoteObject _strmaker = RemoteObject.createImmutable("");
Debug.locals.put("lbl100", _lbl100);
Debug.locals.put("lbl10", _lbl10);
Debug.locals.put("lbl1", _lbl1);
Debug.locals.put("leftButton", _leftbutton);
Debug.locals.put("number", _number);
 BA.debugLineNum = 206;BA.debugLine="Sub playerTwoMake(lbl100 As Label, lbl10 As Label,";
Debug.ShouldStop(8192);
 BA.debugLineNum = 207;BA.debugLine="Dim strMaker As String";
Debug.ShouldStop(16384);
_strmaker = RemoteObject.createImmutable("");Debug.locals.put("strMaker", _strmaker);
 BA.debugLineNum = 208;BA.debugLine="make = $\"${lbl100.Text}${lbl10.Text}${lbl1.Text}\"";
Debug.ShouldStop(32768);
func._make = BA.numberCast(int.class, (RemoteObject.concat(RemoteObject.createImmutable(""),func.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lbl100.runMethod(true,"getText")))),RemoteObject.createImmutable(""),func.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lbl10.runMethod(true,"getText")))),RemoteObject.createImmutable(""),func.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lbl1.runMethod(true,"getText")))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 210;BA.debugLine="If leftButton Then";
Debug.ShouldStop(131072);
if (_leftbutton.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 211;BA.debugLine="make = make+number";
Debug.ShouldStop(262144);
func._make = RemoteObject.solve(new RemoteObject[] {func._make,_number}, "+",1, 1);
 BA.debugLineNum = 212;BA.debugLine="If make > 999 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",func._make,BA.numberCast(double.class, 999))) { 
 BA.debugLineNum = 213;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.createImmutable("");
 };
 }else {
 BA.debugLineNum = 216;BA.debugLine="make = make-number";
Debug.ShouldStop(8388608);
func._make = RemoteObject.solve(new RemoteObject[] {func._make,_number}, "-",1, 1);
 BA.debugLineNum = 217;BA.debugLine="If make < 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("<",func._make,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 218;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.createImmutable("");
 };
 };
 BA.debugLineNum = 223;BA.debugLine="strMaker	= padString(make, \"0\", 0, 3)";
Debug.ShouldStop(1073741824);
_strmaker = _padstring(BA.NumberToString(func._make),BA.ObjectToString("0"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 3));Debug.locals.put("strMaker", _strmaker);
 BA.debugLineNum = 224;BA.debugLine="lbl100.Text = strMaker.SubString2(0,1)";
Debug.ShouldStop(-2147483648);
_lbl100.runMethod(true,"setText",_strmaker.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 225;BA.debugLine="lbl10.Text	= strMaker.SubString2(1,2)";
Debug.ShouldStop(1);
_lbl10.runMethod(true,"setText",_strmaker.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 226;BA.debugLine="lbl1.Text	= strMaker.SubString2(2,3)";
Debug.ShouldStop(2);
_lbl1.runMethod(true,"setText",_strmaker.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 228;BA.debugLine="playerTwoToMake = make";
Debug.ShouldStop(8);
func._playertwotomake = func._make;
 BA.debugLineNum = 229;BA.debugLine="p2_progress = (scorePlayerTwo/playerTwoToMake)*10";
Debug.ShouldStop(16);
func._p2_progress = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {func._scoreplayertwo,func._playertwotomake}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0));
 BA.debugLineNum = 230;BA.debugLine="setProgress(p1_progressBar, p1_progress)";
Debug.ShouldStop(32);
_setprogress(func._p1_progressbar,func._p1_progress);
 BA.debugLineNum = 231;BA.debugLine="CallSub2(scorebord, \"playerTwoPerc\", NumberFormat";
Debug.ShouldStop(64);
func.__c.runMethodAndSync(false,"CallSubNew2",func.ba,(Object)((func._scorebord.getObject())),(Object)(BA.ObjectToString("playerTwoPerc")),(Object)((RemoteObject.concat(func.__c.runMethod(true,"NumberFormat2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {func._scoreplayertwo,func._playertwotomake}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(func.__c.getField(true,"False"))),RemoteObject.createImmutable("%")))));
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
func._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 4;BA.debugLine="Private regexStr As StringBuilder";
func._regexstr = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");
 //BA.debugLineNum = 6;BA.debugLine="Public timeLastClick As Long = 0";
func._timelastclick = BA.numberCast(long.class, 0);
 //BA.debugLineNum = 8;BA.debugLine="Public hasInternetAccess As Boolean = False";
func._hasinternetaccess = func.__c.getField(true,"False");
 //BA.debugLineNum = 9;BA.debugLine="Public scorePlayerOne, scorePlayerTwo As Int";
func._scoreplayerone = RemoteObject.createImmutable(0);
func._scoreplayertwo = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 10;BA.debugLine="Public innigs, inngSet, make, playerOneHs = 0, pl";
func._innigs = RemoteObject.createImmutable(0);
func._inngset = RemoteObject.createImmutable(0);
func._make = RemoteObject.createImmutable(0);
func._playeronehs = BA.numberCast(int.class, 0);
func._playertwohs = BA.numberCast(int.class, 0);
func._score = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 11;BA.debugLine="Public playerOneToMake = 0, playerTwoToMake = 0,";
func._playeronetomake = BA.numberCast(int.class, 0);
func._playertwotomake = BA.numberCast(int.class, 0);
func._p1hstemp = BA.numberCast(int.class, 0);
func._p2hstemp = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 12;BA.debugLine="Public lblInnings, lbl_player_one_hs, lbl_player_";
func._lblinnings = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
func._lbl_player_one_hs = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
func._lbl_player_two_hs = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Public p1_1, p1_10, p1_100, p1_1000, p1_moyenne A";
func._p1_1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
func._p1_10 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
func._p1_100 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
func._p1_1000 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
func._p1_moyenne = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Public p2_1, p2_10, p2_100, p2_1000, p2_moyenne A";
func._p2_1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
func._p2_10 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
func._p2_100 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
func._p2_1000 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
func._p2_moyenne = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Public p1_progress, p2_progress As Float";
func._p1_progress = RemoteObject.createImmutable(0f);
func._p2_progress = RemoteObject.createImmutable(0f);
 //BA.debugLineNum = 16;BA.debugLine="Public p1_progressBar, p2_progressBar As B4XProgr";
func._p1_progressbar = RemoteObject.createNew ("b4j.example.b4xprogressbar");
func._p2_progressbar = RemoteObject.createNew ("b4j.example.b4xprogressbar");
 //BA.debugLineNum = 17;BA.debugLine="Dim txtScore As String";
func._txtscore = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _processhs(RemoteObject _player) throws Exception{
try {
		Debug.PushSubsStack("processHs (func) ","func",2,func.ba,func.mostCurrent,234);
if (RapidSub.canDelegate("processhs")) { return b4j.example.func.remoteMe.runUserSub(false, "func","processhs", _player);}
Debug.locals.put("player", _player);
 BA.debugLineNum = 234;BA.debugLine="Sub processHs(player As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 235;BA.debugLine="If player = \"p1\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_player,BA.ObjectToString("p1"))) { 
 BA.debugLineNum = 236;BA.debugLine="If p1HsTemp > 0 And p1HsTemp > playerOneHs Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",func._p1hstemp,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",func._p1hstemp,BA.numberCast(double.class, func._playeronehs))) { 
 BA.debugLineNum = 237;BA.debugLine="playerOneHs = p1HsTemp";
Debug.ShouldStop(4096);
func._playeronehs = func._p1hstemp;
 BA.debugLineNum = 238;BA.debugLine="p1HsTemp = 0";
Debug.ShouldStop(8192);
func._p1hstemp = BA.numberCast(int.class, 0);
 BA.debugLineNum = 239;BA.debugLine="lbl_player_one_hs.Text = padString(playerOneHs,";
Debug.ShouldStop(16384);
func._lbl_player_one_hs.runMethod(true,"setText",_padstring(BA.NumberToString(func._playeronehs),BA.ObjectToString("0"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 3)));
 };
 };
 BA.debugLineNum = 244;BA.debugLine="If player = \"p2\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_player,BA.ObjectToString("p2"))) { 
 BA.debugLineNum = 245;BA.debugLine="If p2HsTemp > 0 And p2HsTemp > playerTwoHs Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",func._p2hstemp,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",func._p2hstemp,BA.numberCast(double.class, func._playertwohs))) { 
 BA.debugLineNum = 246;BA.debugLine="playerTwoHs = p2HsTemp";
Debug.ShouldStop(2097152);
func._playertwohs = func._p2hstemp;
 BA.debugLineNum = 247;BA.debugLine="p2HsTemp = 0";
Debug.ShouldStop(4194304);
func._p2hstemp = BA.numberCast(int.class, 0);
 BA.debugLineNum = 248;BA.debugLine="lbl_player_two_hs.Text = padString(playerTwoHs,";
Debug.ShouldStop(8388608);
func._lbl_player_two_hs.runMethod(true,"setText",_padstring(BA.NumberToString(func._playertwohs),BA.ObjectToString("0"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 3)));
 };
 };
 BA.debugLineNum = 253;BA.debugLine="If player = \"all\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_player,BA.ObjectToString("all"))) { 
 BA.debugLineNum = 254;BA.debugLine="If p1HsTemp > 0 And p1HsTemp > playerOneHs Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",func._p1hstemp,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",func._p1hstemp,BA.numberCast(double.class, func._playeronehs))) { 
 BA.debugLineNum = 255;BA.debugLine="playerOneHs = p1HsTemp";
Debug.ShouldStop(1073741824);
func._playeronehs = func._p1hstemp;
 BA.debugLineNum = 256;BA.debugLine="p1HsTemp = 0";
Debug.ShouldStop(-2147483648);
func._p1hstemp = BA.numberCast(int.class, 0);
 BA.debugLineNum = 257;BA.debugLine="lbl_player_one_hs.Text = padString(playerOneHs,";
Debug.ShouldStop(1);
func._lbl_player_one_hs.runMethod(true,"setText",_padstring(BA.NumberToString(func._playeronehs),BA.ObjectToString("0"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 3)));
 };
 BA.debugLineNum = 262;BA.debugLine="If p2HsTemp > 0 And p2HsTemp > playerTwoHs Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",func._p2hstemp,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",func._p2hstemp,BA.numberCast(double.class, func._playertwohs))) { 
 BA.debugLineNum = 263;BA.debugLine="playerTwoHs = p2HsTemp";
Debug.ShouldStop(64);
func._playertwohs = func._p2hstemp;
 BA.debugLineNum = 264;BA.debugLine="p2HsTemp = 0";
Debug.ShouldStop(128);
func._p2hstemp = BA.numberCast(int.class, 0);
 BA.debugLineNum = 265;BA.debugLine="lbl_player_two_hs.Text = padString(playerTwoHs,";
Debug.ShouldStop(256);
func._lbl_player_two_hs.runMethod(true,"setText",_padstring(BA.NumberToString(func._playertwohs),BA.ObjectToString("0"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 3)));
 };
 };
 BA.debugLineNum = 270;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfont(RemoteObject _lbl,RemoteObject _size) throws Exception{
try {
		Debug.PushSubsStack("setFont (func) ","func",2,func.ba,func.mostCurrent,60);
if (RapidSub.canDelegate("setfont")) { return b4j.example.func.remoteMe.runUserSub(false, "func","setfont", _lbl, _size);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("lbl", _lbl);
Debug.locals.put("size", _size);
 BA.debugLineNum = 60;BA.debugLine="Public Sub setFont(lbl As Label, size As Int)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="Dim jo As JavaObject=lbl";
Debug.ShouldStop(268435456);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(_lbl.getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 62;BA.debugLine="jo.runMethod(\"setFont\",Array(fx.LoadFont(File.Dir";
Debug.ShouldStop(536870912);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setFont")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(func._fx.runMethod(false,"LoadFont",(Object)(func.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("digital-7 (mono).ttf")),(Object)(BA.numberCast(double.class, _size))).getObject())})));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setformcursor(RemoteObject _frm,RemoteObject _imagefile) throws Exception{
try {
		Debug.PushSubsStack("SetFormCursor (func) ","func",2,func.ba,func.mostCurrent,285);
if (RapidSub.canDelegate("setformcursor")) { return b4j.example.func.remoteMe.runUserSub(false, "func","setformcursor", _frm, _imagefile);}
RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
RemoteObject _joimagecursor = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jocursor = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("frm", _frm);
Debug.locals.put("imagefile", _imagefile);
 BA.debugLineNum = 285;BA.debugLine="Sub SetFormCursor(frm As Form, imagefile As String";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 286;BA.debugLine="Dim img As Image";
Debug.ShouldStop(536870912);
_img = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");Debug.locals.put("img", _img);
 BA.debugLineNum = 287;BA.debugLine="img.Initialize(File.DirAssets, imagefile)";
Debug.ShouldStop(1073741824);
_img.runVoidMethod ("Initialize",(Object)(func.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_imagefile));
 BA.debugLineNum = 288;BA.debugLine="Dim joImageCursor As JavaObject";
Debug.ShouldStop(-2147483648);
_joimagecursor = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("joImageCursor", _joimagecursor);
 BA.debugLineNum = 289;BA.debugLine="joImageCursor.InitializeNewInstance(\"javafx.scene";
Debug.ShouldStop(1);
_joimagecursor.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.ImageCursor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_img.getObject())})));
 BA.debugLineNum = 290;BA.debugLine="Dim joCursor As JavaObject = frm.RootPane";
Debug.ShouldStop(2);
_jocursor = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jocursor.setObject(_frm.runMethod(false,"getRootPane").getObject());Debug.locals.put("joCursor", _jocursor);
 BA.debugLineNum = 291;BA.debugLine="joCursor.RunMethod(\"setCursor\", Array(joImageCurs";
Debug.ShouldStop(4);
_jocursor.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setCursor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_joimagecursor.getObject())})));
 BA.debugLineNum = 292;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setnumbercss(RemoteObject _lbl) throws Exception{
try {
		Debug.PushSubsStack("setNumberCss (func) ","func",2,func.ba,func.mostCurrent,321);
if (RapidSub.canDelegate("setnumbercss")) { return b4j.example.func.remoteMe.runUserSub(false, "func","setnumbercss", _lbl);}
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 321;BA.debugLine="Sub setNumberCss(lbl As Label)";
Debug.ShouldStop(1);
 BA.debugLineNum = 322;BA.debugLine="CSSUtils.SetStyleProperty(lbl, \"-fx-background-co";
Debug.ShouldStop(2);
func._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _lbl.getObject()),(Object)(BA.ObjectToString("-fx-background-color")),(Object)(RemoteObject.createImmutable("linear-gradient(to bottom,  #cfe7fa 0%,#6393c1 100%)")));
 BA.debugLineNum = 323;BA.debugLine="CSSUtils.SetStyleProperty(lbl, \"-fx-background-ra";
Debug.ShouldStop(4);
func._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _lbl.getObject()),(Object)(BA.ObjectToString("-fx-background-radius")),(Object)(RemoteObject.createImmutable("3,2,1")));
 BA.debugLineNum = 324;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setp1caromlables(RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("setP1CaromLables (func) ","func",2,func.ba,func.mostCurrent,42);
if (RapidSub.canDelegate("setp1caromlables")) { return b4j.example.func.remoteMe.runUserSub(false, "func","setp1caromlables", _lst);}
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 42;BA.debugLine="Public Sub setP1CaromLables(lst As List)";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="p1_100		= lst.Get(2)";
Debug.ShouldStop(2048);
func._p1_100.setObject(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 45;BA.debugLine="p1_10		= lst.Get(1)";
Debug.ShouldStop(4096);
func._p1_10.setObject(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 46;BA.debugLine="p1_1		= lst.Get(0)";
Debug.ShouldStop(8192);
func._p1_1.setObject(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 47;BA.debugLine="p1_moyenne	= lst.Get(3)";
Debug.ShouldStop(16384);
func._p1_moyenne.setObject(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 48;BA.debugLine="p1_progressBar = lst.Get(4)";
Debug.ShouldStop(32768);
func._p1_progressbar = (_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 4))));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setp2caromlables(RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("setP2CaromLables (func) ","func",2,func.ba,func.mostCurrent,51);
if (RapidSub.canDelegate("setp2caromlables")) { return b4j.example.func.remoteMe.runUserSub(false, "func","setp2caromlables", _lst);}
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 51;BA.debugLine="Public Sub setP2CaromLables(lst As List)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 53;BA.debugLine="p2_100		= lst.Get(2)";
Debug.ShouldStop(1048576);
func._p2_100.setObject(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 54;BA.debugLine="p2_10		= lst.Get(1)";
Debug.ShouldStop(2097152);
func._p2_10.setObject(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 55;BA.debugLine="p2_1		= lst.Get(0)";
Debug.ShouldStop(4194304);
func._p2_1.setObject(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 56;BA.debugLine="p2_moyenne	= lst.Get(3)";
Debug.ShouldStop(8388608);
func._p2_moyenne.setObject(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 57;BA.debugLine="p2_progressBar	= lst.Get(4)";
Debug.ShouldStop(16777216);
func._p2_progressbar = (_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 4))));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprogress(RemoteObject _v,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("setProgress (func) ","func",2,func.ba,func.mostCurrent,310);
if (RapidSub.canDelegate("setprogress")) { return b4j.example.func.remoteMe.runUserSub(false, "func","setprogress", _v, _progress);}
Debug.locals.put("v", _v);
Debug.locals.put("progress", _progress);
 BA.debugLineNum = 310;BA.debugLine="Sub setProgress(v As B4XProgressBar, progress As F";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 312;BA.debugLine="v.Progress = progress";
Debug.ShouldStop(8388608);
_v.runClassMethod (b4j.example.b4xprogressbar.class, "_setprogress" /*RemoteObject*/ ,_progress);
 BA.debugLineNum = 315;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _testnumber(RemoteObject _oldstringtotest,RemoteObject _newstringtotest) throws Exception{
try {
		Debug.PushSubsStack("testNumber (func) ","func",2,func.ba,func.mostCurrent,21);
if (RapidSub.canDelegate("testnumber")) { return b4j.example.func.remoteMe.runUserSub(false, "func","testnumber", _oldstringtotest, _newstringtotest);}
RemoteObject _stringtotest = RemoteObject.createImmutable("");
Debug.locals.put("oldStringToTest", _oldstringtotest);
Debug.locals.put("newStringToTest", _newstringtotest);
 BA.debugLineNum = 21;BA.debugLine="Public Sub testNumber(oldStringToTest As String, n";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Dim stringToTest As String";
Debug.ShouldStop(2097152);
_stringtotest = RemoteObject.createImmutable("");Debug.locals.put("stringToTest", _stringtotest);
 BA.debugLineNum = 24;BA.debugLine="If newStringToTest.Length = 1 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_newstringtotest.runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 25;BA.debugLine="stringToTest = newStringToTest";
Debug.ShouldStop(16777216);
_stringtotest = _newstringtotest;Debug.locals.put("stringToTest", _stringtotest);
 }else {
 BA.debugLineNum = 27;BA.debugLine="stringToTest = 	newStringToTest.Replace(oldStrin";
Debug.ShouldStop(67108864);
_stringtotest = _newstringtotest.runMethod(true,"replace",(Object)(_oldstringtotest),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("stringToTest", _stringtotest);
 };
 BA.debugLineNum = 30;BA.debugLine="regexStr.Initialize";
Debug.ShouldStop(536870912);
func._regexstr.runVoidMethod ("Initialize");
 BA.debugLineNum = 31;BA.debugLine="regexStr.Append(\"[0-9]*\\.[0-9]*|[0-9]*\")";
Debug.ShouldStop(1073741824);
func._regexstr.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("[0-9]*\\.[0-9]*|[0-9]*")));
 BA.debugLineNum = 33;BA.debugLine="If Regex.IsMatch(regexStr.ToString,stringToTest)";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",func.__c.getField(false,"Regex").runMethod(true,"IsMatch",(Object)(func._regexstr.runMethod(true,"ToString")),(Object)(_stringtotest)),func.__c.getField(true,"True"))) { 
 BA.debugLineNum = 34;BA.debugLine="Return newStringToTest";
Debug.ShouldStop(2);
if (true) return _newstringtotest;
 }else {
 BA.debugLineNum = 36;BA.debugLine="Return oldStringToTest";
Debug.ShouldStop(8);
if (true) return _oldstringtotest;
 };
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}