package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class classcheckconfig extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.classcheckconfig", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.classcheckconfig.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4a.objects.Timer _tmr = null;
public String _apppath = "";
public long _cfgtimestamp = 0L;
public long _cfgcurrtimestamp = 0L;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.scorebord _scorebord = null;
public b4j.example.nieuwe_partij _nieuwe_partij = null;
public b4j.example.func _func = null;
public b4j.example.parseconfig _parseconfig = null;
public b4j.example.funcinet _funcinet = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _initialize(b4j.example.classcheckconfig __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="classcheckconfig";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="appPath = parseConfig.getAppPath";
__ref._apppath /*String*/  = _parseconfig._getapppath /*String*/ ();
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="cfgTimeStamp = File.LastModified(appPath, \"\")";
__ref._cfgtimestamp /*long*/  = __c.File.LastModified(__ref._apppath /*String*/ ,"");
RDebugUtils.currentLine=6815750;
 //BA.debugLineNum = 6815750;BA.debugLine="tmr.Initialize(\"chkConfig\", 5000)";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"chkConfig",(long) (5000));
RDebugUtils.currentLine=6815751;
 //BA.debugLineNum = 6815751;BA.debugLine="tmr.Enabled = True";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=6815752;
 //BA.debugLineNum = 6815752;BA.debugLine="End Sub";
return "";
}
public String  _chkconfig_tick(b4j.example.classcheckconfig __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="classcheckconfig";
if (Debug.shouldDelegate(ba, "chkconfig_tick", false))
	 {return ((String) Debug.delegate(ba, "chkconfig_tick", null));}
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Sub chkConfig_Tick";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="cfgCurrTimeStamp = File.LastModified(appPath, \"\")";
__ref._cfgcurrtimestamp /*long*/  = __c.File.LastModified(__ref._apppath /*String*/ ,"");
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="If cfgCurrTimeStamp <> cfgTimeStamp Then";
if (__ref._cfgcurrtimestamp /*long*/ !=__ref._cfgtimestamp /*long*/ ) { 
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="parseConfig.pullConfig";
_parseconfig._pullconfig /*String*/ ();
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="cfgTimeStamp = cfgCurrTimeStamp";
__ref._cfgtimestamp /*long*/  = __ref._cfgcurrtimestamp /*long*/ ;
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="CallSub(scorebord, \"updateCfg\")";
__c.CallSubDebug(ba,(Object)(_scorebord.getObject()),"updateCfg");
RDebugUtils.currentLine=6881289;
 //BA.debugLineNum = 6881289;BA.debugLine="CallSub2(scorebord, \"useDigitalFont\", parseConfi";
__c.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"useDigitalFont",(Object)(_parseconfig._usedigitalfont /*boolean*/ ));
 };
RDebugUtils.currentLine=6881293;
 //BA.debugLineNum = 6881293;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.classcheckconfig __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="classcheckconfig";
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="Dim tmr As Timer";
_tmr = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="Dim appPath As String";
_apppath = "";
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="Dim cfgTimeStamp, cfgCurrTimeStamp As Long";
_cfgtimestamp = 0L;
_cfgcurrtimestamp = 0L;
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="End Sub";
return "";
}
}