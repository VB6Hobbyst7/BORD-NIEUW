package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class swiftbutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.swiftbutton", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.swiftbutton.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvvvvvvvv3 = "";
public Object _vvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvvvvvvv2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
public Object _vvvvvvvvvvvvvvvvvvvvvv2 = null;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
public b4j.example.cssutils _vvvvvvvv0 = null;
public b4j.example.dateutils _vvvvvvvvv1 = null;
public b4j.example.main _main = null;
public b4j.example.scorebord _vvvvvvvvv2 = null;
public b4j.example.func _vvvvvvvvv3 = null;
public b4j.example.parseconfig _vvvvvvvvv4 = null;
public b4j.example.funcinet _vvvvvvvvv5 = null;
public b4j.example.httputils2service _vvvvvvvvv6 = null;
public String  _base_resize(double _width,double _height) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
 //BA.debugLineNum = 41;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 42;BA.debugLine="cvs.Resize(Width, Height)";
_vvvvvvvvvvvvv2.Resize(_width,_height);
 //BA.debugLineNum = 43;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = _vvvvvvvvvvvv5.GetAllViewsRecursive();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_v.setObject((java.lang.Object)(group2.Get(index2)));
 //BA.debugLineNum = 44;BA.debugLine="v.SetLayoutAnimated(0, 0, 0, Width, Height)";
_v.SetLayoutAnimated((int) (0),0,0,_width,_height);
 }
};
 //BA.debugLineNum = 46;BA.debugLine="Draw";
_vvvvvvvvvvvvvvvvvvvvvvvvvv3();
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 9;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvv4 = new Object();
 //BA.debugLineNum = 10;BA.debugLine="Public mBase As B4XView 'ignore";
_vvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private xui As XUI 'ignore";
_vvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 12;BA.debugLine="Private cvs As B4XCanvas";
_vvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 13;BA.debugLine="Public xLBL As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private clr1, clr2, disabledColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
 //BA.debugLineNum = 15;BA.debugLine="Private pressed As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
 //BA.debugLineNum = 16;BA.debugLine="Public Tag As Object";
_vvvvvvvvvvvvvvvvvvvvvv2 = new Object();
 //BA.debugLineNum = 17;BA.debugLine="Private mDisabled As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
 //BA.debugLineNum = 25;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 26;BA.debugLine="mBase = Base";
_vvvvvvvvvvvv5.setObject((java.lang.Object)(_base));
 //BA.debugLineNum = 27;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvvvvvvvvvvvvvvvvv2 = _vvvvvvvvvvvv5.getTag();
 //BA.debugLineNum = 27;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvvvvvvv5.setTag(this);
 //BA.debugLineNum = 28;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"p\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _vvvvvvvvvvvv6.CreatePanel(ba,"p");
 //BA.debugLineNum = 29;BA.debugLine="p.Color = xui.Color_Transparent";
_p.setColor(_vvvvvvvvvvvv6.Color_Transparent);
 //BA.debugLineNum = 30;BA.debugLine="clr1 = xui.PaintOrColorToColor(Props.Get(\"Primary";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvv6.PaintOrColorToColor(_props.Get((Object)("PrimaryColor")));
 //BA.debugLineNum = 31;BA.debugLine="clr2 = xui.PaintOrColorToColor(Props.Get(\"Seconda";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvv6.PaintOrColorToColor(_props.Get((Object)("SecondaryColor")));
 //BA.debugLineNum = 32;BA.debugLine="disabledColor = xui.PaintOrColorToColor(Props.Get";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _vvvvvvvvvvvv6.PaintOrColorToColor(_props.GetDefault((Object)("DisabledColor"),(Object)(0xff999999)));
 //BA.debugLineNum = 33;BA.debugLine="xLBL = Lbl";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setObject((java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 34;BA.debugLine="mBase.AddView(xLBL, 0, 0, 0, 0)";
_vvvvvvvvvvvv5.AddView((javafx.scene.Node)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getObject()),0,0,0,0);
 //BA.debugLineNum = 35;BA.debugLine="mBase.AddView(p, 0, 0, 0, 0)";
