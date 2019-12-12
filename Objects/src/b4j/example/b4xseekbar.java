package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xseekbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.b4xseekbar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xseekbar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvvvvvvvv3 = "";
public Object _vvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvvvvv6 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvvvvvvv2 = null;
public Object _vvvvvvvvvvvvvvvvvvvvvv2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvv4 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
public boolean _vvvvvvvvvvvvv3 = false;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public b4j.example.cssutils _vvvvvvvv0 = null;
public b4j.example.dateutils _vvvvvvvvv1 = null;
public b4j.example.main _main = null;
public b4j.example.scorebord _vvvvvvvvv2 = null;
public b4j.example.func _vvvvvvvvv3 = null;
public b4j.example.parseconfig _vvvvvvvvv4 = null;
public b4j.example.funcinet _vvvvvvvvv5 = null;
public b4j.example.httputils2service _vvvvvvvvv6 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 49;BA.debugLine="cvs.Resize(Width, Height)";
_vvvvvvvvvvvvv2.Resize(_width,_height);
 //BA.debugLineNum = 50;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv7.SetLayoutAnimated((int) (0),0,0,_width,_height);
 //BA.debugLineNum = 51;BA.debugLine="Vertical = mBase.Height > mBase.Width";
_vvvvvvvvvvvvv3 = _vvvvvvvvvvvv5.getHeight()>_vvvvvvvvvvvv5.getWidth();
 //BA.debugLineNum = 52;BA.debugLine="size = Max(mBase.Height, mBase.Width) - 2 * Radiu";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) (__c.Max(_vvvvvvvvvvvv5.getHeight(),_vvvvvvvvvvvv5.getWidth())-2*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 53;BA.debugLine="Update";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 11;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvv4 = new Object();
 //BA.debugLineNum = 12;BA.debugLine="Public mBase As B4XView 'ignore";
_vvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private xui As XUI 'ignore";
_vvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 14;BA.debugLine="Public Color1, Color2, ThumbColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
 //BA.debugLineNum = 15;BA.debugLine="Private cvs As B4XCanvas";
_vvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 16;BA.debugLine="Public Tag As Object";
_vvvvvvvvvvvvvvvvvvvvvv2 = new Object();
 //BA.debugLineNum = 17;BA.debugLine="Private TouchPanel As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private mValue As Int";
_vvvvvvvvvvvvvvvvvvvvvvv4 = 0;
 //BA.debugLineNum = 19;BA.debugLine="Public MinValue, MaxValue As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
 //BA.debugLineNum = 20;BA.debugLine="Private Vertical As Boolean";
_vvvvvvvvvvvvv3 = false;
 //BA.debugLineNum = 21;BA.debugLine="Public Size1 = 4dip, Size2 = 2dip, Radius1 = 6dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = __c.DipToCurrent((int) (4));
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = __c.DipToCurrent((int) (2));
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = __c.DipToCurrent((int) (6));
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = __c.DipToCurrent((int) (12));
 //BA.debugLineNum = 22;BA.debugLine="Private Pressed As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
 //BA.debugLineNum = 23;BA.debugLine="Private size As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 33;BA.debugLine="mBase = Base";
_vvvvvvvvvvvv5.setObject((java.lang.Object)(_base));
 //BA.debugLineNum = 34;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvvvvvvvvvvvvvvvvv2 = _vvvvvvvvvvvv5.getTag();
 //BA.debugLineNum = 34;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvvvvvvv5.setTag(this);
 //BA.debugLineNum = 35;BA.debugLine="Color1 = xui.PaintOrColorToColor(Props.Get(\"Color";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _vvvvvvvvvvvv6.PaintOrColorToColor(_props.Get((Object)("Color1")));
 //BA.debugLineNum = 36;BA.debugLine="Color2 = xui.PaintOrColorToColor(Props.Get(\"Color";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvvvvvvvvvvv6.PaintOrColorToColor(_props.Get((Object)("Color2")));
 //BA.debugLineNum = 37;BA.debugLine="ThumbColor = xui.PaintOrColorToColor(Props.Get(\"T";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = _vvvvvvvvvvvv6.PaintOrColorToColor(_props.Get((Object)("ThumbColor")));
 //BA.debugLineNum = 38;BA.debugLine="MinValue = Props.Get(\"Min\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = (int)(BA.ObjectToNumber(_props.Get((Object)("Min"))));
 //BA.debugLineNum = 39;BA.debugLine="MaxValue = Props.Get(\"Max\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = (int)(BA.ObjectToNumber(_props.Get((Object)("Max"))));
 //BA.debugLineNum = 40;BA.debugLine="mValue = Max(MinValue, Min(MaxValue, Props.Get(\"V";
