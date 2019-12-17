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
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Sub enableTime(enable As Boolean)";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="tmr.Enabled = enable";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(_enable);
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="End Sub";
return "";
}
public String  _enablepromote(b4j.example.inactiveclass __ref,boolean _enable) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "enablepromote", false))
	 {return ((String) Debug.delegate(ba, "enablepromote", new Object[] {_enable}));}
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Sub enablePromote(enable As Boolean)";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="tmr_draw_promote.Enabled = enable";
__ref._tmr_draw_promote /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(_enable);
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.inactiveclass __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="timeOutPeriode = (parseConfig.timeOut*(60*1000))";
__ref._timeoutperiode /*int*/  = (int) ((_parseconfig._timeout /*int*/ *(60*1000)));
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="tmr.Initialize(\"timeOut\", timeOutPeriode)";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"timeOut",(long) (__ref._timeoutperiode /*int*/ ));
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="tmr.Enabled = parseConfig.timeOutActive";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(_parseconfig._timeoutactive /*boolean*/ );
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="tmr_draw_promote.Initialize(\"drawPromote\", 5000)";
__ref._tmr_draw_promote /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"drawPromote",(long) (5000));
RDebugUtils.currentLine=8781832;
 //BA.debugLineNum = 8781832;BA.debugLine="End Sub";
return "";
}
public String  _updatepromote(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "updatepromote", false))
	 {return ((String) Debug.delegate(ba, "updatepromote", null));}
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Sub updatePromote";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="timeOutPeriode = (parseConfig.timeOut*(60*1000))";
__ref._timeoutperiode /*int*/  = (int) ((_parseconfig._timeout /*int*/ *(60*1000)));
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="tmr.Enabled = False";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="tmr.Interval = timeOutPeriode";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._timeoutperiode /*int*/ ));
RDebugUtils.currentLine=9175045;
 //BA.debugLineNum = 9175045;BA.debugLine="tmr.Enabled = True";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=9175046;
 //BA.debugLineNum = 9175046;BA.debugLine="If parseConfig.useDigitalFont Then";
if (_parseconfig._usedigitalfont /*boolean*/ ) { 
RDebugUtils.currentLine=9175048;
 //BA.debugLineNum = 9175048;BA.debugLine="CallSub2(scorebord, \"useDigitalFont\", parseConfi";
__c.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"useDigitalFont",(Object)(_parseconfig._usedigitalfont /*boolean*/ ));
 };
RDebugUtils.currentLine=9175050;
 //BA.debugLineNum = 9175050;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="Public tmr, tmr_draw_promote As Timer";
_tmr = new anywheresoftware.b4a.objects.Timer();
_tmr_draw_promote = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="Public timeOutPeriode As Int' = 5000 ' 10*minute";
_timeoutperiode = 0;
RDebugUtils.currentLine=8716293;
 //BA.debugLineNum = 8716293;BA.debugLine="Public lastClick As Long";
_lastclick = 0L;
RDebugUtils.currentLine=8716294;
 //BA.debugLineNum = 8716294;BA.debugLine="Private timeDiff As Long";
_timediff = 0L;
RDebugUtils.currentLine=8716295;
 //BA.debugLineNum = 8716295;BA.debugLine="Public frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=8716296;
 //BA.debugLineNum = 8716296;BA.debugLine="Public pn_promote As Pane";
_pn_promote = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=8716297;
 //BA.debugLineNum = 8716297;BA.debugLine="Private currentX = 10, currentY = 10 As Double";
_currentx = 10;
_currenty = 10;
RDebugUtils.currentLine=8716298;
 //BA.debugLineNum = 8716298;BA.debugLine="Public vx = 200, vy = 100 As Double";
_vx = 200;
_vy = 100;
RDebugUtils.currentLine=8716299;
 //BA.debugLineNum = 8716299;BA.debugLine="Public pnlWidth, pnlHeight As Double";
_pnlwidth = 0;
_pnlheight = 0;
RDebugUtils.currentLine=8716300;
 //BA.debugLineNum = 8716300;BA.debugLine="End Sub";
