package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xbreadcrumb extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.b4xbreadcrumb", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xbreadcrumb.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvvvvvvvv3 = "";
public Object _vvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvvvvvvv2 = null;
public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _vvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public b4j.example.bitmapcreator _vvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public b4j.example.cssutils _vvvvvvvv0 = null;
public b4j.example.dateutils _vvvvvvvvv1 = null;
public b4j.example.main _main = null;
public b4j.example.scorebord _vvvvvvvvv2 = null;
public b4j.example.func _vvvvvvvvv3 = null;
public b4j.example.parseconfig _vvvvvvvvv4 = null;
public b4j.example.funcinet _vvvvvvvvv5 = null;
public b4j.example.httputils2service _vvvvvvvvv6 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 47;BA.debugLine="cvs.Resize(Width, Height)";
_vvvvvvvvvvvvv2.Resize(_width,_height);
 //BA.debugLineNum = 48;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv7.SetLayoutAnimated((int) (0),0,0,_width,_height);
 //BA.debugLineNum = 49;BA.debugLine="Draw";
_vvvvvvvvvvvvvvvvvvvvvvvvvv3();
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 6;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvv4 = new Object();
 //BA.debugLineNum = 7;BA.debugLine="Private mBase As B4XView 'ignore";
_vvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI 'ignore";
_vvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 9;BA.debugLine="Private cvs As B4XCanvas";
_vvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 10;BA.debugLine="Private mItems As List";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 11;BA.debugLine="Private RightPositions As List";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 12;BA.debugLine="Public TextColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
 //BA.debugLineNum = 13;BA.debugLine="Public fnt As B4XFont";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 14;BA.debugLine="Private offset As Int = 10dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv5 = __c.DipToCurrent((int) (10));
 //BA.debugLineNum = 15;BA.debugLine="Private bc As BitmapCreator";
_vvvvvvvvvvvvvvvvvvvvvvvvv3 = new b4j.example.bitmapcreator();
 //BA.debugLineNum = 16;BA.debugLine="Public CrumbColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
 //BA.debugLineNum = 17;BA.debugLine="Private TouchPanel As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private PressedItem As Int = -1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (int) (-1);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
String _items = "";
String _s = "";
 //BA.debugLineNum = 30;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 31;BA.debugLine="mBase = Base";
_vvvvvvvvvvvv5.setObject((java.lang.Object)(_base));
 //BA.debugLineNum = 32;BA.debugLine="cvs.Initialize(mBase)";
_vvvvvvvvvvvvv2.Initialize(ba,_vvvvvvvvvvvv5);
 //BA.debugLineNum = 33;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl.setObject((java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 34;BA.debugLine="fnt = xlbl.Font";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _xlbl.getFont();
 //BA.debugLineNum = 35;BA.debugLine="TextColor = xlbl.TextColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _xlbl.getTextColor();
 //BA.debugLineNum = 36;BA.debugLine="CrumbColor = xui.PaintOrColorToColor(Props.Get(\"C";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvv6.PaintOrColorToColor(_props.Get((Object)("CrumbColor")));
 //BA.debugLineNum = 37;BA.debugLine="TouchPanel = xui.CreatePanel(\"Touch\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvv6.CreatePanel(ba,"Touch");
 //BA.debugLineNum = 38;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, mBase.Width, mBas";
_vvvvvvvvvvvv5.AddView((javafx.scene.Node)(_vvvvvvvvvvvvvvvvvvvvvvvvvvv7.getObject()),0,0,_vvvvvvvvvvvv5.getWidth(),_vvvvvvvvvvvv5.getHeight());
 //BA.debugLineNum = 39;BA.debugLine="Dim items As String = Props.Get(\"Items\")";
_items = BA.ObjectToString(_props.Get((Object)("Items")));
 //BA.debugLineNum = 40;BA.debugLine="For Each s As String In Regex.Split(\"\\|\", items)";
{
final String[] group10 = __c.Regex.Split("\\|",_items);
final int groupLen10 = group10.length
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_s = group10[index10];
 //BA.debugLineNum = 41;BA.debugLine="mItems.Add(s)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.Add((Object)(_s));
 }
};
 //BA.debugLineNum = 43;BA.debugLine="Draw";
_vvvvvvvvvvvvvvvvvvvvvvvvvv3();
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
b4j.example.bitmapcreator._argbcolor _bcolor = null;
int _strokecolor = 0;
int[] _clrs = null;
int _left = 0;
int _i = 0;
int _sc = 0;
int _width = 0;
 //BA.debugLineNum = 52;BA.debugLine="Private Sub Draw";
 //BA.debugLineNum = 53;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
