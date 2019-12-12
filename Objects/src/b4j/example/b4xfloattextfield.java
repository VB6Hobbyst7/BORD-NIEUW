package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xfloattextfield extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.b4xfloattextfield", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xfloattextfield.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvvvvvvvv3 = "";
public Object _vvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public float _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0f;
public float _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0f;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = false;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public Object _vvvvvvvvvvvvvvvvvvvvvv2 = null;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = "";
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = false;
public b4j.example.b4xfloattextfield _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public b4j.example.cssutils _vvvvvvvv0 = null;
public b4j.example.dateutils _vvvvvvvvv1 = null;
public b4j.example.main _main = null;
public b4j.example.scorebord _vvvvvvvvv2 = null;
public b4j.example.func _vvvvvvvvv3 = null;
public b4j.example.parseconfig _vvvvvvvvv4 = null;
public b4j.example.funcinet _vvvvvvvvv5 = null;
public b4j.example.httputils2service _vvvvvvvvv6 = null;
public String  _base_resize(double _width,double _height) throws Exception{
int _firstdistance = 0;
 //BA.debugLineNum = 174;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 175;BA.debugLine="mTextField.SetLayoutAnimated(0, 0, 0, Width, Heig";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.SetLayoutAnimated((int) (0),0,0,_width,_height);
 //BA.debugLineNum = 176;BA.debugLine="Dim FirstDistance As Int = 2dip";
_firstdistance = __c.DipToCurrent((int) (2));
 //BA.debugLineNum = 177;BA.debugLine="If Multiline And xui.IsB4J Then FirstDistance = 2";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 && _vvvvvvvvvvvv6.getIsB4J()) { 
_firstdistance = __c.DipToCurrent((int) (22));};
 //BA.debugLineNum = 178;BA.debugLine="If lblV.IsInitialized Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.IsInitialized()) { 
 //BA.debugLineNum = 179;BA.debugLine="lblV.SetLayoutAnimated(0, Width - lblV.Width - F";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.SetLayoutAnimated((int) (0),_width-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getWidth()-_firstdistance,0,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getWidth(),_height);
 //BA.debugLineNum = 180;BA.debugLine="FirstDistance = FirstDistance + lblV.Width + 2di";
_firstdistance = (int) (_firstdistance+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getWidth()+__c.DipToCurrent((int) (2)));
 };
 //BA.debugLineNum = 182;BA.debugLine="If lblClear.IsInitialized Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.IsInitialized()) { 
 //BA.debugLineNum = 183;BA.debugLine="lblClear.SetLayoutAnimated(0, Width - lblClear.W";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.SetLayoutAnimated((int) (0),_width-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getWidth()-_firstdistance,0,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getWidth(),_height);
 };
 //BA.debugLineNum = 185;BA.debugLine="UpdateLabel(mTextField.Text, True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getText(),__c.True);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 16;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvv4 = new Object();
 //BA.debugLineNum = 17;BA.debugLine="Public mBase As B4XView 'ignore";
_vvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI 'ignore";
_vvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 19;BA.debugLine="Private mTextField As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private Duration As Int = 200";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (int) (200);
 //BA.debugLineNum = 21;BA.debugLine="Public LargeLabelTextSize = 18, SmallLabelTextSiz";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = (float) (18);
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = (float) (14);
 //BA.debugLineNum = 22;BA.debugLine="Private LargeLabel As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
 //BA.debugLineNum = 23;BA.debugLine="Private MeasuringCanvas As B4XCanvas";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 24;BA.debugLine="Public HintColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
 //BA.debugLineNum = 25;BA.debugLine="Public NonFocusedHintColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
 //BA.debugLineNum = 26;BA.debugLine="Private HorizontalPadding As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
 //BA.debugLineNum = 27;BA.debugLine="Private HintImageView As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Public HintText As String";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
 //BA.debugLineNum = 29;BA.debugLine="Public HintFont As B4XFont";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 30;BA.debugLine="Private LargeFocused, LargeNotFocused, SmallFocus";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Public Focused As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = false;
 //BA.debugLineNum = 32;BA.debugLine="Public lblClear As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Public lblV As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private mProps As Map";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 35;BA.debugLine="Public Tag As Object";
