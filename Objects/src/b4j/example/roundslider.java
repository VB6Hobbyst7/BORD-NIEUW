package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class roundslider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.roundslider", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.roundslider.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public int _mvalue = 0;
public int _mmin = 0;
public int _mmax = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _thumb = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _circlerect = null;
public int _valuecolor = 0;
public int _stroke = 0;
public int _thumbsize = 0;
public Object _tag = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.scorebord _scorebord = null;
public b4j.example.nieuwe_partij _nieuwe_partij = null;
public b4j.example.func _func = null;
public b4j.example.parseconfig _parseconfig = null;
public b4j.example.funcinet _funcinet = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _base_resize(b4j.example.roundslider __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=27721728;
 //BA.debugLineNum = 27721728;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=27721729;
 //BA.debugLineNum = 27721729;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize(_width,_height);
RDebugUtils.currentLine=27721730;
 //BA.debugLineNum = 27721730;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=27721731;
 //BA.debugLineNum = 27721731;BA.debugLine="If thumb.IsInitialized = False Then CreateThumb";
if (__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.False) { 
__ref._createthumb /*String*/ (null);};
RDebugUtils.currentLine=27721732;
 //BA.debugLineNum = 27721732;BA.debugLine="CircleRect.Initialize(ThumbSize + stroke, ThumbSi";
__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (__ref._thumbsize /*int*/ +__ref._stroke /*int*/ ),(float) (__ref._thumbsize /*int*/ +__ref._stroke /*int*/ ),(float) (_width-__ref._thumbsize /*int*/ -__ref._stroke /*int*/ ),(float) (_height-__ref._thumbsize /*int*/ -__ref._stroke /*int*/ ));
RDebugUtils.currentLine=27721733;
 //BA.debugLineNum = 27721733;BA.debugLine="xlbl.SetLayoutAnimated(0, CircleRect.Left, Circle";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getHeight());
RDebugUtils.currentLine=27721734;
 //BA.debugLineNum = 27721734;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=27721735;
 //BA.debugLineNum = 27721735;BA.debugLine="End Sub";
return "";
}
public String  _createthumb(b4j.example.roundslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "createthumb", true))
	 {return ((String) Debug.delegate(ba, "createthumb", null));}
b4j.example.bcpath _p = null;
int _r = 0;
int _g = 0;
int _l = 0;
b4j.example.bitmapcreator _bc = null;
RDebugUtils.currentLine=27656192;
 //BA.debugLineNum = 27656192;BA.debugLine="Private Sub CreateThumb";
RDebugUtils.currentLine=27656193;
 //BA.debugLineNum = 27656193;BA.debugLine="Dim p As BCPath";
_p = new b4j.example.bcpath();
RDebugUtils.currentLine=27656194;
 //BA.debugLineNum = 27656194;BA.debugLine="Dim r As Int = 80dip";
_r = __c.DipToCurrent((int) (80));
RDebugUtils.currentLine=27656195;
 //BA.debugLineNum = 27656195;BA.debugLine="Dim g As Int = 8dip";
_g = __c.DipToCurrent((int) (8));
RDebugUtils.currentLine=27656196;
 //BA.debugLineNum = 27656196;BA.debugLine="Dim l As Int = 28dip";
_l = __c.DipToCurrent((int) (28));
RDebugUtils.currentLine=27656197;
 //BA.debugLineNum = 27656197;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=27656198;
 //BA.debugLineNum = 27656198;BA.debugLine="bc.Initialize(2 * r + g + 3dip, 2 * r + l + g)";
_bc._initialize(ba,(int) (2*_r+_g+__c.DipToCurrent((int) (3))),(int) (2*_r+_l+_g));
RDebugUtils.currentLine=27656199;
 //BA.debugLineNum = 27656199;BA.debugLine="p.Initialize(r - l + g, 2 * r - 2dip + g)";
_p._initialize(ba,(float) (_r-_l+_g),(float) (2*_r-__c.DipToCurrent((int) (2))+_g));
RDebugUtils.currentLine=27656200;
 //BA.debugLineNum = 27656200;BA.debugLine="p.LineTo(r + l + g, 2 * r - 2dip + g)";
_p._lineto((float) (_r+_l+_g),(float) (2*_r-__c.DipToCurrent((int) (2))+_g));
RDebugUtils.currentLine=27656201;
 //BA.debugLineNum = 27656201;BA.debugLine="p.LineTo(r + g, 2 * r + l + g)";
