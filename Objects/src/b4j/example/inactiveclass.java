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
public b4j.example.parseconfig _parseconfig = null;
public b4j.example.getnode _getnode = null;
public b4j.example.funcinet _funcinet = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _enabletime(b4j.example.inactiveclass __ref,boolean _enable) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "enabletime", false))
	 {return ((String) Debug.delegate(ba, "enabletime", new Object[] {_enable}));}
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Sub enableTime(enable As Boolean)";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="tmr.Enabled = enable";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(_enable);
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="End Sub";
return "";
}
public String  _enablepromote(b4j.example.inactiveclass __ref,boolean _enable) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "enablepromote", false))
	 {return ((String) Debug.delegate(ba, "enablepromote", new Object[] {_enable}));}
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Sub enablePromote(enable As Boolean)";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="tmr_draw_promote.Enabled = enable";
__ref._tmr_draw_promote /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(_enable);
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.inactiveclass __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="timeOutPeriode = (parseConfig.timeOut*(60*1000))";
__ref._timeoutperiode /*int*/  = (int) ((_parseconfig._timeout /*int*/ *(60*1000)));
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="tmr.Initialize(\"timeOut\", timeOutPeriode)";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"timeOut",(long) (__ref._timeoutperiode /*int*/ ));
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="tmr.Enabled = parseConfig.timeOutActive";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(_parseconfig._timeoutactive /*boolean*/ );
RDebugUtils.currentLine=9306117;
 //BA.debugLineNum = 9306117;BA.debugLine="tmr_draw_promote.Initialize(\"drawPromote\", 5000)";
__ref._tmr_draw_promote /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"drawPromote",(long) (5000));
RDebugUtils.currentLine=9306120;
 //BA.debugLineNum = 9306120;BA.debugLine="End Sub";
return "";
}
public String  _updatepromote(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "updatepromote", false))
	 {return ((String) Debug.delegate(ba, "updatepromote", null));}
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Sub updatePromote";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="timeOutPeriode = (parseConfig.timeOut*(60*1000))";
__ref._timeoutperiode /*int*/  = (int) ((_parseconfig._timeout /*int*/ *(60*1000)));
RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="tmr.Enabled = False";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="tmr.Interval = timeOutPeriode";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._timeoutperiode /*int*/ ));
RDebugUtils.currentLine=9699333;
 //BA.debugLineNum = 9699333;BA.debugLine="tmr.Enabled = True";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=9699334;
 //BA.debugLineNum = 9699334;BA.debugLine="If parseConfig.useDigitalFont Then";
if (_parseconfig._usedigitalfont /*boolean*/ ) { 
RDebugUtils.currentLine=9699336;
 //BA.debugLineNum = 9699336;BA.debugLine="CallSub2(scorebord, \"useDigitalFont\", parseConfi";
__c.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"useDigitalFont",(Object)(_parseconfig._usedigitalfont /*boolean*/ ));
 };
RDebugUtils.currentLine=9699338;
 //BA.debugLineNum = 9699338;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="Public tmr, tmr_draw_promote As Timer";
_tmr = new anywheresoftware.b4a.objects.Timer();
_tmr_draw_promote = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="Public timeOutPeriode As Int' = 5000 ' 10*minute";
_timeoutperiode = 0;
RDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="Public lastClick As Long";
_lastclick = 0L;
RDebugUtils.currentLine=9240582;
 //BA.debugLineNum = 9240582;BA.debugLine="Private timeDiff As Long";
_timediff = 0L;
RDebugUtils.currentLine=9240583;
 //BA.debugLineNum = 9240583;BA.debugLine="Public frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=9240584;
 //BA.debugLineNum = 9240584;BA.debugLine="Public pn_promote As Pane";
_pn_promote = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=9240585;
 //BA.debugLineNum = 9240585;BA.debugLine="Private currentX = 10, currentY = 10 As Double";
_currentx = 10;
_currenty = 10;
RDebugUtils.currentLine=9240586;
 //BA.debugLineNum = 9240586;BA.debugLine="Public vx = 200, vy = 100 As Double";
_vx = 200;
_vy = 100;
RDebugUtils.currentLine=9240587;
 //BA.debugLineNum = 9240587;BA.debugLine="Public pnlWidth, pnlHeight As Double";
_pnlwidth = 0;
_pnlheight = 0;
RDebugUtils.currentLine=9240588;
 //BA.debugLineNum = 9240588;BA.debugLine="End Sub";
