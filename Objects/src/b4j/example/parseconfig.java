package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class parseconfig extends Object{
public static parseconfig mostCurrent = new parseconfig();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.parseconfig", null);
		ba.loadHtSubs(parseconfig.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.parseconfig", ba);
		}
	}
    public static Class<?> getObject() {
		return parseconfig.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static int _timeout = 0;
public static boolean _timeoutactive = false;
public static String _apppath = "";
public static String _cnf = "";
public static anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.main _main = null;
public static b4j.example.scorebord _scorebord = null;
public static b4j.example.func _func = null;
public static b4j.example.funcinet _funcinet = null;
public static b4j.example.httputils2service _httputils2service = null;
public static String  _getapppath() throws Exception{
RDebugUtils.currentModule="parseconfig";
if (Debug.shouldDelegate(ba, "getapppath", false))
	 {return ((String) Debug.delegate(ba, "getapppath", null));}
String _os = "";
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Sub getAppPath As String";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="Dim os As String = DetectOS";
_os = _detectos();
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="Select os";
switch (BA.switchObjectToInt(_os,"windows","linux")) {
case 0: {
RDebugUtils.currentLine=7667717;
 //BA.debugLineNum = 7667717;BA.debugLine="appPath = File.DirApp&\"\\44\\cnf.44\"";
_apppath = anywheresoftware.b4a.keywords.Common.File.getDirApp()+"\\44\\cnf.44";
 break; }
case 1: {
RDebugUtils.currentLine=7667719;
 //BA.debugLineNum = 7667719;BA.debugLine="appPath = File.DirApp&\"/44/cnf.44\"";
_apppath = anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/44/cnf.44";
 break; }
}
;
RDebugUtils.currentLine=7667722;
 //BA.debugLineNum = 7667722;BA.debugLine="Return appPath";
if (true) return _apppath;
RDebugUtils.currentLine=7667723;
 //BA.debugLineNum = 7667723;BA.debugLine="End Sub";
return "";
}
public static String  _parseconfig() throws Exception{
RDebugUtils.currentModule="parseconfig";
if (Debug.shouldDelegate(ba, "parseconfig", false))
	 {return ((String) Debug.delegate(ba, "parseconfig", null));}
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.Map _showpromote = null;
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Sub parseConfig";
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="cnf = File.ReadString(appPath, \"\")";
_cnf = anywheresoftware.b4a.keywords.Common.File.ReadString(_apppath,"");
RDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="parser.Initialize(cnf)";
_parser.Initialize(_cnf);
RDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=7733255;
 //BA.debugLineNum = 7733255;BA.debugLine="Dim showPromote As Map = root.Get(\"showPromote\")";
_showpromote = new anywheresoftware.b4a.objects.collections.Map();
_showpromote.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("showPromote"))));
RDebugUtils.currentLine=7733256;
 //BA.debugLineNum = 7733256;BA.debugLine="If showPromote.Get(\"active\") = \"1\" Then";
if ((_showpromote.Get((Object)("active"))).equals((Object)("1"))) { 
RDebugUtils.currentLine=7733257;
 //BA.debugLineNum = 7733257;BA.debugLine="timeOutActive = True";
_timeoutactive = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=7733259;
 //BA.debugLineNum = 7733259;BA.debugLine="timeOutActive = False";
_timeoutactive = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=7733261;
 //BA.debugLineNum = 7733261;BA.debugLine="timeOut = showPromote.Get(\"timeOut\")";
_timeout = (int)(BA.ObjectToNumber(_showpromote.Get((Object)("timeOut"))));
RDebugUtils.currentLine=7733265;
 //BA.debugLineNum = 7733265;BA.debugLine="End Sub";
return "";
}
public static String  _detectos() throws Exception{
RDebugUtils.currentModule="parseconfig";
if (Debug.shouldDelegate(ba, "detectos", false))
	 {return ((String) Debug.delegate(ba, "detectos", null));}
String _os = "";
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Sub DetectOS As String";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Dim os As String = GetSystemProperty(\"os.name\", \"";
_os = anywheresoftware.b4a.keywords.Common.GetSystemProperty("os.name","").toLowerCase();
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="If os.Contains(\"win\") Then";
if (_os.contains("win")) { 
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="Return \"windows\"";
if (true) return "windows";
 }else 
{RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="Else If os.Contains(\"mac\") Then";
if (_os.contains("mac")) { 
RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="Return \"mac\"";
if (true) return "mac";
 }else {
RDebugUtils.currentLine=7798791;
 //BA.debugLineNum = 7798791;BA.debugLine="Return \"linux\"";
if (true) return "linux";
 }}
;
RDebugUtils.currentLine=7798793;
 //BA.debugLineNum = 7798793;BA.debugLine="End Sub";
return "";
}
}