_vvvvvvvvvvvvv2.ClearRect(_vvvvvvvvvvvvv2.getTargetRect());
 //BA.debugLineNum = 54;BA.debugLine="Dim bcolor As ARGBColor";
_bcolor = new b4j.example.bitmapcreator._argbcolor();
 //BA.debugLineNum = 55;BA.debugLine="bc.ColorToARGB(CrumbColor, bcolor)";
_vvvvvvvvvvvvvvvvvvvvvvvvv3._colortoargb(_vvvvvvvvvvvvvvvvvvvvvvvvvvv6,_bcolor);
 //BA.debugLineNum = 56;BA.debugLine="bcolor.r = Min(255, bcolor.r * 2)";
_bcolor.r = (int) (__c.Min(255,_bcolor.r*2));
 //BA.debugLineNum = 57;BA.debugLine="bcolor.g = Min(255, bcolor.g * 2)";
_bcolor.g = (int) (__c.Min(255,_bcolor.g*2));
 //BA.debugLineNum = 58;BA.debugLine="bcolor.b = Min(255, bcolor.b * 2)";
_bcolor.b = (int) (__c.Min(255,_bcolor.b*2));
 //BA.debugLineNum = 59;BA.debugLine="Dim strokeColor As Int = bc.ARGBToColor(bcolor)";
_strokecolor = _vvvvvvvvvvvvvvvvvvvvvvvvv3._argbtocolor(_bcolor);
 //BA.debugLineNum = 61;BA.debugLine="bc.ColorToARGB(CrumbColor, bcolor)";
_vvvvvvvvvvvvvvvvvvvvvvvvv3._colortoargb(_vvvvvvvvvvvvvvvvvvvvvvvvvvv6,_bcolor);
 //BA.debugLineNum = 62;BA.debugLine="bcolor.r = bcolor.r * 0.8";
_bcolor.r = (int) (_bcolor.r*0.8);
 //BA.debugLineNum = 63;BA.debugLine="bcolor.g = bcolor.g * 0.8";
_bcolor.g = (int) (_bcolor.g*0.8);
 //BA.debugLineNum = 64;BA.debugLine="bcolor.b = bcolor.b * 0.8";
_bcolor.b = (int) (_bcolor.b*0.8);
 //BA.debugLineNum = 65;BA.debugLine="Dim Clrs() As Int = Array As Int(CrumbColor, bc.A";
_clrs = new int[]{_vvvvvvvvvvvvvvvvvvvvvvvvvvv6,_vvvvvvvvvvvvvvvvvvvvvvvvv3._argbtocolor(_bcolor)};
 //BA.debugLineNum = 67;BA.debugLine="RightPositions.Clear";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv2.Clear();
 //BA.debugLineNum = 68;BA.debugLine="If mItems.Size = 0 Then Return";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 69;BA.debugLine="Dim Left As Int = 0";
_left = (int) (0);
 //BA.debugLineNum = 70;BA.debugLine="For i = 0 To mItems.Size - 1";
{
final int step16 = 1;
final int limit16 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
 //BA.debugLineNum = 71;BA.debugLine="Dim sc As Int";
_sc = 0;
 //BA.debugLineNum = 72;BA.debugLine="If PressedItem = i Then sc = strokeColor Else sc";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvv0==_i) { 
_sc = _strokecolor;}
else {
_sc = (int) (0);};
 //BA.debugLineNum = 73;BA.debugLine="Dim width As Int = DrawItem(Left, mItems.Get(i),";
_width = _vvvvvvvvvvvvvvvvvvvvvvvvvv4(_left,BA.ObjectToString(_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.Get(_i)),_i==0,_i==_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.getSize()-1,_clrs[(int) (_i%_clrs.length)],_sc);
 //BA.debugLineNum = 74;BA.debugLine="Left = Left + width + offset + 2dip";
_left = (int) (_left+_width+_vvvvvvvvvvvvvvvvvvvvvvvvvvv5+__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 75;BA.debugLine="RightPositions.Add(Left)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv2.Add((Object)(_left));
 }
};
 //BA.debugLineNum = 77;BA.debugLine="cvs.Invalidate";
_vvvvvvvvvvvvv2.Invalidate();
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public int  _vvvvvvvvvvvvvvvvvvvvvvvvvv4(int _left,String _text,boolean _first,boolean _last,int _clr,int _strokecolor) throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _itemwidth = 0;
int _itemheight = 0;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
 //BA.debugLineNum = 80;BA.debugLine="Private Sub DrawItem(Left As Int, Text As String,";
 //BA.debugLineNum = 81;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(Text, fnt)";
_r = _vvvvvvvvvvvvv2.MeasureText(_text,_vvvvvvvvvvvvvvvvvvvvvvvvvvv4);
 //BA.debugLineNum = 82;BA.debugLine="Dim ItemWidth As Int = r.Width + 30dip";
