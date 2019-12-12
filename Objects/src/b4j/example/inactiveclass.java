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
public anywheresoftware.b4j.objects.JFX _vvvvvvvv3 = null;
public anywheresoftware.b4a.objects.Timer _vvvvvvvv4 = null;
public anywheresoftware.b4a.objects.Timer _tmr_draw_promote = null;
public long _vvvvvvvvvv4 = 0L;
public int _vvvvvvvvvv5 = 0;
public long _lastclick = 0L;
public long _vvvvvvvvvv6 = 0L;
public anywheresoftware.b4j.objects.Form _vvvvvvvvvv7 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pn_promote = null;
public double _vvvvvvvvvv0 = 0;
public double _vvvvvvvvvvv1 = 0;
public double _vvvvvvvvvvv2 = 0;
public double _vvvvvvvvvvv3 = 0;
public double _vvvvvvvvvvv4 = 0;
public double _vvvvvvvvvvv5 = 0;
public b4j.example.cssutils _vvvvvvvv0 = null;
public b4j.example.dateutils _vvvvvvvvv1 = null;
public b4j.example.main _main = null;
public b4j.example.scorebord _vvvvvvvvv2 = null;
public b4j.example.func _vvvvvvvvv3 = null;
public b4j.example.parseconfig _vvvvvvvvv4 = null;
public b4j.example.funcinet _vvvvvvvvv5 = null;
public b4j.example.httputils2service _vvvvvvvvv6 = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
_vvvvvvvv3 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 3;BA.debugLine="Public tmr, tmr_draw_promote As Timer";
_vvvvvvvv4 = new anywheresoftware.b4a.objects.Timer();
_tmr_draw_promote = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 4;BA.debugLine="Private minute As Long = 60000";
_vvvvvvvvvv4 = (long) (60000);
 //BA.debugLineNum = 5;BA.debugLine="Public timeOutPeriode As Int' = 5000 ' 10*minute";
_vvvvvvvvvv5 = 0;
 //BA.debugLineNum = 6;BA.debugLine="Public lastClick As Long";
_lastclick = 0L;
 //BA.debugLineNum = 7;BA.debugLine="Private timeDiff As Long";
_vvvvvvvvvv6 = 0L;
 //BA.debugLineNum = 8;BA.debugLine="Public frm As Form";
_vvvvvvvvvv7 = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 9;BA.debugLine="Public pn_promote As Pane";
_pn_promote = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private currentX = 10, currentY = 10 As Double";
_vvvvvvvvvv0 = 10;
_vvvvvvvvvvv1 = 10;
 //BA.debugLineNum = 11;BA.debugLine="Public vx = 200, vy = 100 As Double";
_vvvvvvvvvvv2 = 200;
_vvvvvvvvvvv3 = 100;
 //BA.debugLineNum = 12;BA.debugLine="Public pnlWidth, pnlHeight As Double";
_vvvvvvvvvvv4 = 0;
_vvvvvvvvvvv5 = 0;
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public String  _drawpromote_tick() throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub drawPromote_Tick()";
 //BA.debugLineNum = 54;BA.debugLine="getBounds";
_getvvvvvvvvvv3();
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvv7(boolean _enable) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub enablePromote(enable As Boolean)";
 //BA.debugLineNum = 48;BA.debugLine="tmr_draw_promote.Enabled = enable";
_tmr_draw_promote.setEnabled(_enable);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvv0(boolean _enable) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub enableTime(enable As Boolean)";
 //BA.debugLineNum = 44;BA.debugLine="tmr.Enabled = enable";
_vvvvvvvv4.setEnabled(_enable);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public String  _getvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub getBounds";
 //BA.debugLineNum = 61;BA.debugLine="If (currentX+20) + pnlWidth+20 > frm.Width Then";
if ((_vvvvvvvvvv0+20)+_vvvvvvvvvvv4+20>_vvvvvvvvvv7.getWidth()) { 
 //BA.debugLineNum = 62;BA.debugLine="vx = -Abs(vx)";
_vvvvvvvvvvv2 = -__c.Abs(_vvvvvvvvvvv2);
 }else if(_vvvvvvvvvv0<0) { 
 //BA.debugLineNum = 64;BA.debugLine="vx = Abs(vx)";
_vvvvvvvvvvv2 = __c.Abs(_vvvvvvvvvvv2);
 };
 //BA.debugLineNum = 67;BA.debugLine="If (currentY+50) + pnlHeight > frm.Height Then";
