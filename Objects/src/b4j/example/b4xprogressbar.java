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
public String _vvvvvvvvvvvv3 = "";
public Object _vvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvvvvv6 = null;
public int _vvvvvvvvvvvv7 = 0;
public int _vvvvvvvvvvvv0 = 0;
public float _vvvvvvvvvvvvv1 = 0f;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvvvvvvv2 = null;
public boolean _vvvvvvvvvvvvv3 = false;
public float _vvvvvvvvvvvvv4 = 0f;
public int _vvvvvvvvvvvvv5 = 0;
public b4j.example.cssutils _vvvvvvvv0 = null;
public b4j.example.dateutils _vvvvvvvvv1 = null;
public b4j.example.main _main = null;
public b4j.example.scorebord _vvvvvvvvv2 = null;
public b4j.example.func _vvvvvvvvv3 = null;
public b4j.example.parseconfig _vvvvvvvvv4 = null;
public b4j.example.funcinet _vvvvvvvvv5 = null;
public b4j.example.httputils2service _vvvvvvvvv6 = null;
public void  _vvvvvvvvvvv6(float _newvalue) throws Exception{
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
_duration = (int) (parent.__c.Abs(parent._vvvvvvvvvvvvv4-_newvalue)/(double)100*parent._vvvvvvvvvvvvv5+1000);
 //BA.debugLineNum = 52;BA.debugLine="Dim start As Float = currentValue";
_start = parent._vvvvvvvvvvvvv4;
 //BA.debugLineNum = 53;BA.debugLine="currentValue = NewValue";
parent._vvvvvvvvvvvvv4 = _newvalue;
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
_tempvalue = parent._vvvvvvvvvvvv1((float) (parent.__c.DateTime.getNow()-_n),_start,(float) (_newvalue-_start),_duration);
 //BA.debugLineNum = 58;BA.debugLine="DrawValue(tempValue)";
parent._vvvvvvvvvvv7(_tempvalue);
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
if (_newvalue!=parent._vvvvvvvvvvvvv4) { 
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
parent._vvvvvvvvvvv7(parent._vvvvvvvvvvvvv4);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 37;BA.debugLine="cvs.Resize(Width, Height)";
_vvvvvvvvvvvvv2.Resize(_width,_height);
 //BA.debugLineNum = 38;BA.debugLine="AnimateValueTo(currentValue)";
_vvvvvvvvvvv6(_vvvvvvvvvvvvv4);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 8;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvv4 = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private mBase As B4XView 'ignore";
_vvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI 'ignore";
_vvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Private bcolor, pcolor As Int";
_vvvvvvvvvvvv7 = 0;
_vvvvvvvvvvvv0 = 0;
 //BA.debugLineNum = 12;BA.debugLine="Private thickness As Float";
_vvvvvvvvvvvvv1 = 0f;
 //BA.debugLineNum = 13;BA.debugLine="Private cvs As B4XCanvas";
_vvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 14;BA.debugLine="Private vertical As Boolean";
_vvvvvvvvvvvvv3 = false;
 //BA.debugLineNum = 15;BA.debugLine="Private currentValue As Float";
_vvvvvvvvvvvvv4 = 0f;
 //BA.debugLineNum = 16;BA.debugLine="Private DurationFromZeroTo100 As Int = 500";
_vvvvvvvvvvvvv5 = (int) (500);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 27;BA.debugLine="mBase = Base";
_vvvvvvvvvvvv5.setObject((java.lang.Object)(_base));
 //BA.debugLineNum = 28;BA.debugLine="bcolor = xui.PaintOrColorToColor(Props.Get(\"Backg";
_vvvvvvvvvvvv7 = _vvvvvvvvvvvv6.PaintOrColorToColor(_props.Get((Object)("BackgroundColor")));
 //BA.debugLineNum = 29;BA.debugLine="pcolor = xui.PaintOrColorToColor(Props.Get(\"Progr";
_vvvvvvvvvvvv0 = _vvvvvvvvvvvv6.PaintOrColorToColor(_props.Get((Object)("ProgressColor")));
 //BA.debugLineNum = 30;BA.debugLine="thickness = DipToCurrent(Props.Get(\"Thickness\"))";
_vvvvvvvvvvvvv1 = (float) (__c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("Thickness"))))));
 //BA.debugLineNum = 31;BA.debugLine="vertical = Props.Get(\"Orientation\") = \"Vertical\"";
