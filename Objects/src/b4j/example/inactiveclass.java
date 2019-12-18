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
public b4j.example.funcinet _funcinet = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _enabletime(b4j.example.inactiveclass __ref,boolean _enable) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "enabletime", false))
	 {return ((String) Debug.delegate(ba, "enabletime", new Object[] {_enable}));}
RDebugUtils.currentLine=29949952;
 //BA.debugLineNum = 29949952;BA.debugLine="Sub enableTime(enable As Boolean)";
RDebugUtils.currentLine=29949953;
 //BA.debugLineNum = 29949953;BA.debugLine="tmr.Enabled = enable";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(_enable);
RDebugUtils.currentLine=29949954;
 //BA.debugLineNum = 29949954;BA.debugLine="End Sub";
return "";
}
public String  _enablepromote(b4j.example.inactiveclass __ref,boolean _enable) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "enablepromote", false))
	 {return ((String) Debug.delegate(ba, "enablepromote", new Object[] {_enable}));}
RDebugUtils.currentLine=30015488;
 //BA.debugLineNum = 30015488;BA.debugLine="Sub enablePromote(enable As Boolean)";
RDebugUtils.currentLine=30015489;
 //BA.debugLineNum = 30015489;BA.debugLine="tmr_draw_promote.Enabled = enable";
__ref._tmr_draw_promote /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(_enable);
RDebugUtils.currentLine=30015491;
 //BA.debugLineNum = 30015491;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.inactiveclass __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=29818880;
 //BA.debugLineNum = 29818880;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=29818881;
 //BA.debugLineNum = 29818881;BA.debugLine="timeOutPeriode = (parseConfig.timeOut*(60*1000))";
__ref._timeoutperiode /*int*/  = (int) ((_parseconfig._timeout /*int*/ *(60*1000)));
RDebugUtils.currentLine=29818883;
 //BA.debugLineNum = 29818883;BA.debugLine="tmr.Initialize(\"timeOut\", timeOutPeriode)";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"timeOut",(long) (__ref._timeoutperiode /*int*/ ));
RDebugUtils.currentLine=29818884;
 //BA.debugLineNum = 29818884;BA.debugLine="tmr.Enabled = parseConfig.timeOutActive";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(_parseconfig._timeoutactive /*boolean*/ );
RDebugUtils.currentLine=29818885;
 //BA.debugLineNum = 29818885;BA.debugLine="tmr_draw_promote.Initialize(\"drawPromote\", 5000)";
__ref._tmr_draw_promote /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"drawPromote",(long) (5000));
RDebugUtils.currentLine=29818888;
 //BA.debugLineNum = 29818888;BA.debugLine="End Sub";
return "";
}
public String  _updatepromote(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "updatepromote", false))
	 {return ((String) Debug.delegate(ba, "updatepromote", null));}
RDebugUtils.currentLine=30212096;
 //BA.debugLineNum = 30212096;BA.debugLine="Sub updatePromote";
RDebugUtils.currentLine=30212097;
 //BA.debugLineNum = 30212097;BA.debugLine="timeOutPeriode = (parseConfig.timeOut*(60*1000))";
__ref._timeoutperiode /*int*/  = (int) ((_parseconfig._timeout /*int*/ *(60*1000)));
RDebugUtils.currentLine=30212099;
 //BA.debugLineNum = 30212099;BA.debugLine="tmr.Enabled = False";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=30212100;
 //BA.debugLineNum = 30212100;BA.debugLine="tmr.Interval = timeOutPeriode";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._timeoutperiode /*int*/ ));
RDebugUtils.currentLine=30212101;
 //BA.debugLineNum = 30212101;BA.debugLine="tmr.Enabled = True";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=30212102;
 //BA.debugLineNum = 30212102;BA.debugLine="If parseConfig.useDigitalFont Then";
if (_parseconfig._usedigitalfont /*boolean*/ ) { 
RDebugUtils.currentLine=30212104;
 //BA.debugLineNum = 30212104;BA.debugLine="CallSub2(scorebord, \"useDigitalFont\", parseConfi";
__c.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"useDigitalFont",(Object)(_parseconfig._usedigitalfont /*boolean*/ ));
 };