if ((_vvvvvvvvvvv1+50)+_vvvvvvvvvvv5>_vvvvvvvvvv7.getHeight()) { 
 //BA.debugLineNum = 68;BA.debugLine="vy = -Abs(vy)";
_vvvvvvvvvvv3 = -__c.Abs(_vvvvvvvvvvv3);
 }else if(_vvvvvvvvvvv1<0) { 
 //BA.debugLineNum = 70;BA.debugLine="vy = Abs(vy)";
_vvvvvvvvvvv3 = __c.Abs(_vvvvvvvvvvv3);
 };
 //BA.debugLineNum = 73;BA.debugLine="currentX = currentX + vx";
_vvvvvvvvvv0 = _vvvvvvvvvv0+_vvvvvvvvvvv2;
 //BA.debugLineNum = 74;BA.debugLine="currentY = currentY + vy";
_vvvvvvvvvvv1 = _vvvvvvvvvvv1+_vvvvvvvvvvv3;
 //BA.debugLineNum = 76;BA.debugLine="CallSubDelayed3(scorebord, \"drawPromote\", current";
__c.CallSubDelayed3(ba,(Object)(_vvvvvvvvv2.getObject()),"drawPromote",(Object)(_vvvvvvvvvv0),(Object)(_vvvvvvvvvvv1));
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 17;BA.debugLine="timeOutPeriode = (parseConfig.timeOut*(60*1000))";
_vvvvvvvvvv5 = (int) ((_vvvvvvvvv4._vvvvvvv2 /*int*/ *(60*1000)));
 //BA.debugLineNum = 19;BA.debugLine="tmr.Initialize(\"timeOut\", timeOutPeriode)";
_vvvvvvvv4.Initialize(ba,"timeOut",(long) (_vvvvvvvvvv5));
 //BA.debugLineNum = 20;BA.debugLine="tmr.Enabled = parseConfig.timeOutActive";
_vvvvvvvv4.setEnabled(_vvvvvvvvv4._vvvvvvv3 /*boolean*/ );
 //BA.debugLineNum = 21;BA.debugLine="tmr_draw_promote.Initialize(\"drawPromote\", 5000)";
_tmr_draw_promote.Initialize(ba,"drawPromote",(long) (5000));
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _timeout_tick() throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub timeOut_Tick()";
 //BA.debugLineNum = 28;BA.debugLine="timeDiff = DateTime.Now - lastClick";
_vvvvvvvvvv6 = (long) (__c.DateTime.getNow()-_lastclick);
 //BA.debugLineNum = 29;BA.debugLine="If timeDiff > timeOutPeriode Then";
if (_vvvvvvvvvv6>_vvvvvvvvvv5) { 
 //BA.debugLineNum = 30;BA.debugLine="enableTime(False)";
_vvvvvvvvv0(__c.False);
 //BA.debugLineNum = 31;BA.debugLine="CallSubDelayed(scorebord, \"showPromote\")";
__c.CallSubDelayed(ba,(Object)(_vvvvvvvvv2.getObject()),"showPromote");
 //BA.debugLineNum = 33;BA.debugLine="vx = 50";
_vvvvvvvvvvv2 = 50;
 //BA.debugLineNum = 34;BA.debugLine="vy = 50";
_vvvvvvvvvvv3 = 50;
 //BA.debugLineNum = 35;BA.debugLine="enablePromote(True)";
_vvvvvvvvv7(__c.True);
 //BA.debugLineNum = 36;BA.debugLine="CallSub2(scorebord, \"setPromoteRunning\", True)";
__c.CallSubNew2(ba,(Object)(_vvvvvvvvv2.getObject()),"setPromoteRunning",(Object)(__c.True));
 };
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvv2() throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub updatePromote";
 //BA.debugLineNum = 81;BA.debugLine="timeOutPeriode = (parseConfig.timeOut*(60*1000))";
_vvvvvvvvvv5 = (int) ((_vvvvvvvvv4._vvvvvvv2 /*int*/ *(60*1000)));
 //BA.debugLineNum = 83;BA.debugLine="tmr.Enabled = False";
_vvvvvvvv4.setEnabled(__c.False);
 //BA.debugLineNum = 84;BA.debugLine="tmr.Interval = timeOutPeriode";
_vvvvvvvv4.setInterval((long) (_vvvvvvvvvv5));
 //BA.debugLineNum = 85;BA.debugLine="tmr.Enabled = True";
_vvvvvvvv4.setEnabled(__c.True);
 //BA.debugLineNum = 86;BA.debugLine="If parseConfig.useDigitalFont Then";
if (_vvvvvvvvv4._usedigitalfont /*boolean*/ ) { 
 //BA.debugLineNum = 88;BA.debugLine="CallSub2(scorebord, \"useDigitalFont\", parseConfi";
__c.CallSubNew2(ba,(Object)(_vvvvvvvvv2.getObject()),"useDigitalFont",(Object)(_vvvvvvvvv4._usedigitalfont /*boolean*/ ));
 };
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
