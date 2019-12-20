package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xprogressbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.b4xprogressbar", this);
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
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.scorebord _scorebord = null;
public b4j.example.nieuwe_partij _nieuwe_partij = null;
public b4j.example.func _func = null;
public b4j.example.funcinet _funcinet = null;
public b4j.example.getnode _getnode = null;
public b4j.example.parseconfig _parseconfig = null;
public b4j.example.httputils2service _httputils2service = null;
public void  _animatevalueto(float _newvalue) throws Exception{
ResumableSub_AnimateValueTo rsub = new ResumableSub_AnimateValueTo(this,_newvalue);
rsub.resume(ba, null);
}
public static class ResumableSub_AnimateValueTo extends BA.ResumableSub {
public ResumableSub_AnimateValueTo(b4j.example.b4xprogressbar parent,float _newvalue) {
this.parent = parent;
this._newvalue = _newvalue;
}
b4j.example.b4xprogressbar parent;
float _newvalue;
long _n = 0L;
int _duration = 0;
float _start = 0f;
float _tempvalue = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 50;BA.debugLine="Dim n As Long = DateTime.Now";
_n = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 51;BA.debugLine="Dim duration As Int = Abs(currentValue - NewValue";
_duration = (int) (parent.__c.Abs(parent._currentvalue-_newvalue)/(double)100*parent._durationfromzeroto100+1000);
 //BA.debugLineNum = 52;BA.debugLine="Dim start As Float = currentValue";
_start = parent._currentvalue;
 //BA.debugLineNum = 53;BA.debugLine="currentValue = NewValue";
parent._currentvalue = _newvalue;
 //BA.debugLineNum = 54;BA.debugLine="Dim tempValue As Float";
_tempvalue = 0f;
 //BA.debugLineNum = 55;BA.debugLine="duration = 0";
_duration = (int) (0);
 //BA.debugLineNum = 56;BA.debugLine="Do While DateTime.Now < n + duration";
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
 //BA.debugLineNum = 57;BA.debugLine="tempValue = ValueFromTimeEaseInOut(DateTime.Now";
_tempvalue = parent._valuefromtimeeaseinout((float) (parent.__c.DateTime.getNow()-_n),_start,(float) (_newvalue-_start),_duration);
 //BA.debugLineNum = 58;BA.debugLine="DrawValue(tempValue)";
parent._drawvalue(_tempvalue);
 //BA.debugLineNum = 59;BA.debugLine="Sleep(10)";
parent.__c.Sleep(ba,this,(int) (10));
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
 //BA.debugLineNum = 60;BA.debugLine="If NewValue <> currentValue Then Return 'will ha";
if (true) break;

case 4:
//if
this.state = 9;
if (_newvalue!=parent._currentvalue) { 
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
 //BA.debugLineNum = 62;BA.debugLine="DrawValue(currentValue)";
parent._drawvalue(parent._currentvalue);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 37;BA.debugLine="cvs.Resize(Width, Height)";
_cvs.Resize(_width,_height);
 //BA.debugLineNum = 38;BA.debugLine="AnimateValueTo(currentValue)";
_animatevalueto(_currentvalue);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 8;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Private bcolor, pcolor As Int";
_bcolor = 0;
_pcolor = 0;
 //BA.debugLineNum = 12;BA.debugLine="Private thickness As Float";
_thickness = 0f;
 //BA.debugLineNum = 13;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 14;BA.debugLine="Private vertical As Boolean";
_vertical = false;
 //BA.debugLineNum = 15;BA.debugLine="Private currentValue As Float";
_currentvalue = 0f;
 //BA.debugLineNum = 16;BA.debugLine="Private DurationFromZeroTo100 As Int = 500";
_durationfromzeroto100 = (int) (500);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 27;BA.debugLine="mBase = Base";
_mbase.setObject((java.lang.Object)(_base));
 //BA.debugLineNum = 28;BA.debugLine="bcolor = xui.PaintOrColorToColor(Props.Get(\"Backg";
_bcolor = _xui.PaintOrColorToColor(_props.Get((Object)("BackgroundColor")));
 //BA.debugLineNum = 29;BA.debugLine="pcolor = xui.PaintOrColorToColor(Props.Get(\"Progr";
_pcolor = _xui.PaintOrColorToColor(_props.Get((Object)("ProgressColor")));
 //BA.debugLineNum = 30;BA.debugLine="thickness = DipToCurrent(Props.Get(\"Thickness\"))";
_thickness = (float) (__c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("Thickness"))))));
 //BA.debugLineNum = 31;BA.debugLine="vertical = Props.Get(\"Orientation\") = \"Vertical\"";
