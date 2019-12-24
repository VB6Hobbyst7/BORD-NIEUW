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
public anywheresoftware.b4j.objects.Shell _sh = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.scorebord _scorebord = null;
public b4j.example.nieuwe_partij _nieuwe_partij = null;
public b4j.example.func _func = null;
public b4j.example.parseconfig _parseconfig = null;
public b4j.example.funcinet _funcinet = null;
public b4j.example.getnode _getnode = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _initialize(b4j.example.classcheckconfig __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="classcheckconfig";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="appPath = parseConfig.getAppPath";
__ref._apppath /*String*/  = _parseconfig._getapppath /*String*/ ();
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="cfgTimeStamp = File.LastModified(appPath, \"cnf.44";
__ref._cfgtimestamp /*long*/  = __c.File.LastModified(__ref._apppath /*String*/ ,"cnf.44");
RDebugUtils.currentLine=6946822;
 //BA.debugLineNum = 6946822;BA.debugLine="tmr.Initialize(\"chkConfig\", 5000)";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"chkConfig",(long) (5000));
RDebugUtils.currentLine=6946823;
 //BA.debugLineNum = 6946823;BA.debugLine="tmr.Enabled = True";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=6946824;
 //BA.debugLineNum = 6946824;BA.debugLine="End Sub";
return "";
}
public String  _checkifupdated(b4j.example.classcheckconfig __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="classcheckconfig";
if (Debug.shouldDelegate(ba, "checkifupdated", false))
	 {return ((String) Debug.delegate(ba, "checkifupdated", null));}
String _os = "";
String _appfolder = "";
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Sub checkIfUpdated";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Dim appPath As String = parseConfig.getAppPath";
_apppath = _parseconfig._getapppath /*String*/ ();
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="Dim os As String = parseConfig.DetectOS";
_os = _parseconfig._detectos /*String*/ ();
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="Dim appFolder As String";
_appfolder = "";
RDebugUtils.currentLine=7077892;
 //BA.debugLineNum = 7077892;BA.debugLine="Select os";
switch (BA.switchObjectToInt(_os,"windows","linux")) {
case 0: {
RDebugUtils.currentLine=7077894;
 //BA.debugLineNum = 7077894;BA.debugLine="appFolder = File.DirApp&\"\\44\\\"";
_appfolder = __c.File.getDirApp()+"\\44\\";
 break; }
case 1: {
RDebugUtils.currentLine=7077896;
 //BA.debugLineNum = 7077896;BA.debugLine="appFolder = File.DirApp&\"/44/\"";
_appfolder = __c.File.getDirApp()+"/44/";
 break; }
}
;
RDebugUtils.currentLine=7077898;
 //BA.debugLineNum = 7077898;BA.debugLine="If File.Exists(appFolder, \"upd.pdg\") Then";
if (__c.File.Exists(_appfolder,"upd.pdg")) { 
RDebugUtils.currentLine=7077900;
 //BA.debugLineNum = 7077900;BA.debugLine="Log(\"UPDATING\")";
__c.Log("UPDATING");
RDebugUtils.currentLine=7077901;
 //BA.debugLineNum = 7077901;BA.debugLine="File.Delete(appFolder, \"upd.pdg\")";
__c.File.Delete(_appfolder,"upd.pdg");
RDebugUtils.currentLine=7077904;
 //BA.debugLineNum = 7077904;BA.debugLine="sh.Initialize(\"sh\", \"sh\", Array(\"restart_bord.sh";
__ref._sh /*anywheresoftware.b4j.objects.Shell*/ .Initialize("sh","sh",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("restart_bord.sh")}));
RDebugUtils.currentLine=7077905;
 //BA.debugLineNum = 7077905;BA.debugLine="sh.Run(5000)";
__ref._sh /*anywheresoftware.b4j.objects.Shell*/ .Run(ba,(long) (5000));
RDebugUtils.currentLine=7077906;
 //BA.debugLineNum = 7077906;BA.debugLine="ExitApplication";
__c.ExitApplication();
 };
RDebugUtils.currentLine=7077908;
 //BA.debugLineNum = 7077908;BA.debugLine="End Sub";
return "";
}
public String  _chkconfig_tick(b4j.example.classcheckconfig __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="classcheckconfig";
if (Debug.shouldDelegate(ba, "chkconfig_tick", false))
	 {return ((String) Debug.delegate(ba, "chkconfig_tick", null));}
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Sub chkConfig_Tick";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="cfgCurrTimeStamp = File.LastModified(appPath, \"cn";
__ref._cfgcurrtimestamp /*long*/  = __c.File.LastModified(__ref._apppath /*String*/ ,"cnf.44");
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="If cfgCurrTimeStamp <> cfgTimeStamp Then";
if (__ref._cfgcurrtimestamp /*long*/ !=__ref._cfgtimestamp /*long*/ ) { 
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="parseConfig.pullConfig";
_parseconfig._pullconfig /*String*/ ();
RDebugUtils.currentLine=7012358;
 //BA.debugLineNum = 7012358;BA.debugLine="cfgTimeStamp = cfgCurrTimeStamp";
__ref._cfgtimestamp /*long*/  = __ref._cfgcurrtimestamp /*long*/ ;
RDebugUtils.currentLine=7012359;
 //BA.debugLineNum = 7012359;BA.debugLine="CallSub(scorebord, \"updateCfg\")";
__c.CallSubDebug(ba,(Object)(_scorebord.getObject()),"updateCfg");
RDebugUtils.currentLine=7012361;
 //BA.debugLineNum = 7012361;BA.debugLine="CallSub2(scorebord, \"useDigitalFont\", parseConfi";
__c.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"useDigitalFont",(Object)(_parseconfig._usedigitalfont /*boolean*/ ));
 };
RDebugUtils.currentLine=7012369;
 //BA.debugLineNum = 7012369;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.classcheckconfig __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="classcheckconfig";
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="Dim tmr As Timer";
_tmr = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="Dim appPath As String";
_apppath = "";
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="Dim cfgTimeStamp, cfgCurrTimeStamp As Long";
_cfgtimestamp = 0L;
_cfgcurrtimestamp = 0L;
RDebugUtils.currentLine=6881285;
 //BA.debugLineNum = 6881285;BA.debugLine="Dim sh As Shell";
_sh = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="End Sub";
return "";
}
}