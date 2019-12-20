package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class animatedcounter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.animatedcounter", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.animatedcounter.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List _imageviews = null;
public int _mdigits = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltemplate = null;
public anywheresoftware.b4a.objects.collections.List _mvalue = null;
public int _digitheight = 0;
public int _digitwidth = 0;
public int _mduration = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _fade = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xfadeiv = null;
public Object _tag = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.scorebord _scorebord = null;
public b4j.example.nieuwe_partij _nieuwe_partij = null;
public b4j.example.func _func = null;
public b4j.example.parseconfig _parseconfig = null;
public b4j.example.getnode _getnode = null;
public b4j.example.funcinet _funcinet = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _base_resize(b4j.example.animatedcounter __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
int _columns = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
int _left = 0;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=12058625;
 //BA.debugLineNum = 12058625;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Width";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="xfadeIv.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._xfadeiv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=12058627;
 //BA.debugLineNum = 12058627;BA.debugLine="xfadeIv.SetBitmap(fade.Resize(Width, Height, Fals";
__ref._xfadeiv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((javafx.scene.image.Image)(__ref._fade /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .Resize((int) (_width),(int) (_height),__c.False).getObject()));
RDebugUtils.currentLine=12058628;
 //BA.debugLineNum = 12058628;BA.debugLine="DigitHeight = Height";
__ref._digitheight /*int*/  = (int) (_height);
RDebugUtils.currentLine=12058629;
 //BA.debugLineNum = 12058629;BA.debugLine="Dim Columns As Int = mdigits";
_columns = __ref._mdigits /*int*/ ;
RDebugUtils.currentLine=12058630;
 //BA.debugLineNum = 12058630;BA.debugLine="DigitWidth = Width / Columns";
__ref._digitwidth /*int*/  = (int) (_width/(double)_columns);
RDebugUtils.currentLine=12058631;
 //BA.debugLineNum = 12058631;BA.debugLine="Dim bmp As B4XBitmap = CreateBitmap(lblTemplate)";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = __ref._createbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,__ref._lbltemplate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=12058632;
 //BA.debugLineNum = 12058632;BA.debugLine="Dim left As Int = Width";
_left = (int) (_width);
RDebugUtils.currentLine=12058633;
 //BA.debugLineNum = 12058633;BA.debugLine="For i = 0 To ImageViews.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (__ref._imageviews /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=12058634;
 //BA.debugLineNum = 12058634;BA.debugLine="Dim iv As B4XView = ImageViews.Get(i)";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_iv.setObject((java.lang.Object)(__ref._imageviews /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=12058636;
 //BA.debugLineNum = 12058636;BA.debugLine="left = left - DigitWidth";
_left = (int) (_left-__ref._digitwidth /*int*/ );
RDebugUtils.currentLine=12058637;
 //BA.debugLineNum = 12058637;BA.debugLine="iv.SetLayoutAnimated(0, left, TopFromValue(i), D";
_iv.SetLayoutAnimated((int) (0),_left,__ref._topfromvalue /*int*/ (null,_i),__ref._digitwidth /*int*/ ,__ref._digitheight /*int*/ *10);
RDebugUtils.currentLine=12058638;
 //BA.debugLineNum = 12058638;BA.debugLine="iv.SetBitmap(bmp)";
_iv.SetBitmap((javafx.scene.image.Image)(_bmp.getObject()));
 }
};
RDebugUtils.currentLine=12058640;
 //BA.debugLineNum = 12058640;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _createbitmap(b4j.example.animatedcounter __ref,anywheresoftware.b4a.objects.B4XViewWrapper _lbl) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "createbitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "createbitmap", new Object[] {_lbl}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _res = null;
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Private Sub CreateBitmap (lbl As B4XView) As B4XBi";
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, DigitWidth, DigitHei";
_p.SetLayoutAnimated((int) (0),0,0,__ref._digitwidth /*int*/ ,__ref._digitheight /*int*/ *10);
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="Dim cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=12189700;
 //BA.debugLineNum = 12189700;BA.debugLine="cvs.Initialize(p)";
