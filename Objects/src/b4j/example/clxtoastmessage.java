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
public b4j.example.cssutils _cssutils = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.main _main = null;
public b4j.example.scorebord _scorebord = null;
public b4j.example.func _func = null;
public b4j.example.funcinet _funcinet = null;
public b4j.example.parseconfig _parseconfig = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _initialize(b4j.example.clxtoastmessage __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _base) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clxtoastmessage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_base}));}
anywheresoftware.b4j.objects.LabelWrapper _l1 = null;
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Public Sub Initialize(Base As B4XView)";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _base;
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="Dim l1 As Label";
_l1 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="l1.Initialize(\"\")";
_l1.Initialize(ba,"");
RDebugUtils.currentLine=6094856;
 //BA.debugLineNum = 6094856;BA.debugLine="l1.WrapText = True";
_l1.setWrapText(__c.True);
RDebugUtils.currentLine=6094860;
 //BA.debugLineNum = 6094860;BA.debugLine="mLbl = l1";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setObject((java.lang.Object)(_l1.getObject()));
RDebugUtils.currentLine=6094861;
 //BA.debugLineNum = 6094861;BA.debugLine="mPanel = xui.CreatePanel(\"\")";
__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=6094862;
 //BA.debugLineNum = 6094862;BA.debugLine="mPanel.Visible = True";
__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=6094863;
 //BA.debugLineNum = 6094863;BA.debugLine="mPanel.AddView(mLbl,5dip,0dip,mBase.Width-20dip,1";
__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (0)),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=6094864;
 //BA.debugLineNum = 6094864;BA.debugLine="tempSettings = DuplicateMap(MakeDefaults)				'cre";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._duplicatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._makedefaults /*anywheresoftware.b4a.objects.collections.Map*/ (null));
RDebugUtils.currentLine=6094865;
 //BA.debugLineNum = 6094865;BA.debugLine="TMList.initialize";
__ref._tmlist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=6094866;
 //BA.debugLineNum = 6094866;BA.debugLine="TMList.Add(DuplicateMap(tempSettings))					'save";
__ref._tmlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._duplicatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ ).getObject()));
RDebugUtils.currentLine=6094867;
 //BA.debugLineNum = 6094867;BA.debugLine="displaying = False";
__ref._displaying /*boolean*/  = __c.False;
RDebugUtils.currentLine=6094868;
 //BA.debugLineNum = 6094868;BA.debugLine="fading = False";
__ref._fading /*boolean*/  = __c.False;
RDebugUtils.currentLine=6094869;
 //BA.debugLineNum = 6094869;BA.debugLine="timer1.Initialize(\"timer1\", 2000)						'timer def";
__ref._timer1 /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"timer1",(long) (2000));
RDebugUtils.currentLine=6094870;
 //BA.debugLineNum = 6094870;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.clxtoastmessage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clxtoastmessage";
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=6029318;
 //BA.debugLineNum = 6029318;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=6029319;
 //BA.debugLineNum = 6029319;BA.debugLine="Private mBase As B4XView				'base panel from call";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=6029320;
 //BA.debugLineNum = 6029320;BA.debugLine="Private mPanel As B4XView				'panel holding the m";
_mpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=6029321;
 //BA.debugLineNum = 6029321;BA.debugLine="Private mLbl As B4XView					'message label";
_mlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=6029322;
 //BA.debugLineNum = 6029322;BA.debugLine="Private mPanelPos As Int				'message position rel";
_mpanelpos = 0;
RDebugUtils.currentLine=6029323;
 //BA.debugLineNum = 6029323;BA.debugLine="Private TMList As List					'list of toast message";
_tmlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6029324;
 //BA.debugLineNum = 6029324;BA.debugLine="Private tempSettings As Map				'temporary setting";
_tempsettings = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6029325;
 //BA.debugLineNum = 6029325;BA.debugLine="Private displaying As Boolean			'True = a TM is c";
