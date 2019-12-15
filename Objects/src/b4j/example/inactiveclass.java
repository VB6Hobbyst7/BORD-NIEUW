package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class inactiveclass extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.inactiveclass", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.inactiveclass.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.Timer _tmr_draw_promote = null;
public int _timeoutperiode = 0;
public long _lastclick = 0L;
public long _timediff = 0L;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pn_promote = null;
public double _currentx = 0;
public double _currenty = 0;
public double _vx = 0;
public double _vy = 0;
public double _pnlwidth = 0;
public double _pnlheight = 0;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.scorebord _scorebord = null;
public b4j.example.nieuwe_partij _nieuwe_partij = null;
public b4j.example.func _func = null;
public b4j.example.funcinet _funcinet = null;
public b4j.example.parseconfig _parseconfig = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _enabletime(b4j.example.inactiveclass __ref,boolean _enable) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "enabletime", false))
	 {return ((String) Debug.delegate(ba, "enabletime", new Object[] {_enable}));}
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Sub enableTime(enable As Boolean)";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="tmr.Enabled = enable";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(_enable);
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="End Sub";
return "";
}
public String  _enablepromote(b4j.example.inactiveclass __ref,boolean _enable) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "enablepromote", false))
	 {return ((String) Debug.delegate(ba, "enablepromote", new Object[] {_enable}));}
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Sub enablePromote(enable As Boolean)";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="tmr_draw_promote.Enabled = enable";
__ref._tmr_draw_promote /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(_enable);
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.inactiveclass __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="timeOutPeriode = (parseConfig.timeOut*(60*1000))";
__ref._timeoutperiode /*int*/  = (int) ((_parseconfig._timeout /*int*/ *(60*1000)));
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="tmr.Initialize(\"timeOut\", timeOutPeriode)";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"timeOut",(long) (__ref._timeoutperiode /*int*/ ));
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="tmr.Enabled = parseConfig.timeOutActive";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(_parseconfig._timeoutactive /*boolean*/ );
RDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="tmr_draw_promote.Initialize(\"drawPromote\", 5000)";
__ref._tmr_draw_promote /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"drawPromote",(long) (5000));
RDebugUtils.currentLine=8323080;
 //BA.debugLineNum = 8323080;BA.debugLine="End Sub";
return "";
}
public String  _updatepromote(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "updatepromote", false))
	 {return ((String) Debug.delegate(ba, "updatepromote", null));}
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Sub updatePromote";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="timeOutPeriode = (parseConfig.timeOut*(60*1000))";
__ref._timeoutperiode /*int*/  = (int) ((_parseconfig._timeout /*int*/ *(60*1000)));
RDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="tmr.Enabled = False";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="tmr.Interval = timeOutPeriode";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._timeoutperiode /*int*/ ));
RDebugUtils.currentLine=8716293;
 //BA.debugLineNum = 8716293;BA.debugLine="tmr.Enabled = True";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=8716294;
 //BA.debugLineNum = 8716294;BA.debugLine="If parseConfig.useDigitalFont Then";
if (_parseconfig._usedigitalfont /*boolean*/ ) { 
RDebugUtils.currentLine=8716296;
 //BA.debugLineNum = 8716296;BA.debugLine="CallSub2(scorebord, \"useDigitalFont\", parseConfi";
__c.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"useDigitalFont",(Object)(_parseconfig._usedigitalfont /*boolean*/ ));
 };
RDebugUtils.currentLine=8716298;
 //BA.debugLineNum = 8716298;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="Public tmr, tmr_draw_promote As Timer";
_tmr = new anywheresoftware.b4a.objects.Timer();
_tmr_draw_promote = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="Public timeOutPeriode As Int' = 5000 ' 10*minute";
_timeoutperiode = 0;
RDebugUtils.currentLine=8257541;
 //BA.debugLineNum = 8257541;BA.debugLine="Public lastClick As Long";
_lastclick = 0L;
RDebugUtils.currentLine=8257542;
 //BA.debugLineNum = 8257542;BA.debugLine="Private timeDiff As Long";
_timediff = 0L;
RDebugUtils.currentLine=8257543;
 //BA.debugLineNum = 8257543;BA.debugLine="Public frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=8257544;
 //BA.debugLineNum = 8257544;BA.debugLine="Public pn_promote As Pane";
_pn_promote = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=8257545;
 //BA.debugLineNum = 8257545;BA.debugLine="Private currentX = 10, currentY = 10 As Double";
_currentx = 10;
_currenty = 10;
RDebugUtils.currentLine=8257546;
 //BA.debugLineNum = 8257546;BA.debugLine="Public vx = 200, vy = 100 As Double";
_vx = 200;
_vy = 100;
RDebugUtils.currentLine=8257547;
 //BA.debugLineNum = 8257547;BA.debugLine="Public pnlWidth, pnlHeight As Double";
