package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class inactiveclass_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
inactiveclass._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",inactiveclass._fx);
 //BA.debugLineNum = 3;BA.debugLine="Public tmr, tmr_draw_promote As Timer";
inactiveclass._tmr = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_tmr",inactiveclass._tmr);
inactiveclass._tmr_draw_promote = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_tmr_draw_promote",inactiveclass._tmr_draw_promote);
 //BA.debugLineNum = 4;BA.debugLine="Private minute As Long = 60000";
inactiveclass._minute = BA.numberCast(long.class, 60000);__ref.setField("_minute",inactiveclass._minute);
 //BA.debugLineNum = 5;BA.debugLine="Public timeOutPeriode As Int' = 5000 ' 10*minute";
inactiveclass._timeoutperiode = RemoteObject.createImmutable(0);__ref.setField("_timeoutperiode",inactiveclass._timeoutperiode);
 //BA.debugLineNum = 6;BA.debugLine="Public lastClick As Long";
inactiveclass._lastclick = RemoteObject.createImmutable(0L);__ref.setField("_lastclick",inactiveclass._lastclick);
 //BA.debugLineNum = 7;BA.debugLine="Private timeDiff As Long";
inactiveclass._timediff = RemoteObject.createImmutable(0L);__ref.setField("_timediff",inactiveclass._timediff);
 //BA.debugLineNum = 8;BA.debugLine="Public frm As Form";
inactiveclass._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",inactiveclass._frm);
 //BA.debugLineNum = 9;BA.debugLine="Public pn_promote As Pane";
inactiveclass._pn_promote = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_pn_promote",inactiveclass._pn_promote);
 //BA.debugLineNum = 10;BA.debugLine="Private currentX = 10, currentY = 10 As Double";
inactiveclass._currentx = BA.numberCast(double.class, 10);__ref.setField("_currentx",inactiveclass._currentx);
inactiveclass._currenty = BA.numberCast(double.class, 10);__ref.setField("_currenty",inactiveclass._currenty);
 //BA.debugLineNum = 11;BA.debugLine="Public vx = 200, vy = 100 As Double";
inactiveclass._vx = BA.numberCast(double.class, 200);__ref.setField("_vx",inactiveclass._vx);
inactiveclass._vy = BA.numberCast(double.class, 100);__ref.setField("_vy",inactiveclass._vy);
 //BA.debugLineNum = 12;BA.debugLine="Public pnlWidth, pnlHeight As Double";
inactiveclass._pnlwidth = RemoteObject.createImmutable(0);__ref.setField("_pnlwidth",inactiveclass._pnlwidth);
inactiveclass._pnlheight = RemoteObject.createImmutable(0);__ref.setField("_pnlheight",inactiveclass._pnlheight);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _drawpromote_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("drawPromote_Tick (inactiveclass) ","inactiveclass",7,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("drawpromote_tick")) { return __ref.runUserSub(false, "inactiveclass","drawpromote_tick", __ref);}
 BA.debugLineNum = 53;BA.debugLine="Sub drawPromote_Tick()";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="getBounds";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.inactiveclass.class, "_getbounds" /*RemoteObject*/ );
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enablepromote(RemoteObject __ref,RemoteObject _enable) throws Exception{
try {
		Debug.PushSubsStack("enablePromote (inactiveclass) ","inactiveclass",7,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("enablepromote")) { return __ref.runUserSub(false, "inactiveclass","enablepromote", __ref, _enable);}
Debug.locals.put("enable", _enable);
 BA.debugLineNum = 47;BA.debugLine="Sub enablePromote(enable As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="tmr_draw_promote.Enabled = enable";
Debug.ShouldStop(32768);
__ref.getField(false,"_tmr_draw_promote" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enabletime(RemoteObject __ref,RemoteObject _enable) throws Exception{
try {
		Debug.PushSubsStack("enableTime (inactiveclass) ","inactiveclass",7,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("enabletime")) { return __ref.runUserSub(false, "inactiveclass","enabletime", __ref, _enable);}
Debug.locals.put("enable", _enable);
 BA.debugLineNum = 43;BA.debugLine="Sub enableTime(enable As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="tmr.Enabled = enable";
Debug.ShouldStop(2048);
__ref.getField(false,"_tmr" /*RemoteObject*/ ).runMethod(true,"setEnabled",_enable);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbounds(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getBounds (inactiveclass) ","inactiveclass",7,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("getbounds")) { return __ref.runUserSub(false, "inactiveclass","getbounds", __ref);}
 BA.debugLineNum = 57;BA.debugLine="Sub getBounds";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 59;BA.debugLine="Log(currentY)";
Debug.ShouldStop(67108864);
inactiveclass.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(__ref.getField(true,"_currenty" /*RemoteObject*/ ))));
 BA.debugLineNum = 61;BA.debugLine="If (currentX+20) + pnlWidth+20 > frm.Width Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentx" /*RemoteObject*/ ),RemoteObject.createImmutable(20)}, "+",1, 0)),__ref.getField(true,"_pnlwidth" /*RemoteObject*/ ),RemoteObject.createImmutable(20)}, "++",2, 0),__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"getWidth"))) { 
 BA.debugLineNum = 62;BA.debugLine="vx = -Abs(vx)";
Debug.ShouldStop(536870912);
__ref.setField ("_vx" /*RemoteObject*/ ,BA.numberCast(double.class, -inactiveclass.__c.runMethod(true,"Abs",(Object)(__ref.getField(true,"_vx" /*RemoteObject*/ ))).<Double>get().doubleValue()));
 }else 
{ BA.debugLineNum = 63;BA.debugLine="Else If currentX < 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_currentx" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 64;BA.debugLine="vx = Abs(vx)";
Debug.ShouldStop(-2147483648);
__ref.setField ("_vx" /*RemoteObject*/ ,inactiveclass.__c.runMethod(true,"Abs",(Object)(__ref.getField(true,"_vx" /*RemoteObject*/ ))));
 }}
