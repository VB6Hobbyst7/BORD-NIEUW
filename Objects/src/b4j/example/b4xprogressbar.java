package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xprogressbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xprogressbar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xprogressbar.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _bcolor = 0;
public int _pcolor = 0;
public float _thickness = 0f;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public boolean _vertical = false;
public float _currentvalue = 0f;
public int _durationfromzeroto100 = 0;
public b4j.example.cssutils _cssutils = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.main _main = null;
public b4j.example.scorebord _scorebord = null;
public b4j.example.func _func = null;
public b4j.example.funcinet _funcinet = null;
public b4j.example.parseconfig _parseconfig = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _setprogress(b4j.example.b4xprogressbar __ref,float _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressbar";
if (Debug.shouldDelegate(ba, "setprogress", false))
	 {return ((String) Debug.delegate(ba, "setprogress", new Object[] {_v}));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Public Sub setProgress(v As Float)";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="AnimateValueTo(v)";
__ref._animatevalueto /*void*/ (null,_v);
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="End Sub";
return "";
}
public void  _animatevalueto(b4j.example.b4xprogressbar __ref,float _newvalue) throws Exception{
RDebugUtils.currentModule="b4xprogressbar";
if (Debug.shouldDelegate(ba, "animatevalueto", false))
	 {Debug.delegate(ba, "animatevalueto", new Object[] {_newvalue}); return;}
ResumableSub_AnimateValueTo rsub = new ResumableSub_AnimateValueTo(this,__ref,_newvalue);
rsub.resume(ba, null);
}
public static class ResumableSub_AnimateValueTo extends BA.ResumableSub {
public ResumableSub_AnimateValueTo(b4j.example.b4xprogressbar parent,b4j.example.b4xprogressbar __ref,float _newvalue) {
this.parent = parent;
this.__ref = __ref;
this._newvalue = _newvalue;
this.__ref = parent;
}
b4j.example.b4xprogressbar __ref;
b4j.example.b4xprogressbar parent;
float _newvalue;
long _n = 0L;
int _duration = 0;
float _start = 0f;
float _tempvalue = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xprogressbar";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="Dim n As Long = DateTime.Now";
_n = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="Dim duration As Int = Abs(currentValue - NewValue";
_duration = (int) (parent.__c.Abs(__ref._currentvalue /*float*/ -_newvalue)/(double)100*__ref._durationfromzeroto100 /*int*/ +1000);
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="Dim start As Float = currentValue";
_start = __ref._currentvalue /*float*/ ;
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="currentValue = NewValue";
__ref._currentvalue /*float*/  = _newvalue;
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="Dim tempValue As Float";
_tempvalue = 0f;
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="duration = 0";
_duration = (int) (0);
RDebugUtils.currentLine=5636103;
 //BA.debugLineNum = 5636103;BA.debugLine="Do While DateTime.Now < n + duration";
if (true) break;

case 1:
//do while
this.state = 10;
while (parent.__c.DateTime.getNow()<_n+_duration) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=5636104;
 //BA.debugLineNum = 5636104;BA.debugLine="tempValue = ValueFromTimeEaseInOut(DateTime.Now";
_tempvalue = __ref._valuefromtimeeaseinout /*float*/ (null,(float) (parent.__c.DateTime.getNow()-_n),_start,(float) (_newvalue-_start),_duration);
RDebugUtils.currentLine=5636105;
 //BA.debugLineNum = 5636105;BA.debugLine="DrawValue(tempValue)";
__ref._drawvalue /*String*/ (null,_tempvalue);
RDebugUtils.currentLine=5636106;
 //BA.debugLineNum = 5636106;BA.debugLine="Sleep(10)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xprogressbar", "animatevalueto"),(int) (10));
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
RDebugUtils.currentLine=5636107;
 //BA.debugLineNum = 5636107;BA.debugLine="If NewValue <> currentValue Then Return 'will ha";
if (true) break;

case 4:
//if
this.state = 9;
if (_newvalue!=__ref._currentvalue /*float*/ ) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) return ;
if (true) break;

case 9:
//C
this.state = 1;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=5636109;
 //BA.debugLineNum = 5636109;BA.debugLine="DrawValue(currentValue)";
__ref._drawvalue /*String*/ (null,__ref._currentvalue /*float*/ );
RDebugUtils.currentLine=5636110;
 //BA.debugLineNum = 5636110;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public float  _valuefromtimeeaseinout(b4j.example.b4xprogressbar __ref,float _time,float _start,float _changeinvalue,int _duration) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressbar";
if (Debug.shouldDelegate(ba, "valuefromtimeeaseinout", false))
	 {return ((Float) Debug.delegate(ba, "valuefromtimeeaseinout", new Object[] {_time,_start,_changeinvalue,_duration}));}
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Private Sub ValueFromTimeEaseInOut(Time As Float,";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Time = Time / (Duration / 2)";
_time = (float) (_time/(double)(_duration/(double)2));
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="If Time < 1 Then";
if (_time<1) { 
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="Return ChangeInValue / 2 * Time * Time * Time *";
if (true) return (float) (_changeinvalue/(double)2*_time*_time*_time*_time+_start);
 }else {
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="Time = Time - 2";
_time = (float) (_time-2);
RDebugUtils.currentLine=5701638;
 //BA.debugLineNum = 5701638;BA.debugLine="Return -ChangeInValue / 2 * (Time * Time * Time";
if (true) return (float) (-_changeinvalue/(double)2*(_time*_time*_time*_time-2)+_start);
 };
RDebugUtils.currentLine=5701640;
 //BA.debugLineNum = 5701640;BA.debugLine="End Sub";
return 0f;
}
public String  _drawvalue(b4j.example.b4xprogressbar __ref,float _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressbar";
if (Debug.shouldDelegate(ba, "drawvalue", false))
	 {return ((String) Debug.delegate(ba, "drawvalue", new Object[] {_value}));}
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Private Sub DrawValue(Value As Float)";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="If vertical Then";
if (__ref._vertical /*boolean*/ ) { 
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="cvs.DrawLine(cvs.TargetRect.CenterX, 0, cvs.Targ";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),(float) (0),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getBottom(),__ref._bcolor /*int*/ ,__ref._thickness /*float*/ );
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="cvs.DrawLine(cvs.TargetRect.CenterX, 0, cvs.Targ";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),(float) (0),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),(float) (_value/(double)100*__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getBottom()),__ref._pcolor /*int*/ ,__ref._thickness /*float*/ );
 }else {
RDebugUtils.currentLine=5767174;
 //BA.debugLineNum = 5767174;BA.debugLine="cvs.DrawLine(0, cvs.TargetRect.CenterY, cvs.Targ";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (0),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getRight(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),__ref._bcolor /*int*/ ,__ref._thickness /*float*/ );
RDebugUtils.currentLine=5767175;
 //BA.debugLineNum = 5767175;BA.debugLine="cvs.DrawLine(0, cvs.TargetRect.CenterY, Value /";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (0),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),(float) (_value/(double)100*__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getRight()),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),__ref._pcolor /*int*/ ,__ref._thickness /*float*/ );
 };