_displaying = false;
RDebugUtils.currentLine=6029326;
 //BA.debugLineNum = 6029326;BA.debugLine="Private fading As Boolean				'True = fade effect";
_fading = false;
RDebugUtils.currentLine=6029327;
 //BA.debugLineNum = 6029327;BA.debugLine="Private timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=6029328;
 //BA.debugLineNum = 6029328;BA.debugLine="Public CONST TMPOS_TOP As Int = 0		'constant to s";
_tmpos_top = (int) (0);
RDebugUtils.currentLine=6029329;
 //BA.debugLineNum = 6029329;BA.debugLine="Public CONST TMPOS_CENTER As Int = 1	'			\"			\"		\"";
_tmpos_center = (int) (1);
RDebugUtils.currentLine=6029330;
 //BA.debugLineNum = 6029330;BA.debugLine="Public CONST TMPOS_BOTTOM As Int = 2	'			\"			\"		\"";
_tmpos_bottom = (int) (2);
RDebugUtils.currentLine=6029331;
 //BA.debugLineNum = 6029331;BA.debugLine="Public CONST VPOS_TOP As Int = 0		'constant to ve";
_vpos_top = (int) (0);
RDebugUtils.currentLine=6029332;
 //BA.debugLineNum = 6029332;BA.debugLine="Public CONST VPOS_CENTER As Int = 1		'			\"			\"		\"";
_vpos_center = (int) (1);
RDebugUtils.currentLine=6029333;
 //BA.debugLineNum = 6029333;BA.debugLine="Public CONST VPOS_BOTTOM As Int = 2		'			\"			\"		\"";
_vpos_bottom = (int) (2);
RDebugUtils.currentLine=6029334;
 //BA.debugLineNum = 6029334;BA.debugLine="Public CONST HPOS_LEFT As Int = 0		'constant to h";
_hpos_left = (int) (0);
RDebugUtils.currentLine=6029335;
 //BA.debugLineNum = 6029335;BA.debugLine="Public CONST HPOS_CENTER As Int = 1		'			\"			\"		\"";
_hpos_center = (int) (1);
RDebugUtils.currentLine=6029336;
 //BA.debugLineNum = 6029336;BA.debugLine="Public CONST HPOS_RIGHT As Int = 2		'			\"			\"		\"";
_hpos_right = (int) (2);
RDebugUtils.currentLine=6029337;
 //BA.debugLineNum = 6029337;BA.debugLine="Private CONST arHpos(3) As String = Array As Stri";
_arhpos = new String[]{"LEFT","CENTER","RIGHT"};
RDebugUtils.currentLine=6029338;
 //BA.debugLineNum = 6029338;BA.debugLine="Private CONST arVpos(3) As String = Array As Stri";
_arvpos = new String[]{"TOP","CENTER","BOTTOM"};
RDebugUtils.currentLine=6029339;
 //BA.debugLineNum = 6029339;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _duplicatemap(b4j.example.clxtoastmessage __ref,anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="clxtoastmessage";
if (Debug.shouldDelegate(ba, "duplicatemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "duplicatemap", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.Map _m1 = null;
int _i = 0;
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Private Sub DuplicateMap(Source As Map) As Map";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Dim m1 As Map";
_m1 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="m1.Initialize";
_m1.Initialize();
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="For i = 0 To Source.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_source.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="m1.Put(Source.GetKeyAt(i), Source.GetValueAt(i))";
_m1.Put(_source.GetKeyAt(_i),_source.GetValueAt(_i));
 }
};
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="Return m1";
if (true) return _m1;
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _makedefaults(b4j.example.clxtoastmessage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clxtoastmessage";
if (Debug.shouldDelegate(ba, "makedefaults", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "makedefaults", null));}
anywheresoftware.b4a.objects.collections.Map _m1 = null;
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Private Sub MakeDefaults As Map";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="Dim m1 As Map";
_m1 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="m1.Initialize";
_m1.Initialize();
RDebugUtils.currentLine=6160388;
 //BA.debugLineNum = 6160388;BA.debugLine="m1.Put(\"pColor\",xui.Color_DarkGray)						'Backgro";