_itemwidth = (int) (_r.getWidth()+__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 83;BA.debugLine="Dim ItemHeight As Int = cvs.TargetRect.Height";
_itemheight = (int) (_vvvvvvvvvvvvv2.getTargetRect().getHeight());
 //BA.debugLineNum = 84;BA.debugLine="Dim BaseLine As Int = cvs.TargetRect.CenterY - r.";
_baseline = (int) (_vvvvvvvvvvvvv2.getTargetRect().getCenterY()-_r.getHeight()/(double)2-_r.getTop());
 //BA.debugLineNum = 85;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 86;BA.debugLine="p.Initialize(Left, 0)";
_p.Initialize((float) (_left),(float) (0));
 //BA.debugLineNum = 87;BA.debugLine="p.LineTo(Left + ItemWidth, 0)";
_p.LineTo((float) (_left+_itemwidth),(float) (0));
 //BA.debugLineNum = 88;BA.debugLine="If Last = False Then";
if (_last==__c.False) { 
 //BA.debugLineNum = 89;BA.debugLine="p.LineTo(Left + ItemWidth + offset, ItemHeight /";
_p.LineTo((float) (_left+_itemwidth+_vvvvvvvvvvvvvvvvvvvvvvvvvvv5),(float) (_itemheight/(double)2));
 };
 //BA.debugLineNum = 91;BA.debugLine="p.LineTo(Left + ItemWidth, ItemHeight)";
_p.LineTo((float) (_left+_itemwidth),(float) (_itemheight));
 //BA.debugLineNum = 92;BA.debugLine="If First = False Then";
if (_first==__c.False) { 
 //BA.debugLineNum = 93;BA.debugLine="p.LineTo(Left - offset, ItemHeight)";
_p.LineTo((float) (_left-_vvvvvvvvvvvvvvvvvvvvvvvvvvv5),(float) (_itemheight));
 //BA.debugLineNum = 94;BA.debugLine="p.LineTo(Left, ItemHeight / 2)";
_p.LineTo((float) (_left),(float) (_itemheight/(double)2));
 //BA.debugLineNum = 95;BA.debugLine="p.LineTo(Left - offset, 0)";
_p.LineTo((float) (_left-_vvvvvvvvvvvvvvvvvvvvvvvvvvv5),(float) (0));
 }else {
 //BA.debugLineNum = 97;BA.debugLine="p.LineTo(Left, ItemHeight)";
_p.LineTo((float) (_left),(float) (_itemheight));
 };
 //BA.debugLineNum = 99;BA.debugLine="p.LineTo(Left, 0)";
_p.LineTo((float) (_left),(float) (0));
 //BA.debugLineNum = 100;BA.debugLine="cvs.DrawPath(p, clr, True, 0)";
_vvvvvvvvvvvvv2.DrawPath(_p,_clr,__c.True,(float) (0));
 //BA.debugLineNum = 101;BA.debugLine="If strokeColor <> 0 Then";
if (_strokecolor!=0) { 
 //BA.debugLineNum = 102;BA.debugLine="cvs.DrawPath(p, strokeColor, False, 3dip)";
_vvvvvvvvvvvvv2.DrawPath(_p,_strokecolor,__c.False,(float) (__c.DipToCurrent((int) (3))));
 };
 //BA.debugLineNum = 105;BA.debugLine="cvs.DrawText(Text, Left + ItemWidth / 2, BaseLine";
_vvvvvvvvvvvvv2.DrawText(_text,_left+_itemwidth/(double)2,_baseline,_vvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvv3,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 //BA.debugLineNum = 106;BA.debugLine="Return ItemWidth";
if (true) return _itemwidth;
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return 0;
}
public int  _vvvvvvvvvvvvvvvvvvvvvvvvvv5(int _x,int _y) throws Exception{
int _r = 0;
int _i = 0;
 //BA.debugLineNum = 130;BA.debugLine="Private Sub FindItem (x As Int, y As Int) As Int";
 //BA.debugLineNum = 131;BA.debugLine="If RightPositions.Size = 0 Then Return -1";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvv2.getSize()==0) { 
if (true) return (int) (-1);};
 //BA.debugLineNum = 132;BA.debugLine="If y < 0 Or y > cvs.TargetRect.Height Then Return";
if (_y<0 || _y>_vvvvvvvvvvvvv2.getTargetRect().getHeight()) { 
if (true) return (int) (-1);};
 //BA.debugLineNum = 133;BA.debugLine="Dim r As Int = RightPositions.Get(RightPositions.";
_r = (int)(BA.ObjectToNumber(_vvvvvvvvvvvvvvvvvvvvvvvvvvv2.Get((int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvv2.getSize()-1))));
 //BA.debugLineNum = 134;BA.debugLine="If x > r Then Return -1";
if (_x>_r) { 
if (true) return (int) (-1);};
 //BA.debugLineNum = 135;BA.debugLine="For i = RightPositions.Size - 2 To 0 Step -1";
{
final int step5 = -1;
final int limit5 = (int) (0);
_i = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvv2.getSize()-2) ;
for (;_i >= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 136;BA.debugLine="Dim r As Int = RightPositions.Get(i)";
_r = (int)(BA.ObjectToNumber(_vvvvvvvvvvvvvvvvvvvvvvvvvvv2.Get(_i)));
 //BA.debugLineNum = 137;BA.debugLine="If x > r Then Return i + 1";
if (_x>_r) { 
if (true) return (int) (_i+1);};
 }
};
 //BA.debugLineNum = 139;BA.debugLine="Return 0";
