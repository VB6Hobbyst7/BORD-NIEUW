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
public long _minute = 0L;
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
public b4j.example.cssutils _cssutils = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.main _main = null;
public b4j.example.scorebord _scorebord = null;
public b4j.example.func _func = null;
public b4j.example.funcinet _funcinet = null;
public b4j.example.parseconfig _parseconfig = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _enabletime(b4j.example.inactiveclass __ref,boolean _enable) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "enabletime", false))
	 {return ((String) Debug.delegate(ba, "enabletime", new Object[] {_enable}));}
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Sub enableTime(enable As Boolean)";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="tmr.Enabled = enable";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(_enable);
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="End Sub";
return "";
}
public String  _enablepromote(b4j.example.inactiveclass __ref,boolean _enable) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "enablepromote", false))
	 {return ((String) Debug.delegate(ba, "enablepromote", new Object[] {_enable}));}
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Sub enablePromote(enable As Boolean)";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="tmr_draw_promote.Enabled = enable";
__ref._tmr_draw_promote /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(_enable);
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.inactiveclass __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="timeOutPeriode = (parseConfig.timeOut*(60*1000))";
__ref._timeoutperiode /*int*/  = (int) ((_parseconfig._timeout /*int*/ *(60*1000)));
RDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="tmr.Initialize(\"timeOut\", timeOutPeriode)";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"timeOut",(long) (__ref._timeoutperiode /*int*/ ));
RDebugUtils.currentLine=7143428;
 //BA.debugLineNum = 7143428;BA.debugLine="tmr.Enabled = parseConfig.timeOutActive";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(_parseconfig._timeoutactive /*boolean*/ );
RDebugUtils.currentLine=7143429;
 //BA.debugLineNum = 7143429;BA.debugLine="tmr_draw_promote.Initialize(\"drawPromote\", 5000)";
__ref._tmr_draw_promote /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"drawPromote",(long) (5000));
RDebugUtils.currentLine=7143432;
 //BA.debugLineNum = 7143432;BA.debugLine="End Sub";
return "";
}
public String  _updatepromote(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "updatepromote", false))
	 {return ((String) Debug.delegate(ba, "updatepromote", null));}
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Sub updatePromote";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="timeOutPeriode = (parseConfig.timeOut*(60*1000))";
__ref._timeoutperiode /*int*/  = (int) ((_parseconfig._timeout /*int*/ *(60*1000)));
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="Log($\"INTERVAL =  ${timeOutPeriode}\"$)";
__c.Log(("INTERVAL =  "+__c.SmartStringFormatter("",(Object)(__ref._timeoutperiode /*int*/ ))+""));
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="tmr.Enabled = False";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="tmr.Interval = timeOutPeriode";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._timeoutperiode /*int*/ ));
RDebugUtils.currentLine=7536645;
 //BA.debugLineNum = 7536645;BA.debugLine="tmr.Enabled = True";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=7536646;
 //BA.debugLineNum = 7536646;BA.debugLine="Log($\"INTERVAL =  ${tmr.Interval}\"$)";
__c.Log(("INTERVAL =  "+__c.SmartStringFormatter("",(Object)(__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .getInterval()))+""));
RDebugUtils.currentLine=7536648;
 //BA.debugLineNum = 7536648;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="Public tmr, tmr_draw_promote As Timer";
_tmr = new anywheresoftware.b4a.objects.Timer();
_tmr_draw_promote = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="Private minute As Long = 60000";
_minute = (long) (60000);
RDebugUtils.currentLine=7077892;
 //BA.debugLineNum = 7077892;BA.debugLine="Public timeOutPeriode As Int' = 5000 ' 10*minute";
_timeoutperiode = 0;
RDebugUtils.currentLine=7077893;
 //BA.debugLineNum = 7077893;BA.debugLine="Public lastClick As Long";
_lastclick = 0L;
RDebugUtils.currentLine=7077894;
 //BA.debugLineNum = 7077894;BA.debugLine="Private timeDiff As Long";
_timediff = 0L;
RDebugUtils.currentLine=7077895;
 //BA.debugLineNum = 7077895;BA.debugLine="Public frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=7077896;
 //BA.debugLineNum = 7077896;BA.debugLine="Public pn_promote As Pane";
_pn_promote = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=7077897;
 //BA.debugLineNum = 7077897;BA.debugLine="Private currentX = 10, currentY = 10 As Double";
_currentx = 10;
_currenty = 10;
RDebugUtils.currentLine=7077898;
 //BA.debugLineNum = 7077898;BA.debugLine="Public vx = 200, vy = 100 As Double";
_vx = 200;
_vy = 100;
RDebugUtils.currentLine=7077899;
 //BA.debugLineNum = 7077899;BA.debugLine="Public pnlWidth, pnlHeight As Double";
_pnlwidth = 0;
_pnlheight = 0;
RDebugUtils.currentLine=7077900;
 //BA.debugLineNum = 7077900;BA.debugLine="End Sub";
