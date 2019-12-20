package b4j.example;


import anywheresoftware.b4a.BA;

public class funcinet extends Object{
public static funcinet mostCurrent = new funcinet();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.funcinet", null);
		ba.loadHtSubs(funcinet.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.funcinet", ba);
		}
	}
    public static Class<?> getObject() {
		return funcinet.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static String _url = "";
public static anywheresoftware.b4j.objects.ImageViewWrapper _imgview = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.main _main = null;
public static b4j.example.scorebord _scorebord = null;
public static b4j.example.nieuwe_partij _nieuwe_partij = null;
public static b4j.example.func _func = null;
public static b4j.example.getnode _getnode = null;
public static b4j.example.parseconfig _parseconfig = null;
public static b4j.example.httputils2service _httputils2service = null;
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 6;BA.debugLine="Private url As String";
_url = "";
 //BA.debugLineNum = 8;BA.debugLine="Public imgView As ImageView";
_imgview = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _testinet() throws Exception{
ResumableSub_testInet rsub = new ResumableSub_testInet(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_testInet extends BA.ResumableSub {
public ResumableSub_testInet(b4j.example.funcinet parent) {
this.parent = parent;
}
b4j.example.funcinet parent;
b4j.example.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 13;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
 //BA.debugLineNum = 14;BA.debugLine="Dim url As String = \"https:\\\\www.google.com\"";
parent._url = "https:\\\\www.google.com";
 //BA.debugLineNum = 16;BA.debugLine="j.Initialize(url, Me)";
_j._initialize /*String*/ (ba,parent._url,funcinet.getObject());
 //BA.debugLineNum = 17;BA.debugLine="j.Download(url)";
_j._download /*String*/ (parent._url);
 //BA.debugLineNum = 19;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.example.httpjob) result[0];
;
 //BA.debugLineNum = 21;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 22;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 24;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _jobdone(b4j.example.httpjob _j) throws Exception{
}
}