_cvs.Initialize(ba,_p);
RDebugUtils.currentLine=12189701;
 //BA.debugLineNum = 12189701;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(\"5\", lbl.Font)";
_r = _cvs.MeasureText("5",_lbl.getFont());
RDebugUtils.currentLine=12189702;
 //BA.debugLineNum = 12189702;BA.debugLine="Dim BaseLine As Int = DigitHeight / 2 - r.Height";
_baseline = (int) (__ref._digitheight /*int*/ /(double)2-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=12189703;
 //BA.debugLineNum = 12189703;BA.debugLine="For i = 0 To 9";
{
final int step7 = 1;
final int limit7 = (int) (9);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=12189704;
 //BA.debugLineNum = 12189704;BA.debugLine="cvs.DrawText(i, DigitWidth / 2, i * DigitHeight";
_cvs.DrawText(BA.NumberToString(_i),__ref._digitwidth /*int*/ /(double)2,_i*__ref._digitheight /*int*/ +_baseline,_lbl.getFont(),_lbl.getTextColor(),BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 }
};
RDebugUtils.currentLine=12189706;
 //BA.debugLineNum = 12189706;BA.debugLine="cvs.Invalidate";
_cvs.Invalidate();
RDebugUtils.currentLine=12189707;
 //BA.debugLineNum = 12189707;BA.debugLine="Dim res As B4XBitmap = cvs.CreateBitmap";
_res = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_res = _cvs.CreateBitmap();
RDebugUtils.currentLine=12189708;
 //BA.debugLineNum = 12189708;BA.debugLine="cvs.Release";
_cvs.Release();
RDebugUtils.currentLine=12189709;
 //BA.debugLineNum = 12189709;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=12189710;
 //BA.debugLineNum = 12189710;BA.debugLine="End Sub";
return null;
}
public int  _topfromvalue(b4j.example.animatedcounter __ref,int _digit) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "topfromvalue", true))
	 {return ((Integer) Debug.delegate(ba, "topfromvalue", new Object[] {_digit}));}
int _d = 0;
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Private Sub TopFromValue (Digit As Int) As Int";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="Dim d As Int = mValue.Get(Digit)";
_d = (int)(BA.ObjectToNumber(__ref._mvalue /*anywheresoftware.b4a.objects.collections.List*/ .Get(_digit)));
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="Return -d * DigitHeight";
if (true) return (int) (-_d*__ref._digitheight /*int*/ );
RDebugUtils.currentLine=12124163;
 //BA.debugLineNum = 12124163;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4j.example.animatedcounter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=11796484;
 //BA.debugLineNum = 11796484;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=11796485;
 //BA.debugLineNum = 11796485;BA.debugLine="Private ImageViews As List";
_imageviews = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11796486;
 //BA.debugLineNum = 11796486;BA.debugLine="Private mdigits As Int";
_mdigits = 0;
RDebugUtils.currentLine=11796487;
 //BA.debugLineNum = 11796487;BA.debugLine="Private lblTemplate As B4XView";
_lbltemplate = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=11796488;
 //BA.debugLineNum = 11796488;BA.debugLine="Private mValue As List";
_mvalue = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11796489;
 //BA.debugLineNum = 11796489;BA.debugLine="Private DigitHeight, DigitWidth As Int";
_digitheight = 0;
_digitwidth = 0;
RDebugUtils.currentLine=11796490;
 //BA.debugLineNum = 11796490;BA.debugLine="Private mDuration As Int";
_mduration = 0;
RDebugUtils.currentLine=11796491;
 //BA.debugLineNum = 11796491;BA.debugLine="Private fade As B4XBitmap";
_fade = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=11796492;
 //BA.debugLineNum = 11796492;BA.debugLine="Private xfadeIv As B4XView";
_xfadeiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=11796493;
 //BA.debugLineNum = 11796493;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=11796495;
 //BA.debugLineNum = 11796495;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _createfadebitmap(b4j.example.animatedcounter __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "createfadebitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "createfadebitmap", new Object[] {_clr}));}