_vvvvvvvvvvvvvvvvvvvvvv2 = new Object();
 //BA.debugLineNum = 36;BA.debugLine="Private KeyboardType As String 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 37;BA.debugLine="Private Multiline As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = false;
 //BA.debugLineNum = 38;BA.debugLine="Private mNextTextField As B4XFloatTextField";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new b4j.example.b4xfloattextfield();
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Private Sub CreateAcceptButton";
 //BA.debugLineNum = 119;BA.debugLine="If mProps.GetDefault(\"ShowAccept\", True) = False";
if ((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault((Object)("ShowAccept"),(Object)(__c.True))).equals((Object)(__c.False))) { 
if (true) return "";};
 //BA.debugLineNum = 120;BA.debugLine="lblV = CreateButton(Chr(0xE5CA))";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(BA.ObjectToString(__c.Chr((int) (0xe5ca))));
 //BA.debugLineNum = 121;BA.debugLine="lblV.Tag = \"v\"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.setTag((Object)("v"));
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _vvvvvvvvvvvvvvvvvvvvvv3(anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r,int _color,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _c = null;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
 //BA.debugLineNum = 230;BA.debugLine="Private Sub CreateBitmap(r As B4XRect, Color As In";
 //BA.debugLineNum = 231;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _vvvvvvvvvvvv6.CreatePanel(ba,"");
 //BA.debugLineNum = 232;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Max(1, r.Width + 2di";
_p.SetLayoutAnimated((int) (0),0,0,__c.Max(1,_r.getWidth()+__c.DipToCurrent((int) (2))),__c.Max(1,_r.getHeight()+__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 233;BA.debugLine="Dim c As B4XCanvas";
_c = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 234;BA.debugLine="c.Initialize(p)";
_c.Initialize(ba,_p);
 //BA.debugLineNum = 235;BA.debugLine="Dim BaseLine As Int = p.Height / 2 - r.Height / 2";
_baseline = (int) (_p.getHeight()/(double)2-_r.getHeight()/(double)2-_r.getTop());
 //BA.debugLineNum = 236;BA.debugLine="c.DrawText(HintText, p.Width / 2, BaseLine, Fnt,";
_c.DrawText(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1,_p.getWidth()/(double)2,_baseline,_fnt,_color,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 //BA.debugLineNum = 237;BA.debugLine="Dim bmp As B4XBitmap = c.CreateBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _c.CreateBitmap();
 //BA.debugLineNum = 238;BA.debugLine="c.Release";
_c.Release();
 //BA.debugLineNum = 239;BA.debugLine="Return bmp";
if (true) return _bmp;
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(String _text) throws Exception{
anywheresoftware.b4j.objects.LabelWrapper _lc = null;
anywheresoftware.b4a.objects.B4XViewWrapper _x = null;
 //BA.debugLineNum = 160;BA.debugLine="Private Sub CreateButton (Text As String) As B4XVi";
 //BA.debugLineNum = 161;BA.debugLine="Dim lc As Label";
_lc = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 162;BA.debugLine="lc.Initialize(\"lc\")";
_lc.Initialize(ba,"lc");
 //BA.debugLineNum = 163;BA.debugLine="Dim x As B4XView = lc";
_x = new anywheresoftware.b4a.objects.B4XViewWrapper();
_x.setObject((java.lang.Object)(_lc.getObject()));
 //BA.debugLineNum = 164;BA.debugLine="x = lc";
_x.setObject((java.lang.Object)(_lc.getObject()));
 //BA.debugLineNum = 165;BA.debugLine="x.Font = xui.CreateMaterialIcons(20)";
_x.setFont(_vvvvvvvvvvvv6.CreateMaterialIcons((float) (20)));
 //BA.debugLineNum = 166;BA.debugLine="x.Text = Text";
_x.setText(_text);
 //BA.debugLineNum = 167;BA.debugLine="x.TextColor = mTextField.TextColor";
_x.setTextColor(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getTextColor());
 //BA.debugLineNum = 168;BA.debugLine="x.Visible = False";
_x.setVisible(__c.False);
 //BA.debugLineNum = 169;BA.debugLine="x.SetTextAlignment(\"CENTER\", \"CENTER\")";
_x.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 170;BA.debugLine="mBase.AddView(x, 0, 0, 30dip, 30dip)";
_vvvvvvvvvvvv5.AddView((javafx.scene.Node)(_x.getObject()),0,0,__c.DipToCurrent((int) (30)),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 171;BA.debugLine="Return x";
if (true) return _x;
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Private Sub CreateClearButton";
 //BA.debugLineNum = 111;BA.debugLine="If mProps.GetDefault(\"ShowClear\", True) = False T";
if ((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.GetDefault((Object)("ShowClear"),(Object)(__c.True))).equals((Object)(__c.False))) { 
if (true) return "";};
 //BA.debugLineNum = 112;BA.debugLine="If lblClear.IsInitialized And lblClear.Parent.IsI";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.IsInitialized() && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getParent().IsInitialized()) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.RemoveViewFromParent();};
 //BA.debugLineNum = 113;BA.debugLine="lblClear = CreateButton(Chr(0xE14C))";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(BA.ObjectToString(__c.Chr((int) (0xe14c))));
 //BA.debugLineNum = 114;BA.debugLine="lblClear.Tag = \"clear\"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setTag((Object)("clear"));
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Private Sub CreateRevealButton";
 //BA.debugLineNum = 126;BA.debugLine="lblClear = CreateButton(Chr(0xE8F4))";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(BA.ObjectToString(__c.Chr((int) (0xe8f4))));
 //BA.debugLineNum = 127;BA.debugLine="lblClear.Tag = \"reveal\"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setTag((Object)("reveal"));
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(boolean _password) throws Exception{
anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _tf = null;
anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper _ta = null;
 //BA.debugLineNum = 301;BA.debugLine="Private Sub CreateTextField (Password As Boolean)";
 //BA.debugLineNum = 304;BA.debugLine="If Multiline = False Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4==__c.False) { 
 //BA.debugLineNum = 305;BA.debugLine="Dim tf As TextField";
_tf = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 306;BA.debugLine="If Password Then tf.InitializePassword(\"tf\") Els";
if (_password) { 
_tf.InitializePassword(ba,"tf");}
else {
_tf.Initialize(ba,"tf");};
 //BA.debugLineNum = 307;BA.debugLine="Return tf";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tf.getObject()));
 }else {
 //BA.debugLineNum = 309;BA.debugLine="Dim ta As TextArea";
_ta = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper();
 //BA.debugLineNum = 310;BA.debugLine="ta.Initialize(\"tf\")";
_ta.Initialize(ba,"tf");
 //BA.debugLineNum = 311;BA.debugLine="ta.WrapText = True";
_ta.setWrapText(__c.True);
 //BA.debugLineNum = 312;BA.debugLine="Return ta";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_ta.getObject()));
 };
 //BA.debugLineNum = 353;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(boolean _passwordmode,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1,int _textcolor) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Private Sub CreateTextFieldAll (PasswordMode As Bo";
 //BA.debugLineNum = 103;BA.debugLine="mTextField = CreateTextField (PasswordMode)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(_passwordmode);
 //BA.debugLineNum = 104;BA.debugLine="mTextField.Font = Font1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setFont(_font1);
 //BA.debugLineNum = 105;BA.debugLine="mTextField.TextColor = TextColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setTextColor(_textcolor);
 //BA.debugLineNum = 106;BA.debugLine="setNextField(mNextTextField)";
_setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5);
 //BA.debugLineNum = 107;BA.debugLine="mBase.AddView(mTextField, 0, 0, 0, 0)";
_vvvvvvvvvvvv5.AddView((javafx.scene.Node)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getObject()),0,0,0,0);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _passedlabel = null;
anywheresoftware.b4j.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
boolean _passwordmode = false;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
 //BA.debugLineNum = 61;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
 //BA.debugLineNum = 62;BA.debugLine="mBase = Base";
_vvvvvvvvvvvv5.setObject((java.lang.Object)(_base));
 //BA.debugLineNum = 63;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvvvvvvvvvvvvvvvvv2 = _vvvvvvvvvvvv5.getTag();
 //BA.debugLineNum = 63;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvvvvvvv5.setTag(this);
 //BA.debugLineNum = 64;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
_vvvvvvvvvvvv5.SetColorAndBorder(_vvvvvvvvvvvv6.Color_Transparent,0,(int) (0),0);
 //BA.debugLineNum = 65;BA.debugLine="mProps = Props";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = _props;
 //BA.debugLineNum = 66;BA.debugLine="Dim PassedLabel As B4XView = lbl";
_passedlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_passedlabel.setObject((java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 67;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 68;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
 //BA.debugLineNum = 69;BA.debugLine="HintImageView = iv";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setObject((java.lang.Object)(_iv.getObject()));
 //BA.debugLineNum = 70;BA.debugLine="KeyboardType = Props.GetDefault(\"KeyboardType\", \"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = BA.ObjectToString(_props.GetDefault((Object)("KeyboardType"),(Object)("Text")));
 //BA.debugLineNum = 72;BA.debugLine="Dim jo As JavaObject = HintImageView";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getObject()));
 //BA.debugLineNum = 73;BA.debugLine="jo.RunMethod(\"setMouseTransparent\", Array(True))";
_jo.RunMethod("setMouseTransparent",new Object[]{(Object)(__c.True)});
 //BA.debugLineNum = 75;BA.debugLine="HintColor = xui.PaintOrColorToColor(Props.Get(\"Hi";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _vvvvvvvvvvvv6.PaintOrColorToColor(_props.Get((Object)("HintColor")));
 //BA.debugLineNum = 76;BA.debugLine="NonFocusedHintColor = xui.PaintOrColorToColor(Pro";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvv6.PaintOrColorToColor(_props.Get((Object)("NonFocusedHintColor")));
 //BA.debugLineNum = 78;BA.debugLine="HintText = Props.Get(\"Hint\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = BA.ObjectToString(_props.Get((Object)("Hint")));
 //BA.debugLineNum = 79;BA.debugLine="HintFont = PassedLabel.Font";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = _passedlabel.getFont();
 //BA.debugLineNum = 80;BA.debugLine="Dim PasswordMode As Boolean = Props.GetDefault(\"P";
_passwordmode = BA.ObjectToBoolean(_props.GetDefault((Object)("PasswordField"),(Object)(__c.False)));
 //BA.debugLineNum = 81;BA.debugLine="Multiline = Props.GetDefault(\"Multiline\", False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = BA.ObjectToBoolean(_props.GetDefault((Object)("Multiline"),(Object)(__c.False)));
 //BA.debugLineNum = 82;BA.debugLine="If PasswordMode And Multiline Then";
if (_passwordmode && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) { 
 //BA.debugLineNum = 83;BA.debugLine="Multiline = False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = __c.False;
 //BA.debugLineNum = 84;BA.debugLine="Log(\"Multiline not supported with password mode.";
__c.Log("Multiline not supported with password mode.");
 };
 //BA.debugLineNum = 86;BA.debugLine="CreateTextFieldAll(PasswordMode, PassedLabel.Font";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(_passwordmode,_passedlabel.getFont(),_vvvvvvvvvvvv6.PaintOrColorToColor((Object)(_lbl.getTextColor())));
 //BA.debugLineNum = 88;BA.debugLine="mBase.AddView(HintImageView, 0, 0, 0, 0)";
_vvvvvvvvvvvv5.AddView((javafx.scene.Node)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getObject()),0,0,0,0);
 //BA.debugLineNum = 89;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _vvvvvvvvvvvv6.CreatePanel(ba,"");
 //BA.debugLineNum = 90;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 2dip, 2dip)";
_p.SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 91;BA.debugLine="MeasuringCanvas.Initialize(p)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize(ba,_p);
 //BA.debugLineNum = 92;BA.debugLine="Update";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
 //BA.debugLineNum = 93;BA.debugLine="If PasswordMode And Props.GetDefault(\"ShowRevealB";
if (_passwordmode && BA.ObjectToBoolean(_props.GetDefault((Object)("ShowRevealButton"),(Object)(__c.False)))) { 
 //BA.debugLineNum = 94;BA.debugLine="CreateRevealButton";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1();
 }else {
 //BA.debugLineNum = 96;BA.debugLine="CreateClearButton";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0();
 };
 //BA.debugLineNum = 98;BA.debugLine="CreateAcceptButton";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 99;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
_base_resize(_vvvvvvvvvvvv5.getWidth(),_vvvvvvvvvvvv5.getHeight());
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xfloattextfield  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Public Sub getNextField As B4XFloatTextField";
 //BA.debugLineNum = 269;BA.debugLine="Return mNextTextField";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public String  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 355;BA.debugLine="Public Sub getText As String";
 //BA.debugLineNum = 356;BA.debugLine="Return mTextField.Text";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getText();
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6() throws Exception{
 //BA.debugLineNum = 406;BA.debugLine="Public Sub getTextField As B4XView";
 //BA.debugLineNum = 407;BA.debugLine="Return mTextField";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
 //BA.debugLineNum = 408;BA.debugLine="End Sub";
return null;
}
public boolean  _ime_handleaction() throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Private Sub ime_HandleAction As Boolean";
 //BA.debugLineNum = 288;BA.debugLine="tf_EnterPressed";
_tf_enterpressed();
 //BA.debugLineNum = 289;BA.debugLine="If mNextTextField.IsInitialized Then Return True";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.IsInitialized /*boolean*/ ()) { 
if (true) return __c.True;};
 //BA.debugLineNum = 290;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 44;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 45;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvv3 = _eventname;
 //BA.debugLineNum = 46;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvv4 = _callback;
 //BA.debugLineNum = 47;BA.debugLine="If xui.IsB4A Then";
if (_vvvvvvvvvvvv6.getIsB4A()) { 
 //BA.debugLineNum = 48;BA.debugLine="HorizontalPadding = 6dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = __c.DipToCurrent((int) (6));
 }else {
 //BA.debugLineNum = 50;BA.debugLine="HorizontalPadding = 12dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = __c.DipToCurrent((int) (12));
 };
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public String  _lc_click() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
 //BA.debugLineNum = 370;BA.debugLine="Private Sub lc_Click";
 //BA.debugLineNum = 371;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn.setObject((java.lang.Object)(__c.Sender(ba)));
 //BA.debugLineNum = 372;BA.debugLine="Select btn.Tag";
switch (BA.switchObjectToInt(_btn.getTag(),(Object)("clear"),(Object)("reveal"),(Object)("hide"),(Object)("v"))) {
case 0: {
 //BA.debugLineNum = 374;BA.debugLine="setText(\"\")";
_setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5("");
 break; }
case 1: {
 //BA.debugLineNum = 376;BA.debugLine="SwitchFromPasswordToRegular (True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(__c.True);
 break; }
case 2: {
 //BA.debugLineNum = 378;BA.debugLine="SwitchFromPasswordToRegular(False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(__c.False);
 break; }
case 3: {
 //BA.debugLineNum = 380;BA.debugLine="tf_EnterPressed";
_tf_enterpressed();
 //BA.debugLineNum = 381;BA.debugLine="If mNextTextField.IsInitialized = False Or mNex";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.IsInitialized /*boolean*/ ()==__c.False || (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5).equals((b4j.example.b4xfloattextfield)(this))) { 
 //BA.debugLineNum = 385;BA.debugLine="mTextField.Parent.RequestFocus";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getParent().RequestFocus();
 };
 break; }
}
;
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return "";
}
public String  _lc_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 396;BA.debugLine="Private Sub lc_MouseClicked(EventData As MouseEven";
 //BA.debugLineNum = 397;BA.debugLine="EventData.Consume";
_eventdata.Consume();
 //BA.debugLineNum = 398;BA.debugLine="lc_Click";
_lc_click();
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return "";
}
public String  _lc_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 392;BA.debugLine="Private Sub lc_MousePressed (EventData As MouseEve";
 //BA.debugLineNum = 393;BA.debugLine="EventData.Consume";
_eventdata.Consume();
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return "";
}
public String  _lc_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 401;BA.debugLine="Private Sub lc_MouseReleased(EventData As MouseEve";
 //BA.debugLineNum = 402;BA.debugLine="EventData.Consume";