_vvvvvvvvvvvv5.AddView((javafx.scene.Node)(_p.getObject()),0,0,0,0);
 //BA.debugLineNum = 36;BA.debugLine="xLBL.SetTextAlignment(\"CENTER\", \"CENTER\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 37;BA.debugLine="cvs.Initialize(mBase)";
_vvvvvvvvvvvvv2.Initialize(ba,_vvvvvvvvvvvv5);
 //BA.debugLineNum = 38;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
_base_resize(_vvvvvvvvvvvv5.getWidth(),_vvvvvvvvvvvv5.getHeight());
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
int _gap = 0;
int _corners = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
int _c = 0;
 //BA.debugLineNum = 103;BA.debugLine="Private Sub Draw";
 //BA.debugLineNum = 104;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
_vvvvvvvvvvvvv2.ClearRect(_vvvvvvvvvvvvv2.getTargetRect());
 //BA.debugLineNum = 105;BA.debugLine="Dim gap As Int = 5dip";
_gap = __c.DipToCurrent((int) (5));
 //BA.debugLineNum = 106;BA.debugLine="Dim corners As Int = 15dip";
_corners = __c.DipToCurrent((int) (15));
 //BA.debugLineNum = 107;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 108;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 109;BA.debugLine="r.Initialize(0, gap, mBase.Width, mBase.Height)";
_r.Initialize((float) (0),(float) (_gap),(float) (_vvvvvvvvvvvv5.getWidth()),(float) (_vvvvvvvvvvvv5.getHeight()));
 //BA.debugLineNum = 110;BA.debugLine="If pressed = False Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1==__c.False) { 
 //BA.debugLineNum = 111;BA.debugLine="xLBL.Top = 0";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setTop(0);
 //BA.debugLineNum = 112;BA.debugLine="p.InitializeRoundedRect(r, corners)";
_p.InitializeRoundedRect(_r,(float) (_corners));
 //BA.debugLineNum = 113;BA.debugLine="cvs.DrawPath(p, clr2, True, 0)";
_vvvvvvvvvvvvv2.DrawPath(_p,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,__c.True,(float) (0));
 //BA.debugLineNum = 114;BA.debugLine="r.Initialize(0, 0, mBase.Width, mBase.Height - g";
_r.Initialize((float) (0),(float) (0),(float) (_vvvvvvvvvvvv5.getWidth()),(float) (_vvvvvvvvvvvv5.getHeight()-_gap));
 //BA.debugLineNum = 115;BA.debugLine="p.InitializeRoundedRect(r, corners)";
_p.InitializeRoundedRect(_r,(float) (_corners));
 //BA.debugLineNum = 116;BA.debugLine="cvs.DrawPath(p, clr1, True, 0)";
_vvvvvvvvvvvvv2.DrawPath(_p,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,__c.True,(float) (0));
 }else {
 //BA.debugLineNum = 118;BA.debugLine="xLBL.Top = gap";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setTop(_gap);
 //BA.debugLineNum = 119;BA.debugLine="p.InitializeRoundedRect(r, corners)";
_p.InitializeRoundedRect(_r,(float) (_corners));
 //BA.debugLineNum = 120;BA.debugLine="Dim c As Int";
_c = 0;
 //BA.debugLineNum = 121;BA.debugLine="If mDisabled Then c = disabledColor Else c = clr";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) { 
_c = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;}
else {
_c = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6;};
 //BA.debugLineNum = 122;BA.debugLine="cvs.DrawPath(p, c, True, 0)";
_vvvvvvvvvvvvv2.DrawPath(_p,_c,__c.True,(float) (0));
 };
 //BA.debugLineNum = 125;BA.debugLine="cvs.Invalidate";
_vvvvvvvvvvvvv2.Invalidate();
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public boolean  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Public Sub getEnabled As Boolean";
 //BA.debugLineNum = 50;BA.debugLine="Return Not(mDisabled)";