b4j.example.bitmapcreator _bc = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _tclr = 0;
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Private Sub CreateFadeBitmap (clr As Int) As B4XBi";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="bc.Initialize(200, 50)";
_bc._initialize(ba,(int) (200),(int) (50));
RDebugUtils.currentLine=11993091;
 //BA.debugLineNum = 11993091;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=11993092;
 //BA.debugLineNum = 11993092;BA.debugLine="r.Initialize(0, 0, bc.mWidth, bc.mHeight / 3)";
_r.Initialize((float) (0),(float) (0),(float) (_bc._mwidth),(float) (_bc._mheight/(double)3));
RDebugUtils.currentLine=11993093;
 //BA.debugLineNum = 11993093;BA.debugLine="Dim tclr As Int = Bit.And(0x00ffffff, clr)";
_tclr = __c.Bit.And((int) (0x00ffffff),_clr);
RDebugUtils.currentLine=11993094;
 //BA.debugLineNum = 11993094;BA.debugLine="bc.FillGradient(Array As Int(clr, tclr), r, \"TOP_";
_bc._fillgradient(new int[]{_clr,_tclr},_r,"TOP_BOTTOM");
RDebugUtils.currentLine=11993095;
 //BA.debugLineNum = 11993095;BA.debugLine="r.Top = bc.mHeight * 2 / 3";
_r.setTop((float) (_bc._mheight*2/(double)3));
RDebugUtils.currentLine=11993096;
 //BA.debugLineNum = 11993096;BA.debugLine="r.Bottom = bc.mHeight";
_r.setBottom((float) (_bc._mheight));
RDebugUtils.currentLine=11993097;
 //BA.debugLineNum = 11993097;BA.debugLine="bc.FillGradient(Array As Int(clr, tclr), r, \"BOTT";
_bc._fillgradient(new int[]{_clr,_tclr},_r,"BOTTOM_TOP");
RDebugUtils.currentLine=11993098;
 //BA.debugLineNum = 11993098;BA.debugLine="Return bc.Bitmap";
if (true) return _bc._getbitmap();
RDebugUtils.currentLine=11993099;
 //BA.debugLineNum = 11993099;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(b4j.example.animatedcounter __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
int _i = 0;
anywheresoftware.b4j.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4j.objects.ImageViewWrapper _fadeiv = null;
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setObject((java.lang.Object)(_base));
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=11927555;
 //BA.debugLineNum = 11927555;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"\") 'needed";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=11927556;
 //BA.debugLineNum = 11927556;BA.debugLine="mBase.AddView(pnl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_pnl.getObject()),0,0,0,0);
RDebugUtils.currentLine=11927557;
 //BA.debugLineNum = 11927557;BA.debugLine="mdigits = Props.Get(\"Digits\")";
__ref._mdigits /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Digits"))));
RDebugUtils.currentLine=11927558;
 //BA.debugLineNum = 11927558;BA.debugLine="mDuration = Props.Get(\"Duration\")";
__ref._mduration /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Duration"))));
RDebugUtils.currentLine=11927559;
 //BA.debugLineNum = 11927559;BA.debugLine="lblTemplate = lbl";
__ref._lbltemplate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setObject((java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=11927560;
 //BA.debugLineNum = 11927560;BA.debugLine="fade = CreateFadeBitmap(xui.PaintOrColorToColor(P";
__ref._fade /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._createfadebitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.GetDefault((Object)("FadeColor"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White))));
RDebugUtils.currentLine=11927561;
 //BA.debugLineNum = 11927561;BA.debugLine="For i = 0 To mdigits - 1";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mdigits /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=11927562;
 //BA.debugLineNum = 11927562;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=11927563;
 //BA.debugLineNum = 11927563;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=11927564;
 //BA.debugLineNum = 11927564;BA.debugLine="ImageViews.Add(iv)";
__ref._imageviews /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_iv.getObject()));
RDebugUtils.currentLine=11927565;
 //BA.debugLineNum = 11927565;BA.debugLine="mBase.GetView(0).AddView(iv, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).AddView((javafx.scene.Node)(_iv.getObject()),0,0,0,0);
 }
};
RDebugUtils.currentLine=11927567;
 //BA.debugLineNum = 11927567;BA.debugLine="Dim fadeIv As ImageView";