return "";
}
public String  _drawpromote_tick(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "drawpromote_tick", false))
	 {return ((String) Debug.delegate(ba, "drawpromote_tick", null));}
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Sub drawPromote_Tick()";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="getBounds";
__ref._getbounds /*String*/ (null);
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="End Sub";
return "";
}
public String  _getbounds(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "getbounds", false))
	 {return ((String) Debug.delegate(ba, "getbounds", null));}
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Sub getBounds";
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="If (currentX+20) + pnlWidth+20 > frm.Width Then";
if ((__ref._currentx /*double*/ +20)+__ref._pnlwidth /*double*/ +20>__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getWidth()) { 
RDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="vx = -Abs(vx)";
__ref._vx /*double*/  = -__c.Abs(__ref._vx /*double*/ );
 }else 
{RDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="Else If currentX < 0 Then";
if (__ref._currentx /*double*/ <0) { 
RDebugUtils.currentLine=9633799;
 //BA.debugLineNum = 9633799;BA.debugLine="vx = Abs(vx)";
__ref._vx /*double*/  = __c.Abs(__ref._vx /*double*/ );
 }}
;
RDebugUtils.currentLine=9633802;
 //BA.debugLineNum = 9633802;BA.debugLine="If (currentY+50) + pnlHeight > frm.Height Then";
if ((__ref._currenty /*double*/ +50)+__ref._pnlheight /*double*/ >__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getHeight()) { 
RDebugUtils.currentLine=9633803;
 //BA.debugLineNum = 9633803;BA.debugLine="vy = -Abs(vy)";
__ref._vy /*double*/  = -__c.Abs(__ref._vy /*double*/ );
 }else 
{RDebugUtils.currentLine=9633804;
 //BA.debugLineNum = 9633804;BA.debugLine="Else If currentY < 0 Then";
if (__ref._currenty /*double*/ <0) { 
RDebugUtils.currentLine=9633805;
 //BA.debugLineNum = 9633805;BA.debugLine="vy = Abs(vy)";
__ref._vy /*double*/  = __c.Abs(__ref._vy /*double*/ );
 }}
;
RDebugUtils.currentLine=9633808;
 //BA.debugLineNum = 9633808;BA.debugLine="currentX = currentX + vx";
__ref._currentx /*double*/  = __ref._currentx /*double*/ +__ref._vx /*double*/ ;
RDebugUtils.currentLine=9633809;
 //BA.debugLineNum = 9633809;BA.debugLine="currentY = currentY + vy";
__ref._currenty /*double*/  = __ref._currenty /*double*/ +__ref._vy /*double*/ ;
RDebugUtils.currentLine=9633811;
 //BA.debugLineNum = 9633811;BA.debugLine="CallSubDelayed3(scorebord, \"drawPromote\", current";
__c.CallSubDelayed3(ba,(Object)(_scorebord.getObject()),"drawPromote",(Object)(__ref._currentx /*double*/ ),(Object)(__ref._currenty /*double*/ ));
RDebugUtils.currentLine=9633812;
 //BA.debugLineNum = 9633812;BA.debugLine="End Sub";
return "";
}
public String  _timeout_tick(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "timeout_tick", false))
	 {return ((String) Debug.delegate(ba, "timeout_tick", null));}
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Sub timeOut_Tick()";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="timeDiff = DateTime.Now - lastClick";
__ref._timediff /*long*/  = (long) (__c.DateTime.getNow()-__ref._lastclick /*long*/ );
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="If timeDiff > timeOutPeriode Then";
if (__ref._timediff /*long*/ >__ref._timeoutperiode /*int*/ ) { 
RDebugUtils.currentLine=9371651;
 //BA.debugLineNum = 9371651;BA.debugLine="enableTime(False)";
__ref._enabletime /*String*/ (null,__c.False);
RDebugUtils.currentLine=9371652;
 //BA.debugLineNum = 9371652;BA.debugLine="CallSubDelayed(scorebord, \"showPromote\")";
__c.CallSubDelayed(ba,(Object)(_scorebord.getObject()),"showPromote");
RDebugUtils.currentLine=9371654;
 //BA.debugLineNum = 9371654;BA.debugLine="vx = 50";
__ref._vx /*double*/  = 50;
RDebugUtils.currentLine=9371655;
 //BA.debugLineNum = 9371655;BA.debugLine="vy = 50";
__ref._vy /*double*/  = 50;
RDebugUtils.currentLine=9371656;
 //BA.debugLineNum = 9371656;BA.debugLine="enablePromote(True)";
__ref._enablepromote /*String*/ (null,__c.True);
RDebugUtils.currentLine=9371657;
 //BA.debugLineNum = 9371657;BA.debugLine="CallSub2(scorebord, \"setPromoteRunning\", True)";
__c.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"setPromoteRunning",(Object)(__c.True));
 };
RDebugUtils.currentLine=9371662;
 //BA.debugLineNum = 9371662;BA.debugLine="End Sub";
return "";
}
}