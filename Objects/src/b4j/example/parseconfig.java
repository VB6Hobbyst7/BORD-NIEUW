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
public static boolean _usedigitalfont = false;
public static String _apppath = "";
public static String _cnf = "";
public static anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.main _main = null;
public static b4j.example.scorebord _scorebord = null;
public static b4j.example.nieuwe_partij _nieuwe_partij = null;
public static b4j.example.func _func = null;
public static b4j.example.funcinet _funcinet = null;
public static b4j.example.getnode _getnode = null;
public static b4j.example.httputils2service _httputils2service = null;
public static String  _getapppath() throws Exception{
RDebugUtils.currentModule="parseconfig";
if (Debug.shouldDelegate(ba, "getapppath", false))
	 {return ((String) Debug.delegate(ba, "getapppath", null));}
String _os = "";
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Sub getAppPath As String";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="Dim os As String = DetectOS";
_os = _detectos();
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="Select os";
switch (BA.switchObjectToInt(_os,"windows","linux")) {
case 0: {
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="appPath = File.DirApp&\"\\44\"'cnf.44\"";
_apppath = anywheresoftware.b4a.keywords.Common.File.getDirApp()+"\\44";
 break; }
case 1: {
RDebugUtils.currentLine=7208967;
 //BA.debugLineNum = 7208967;BA.debugLine="appPath = File.DirApp&\"/44/\"'cnf.44\"";
_apppath = anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/44/";
 break; }
}
;
RDebugUtils.currentLine=7208970;
 //BA.debugLineNum = 7208970;BA.debugLine="Return appPath";
if (true) return _apppath;
RDebugUtils.currentLine=7208971;
 //BA.debugLineNum = 7208971;BA.debugLine="End Sub";
return "";
}
public static String  _detectos() throws Exception{
RDebugUtils.currentModule="parseconfig";
if (Debug.shouldDelegate(ba, "detectos", false))
	 {return ((String) Debug.delegate(ba, "detectos", null));}
String _os = "";
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Sub DetectOS As String";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Dim os As String = GetSystemProperty(\"os.name\", \"";
_os = anywheresoftware.b4a.keywords.Common.GetSystemProperty("os.name","").toLowerCase();
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="If os.Contains(\"win\") Then";
if (_os.contains("win")) { 
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="Return \"windows\"";
if (true) return "windows";
 }else 
{RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="Else If os.Contains(\"mac\") Then";
if (_os.contains("mac")) { 
RDebugUtils.currentLine=7340037;
 //BA.debugLineNum = 7340037;BA.debugLine="Return \"mac\"";
if (true) return "mac";
 }else {
RDebugUtils.currentLine=7340039;
 //BA.debugLineNum = 7340039;BA.debugLine="Return \"linux\"";
if (true) return "linux";
 }}
;
RDebugUtils.currentLine=7340041;
 //BA.debugLineNum = 7340041;BA.debugLine="End Sub";
return "";
}
public static String  _pullconfig() throws Exception{
RDebugUtils.currentModule="parseconfig";
if (Debug.shouldDelegate(ba, "pullconfig", false))
	 {return ((String) Debug.delegate(ba, "pullconfig", null));}
anywheresoftware.b4a.objects.collections.List _msglist = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.Map _fontcolor = null;
String _coloryellow = "";
anywheresoftware.b4a.objects.collections.Map _message = null;
String _line_1 = "";
String _line_2 = "";
String _line_5 = "";
String _line_3 = "";
String _line_4 = "";
anywheresoftware.b4a.objects.collections.Map _sponsor = null;
String _sponsoractive = "";
anywheresoftware.b4a.objects.collections.Map _showpromote = null;
anywheresoftware.b4a.objects.collections.Map _digitalfont = null;
String _digitalactive = "";
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Sub pullConfig";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="Dim msgList As List";
_msglist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="useDigitalFont = False";
_usedigitalfont = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="cnf = File.ReadString(appPath, \"cnf.44\")";
_cnf = anywheresoftware.b4a.keywords.Common.File.ReadString(_apppath,"cnf.44");
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="parser.Initialize(cnf)";
_parser.Initialize(_cnf);
RDebugUtils.currentLine=7274503;
 //BA.debugLineNum = 7274503;BA.debugLine="msgList.Initialize";
_msglist.Initialize();
RDebugUtils.currentLine=7274506;
 //BA.debugLineNum = 7274506;BA.debugLine="Dim root As Map' = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7274507;
 //BA.debugLineNum = 7274507;BA.debugLine="root.Initialize";
_root.Initialize();
RDebugUtils.currentLine=7274508;
 //BA.debugLineNum = 7274508;BA.debugLine="root= parser.NextObject";
_root = _parser.NextObject();
RDebugUtils.currentLine=7274509;
 //BA.debugLineNum = 7274509;BA.debugLine="Dim fontColor As Map = root.Get(\"fontColor\")";
_fontcolor = new anywheresoftware.b4a.objects.collections.Map();
_fontcolor.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("fontColor"))));
RDebugUtils.currentLine=7274510;
 //BA.debugLineNum = 7274510;BA.debugLine="Dim colorYellow As String = fontColor.Get(\"colorY";
