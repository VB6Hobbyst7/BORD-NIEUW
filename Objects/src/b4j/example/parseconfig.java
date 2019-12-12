package b4j.example;


import anywheresoftware.b4a.BA;

public class parseconfig extends Object{
public static parseconfig mostCurrent = new parseconfig();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.parseconfig", null);
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
public static anywheresoftware.b4j.objects.JFX _vvvvvvvv3 = null;
public static int _vvvvvvv2 = 0;
public static boolean _vvvvvvv3 = false;
public static boolean _usedigitalfont = false;
public static String _vvvvvvvv5 = "";
public static String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
public static anywheresoftware.b4j.objects.collections.JSONParser _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public static b4j.example.cssutils _vvvvvvvv0 = null;
public static b4j.example.dateutils _vvvvvvvvv1 = null;
public static b4j.example.main _main = null;
public static b4j.example.scorebord _vvvvvvvvv2 = null;
public static b4j.example.func _vvvvvvvvv3 = null;
public static b4j.example.funcinet _vvvvvvvvv5 = null;
public static b4j.example.httputils2service _vvvvvvvvv6 = null;
public static String  _vvvvvvv4() throws Exception{
String _os = "";
 //BA.debugLineNum = 79;BA.debugLine="Sub DetectOS As String";
 //BA.debugLineNum = 80;BA.debugLine="Dim os As String = GetSystemProperty(\"os.name\", \"";
_os = anywheresoftware.b4a.keywords.Common.GetSystemProperty("os.name","").toLowerCase();
 //BA.debugLineNum = 81;BA.debugLine="If os.Contains(\"win\") Then";
if (_os.contains("win")) { 
 //BA.debugLineNum = 82;BA.debugLine="Return \"windows\"";
if (true) return "windows";
 }else if(_os.contains("mac")) { 
 //BA.debugLineNum = 84;BA.debugLine="Return \"mac\"";
if (true) return "mac";
 }else {
 //BA.debugLineNum = 86;BA.debugLine="Return \"linux\"";
if (true) return "linux";
 };
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvv5() throws Exception{
String _os = "";
 //BA.debugLineNum = 14;BA.debugLine="Sub getAppPath As String";
 //BA.debugLineNum = 15;BA.debugLine="Dim os As String = DetectOS";
_os = _vvvvvvv4();
 //BA.debugLineNum = 17;BA.debugLine="Select os";
switch (BA.switchObjectToInt(_os,"windows","linux")) {
case 0: {
 //BA.debugLineNum = 19;BA.debugLine="appPath = File.DirApp&\"\\44\\cnf.44\"";
_vvvvvvvv5 = anywheresoftware.b4a.keywords.Common.File.getDirApp()+"\\44\\cnf.44";
 break; }
case 1: {
 //BA.debugLineNum = 21;BA.debugLine="appPath = File.DirApp&\"/44/cnf.44\"";
_vvvvvvvv5 = anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/44/cnf.44";
 break; }
}
;
 //BA.debugLineNum = 24;BA.debugLine="Return appPath";
if (true) return _vvvvvvvv5;
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_vvvvvvvv3 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 5;BA.debugLine="Public timeOut As Int";
_vvvvvvv2 = 0;
 //BA.debugLineNum = 6;BA.debugLine="Public timeOutActive As Boolean";
_vvvvvvv3 = false;
 //BA.debugLineNum = 7;BA.debugLine="Public useDigitalFont As Boolean";
_usedigitalfont = false;
 //BA.debugLineNum = 8;BA.debugLine="Private appPath As String";
_vvvvvvvv5 = "";
 //BA.debugLineNum = 9;BA.debugLine="Private cnf As String";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
 //BA.debugLineNum = 10;BA.debugLine="Private parser As JSONParser";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvv6() throws Exception{
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
anywheresoftware.b4a.objects.collections.Map _showpromote = null;
anywheresoftware.b4a.objects.collections.Map _digitalfont = null;
String _digitalactive = "";
 //BA.debugLineNum = 28;BA.debugLine="Sub pullConfig";
 //BA.debugLineNum = 29;BA.debugLine="Dim msgList As List";
_msglist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 31;BA.debugLine="useDigitalFont = False";
_usedigitalfont = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 32;BA.debugLine="cnf = File.ReadString(appPath, \"\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = anywheresoftware.b4a.keywords.Common.File.ReadString(_vvvvvvvv5,"");
 //BA.debugLineNum = 33;BA.debugLine="parser.Initialize(cnf)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Initialize(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1);
 //BA.debugLineNum = 34;BA.debugLine="msgList.Initialize";
_msglist.Initialize();
 //BA.debugLineNum = 37;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.NextObject();
 //BA.debugLineNum = 38;BA.debugLine="Dim fontColor As Map = root.Get(\"fontColor\")";
_fontcolor = new anywheresoftware.b4a.objects.collections.Map();
_fontcolor.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("fontColor"))));
 //BA.debugLineNum = 39;BA.debugLine="Dim colorYellow As String = fontColor.Get(\"colorY";