;
 BA.debugLineNum = 67;BA.debugLine="If (currentY+50) + pnlHeight > frm.Height Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currenty" /*RemoteObject*/ ),RemoteObject.createImmutable(50)}, "+",1, 0)),__ref.getField(true,"_pnlheight" /*RemoteObject*/ )}, "+",1, 0),__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"getHeight"))) { 
 BA.debugLineNum = 68;BA.debugLine="vy = -Abs(vy)";
Debug.ShouldStop(8);
__ref.setField ("_vy" /*RemoteObject*/ ,BA.numberCast(double.class, -inactiveclass.__c.runMethod(true,"Abs",(Object)(__ref.getField(true,"_vy" /*RemoteObject*/ ))).<Double>get().doubleValue()));
 }else 
{ BA.debugLineNum = 69;BA.debugLine="Else If currentY < 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_currenty" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 70;BA.debugLine="vy = Abs(vy)";
Debug.ShouldStop(32);
__ref.setField ("_vy" /*RemoteObject*/ ,inactiveclass.__c.runMethod(true,"Abs",(Object)(__ref.getField(true,"_vy" /*RemoteObject*/ ))));
 }}
;
 BA.debugLineNum = 73;BA.debugLine="currentX = currentX + vx";
Debug.ShouldStop(256);
__ref.setField ("_currentx" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentx" /*RemoteObject*/ ),__ref.getField(true,"_vx" /*RemoteObject*/ )}, "+",1, 0));
 BA.debugLineNum = 74;BA.debugLine="currentY = currentY + vy";
Debug.ShouldStop(512);
__ref.setField ("_currenty" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currenty" /*RemoteObject*/ ),__ref.getField(true,"_vy" /*RemoteObject*/ )}, "+",1, 0));
 BA.debugLineNum = 76;BA.debugLine="CallSubDelayed3(scorebord, \"drawPromote\", current";
Debug.ShouldStop(2048);
inactiveclass.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)((inactiveclass._scorebord.getObject())),(Object)(BA.ObjectToString("drawPromote")),(Object)((__ref.getField(true,"_currentx" /*RemoteObject*/ ))),(Object)((__ref.getField(true,"_currenty" /*RemoteObject*/ ))));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (inactiveclass) ","inactiveclass",7,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "inactiveclass","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="timeOutPeriode = (parseConfig.timeOut*(60*1000))";
Debug.ShouldStop(65536);
__ref.setField ("_timeoutperiode" /*RemoteObject*/ ,(RemoteObject.solve(new RemoteObject[] {inactiveclass._parseconfig._timeout /*RemoteObject*/ ,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(60),RemoteObject.createImmutable(1000)}, "*",0, 1))}, "*",0, 1)));
 BA.debugLineNum = 19;BA.debugLine="tmr.Initialize(\"timeOut\", timeOutPeriode)";
Debug.ShouldStop(262144);
__ref.getField(false,"_tmr" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("timeOut")),(Object)(BA.numberCast(long.class, __ref.getField(true,"_timeoutperiode" /*RemoteObject*/ ))));
 BA.debugLineNum = 20;BA.debugLine="tmr.Enabled = parseConfig.timeOutActive";
Debug.ShouldStop(524288);
__ref.getField(false,"_tmr" /*RemoteObject*/ ).runMethod(true,"setEnabled",inactiveclass._parseconfig._timeoutactive /*RemoteObject*/ );
 BA.debugLineNum = 21;BA.debugLine="tmr_draw_promote.Initialize(\"drawPromote\", 5000)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_tmr_draw_promote" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("drawPromote")),(Object)(BA.numberCast(long.class, 5000)));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timeout_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("timeOut_Tick (inactiveclass) ","inactiveclass",7,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("timeout_tick")) { return __ref.runUserSub(false, "inactiveclass","timeout_tick", __ref);}
 BA.debugLineNum = 27;BA.debugLine="Sub timeOut_Tick()";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="timeDiff = DateTime.Now - lastClick";