RDebugUtils.currentLine=30212106;
 //BA.debugLineNum = 30212106;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
RDebugUtils.currentLine=29753344;
 //BA.debugLineNum = 29753344;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=29753345;
 //BA.debugLineNum = 29753345;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=29753346;
 //BA.debugLineNum = 29753346;BA.debugLine="Public tmr, tmr_draw_promote As Timer";
_tmr = new anywheresoftware.b4a.objects.Timer();
_tmr_draw_promote = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=29753348;
 //BA.debugLineNum = 29753348;BA.debugLine="Public timeOutPeriode As Int' = 5000 ' 10*minute";
_timeoutperiode = 0;
RDebugUtils.currentLine=29753349;
 //BA.debugLineNum = 29753349;BA.debugLine="Public lastClick As Long";
_lastclick = 0L;
RDebugUtils.currentLine=29753350;
 //BA.debugLineNum = 29753350;BA.debugLine="Private timeDiff As Long";
_timediff = 0L;
RDebugUtils.currentLine=29753351;
 //BA.debugLineNum = 29753351;BA.debugLine="Public frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=29753352;
 //BA.debugLineNum = 29753352;BA.debugLine="Public pn_promote As Pane";
_pn_promote = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=29753353;
 //BA.debugLineNum = 29753353;BA.debugLine="Private currentX = 10, currentY = 10 As Double";
_currentx = 10;
_currenty = 10;
RDebugUtils.currentLine=29753354;
 //BA.debugLineNum = 29753354;BA.debugLine="Public vx = 200, vy = 100 As Double";
_vx = 200;
_vy = 100;
RDebugUtils.currentLine=29753355;
 //BA.debugLineNum = 29753355;BA.debugLine="Public pnlWidth, pnlHeight As Double";
_pnlwidth = 0;
_pnlheight = 0;
RDebugUtils.currentLine=29753356;
 //BA.debugLineNum = 29753356;BA.debugLine="End Sub";
return "";
}
public String  _drawpromote_tick(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "drawpromote_tick", false))
	 {return ((String) Debug.delegate(ba, "drawpromote_tick", null));}
RDebugUtils.currentLine=30081024;
 //BA.debugLineNum = 30081024;BA.debugLine="Sub drawPromote_Tick()";
RDebugUtils.currentLine=30081025;
 //BA.debugLineNum = 30081025;BA.debugLine="getBounds";
__ref._getbounds /*String*/ (null);
RDebugUtils.currentLine=30081026;
 //BA.debugLineNum = 30081026;BA.debugLine="End Sub";
return "";
}
public String  _getbounds(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "getbounds", false))
	 {return ((String) Debug.delegate(ba, "getbounds", null));}
RDebugUtils.currentLine=30146560;
 //BA.debugLineNum = 30146560;BA.debugLine="Sub getBounds";
RDebugUtils.currentLine=30146564;
 //BA.debugLineNum = 30146564;BA.debugLine="If (currentX+20) + pnlWidth+20 > frm.Width Then";
if ((__ref._currentx /*double*/ +20)+__ref._pnlwidth /*double*/ +20>__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getWidth()) { 
RDebugUtils.currentLine=30146565;
 //BA.debugLineNum = 30146565;BA.debugLine="vx = -Abs(vx)";
__ref._vx /*double*/  = -__c.Abs(__ref._vx /*double*/ );
 }else 
{RDebugUtils.currentLine=30146566;
 //BA.debugLineNum = 30146566;BA.debugLine="Else If currentX < 0 Then";
if (__ref._currentx /*double*/ <0) { 
RDebugUtils.currentLine=30146567;
 //BA.debugLineNum = 30146567;BA.debugLine="vx = Abs(vx)";
__ref._vx /*double*/  = __c.Abs(__ref._vx /*double*/ );
 }}
;
RDebugUtils.currentLine=30146570;
 //BA.debugLineNum = 30146570;BA.debugLine="If (currentY+50) + pnlHeight > frm.Height Then";
