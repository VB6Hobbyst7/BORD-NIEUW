package b4j.example;

import anywheresoftware.b4a.debug.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javafx.scene.text.Font;
import javafx.scene.text.TextBoundsType;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class clxtoastmessage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.clxtoastmessage", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.clxtoastmessage.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mpanel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mlbl = null;
public int _mpanelpos = 0;
public anywheresoftware.b4a.objects.collections.List _tmlist = null;
public anywheresoftware.b4a.objects.collections.Map _tempsettings = null;
public boolean _displaying = false;
public boolean _fading = false;
public anywheresoftware.b4a.objects.Timer _timer1 = null;
public int _tmpos_top = 0;
public int _tmpos_center = 0;
public int _tmpos_bottom = 0;
public int _vpos_top = 0;
public int _vpos_center = 0;
public int _vpos_bottom = 0;
public int _hpos_left = 0;
public int _hpos_center = 0;
public int _hpos_right = 0;
public String[] _arhpos = null;
public String[] _arvpos = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.scorebord _scorebord = null;
public b4j.example.nieuwe_partij _nieuwe_partij = null;
public b4j.example.func _func = null;
public b4j.example.parseconfig _parseconfig = null;
public b4j.example.funcinet _funcinet = null;
public b4j.example.getnode _getnode = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _initialize(b4j.example.clxtoastmessage __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _base) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clxtoastmessage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_base}));}
anywheresoftware.b4j.objects.LabelWrapper _l1 = null;
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Public Sub Initialize(Base As B4XView)";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _base;
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="Dim l1 As Label";
_l1 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="l1.Initialize(\"\")";
_l1.Initialize(ba,"");
RDebugUtils.currentLine=8060936;
 //BA.debugLineNum = 8060936;BA.debugLine="l1.WrapText = True";
_l1.setWrapText(__c.True);
RDebugUtils.currentLine=8060940;
 //BA.debugLineNum = 8060940;BA.debugLine="mLbl = l1";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setObject((java.lang.Object)(_l1.getObject()));
RDebugUtils.currentLine=8060941;
 //BA.debugLineNum = 8060941;BA.debugLine="mPanel = xui.CreatePanel(\"\")";
__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=8060942;
 //BA.debugLineNum = 8060942;BA.debugLine="mPanel.Visible = True";
__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=8060943;
 //BA.debugLineNum = 8060943;BA.debugLine="mPanel.AddView(mLbl,5dip,0dip,mBase.Width-20dip,1";
__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (0)),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=8060944;
 //BA.debugLineNum = 8060944;BA.debugLine="tempSettings = DuplicateMap(MakeDefaults)				'cre";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._duplicatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._makedefaults /*anywheresoftware.b4a.objects.collections.Map*/ (null));
RDebugUtils.currentLine=8060945;
 //BA.debugLineNum = 8060945;BA.debugLine="TMList.initialize";
__ref._tmlist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=8060946;
 //BA.debugLineNum = 8060946;BA.debugLine="TMList.Add(DuplicateMap(tempSettings))					'save";
__ref._tmlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._duplicatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ ).getObject()));
RDebugUtils.currentLine=8060947;
 //BA.debugLineNum = 8060947;BA.debugLine="displaying = False";
__ref._displaying /*boolean*/  = __c.False;
RDebugUtils.currentLine=8060948;
 //BA.debugLineNum = 8060948;BA.debugLine="fading = False";
__ref._fading /*boolean*/  = __c.False;
RDebugUtils.currentLine=8060949;
 //BA.debugLineNum = 8060949;BA.debugLine="timer1.Initialize(\"timer1\", 2000)						'timer def";
__ref._timer1 /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"timer1",(long) (2000));
RDebugUtils.currentLine=8060950;
 //BA.debugLineNum = 8060950;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.clxtoastmessage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clxtoastmessage";
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=7995398;
 //BA.debugLineNum = 7995398;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=7995399;
 //BA.debugLineNum = 7995399;BA.debugLine="Private mBase As B4XView				'base panel from call";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=7995400;
 //BA.debugLineNum = 7995400;BA.debugLine="Private mPanel As B4XView				'panel holding the m";
_mpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=7995401;
 //BA.debugLineNum = 7995401;BA.debugLine="Private mLbl As B4XView					'message label";
_mlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=7995402;
 //BA.debugLineNum = 7995402;BA.debugLine="Private mPanelPos As Int				'message position rel";