_eventdata.Consume();
 //BA.debugLineNum = 403;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 411;BA.debugLine="Public Sub RequestFocusAndShowKeyboard";
 //BA.debugLineNum = 412;BA.debugLine="mTextField.RequestFocus";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.RequestFocus();
 //BA.debugLineNum = 416;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(b4j.example.b4xfloattextfield _field) throws Exception{
Object _o = null;
 //BA.debugLineNum = 272;BA.debugLine="Public Sub setNextField (Field As B4XFloatTextFiel";
 //BA.debugLineNum = 273;BA.debugLine="If Field.IsInitialized = False Then Return";
if (_field.IsInitialized /*boolean*/ ()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 283;BA.debugLine="Dim o As Object = Field";
_o = (Object)(_field);
 //BA.debugLineNum = 284;BA.debugLine="mNextTextField = o";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (b4j.example.b4xfloattextfield)(_o);
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(String _s) throws Exception{
String _old = "";
 //BA.debugLineNum = 359;BA.debugLine="Public Sub setText(s As String)";
 //BA.debugLineNum = 360;BA.debugLine="Dim old As String = mTextField.Text 'ignore";
_old = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getText();
 //BA.debugLineNum = 361;BA.debugLine="mTextField.Text = s";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setText(_s);
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(boolean _toregular) throws Exception{
String _text = "";
int _textcolor = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1 = null;
anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _tf = null;
 //BA.debugLineNum = 130;BA.debugLine="Private Sub SwitchFromPasswordToRegular (ToRegular";
 //BA.debugLineNum = 131;BA.debugLine="Dim text As String = mTextField.Text";
_text = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getText();
 //BA.debugLineNum = 132;BA.debugLine="Dim textcolor As Int = mTextField.TextColor";
_textcolor = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getTextColor();
 //BA.debugLineNum = 133;BA.debugLine="Dim Font1 As B4XFont = mTextField.Font";
_font1 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_font1 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getFont();
 //BA.debugLineNum = 134;BA.debugLine="mTextField.RemoveViewFromParent";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.RemoveViewFromParent();
 //BA.debugLineNum = 135;BA.debugLine="CreateTextFieldAll(Not(ToRegular), Font1, textcol";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(__c.Not(_toregular),_font1,_textcolor);
 //BA.debugLineNum = 136;BA.debugLine="mTextField.Text = text";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setText(_text);
 //BA.debugLineNum = 137;BA.debugLine="If lblClear.IsInitialized Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.IsInitialized()) { 
 //BA.debugLineNum = 138;BA.debugLine="If ToRegular = False Then";
if (_toregular==__c.False) { 
 //BA.debugLineNum = 139;BA.debugLine="lblClear.Text = Chr(0xE8F4)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setText(BA.ObjectToString(__c.Chr((int) (0xe8f4))));
 //BA.debugLineNum = 140;BA.debugLine="lblClear.Tag = \"reveal\"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setTag((Object)("reveal"));
 }else {
 //BA.debugLineNum = 142;BA.debugLine="lblClear.Tag = \"hide\"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setTag((Object)("hide"));
 //BA.debugLineNum = 143;BA.debugLine="lblClear.Text = Chr(0xE8F5)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setText(BA.ObjectToString(__c.Chr((int) (0xe8f5))));
 };
 //BA.debugLineNum = 145;BA.debugLine="lblClear.BringToFront";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.BringToFront();
 };
 //BA.debugLineNum = 147;BA.debugLine="If lblV.IsInitialized Then lblV.BringToFront";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.IsInitialized()) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.BringToFront();};
 //BA.debugLineNum = 148;BA.debugLine="HintImageView.BringToFront";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.BringToFront();
 //BA.debugLineNum = 149;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
_base_resize(_vvvvvvvvvvvv5.getWidth(),_vvvvvvvvvvvv5.getHeight());
 //BA.debugLineNum = 151;BA.debugLine="Dim tf As TextField = mTextField";
_tf = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
_tf.setObject((javafx.scene.control.TextField)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getObject()));
 //BA.debugLineNum = 152;BA.debugLine="tf.SetSelection(mTextField.Text.Length, mTextFiel";
_tf.SetSelection(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getText().length(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getText().length());
 //BA.debugLineNum = 157;BA.debugLine="mTextField.RequestFocus";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.RequestFocus();
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public String  _tf_action() throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Private Sub tf_Action";
 //BA.debugLineNum = 251;BA.debugLine="If mNextTextField.IsInitialized And mNextTextFiel";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.IsInitialized /*boolean*/ () && (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5).equals((b4j.example.b4xfloattextfield)(this)) == false) { 
 //BA.debugLineNum = 252;BA.debugLine="mNextTextField.TextField.RequestFocus";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().RequestFocus();
 };
 //BA.debugLineNum = 254;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_EnterP";
if (_vvvvvvvvvvvv6.SubExists(ba,_vvvvvvvvvvvv4,_vvvvvvvvvvvv3+"_EnterPressed",(int) (0))) { 
 //BA.debugLineNum = 255;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_EnterPr";
__c.CallSubDelayed(ba,_vvvvvvvvvvvv4,_vvvvvvvvvvvv3+"_EnterPressed");
 };
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return "";
}
public String  _tf_beginedit() throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Private Sub tf_BeginEdit";
 //BA.debugLineNum = 243;BA.debugLine="tf_FocusChanged(True)";