_m1.Put((Object)("pColor"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_DarkGray));
RDebugUtils.currentLine=6160389;
 //BA.debugLineNum = 6160389;BA.debugLine="m1.Put(\"pBColor\",xui.Color_DarkGray)					'Backgro";
_m1.Put((Object)("pBColor"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_DarkGray));
RDebugUtils.currentLine=6160390;
 //BA.debugLineNum = 6160390;BA.debugLine="m1.Put(\"pBWidth\", 0dip)									'Background borde";
_m1.Put((Object)("pBWidth"),(Object)(__c.DipToCurrent((int) (0))));
RDebugUtils.currentLine=6160391;
 //BA.debugLineNum = 6160391;BA.debugLine="m1.Put(\"pBRadius\", 0dip)								'Background borde";
_m1.Put((Object)("pBRadius"),(Object)(__c.DipToCurrent((int) (0))));
RDebugUtils.currentLine=6160392;
 //BA.debugLineNum = 6160392;BA.debugLine="m1.Put(\"pPos\", TMPOS_BOTTOM)";
_m1.Put((Object)("pPos"),(Object)(__ref._tmpos_bottom /*int*/ ));
RDebugUtils.currentLine=6160394;
 //BA.debugLineNum = 6160394;BA.debugLine="m1.Put(\"lTSize\", 15)									'Message label text";
_m1.Put((Object)("lTSize"),(Object)(15));
RDebugUtils.currentLine=6160395;
 //BA.debugLineNum = 6160395;BA.debugLine="m1.Put(\"lTColor\", (xui.Color_White))					'Message";
_m1.Put((Object)("lTColor"),(Object)((__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White)));
RDebugUtils.currentLine=6160396;
 //BA.debugLineNum = 6160396;BA.debugLine="m1.Put(\"lHAlign\", (HPOS_LEFT))							'Message lab";
_m1.Put((Object)("lHAlign"),(Object)((__ref._hpos_left /*int*/ )));
RDebugUtils.currentLine=6160397;
 //BA.debugLineNum = 6160397;BA.debugLine="m1.Put(\"lVAlign\", (VPOS_CENTER))						'Message la";
_m1.Put((Object)("lVAlign"),(Object)((__ref._vpos_center /*int*/ )));
RDebugUtils.currentLine=6160399;
 //BA.debugLineNum = 6160399;BA.debugLine="m1.Put(\"dShort\", 2000)									'Message  display";
_m1.Put((Object)("dShort"),(Object)(2000));
RDebugUtils.currentLine=6160400;
 //BA.debugLineNum = 6160400;BA.debugLine="m1.Put(\"dLong\", 3000)									'Message  display t";
_m1.Put((Object)("dLong"),(Object)(3000));
RDebugUtils.currentLine=6160401;
 //BA.debugLineNum = 6160401;BA.debugLine="Return m1";
if (true) return _m1;
RDebugUtils.currentLine=6160402;
 //BA.debugLineNum = 6160402;BA.debugLine="End Sub";
