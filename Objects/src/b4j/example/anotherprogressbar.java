package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class anotherprogressbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.anotherprogressbar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.anotherprogressbar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvvvvvvvv3 = "";
public Object _vvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvvvvv6 = null;
public b4j.example.bcpath._bcbrush _vvvvvvvvvvvvvvvvvvvvvvvv0 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
public b4j.example.bitmapcreator _vvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public b4j.example.bcpath._bcbrush _vvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public boolean _vvvvvvvvvvvvv3 = false;
public float _vvvvvvvvvvvvv4 = 0f;
public int _vvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public b4j.example.bcpath._bcbrush _vvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvv4 = 0;
public Object _vvvvvvvvvvvvvvvvvvvvvv2 = null;
public float _vvvvvvvvvvvvvvvvvvvvvvvvv0 = 0f;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
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
 //BA.debugLineNum = 48;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 49;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = _vvvvvvvvvvvv5.GetAllViewsRecursive();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_v.setObject((java.lang.Object)(group1.Get(index1)));
 //BA.debugLineNum = 50;BA.debugLine="v.SetLayoutAnimated(0, 0, 0, Width, Height)";
_v.SetLayoutAnimated((int) (0),0,0,_width,_height);
 }
};
 //BA.debugLineNum = 52;BA.debugLine="bc.Initialize(mBase.Width / xui.Scale, mBase.Heig";
_vvvvvvvvvvvvvvvvvvvvvvvvv3._initialize(ba,(int) (_vvvvvvvvvvvv5.getWidth()/(double)_vvvvvvvvvvvv6.getScale()),(int) (_vvvvvvvvvvvv5.getHeight()/(double)_vvvvvvvvvvvv6.getScale()));
 //BA.debugLineNum = 53;BA.debugLine="Vertical = mBase.Height > mBase.Width";
_vvvvvvvvvvvvv3 = _vvvvvvvvvvvv5.getHeight()>_vvvvvvvvvvvv5.getWidth();
 //BA.debugLineNum = 54;BA.debugLine="UpdateGraphics";