return "";
}
public String  _drawpromote_tick(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "drawpromote_tick", false))
	 {return ((String) Debug.delegate(ba, "drawpromote_tick", null));}
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Sub drawPromote_Tick()";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="getBounds";
__ref._getbounds /*String*/ (null);
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="End Sub";
return "";
}
public String  _getbounds(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "getbounds", false))
	 {return ((String) Debug.delegate(ba, "getbounds", null));}
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Sub getBounds";
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="Log(currentY)";
__c.Log(BA.NumberToString(__ref._currenty /*double*/ ));
RDebugUtils.currentLine=7471108;
 //BA.debugLineNum = 7471108;BA.debugLine="If (currentX+20) + pnlWidth+20 > frm.Width Then";
if ((__ref._currentx /*double*/ +20)+__ref._pnlwidth /*double*/ +20>__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getWidth()) { 
RDebugUtils.currentLine=7471109;
 //BA.debugLineNum = 7471109;BA.debugLine="vx = -Abs(vx)";
__ref._vx /*double*/  = -__c.Abs(__ref._vx /*double*/ );
 }else 
{RDebugUtils.currentLine=7471110;
 //BA.debugLineNum = 7471110;BA.debugLine="Else If currentX < 0 Then";
if (__ref._currentx /*double*/ <0) { 
RDebugUtils.currentLine=7471111;
 //BA.debugLineNum = 7471111;BA.debugLine="vx = Abs(vx)";
__ref._vx /*double*/  = __c.Abs(__ref._vx /*double*/ );
 }}
;
RDebugUtils.currentLine=7471114;
 //BA.debugLineNum = 7471114;BA.debugLine="If (currentY+50) + pnlHeight > frm.Height Then";
if ((__ref._currenty /*double*/ +50)+__ref._pnlheight /*double*/ >__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getHeight()) { 
RDebugUtils.currentLine=7471115;
 //BA.debugLineNum = 7471115;BA.debugLine="vy = -Abs(vy)";
__ref._vy /*double*/  = -__c.Abs(__ref._vy /*double*/ );
 }else 
{RDebugUtils.currentLine=7471116;
 //BA.debugLineNum = 7471116;BA.debugLine="Else If currentY < 0 Then";
if (__ref._currenty /*double*/ <0) { 
RDebugUtils.currentLine=7471117;
 //BA.debugLineNum = 7471117;BA.debugLine="vy = Abs(vy)";
__ref._vy /*double*/  = __c.Abs(__ref._vy /*double*/ );
 }}
;
RDebugUtils.currentLine=7471120;
 //BA.debugLineNum = 7471120;BA.debugLine="currentX = currentX + vx";
__ref._currentx /*double*/  = __ref._currentx /*double*/ +__ref._vx /*double*/ ;
RDebugUtils.currentLine=7471121;
 //BA.debugLineNum = 7471121;BA.debugLine="currentY = currentY + vy";
__ref._currenty /*double*/  = __ref._currenty /*double*/ +__ref._vy /*double*/ ;
RDebugUtils.currentLine=7471123;
 //BA.debugLineNum = 7471123;BA.debugLine="CallSubDelayed3(scorebord, \"drawPromote\", current";
__c.CallSubDelayed3(ba,(Object)(_scorebord.getObject()),"drawPromote",(Object)(__ref._currentx /*double*/ ),(Object)(__ref._currenty /*double*/ ));
RDebugUtils.currentLine=7471124;
 //BA.debugLineNum = 7471124;BA.debugLine="End Sub";
return "";
}
public String  _timeout_tick(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "timeout_tick", false))
	 {return ((String) Debug.delegate(ba, "timeout_tick", null));}
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Sub timeOut_Tick()";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="timeDiff = DateTime.Now - lastClick";
__ref._timediff /*long*/  = (long) (__c.DateTime.getNow()-__ref._lastclick /*long*/ );
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="If timeDiff > timeOutPeriode Then";
if (__ref._timediff /*long*/ >__ref._timeoutperiode /*int*/ ) { 
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="enableTime(False)";
__ref._enabletime /*String*/ (null,__c.False);
RDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="CallSubDelayed(scorebord, \"showPromote\")";
__c.CallSubDelayed(ba,(Object)(_scorebord.getObject()),"showPromote");
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="Log($\"TIMEOUT DETECTED\"$)";
__c.Log(("TIMEOUT DETECTED"));
RDebugUtils.currentLine=7208966;
 //BA.debugLineNum = 7208966;BA.debugLine="vx = 50";
__ref._vx /*double*/  = 50;
RDebugUtils.currentLine=7208967;
 //BA.debugLineNum = 7208967;BA.debugLine="vy = 50";
__ref._vy /*double*/  = 50;
RDebugUtils.currentLine=7208968;
 //BA.debugLineNum = 7208968;BA.debugLine="enablePromote(True)";
__ref._enablepromote /*String*/ (null,__c.True);
RDebugUtils.currentLine=7208969;
 //BA.debugLineNum = 7208969;BA.debugLine="CallSub2(scorebord, \"setPromoteRunning\", True)";
__c.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"setPromoteRunning",(Object)(__c.True));
 };
RDebugUtils.currentLine=7208974;
 //BA.debugLineNum = 7208974;BA.debugLine="End Sub";
return "";
}
}