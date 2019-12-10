package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class funcinet_subs_0 {


public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
funcinet._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 6;BA.debugLine="Private url As String";
funcinet._url = RemoteObject.createImmutable("");
 //BA.debugLineNum = 8;BA.debugLine="Public imgView As ImageView";
funcinet._imgview = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _testinet() throws Exception{
try {
		Debug.PushSubsStack("testInet (funcinet) ","funcinet",6,funcinet.ba,funcinet.mostCurrent,12);
if (RapidSub.canDelegate("testinet")) { return b4j.example.funcinet.remoteMe.runUserSub(false, "funcinet","testinet");}
ResumableSub_testInet rsub = new ResumableSub_testInet(null);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_testInet extends BA.ResumableSub {
public ResumableSub_testInet(b4j.example.funcinet parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.example.funcinet parent;
RemoteObject _j = RemoteObject.declareNull("b4j.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("testInet (funcinet) ","funcinet",6,funcinet.ba,funcinet.mostCurrent,12);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 13;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(4096);
_j = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 14;BA.debugLine="Dim url As String = \"https:\\\\www.google.com\"";
Debug.ShouldStop(8192);
parent._url = BA.ObjectToString("https:\\\\www.google.com");
 BA.debugLineNum = 16;BA.debugLine="j.Initialize(url, Me)";
Debug.ShouldStop(32768);
_j.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,funcinet.ba,(Object)(parent._url),(Object)(funcinet.getObject()));
 BA.debugLineNum = 17;BA.debugLine="j.Download(url)";
Debug.ShouldStop(65536);
_j.runClassMethod (b4j.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(parent._url));
 BA.debugLineNum = 19;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","jobdone", funcinet.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "funcinet", "testinet"), (_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 21;BA.debugLine="If j.Success Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 6;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 22;BA.debugLine="Return True";
Debug.ShouldStop(2097152);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 24;BA.debugLine="Return False";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject _j) throws Exception{
}
}