_vvvvvvvvvvvvvvvvvvvvvvvv6();
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public void  _vvvvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
ResumableSub_BusyLoop rsub = new ResumableSub_BusyLoop(this);
rsub.resume(ba, null);
}
public static class ResumableSub_BusyLoop extends BA.ResumableSub {
public ResumableSub_BusyLoop(b4j.example.anotherprogressbar parent) {
this.parent = parent;
}
b4j.example.anotherprogressbar parent;
int _myindex = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
long _lasttime = 0L;
anywheresoftware.b4a.objects.collections.List _tasks = null;
float _delta = 0f;
float _change = 0f;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 59;BA.debugLine="Dim MyIndex As Int = BusyIndex";
_myindex = parent._vvvvvvvvvvvvvvvvvvvvvvvvv2;
 //BA.debugLineNum = 60;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 61;BA.debugLine="r.Initialize(0, 0, bc.mWidth, bc.mHeight)";
_r.Initialize((float) (0),(float) (0),(float) (parent._vvvvvvvvvvvvvvvvvvvvvvvvv3._mwidth),(float) (parent._vvvvvvvvvvvvvvvvvvvvvvvvv3._mheight));
 //BA.debugLineNum = 62;BA.debugLine="Dim LastTime As Long = DateTime.Now";
_lasttime = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 63;BA.debugLine="Do While MyIndex = BusyIndex";
if (true) break;

case 1:
//do while
this.state = 37;
while (_myindex==parent._vvvvvvvvvvvvvvvvvvvvvvvvv2) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 64;BA.debugLine="If Vertical Then";
if (true) break;

case 4:
//if
this.state = 9;
if (parent._vvvvvvvvvvvvv3) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 65;BA.debugLine="BusyBrush.SrcOffsetY = BusyBrush.SrcOffsetY + B";
parent._vvvvvvvvvvvvvvvvvvvvvvvv0.SrcOffsetY = (int) (parent._vvvvvvvvvvvvvvvvvvvvvvvv0.SrcOffsetY+parent._vvvvvvvvvvvvvvvvvvvvvvvvvv2);
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 67;BA.debugLine="BusyBrush.SrcOffsetX = BusyBrush.SrcOffsetX + B";
parent._vvvvvvvvvvvvvvvvvvvvvvvv0.SrcOffsetX = (int) (parent._vvvvvvvvvvvvvvvvvvvvvvvv0.SrcOffsetX+parent._vvvvvvvvvvvvvvvvvvvvvvvvvv2);
 if (true) break;

case 9:
//C
this.state = 10;
;
 //BA.debugLineNum = 69;BA.debugLine="Dim tasks As List";
_tasks = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 70;BA.debugLine="tasks.Initialize";
_tasks.Initialize();
 //BA.debugLineNum = 71;BA.debugLine="tasks.Add(bc.AsyncDrawRect(bc.TargetRect, Transp";
_tasks.Add((Object)(parent._vvvvvvvvvvvvvvvvvvvvvvvvv3._asyncdrawrect(parent._vvvvvvvvvvvvvvvvvvvvvvvvv3._targetrect,parent._vvvvvvvvvvvvvvvvvvvvvvvvv5,parent.__c.True,(int) (0))));
 //BA.debugLineNum = 72;BA.debugLine="Dim delta As Float = mValue - CurrentValue";
_delta = (float) (parent._vvvvvvvvvvvvvvvvvvvvvvv4-parent._vvvvvvvvvvvvv4);
 //BA.debugLineNum = 73;BA.debugLine="If Abs(delta) <= 1 Then";
if (true) break;

case 10:
//if
this.state = 21;
if (parent.__c.Abs(_delta)<=1) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 21;
 //BA.debugLineNum = 74;BA.debugLine="CurrentValue = mValue";
parent._vvvvvvvvvvvvv4 = (float) (parent._vvvvvvvvvvvvvvvvvvvvvvv4);
 if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 76;BA.debugLine="Dim change As Float = (DateTime.Now - LastTime)";
_change = (float) ((parent.__c.DateTime.getNow()-_lasttime)/(double)1000*parent._vvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 77;BA.debugLine="If delta > 0 Then";
if (true) break;

case 15:
//if
this.state = 20;
if (_delta>0) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
 //BA.debugLineNum = 78;BA.debugLine="CurrentValue = CurrentValue + Min(change, mVal";
parent._vvvvvvvvvvvvv4 = (float) (parent._vvvvvvvvvvvvv4+parent.__c.Min(_change,parent._vvvvvvvvvvvvvvvvvvvvvvv4-parent._vvvvvvvvvvvvv4));
 if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 80;BA.debugLine="CurrentValue = CurrentValue - Min(change, Curr";
parent._vvvvvvvvvvvvv4 = (float) (parent._vvvvvvvvvvvvv4-parent.__c.Min(_change,parent._vvvvvvvvvvvvv4-parent._vvvvvvvvvvvvvvvvvvvvvvv4));
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 22;
;
 //BA.debugLineNum = 83;BA.debugLine="LastTime = DateTime.Now";
_lasttime = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 84;BA.debugLine="If CurrentValue < 100 Then";
if (true) break;

case 22:
//if
this.state = 25;
if (parent._vvvvvvvvvvvvv4<100) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 //BA.debugLineNum = 85;BA.debugLine="tasks.Add(bc.AsyncDrawRectRounded(bc.TargetRect";
_tasks.Add((Object)(parent._vvvvvvvvvvvvvvvvvvvvvvvvv3._asyncdrawrectrounded(parent._vvvvvvvvvvvvvvvvvvvvvvvvv3._targetrect,parent._vvvvvvvvvvvvvvvvvvvvvvvvv7,parent.__c.True,(int) (0),parent._vvvvvvvvvvvvvvvvvvvvvvvvvv1)));
 if (true) break;
;
 //BA.debugLineNum = 87;BA.debugLine="If Vertical Then";

case 25:
//if
this.state = 30;
if (parent._vvvvvvvvvvvvv3) { 
this.state = 27;
}else {
this.state = 29;
}if (true) break;

case 27:
//C
this.state = 30;
 //BA.debugLineNum = 88;BA.debugLine="r.Bottom = Round(CurrentValue / 100 * bc.mHeigh";
_r.setBottom((float) (parent.__c.Round(parent._vvvvvvvvvvvvv4/(double)100*parent._vvvvvvvvvvvvvvvvvvvvvvvvv3._mheight)));
 if (true) break;

case 29:
//C
this.state = 30;
 //BA.debugLineNum = 90;BA.debugLine="r.Right = Round(CurrentValue / 100 * bc.mWidth)";
_r.setRight((float) (parent.__c.Round(parent._vvvvvvvvvvvvv4/(double)100*parent._vvvvvvvvvvvvvvvvvvvvvvvvv3._mwidth)));
 if (true) break;

case 30:
//C
this.state = 31;
;
 //BA.debugLineNum = 93;BA.debugLine="tasks.Add(bc.AsyncDrawRectRounded(r, BusyBrush,";
_tasks.Add((Object)(parent._vvvvvvvvvvvvvvvvvvvvvvvvv3._asyncdrawrectrounded(_r,parent._vvvvvvvvvvvvvvvvvvvvvvvv0,parent.__c.True,(int) (0),parent._vvvvvvvvvvvvvvvvvvvvvvvvvv1)));
 //BA.debugLineNum = 94;BA.debugLine="bc.DrawBitmapCreatorsAsync(Me, \"BC\", tasks)";
parent._vvvvvvvvvvvvvvvvvvvvvvvvv3._drawbitmapcreatorsasync(parent,"BC",_tasks);
 //BA.debugLineNum = 95;BA.debugLine="Wait For BC_BitmapReady (bmp As B4XBitmap)";
parent.__c.WaitFor("bc_bitmapready", ba, this, null);
this.state = 38;
return;
case 38:
//C
this.state = 31;
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) result[0];
;
 //BA.debugLineNum = 96;BA.debugLine="If xui.IsB4J Then bmp = bc.Bitmap";
if (true) break;

case 31:
//if
this.state = 36;
if (parent._vvvvvvvvvvvv6.getIsB4J()) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
_bmp = parent._vvvvvvvvvvvvvvvvvvvvvvvvv3._getbitmap();
if (true) break;

case 36:
//C
this.state = 1;
;
 //BA.debugLineNum = 97;BA.debugLine="bc.SetBitmapToImageView(bmp, mIV)";
parent._vvvvvvvvvvvvvvvvvvvvvvvvv3._setbitmaptoimageview(_bmp,parent._vvvvvvvvvvvvvvvvvvvvvvvvv4);
 //BA.debugLineNum = 98;BA.debugLine="Sleep(30)";
parent.__c.Sleep(ba,this,(int) (30));
this.state = 39;
return;
case 39:
//C
this.state = 1;
;
 if (true) break;

case 37:
//C
this.state = -1;
;
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _bc_bitmapready(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 6;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvv4 = new Object();
 //BA.debugLineNum = 7;BA.debugLine="Public mBase As B4XView 'ignore";
_vvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI 'ignore";
_vvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 9;BA.debugLine="Private BusyBrush As BCBrush";
_vvvvvvvvvvvvvvvvvvvvvvvv0 = new b4j.example.bcpath._bcbrush();
 //BA.debugLineNum = 10;BA.debugLine="Private BackgroundColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
 //BA.debugLineNum = 11;BA.debugLine="Private BusyIndex As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
 //BA.debugLineNum = 12;BA.debugLine="Private bc As BitmapCreator";
_vvvvvvvvvvvvvvvvvvvvvvvvv3 = new b4j.example.bitmapcreator();
 //BA.debugLineNum = 13;BA.debugLine="Private mIV As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private TransparentBrush As BCBrush";
_vvvvvvvvvvvvvvvvvvvvvvvvv5 = new b4j.example.bcpath._bcbrush();
 //BA.debugLineNum = 15;BA.debugLine="Private Vertical As Boolean";
_vvvvvvvvvvvvv3 = false;
 //BA.debugLineNum = 16;BA.debugLine="Private CurrentValue As Float";
_vvvvvvvvvvvvv4 = 0f;
 //BA.debugLineNum = 17;BA.debugLine="Public EmptyColor As Int = xui.Color_White";
_vvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvv6.Color_White;
 //BA.debugLineNum = 18;BA.debugLine="Private EmptyBrush As BCBrush";
_vvvvvvvvvvvvvvvvvvvvvvvvv7 = new b4j.example.bcpath._bcbrush();
 //BA.debugLineNum = 19;BA.debugLine="Private mValue As Int";
_vvvvvvvvvvvvvvvvvvvvvvv4 = 0;
 //BA.debugLineNum = 20;BA.debugLine="Public Tag As Object";
_vvvvvvvvvvvvvvvvvvvvvv2 = new Object();
 //BA.debugLineNum = 21;BA.debugLine="Public ValueChangePerSecond As Float = 60";
_vvvvvvvvvvvvvvvvvvvvvvvvv0 = (float) (60);
 //BA.debugLineNum = 22;BA.debugLine="Public CornerRadius As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
 //BA.debugLineNum = 23;BA.debugLine="Public BrushOffsetDelta As Int = 3";
_vvvvvvvvvvvvvvvvvvvvvvvvvv2 = (int) (3);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4j.objects.ImageViewWrapper _iv = null;
 //BA.debugLineNum = 32;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
 //BA.debugLineNum = 33;BA.debugLine="mBase = Base";
_vvvvvvvvvvvv5.setObject((java.lang.Object)(_base));
 //BA.debugLineNum = 34;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvvvvvvvvvvvvvvvvv2 = _vvvvvvvvvvvv5.getTag();
 //BA.debugLineNum = 34;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvvvvvvv5.setTag(this);
 //BA.debugLineNum = 35;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 36;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
 //BA.debugLineNum = 37;BA.debugLine="mIV = iv";
_vvvvvvvvvvvvvvvvvvvvvvvvv4.setObject((java.lang.Object)(_iv.getObject()));
 //BA.debugLineNum = 38;BA.debugLine="setValue(Props.GetDefault(\"Value\", 100))";
_setvvvvvvvvvvvvvvvvvvvvvv0((int)(BA.ObjectToNumber(_props.GetDefault((Object)("Value"),(Object)(100)))));
 //BA.debugLineNum = 39;BA.debugLine="CurrentValue = mValue";
_vvvvvvvvvvvvv4 = (float) (_vvvvvvvvvvvvvvvvvvvvvvv4);
 //BA.debugLineNum = 40;BA.debugLine="mBase.AddView(mIV, 0, 0, 0, 0)";
_vvvvvvvvvvvv5.AddView((javafx.scene.Node)(_vvvvvvvvvvvvvvvvvvvvvvvvv4.getObject()),0,0,0,0);
 //BA.debugLineNum = 41;BA.debugLine="mBase.AddView(lbl, 0, 0, mBase.Width, mBase.Heigh";
_vvvvvvvvvvvv5.AddView((javafx.scene.Node)(_lbl.getObject()),0,0,_vvvvvvvvvvvv5.getWidth(),_vvvvvvvvvvvv5.getHeight());
 //BA.debugLineNum = 42;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
_vvvvvvvvvvvv5.SetColorAndBorder(_vvvvvvvvvvvv6.Color_Transparent,0,(int) (0),0);
 //BA.debugLineNum = 43;BA.debugLine="BackgroundColor = xui.PaintOrColorToColor(Props.G";
_vvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvvvvvvvvvvv6.PaintOrColorToColor(_props.Get((Object)("ProgressColor")));
 //BA.debugLineNum = 44;BA.debugLine="CornerRadius = Props.GetDefault(\"CornerRadius\", 1";
_vvvvvvvvvvvvvvvvvvvvvvvvvv1 = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("CornerRadius"),(Object)(15))));
 //BA.debugLineNum = 45;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