return "";
}
public String  _drawpromote_tick(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "drawpromote_tick", false))
	 {return ((String) Debug.delegate(ba, "drawpromote_tick", null));}
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Sub drawPromote_Tick()";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="getBounds";
__ref._getbounds /*String*/ (null);
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="End Sub";
return "";
}
public String  _getbounds(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "getbounds", false))
	 {return ((String) Debug.delegate(ba, "getbounds", null));}
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Sub getBounds";
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="If (currentX+20) + pnlWidth+20 > frm.Width Then";
if ((__ref._currentx /*double*/ +20)+__ref._pnlwidth /*double*/ +20>__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getWidth()) { 
RDebugUtils.currentLine=9109509;
 //BA.debugLineNum = 9109509;BA.debugLine="vx = -Abs(vx)";
__ref._vx /*double*/  = -__c.Abs(__ref._vx /*double*/ );
 }else 
{RDebugUtils.currentLine=9109510;
 //BA.debugLineNum = 9109510;BA.debugLine="Else If currentX < 0 Then";
if (__ref._currentx /*double*/ <0) { 
RDebugUtils.currentLine=9109511;
 //BA.debugLineNum = 9109511;BA.debugLine="vx = Abs(vx)";
__ref._vx /*double*/  = __c.Abs(__ref._vx /*double*/ );
 }}
;
RDebugUtils.currentLine=9109514;
 //BA.debugLineNum = 9109514;BA.debugLine="If (currentY+50) + pnlHeight > frm.Height Then";
if ((__ref._currenty /*double*/ +50)+__ref._pnlheight /*double*/ >__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getHeight()) { 
RDebugUtils.currentLine=9109515;
 //BA.debugLineNum = 9109515;BA.debugLine="vy = -Abs(vy)";
__ref._vy /*double*/  = -__c.Abs(__ref._vy /*double*/ );
 }else 
{RDebugUtils.currentLine=9109516;
 //BA.debugLineNum = 9109516;BA.debugLine="Else If currentY < 0 Then";
if (__ref._currenty /*double*/ <0) { 
RDebugUtils.currentLine=9109517;
 //BA.debugLineNum = 9109517;BA.debugLine="vy = Abs(vy)";
__ref._vy /*double*/  = __c.Abs(__ref._vy /*double*/ );
 }}
;
RDebugUtils.currentLine=9109520;
 //BA.debugLineNum = 9109520;BA.debugLine="currentX = currentX + vx";
__ref._currentx /*double*/  = __ref._currentx /*double*/ +__ref._vx /*double*/ ;
RDebugUtils.currentLine=9109521;
 //BA.debugLineNum = 9109521;BA.debugLine="currentY = currentY + vy";
__ref._currenty /*double*/  = __ref._currenty /*double*/ +__ref._vy /*double*/ ;
RDebugUtils.currentLine=9109523;
 //BA.debugLineNum = 9109523;BA.debugLine="CallSubDelayed3(scorebord, \"drawPromote\", current";
__c.CallSubDelayed3(ba,(Object)(_scorebord.getObject()),"drawPromote",(Object)(__ref._currentx /*double*/ ),(Object)(__ref._currenty /*double*/ ));
RDebugUtils.currentLine=9109524;
 //BA.debugLineNum = 9109524;BA.debugLine="End Sub";
return "";
}
public String  _timeout_tick(b4j.example.inactiveclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inactiveclass";
if (Debug.shouldDelegate(ba, "timeout_tick", false))
	 {return ((String) Debug.delegate(ba, "timeout_tick", null));}
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Sub timeOut_Tick()";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="timeDiff = DateTime.Now - lastClick";
__ref._timediff /*long*/  = (long) (__c.DateTime.getNow()-__ref._lastclick /*long*/ );
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="If timeDiff > timeOutPeriode Then";
if (__ref._timediff /*long*/ >__ref._timeoutperiode /*int*/ ) { 
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="enableTime(False)";
__ref._enabletime /*String*/ (null,__c.False);
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="CallSubDelayed(scorebord, \"showPromote\")";
__c.CallSubDelayed(ba,(Object)(_scorebord.getObject()),"showPromote");
RDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="vx = 50";
__ref._vx /*double*/  = 50;
RDebugUtils.currentLine=8847367;
 //BA.debugLineNum = 8847367;BA.debugLine="vy = 50";
__ref._vy /*double*/  = 50;
RDebugUtils.currentLine=8847368;
 //BA.debugLineNum = 8847368;BA.debugLine="enablePromote(True)";
__ref._enablepromote /*String*/ (null,__c.True);
RDebugUtils.currentLine=8847369;
 //BA.debugLineNum = 8847369;BA.debugLine="CallSub2(scorebord, \"setPromoteRunning\", True)";
__c.CallSubDebug2(ba,(Object)(_scorebord.getObject()),"setPromoteRunning",(Object)(__c.True));
 };
RDebugUtils.currentLine=8847374;
 //BA.debugLineNum = 8847374;BA.debugLine="End Sub";
return "";
}
}