_tf_focuschanged(__c.True);
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return "";
}
public String  _tf_endedit() throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Private Sub tf_EndEdit";
 //BA.debugLineNum = 247;BA.debugLine="tf_FocusChanged(False)";
_tf_focuschanged(__c.False);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return "";
}
public String  _tf_enterpressed() throws Exception{
 //BA.debugLineNum = 293;BA.debugLine="Private Sub tf_EnterPressed";
 //BA.debugLineNum = 294;BA.debugLine="tf_Action";
_tf_action();
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return "";
}
public String  _tf_focuschanged(boolean _hasfocus) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Private Sub tf_FocusChanged (HasFocus As Boolean)";
 //BA.debugLineNum = 213;BA.debugLine="Focused = HasFocus";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _hasfocus;
 //BA.debugLineNum = 214;BA.debugLine="UpdateLabel(mTextField.Text, True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getText(),__c.True);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return "";
}
public String  _tf_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Private Sub tf_TextChanged (Old As String, New As";
 //BA.debugLineNum = 261;BA.debugLine="UpdateLabel(New, False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(_new,__c.False);
 //BA.debugLineNum = 262;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TextCh";
if (_vvvvvvvvvvvv6.SubExists(ba,_vvvvvvvvvvvv4,_vvvvvvvvvvvv3+"_TextChanged",(int) (2))) { 
 //BA.debugLineNum = 263;BA.debugLine="CallSub3(mCallBack, mEventName & \"_TextChanged\",";
__c.CallSubNew3(ba,_vvvvvvvvvvvv4,_vvvvvvvvvvvv3+"_TextChanged",(Object)(_old),(Object)(_new));
 };
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv6() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _f = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
 //BA.debugLineNum = 218;BA.debugLine="Public Sub Update";
 //BA.debugLineNum = 219;BA.debugLine="Dim f As B4XFont =  xui.CreateFont2(HintFont, Lar";
_f = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_f = _vvvvvvvvvvvv6.CreateFont2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1);
 //BA.debugLineNum = 220;BA.debugLine="Dim r As B4XRect = MeasuringCanvas.MeasureText(Hi";