if ((__ref._currenty /*double*/ +50)+__ref._pnlheight /*double*/ >__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getHeight()) { 
RDebugUtils.currentLine=30146571;
 //BA.debugLineNum = 30146571;BA.debugLine="vy = -Abs(vy)";
__ref._vy /*double*/  = -__c.Abs(__ref._vy /*double*/ );
 }else 
{RDebugUtils.currentLine=30146572;
 //BA.debugLineNum = 30146572;BA.debugLine="Else If currentY < 0 Then";
if (__ref._currenty /*double*/ <0) { 
RDebugUtils.currentLine=30146573;
 //BA.debugLineNum = 30146573;BA.debugLine="vy = Abs(vy)";
__ref._vy /*double*/  = __c.Abs(__ref._vy /*double*/ );
 }}
;
RDebugUtils.currentLine=30146576;
 //BA.debugLineNum = 30146576;BA.debugLine="currentX = currentX + vx";
__ref._currentx /*double*/  = __ref._currentx /*double*/ +__ref._vx /*double*/ ;
RDebugUtils.currentLine=30146577;
 //BA.debugLineNum = 30146577;BA.debugLine="currentY = currentY + vy";
__ref._currenty /*double*/  = __ref._currenty /*double*/ +__ref._vy /*double*/ ;
RDebugUtils.currentLine=30146579;
 //BA.debugLineNum = 30146579;BA.debugLine="CallSubDelayed3(scorebord, \"drawPromote\", current";
__c.CallSubDelayed3(ba,(Object)(_scorebord.getObject()),"drawPromote",(Object)(__ref._currentx /*double*/ ),(Object)(__ref._currenty /*double*/ ));
RDebugUtils.currentLine=30146580;
 //BA.debugLineNum = 30146580;BA.debugLine="End Sub";
return "";
}
public String  _timeout_tick(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "timeout_tick", false))
	 {return ((String) Debug.delegate(ba, "timeout_tick", null));}
RDebugUtils.currentLine=29884416;
 //BA.debugLineNum = 29884416;BA.debugLine="Sub timeOut_Tick()";
RDebugUtils.currentLine=29884417;
 //BA.debugLineNum = 29884417;BA.debugLine="timeDiff = DateTime.Now - lastClick";
__ref._timediff /*long*/  = (long) (__c.DateTime.getNow()-__ref._lastclick /*long*/ );
RDebugUtils.currentLine=29884418;
 //BA.debugLineNum = 29884418;BA.debugLine="If timeDiff > timeOutPeriode Then";
if (__ref._timediff /*long*/ >__ref._timeoutperiode /*int*/ ) { 
RDebugUtils.currentLine=29884419;
 //BA.debugLineNum = 29884419;BA.debugLine="enableTime(False)";
__ref._enabletime /*String*/ (null,__c.False);
RDebugUtils.currentLine=29884420;
 //BA.debugLineNum = 29884420;BA.debugLine="CallSubDelayed(scorebord, \"showPromote\")";
__c.CallSubDelayed(ba,(Object)(_scorebord.getObject()),"showPromote");
RDebugUtils.currentLine=29884422;
 //BA.debugLineNum = 29884422;BA.debugLine="vx = 50";
__ref._vx /*double*/  = 50;
RDebugUtils.currentLine=29884423;
 //BA.debugLineNum = 29884423;BA.debugLine="vy = 50";
__ref._vy /*double*/  = 50;
RDebugUtils.currentLine=29884424;
 //BA.debugLineNum = 29884424;BA.debugLine="enablePromote(True)";
__ref._enablepromote /*String*/ (null,__c.True);
RDebugUtils.currentLine=29884425;
 //BA.debugLineNum = 29884425;BA.debugLine="CallSub2(scorebord, \"setPromoteRunning\", True)";
__c.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"setPromoteRunning",(Object)(__c.True));
 };
RDebugUtils.currentLine=29884430;
 //BA.debugLineNum = 29884430;BA.debugLine="End Sub";
return "";
}
}