_mpanelpos = 0;
RDebugUtils.currentLine=7995403;
 //BA.debugLineNum = 7995403;BA.debugLine="Private TMList As List					'list of toast message";
_tmlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7995404;
 //BA.debugLineNum = 7995404;BA.debugLine="Private tempSettings As Map				'temporary setting";
_tempsettings = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7995405;
 //BA.debugLineNum = 7995405;BA.debugLine="Private displaying As Boolean			'True = a TM is c";
_displaying = false;
RDebugUtils.currentLine=7995406;
 //BA.debugLineNum = 7995406;BA.debugLine="Private fading As Boolean				'True = fade effect";
_fading = false;
RDebugUtils.currentLine=7995407;
 //BA.debugLineNum = 7995407;BA.debugLine="Private timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=7995408;
 //BA.debugLineNum = 7995408;BA.debugLine="Public CONST TMPOS_TOP As Int = 0		'constant to s";
_tmpos_top = (int) (0);
RDebugUtils.currentLine=7995409;
 //BA.debugLineNum = 7995409;BA.debugLine="Public CONST TMPOS_CENTER As Int = 1	'			\"			\"		\"";
_tmpos_center = (int) (1);
RDebugUtils.currentLine=7995410;
 //BA.debugLineNum = 7995410;BA.debugLine="Public CONST TMPOS_BOTTOM As Int = 2	'			\"			\"		\"";
_tmpos_bottom = (int) (2);
RDebugUtils.currentLine=7995411;
 //BA.debugLineNum = 7995411;BA.debugLine="Public CONST VPOS_TOP As Int = 0		'constant to ve";
_vpos_top = (int) (0);
RDebugUtils.currentLine=7995412;
 //BA.debugLineNum = 7995412;BA.debugLine="Public CONST VPOS_CENTER As Int = 1		'			\"			\"		\"";
_vpos_center = (int) (1);
RDebugUtils.currentLine=7995413;
 //BA.debugLineNum = 7995413;BA.debugLine="Public CONST VPOS_BOTTOM As Int = 2		'			\"			\"		\"";
_vpos_bottom = (int) (2);
RDebugUtils.currentLine=7995414;
 //BA.debugLineNum = 7995414;BA.debugLine="Public CONST HPOS_LEFT As Int = 0		'constant to h";
_hpos_left = (int) (0);
RDebugUtils.currentLine=7995415;
 //BA.debugLineNum = 7995415;BA.debugLine="Public CONST HPOS_CENTER As Int = 1		'			\"			\"		\"";
_hpos_center = (int) (1);
RDebugUtils.currentLine=7995416;
 //BA.debugLineNum = 7995416;BA.debugLine="Public CONST HPOS_RIGHT As Int = 2		'			\"			\"		\"";
_hpos_right = (int) (2);
RDebugUtils.currentLine=7995417;
 //BA.debugLineNum = 7995417;BA.debugLine="Private CONST arHpos(3) As String = Array As Stri";
_arhpos = new String[]{"LEFT","CENTER","RIGHT"};
RDebugUtils.currentLine=7995418;
 //BA.debugLineNum = 7995418;BA.debugLine="Private CONST arVpos(3) As String = Array As Stri";
_arvpos = new String[]{"TOP","CENTER","BOTTOM"};
RDebugUtils.currentLine=7995419;
 //BA.debugLineNum = 7995419;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _duplicatemap(b4j.example.clxtoastmessage __ref,anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="clxtoastmessage";
if (Debug.shouldDelegate(ba, "duplicatemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "duplicatemap", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.Map _m1 = null;
int _i = 0;
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Private Sub DuplicateMap(Source As Map) As Map";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="Dim m1 As Map";
_m1 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="m1.Initialize";
_m1.Initialize();
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="For i = 0 To Source.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_source.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="m1.Put(Source.GetKeyAt(i), Source.GetValueAt(i))";
_m1.Put(_source.GetKeyAt(_i),_source.GetValueAt(_i));
 }
};
RDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="Return m1";
if (true) return _m1;
RDebugUtils.currentLine=8847367;
 //BA.debugLineNum = 8847367;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _makedefaults(b4j.example.clxtoastmessage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clxtoastmessage";