_r = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.MeasureText(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1,_f);
 //BA.debugLineNum = 221;BA.debugLine="LargeFocused = CreateBitmap(r, HintColor, f)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvvvvvvvvv3(_r,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5,_f);
 //BA.debugLineNum = 222;BA.debugLine="LargeNotFocused = CreateBitmap(r, NonFocusedHintC";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _vvvvvvvvvvvvvvvvvvvvvv3(_r,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,_f);
 //BA.debugLineNum = 223;BA.debugLine="f = xui.CreateFont2(HintFont, SmallLabelTextSize)";
_f = _vvvvvvvvvvvv6.CreateFont2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2);
 //BA.debugLineNum = 224;BA.debugLine="Dim r As B4XRect = MeasuringCanvas.MeasureText(Hi";
_r = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.MeasureText(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1,_f);
 //BA.debugLineNum = 225;BA.debugLine="SmallFocused = CreateBitmap(r, HintColor, f)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _vvvvvvvvvvvvvvvvvvvvvv3(_r,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5,_f);
 //BA.debugLineNum = 226;BA.debugLine="SmallNotFocused = CreateBitmap(r, NonFocusedHintC";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvvvvvvvvvvv3(_r,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,_f);
 //BA.debugLineNum = 227;BA.debugLine="UpdateLabel(mTextField.Text, True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getText(),__c.True);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(String _txt,boolean _force) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