_p._lineto((float) (_r+_g),(float) (2*_r+_l+_g));
RDebugUtils.currentLine=27656202;
 //BA.debugLineNum = 27656202;BA.debugLine="p.LineTo(r - l + g, 2 * r - 2dip + g)";
_p._lineto((float) (_r-_l+_g),(float) (2*_r-__c.DipToCurrent((int) (2))+_g));
RDebugUtils.currentLine=27656203;
 //BA.debugLineNum = 27656203;BA.debugLine="bc.DrawPath(p, 0xFF5B5B5B, True, 0)";
_bc._drawpath(_p,(int) (0xff5b5b5b),__c.True,(int) (0));
RDebugUtils.currentLine=27656204;
 //BA.debugLineNum = 27656204;BA.debugLine="bc.DrawCircle(r + g, r + g, r, xui.Color_White, T";
_bc._drawcircle((float) (_r+_g),(float) (_r+_g),(float) (_r),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__c.True,(int) (0));
RDebugUtils.currentLine=27656205;
 //BA.debugLineNum = 27656205;BA.debugLine="bc.DrawCircle(r + g, r + g, r, 0xFF5B5B5B, False,";
_bc._drawcircle((float) (_r+_g),(float) (_r+_g),(float) (_r),(int) (0xff5b5b5b),__c.False,__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=27656206;
 //BA.debugLineNum = 27656206;BA.debugLine="thumb = bc.Bitmap";
__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _bc._getbitmap();
RDebugUtils.currentLine=27656207;
 //BA.debugLineNum = 27656207;BA.debugLine="ThumbSize = thumb.Height / 4";
__ref._thumbsize /*int*/  = (int) (__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()/(double)4);
RDebugUtils.currentLine=27656208;
 //BA.debugLineNum = 27656208;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=27656209;
 //BA.debugLineNum = 27656209;BA.debugLine="End Sub";
return "";
}
public String  _draw(b4j.example.roundslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "draw", true))
	 {return ((String) Debug.delegate(ba, "draw", null));}
int _radius = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
int _angle = 0;
int _b4jstrokeoffset = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _dest = null;
int _r = 0;
int _cx = 0;
int _cy = 0;
RDebugUtils.currentLine=27787264;
 //BA.debugLineNum = 27787264;BA.debugLine="Private Sub Draw";
RDebugUtils.currentLine=27787265;
 //BA.debugLineNum = 27787265;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=27787266;
 //BA.debugLineNum = 27787266;BA.debugLine="Dim radius As Int = CircleRect.Width / 2";
_radius = (int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth()/(double)2);
RDebugUtils.currentLine=27787267;
 //BA.debugLineNum = 27787267;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Cen";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY(),(float) (_radius),(int) (0xffb6b6b6),__c.False,(float) (__ref._stroke /*int*/ ));
RDebugUtils.currentLine=27787268;
 //BA.debugLineNum = 27787268;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=27787269;
 //BA.debugLineNum = 27787269;BA.debugLine="Dim angle As Int = (mValue - mMin) / (mMax - mMin";
_angle = (int) ((__ref._mvalue /*int*/ -__ref._mmin /*int*/ )/(double)(__ref._mmax /*int*/ -__ref._mmin /*int*/ )*360);
RDebugUtils.currentLine=27787270;
 //BA.debugLineNum = 27787270;BA.debugLine="Dim B4JStrokeOffset As Int";
_b4jstrokeoffset = 0;
RDebugUtils.currentLine=27787271;
 //BA.debugLineNum = 27787271;BA.debugLine="If xui.IsB4J Then B4JStrokeOffset = stroke / 2";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
_b4jstrokeoffset = (int) (__ref._stroke /*int*/ /(double)2);};
RDebugUtils.currentLine=27787272;
 //BA.debugLineNum = 27787272;BA.debugLine="p.InitializeArc(CircleRect.CenterX, CircleRect.Ce";
_p.InitializeArc(__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY(),(float) (_radius+_b4jstrokeoffset),(float) (-90),(float) (_angle));
RDebugUtils.currentLine=27787273;
 //BA.debugLineNum = 27787273;BA.debugLine="cvs.DrawPath(p, ValueColor, False, stroke)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,__ref._valuecolor /*int*/ ,__c.False,(float) (__ref._stroke /*int*/ ));