if (true) return (int) (0);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _getvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Public Sub getItems As List";
 //BA.debugLineNum = 148;BA.debugLine="Return mItems";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvv1;
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 22;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvv3 = _eventname;
 //BA.debugLineNum = 23;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvv4 = _callback;
 //BA.debugLineNum = 24;BA.debugLine="mItems.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.Initialize();
 //BA.debugLineNum = 25;BA.debugLine="RightPositions.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv2.Initialize();
 //BA.debugLineNum = 26;BA.debugLine="bc.Initialize(1, 1)";
_vvvvvvvvvvvvvvvvvvvvvvvvv3._initialize(ba,(int) (1),(int) (1));
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvv0(anywheresoftware.b4a.objects.collections.List _i) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Public Sub setItems (i As List)";
 //BA.debugLineNum = 143;BA.debugLine="mItems = i";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _i;
 //BA.debugLineNum = 144;BA.debugLine="Draw";
_vvvvvvvvvvvvvvvvvvvvvvvvvv3();
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public String  _touch_touch(int _action,float _x,float _y) throws Exception{
int _prev = 0;
int _index = 0;
anywheresoftware.b4a.objects.collections.List _items = null;
int _i = 0;
 //BA.debugLineNum = 109;BA.debugLine="Private Sub Touch_Touch (Action As Int, X As Float";
 //BA.debugLineNum = 110;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,_vvvvvvvvvvvvvvvvvvvvvvvvvvv7.TOUCH_ACTION_DOWN,_vvvvvvvvvvvvvvvvvvvvvvvvvvv7.TOUCH_ACTION_MOVE,_vvvvvvvvvvvvvvvvvvvvvvvvvvv7.TOUCH_ACTION_UP)) {
case 0: 
case 1: {
 //BA.debugLineNum = 112;BA.debugLine="Dim prev As Int = PressedItem";
_prev = _vvvvvvvvvvvvvvvvvvvvvvvvvvv0;
 //BA.debugLineNum = 113;BA.debugLine="PressedItem = FindItem(X, Y)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _vvvvvvvvvvvvvvvvvvvvvvvvvv5((int) (_x),(int) (_y));
 //BA.debugLineNum = 114;BA.debugLine="If prev <> PressedItem Then Draw";
if (_prev!=_vvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvv3();};
 break; }
case 2: {
 //BA.debugLineNum = 116;BA.debugLine="Dim index As Int = FindItem(X, Y)";
_index = _vvvvvvvvvvvvvvvvvvvvvvvvvv5((int) (_x),(int) (_y));
 //BA.debugLineNum = 117;BA.debugLine="If index = PressedItem And index > -1 Then";
if (_index==_vvvvvvvvvvvvvvvvvvvvvvvvvvv0 && _index>-1) { 
 //BA.debugLineNum = 118;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 119;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 120;BA.debugLine="For i = 0 To index";
{
final int step11 = 1;
final int limit11 = _index;
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
 //BA.debugLineNum = 121;BA.debugLine="Items.Add(mItems.Get(i))";
_items.Add(_vvvvvvvvvvvvvvvvvvvvvvvvvvv1.Get(_i));
 }
};
 //BA.debugLineNum = 123;BA.debugLine="CallSub2(mCallBack, mEventName & \"_CrumbClick\"";
__c.CallSubNew2(ba,_vvvvvvvvvvvv4,_vvvvvvvvvvvv3+"_CrumbClick",(Object)(_items));
 };
 //BA.debugLineNum = 125;BA.debugLine="PressedItem = -1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (int) (-1);
 //BA.debugLineNum = 126;BA.debugLine="Draw";
_vvvvvvvvvvvvvvvvvvvvvvvvvv3();
 break; }
}
;
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