_vertical = (_props.Get((Object)("Orientation"))).equals((Object)("Vertical"));
 //BA.debugLineNum = 32;BA.debugLine="cvs.Initialize(mBase)";
_cvs.Initialize(ba,_mbase);
 //BA.debugLineNum = 33;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
_base_resize(_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public String  _drawvalue(float _value) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Private Sub DrawValue(Value As Float)";
 //BA.debugLineNum = 77;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
_cvs.ClearRect(_cvs.getTargetRect());
 //BA.debugLineNum = 78;BA.debugLine="If vertical Then";
if (_vertical) { 
 //BA.debugLineNum = 79;BA.debugLine="cvs.DrawLine(cvs.TargetRect.CenterX, 0, cvs.Targ";
_cvs.DrawLine(_cvs.getTargetRect().getCenterX(),(float) (0),_cvs.getTargetRect().getCenterX(),_cvs.getTargetRect().getBottom(),_bcolor,_thickness);
 //BA.debugLineNum = 80;BA.debugLine="cvs.DrawLine(cvs.TargetRect.CenterX, 0, cvs.Targ";
_cvs.DrawLine(_cvs.getTargetRect().getCenterX(),(float) (0),_cvs.getTargetRect().getCenterX(),(float) (_value/(double)100*_cvs.getTargetRect().getBottom()),_pcolor,_thickness);
 }else {
 //BA.debugLineNum = 82;BA.debugLine="cvs.DrawLine(0, cvs.TargetRect.CenterY, cvs.Targ";
_cvs.DrawLine((float) (0),_cvs.getTargetRect().getCenterY(),_cvs.getTargetRect().getRight(),_cvs.getTargetRect().getCenterY(),_bcolor,_thickness);
 //BA.debugLineNum = 83;BA.debugLine="cvs.DrawLine(0, cvs.TargetRect.CenterY, Value /";
_cvs.DrawLine((float) (0),_cvs.getTargetRect().getCenterY(),(float) (_value/(double)100*_cvs.getTargetRect().getRight()),_cvs.getTargetRect().getCenterY(),_pcolor,_thickness);
 };
 //BA.debugLineNum = 85;BA.debugLine="cvs.Invalidate";
_cvs.Invalidate();
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public float  _getprogress() throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Public Sub getProgress As Float";
 //BA.debugLineNum = 42;BA.debugLine="Return currentValue";
if (true) return _currentvalue;
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return 0f;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 21;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 22;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _setprogress(float _v) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Public Sub setProgress(v As Float)";
 //BA.debugLineNum = 46;BA.debugLine="AnimateValueTo(v)";
_animatevalueto(_v);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public float  _valuefromtimeeaseinout(float _time,float _start,float _changeinvalue,int _duration) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Private Sub ValueFromTimeEaseInOut(Time As Float,";
 //BA.debugLineNum = 67;BA.debugLine="Time = Time / (Duration / 2)";
_time = (float) (_time/(double)(_duration/(double)2));
 //BA.debugLineNum = 68;BA.debugLine="If Time < 1 Then";
if (_time<1) { 
 //BA.debugLineNum = 69;BA.debugLine="Return ChangeInValue / 2 * Time * Time * Time *";
if (true) return (float) (_changeinvalue/(double)2*_time*_time*_time*_time+_start);
 }else {
 //BA.debugLineNum = 71;BA.debugLine="Time = Time - 2";
_time = (float) (_time-2);
 //BA.debugLineNum = 72;BA.debugLine="Return -ChangeInValue / 2 * (Time * Time * Time";
if (true) return (float) (-_changeinvalue/(double)2*(_time*_time*_time*_time-2)+_start);
 };
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return 0f;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