RDebugUtils.currentLine=27787274;
 //BA.debugLineNum = 27787274;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Cen";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY(),(float) (_radius-_b4jstrokeoffset),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__c.True,(float) (0));
RDebugUtils.currentLine=27787275;
 //BA.debugLineNum = 27787275;BA.debugLine="Dim dest As B4XRect";
_dest = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=27787276;
 //BA.debugLineNum = 27787276;BA.debugLine="Dim r As Int = radius + ThumbSize / 2 + stroke /";
_r = (int) (_radius+__ref._thumbsize /*int*/ /(double)2+__ref._stroke /*int*/ /(double)2);
RDebugUtils.currentLine=27787277;
 //BA.debugLineNum = 27787277;BA.debugLine="Dim cx As Int = CircleRect.CenterX + r * CosD(ang";
_cx = (int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX()+_r*__c.CosD(_angle-90));
RDebugUtils.currentLine=27787278;
 //BA.debugLineNum = 27787278;BA.debugLine="Dim cy As Int = CircleRect.CenterY + r * SinD(ang";
_cy = (int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY()+_r*__c.SinD(_angle-90));
RDebugUtils.currentLine=27787279;
 //BA.debugLineNum = 27787279;BA.debugLine="dest.Initialize(cx - thumb.Width / 8, cy - ThumbS";
_dest.Initialize((float) (_cx-__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()/(double)8),(float) (_cy-__ref._thumbsize /*int*/ /(double)2),(float) (_cx+__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()/(double)8),(float) (_cy+__ref._thumbsize /*int*/ /(double)2));
RDebugUtils.currentLine=27787280;
 //BA.debugLineNum = 27787280;BA.debugLine="cvs.DrawBitmapRotated(thumb, dest, angle)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawBitmapRotated((javafx.scene.image.Image)(__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject()),_dest,(float) (_angle));
RDebugUtils.currentLine=27787281;
 //BA.debugLineNum = 27787281;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=27787282;
 //BA.debugLineNum = 27787282;BA.debugLine="xlbl.Text = mValue";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.NumberToString(__ref._mvalue /*int*/ ));
RDebugUtils.currentLine=27787283;
 //BA.debugLineNum = 27787283;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.roundslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
RDebugUtils.currentLine=27459584;
 //BA.debugLineNum = 27459584;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=27459585;
 //BA.debugLineNum = 27459585;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=27459586;
 //BA.debugLineNum = 27459586;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=27459587;
 //BA.debugLineNum = 27459587;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=27459588;
 //BA.debugLineNum = 27459588;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=27459589;
 //BA.debugLineNum = 27459589;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=27459590;
 //BA.debugLineNum = 27459590;BA.debugLine="Private mValue As Int = 75";
_mvalue = (int) (75);
RDebugUtils.currentLine=27459591;
 //BA.debugLineNum = 27459591;BA.debugLine="Private mMin, mMax As Int";
_mmin = 0;
_mmax = 0;
RDebugUtils.currentLine=27459592;
 //BA.debugLineNum = 27459592;BA.debugLine="Private thumb As B4XBitmap";
_thumb = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=27459593;
 //BA.debugLineNum = 27459593;BA.debugLine="Private pnl As B4XView";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=27459594;
 //BA.debugLineNum = 27459594;BA.debugLine="Private xlbl As B4XView";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=27459595;
 //BA.debugLineNum = 27459595;BA.debugLine="Private CircleRect As B4XRect";
_circlerect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=27459596;
 //BA.debugLineNum = 27459596;BA.debugLine="Private ValueColor As Int";
_valuecolor = 0;
RDebugUtils.currentLine=27459597;
 //BA.debugLineNum = 27459597;BA.debugLine="Private stroke As Int";
_stroke = 0;
RDebugUtils.currentLine=27459598;
 //BA.debugLineNum = 27459598;BA.debugLine="Private ThumbSize As Int";
_thumbsize = 0;
RDebugUtils.currentLine=27459599;
 //BA.debugLineNum = 27459599;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=27459600;
 //BA.debugLineNum = 27459600;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4j.example.roundslider __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=27590656;
 //BA.debugLineNum = 27590656;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=27590657;
 //BA.debugLineNum = 27590657;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setObject((java.lang.Object)(_base));