_coloryellow = BA.ObjectToString(_fontcolor.Get((Object)("colorYellow")));
RDebugUtils.currentLine=7274513;
 //BA.debugLineNum = 7274513;BA.debugLine="Dim message As Map = root.Get(\"message\")";
_message = new anywheresoftware.b4a.objects.collections.Map();
_message.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("message"))));
RDebugUtils.currentLine=7274514;
 //BA.debugLineNum = 7274514;BA.debugLine="Dim line_1 As String = message.Get(\"line_1\")";
_line_1 = BA.ObjectToString(_message.Get((Object)("line_1")));
RDebugUtils.currentLine=7274515;
 //BA.debugLineNum = 7274515;BA.debugLine="Dim line_2 As String = message.Get(\"line_2\")";
_line_2 = BA.ObjectToString(_message.Get((Object)("line_2")));
RDebugUtils.currentLine=7274516;
 //BA.debugLineNum = 7274516;BA.debugLine="Dim line_5 As String = message.Get(\"line_5\")";
_line_5 = BA.ObjectToString(_message.Get((Object)("line_5")));
RDebugUtils.currentLine=7274517;
 //BA.debugLineNum = 7274517;BA.debugLine="Dim line_3 As String = message.Get(\"line_3\")";
_line_3 = BA.ObjectToString(_message.Get((Object)("line_3")));
RDebugUtils.currentLine=7274518;
 //BA.debugLineNum = 7274518;BA.debugLine="Dim line_4 As String = message.Get(\"line_4\")";
_line_4 = BA.ObjectToString(_message.Get((Object)("line_4")));
RDebugUtils.currentLine=7274519;
 //BA.debugLineNum = 7274519;BA.debugLine="Dim fontColor As Map = root.Get(\"fontColor\")";
_fontcolor = new anywheresoftware.b4a.objects.collections.Map();
_fontcolor.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("fontColor"))));
RDebugUtils.currentLine=7274521;
 //BA.debugLineNum = 7274521;BA.debugLine="Dim sponsor As Map = root.Get(\"reclame\")";
_sponsor = new anywheresoftware.b4a.objects.collections.Map();
_sponsor.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("reclame"))));
RDebugUtils.currentLine=7274522;
 //BA.debugLineNum = 7274522;BA.debugLine="Dim sponsorActive As String = sponsor.Get(\"active";
_sponsoractive = BA.ObjectToString(_sponsor.Get((Object)("active")));
RDebugUtils.currentLine=7274524;
 //BA.debugLineNum = 7274524;BA.debugLine="Dim showPromote As Map = root.Get(\"showPromote\")";
_showpromote = new anywheresoftware.b4a.objects.collections.Map();
_showpromote.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("showPromote"))));
RDebugUtils.currentLine=7274525;
 //BA.debugLineNum = 7274525;BA.debugLine="If showPromote.Get(\"active\") = \"1\" Then";