_base_resize(_vvvvvvvvvvvv5.getWidth(),_vvvvvvvvvvvv5.getHeight());
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public int  _getvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Public Sub getValue As Int";
 //BA.debugLineNum = 148;BA.debugLine="Return mValue";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvv4;
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return 0;
}
public boolean  _getvvvvvvvvvvvvvvvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Public Sub getVisible As Boolean";
 //BA.debugLineNum = 144;BA.debugLine="Return mBase.Visible";
if (true) return _vvvvvvvvvvvv5.getVisible();
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return false;
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
 //BA.debugLineNum = 151;BA.debugLine="Public Sub setValue (v As Int)";
 //BA.debugLineNum = 152;BA.debugLine="mValue = Max(0, Min(100, v))";
_vvvvvvvvvvvvvvvvvvvvvvv4 = (int) (__c.Max(0,__c.Min(100,_v)));
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvv4(int _v) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Public Sub SetValueNoAnimation (v As Int)";
 //BA.debugLineNum = 156;BA.debugLine="setValue(v)";
_setvvvvvvvvvvvvvvvvvvvvvv0(_v);
 //BA.debugLineNum = 157;BA.debugLine="CurrentValue = mValue";
_vvvvvvvvvvvvv4 = (float) (_vvvvvvvvvvvvvvvvvvvvvvv4);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvv7(boolean _b) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Public Sub setVisible(b As Boolean)";
 //BA.debugLineNum = 136;BA.debugLine="BusyIndex = BusyIndex + 1";