_coloryellow = BA.ObjectToString(_fontcolor.Get((Object)("colorYellow")));
 //BA.debugLineNum = 42;BA.debugLine="Dim message As Map = root.Get(\"message\")";
_message = new anywheresoftware.b4a.objects.collections.Map();
_message.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("message"))));
 //BA.debugLineNum = 43;BA.debugLine="Dim line_1 As String = message.Get(\"line_1\")";
_line_1 = BA.ObjectToString(_message.Get((Object)("line_1")));
 //BA.debugLineNum = 44;BA.debugLine="Dim line_2 As String = message.Get(\"line_2\")";
_line_2 = BA.ObjectToString(_message.Get((Object)("line_2")));
 //BA.debugLineNum = 45;BA.debugLine="Dim line_5 As String = message.Get(\"line_5\")";
_line_5 = BA.ObjectToString(_message.Get((Object)("line_5")));
 //BA.debugLineNum = 46;BA.debugLine="Dim line_3 As String = message.Get(\"line_3\")";
_line_3 = BA.ObjectToString(_message.Get((Object)("line_3")));
 //BA.debugLineNum = 47;BA.debugLine="Dim line_4 As String = message.Get(\"line_4\")";
_line_4 = BA.ObjectToString(_message.Get((Object)("line_4")));
 //BA.debugLineNum = 48;BA.debugLine="Dim fontColor As Map = root.Get(\"fontColor\")";
_fontcolor = new anywheresoftware.b4a.objects.collections.Map();
_fontcolor.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("fontColor"))));
 //BA.debugLineNum = 50;BA.debugLine="Dim showPromote As Map = root.Get(\"showPromote\")";
_showpromote = new anywheresoftware.b4a.objects.collections.Map();
_showpromote.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("showPromote"))));
 //BA.debugLineNum = 51;BA.debugLine="If showPromote.Get(\"active\") = \"1\" Then";
if ((_showpromote.Get((Object)("active"))).equals((Object)("1"))) { 
 //BA.debugLineNum = 52;BA.debugLine="timeOutActive = True";
_vvvvvvv3 = anywheresoftware.b4a.keywords.Common.True;
 }else {
 //BA.debugLineNum = 54;BA.debugLine="timeOutActive = False";
_vvvvvvv3 = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 56;BA.debugLine="timeOut = showPromote.Get(\"timeOut\")";
_vvvvvvv2 = (int)(BA.ObjectToNumber(_showpromote.Get((Object)("timeOut"))));
 //BA.debugLineNum = 58;BA.debugLine="Dim digitalFont As Map = root.Get(\"digitalFont\")";
_digitalfont = new anywheresoftware.b4a.objects.collections.Map();
_digitalfont.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("digitalFont"))));
 //BA.debugLineNum = 59;BA.debugLine="Dim digitalActive As String = digitalFont.Get(\"ac";
_digitalactive = BA.ObjectToString(_digitalfont.Get((Object)("active")));
 //BA.debugLineNum = 61;BA.debugLine="If digitalActive  = \"1\" Then";
if ((_digitalactive).equals("1")) { 
 //BA.debugLineNum = 62;BA.debugLine="useDigitalFont = True";
_usedigitalfont = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 63;BA.debugLine="CallSub2(scorebord, \"useDigitalFont\", True)";
anywheresoftware.b4a.keywords.Common.CallSubNew2(ba,(Object)(_vvvvvvvvv2.getObject()),"useDigitalFont",(Object)(anywheresoftware.b4a.keywords.Common.True));
 }else {
 //BA.debugLineNum = 65;BA.debugLine="CallSub2(scorebord, \"useDigitalFont\", False)";
anywheresoftware.b4a.keywords.Common.CallSubNew2(ba,(Object)(_vvvvvvvvv2.getObject()),"useDigitalFont",(Object)(anywheresoftware.b4a.keywords.Common.False));
 };
 //BA.debugLineNum = 68;BA.debugLine="If colorYellow = \"1\"  Then";
if ((_coloryellow).equals("1")) { 
 //BA.debugLineNum = 69;BA.debugLine="CallSub2(scorebord, \"useFontYellow\", True)";
anywheresoftware.b4a.keywords.Common.CallSubNew2(ba,(Object)(_vvvvvvvvv2.getObject()),"useFontYellow",(Object)(anywheresoftware.b4a.keywords.Common.True));
 }else {
 //BA.debugLineNum = 71;BA.debugLine="CallSub2(scorebord, \"useFontYellow\", False)";
anywheresoftware.b4a.keywords.Common.CallSubNew2(ba,(Object)(_vvvvvvvvv2.getObject()),"useFontYellow",(Object)(anywheresoftware.b4a.keywords.Common.False));
 };
 //BA.debugLineNum = 74;BA.debugLine="msgList.AddAll(Array As String(line_1, line_2, li";
_msglist.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_line_1,_line_2,_line_3,_line_4,_line_5}));
 //BA.debugLineNum = 75;BA.debugLine="CallSub2(scorebord, \"setMessage\", msgList)";
anywheresoftware.b4a.keywords.Common.CallSubNew2(ba,(Object)(_vvvvvvvvv2.getObject()),"setMessage",(Object)(_msglist));
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
}