return null;
}
public double  _measuremultilinetextheight(b4j.example.clxtoastmessage __ref,anywheresoftware.b4j.objects.JFX.FontWrapper _font,double _width,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="clxtoastmessage";
if (Debug.shouldDelegate(ba, "measuremultilinetextheight", false))
	 {return ((Double) Debug.delegate(ba, "measuremultilinetextheight", new Object[] {_font,_width,_text}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Private Sub MeasureMultilineTextHeight (Font As Fo";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(this));
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="Return jo.RunMethod(\"MeasureMultilineTextHeight\",";
if (true) return (double)(BA.ObjectToNumber(_jo.RunMethod("MeasureMultilineTextHeight",new Object[]{(Object)(_font.getObject()),(Object)(_text),(Object)(_width)})));
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="End Sub";
return 0;
}
public String  _settmbackground(b4j.example.clxtoastmessage __ref,Object _backgroundcolor,double _borderwidth,Object _bordercolor,double _bordercornerradius) throws Exception{
__ref = this;
RDebugUtils.currentModule="clxtoastmessage";
if (Debug.shouldDelegate(ba, "settmbackground", false))
	 {return ((String) Debug.delegate(ba, "settmbackground", new Object[] {_backgroundcolor,_borderwidth,_bordercolor,_bordercornerradius}));}
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Public Sub SetTMBackground(BackgroundColor As Obje";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="tempSettings.Put(\"pColor\",xui.PaintOrColorToColor";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pColor"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_backgroundcolor)));
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="tempSettings.Put(\"pBColor\",xui.PaintOrColorToColo";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pBColor"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_bordercolor)));
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="tempSettings.Put(\"pBWidth\", BorderWidth)";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pBWidth"),(Object)(_borderwidth));
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="tempSettings.Put(\"pBRadius\", BorderCornerRadius)";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pBRadius"),(Object)(_bordercornerradius));
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="End Sub";
return "";
}
public String  _settmdefaults(b4j.example.clxtoastmessage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clxtoastmessage";
if (Debug.shouldDelegate(ba, "settmdefaults", false))
	 {return ((String) Debug.delegate(ba, "settmdefaults", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Public Sub SetTMDefaults";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="Dim m As Map = TMList.Get(0)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._tmlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="tempSettings = DuplicateMap(m)";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._duplicatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_m);
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="End Sub";
return "";
}
public String  _settmduration(b4j.example.clxtoastmessage __ref,int _shortduration,int _longduration) throws Exception{
__ref = this;
RDebugUtils.currentModule="clxtoastmessage";
if (Debug.shouldDelegate(ba, "settmduration", false))
	 {return ((String) Debug.delegate(ba, "settmduration", new Object[] {_shortduration,_longduration}));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Public Sub SetTMDuration(ShortDuration As Int, Lon";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="tempSettings.Put(\"dShort\", ShortDuration)";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("dShort"),(Object)(_shortduration));
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="tempSettings.Put(\"dLong\", LongDuration)";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("dLong"),(Object)(_longduration));
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="End Sub";
return "";
}
public String  _settmposition(b4j.example.clxtoastmessage __ref,int _apos) throws Exception{
__ref = this;
RDebugUtils.currentModule="clxtoastmessage";
if (Debug.shouldDelegate(ba, "settmposition", false))
	 {return ((String) Debug.delegate(ba, "settmposition", new Object[] {_apos}));}
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Public Sub SetTMPosition(aPos As Int)";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="If aPos >=0 And aPos <= 2 Then tempSettings.Put(\"";
if (_apos>=0 && _apos<=2) { 
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pPos"),(Object)(_apos));};
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="End Sub";
return "";
}
public String  _settmtextprop(b4j.example.clxtoastmessage __ref,double _asize,int _halignment,int _valignment,Object _acolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="clxtoastmessage";
if (Debug.shouldDelegate(ba, "settmtextprop", false))
	 {return ((String) Debug.delegate(ba, "settmtextprop", new Object[] {_asize,_halignment,_valignment,_acolor}));}
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Public Sub SetTMTextProp(aSize As Double, HAlignme";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="tempSettings.Put(\"lTSize\", aSize)";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lTSize"),(Object)(_asize));
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="If HAlignment >=0 And HAlignment <=2 Then tempSet";
if (_halignment>=0 && _halignment<=2) { 
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lHAlign"),(Object)((_halignment)));};
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="If VAlignment >=0 And VAlignment <=2 Then tempSet";
if (_valignment>=0 && _valignment<=2) { 
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lVAlign"),(Object)((_valignment)));};
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="tempSettings.Put(\"lTColor\", (xui.PaintOrColorToCo";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lTColor"),(Object)((__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_acolor))));
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Private Sub ShowMessage";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Dim m As Map = TMList.Get(1)										'item #1 =";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._tmlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (1))));
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="mPanel.SetColorAndBorder(xui.PaintOrColorToColor(";
__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_m.Get((Object)("pColor"))),(double)(BA.ObjectToNumber(_m.Get((Object)("pBWidth")))),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_m.Get((Object)("pBColor"))),(double)(BA.ObjectToNumber(_m.Get((Object)("pBRadius")))));
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="mLbl.TextSize = m.Get(\"lTSize\")";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextSize((double)(BA.ObjectToNumber(_m.Get((Object)("lTSize")))));
RDebugUtils.currentLine=6684677;
 //BA.debugLineNum = 6684677;BA.debugLine="Dim hpos,vpos As String";
_hpos = "";
_vpos = "";
RDebugUtils.currentLine=6684678;
 //BA.debugLineNum = 6684678;BA.debugLine="hpos = arHpos(m.Get(\"lHAlign\"))";
_hpos = __ref._arhpos /*String[]*/ [(int)(BA.ObjectToNumber(_m.Get((Object)("lHAlign"))))];
RDebugUtils.currentLine=6684679;
 //BA.debugLineNum = 6684679;BA.debugLine="vpos = arVpos(m.Get(\"lVAlign\"))";
_vpos = __ref._arvpos /*String[]*/ [(int)(BA.ObjectToNumber(_m.Get((Object)("lVAlign"))))];
RDebugUtils.currentLine=6684680;
 //BA.debugLineNum = 6684680;BA.debugLine="mLbl.SetTextAlignment(vpos, hpos)";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment(_vpos,_hpos);
RDebugUtils.currentLine=6684681;
 //BA.debugLineNum = 6684681;BA.debugLine="mLbl.TextColor = xui.PaintOrColorToColor(m.Get(\"l";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_m.Get((Object)("lTColor"))));
RDebugUtils.currentLine=6684682;
 //BA.debugLineNum = 6684682;BA.debugLine="mLbl.Text = m.Get(\"lText\") 'Message";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(_m.Get((Object)("lText"))));
RDebugUtils.currentLine=6684683;
 //BA.debugLineNum = 6684683;BA.debugLine="mPanelPos = m.Get(\"pPos\")";
__ref._mpanelpos /*int*/  = (int)(BA.ObjectToNumber(_m.Get((Object)("pPos"))));
RDebugUtils.currentLine=6684684;
 //BA.debugLineNum = 6684684;BA.debugLine="Private LDuration, SDuration As Int";
_lduration = 0;
_sduration = 0;
RDebugUtils.currentLine=6684685;
 //BA.debugLineNum = 6684685;BA.debugLine="SDuration = m.get(\"dShort\")";
_sduration = (int)(BA.ObjectToNumber(_m.Get((Object)("dShort"))));
RDebugUtils.currentLine=6684686;
 //BA.debugLineNum = 6684686;BA.debugLine="LDuration = m.get(\"dLong\")";
_lduration = (int)(BA.ObjectToNumber(_m.Get((Object)("dLong"))));
RDebugUtils.currentLine=6684689;
 //BA.debugLineNum = 6684689;BA.debugLine="Dim onerow As Double = MeasureMultilineTextHeight";
_onerow = __ref._measuremultilinetextheight /*double*/ (null,__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .DefaultFont(__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextSize()),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),"a");
RDebugUtils.currentLine=6684690;
 //BA.debugLineNum = 6684690;BA.debugLine="mLbl.Height = MeasureMultilineTextHeight(fx.Defau";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._measuremultilinetextheight /*double*/ (null,__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .DefaultFont(__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextSize()),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText())+_onerow);
RDebugUtils.currentLine=6684701;
 //BA.debugLineNum = 6684701;BA.debugLine="mPanel.Height = mLbl.Height + 2dip 'accounts for";
__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=6684702;
 //BA.debugLineNum = 6684702;BA.debugLine="Select mPanelPos";
switch (BA.switchObjectToInt(__ref._mpanelpos /*int*/ ,__ref._tmpos_top /*int*/ ,__ref._tmpos_center /*int*/ ,__ref._tmpos_bottom /*int*/ )) {
case 0: {
RDebugUtils.currentLine=6684704;
 //BA.debugLineNum = 6684704;BA.debugLine="mBase.AddView(mPanel, 5dip, 5dip, mBase.Width-1";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (10)),__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 break; }
case 1: {
RDebugUtils.currentLine=6684706;
 //BA.debugLineNum = 6684706;BA.debugLine="mBase.AddView(mPanel, 5dip,(mBase.Height-mPanel";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (5)),(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())/(double)2,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (10)),__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 break; }
case 2: {
RDebugUtils.currentLine=6684708;
 //BA.debugLineNum = 6684708;BA.debugLine="mBase.AddView(mPanel, 5dip, mBase.Height-mPanel";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (5)),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (5)),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (10)),__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 break; }
}
;
RDebugUtils.currentLine=6684710;
 //BA.debugLineNum = 6684710;BA.debugLine="fading = tempSettings.get(\"tmfade\")";
__ref._fading /*boolean*/  = BA.ObjectToBoolean(__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("tmfade")));
RDebugUtils.currentLine=6684711;
 //BA.debugLineNum = 6684711;BA.debugLine="If fading Then	mPanel.SetVisibleAnimated(400, Tru";
if (__ref._fading /*boolean*/ ) { 
__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(ba,(int) (400),__c.True);}
else {
__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(ba,(int) (0),__c.True);};
RDebugUtils.currentLine=6684712;
 //BA.debugLineNum = 6684712;BA.debugLine="displaying = True";
__ref._displaying /*boolean*/  = __c.True;
RDebugUtils.currentLine=6684713;
 //BA.debugLineNum = 6684713;BA.debugLine="If tempSettings.get(\"tmdur\") Then timer1.Interval";
if (BA.ObjectToBoolean(__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("tmdur")))) { 
__ref._timer1 /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (_lduration));}
else {
__ref._timer1 /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (_sduration));};
RDebugUtils.currentLine=6684714;
 //BA.debugLineNum = 6684714;BA.debugLine="timer1.Enabled = True";
__ref._timer1 /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=6684715;
 //BA.debugLineNum = 6684715;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="If fading Then";
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
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="mPanel.SetVisibleAnimated(400, False)";
__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(ba,(int) (400),parent.__c.False);
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="Sleep(500)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clxtoastmessage", "timer1_tick"),(int) (500));
this.state = 13;
return;
case 13:
//C
this.state = 4;
;
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="fading = False";
__ref._fading /*boolean*/  = parent.__c.False;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=6750214;
 //BA.debugLineNum = 6750214;BA.debugLine="timer1.Enabled = False";
__ref._timer1 /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=6750215;
 //BA.debugLineNum = 6750215;BA.debugLine="mPanel.RemoveViewFromParent";
__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=6750216;
 //BA.debugLineNum = 6750216;BA.debugLine="mBase.Tag = Null";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(parent.__c.Null);
RDebugUtils.currentLine=6750217;
 //BA.debugLineNum = 6750217;BA.debugLine="TMList.RemoveAt(1)";
__ref._tmlist /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (1));
RDebugUtils.currentLine=6750218;
 //BA.debugLineNum = 6750218;BA.debugLine="If TMList.Size > 1 Then ShowMessage Else displayi";
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
RDebugUtils.currentLine=6750219;
 //BA.debugLineNum = 6750219;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Public Sub TMClearAndShow(Message As String, LongD";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="timer1.Enabled = False";
__ref._timer1 /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="displaying = False";
__ref._displaying /*boolean*/  = __c.False;
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="TMList.Clear";
__ref._tmlist /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="Dim m1 As Map = DuplicateMap(MakeDefaults)";
_m1 = new anywheresoftware.b4a.objects.collections.Map();
_m1 = __ref._duplicatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._makedefaults /*anywheresoftware.b4a.objects.collections.Map*/ (null));
RDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="TMList.Add(m1)														'item #0 = defaults";
__ref._tmlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_m1.getObject()));
RDebugUtils.currentLine=6619142;
 //BA.debugLineNum = 6619142;BA.debugLine="For i = 0 To m1.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_m1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=6619143;
 //BA.debugLineNum = 6619143;BA.debugLine="If Not(tempSettings.ContainsKey(m1.GetKeyAt(i)))";
if (__c.Not(__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey(_m1.GetKeyAt(_i)))) { 
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put(_m1.GetKeyAt(_i),_m1.GetValueAt(_i));};
 }
};
RDebugUtils.currentLine=6619147;
 //BA.debugLineNum = 6619147;BA.debugLine="tempSettings.Put(\"lText\", Message)";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lText"),(Object)(_message));
