package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class timerclass_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
timerclass._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",timerclass._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private tmr As Timer";
timerclass._tmr = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_tmr",timerclass._tmr);
 //BA.debugLineNum = 5;BA.debugLine="Private lbl As Label";
timerclass._lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbl",timerclass._lbl);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _label) throws Exception{
try {
		Debug.PushSubsStack("Initialize (timerclass) ","timerclass",9,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "timerclass","initialize", __ref, _ba, _label);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("label", _label);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(label As Label)";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="tmr.Initialize(\"tmr\", 1000*60)";
Debug.ShouldStop(512);
__ref.getField(false,"_tmr" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("tmr")),(Object)(BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1000),RemoteObject.createImmutable(60)}, "*",0, 1))));
 BA.debugLineNum = 11;BA.debugLine="tmr.Enabled = True";
Debug.ShouldStop(1024);
__ref.getField(false,"_tmr" /*RemoteObject*/ ).runMethod(true,"setEnabled",timerclass.__c.getField(true,"True"));
 BA.debugLineNum = 12;BA.debugLine="lbl = label";
Debug.ShouldStop(2048);
__ref.setField ("_lbl" /*RemoteObject*/ ,_label);
 BA.debugLineNum = 13;BA.debugLine="tmr_Tick";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.example.timerclass.class, "_tmr_tick" /*RemoteObject*/ );
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tmr_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("tmr_Tick (timerclass) ","timerclass",9,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("tmr_tick")) { return __ref.runUserSub(false, "timerclass","tmr_tick", __ref);}
RemoteObject _time = RemoteObject.createImmutable("");
 BA.debugLineNum = 16;BA.debugLine="Private Sub tmr_Tick";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="Dim time As String";
Debug.ShouldStop(65536);
_time = RemoteObject.createImmutable("");Debug.locals.put("time", _time);
 BA.debugLineNum = 18;BA.debugLine="DateTime.DateFormat=\"EEEE, dd MMMM yyyy HH:mm\"";
Debug.ShouldStop(131072);
timerclass.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("EEEE, dd MMMM yyyy HH:mm"));
 BA.debugLineNum = 19;BA.debugLine="time = \"     \" & DateTime.Date(DateTime.Now) 'fun";
Debug.ShouldStop(262144);
_time = RemoteObject.concat(RemoteObject.createImmutable("     "),timerclass.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(timerclass.__c.getField(false,"DateTime").runMethod(true,"getNow"))));Debug.locals.put("time", _time);
 BA.debugLineNum = 20;BA.debugLine="lbl.Text = time";
Debug.ShouldStop(524288);
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runMethod(true,"setText",_time);
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}