package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class scrollinglabel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.scrollinglabel", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.scrollinglabel.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvvvvvvvv3 = "";
public Object _vvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvvvvv6 = null;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _vvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvvvvvvv2 = null;
public Object _vvvvvvvvvvvvvvvvvvvvvv2 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
public b4j.example.cssutils _vvvvvvvv0 = null;
public b4j.example.dateutils _vvvvvvvvv1 = null;
public b4j.example.main _main = null;
public b4j.example.scorebord _vvvvvvvvv2 = null;
public b4j.example.func _vvvvvvvvv3 = null;
public b4j.example.parseconfig _vvvvvvvvv4 = null;
public b4j.example.funcinet _vvvvvvvvv5 = null;
public b4j.example.httputils2service _vvvvvvvvv6 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 39;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Width";
_vvvvvvvvvvvv5.GetView((int) (0)).SetLayoutAnimated((int) (0),0,0,_width,_height);
 //BA.debugLineNum = 40;BA.debugLine="setText(mText)";
_setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 4;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvv4 = new Object();
 //BA.debugLineNum = 5;BA.debugLine="Public mBase As B4XView";
_vvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private xui As XUI 'ignore";
_vvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 7;BA.debugLine="Private mText As String";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
 //BA.debugLineNum = 8;BA.debugLine="Private taskIndex As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
 //BA.debugLineNum = 9;BA.debugLine="Public WidthPerSecond As Int = 100dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = __c.DipToCurrent((int) (100));
 //BA.debugLineNum = 10;BA.debugLine="Private fnt As B4XFont";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 11;BA.debugLine="Private cvs As B4XCanvas";
_vvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 12;BA.debugLine="Public Tag As Object";
_vvvvvvvvvvvvvvvvvvvvvv2 = new Object();
 //BA.debugLineNum = 13;BA.debugLine="Public StartPositionDelay As Int = 1000";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = (int) (1000);
 //BA.debugLineNum = 14;BA.debugLine="Private mTextColor As Int = xui.Color_Black";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvv6.Color_Black;
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _l = null;
 //BA.debugLineNum = 23;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 24;BA.debugLine="mBase = Base";
_vvvvvvvvvvvv5.setObject((java.lang.Object)(_base));
 //BA.debugLineNum = 25;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvvvvvvvvvvvvvvvvv2 = _vvvvvvvvvvvv5.getTag();
 //BA.debugLineNum = 25;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvvvvvvv5.setTag(this);
 //BA.debugLineNum = 27;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _vvvvvvvvvvvv6.CreatePanel(ba,"");
 //BA.debugLineNum = 28;BA.debugLine="mBase.AddView(p, 0, 0, mBase.Width, mBase.Height)";
_vvvvvvvvvvvv5.AddView((javafx.scene.Node)(_p.getObject()),0,0,_vvvvvvvvvvvv5.getWidth(),_vvvvvvvvvvvv5.getHeight());
 //BA.debugLineNum = 29;BA.debugLine="mText = Lbl.Text";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _lbl.getText();
 //BA.debugLineNum = 30;BA.debugLine="Dim l As B4XView = Lbl";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