_pnlwidth = 0;
_pnlheight = 0;
RDebugUtils.currentLine=8257548;
 //BA.debugLineNum = 8257548;BA.debugLine="End Sub";
return "";
}
public String  _drawpromote_tick(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "drawpromote_tick", false))
	 {return ((String) Debug.delegate(ba, "drawpromote_tick", null));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Sub drawPromote_Tick()";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="getBounds";
__ref._getbounds /*String*/ (null);
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="End Sub";
return "";
}
public String  _getbounds(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "getbounds", false))
	 {return ((String) Debug.delegate(ba, "getbounds", null));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Sub getBounds";
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="If (currentX+20) + pnlWidth+20 > frm.Width Then";
if ((__ref._currentx /*double*/ +20)+__ref._pnlwidth /*double*/ +20>__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getWidth()) { 
RDebugUtils.currentLine=8650757;
 //BA.debugLineNum = 8650757;BA.debugLine="vx = -Abs(vx)";
__ref._vx /*double*/  = -__c.Abs(__ref._vx /*double*/ );
 }else 
{RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="Else If currentX < 0 Then";
if (__ref._currentx /*double*/ <0) { 
RDebugUtils.currentLine=8650759;
 //BA.debugLineNum = 8650759;BA.debugLine="vx = Abs(vx)";
__ref._vx /*double*/  = __c.Abs(__ref._vx /*double*/ );
 }}
;
RDebugUtils.currentLine=8650762;
 //BA.debugLineNum = 8650762;BA.debugLine="If (currentY+50) + pnlHeight > frm.Height Then";
if ((__ref._currenty /*double*/ +50)+__ref._pnlheight /*double*/ >__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getHeight()) { 
RDebugUtils.currentLine=8650763;
 //BA.debugLineNum = 8650763;BA.debugLine="vy = -Abs(vy)";
__ref._vy /*double*/  = -__c.Abs(__ref._vy /*double*/ );
 }else 
{RDebugUtils.currentLine=8650764;
 //BA.debugLineNum = 8650764;BA.debugLine="Else If currentY < 0 Then";
if (__ref._currenty /*double*/ <0) { 
RDebugUtils.currentLine=8650765;
 //BA.debugLineNum = 8650765;BA.debugLine="vy = Abs(vy)";
__ref._vy /*double*/  = __c.Abs(__ref._vy /*double*/ );
 }}
;
RDebugUtils.currentLine=8650768;
 //BA.debugLineNum = 8650768;BA.debugLine="currentX = currentX + vx";
__ref._currentx /*double*/  = __ref._currentx /*double*/ +__ref._vx /*double*/ ;
RDebugUtils.currentLine=8650769;
 //BA.debugLineNum = 8650769;BA.debugLine="currentY = currentY + vy";
__ref._currenty /*double*/  = __ref._currenty /*double*/ +__ref._vy /*double*/ ;
RDebugUtils.currentLine=8650771;
 //BA.debugLineNum = 8650771;BA.debugLine="CallSubDelayed3(scorebord, \"drawPromote\", current";
__c.CallSubDelayed3(ba,(Object)(_scorebord.getObject()),"drawPromote",(Object)(__ref._currentx /*double*/ ),(Object)(__ref._currenty /*double*/ ));
RDebugUtils.currentLine=8650772;
 //BA.debugLineNum = 8650772;BA.debugLine="End Sub";
return "";
}
public String  _timeout_tick(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "timeout_tick", false))
	 {return ((String) Debug.delegate(ba, "timeout_tick", null));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Sub timeOut_Tick()";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="timeDiff = DateTime.Now - lastClick";
__ref._timediff /*long*/  = (long) (__c.DateTime.getNow()-__ref._lastclick /*long*/ );
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="If timeDiff > timeOutPeriode Then";
if (__ref._timediff /*long*/ >__ref._timeoutperiode /*int*/ ) { 
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="enableTime(False)";
__ref._enabletime /*String*/ (null,__c.False);
RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="CallSubDelayed(scorebord, \"showPromote\")";
__c.CallSubDelayed(ba,(Object)(_scorebord.getObject()),"showPromote");
RDebugUtils.currentLine=8388614;
 //BA.debugLineNum = 8388614;BA.debugLine="vx = 50";
__ref._vx /*double*/  = 50;
RDebugUtils.currentLine=8388615;
 //BA.debugLineNum = 8388615;BA.debugLine="vy = 50";
__ref._vy /*double*/  = 50;
RDebugUtils.currentLine=8388616;
 //BA.debugLineNum = 8388616;BA.debugLine="enablePromote(True)";
__ref._enablepromote /*String*/ (null,__c.True);
RDebugUtils.currentLine=8388617;
 //BA.debugLineNum = 8388617;BA.debugLine="CallSub2(scorebord, \"setPromoteRunning\", True)";
__c.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"setPromoteRunning",(Object)(__c.True));
 };
RDebugUtils.currentLine=8388622;
 //BA.debugLineNum = 8388622;BA.debugLine="End Sub";
return "";
}
}