_vvvvvvvvvvvvvvvvvvvvvvv4 = (int) (__c.Max(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3,__c.Min(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,(double)(BA.ObjectToNumber(_props.Get((Object)("Value")))))));
 //BA.debugLineNum = 41;BA.debugLine="cvs.Initialize(mBase)";
_vvvvvvvvvvvvv2.Initialize(ba,_vvvvvvvvvvvv5);
 //BA.debugLineNum = 42;BA.debugLine="TouchPanel = xui.CreatePanel(\"TouchPanel\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvv6.CreatePanel(ba,"TouchPanel");
 //BA.debugLineNum = 43;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, mBase.Width, mBas";
_vvvvvvvvvvvv5.AddView((javafx.scene.Node)(_vvvvvvvvvvvvvvvvvvvvvvvvvvv7.getObject()),0,0,_vvvvvvvvvvvv5.getWidth(),_vvvvvvvvvvvv5.getHeight());
 //BA.debugLineNum = 44;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then Radius2 = 20dip";
if (_vvvvvvvvvvvv6.getIsB4A() || _vvvvvvvvvvvv6.getIsB4i()) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = __c.DipToCurrent((int) (20));};
 //BA.debugLineNum = 45;BA.debugLine="If xui.IsB4A Then Base_Resize(mBase.Width, mBase.";
if (_vvvvvvvvvvvv6.getIsB4A()) { 
_base_resize(_vvvvvvvvvvvv5.getWidth(),_vvvvvvvvvvvv5.getHeight());};
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public int  _getvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Public Sub getValue As Int";
 //BA.debugLineNum = 118;BA.debugLine="Return mValue";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvv4;
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 26;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 27;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvv3 = _eventname;
 //BA.debugLineNum = 28;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvv4 = _callback;
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvv0(int _v) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Public Sub setValue(v As Int)";
 //BA.debugLineNum = 113;BA.debugLine="mValue = Max(MinValue, Min(MaxValue, v))";
_vvvvvvvvvvvvvvvvvvvvvvv4 = (int) (__c.Max(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3,__c.Min(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_v)));
 //BA.debugLineNum = 114;BA.debugLine="Update";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(int _x,int _y) throws Exception{
int _v = 0;
int _newvalue = 0;
 //BA.debugLineNum = 96;BA.debugLine="Private Sub SetValueBasedOnTouch(x As Int, y As In";
 //BA.debugLineNum = 97;BA.debugLine="Dim v As Int";
_v = 0;
 //BA.debugLineNum = 98;BA.debugLine="If Vertical Then";