_l.setObject((java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 31;BA.debugLine="fnt = l.Font";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _l.getFont();
 //BA.debugLineNum = 32;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _vvvvvvvvvvvv6.CreatePanel(ba,"");
 //BA.debugLineNum = 33;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 2dip, 2dip)";
_p.SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 34;BA.debugLine="cvs.Initialize(p)";
_vvvvvvvvvvvvv2.Initialize(ba,_p);
 //BA.debugLineNum = 35;BA.debugLine="setText(mText)";
_setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Public Sub getText As String";
 //BA.debugLineNum = 92;BA.debugLine="Return mText";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public int  _getvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Public Sub getTextColor As Int";
 //BA.debugLineNum = 125;BA.debugLine="Return mTextColor";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 19;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvv3 = _eventname;
 //BA.debugLineNum = 20;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvv4 = _callback;
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public float  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(String _s,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Private Sub MeasureTextWidth(s As String, font1 As";
 //BA.debugLineNum = 116;BA.debugLine="Return cvs.MeasureText(s, font1).Width";
if (true) return _vvvvvvvvvvvvv2.MeasureText(_s,_font1).getWidth();
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return 0f;
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(String _t) throws Exception{
boolean _needtocreatenewlabel = false;
anywheresoftware.b4a.objects.B4XViewWrapper _parent = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
float _originaltextwidth = 0f;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
String _duplicatetext = "";
float _width = 0f;
 //BA.debugLineNum = 43;BA.debugLine="Public Sub setText(t As String)";
 //BA.debugLineNum = 44;BA.debugLine="Dim NeedToCreateNewLabel As Boolean = True";
_needtocreatenewlabel = __c.True;
 //BA.debugLineNum = 45;BA.debugLine="Dim parent As B4XView = mBase.GetView(0)";
_parent = new anywheresoftware.b4a.objects.B4XViewWrapper();
_parent = _vvvvvvvvvvvv5.GetView((int) (0));
 //BA.debugLineNum = 46;BA.debugLine="If parent.NumberOfViews > 0 Then";
if (_parent.getNumberOfViews()>0) { 
 //BA.debugLineNum = 48;BA.debugLine="Dim p As B4XView = parent.GetView(0)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _parent.GetView((int) (0));
 //BA.debugLineNum = 49;BA.debugLine="If p.Tag = \"static\" Then";
if ((_p.getTag()).equals((Object)("static"))) { 
 //BA.debugLineNum = 50;BA.debugLine="NeedToCreateNewLabel = False";
_needtocreatenewlabel = __c.False;
 //BA.debugLineNum = 51;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, parent.Width, pare";
_p.SetLayoutAnimated((int) (0),0,0,_parent.getWidth(),_parent.getHeight());
 //BA.debugLineNum = 52;BA.debugLine="Dim xlbl As B4XView = p.GetView(0)";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = _p.GetView((int) (0));
 //BA.debugLineNum = 53;BA.debugLine="xlbl.SetLayoutAnimated(0, 0, 0, parent.Width, p";
_xlbl.SetLayoutAnimated((int) (0),0,0,_parent.getWidth(),_parent.getHeight());
 };
 };
 //BA.debugLineNum = 57;BA.debugLine="Dim originalTextWidth As Float = MeasureTextWidth";
_originaltextwidth = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(_t,_vvvvvvvvvvvvvvvvvvvvvvvvvvv4);
 //BA.debugLineNum = 58;BA.debugLine="mText = t";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _t;
 //BA.debugLineNum = 59;BA.debugLine="If NeedToCreateNewLabel Then";
if (_needtocreatenewlabel) { 
 //BA.debugLineNum = 60;BA.debugLine="parent.RemoveAllViews";
_parent.RemoveAllViews();
 //BA.debugLineNum = 61;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _vvvvvvvvvvvv6.CreatePanel(ba,"");
 //BA.debugLineNum = 62;BA.debugLine="parent.AddView(p, 0, 0, parent.Width, parent.Hei";
_parent.AddView((javafx.scene.Node)(_p.getObject()),0,0,_parent.getWidth(),_parent.getHeight());
 //BA.debugLineNum = 63;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 64;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
 //BA.debugLineNum = 69;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl.setObject((java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 70;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"LEFT\")";
_xlbl.SetTextAlignment("CENTER","LEFT");
 //BA.debugLineNum = 71;BA.debugLine="xlbl.Font = fnt";
_xlbl.setFont(_vvvvvvvvvvvvvvvvvvvvvvvvvvv4);
 //BA.debugLineNum = 73;BA.debugLine="p.AddView(xlbl, 0, 0, mBase.Width, mBase.Height)";
_p.AddView((javafx.scene.Node)(_xlbl.getObject()),0,0,_vvvvvvvvvvvv5.getWidth(),_vvvvvvvvvvvv5.getHeight());
 };
 //BA.debugLineNum = 75;BA.debugLine="xlbl.TextColor = mTextColor";
_xlbl.setTextColor(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
 //BA.debugLineNum = 76;BA.debugLine="If originalTextWidth <= mBase.Width Then";
if (_originaltextwidth<=_vvvvvvvvvvvv5.getWidth()) { 
 //BA.debugLineNum = 77;BA.debugLine="xlbl.Text = t";
_xlbl.setText(_t);
 //BA.debugLineNum = 78;BA.debugLine="p.Tag = \"static\"";
_p.setTag((Object)("static"));
 //BA.debugLineNum = 79;BA.debugLine="StopScrolling";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
 }else {
 //BA.debugLineNum = 81;BA.debugLine="p.Tag = \"\"";
_p.setTag((Object)(""));
 //BA.debugLineNum = 82;BA.debugLine="Dim duplicateText As String = t & \"   \" & t";
_duplicatetext = _t+"   "+_t;
 //BA.debugLineNum = 83;BA.debugLine="Dim Width As Float = MeasureTextWidth(duplicateT";
_width = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(_duplicatetext,_vvvvvvvvvvvvvvvvvvvvvvvvvvv4);
 //BA.debugLineNum = 84;BA.debugLine="p.Width = Width";
_p.setWidth(_width);
 //BA.debugLineNum = 85;BA.debugLine="xlbl.Width = Width";
_xlbl.setWidth(_width);
 //BA.debugLineNum = 86;BA.debugLine="xlbl.Text = duplicateText";
_xlbl.setText(_duplicatetext);
 //BA.debugLineNum = 87;BA.debugLine="StartScrolling (p, originalTextWidth)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_p,_originaltextwidth);
 };
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvv3(int _c) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Public Sub setTextColor(c As Int)";
 //BA.debugLineNum = 120;BA.debugLine="mTextColor = c";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _c;
 //BA.debugLineNum = 121;BA.debugLine="setText(mText)";
_setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
public void  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(anywheresoftware.b4a.objects.B4XViewWrapper _p,float _originalwidth) throws Exception{
ResumableSub_StartScrolling rsub = new ResumableSub_StartScrolling(this,_p,_originalwidth);
rsub.resume(ba, null);
}
public static class ResumableSub_StartScrolling extends BA.ResumableSub {
public ResumableSub_StartScrolling(b4j.example.scrollinglabel parent,anywheresoftware.b4a.objects.B4XViewWrapper _p,float _originalwidth) {
this.parent = parent;
this._p = _p;
this._originalwidth = _originalwidth;
}
b4j.example.scrollinglabel parent;
anywheresoftware.b4a.objects.B4XViewWrapper _p;
float _originalwidth;
int _myindex = 0;
int _duration = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 100;BA.debugLine="taskIndex = taskIndex + 1";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (int) (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0+1);
 //BA.debugLineNum = 101;BA.debugLine="Dim myIndex As Int = taskIndex";
_myindex = parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
 //BA.debugLineNum = 102;BA.debugLine="Dim duration As Int = p.Width / WidthPerSecond *";
_duration = (int) (_p.getWidth()/(double)parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1*1000);
 //BA.debugLineNum = 103;BA.debugLine="Sleep(StartPositionDelay)";
parent.__c.Sleep(ba,this,parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2);
this.state = 23;
return;
case 23:
//C
this.state = 1;
;
 //BA.debugLineNum = 104;BA.debugLine="If myIndex <> taskIndex Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_myindex!=parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 105;BA.debugLine="Do While True";
if (true) break;

case 7:
//do while
this.state = 22;
while (parent.__c.True) {
this.state = 9;
if (true) break;
}
if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 106;BA.debugLine="p.SetLayoutAnimated(duration, -(p.Width - Origin";
_p.SetLayoutAnimated(_duration,-(_p.getWidth()-_originalwidth),_p.getTop(),_p.getWidth(),_p.getHeight());
 //BA.debugLineNum = 107;BA.debugLine="Sleep(duration)";
parent.__c.Sleep(ba,this,_duration);
this.state = 24;
return;
case 24:
//C
this.state = 10;
;
 //BA.debugLineNum = 108;BA.debugLine="If myIndex <> taskIndex Then Return";
if (true) break;

case 10:
//if
this.state = 15;
if (_myindex!=parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) return ;
if (true) break;

case 15:
//C
this.state = 16;
;
 //BA.debugLineNum = 109;BA.debugLine="Sleep(StartPositionDelay)";
parent.__c.Sleep(ba,this,parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2);
this.state = 25;
return;
case 25:
//C
this.state = 16;
;
 //BA.debugLineNum = 110;BA.debugLine="If myIndex <> taskIndex Then Return";
if (true) break;

case 16:
//if
this.state = 21;
if (_myindex!=parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
this.state = 18;
;}if (true) break;

case 18:
//C
this.state = 21;
if (true) return ;
if (true) break;

case 21:
//C
this.state = 7;
;
 //BA.debugLineNum = 111;BA.debugLine="p.SetLayoutAnimated(0, 0, p.Top, p.Width, p.Heig";
_p.SetLayoutAnimated((int) (0),0,_p.getTop(),_p.getWidth(),_p.getHeight());
 if (true) break;

case 22:
//C
this.state = -1;
;
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6() throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Private Sub StopScrolling";
 //BA.debugLineNum = 96;BA.debugLine="taskIndex = taskIndex + 1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0+1);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