Debug.ShouldStop(134217728);
__ref.setField ("_timediff" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {inactiveclass.__c.getField(false,"DateTime").runMethod(true,"getNow"),__ref.getField(true,"_lastclick" /*RemoteObject*/ )}, "-",1, 2));
 BA.debugLineNum = 29;BA.debugLine="If timeDiff > timeOutPeriode Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_timediff" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_timeoutperiode" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 30;BA.debugLine="enableTime(False)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.inactiveclass.class, "_enabletime" /*RemoteObject*/ ,(Object)(inactiveclass.__c.getField(true,"False")));
 BA.debugLineNum = 31;BA.debugLine="CallSubDelayed(scorebord, \"showPromote\")";
Debug.ShouldStop(1073741824);
inactiveclass.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)((inactiveclass._scorebord.getObject())),(Object)(RemoteObject.createImmutable("showPromote")));
 BA.debugLineNum = 32;BA.debugLine="Log($\"TIMEOUT DETECTED\"$)";
Debug.ShouldStop(-2147483648);
inactiveclass.__c.runVoidMethod ("Log",(Object)((RemoteObject.createImmutable("TIMEOUT DETECTED"))));
 BA.debugLineNum = 33;BA.debugLine="vx = 50";
Debug.ShouldStop(1);
__ref.setField ("_vx" /*RemoteObject*/ ,BA.numberCast(double.class, 50));
 BA.debugLineNum = 34;BA.debugLine="vy = 50";
Debug.ShouldStop(2);
__ref.setField ("_vy" /*RemoteObject*/ ,BA.numberCast(double.class, 50));
 BA.debugLineNum = 35;BA.debugLine="enablePromote(True)";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.inactiveclass.class, "_enablepromote" /*RemoteObject*/ ,(Object)(inactiveclass.__c.getField(true,"True")));
 BA.debugLineNum = 36;BA.debugLine="CallSub2(scorebord, \"setPromoteRunning\", True)";
Debug.ShouldStop(8);
inactiveclass.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)((inactiveclass._scorebord.getObject())),(Object)(BA.ObjectToString("setPromoteRunning")),(Object)((inactiveclass.__c.getField(true,"True"))));
 };
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatepromote(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("updatePromote (inactiveclass) ","inactiveclass",7,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("updatepromote")) { return __ref.runUserSub(false, "inactiveclass","updatepromote", __ref);}
 BA.debugLineNum = 80;BA.debugLine="Sub updatePromote";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="timeOutPeriode = (parseConfig.timeOut*(60*1000))";
Debug.ShouldStop(65536);
__ref.setField ("_timeoutperiode" /*RemoteObject*/ ,(RemoteObject.solve(new RemoteObject[] {inactiveclass._parseconfig._timeout /*RemoteObject*/ ,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(60),RemoteObject.createImmutable(1000)}, "*",0, 1))}, "*",0, 1)));
 BA.debugLineNum = 82;BA.debugLine="Log($\"INTERVAL =  ${timeOutPeriode}\"$)";
Debug.ShouldStop(131072);
inactiveclass.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("INTERVAL =  "),inactiveclass.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_timeoutperiode" /*RemoteObject*/ )))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 83;BA.debugLine="tmr.Enabled = False";
Debug.ShouldStop(262144);
__ref.getField(false,"_tmr" /*RemoteObject*/ ).runMethod(true,"setEnabled",inactiveclass.__c.getField(true,"False"));
 BA.debugLineNum = 84;BA.debugLine="tmr.Interval = timeOutPeriode";
Debug.ShouldStop(524288);
__ref.getField(false,"_tmr" /*RemoteObject*/ ).runMethod(true,"setInterval",BA.numberCast(long.class, __ref.getField(true,"_timeoutperiode" /*RemoteObject*/ )));
 BA.debugLineNum = 85;BA.debugLine="tmr.Enabled = True";
Debug.ShouldStop(1048576);
__ref.getField(false,"_tmr" /*RemoteObject*/ ).runMethod(true,"setEnabled",inactiveclass.__c.getField(true,"True"));
 BA.debugLineNum = 86;BA.debugLine="Log($\"INTERVAL =  ${tmr.Interval}\"$)";
Debug.ShouldStop(2097152);
inactiveclass.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("INTERVAL =  "),inactiveclass.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_tmr" /*RemoteObject*/ ).runMethod(true,"getInterval")))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}