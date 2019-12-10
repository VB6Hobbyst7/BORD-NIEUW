package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class classcheckconfig_subs_0 {


public static RemoteObject  _chkconfig_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("chkConfig_Tick (classcheckconfig) ","classcheckconfig",4,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("chkconfig_tick")) { return __ref.runUserSub(false, "classcheckconfig","chkconfig_tick", __ref);}
 BA.debugLineNum = 20;BA.debugLine="Sub chkConfig_Tick";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="cfgCurrTimeStamp = File.LastModified(appPath, \"\")";
Debug.ShouldStop(1048576);
__ref.setField ("_cfgcurrtimestamp" /*RemoteObject*/ ,classcheckconfig.__c.getField(false,"File").runMethod(true,"LastModified",(Object)(__ref.getField(true,"_apppath" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 23;BA.debugLine="If cfgCurrTimeStamp <> cfgTimeStamp Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_cfgcurrtimestamp" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_cfgtimestamp" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 24;BA.debugLine="parseConfig.parseConfig";
Debug.ShouldStop(8388608);
classcheckconfig._parseconfig.runVoidMethod ("_parseconfig" /*RemoteObject*/ );
 BA.debugLineNum = 25;BA.debugLine="Log(\"CHANGE\")";
Debug.ShouldStop(16777216);
classcheckconfig.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("CHANGE")));
 BA.debugLineNum = 26;BA.debugLine="cfgTimeStamp = cfgCurrTimeStamp";
Debug.ShouldStop(33554432);
__ref.setField ("_cfgtimestamp" /*RemoteObject*/ ,__ref.getField(true,"_cfgcurrtimestamp" /*RemoteObject*/ ));
 BA.debugLineNum = 27;BA.debugLine="CallSub(scorebord, \"updateCfg\")";
Debug.ShouldStop(67108864);
classcheckconfig.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((classcheckconfig._scorebord.getObject())),(Object)(RemoteObject.createImmutable("updateCfg")));
 };
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
classcheckconfig._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",classcheckconfig._fx);
 //BA.debugLineNum = 3;BA.debugLine="Dim tmr As Timer";
classcheckconfig._tmr = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_tmr",classcheckconfig._tmr);
 //BA.debugLineNum = 4;BA.debugLine="Dim appPath As String";
classcheckconfig._apppath = RemoteObject.createImmutable("");__ref.setField("_apppath",classcheckconfig._apppath);
 //BA.debugLineNum = 5;BA.debugLine="Dim cfgTimeStamp, cfgCurrTimeStamp As Long";
classcheckconfig._cfgtimestamp = RemoteObject.createImmutable(0L);__ref.setField("_cfgtimestamp",classcheckconfig._cfgtimestamp);
classcheckconfig._cfgcurrtimestamp = RemoteObject.createImmutable(0L);__ref.setField("_cfgcurrtimestamp",classcheckconfig._cfgcurrtimestamp);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (classcheckconfig) ","classcheckconfig",4,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "classcheckconfig","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="appPath = parseConfig.getAppPath";
Debug.ShouldStop(512);
__ref.setField ("_apppath" /*RemoteObject*/ ,classcheckconfig._parseconfig.runMethod(true,"_getapppath" /*RemoteObject*/ ));
 BA.debugLineNum = 11;BA.debugLine="cfgTimeStamp = File.LastModified(appPath, \"\")";
Debug.ShouldStop(1024);
__ref.setField ("_cfgtimestamp" /*RemoteObject*/ ,classcheckconfig.__c.getField(false,"File").runMethod(true,"LastModified",(Object)(__ref.getField(true,"_apppath" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 13;BA.debugLine="Log($\"${DateTime.Date(cfgTimeStamp)}\"$)";
Debug.ShouldStop(4096);
classcheckconfig.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),classcheckconfig.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((classcheckconfig.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(true,"_cfgtimestamp" /*RemoteObject*/ )))))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 15;BA.debugLine="tmr.Initialize(\"chkConfig\", 5000)";
Debug.ShouldStop(16384);
__ref.getField(false,"_tmr" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("chkConfig")),(Object)(BA.numberCast(long.class, 5000)));
 BA.debugLineNum = 16;BA.debugLine="tmr.Enabled = True";
Debug.ShouldStop(32768);
__ref.getField(false,"_tmr" /*RemoteObject*/ ).runMethod(true,"setEnabled",classcheckconfig.__c.getField(true,"True"));
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}