if (Debug.shouldDelegate(ba, "makedefaults", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "makedefaults", null));}
anywheresoftware.b4a.objects.collections.Map _m1 = null;
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Private Sub MakeDefaults As Map";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Dim m1 As Map";
_m1 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="m1.Initialize";
_m1.Initialize();
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="m1.Put(\"pColor\",xui.Color_DarkGray)						'Backgro";
_m1.Put((Object)("pColor"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_DarkGray));
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="m1.Put(\"pBColor\",xui.Color_DarkGray)					'Backgro";
_m1.Put((Object)("pBColor"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_DarkGray));
RDebugUtils.currentLine=8126470;
 //BA.debugLineNum = 8126470;BA.debugLine="m1.Put(\"pBWidth\", 0dip)									'Background borde";
_m1.Put((Object)("pBWidth"),(Object)(__c.DipToCurrent((int) (0))));
RDebugUtils.currentLine=8126471;
 //BA.debugLineNum = 8126471;BA.debugLine="m1.Put(\"pBRadius\", 0dip)								'Background borde";
_m1.Put((Object)("pBRadius"),(Object)(__c.DipToCurrent((int) (0))));
RDebugUtils.currentLine=8126472;
 //BA.debugLineNum = 8126472;BA.debugLine="m1.Put(\"pPos\", TMPOS_BOTTOM)";
_m1.Put((Object)("pPos"),(Object)(__ref._tmpos_bottom /*int*/ ));
RDebugUtils.currentLine=8126474;
 //BA.debugLineNum = 8126474;BA.debugLine="m1.Put(\"lTSize\", 15)									'Message label text";
_m1.Put((Object)("lTSize"),(Object)(15));
RDebugUtils.currentLine=8126475;
 //BA.debugLineNum = 8126475;BA.debugLine="m1.Put(\"lTColor\", (xui.Color_White))					'Message";
_m1.Put((Object)("lTColor"),(Object)((__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White)));
RDebugUtils.currentLine=8126476;
 //BA.debugLineNum = 8126476;BA.debugLine="m1.Put(\"lHAlign\", (HPOS_LEFT))							'Message lab";
_m1.Put((Object)("lHAlign"),(Object)((__ref._hpos_left /*int*/ )));
RDebugUtils.currentLine=8126477;
 //BA.debugLineNum = 8126477;BA.debugLine="m1.Put(\"lVAlign\", (VPOS_CENTER))						'Message la";
_m1.Put((Object)("lVAlign"),(Object)((__ref._vpos_center /*int*/ )));
RDebugUtils.currentLine=8126479;
 //BA.debugLineNum = 8126479;BA.debugLine="m1.Put(\"dShort\", 2000)									'Message  display";
_m1.Put((Object)("dShort"),(Object)(2000));
RDebugUtils.currentLine=8126480;
 //BA.debugLineNum = 8126480;BA.debugLine="m1.Put(\"dLong\", 3000)									'Message  display t";
_m1.Put((Object)("dLong"),(Object)(3000));
RDebugUtils.currentLine=8126481;
 //BA.debugLineNum = 8126481;BA.debugLine="Return m1";
if (true) return _m1;
RDebugUtils.currentLine=8126482;
 //BA.debugLineNum = 8126482;BA.debugLine="End Sub";