RDebugUtils.currentLine=27590658;
 //BA.debugLineNum = 27590658;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=27590658;
 //BA.debugLineNum = 27590658;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=27590659;
 //BA.debugLineNum = 27590659;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=27590660;
 //BA.debugLineNum = 27590660;BA.debugLine="mMin = Props.Get(\"Min\")";
__ref._mmin /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Min"))));
RDebugUtils.currentLine=27590661;
 //BA.debugLineNum = 27590661;BA.debugLine="mMax = Props.Get(\"Max\")";
__ref._mmax /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Max"))));
RDebugUtils.currentLine=27590662;
 //BA.debugLineNum = 27590662;BA.debugLine="pnl = xui.CreatePanel(\"pnl\")";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnl");
RDebugUtils.currentLine=27590663;
 //BA.debugLineNum = 27590663;BA.debugLine="xlbl = Lbl";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setObject((java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=27590664;
 //BA.debugLineNum = 27590664;BA.debugLine="mBase.AddView(xlbl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=27590665;
 //BA.debugLineNum = 27590665;BA.debugLine="mBase.AddView(pnl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=27590666;
 //BA.debugLineNum = 27590666;BA.debugLine="ValueColor = xui.PaintOrColorToColor(Props.Get(\"V";
__ref._valuecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ValueColor")));
RDebugUtils.currentLine=27590667;
 //BA.debugLineNum = 27590667;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
RDebugUtils.currentLine=27590668;
 //BA.debugLineNum = 27590668;BA.debugLine="stroke = 8dip";
__ref._stroke /*int*/  = __c.DipToCurrent((int) (8));
 }else 
{RDebugUtils.currentLine=27590669;
 //BA.debugLineNum = 27590669;BA.debugLine="Else If xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=27590670;
 //BA.debugLineNum = 27590670;BA.debugLine="stroke = 6dip";
__ref._stroke /*int*/  = __c.DipToCurrent((int) (6));
 }}
;
RDebugUtils.currentLine=27590672;
 //BA.debugLineNum = 27590672;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=27590673;
 //BA.debugLineNum = 27590673;BA.debugLine="End Sub";
return "";
}
public int  _getvalue(b4j.example.roundslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Integer) Debug.delegate(ba, "getvalue", null));}
RDebugUtils.currentLine=28180480;
 //BA.debugLineNum = 28180480;BA.debugLine="Public Sub getValue As Int";
RDebugUtils.currentLine=28180481;
 //BA.debugLineNum = 28180481;BA.debugLine="Return mValue";
if (true) return __ref._mvalue /*int*/ ;
RDebugUtils.currentLine=28180482;
 //BA.debugLineNum = 28180482;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4j.example.roundslider __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=27525120;
 //BA.debugLineNum = 27525120;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=27525121;
 //BA.debugLineNum = 27525121;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=27525122;
 //BA.debugLineNum = 27525122;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=27525123;
 //BA.debugLineNum = 27525123;BA.debugLine="End Sub";