boolean _goingtolarge = false;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _b = null;
 //BA.debugLineNum = 188;BA.debugLine="Private Sub UpdateLabel (txt As String, force As B";
 //BA.debugLineNum = 189;BA.debugLine="For Each lbl As B4XView In Array As B4XView(lblCl";
{
final anywheresoftware.b4a.objects.B4XViewWrapper[] group1 = new anywheresoftware.b4a.objects.B4XViewWrapper[]{_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1};
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_lbl = group1[index1];
 //BA.debugLineNum = 190;BA.debugLine="If lbl.IsInitialized Then lbl.Visible = Focused";
if (_lbl.IsInitialized()) { 
_lbl.setVisible(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 && _txt.length()>0);};
 }
};
 //BA.debugLineNum = 193;BA.debugLine="Dim GoingToLarge As Boolean = txt.Length = 0";
_goingtolarge = _txt.length()==0;
 //BA.debugLineNum = 194;BA.debugLine="If GoingToLarge = LargeLabel And force = False Th";
if (_goingtolarge==_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 && _force==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 195;BA.debugLine="Dim b As B4XBitmap";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 196;BA.debugLine="If Focused Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7) { 
 //BA.debugLineNum = 197;BA.debugLine="If GoingToLarge Then b = LargeFocused Else b = S";
if (_goingtolarge) { 
_b = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;}
else {
_b = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;};
 }else {
 //BA.debugLineNum = 199;BA.debugLine="If GoingToLarge Then b = LargeNotFocused Else b";
if (_goingtolarge) { 
_b = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;}
else {
_b = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6;};
 };
 //BA.debugLineNum = 201;BA.debugLine="If b.IsInitialized = False Then Return";
if (_b.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 202;BA.debugLine="HintImageView.SetBitmap(b)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.SetBitmap((javafx.scene.image.Image)(_b.getObject()));
 //BA.debugLineNum = 203;BA.debugLine="If GoingToLarge Then";
if (_goingtolarge) { 
 //BA.debugLineNum = 204;BA.debugLine="HintImageView.SetLayoutAnimated (Duration, Horiz";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.SetLayoutAnimated(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,_vvvvvvvvvvvv5.getHeight()/(double)2-_b.getHeight()/(double)2,_b.getWidth(),_b.getHeight());
 //BA.debugLineNum = 205;BA.debugLine="LargeLabel = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = __c.True;
 }else {
 //BA.debugLineNum = 207;BA.debugLine="HintImageView.SetLayoutAnimated(Duration, 2dip,";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.SetLayoutAnimated(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)),_b.getWidth(),_b.getHeight());
 //BA.debugLineNum = 208;BA.debugLine="LargeLabel = False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = __c.False;
 };
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