_vvvvvvvvvvvvvvvvvvvvvvvvv2 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvv2+1);
 //BA.debugLineNum = 137;BA.debugLine="If b Then";
if (_b) { 
 //BA.debugLineNum = 138;BA.debugLine="BusyLoop";
_vvvvvvvvvvvvvvvvvvvvvvvv2();
 };
 //BA.debugLineNum = 140;BA.debugLine="mBase.Visible = b";
_vvvvvvvvvvvv5.setVisible(_b);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvv6() throws Exception{
int _width = 0;
b4j.example.bitmapcreator _template = null;
b4j.example.bitmapcreator._argbcolor _bcolor = null;
 //BA.debugLineNum = 102;BA.debugLine="Public Sub UpdateGraphics";
 //BA.debugLineNum = 103;BA.debugLine="EmptyBrush = bc.CreateBrushFromColor(EmptyColor)";
_vvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvv3._createbrushfromcolor(_vvvvvvvvvvvvvvvvvvvvvvvvv6);
 //BA.debugLineNum = 104;BA.debugLine="TransparentBrush = bc.CreateBrushFromColor(xui.Co";
_vvvvvvvvvvvvvvvvvvvvvvvvv5 = _vvvvvvvvvvvvvvvvvvvvvvvvv3._createbrushfromcolor(_vvvvvvvvvvvv6.Color_Transparent);
 //BA.debugLineNum = 105;BA.debugLine="Dim Width As Int = 40";
_width = (int) (40);
 //BA.debugLineNum = 106;BA.debugLine="Dim Template As BitmapCreator";
_template = new b4j.example.bitmapcreator();
 //BA.debugLineNum = 107;BA.debugLine="Dim bcolor As ARGBColor";
_bcolor = new b4j.example.bitmapcreator._argbcolor();
 //BA.debugLineNum = 108;BA.debugLine="bc.ColorToARGB(BackgroundColor, bcolor)";
_vvvvvvvvvvvvvvvvvvvvvvvvv3._colortoargb(_vvvvvvvvvvvvvvvvvvvvvvvvv1,_bcolor);
 //BA.debugLineNum = 109;BA.debugLine="bcolor.r = Min(255, bcolor.r * 1.5)";
_bcolor.r = (int) (__c.Min(255,_bcolor.r*1.5));
 //BA.debugLineNum = 110;BA.debugLine="bcolor.g = Min(255, bcolor.g * 1.5)";
_bcolor.g = (int) (__c.Min(255,_bcolor.g*1.5));
 //BA.debugLineNum = 111;BA.debugLine="bcolor.b = Min(255, bcolor.b * 1.5)";
_bcolor.b = (int) (__c.Min(255,_bcolor.b*1.5));
 //BA.debugLineNum = 112;BA.debugLine="If Vertical Then";
if (_vvvvvvvvvvvvv3) { 
 //BA.debugLineNum = 113;BA.debugLine="Template.Initialize(mBase.Width / xui.Scale, mBa";
_template._initialize(ba,(int) (_vvvvvvvvvvvv5.getWidth()/(double)_vvvvvvvvvvvv6.getScale()),(int) (_vvvvvvvvvvvv5.getWidth()/(double)_vvvvvvvvvvvv6.getScale()+_width));
 }else {
 //BA.debugLineNum = 115;BA.debugLine="Template.Initialize(mBase.Height / xui.Scale + W";
_template._initialize(ba,(int) (_vvvvvvvvvvvv5.getHeight()/(double)_vvvvvvvvvvvv6.getScale()+_width),(int) (_vvvvvvvvvvvv5.getHeight()/(double)_vvvvvvvvvvvv6.getScale()));
 };
 //BA.debugLineNum = 118;BA.debugLine="Template.DrawRect(Template.TargetRect, Background";
_template._drawrect(_template._targetrect,_vvvvvvvvvvvvvvvvvvvvvvvvv1,__c.True,(int) (0));
 //BA.debugLineNum = 119;BA.debugLine="If Vertical Then";
if (_vvvvvvvvvvvvv3) { 
 //BA.debugLineNum = 120;BA.debugLine="Template.DrawLine(-Width / 2, Width / 2, Templat";
_template._drawline((float) (-_width/(double)2),(float) (_width/(double)2),(float) (_template._mwidth+_width/(double)2),(float) (_template._mheight-_width/(double)2),_vvvvvvvvvvvvvvvvvvvvvvvvv3._argbtocolor(_bcolor),_width);
 }else {
 //BA.debugLineNum = 122;BA.debugLine="Template.DrawLine(Width / 2, -Width / 2, Templat";
_template._drawline((float) (_width/(double)2),(float) (-_width/(double)2),(float) (_template._mwidth-_width/(double)2),(float) (_template._mheight+_width/(double)2),_vvvvvvvvvvvvvvvvvvvvvvvvv3._argbtocolor(_bcolor),_width);
 };
 //BA.debugLineNum = 124;BA.debugLine="BusyBrush = bc.CreateBrushFromBitmapCreator(Templ";
_vvvvvvvvvvvvvvvvvvvvvvvv0 = _vvvvvvvvvvvvvvvvvvvvvvvvv3._createbrushfrombitmapcreator(_template);
 //BA.debugLineNum = 125;BA.debugLine="If mValue = 100 Then";
if (_vvvvvvvvvvvvvvvvvvvvvvv4==100) { 
 //BA.debugLineNum = 126;BA.debugLine="bc.DrawRectRounded(bc.TargetRect, BackgroundColo";
_vvvvvvvvvvvvvvvvvvvvvvvvv3._drawrectrounded(_vvvvvvvvvvvvvvvvvvvvvvvvv3._targetrect,_vvvvvvvvvvvvvvvvvvvvvvvvv1,__c.True,(int) (0),(int) (15));
 }else {
 //BA.debugLineNum = 128;BA.debugLine="bc.DrawRectRounded2(bc.TargetRect, EmptyBrush, T";
_vvvvvvvvvvvvvvvvvvvvvvvvv3._drawrectrounded2(_vvvvvvvvvvvvvvvvvvvvvvvvv3._targetrect,_vvvvvvvvvvvvvvvvvvvvvvvvv7,__c.True,(int) (0),(int) (15));
 };
 //BA.debugLineNum = 130;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, mIV)";
_vvvvvvvvvvvvvvvvvvvvvvvvv3._setbitmaptoimageview(_vvvvvvvvvvvvvvvvvvvvvvvvv3._getbitmap(),_vvvvvvvvvvvvvvvvvvvvvvvvv4);
 //BA.debugLineNum = 131;BA.debugLine="setVisible(mBase.Visible)";
_setvvvvvvvvvvvvvvvvvvvvvvvv7(_vvvvvvvvvvvv5.getVisible());
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
