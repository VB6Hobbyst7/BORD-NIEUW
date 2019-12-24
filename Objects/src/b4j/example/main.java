package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 1920, 1080);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4j.example.dateutils._process_globals();
b4j.example.cssutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.scorebord _scorebord = null;
public static b4j.example.nieuwe_partij _nieuwe_partij = null;
public static b4j.example.func _func = null;
public static b4j.example.parseconfig _parseconfig = null;
public static b4j.example.funcinet _funcinet = null;
public static b4j.example.getnode _getnode = null;
public static b4j.example.httputils2service _httputils2service = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "application_error", false))
	 {return ((Boolean) Debug.delegate(ba, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="End Sub";
return false;
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args}));}
String _apppath = "";
String _os = "";
String _appfolder = "";
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="Dim appPath As String = parseConfig.getAppPath";
_apppath = _parseconfig._getapppath /*String*/ ();
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="Dim os As String = parseConfig.DetectOS";
_os = _parseconfig._detectos /*String*/ ();
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="Dim appFolder As String";
_appfolder = "";
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="Select os";
switch (BA.switchObjectToInt(_os,"windows","linux")) {
case 0: {
RDebugUtils.currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="appFolder = File.DirApp'&\"\\44\\\"";
_appfolder = anywheresoftware.b4a.keywords.Common.File.getDirApp();
 break; }
case 1: {
RDebugUtils.currentLine=65546;
 //BA.debugLineNum = 65546;BA.debugLine="appFolder = File.DirApp'&\"/44/\"";
_appfolder = anywheresoftware.b4a.keywords.Common.File.getDirApp();
 break; }
}
;
RDebugUtils.currentLine=65550;
 //BA.debugLineNum = 65550;BA.debugLine="Log(\"APPFOLDER \" & File.DirApp)";
anywheresoftware.b4a.keywords.Common.Log("APPFOLDER "+anywheresoftware.b4a.keywords.Common.File.getDirApp());
RDebugUtils.currentLine=65551;
 //BA.debugLineNum = 65551;BA.debugLine="If File.Exists(appPath, \"cnf.44\") = False Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_apppath,"cnf.44")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=65552;
 //BA.debugLineNum = 65552;BA.debugLine="Log(\"APPFOLDER \" & File.DirApp)";
anywheresoftware.b4a.keywords.Common.Log("APPFOLDER "+anywheresoftware.b4a.keywords.Common.File.getDirApp());
RDebugUtils.currentLine=65553;
 //BA.debugLineNum = 65553;BA.debugLine="File.Copy(File.DirAssets, \"cnf.44\", appPath, \"\")";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"cnf.44",_apppath,"");
 };
RDebugUtils.currentLine=65555;
 //BA.debugLineNum = 65555;BA.debugLine="If File.IsDirectory(appFolder, \"media\") = False T";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_appfolder,"media")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=65556;
 //BA.debugLineNum = 65556;BA.debugLine="File.MakeDir(appFolder, \"media\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir(_appfolder,"media");
 };
RDebugUtils.currentLine=65559;
 //BA.debugLineNum = 65559;BA.debugLine="Log(\"APPFOLDER \" & File.DirApp)";
anywheresoftware.b4a.keywords.Common.Log("APPFOLDER "+anywheresoftware.b4a.keywords.Common.File.getDirApp());
RDebugUtils.currentLine=65560;
 //BA.debugLineNum = 65560;BA.debugLine="MainForm = Form1";
_mainform = _form1;
RDebugUtils.currentLine=65564;
 //BA.debugLineNum = 65564;BA.debugLine="scorebord.Show";
_scorebord._show /*void*/ ();
RDebugUtils.currentLine=65565;
 //BA.debugLineNum = 65565;BA.debugLine="MainForm.Close";
_mainform.Close();
RDebugUtils.currentLine=65566;
 //BA.debugLineNum = 65566;BA.debugLine="End Sub";
return "";
}
}