_vvvvvvvvvvvvv3 = (_props.Get((Object)("Orientation"))).equals((Object)("Vertical"));
 //BA.debugLineNum = 32;BA.debugLine="cvs.Initialize(mBase)";
_vvvvvvvvvvvvv2.Initialize(ba,_vvvvvvvvvvvv5);
 //BA.debugLineNum = 33;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
_base_resize(_vvvvvvvvvvvv5.getWidth(),_vvvvvvvvvvvv5.getHeight());
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvv7(float _value) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Private Sub DrawValue(Value As Float)";
 //BA.debugLineNum = 77;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
_vvvvvvvvvvvvv2.ClearRect(_vvvvvvvvvvvvv2.getTargetRect());
 //BA.debugLineNum = 78;BA.debugLine="If vertical Then";
if (_vvvvvvvvvvvvv3) { 
 //BA.debugLineNum = 79;BA.debugLine="cvs.DrawLine(cvs.TargetRect.CenterX, 0, cvs.Targ";
_vvvvvvvvvvvvv2.DrawLine(_vvvvvvvvvvvvv2.getTargetRect().getCenterX(),(float) (0),_vvvvvvvvvvvvv2.getTargetRect().getCenterX(),_vvvvvvvvvvvvv2.getTargetRect().getBottom(),_vvvvvvvvvvvv7,_vvvvvvvvvvvvv1);
 //BA.debugLineNum = 80;BA.debugLine="cvs.DrawLine(cvs.TargetRect.CenterX, 0, cvs.Targ";
_vvvvvvvvvvvvv2.DrawLine(_vvvvvvvvvvvvv2.getTargetRect().getCenterX(),(float) (0),_vvvvvvvvvvvvv2.getTargetRect().getCenterX(),(float) (_value/(double)100*_vvvvvvvvvvvvv2.getTargetRect().getBottom()),_vvvvvvvvvvvv0,_vvvvvvvvvvvvv1);
 }else {
 //BA.debugLineNum = 82;BA.debugLine="cvs.DrawLine(0, cvs.TargetRect.CenterY, cvs.Targ";
_vvvvvvvvvvvvv2.DrawLine((float) (0),_vvvvvvvvvvvvv2.getTargetRect().getCenterY(),_vvvvvvvvvvvvv2.getTargetRect().getRight(),_vvvvvvvvvvvvv2.getTargetRect().getCenterY(),_vvvvvvvvvvvv7,_vvvvvvvvvvvvv1);
 //BA.debugLineNum = 83;BA.debugLine="cvs.DrawLine(0, cvs.TargetRect.CenterY, Value /";
_vvvvvvvvvvvvv2.DrawLine((float) (0),_vvvvvvvvvvvvv2.getTargetRect().getCenterY(),(float) (_value/(double)100*_vvvvvvvvvvvvv2.getTargetRect().getRight()),_vvvvvvvvvvvvv2.getTargetRect().getCenterY(),_vvvvvvvvvvvv0,_vvvvvvvvvvvvv1);
 };
 //BA.debugLineNum = 85;BA.debugLine="cvs.Invalidate";
_vvvvvvvvvvvvv2.Invalidate();
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public float  _getvvvvvvvvvvvv2() throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Public Sub getProgress As Float";
 //BA.debugLineNum = 42;BA.debugLine="Return currentValue";
if (true) return _vvvvvvvvvvvvv4;
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return 0f;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 21;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvv3 = _eventname;
 //BA.debugLineNum = 22;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvv4 = _callback;
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvv2(float _v) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Public Sub setProgress(v As Float)";
 //BA.debugLineNum = 46;BA.debugLine="AnimateValueTo(v)";
_vvvvvvvvvvv6(_v);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public float  _vvvvvvvvvvvv1(float _time,float _start,float _changeinvalue,int _duration) throws Exception{
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