if ((_showpromote.Get((Object)("active"))).equals((Object)("1"))) { 
RDebugUtils.currentLine=7274526;
 //BA.debugLineNum = 7274526;BA.debugLine="timeOutActive = True";
_timeoutactive = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=7274528;
 //BA.debugLineNum = 7274528;BA.debugLine="timeOutActive = False";
_timeoutactive = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=7274530;
 //BA.debugLineNum = 7274530;BA.debugLine="timeOut = showPromote.Get(\"timeOut\")";
_timeout = (int)(BA.ObjectToNumber(_showpromote.Get((Object)("timeOut"))));
RDebugUtils.currentLine=7274532;
 //BA.debugLineNum = 7274532;BA.debugLine="Dim digitalFont As Map = root.Get(\"digitalFont\")";
_digitalfont = new anywheresoftware.b4a.objects.collections.Map();
_digitalfont.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("digitalFont"))));
RDebugUtils.currentLine=7274533;
 //BA.debugLineNum = 7274533;BA.debugLine="Dim digitalActive As String = digitalFont.Get(\"ac";
_digitalactive = BA.ObjectToString(_digitalfont.Get((Object)("active")));
RDebugUtils.currentLine=7274535;
 //BA.debugLineNum = 7274535;BA.debugLine="If digitalActive  = \"1\" Then";
if ((_digitalactive).equals("1")) { 
RDebugUtils.currentLine=7274536;
 //BA.debugLineNum = 7274536;BA.debugLine="useDigitalFont = True";
_usedigitalfont = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=7274537;
 //BA.debugLineNum = 7274537;BA.debugLine="CallSub2(scorebord, \"useDigitalFont\", True)";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"useDigitalFont",(Object)(anywheresoftware.b4a.keywords.Common.True));
 }else {
RDebugUtils.currentLine=7274539;
 //BA.debugLineNum = 7274539;BA.debugLine="CallSub2(scorebord, \"useDigitalFont\", False)";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"useDigitalFont",(Object)(anywheresoftware.b4a.keywords.Common.False));
 };
RDebugUtils.currentLine=7274542;
 //BA.debugLineNum = 7274542;BA.debugLine="If colorYellow = \"1\"  Then";
if ((_coloryellow).equals("1")) { 
RDebugUtils.currentLine=7274543;
 //BA.debugLineNum = 7274543;BA.debugLine="CallSub2(scorebord, \"useFontYellow\", True)";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"useFontYellow",(Object)(anywheresoftware.b4a.keywords.Common.True));
 }else {
RDebugUtils.currentLine=7274545;
 //BA.debugLineNum = 7274545;BA.debugLine="CallSub2(scorebord, \"useFontYellow\", False)";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"useFontYellow",(Object)(anywheresoftware.b4a.keywords.Common.False));
 };
RDebugUtils.currentLine=7274548;
 //BA.debugLineNum = 7274548;BA.debugLine="msgList.AddAll(Array As String(line_1, line_2, li";
_msglist.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_line_1,_line_2,_line_3,_line_4,_line_5}));
RDebugUtils.currentLine=7274549;
 //BA.debugLineNum = 7274549;BA.debugLine="CallSub2(scorebord, \"setMessage\", msgList)";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"setMessage",(Object)(_msglist));
RDebugUtils.currentLine=7274551;
 //BA.debugLineNum = 7274551;BA.debugLine="If sponsorActive = \"1\" Then";
if ((_sponsoractive).equals("1")) { 
RDebugUtils.currentLine=7274552;
 //BA.debugLineNum = 7274552;BA.debugLine="CallSub2(scorebord, \"showSponor\", True)";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"showSponor",(Object)(anywheresoftware.b4a.keywords.Common.True));
 }else {
RDebugUtils.currentLine=7274554;
 //BA.debugLineNum = 7274554;BA.debugLine="CallSub2(scorebord, \"showSponor\", False)";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"showSponor",(Object)(anywheresoftware.b4a.keywords.Common.False));
 };
RDebugUtils.currentLine=7274557;
 //BA.debugLineNum = 7274557;BA.debugLine="End Sub";
return "";
}
}