return "";
}
public String  _pnl_mouseclicked(b4j.example.roundslider __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "pnl_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "pnl_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=27983872;
 //BA.debugLineNum = 27983872;BA.debugLine="Private Sub pnl_MouseClicked(EventData As MouseEve";
RDebugUtils.currentLine=27983873;
 //BA.debugLineNum = 27983873;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=27983874;
 //BA.debugLineNum = 27983874;BA.debugLine="End Sub";
return "";
}
public String  _pnl_mousepressed(b4j.example.roundslider __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "pnl_mousepressed", true))
	 {return ((String) Debug.delegate(ba, "pnl_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=27918336;
 //BA.debugLineNum = 27918336;BA.debugLine="Private Sub pnl_MousePressed (EventData As MouseEv";
RDebugUtils.currentLine=27918337;
 //BA.debugLineNum = 27918337;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=27918338;
 //BA.debugLineNum = 27918338;BA.debugLine="End Sub";
return "";
}
public String  _pnl_mousereleased(b4j.example.roundslider __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "pnl_mousereleased", true))
	 {return ((String) Debug.delegate(ba, "pnl_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=28049408;
 //BA.debugLineNum = 28049408;BA.debugLine="Private Sub pnl_MouseReleased(EventData As MouseEv";
RDebugUtils.currentLine=28049409;
 //BA.debugLineNum = 28049409;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=28049410;
 //BA.debugLineNum = 28049410;BA.debugLine="End Sub";
return "";
}
public String  _pnl_touch(b4j.example.roundslider __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "pnl_touch", true))
	 {return ((String) Debug.delegate(ba, "pnl_touch", new Object[] {_action,_x,_y}));}
int _dx = 0;
int _dy = 0;
float _dist = 0f;
int _angle = 0;
int _newvalue = 0;
RDebugUtils.currentLine=27852800;
 //BA.debugLineNum = 27852800;BA.debugLine="Private Sub pnl_Touch (Action As Int, X As Float,";
RDebugUtils.currentLine=27852801;
 //BA.debugLineNum = 27852801;BA.debugLine="If Action = pnl.TOUCH_ACTION_MOVE_NOTOUCH Then Re";
if (_action==__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
RDebugUtils.currentLine=27852802;
 //BA.debugLineNum = 27852802;BA.debugLine="Dim dx As Int = x - CircleRect.CenterX";
_dx = (int) (_x-__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX());
RDebugUtils.currentLine=27852803;
 //BA.debugLineNum = 27852803;BA.debugLine="Dim dy As Int = y - CircleRect.CenterY";
_dy = (int) (_y-__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY());
RDebugUtils.currentLine=27852804;
 //BA.debugLineNum = 27852804;BA.debugLine="Dim dist As Float = Sqrt(Power(dx, 2) + Power(dy,";
_dist = (float) (__c.Sqrt(__c.Power(_dx,2)+__c.Power(_dy,2)));
RDebugUtils.currentLine=27852805;
 //BA.debugLineNum = 27852805;BA.debugLine="If dist > CircleRect.Width / 2 Then";
if (_dist>__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth()/(double)2) { 
RDebugUtils.currentLine=27852806;
 //BA.debugLineNum = 27852806;BA.debugLine="Dim angle As Int = Round(ATan2D(dy, dx))";
_angle = (int) (__c.Round(__c.ATan2D(_dy,_dx)));
RDebugUtils.currentLine=27852807;
 //BA.debugLineNum = 27852807;BA.debugLine="angle = angle + 90";
_angle = (int) (_angle+90);
RDebugUtils.currentLine=27852808;
 //BA.debugLineNum = 27852808;BA.debugLine="angle = (angle + 360) Mod 360";
_angle = (int) ((_angle+360)%360);
RDebugUtils.currentLine=27852809;
 //BA.debugLineNum = 27852809;BA.debugLine="Dim NewValue As Int = mMin + angle / 360 * (mMax";
_newvalue = (int) (__ref._mmin /*int*/ +_angle/(double)360*(__ref._mmax /*int*/ -__ref._mmin /*int*/ ));
RDebugUtils.currentLine=27852810;
 //BA.debugLineNum = 27852810;BA.debugLine="NewValue = Max(mMin, Min(mMax, NewValue))";
_newvalue = (int) (__c.Max(__ref._mmin /*int*/ ,__c.Min(__ref._mmax /*int*/ ,_newvalue)));
RDebugUtils.currentLine=27852811;
 //BA.debugLineNum = 27852811;BA.debugLine="If NewValue <> mValue Then";
if (_newvalue!=__ref._mvalue /*int*/ ) { 
RDebugUtils.currentLine=27852812;
 //BA.debugLineNum = 27852812;BA.debugLine="mValue = NewValue";
__ref._mvalue /*int*/  = _newvalue;
RDebugUtils.currentLine=27852813;
 //BA.debugLineNum = 27852813;BA.debugLine="CallSub2(mCallBack, mEventName & \"_ValueChanged";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(Object)(__ref._mvalue /*int*/ ));
 };
RDebugUtils.currentLine=27852815;
 //BA.debugLineNum = 27852815;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
 };
RDebugUtils.currentLine=27852817;
 //BA.debugLineNum = 27852817;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(b4j.example.roundslider __ref,int _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_v}));}
RDebugUtils.currentLine=28114944;
 //BA.debugLineNum = 28114944;BA.debugLine="Public Sub setValue (v As Int)";
RDebugUtils.currentLine=28114945;
 //BA.debugLineNum = 28114945;BA.debugLine="mValue = Max(mMin, Min(mMax, v))";
__ref._mvalue /*int*/  = (int) (__c.Max(__ref._mmin /*int*/ ,__c.Min(__ref._mmax /*int*/ ,_v)));
RDebugUtils.currentLine=28114946;
 //BA.debugLineNum = 28114946;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=28114947;
 //BA.debugLineNum = 28114947;BA.debugLine="End Sub";
return "";
}
}