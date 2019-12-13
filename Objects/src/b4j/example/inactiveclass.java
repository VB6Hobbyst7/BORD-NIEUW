package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class inactiveclass extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.inactiveclass", this);
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
public b4j.example.parseconfig _parseconfig = null;
public b4j.example.funcinet _funcinet = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 3;BA.debugLine="Public tmr, tmr_draw_promote As Timer";
_tmr = new anywheresoftware.b4a.objects.Timer();
_tmr_draw_promote = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 4;BA.debugLine="Private minute As Long = 60000";
_minute = (long) (60000);
 //BA.debugLineNum = 5;BA.debugLine="Public timeOutPeriode As Int' = 5000 ' 10*minute";
_timeoutperiode = 0;
 //BA.debugLineNum = 6;BA.debugLine="Public lastClick As Long";
_lastclick = 0L;
 //BA.debugLineNum = 7;BA.debugLine="Private timeDiff As Long";
_timediff = 0L;
 //BA.debugLineNum = 8;BA.debugLine="Public frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 9;BA.debugLine="Public pn_promote As Pane";
_pn_promote = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private currentX = 10, currentY = 10 As Double";
_currentx = 10;
_currenty = 10;
 //BA.debugLineNum = 11;BA.debugLine="Public vx = 200, vy = 100 As Double";
_vx = 200;
_vy = 100;
 //BA.debugLineNum = 12;BA.debugLine="Public pnlWidth, pnlHeight As Double";
_pnlwidth = 0;
_pnlheight = 0;
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public String  _drawpromote_tick() throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub drawPromote_Tick()";
 //BA.debugLineNum = 54;BA.debugLine="getBounds";
_getbounds();
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _enablepromote(boolean _enable) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub enablePromote(enable As Boolean)";
 //BA.debugLineNum = 48;BA.debugLine="tmr_draw_promote.Enabled = enable";
_tmr_draw_promote.setEnabled(_enable);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _enabletime(boolean _enable) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub enableTime(enable As Boolean)";
 //BA.debugLineNum = 44;BA.debugLine="tmr.Enabled = enable";
_tmr.setEnabled(_enable);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public String  _getbounds() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub getBounds";
 //BA.debugLineNum = 61;BA.debugLine="If (currentX+20) + pnlWidth+20 > frm.Width Then";
if ((_currentx+20)+_pnlwidth+20>_frm.getWidth()) { 
 //BA.debugLineNum = 62;BA.debugLine="vx = -Abs(vx)";
_vx = -__c.Abs(_vx);
 }else if(_currentx<0) { 
 //BA.debugLineNum = 64;BA.debugLine="vx = Abs(vx)";
_vx = __c.Abs(_vx);
 };
 //BA.debugLineNum = 67;BA.debugLine="If (currentY+50) + pnlHeight > frm.Height Then";
if ((_currenty+50)+_pnlheight>_frm.getHeight()) { 
 //BA.debugLineNum = 68;BA.debugLine="vy = -Abs(vy)";
_vy = -__c.Abs(_vy);
 }else if(_currenty<0) { 
 //BA.debugLineNum = 70;BA.debugLine="vy = Abs(vy)";
_vy = __c.Abs(_vy);
 };
 //BA.debugLineNum = 73;BA.debugLine="currentX = currentX + vx";
_currentx = _currentx+_vx;
 //BA.debugLineNum = 74;BA.debugLine="currentY = currentY + vy";
_currenty = _currenty+_vy;
 //BA.debugLineNum = 76;BA.debugLine="CallSubDelayed3(scorebord, \"drawPromote\", current";
__c.CallSubDelayed3(ba,(Object)(_scorebord.getObject()),"drawPromote",(Object)(_currentx),(Object)(_currenty));
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 17;BA.debugLine="timeOutPeriode = (parseConfig.timeOut*(60*1000))";
_timeoutperiode = (int) ((_parseconfig._timeout /*int*/ *(60*1000)));
 //BA.debugLineNum = 19;BA.debugLine="tmr.Initialize(\"timeOut\", timeOutPeriode)";
_tmr.Initialize(ba,"timeOut",(long) (_timeoutperiode));
 //BA.debugLineNum = 20;BA.debugLine="tmr.Enabled = parseConfig.timeOutActive";
_tmr.setEnabled(_parseconfig._timeoutactive /*boolean*/ );
 //BA.debugLineNum = 21;BA.debugLine="tmr_draw_promote.Initialize(\"drawPromote\", 5000)";
_tmr_draw_promote.Initialize(ba,"drawPromote",(long) (5000));
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _timeout_tick() throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub timeOut_Tick()";
 //BA.debugLineNum = 28;BA.debugLine="timeDiff = DateTime.Now - lastClick";
_timediff = (long) (__c.DateTime.getNow()-_lastclick);
 //BA.debugLineNum = 29;BA.debugLine="If timeDiff > timeOutPeriode Then";
if (_timediff>_timeoutperiode) { 
 //BA.debugLineNum = 30;BA.debugLine="enableTime(False)";
_enabletime(__c.False);
 //BA.debugLineNum = 31;BA.debugLine="CallSubDelayed(scorebord, \"showPromote\")";
__c.CallSubDelayed(ba,(Object)(_scorebord.getObject()),"showPromote");
 //BA.debugLineNum = 33;BA.debugLine="vx = 50";
_vx = 50;
 //BA.debugLineNum = 34;BA.debugLine="vy = 50";
_vy = 50;
 //BA.debugLineNum = 35;BA.debugLine="enablePromote(True)";
_enablepromote(__c.True);
 //BA.debugLineNum = 36;BA.debugLine="CallSub2(scorebord, \"setPromoteRunning\", True)";
__c.CallSubNew2(ba,(Object)(_scorebord.getObject()),"setPromoteRunning",(Object)(__c.True));
 };
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _updatepromote() throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub updatePromote";
 //BA.debugLineNum = 81;BA.debugLine="timeOutPeriode = (parseConfig.timeOut*(60*1000))";
_timeoutperiode = (int) ((_parseconfig._timeout /*int*/ *(60*1000)));
 //BA.debugLineNum = 83;BA.debugLine="tmr.Enabled = False";
_tmr.setEnabled(__c.False);
 //BA.debugLineNum = 84;BA.debugLine="tmr.Interval = timeOutPeriode";
_tmr.setInterval((long) (_timeoutperiode));
 //BA.debugLineNum = 85;BA.debugLine="tmr.Enabled = True";
_tmr.setEnabled(__c.True);
 //BA.debugLineNum = 86;BA.debugLine="If parseConfig.useDigitalFont Then";
if (_parseconfig._usedigitalfont /*boolean*/ ) { 
 //BA.debugLineNum = 88;BA.debugLine="CallSub2(scorebord, \"useDigitalFont\", parseConfi";
__c.CallSubNew2(ba,(Object)(_scorebord.getObject()),"useDigitalFont",(Object)(_parseconfig._usedigitalfont /*boolean*/ ));
 };
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