if (true) return __c.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return false;
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
public String  _p_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Private Sub p_MouseClicked (EventData As MouseEven";
 //BA.debugLineNum = 93;BA.debugLine="EventData.Consume";
_eventdata.Consume();
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _p_touch(int _action,float _x,float _y) throws Exception{
boolean _inside = false;
 //BA.debugLineNum = 59;BA.debugLine="Private Sub p_Touch (Action As Int, X As Float, Y";
 //BA.debugLineNum = 60;BA.debugLine="If mDisabled Then Return";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) { 
if (true) return "";};
 //BA.debugLineNum = 61;BA.debugLine="Dim Inside As Boolean = x > 0 And x < mBase.Width";
_inside = _x>0 && _x<_vvvvvvvvvvvv5.getWidth() && _y>0 && _y<_vvvvvvvvvvvv5.getHeight();
 //BA.debugLineNum = 62;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,_vvvvvvvvvvvv5.TOUCH_ACTION_DOWN,_vvvvvvvvvvvv5.TOUCH_ACTION_MOVE,_vvvvvvvvvvvv5.TOUCH_ACTION_UP)) {
case 0: {
 //BA.debugLineNum = 64;BA.debugLine="SetPressedState(True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(__c.True);
 //BA.debugLineNum = 65;BA.debugLine="Draw";
_vvvvvvvvvvvvvvvvvvvvvvvvvv3();
 break; }
case 1: {
 //BA.debugLineNum = 67;BA.debugLine="If pressed <> Inside Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1!=_inside) { 
 //BA.debugLineNum = 68;BA.debugLine="SetPressedState(Inside)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_inside);
 //BA.debugLineNum = 69;BA.debugLine="Draw";
_vvvvvvvvvvvvvvvvvvvvvvvvvv3();
 };
 break; }
case 2: {
 //BA.debugLineNum = 72;BA.debugLine="SetPressedState(False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(__c.False);
 //BA.debugLineNum = 73;BA.debugLine="Draw";
_vvvvvvvvvvvvvvvvvvvvvvvvvv3();
 //BA.debugLineNum = 74;BA.debugLine="If Inside Then";
if (_inside) { 
 //BA.debugLineNum = 75;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Click";
__c.CallSubDelayed(ba,_vvvvvvvvvvvv4,_vvvvvvvvvvvv3+"_Click");
 };
 break; }
}
;
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(int _primary,int _secondary) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Public Sub SetColors(Primary As Int, Secondary As";
 //BA.debugLineNum = 98;BA.debugLine="clr1 = Primary";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _primary;
 //BA.debugLineNum = 99;BA.debugLine="clr2 = Secondary";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _secondary;
 //BA.debugLineNum = 100;BA.debugLine="Draw";
_vvvvvvvvvvvvvvvvvvvvvvvvvv3();
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(boolean _b) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Public Sub setEnabled(b As Boolean)";
 //BA.debugLineNum = 54;BA.debugLine="mDisabled = Not(b)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = __c.Not(_b);
 //BA.debugLineNum = 55;BA.debugLine="pressed = mDisabled";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
 //BA.debugLineNum = 56;BA.debugLine="Draw";
_vvvvvvvvvvvvvvvvvvvvvvvvvv3();
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(boolean _newstate) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Private Sub SetPressedState(NewState As Boolean)";
 //BA.debugLineNum = 81;BA.debugLine="If pressed = NewState Then Return";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1==_newstate) { 
if (true) return "";};
 //BA.debugLineNum = 82;BA.debugLine="If NewState And xui.SubExists(mCallBack, mEventNa";
if (_newstate && _vvvvvvvvvvvv6.SubExists(ba,_vvvvvvvvvvvv4,_vvvvvvvvvvvv3+"_ButtonDown",(int) (0))) { 
 //BA.debugLineNum = 83;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_ButtonD";
__c.CallSubDelayed(ba,_vvvvvvvvvvvv4,_vvvvvvvvvvvv3+"_ButtonDown");
 };
 //BA.debugLineNum = 85;BA.debugLine="If NewState = False And xui.SubExists(mCallBack,";
if (_newstate==__c.False && _vvvvvvvvvvvv6.SubExists(ba,_vvvvvvvvvvvv4,_vvvvvvvvvvvv3+"_ButtonUp",(int) (0))) { 
 //BA.debugLineNum = 86;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_ButtonU";
__c.CallSubDelayed(ba,_vvvvvvvvvvvv4,_vvvvvvvvvvvv3+"_ButtonUp");
 };
 //BA.debugLineNum = 88;BA.debugLine="pressed= NewState";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _newstate;
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
