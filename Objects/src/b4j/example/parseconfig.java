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
public static b4j.example.httputils2service _httputils2service = null;
public static String  _getapppath() throws Exception{
RDebugUtils.currentModule="parseconfig";
if (Debug.shouldDelegate(ba, "getapppath", false))
	 {return ((String) Debug.delegate(ba, "getapppath", null));}
String _os = "";
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub getAppPath As String";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Dim os As String = DetectOS";
_os = _detectos();
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="Select os";
switch (BA.switchObjectToInt(_os,"windows","linux")) {
case 0: {
RDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="appPath = File.DirApp&\"\\44\\cnf.44\"";
_apppath = anywheresoftware.b4a.keywords.Common.File.getDirApp()+"\\44\\cnf.44";
 break; }
case 1: {
RDebugUtils.currentLine=5963783;
 //BA.debugLineNum = 5963783;BA.debugLine="appPath = File.DirApp&\"/44/cnf.44\"";
_apppath = anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/44/cnf.44";
 break; }
}
;
RDebugUtils.currentLine=5963786;
 //BA.debugLineNum = 5963786;BA.debugLine="Return appPath";
if (true) return _apppath;
RDebugUtils.currentLine=5963787;
 //BA.debugLineNum = 5963787;BA.debugLine="End Sub";
return "";
}
public static String  _detectos() throws Exception{
RDebugUtils.currentModule="parseconfig";
if (Debug.shouldDelegate(ba, "detectos", false))
	 {return ((String) Debug.delegate(ba, "detectos", null));}
String _os = "";
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Sub DetectOS As String";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="Dim os As String = GetSystemProperty(\"os.name\", \"";
_os = anywheresoftware.b4a.keywords.Common.GetSystemProperty("os.name","").toLowerCase();
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="If os.Contains(\"win\") Then";
if (_os.contains("win")) { 
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="Return \"windows\"";
if (true) return "windows";
 }else 
{RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="Else If os.Contains(\"mac\") Then";
if (_os.contains("mac")) { 
RDebugUtils.currentLine=6094853;
 //BA.debugLineNum = 6094853;BA.debugLine="Return \"mac\"";
if (true) return "mac";
 }else {
RDebugUtils.currentLine=6094855;
 //BA.debugLineNum = 6094855;BA.debugLine="Return \"linux\"";
if (true) return "linux";
 }}
;
RDebugUtils.currentLine=6094857;
 //BA.debugLineNum = 6094857;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Sub pullConfig";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="Dim msgList As List";
_msglist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="useDigitalFont = False";
_usedigitalfont = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=6029316;
 //BA.debugLineNum = 6029316;BA.debugLine="cnf = File.ReadString(appPath, \"\")";
_cnf = anywheresoftware.b4a.keywords.Common.File.ReadString(_apppath,"");
RDebugUtils.currentLine=6029317;
 //BA.debugLineNum = 6029317;BA.debugLine="parser.Initialize(cnf)";
_parser.Initialize(_cnf);
RDebugUtils.currentLine=6029318;
 //BA.debugLineNum = 6029318;BA.debugLine="msgList.Initialize";
_msglist.Initialize();
RDebugUtils.currentLine=6029321;
 //BA.debugLineNum = 6029321;BA.debugLine="Dim root As Map' = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6029322;
 //BA.debugLineNum = 6029322;BA.debugLine="root.Initialize";
_root.Initialize();
RDebugUtils.currentLine=6029323;
 //BA.debugLineNum = 6029323;BA.debugLine="root= parser.NextObject";
_root = _parser.NextObject();
RDebugUtils.currentLine=6029324;
 //BA.debugLineNum = 6029324;BA.debugLine="Dim fontColor As Map = root.Get(\"fontColor\")";
_fontcolor = new anywheresoftware.b4a.objects.collections.Map();
_fontcolor.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("fontColor"))));
RDebugUtils.currentLine=6029325;
 //BA.debugLineNum = 6029325;BA.debugLine="Dim colorYellow As String = fontColor.Get(\"colorY";
_coloryellow = BA.ObjectToString(_fontcolor.Get((Object)("colorYellow")));
RDebugUtils.currentLine=6029328;
 //BA.debugLineNum = 6029328;BA.debugLine="Dim message As Map = root.Get(\"message\")";
_message = new anywheresoftware.b4a.objects.collections.Map();
_message.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("message"))));
RDebugUtils.currentLine=6029329;
 //BA.debugLineNum = 6029329;BA.debugLine="Dim line_1 As String = message.Get(\"line_1\")";
_line_1 = BA.ObjectToString(_message.Get((Object)("line_1")));
RDebugUtils.currentLine=6029330;
 //BA.debugLineNum = 6029330;BA.debugLine="Dim line_2 As String = message.Get(\"line_2\")";
_line_2 = BA.ObjectToString(_message.Get((Object)("line_2")));
RDebugUtils.currentLine=6029331;
 //BA.debugLineNum = 6029331;BA.debugLine="Dim line_5 As String = message.Get(\"line_5\")";
_line_5 = BA.ObjectToString(_message.Get((Object)("line_5")));
RDebugUtils.currentLine=6029332;
 //BA.debugLineNum = 6029332;BA.debugLine="Dim line_3 As String = message.Get(\"line_3\")";
_line_3 = BA.ObjectToString(_message.Get((Object)("line_3")));
RDebugUtils.currentLine=6029333;
 //BA.debugLineNum = 6029333;BA.debugLine="Dim line_4 As String = message.Get(\"line_4\")";
