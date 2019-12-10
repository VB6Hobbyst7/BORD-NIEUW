package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class parseconfig_subs_0 {


public static RemoteObject  _detectos() throws Exception{
try {
		Debug.PushSubsStack("DetectOS (parseconfig) ","parseconfig",8,parseconfig.ba,parseconfig.mostCurrent,46);
if (RapidSub.canDelegate("detectos")) { return b4j.example.parseconfig.remoteMe.runUserSub(false, "parseconfig","detectos");}
RemoteObject _os = RemoteObject.createImmutable("");
 BA.debugLineNum = 46;BA.debugLine="Sub DetectOS As String";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="Dim os As String = GetSystemProperty(\"os.name\", \"";
Debug.ShouldStop(16384);
_os = parseconfig.__c.runMethod(true,"GetSystemProperty",(Object)(BA.ObjectToString("os.name")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"toLowerCase");Debug.locals.put("os", _os);Debug.locals.put("os", _os);
 BA.debugLineNum = 48;BA.debugLine="If os.Contains(\"win\") Then";
Debug.ShouldStop(32768);
if (_os.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("win"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 49;BA.debugLine="Return \"windows\"";
Debug.ShouldStop(65536);
if (true) return BA.ObjectToString("windows");
 }else 
{ BA.debugLineNum = 50;BA.debugLine="Else If os.Contains(\"mac\") Then";
Debug.ShouldStop(131072);
if (_os.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("mac"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 51;BA.debugLine="Return \"mac\"";
Debug.ShouldStop(262144);
if (true) return BA.ObjectToString("mac");
 }else {
 BA.debugLineNum = 53;BA.debugLine="Return \"linux\"";
Debug.ShouldStop(1048576);
if (true) return BA.ObjectToString("linux");
 }}
;
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
public static RemoteObject  _getapppath() throws Exception{
try {
		Debug.PushSubsStack("getAppPath (parseconfig) ","parseconfig",8,parseconfig.ba,parseconfig.mostCurrent,13);
if (RapidSub.canDelegate("getapppath")) { return b4j.example.parseconfig.remoteMe.runUserSub(false, "parseconfig","getapppath");}
RemoteObject _os = RemoteObject.createImmutable("");
 BA.debugLineNum = 13;BA.debugLine="Sub getAppPath As String";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="Dim os As String = DetectOS";
Debug.ShouldStop(8192);
_os = _detectos();Debug.locals.put("os", _os);Debug.locals.put("os", _os);
 BA.debugLineNum = 16;BA.debugLine="Select os";
Debug.ShouldStop(32768);
switch (BA.switchObjectToInt(_os,BA.ObjectToString("windows"),BA.ObjectToString("linux"))) {
case 0: {
 BA.debugLineNum = 18;BA.debugLine="appPath = File.DirApp&\"\\44\\cnf.44\"";
Debug.ShouldStop(131072);
parseconfig._apppath = RemoteObject.concat(parseconfig.__c.getField(false,"File").runMethod(true,"getDirApp"),RemoteObject.createImmutable("\\44\\cnf.44"));
 break; }
case 1: {
 BA.debugLineNum = 20;BA.debugLine="appPath = File.DirApp&\"/44/cnf.44\"";
Debug.ShouldStop(524288);
parseconfig._apppath = RemoteObject.concat(parseconfig.__c.getField(false,"File").runMethod(true,"getDirApp"),RemoteObject.createImmutable("/44/cnf.44"));
 break; }
}
;
 BA.debugLineNum = 23;BA.debugLine="Return appPath";
Debug.ShouldStop(4194304);
if (true) return parseconfig._apppath;
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
public static RemoteObject  _parseconfig() throws Exception{
try {
		Debug.PushSubsStack("parseConfig (parseconfig) ","parseconfig",8,parseconfig.ba,parseconfig.mostCurrent,27);
if (RapidSub.canDelegate("parseconfig")) { return b4j.example.parseconfig.remoteMe.runUserSub(false, "parseconfig","parseconfig");}
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _showpromote = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 27;BA.debugLine="Sub parseConfig";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="cnf = File.ReadString(appPath, \"\")";
Debug.ShouldStop(268435456);
parseconfig._cnf = parseconfig.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parseconfig._apppath),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 31;BA.debugLine="parser.Initialize(cnf)";
Debug.ShouldStop(1073741824);
parseconfig._parser.runVoidMethod ("Initialize",(Object)(parseconfig._cnf));
 BA.debugLineNum = 33;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(1);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = parseconfig._parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 34;BA.debugLine="Dim showPromote As Map = root.Get(\"showPromote\")";
Debug.ShouldStop(2);
_showpromote = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_showpromote.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("showPromote")))));Debug.locals.put("showPromote", _showpromote);
 BA.debugLineNum = 35;BA.debugLine="If showPromote.Get(\"active\") = \"1\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_showpromote.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("active")))),RemoteObject.createImmutable(("1")))) { 
 BA.debugLineNum = 36;BA.debugLine="timeOutActive = True";
Debug.ShouldStop(8);
parseconfig._timeoutactive = parseconfig.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 38;BA.debugLine="timeOutActive = False";
Debug.ShouldStop(32);
parseconfig._timeoutactive = parseconfig.__c.getField(true,"False");
 };
 BA.debugLineNum = 40;BA.debugLine="timeOut = showPromote.Get(\"timeOut\")";
Debug.ShouldStop(128);
parseconfig._timeout = BA.numberCast(int.class, _showpromote.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("timeOut")))));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
parseconfig._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 5;BA.debugLine="Public timeOut As Int";
parseconfig._timeout = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 6;BA.debugLine="Public timeOutActive As Boolean";
parseconfig._timeoutactive = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 7;BA.debugLine="Private appPath As String";
parseconfig._apppath = RemoteObject.createImmutable("");
 //BA.debugLineNum = 8;BA.debugLine="Private cnf As String";
parseconfig._cnf = RemoteObject.createImmutable("");
 //BA.debugLineNum = 9;BA.debugLine="Private parser As JSONParser";
parseconfig._parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}