return null;
}
public double  _measuremultilinetextheight(b4j.example.clxtoastmessage __ref,anywheresoftware.b4j.objects.JFX.FontWrapper _font,double _width,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="clxtoastmessage";
if (Debug.shouldDelegate(ba, "measuremultilinetextheight", false))
	 {return ((Double) Debug.delegate(ba, "measuremultilinetextheight", new Object[] {_font,_width,_text}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Private Sub MeasureMultilineTextHeight (Font As Fo";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(this));
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="Return jo.RunMethod(\"MeasureMultilineTextHeight\",";
if (true) return (double)(BA.ObjectToNumber(_jo.RunMethod("MeasureMultilineTextHeight",new Object[]{(Object)(_font.getObject()),(Object)(_text),(Object)(_width)})));
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="End Sub";
return 0;
}
public String  _settmbackground(b4j.example.clxtoastmessage __ref,Object _backgroundcolor,double _borderwidth,Object _bordercolor,double _bordercornerradius) throws Exception{
__ref = this;
RDebugUtils.currentModule="clxtoastmessage";
if (Debug.shouldDelegate(ba, "settmbackground", false))
	 {return ((String) Debug.delegate(ba, "settmbackground", new Object[] {_backgroundcolor,_borderwidth,_bordercolor,_bordercornerradius}));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Public Sub SetTMBackground(BackgroundColor As Obje";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="tempSettings.Put(\"pColor\",xui.PaintOrColorToColor";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pColor"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_backgroundcolor)));
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="tempSettings.Put(\"pBColor\",xui.PaintOrColorToColo";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pBColor"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_bordercolor)));
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="tempSettings.Put(\"pBWidth\", BorderWidth)";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pBWidth"),(Object)(_borderwidth));
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="tempSettings.Put(\"pBRadius\", BorderCornerRadius)";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pBRadius"),(Object)(_bordercornerradius));
RDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="End Sub";
return "";
}
public String  _settmdefaults(b4j.example.clxtoastmessage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clxtoastmessage";
if (Debug.shouldDelegate(ba, "settmdefaults", false))
	 {return ((String) Debug.delegate(ba, "settmdefaults", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Public Sub SetTMDefaults";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="Dim m As Map = TMList.Get(0)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._tmlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="tempSettings = DuplicateMap(m)";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._duplicatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_m);
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="End Sub";
return "";
}
public String  _settmduration(b4j.example.clxtoastmessage __ref,int _shortduration,int _longduration) throws Exception{
__ref = this;
RDebugUtils.currentModule="clxtoastmessage";
if (Debug.shouldDelegate(ba, "settmduration", false))
	 {return ((String) Debug.delegate(ba, "settmduration", new Object[] {_shortduration,_longduration}));}
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Public Sub SetTMDuration(ShortDuration As Int, Lon";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="tempSettings.Put(\"dShort\", ShortDuration)";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("dShort"),(Object)(_shortduration));
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="tempSettings.Put(\"dLong\", LongDuration)";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("dLong"),(Object)(_longduration));
RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="End Sub";
return "";
}
public String  _settmposition(b4j.example.clxtoastmessage __ref,int _apos) throws Exception{
__ref = this;
RDebugUtils.currentModule="clxtoastmessage";
if (Debug.shouldDelegate(ba, "settmposition", false))
	 {return ((String) Debug.delegate(ba, "settmposition", new Object[] {_apos}));}
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Public Sub SetTMPosition(aPos As Int)";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="If aPos >=0 And aPos <= 2 Then tempSettings.Put(\"";
if (_apos>=0 && _apos<=2) { 
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pPos"),(Object)(_apos));};
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="End Sub";
return "";
}
public String  _settmtextprop(b4j.example.clxtoastmessage __ref,double _asize,int _halignment,int _valignment,Object _acolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="clxtoastmessage";
if (Debug.shouldDelegate(ba, "settmtextprop", false))
	 {return ((String) Debug.delegate(ba, "settmtextprop", new Object[] {_asize,_halignment,_valignment,_acolor}));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Public Sub SetTMTextProp(aSize As Double, HAlignme";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="tempSettings.Put(\"lTSize\", aSize)";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lTSize"),(Object)(_asize));
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="If HAlignment >=0 And HAlignment <=2 Then tempSet";
if (_halignment>=0 && _halignment<=2) { 
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lHAlign"),(Object)((_halignment)));};
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="If VAlignment >=0 And VAlignment <=2 Then tempSet";
if (_valignment>=0 && _valignment<=2) { 
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lVAlign"),(Object)((_valignment)));};
RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="tempSettings.Put(\"lTColor\", (xui.PaintOrColorToCo";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lTColor"),(Object)((__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_acolor))));
RDebugUtils.currentLine=8388613;
 //BA.debugLineNum = 8388613;BA.debugLine="End Sub";
return "";
}
public String  _showmessage(b4j.example.clxtoastmessage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clxtoastmessage";
if (Debug.shouldDelegate(ba, "showmessage", false))
	 {return ((String) Debug.delegate(ba, "showmessage", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
String _hpos = "";
String _vpos = "";
int _lduration = 0;
int _sduration = 0;
double _onerow = 0;
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Private Sub ShowMessage";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="Dim m As Map = TMList.Get(1)										'item #1 =";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._tmlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1))));
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="mPanel.SetColorAndBorder(xui.PaintOrColorToColor(";
__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_m.Get((Object)("pColor"))),(double)(BA.ObjectToNumber(_m.Get((Object)("pBWidth")))),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_m.Get((Object)("pBColor"))),(double)(BA.ObjectToNumber(_m.Get((Object)("pBRadius")))));
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="mLbl.TextSize = m.Get(\"lTSize\")";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextSize((double)(BA.ObjectToNumber(_m.Get((Object)("lTSize")))));
RDebugUtils.currentLine=8650757;
 //BA.debugLineNum = 8650757;BA.debugLine="Dim hpos,vpos As String";
_hpos = "";
_vpos = "";
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="hpos = arHpos(m.Get(\"lHAlign\"))";
_hpos = __ref._arhpos /*String[]*/ [(int)(BA.ObjectToNumber(_m.Get((Object)("lHAlign"))))];
RDebugUtils.currentLine=8650759;
 //BA.debugLineNum = 8650759;BA.debugLine="vpos = arVpos(m.Get(\"lVAlign\"))";
_vpos = __ref._arvpos /*String[]*/ [(int)(BA.ObjectToNumber(_m.Get((Object)("lVAlign"))))];
RDebugUtils.currentLine=8650760;
 //BA.debugLineNum = 8650760;BA.debugLine="mLbl.SetTextAlignment(vpos, hpos)";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment(_vpos,_hpos);
RDebugUtils.currentLine=8650761;
 //BA.debugLineNum = 8650761;BA.debugLine="mLbl.TextColor = xui.PaintOrColorToColor(m.Get(\"l";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_m.Get((Object)("lTColor"))));
RDebugUtils.currentLine=8650762;
 //BA.debugLineNum = 8650762;BA.debugLine="mLbl.Text = m.Get(\"lText\") 'Message";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(_m.Get((Object)("lText"))));
RDebugUtils.currentLine=8650763;
 //BA.debugLineNum = 8650763;BA.debugLine="mPanelPos = m.Get(\"pPos\")";
__ref._mpanelpos /*int*/  = (int)(BA.ObjectToNumber(_m.Get((Object)("pPos"))));
RDebugUtils.currentLine=8650764;
 //BA.debugLineNum = 8650764;BA.debugLine="Private LDuration, SDuration As Int";
_lduration = 0;
_sduration = 0;
RDebugUtils.currentLine=8650765;
 //BA.debugLineNum = 8650765;BA.debugLine="SDuration = m.get(\"dShort\")";
_sduration = (int)(BA.ObjectToNumber(_m.Get((Object)("dShort"))));
RDebugUtils.currentLine=8650766;
 //BA.debugLineNum = 8650766;BA.debugLine="LDuration = m.get(\"dLong\")";
_lduration = (int)(BA.ObjectToNumber(_m.Get((Object)("dLong"))));
RDebugUtils.currentLine=8650769;
 //BA.debugLineNum = 8650769;BA.debugLine="Dim onerow As Double = MeasureMultilineTextHeight";
_onerow = __ref._measuremultilinetextheight /*double*/ (null,__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .DefaultFont(__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextSize()),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),"a");
RDebugUtils.currentLine=8650770;
 //BA.debugLineNum = 8650770;BA.debugLine="mLbl.Height = MeasureMultilineTextHeight(fx.Defau";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._measuremultilinetextheight /*double*/ (null,__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .DefaultFont(__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextSize()),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText())+_onerow);
RDebugUtils.currentLine=8650781;
 //BA.debugLineNum = 8650781;BA.debugLine="mPanel.Height = mLbl.Height + 2dip 'accounts for";
__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=8650782;
 //BA.debugLineNum = 8650782;BA.debugLine="Select mPanelPos";
switch (BA.switchObjectToInt(__ref._mpanelpos /*int*/ ,__ref._tmpos_top /*int*/ ,__ref._tmpos_center /*int*/ ,__ref._tmpos_bottom /*int*/ )) {
case 0: {
RDebugUtils.currentLine=8650784;
 //BA.debugLineNum = 8650784;BA.debugLine="mBase.AddView(mPanel, 5dip, 5dip, mBase.Width-1";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (10)),__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 break; }
case 1: {
RDebugUtils.currentLine=8650786;
 //BA.debugLineNum = 8650786;BA.debugLine="mBase.AddView(mPanel, 5dip,(mBase.Height-mPanel";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (5)),(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())/(double)2,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (10)),__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 break; }
case 2: {
RDebugUtils.currentLine=8650788;
 //BA.debugLineNum = 8650788;BA.debugLine="mBase.AddView(mPanel, 5dip, mBase.Height-mPanel";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (5)),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (5)),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (10)),__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 break; }
}
;
RDebugUtils.currentLine=8650790;
 //BA.debugLineNum = 8650790;BA.debugLine="fading = tempSettings.get(\"tmfade\")";
__ref._fading /*boolean*/  = BA.ObjectToBoolean(__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("tmfade")));
RDebugUtils.currentLine=8650791;
 //BA.debugLineNum = 8650791;BA.debugLine="If fading Then	mPanel.SetVisibleAnimated(400, Tru";
if (__ref._fading /*boolean*/ ) { 
__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(ba,(int) (400),__c.True);}
else {
__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(ba,(int) (0),__c.True);};
RDebugUtils.currentLine=8650792;
 //BA.debugLineNum = 8650792;BA.debugLine="displaying = True";
__ref._displaying /*boolean*/  = __c.True;
RDebugUtils.currentLine=8650793;
 //BA.debugLineNum = 8650793;BA.debugLine="If tempSettings.get(\"tmdur\") Then timer1.Interval";
if (BA.ObjectToBoolean(__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("tmdur")))) { 
__ref._timer1 /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (_lduration));}
else {
__ref._timer1 /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (_sduration));};
RDebugUtils.currentLine=8650794;
 //BA.debugLineNum = 8650794;BA.debugLine="timer1.Enabled = True";
__ref._timer1 /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=8650795;
 //BA.debugLineNum = 8650795;BA.debugLine="End Sub";
return "";
}
public void  _timer1_tick(b4j.example.clxtoastmessage __ref) throws Exception{
RDebugUtils.currentModule="clxtoastmessage";
if (Debug.shouldDelegate(ba, "timer1_tick", false))
	 {Debug.delegate(ba, "timer1_tick", null); return;}
ResumableSub_timer1_tick rsub = new ResumableSub_timer1_tick(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_timer1_tick extends BA.ResumableSub {
public ResumableSub_timer1_tick(b4j.example.clxtoastmessage parent,b4j.example.clxtoastmessage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.clxtoastmessage __ref;
b4j.example.clxtoastmessage parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clxtoastmessage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="If fading Then";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._fading /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="mPanel.SetVisibleAnimated(400, False)";
__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(ba,(int) (400),parent.__c.False);
RDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="Sleep(500)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clxtoastmessage", "timer1_tick"),(int) (500));
this.state = 13;
return;
case 13:
//C
this.state = 4;
;
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="fading = False";
__ref._fading /*boolean*/  = parent.__c.False;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=8716294;
 //BA.debugLineNum = 8716294;BA.debugLine="timer1.Enabled = False";
__ref._timer1 /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=8716295;
 //BA.debugLineNum = 8716295;BA.debugLine="mPanel.RemoveViewFromParent";
__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=8716296;
 //BA.debugLineNum = 8716296;BA.debugLine="mBase.Tag = Null";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(parent.__c.Null);
RDebugUtils.currentLine=8716297;
 //BA.debugLineNum = 8716297;BA.debugLine="TMList.RemoveAt(1)";
__ref._tmlist /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (1));
RDebugUtils.currentLine=8716298;
 //BA.debugLineNum = 8716298;BA.debugLine="If TMList.Size > 1 Then ShowMessage Else displayi";
if (true) break;

case 5:
//if
this.state = 12;
if (__ref._tmlist /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>1) { 
this.state = 7;
;}
else {
this.state = 9;
;}if (true) break;

case 7:
//C
this.state = 12;
__ref._showmessage /*String*/ (null);
if (true) break;

case 9:
//C
this.state = 12;
__ref._displaying /*boolean*/  = parent.__c.False;
if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=8716299;
 //BA.debugLineNum = 8716299;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _tmclearandshow(b4j.example.clxtoastmessage __ref,String _message,boolean _longduration,boolean _fadeeffect) throws Exception{
__ref = this;
RDebugUtils.currentModule="clxtoastmessage";
if (Debug.shouldDelegate(ba, "tmclearandshow", false))
	 {return ((String) Debug.delegate(ba, "tmclearandshow", new Object[] {_message,_longduration,_fadeeffect}));}
anywheresoftware.b4a.objects.collections.Map _m1 = null;
int _i = 0;
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Public Sub TMClearAndShow(Message As String, LongD";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="timer1.Enabled = False";
__ref._timer1 /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="displaying = False";
__ref._displaying /*boolean*/  = __c.False;
RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="TMList.Clear";
__ref._tmlist /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=8585220;
 //BA.debugLineNum = 8585220;BA.debugLine="Dim m1 As Map = DuplicateMap(MakeDefaults)";
_m1 = new anywheresoftware.b4a.objects.collections.Map();
_m1 = __ref._duplicatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._makedefaults /*anywheresoftware.b4a.objects.collections.Map*/ (null));
RDebugUtils.currentLine=8585221;
 //BA.debugLineNum = 8585221;BA.debugLine="TMList.Add(m1)														'item #0 = defaults";
__ref._tmlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_m1.getObject()));
RDebugUtils.currentLine=8585222;
 //BA.debugLineNum = 8585222;BA.debugLine="For i = 0 To m1.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_m1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=8585223;
 //BA.debugLineNum = 8585223;BA.debugLine="If Not(tempSettings.ContainsKey(m1.GetKeyAt(i)))";
if (__c.Not(__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey(_m1.GetKeyAt(_i)))) { 
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put(_m1.GetKeyAt(_i),_m1.GetValueAt(_i));};
 }
};
RDebugUtils.currentLine=8585227;
 //BA.debugLineNum = 8585227;BA.debugLine="tempSettings.Put(\"lText\", Message)";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lText"),(Object)(_message));
RDebugUtils.currentLine=8585228;
 //BA.debugLineNum = 8585228;BA.debugLine="tempSettings.Put(\"tmfade\", FadeEffect)";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("tmfade"),(Object)(_fadeeffect));
RDebugUtils.currentLine=8585229;
 //BA.debugLineNum = 8585229;BA.debugLine="tempSettings.Put(\"tmdur\", LongDuration)";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("tmdur"),(Object)(_longduration));
RDebugUtils.currentLine=8585230;
 //BA.debugLineNum = 8585230;BA.debugLine="TMList.Add(DuplicateMap(tempSettings))								'it";
__ref._tmlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._duplicatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ ).getObject()));
RDebugUtils.currentLine=8585231;
 //BA.debugLineNum = 8585231;BA.debugLine="mPanel.RemoveViewFromParent";
__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=8585232;
 //BA.debugLineNum = 8585232;BA.debugLine="mBase.Tag = Null";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(__c.Null);
RDebugUtils.currentLine=8585233;
 //BA.debugLineNum = 8585233;BA.debugLine="ShowMessage";
__ref._showmessage /*String*/ (null);
RDebugUtils.currentLine=8585234;
 //BA.debugLineNum = 8585234;BA.debugLine="End Sub";
return "";
}
public String  _tmshow(b4j.example.clxtoastmessage __ref,String _message,boolean _longduration,boolean _fadeeffect) throws Exception{
__ref = this;
RDebugUtils.currentModule="clxtoastmessage";
if (Debug.shouldDelegate(ba, "tmshow", false))
	 {return ((String) Debug.delegate(ba, "tmshow", new Object[] {_message,_longduration,_fadeeffect}));}
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Public Sub TMShow (Message As String, LongDuration";
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="tempSettings.Put(\"lText\", Message)";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lText"),(Object)(_message));
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="tempSettings.Put(\"tmfade\", FadeEffect)";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("tmfade"),(Object)(_fadeeffect));
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="tempSettings.Put(\"tmdur\", LongDuration)";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("tmdur"),(Object)(_longduration));
RDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="TMList.Add(DuplicateMap(tempSettings))";
__ref._tmlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._duplicatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ ).getObject()));
RDebugUtils.currentLine=8519686;
 //BA.debugLineNum = 8519686;BA.debugLine="If displaying Then Return";
if (__ref._displaying /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=8519687;
 //BA.debugLineNum = 8519687;BA.debugLine="ShowMessage";
__ref._showmessage /*String*/ (null);
RDebugUtils.currentLine=8519688;
 //BA.debugLineNum = 8519688;BA.debugLine="End Sub";
return "";
}
public static double MeasureMultilineTextHeight(Font f, String text, double width) throws Exception {
  Method m = Class.forName("com.sun.javafx.scene.control.skin.Utils").getDeclaredMethod("computeTextHeight",
  Font.class, String.class, double.class, TextBoundsType.class);
  m.setAccessible(true);
  return (Double)m.invoke(null, f, text, width, TextBoundsType.LOGICAL_VERTICAL_CENTER);
  }
}