package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (main) ","main",0,main.ba,main.mostCurrent,28);
if (RapidSub.canDelegate("application_error")) { return b4j.example.main.remoteMe.runUserSub(false, "main","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 28;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Return True";
Debug.ShouldStop(268435456);
if (true) return main.__c.getField(true,"True");
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,11);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
RemoteObject _apppath = RemoteObject.createImmutable("");
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 11;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 13;BA.debugLine="Dim appPath As String = parseConfig.getAppPath";
Debug.ShouldStop(4096);
_apppath = main._parseconfig.runMethod(true,"_getapppath" /*RemoteObject*/ );Debug.locals.put("appPath", _apppath);Debug.locals.put("appPath", _apppath);
 BA.debugLineNum = 15;BA.debugLine="If File.Exists(appPath, \"\") = False Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_apppath),(Object)(RemoteObject.createImmutable(""))),main.__c.getField(true,"False"))) { 
 BA.debugLineNum = 16;BA.debugLine="File.Copy(File.DirAssets, \"cnf.44\", appPath, \"\")";
Debug.ShouldStop(32768);
main.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("cnf.44")),(Object)(_apppath),(Object)(RemoteObject.createImmutable("")));
 };
 BA.debugLineNum = 19;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(262144);
main._mainform = _form1;
 BA.debugLineNum = 23;BA.debugLine="scorebord.Show";
Debug.ShouldStop(4194304);
main._scorebord.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 24;BA.debugLine="MainForm.Close";
Debug.ShouldStop(8388608);
main._mainform.runVoidMethod ("Close");
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
scorebord_subs_0._process_globals();
func_subs_0._process_globals();
funcinet_subs_0._process_globals();
parseconfig_subs_0._process_globals();
httputils2service_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
scorebord.myClass = BA.getDeviceClass ("b4j.example.scorebord");
func.myClass = BA.getDeviceClass ("b4j.example.func");
b4xprogressbar.myClass = BA.getDeviceClass ("b4j.example.b4xprogressbar");
classcheckconfig.myClass = BA.getDeviceClass ("b4j.example.classcheckconfig");
clxtoastmessage.myClass = BA.getDeviceClass ("b4j.example.clxtoastmessage");
funcinet.myClass = BA.getDeviceClass ("b4j.example.funcinet");
inactiveclass.myClass = BA.getDeviceClass ("b4j.example.inactiveclass");
parseconfig.myClass = BA.getDeviceClass ("b4j.example.parseconfig");
timerclass.myClass = BA.getDeviceClass ("b4j.example.timerclass");
httputils2service.myClass = BA.getDeviceClass ("b4j.example.httputils2service");
httpjob.myClass = BA.getDeviceClass ("b4j.example.httpjob");
animatedcounter.myClass = BA.getDeviceClass ("b4j.example.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("b4j.example.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("b4j.example.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("b4j.example.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("b4j.example.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("b4j.example.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("b4j.example.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("b4j.example.b4xfloattextfield");
b4xinputtemplate.myClass = BA.getDeviceClass ("b4j.example.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("b4j.example.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("b4j.example.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("b4j.example.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("b4j.example.b4xplusminus");
b4xsearchtemplate.myClass = BA.getDeviceClass ("b4j.example.b4xsearchtemplate");
b4xseekbar.myClass = BA.getDeviceClass ("b4j.example.b4xseekbar");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("b4j.example.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("b4j.example.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("b4j.example.b4xtimedtemplate");
b4xformatter.myClass = BA.getDeviceClass ("b4j.example.b4xformatter");
roundslider.myClass = BA.getDeviceClass ("b4j.example.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("b4j.example.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("b4j.example.swiftbutton");
b4jtextflow.myClass = BA.getDeviceClass ("b4j.example.b4jtextflow");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}