if (_vvvvvvvvvvvvv3) { 
 //BA.debugLineNum = 99;BA.debugLine="v = (mBase.Height - Radius2 - y) / size * (MaxVa";
_v = (int) ((_vvvvvvvvvvvv5.getHeight()-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0-_y)/(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5*(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
 }else {
 //BA.debugLineNum = 101;BA.debugLine="v = (x - Radius2) / size * (MaxValue - MinValue)";
_v = (int) ((_x-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)/(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5*(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
 };
 //BA.debugLineNum = 103;BA.debugLine="Dim NewValue As Int = Max(MinValue, Min(MaxValue,";
_newvalue = (int) (__c.Max(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3,__c.Min(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_v)));
 //BA.debugLineNum = 104;BA.debugLine="If NewValue <> mValue Then";
if (_newvalue!=_vvvvvvvvvvvvvvvvvvvvvvv4) { 
 //BA.debugLineNum = 105;BA.debugLine="mValue = NewValue";
_vvvvvvvvvvvvvvvvvvvvvvv4 = _newvalue;
 //BA.debugLineNum = 106;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Value";
if (_vvvvvvvvvvvv6.SubExists(ba,_vvvvvvvvvvvv4,_vvvvvvvvvvvv3+"_ValueChanged",(int) (1))) { 
 //BA.debugLineNum = 107;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Value";
__c.CallSubDelayed2(ba,_vvvvvvvvvvvv4,_vvvvvvvvvvvv3+"_ValueChanged",(Object)(_vvvvvvvvvvvvvvvvvvvvvvv4));
 };
 };
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public String  _touchpanel_touch(int _action,float _x,float _y) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Private Sub TouchPanel_Touch (Action As Int, X As";
 //BA.debugLineNum = 85;BA.debugLine="If Action = TouchPanel.TOUCH_ACTION_DOWN Then";
if (_action==_vvvvvvvvvvvvvvvvvvvvvvvvvvv7.TOUCH_ACTION_DOWN) { 
 //BA.debugLineNum = 86;BA.debugLine="Pressed = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = __c.True;
 //BA.debugLineNum = 87;BA.debugLine="SetValueBasedOnTouch(X, Y)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7((int) (_x),(int) (_y));
 }else if(_action==_vvvvvvvvvvvvvvvvvvvvvvvvvvv7.TOUCH_ACTION_MOVE) { 
 //BA.debugLineNum = 89;BA.debugLine="SetValueBasedOnTouch(X, Y)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7((int) (_x),(int) (_y));
 }else if(_action==_vvvvvvvvvvvvvvvvvvvvvvvvvvv7.TOUCH_ACTION_UP) { 
 //BA.debugLineNum = 91;BA.debugLine="Pressed = False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = __c.False;
 };
 //BA.debugLineNum = 93;BA.debugLine="Update";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv6() throws Exception{
int _s1 = 0;
int _y = 0;
int _x = 0;
 //BA.debugLineNum = 57;BA.debugLine="Public Sub Update";
 //BA.debugLineNum = 59;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
_vvvvvvvvvvvvv2.ClearRect(_vvvvvvvvvvvvv2.getTargetRect());
 //BA.debugLineNum = 60;BA.debugLine="If size > 0 Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5>0) { 
 //BA.debugLineNum = 61;BA.debugLine="If Vertical = False Then";
if (_vvvvvvvvvvvvv3==__c.False) { 
 //BA.debugLineNum = 62;BA.debugLine="Dim s1 As Int = Radius2 + (mValue - MinValue) /";
_s1 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0+(_vvvvvvvvvvvvvvvvvvvvvvv4-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)/(double)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5);
 //BA.debugLineNum = 63;BA.debugLine="Dim y As Int = mBase.Height / 2";
_y = (int) (_vvvvvvvvvvvv5.getHeight()/(double)2);
 //BA.debugLineNum = 64;BA.debugLine="cvs.DrawLine(Radius2, y, s1, y, Color1, Size1)";
_vvvvvvvvvvvvv2.DrawLine((float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0),(float) (_y),(float) (_s1),(float) (_y),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5));
 //BA.debugLineNum = 65;BA.debugLine="cvs.DrawLine(s1, y, mBase.Width - Radius2, y, C";
_vvvvvvvvvvvvv2.DrawLine((float) (_s1),(float) (_y),(float) (_vvvvvvvvvvvv5.getWidth()-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0),(float) (_y),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1,(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6));
 //BA.debugLineNum = 66;BA.debugLine="cvs.DrawCircle(s1, y, Radius1, Color1, True, 0)";
_vvvvvvvvvvvvv2.DrawCircle((float) (_s1),(float) (_y),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,__c.True,(float) (0));
 //BA.debugLineNum = 67;BA.debugLine="If Pressed Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) { 
 //BA.debugLineNum = 68;BA.debugLine="cvs.DrawCircle(s1, y, Radius2, ThumbColor, Tru";
_vvvvvvvvvvvvv2.DrawCircle((float) (_s1),(float) (_y),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,__c.True,(float) (0));
 };
 }else {
 //BA.debugLineNum = 71;BA.debugLine="Dim s1 As Int = Radius2 + (MaxValue - mValue -";
_s1 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0+(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4-_vvvvvvvvvvvvvvvvvvvvvvv4-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)/(double)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5);
 //BA.debugLineNum = 72;BA.debugLine="Dim x As Int = mBase.Width / 2";
_x = (int) (_vvvvvvvvvvvv5.getWidth()/(double)2);
 //BA.debugLineNum = 73;BA.debugLine="cvs.DrawLine(x, Radius2, x, s1, Color2, Size2)";
_vvvvvvvvvvvvv2.DrawLine((float) (_x),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0),(float) (_x),(float) (_s1),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1,(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6));
 //BA.debugLineNum = 74;BA.debugLine="cvs.DrawLine(x, s1, x, mBase.Height - Radius2,";
_vvvvvvvvvvvvv2.DrawLine((float) (_x),(float) (_s1),(float) (_x),(float) (_vvvvvvvvvvvv5.getHeight()-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5));
 //BA.debugLineNum = 75;BA.debugLine="cvs.DrawCircle(x, s1, Radius1, Color1, True, 0)";
_vvvvvvvvvvvvv2.DrawCircle((float) (_x),(float) (_s1),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,__c.True,(float) (0));
 //BA.debugLineNum = 76;BA.debugLine="If Pressed Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) { 
 //BA.debugLineNum = 77;BA.debugLine="cvs.DrawCircle(x, s1, Radius2, ThumbColor, Tru";
_vvvvvvvvvvvvv2.DrawCircle((float) (_x),(float) (_s1),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,__c.True,(float) (0));
 };
 };
 };
 //BA.debugLineNum = 81;BA.debugLine="cvs.Invalidate";
_vvvvvvvvvvvvv2.Invalidate();
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