_fadeiv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=11927568;
 //BA.debugLineNum = 11927568;BA.debugLine="fadeIv.Initialize(\"\")";
_fadeiv.Initialize(ba,"");
RDebugUtils.currentLine=11927569;
 //BA.debugLineNum = 11927569;BA.debugLine="xfadeIv = fadeIv";
__ref._xfadeiv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setObject((java.lang.Object)(_fadeiv.getObject()));
RDebugUtils.currentLine=11927570;
 //BA.debugLineNum = 11927570;BA.debugLine="mBase.GetView(0).AddView(fadeIv, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).AddView((javafx.scene.Node)(_fadeiv.getObject()),0,0,0,0);
RDebugUtils.currentLine=11927571;
 //BA.debugLineNum = 11927571;BA.debugLine="setValue(0)";
__ref._setvalue /*String*/ (null,(int) (0));
RDebugUtils.currentLine=11927572;
 //BA.debugLineNum = 11927572;BA.debugLine="If xui.IsB4A Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
RDebugUtils.currentLine=11927573;
 //BA.debugLineNum = 11927573;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=11927574;
 //BA.debugLineNum = 11927574;BA.debugLine="setValue(getValue)";
__ref._setvalue /*String*/ (null,__ref._getvalue /*int*/ (null));
 };
RDebugUtils.currentLine=11927576;
 //BA.debugLineNum = 11927576;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(b4j.example.animatedcounter __ref,int _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_v}));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Public Sub setValue(v As Int)";
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="mValue.Clear";
__ref._mvalue /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="For i = 0 To mdigits - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._mdigits /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=12255235;
 //BA.debugLineNum = 12255235;BA.debugLine="mValue.Add(v Mod 10)";
__ref._mvalue /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_v%10));
RDebugUtils.currentLine=12255236;
 //BA.debugLineNum = 12255236;BA.debugLine="v = v / 10";
_v = (int) (_v/(double)10);
RDebugUtils.currentLine=12255237;
 //BA.debugLineNum = 12255237;BA.debugLine="Dim iv As B4XView = ImageViews.Get(i)";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_iv.setObject((java.lang.Object)(__ref._imageviews /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=12255238;
 //BA.debugLineNum = 12255238;BA.debugLine="iv.SetLayoutAnimated(mDuration, iv.Left, TopFrom";
_iv.SetLayoutAnimated(__ref._mduration /*int*/ ,_iv.getLeft(),__ref._topfromvalue /*int*/ (null,_i),__c.Max(1,_iv.getWidth()),__c.Max(1,_iv.getHeight()));
 }
};
RDebugUtils.currentLine=12255241;
 //BA.debugLineNum = 12255241;BA.debugLine="End Sub";
return "";
}
public int  _getvalue(b4j.example.animatedcounter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Integer) Debug.delegate(ba, "getvalue", null));}
int _res = 0;
int _i = 0;
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Public Sub getValue As Int";
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="Dim res As Int";
_res = 0;
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="For i = 0 To mValue.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._mvalue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=12320771;
 //BA.debugLineNum = 12320771;BA.debugLine="res = res + mValue.Get(i) * Power(10, i)";
_res = (int) (_res+(double)(BA.ObjectToNumber(__ref._mvalue /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))*__c.Power(10,_i));
 }
};
RDebugUtils.currentLine=12320773;
 //BA.debugLineNum = 12320773;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=12320774;
 //BA.debugLineNum = 12320774;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4j.example.animatedcounter __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="animatedcounter";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=11862019;
 //BA.debugLineNum = 11862019;BA.debugLine="ImageViews.Initialize";
__ref._imageviews /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=11862020;
 //BA.debugLineNum = 11862020;BA.debugLine="mValue.Initialize";
__ref._mvalue /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=11862021;
 //BA.debugLineNum = 11862021;BA.debugLine="End Sub";
return "";
}
}