_line_4 = BA.ObjectToString(_message.Get((Object)("line_4")));
RDebugUtils.currentLine=6029334;
 //BA.debugLineNum = 6029334;BA.debugLine="Dim fontColor As Map = root.Get(\"fontColor\")";
_fontcolor = new anywheresoftware.b4a.objects.collections.Map();
_fontcolor.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("fontColor"))));
RDebugUtils.currentLine=6029336;
 //BA.debugLineNum = 6029336;BA.debugLine="Dim sponsor As Map = root.Get(\"reclame\")";
_sponsor = new anywheresoftware.b4a.objects.collections.Map();
_sponsor.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("reclame"))));
RDebugUtils.currentLine=6029337;
 //BA.debugLineNum = 6029337;BA.debugLine="Dim sponsorActive As String = sponsor.Get(\"active";
_sponsoractive = BA.ObjectToString(_sponsor.Get((Object)("active")));
RDebugUtils.currentLine=6029339;
 //BA.debugLineNum = 6029339;BA.debugLine="Dim showPromote As Map = root.Get(\"showPromote\")";
_showpromote = new anywheresoftware.b4a.objects.collections.Map();
_showpromote.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("showPromote"))));
RDebugUtils.currentLine=6029340;
 //BA.debugLineNum = 6029340;BA.debugLine="If showPromote.Get(\"active\") = \"1\" Then";
if ((_showpromote.Get((Object)("active"))).equals((Object)("1"))) { 
RDebugUtils.currentLine=6029341;
 //BA.debugLineNum = 6029341;BA.debugLine="timeOutActive = True";
_timeoutactive = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=6029343;
 //BA.debugLineNum = 6029343;BA.debugLine="timeOutActive = False";
_timeoutactive = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=6029345;
 //BA.debugLineNum = 6029345;BA.debugLine="timeOut = showPromote.Get(\"timeOut\")";
_timeout = (int)(BA.ObjectToNumber(_showpromote.Get((Object)("timeOut"))));
RDebugUtils.currentLine=6029347;
 //BA.debugLineNum = 6029347;BA.debugLine="Dim digitalFont As Map = root.Get(\"digitalFont\")";
_digitalfont = new anywheresoftware.b4a.objects.collections.Map();
_digitalfont.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("digitalFont"))));
RDebugUtils.currentLine=6029348;
 //BA.debugLineNum = 6029348;BA.debugLine="Dim digitalActive As String = digitalFont.Get(\"ac";
_digitalactive = BA.ObjectToString(_digitalfont.Get((Object)("active")));
RDebugUtils.currentLine=6029350;
 //BA.debugLineNum = 6029350;BA.debugLine="If digitalActive  = \"1\" Then";
if ((_digitalactive).equals("1")) { 
RDebugUtils.currentLine=6029351;
 //BA.debugLineNum = 6029351;BA.debugLine="useDigitalFont = True";
_usedigitalfont = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6029352;
 //BA.debugLineNum = 6029352;BA.debugLine="CallSub2(scorebord, \"useDigitalFont\", True)";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"useDigitalFont",(Object)(anywheresoftware.b4a.keywords.Common.True));
 }else {
RDebugUtils.currentLine=6029354;
 //BA.debugLineNum = 6029354;BA.debugLine="CallSub2(scorebord, \"useDigitalFont\", False)";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"useDigitalFont",(Object)(anywheresoftware.b4a.keywords.Common.False));
 };
RDebugUtils.currentLine=6029357;
 //BA.debugLineNum = 6029357;BA.debugLine="If colorYellow = \"1\"  Then";
if ((_coloryellow).equals("1")) { 
RDebugUtils.currentLine=6029358;
 //BA.debugLineNum = 6029358;BA.debugLine="CallSub2(scorebord, \"useFontYellow\", True)";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"useFontYellow",(Object)(anywheresoftware.b4a.keywords.Common.True));
 }else {
RDebugUtils.currentLine=6029360;
 //BA.debugLineNum = 6029360;BA.debugLine="CallSub2(scorebord, \"useFontYellow\", False)";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"useFontYellow",(Object)(anywheresoftware.b4a.keywords.Common.False));
 };
RDebugUtils.currentLine=6029363;
 //BA.debugLineNum = 6029363;BA.debugLine="msgList.AddAll(Array As String(line_1, line_2, li";
_msglist.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_line_1,_line_2,_line_3,_line_4,_line_5}));
RDebugUtils.currentLine=6029364;
 //BA.debugLineNum = 6029364;BA.debugLine="CallSub2(scorebord, \"setMessage\", msgList)";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"setMessage",(Object)(_msglist));
RDebugUtils.currentLine=6029366;
 //BA.debugLineNum = 6029366;BA.debugLine="If sponsorActive = \"1\" Then";
if ((_sponsoractive).equals("1")) { 
RDebugUtils.currentLine=6029367;
 //BA.debugLineNum = 6029367;BA.debugLine="CallSub2(scorebord, \"showSponor\", True)";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"showSponor",(Object)(anywheresoftware.b4a.keywords.Common.True));
 }else {
RDebugUtils.currentLine=6029369;
 //BA.debugLineNum = 6029369;BA.debugLine="CallSub2(scorebord, \"showSponor\", False)";
anywheresoftware.b4a.keywords.Common.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"showSponor",(Object)(anywheresoftware.b4a.keywords.Common.False));
 };
RDebugUtils.currentLine=6029372;
 //BA.debugLineNum = 6029372;BA.debugLine="End Sub";
return "";
}
}