RDebugUtils.currentLine=5767177;
 //BA.debugLineNum = 5767177;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=5767178;
 //BA.debugLineNum = 5767178;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4j.example.b4xprogressbar __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressbar";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize(_width,_height);
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="AnimateValueTo(currentValue)";
__ref._animatevalueto /*void*/ (null,__ref._currentvalue /*float*/ );
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressbar";
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="Private mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="Private bcolor, pcolor As Int";
_bcolor = 0;
_pcolor = 0;
RDebugUtils.currentLine=5242886;
 //BA.debugLineNum = 5242886;BA.debugLine="Private thickness As Float";
_thickness = 0f;
RDebugUtils.currentLine=5242887;
 //BA.debugLineNum = 5242887;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=5242888;
 //BA.debugLineNum = 5242888;BA.debugLine="Private vertical As Boolean";
_vertical = false;
RDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="Private currentValue As Float";
_currentvalue = 0f;
RDebugUtils.currentLine=5242890;
 //BA.debugLineNum = 5242890;BA.debugLine="Private DurationFromZeroTo100 As Int = 500";
_durationfromzeroto100 = (int) (500);
RDebugUtils.currentLine=5242892;
 //BA.debugLineNum = 5242892;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4j.example.b4xprogressbar __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressbar";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setObject((java.lang.Object)(_base));
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="bcolor = xui.PaintOrColorToColor(Props.Get(\"Backg";
__ref._bcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("BackgroundColor")));
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="pcolor = xui.PaintOrColorToColor(Props.Get(\"Progr";
__ref._pcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ProgressColor")));
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="thickness = DipToCurrent(Props.Get(\"Thickness\"))";
__ref._thickness /*float*/  = (float) (__c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("Thickness"))))));
RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="vertical = Props.Get(\"Orientation\") = \"Vertical\"";
__ref._vertical /*boolean*/  = (_props.Get((Object)("Orientation"))).equals((Object)("Vertical"));
RDebugUtils.currentLine=5373958;
 //BA.debugLineNum = 5373958;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=5373959;
 //BA.debugLineNum = 5373959;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=5373960;
 //BA.debugLineNum = 5373960;BA.debugLine="End Sub";
return "";
}
public float  _getprogress(b4j.example.b4xprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressbar";
if (Debug.shouldDelegate(ba, "getprogress", false))
	 {return ((Float) Debug.delegate(ba, "getprogress", null));}
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Public Sub getProgress As Float";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Return currentValue";
if (true) return __ref._currentvalue /*float*/ ;
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="End Sub";
return 0f;
}
public String  _initialize(b4j.example.b4xprogressbar __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xprogressbar";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="End Sub";
return "";
}
}