RDebugUtils.currentLine=6619148;
 //BA.debugLineNum = 6619148;BA.debugLine="tempSettings.Put(\"tmfade\", FadeEffect)";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("tmfade"),(Object)(_fadeeffect));
RDebugUtils.currentLine=6619149;
 //BA.debugLineNum = 6619149;BA.debugLine="tempSettings.Put(\"tmdur\", LongDuration)";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("tmdur"),(Object)(_longduration));
RDebugUtils.currentLine=6619150;
 //BA.debugLineNum = 6619150;BA.debugLine="TMList.Add(DuplicateMap(tempSettings))								'it";
__ref._tmlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._duplicatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ ).getObject()));
RDebugUtils.currentLine=6619151;
 //BA.debugLineNum = 6619151;BA.debugLine="mPanel.RemoveViewFromParent";
__ref._mpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=6619152;
 //BA.debugLineNum = 6619152;BA.debugLine="mBase.Tag = Null";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(__c.Null);
RDebugUtils.currentLine=6619153;
 //BA.debugLineNum = 6619153;BA.debugLine="ShowMessage";
__ref._showmessage /*String*/ (null);
RDebugUtils.currentLine=6619154;
 //BA.debugLineNum = 6619154;BA.debugLine="End Sub";
return "";
}
public String  _tmshow(b4j.example.clxtoastmessage __ref,String _message,boolean _longduration,boolean _fadeeffect) throws Exception{
__ref = this;
RDebugUtils.currentModule="clxtoastmessage";
if (Debug.shouldDelegate(ba, "tmshow", false))
	 {return ((String) Debug.delegate(ba, "tmshow", new Object[] {_message,_longduration,_fadeeffect}));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Public Sub TMShow (Message As String, LongDuration";
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="tempSettings.Put(\"lText\", Message)";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lText"),(Object)(_message));
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="tempSettings.Put(\"tmfade\", FadeEffect)";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("tmfade"),(Object)(_fadeeffect));
RDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="tempSettings.Put(\"tmdur\", LongDuration)";
__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("tmdur"),(Object)(_longduration));
RDebugUtils.currentLine=6553605;
 //BA.debugLineNum = 6553605;BA.debugLine="TMList.Add(DuplicateMap(tempSettings))";
__ref._tmlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._duplicatemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._tempsettings /*anywheresoftware.b4a.objects.collections.Map*/ ).getObject()));
RDebugUtils.currentLine=6553606;
 //BA.debugLineNum = 6553606;BA.debugLine="If displaying Then Return";
if (__ref._displaying /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=6553607;
 //BA.debugLineNum = 6553607;BA.debugLine="ShowMessage";
__ref._showmessage /*String*/ (null);
RDebugUtils.currentLine=6553608;
 //BA.debugLineNum = 6553608;BA.debugLine="End Sub";
return "";
}
public static double MeasureMultilineTextHeight(Font f, String text, double width) throws Exception {
  Method m = Class.forName("com.sun.javafx.scene.control.skin.Utils").getDeclaredMethod("computeTextHeight",
  Font.class, String.class, double.class, TextBoundsType.class);
  m.setAccessible(true);
  return (Double)m.invoke(null, f, text, width, TextBoundsType.LOGICAL_VERTICAL_CENTER);
  }
}