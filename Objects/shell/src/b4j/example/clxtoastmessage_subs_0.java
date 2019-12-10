package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clxtoastmessage_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private fx As JFX";
clxtoastmessage._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",clxtoastmessage._fx);
 //BA.debugLineNum = 13;BA.debugLine="Private xui As XUI";
clxtoastmessage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",clxtoastmessage._xui);
 //BA.debugLineNum = 14;BA.debugLine="Private mBase As B4XView				'base panel from call";
clxtoastmessage._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",clxtoastmessage._mbase);
 //BA.debugLineNum = 15;BA.debugLine="Private mPanel As B4XView				'panel holding the m";
clxtoastmessage._mpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mpanel",clxtoastmessage._mpanel);
 //BA.debugLineNum = 16;BA.debugLine="Private mLbl As B4XView					'message label";
clxtoastmessage._mlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mlbl",clxtoastmessage._mlbl);
 //BA.debugLineNum = 17;BA.debugLine="Private mPanelPos As Int				'message position rel";
clxtoastmessage._mpanelpos = RemoteObject.createImmutable(0);__ref.setField("_mpanelpos",clxtoastmessage._mpanelpos);
 //BA.debugLineNum = 18;BA.debugLine="Private TMList As List					'list of toast message";
clxtoastmessage._tmlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_tmlist",clxtoastmessage._tmlist);
 //BA.debugLineNum = 19;BA.debugLine="Private tempSettings As Map				'temporary setting";
clxtoastmessage._tempsettings = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_tempsettings",clxtoastmessage._tempsettings);
 //BA.debugLineNum = 20;BA.debugLine="Private displaying As Boolean			'True = a TM is c";
clxtoastmessage._displaying = RemoteObject.createImmutable(false);__ref.setField("_displaying",clxtoastmessage._displaying);
 //BA.debugLineNum = 21;BA.debugLine="Private fading As Boolean				'True = fade effect";
clxtoastmessage._fading = RemoteObject.createImmutable(false);__ref.setField("_fading",clxtoastmessage._fading);
 //BA.debugLineNum = 22;BA.debugLine="Private timer1 As Timer";
clxtoastmessage._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_timer1",clxtoastmessage._timer1);
 //BA.debugLineNum = 23;BA.debugLine="Public CONST TMPOS_TOP As Int = 0		'constant to s";
clxtoastmessage._tmpos_top = BA.numberCast(int.class, 0);__ref.setField("_tmpos_top",clxtoastmessage._tmpos_top);
 //BA.debugLineNum = 24;BA.debugLine="Public CONST TMPOS_CENTER As Int = 1	'			\"			\"		\"";
clxtoastmessage._tmpos_center = BA.numberCast(int.class, 1);__ref.setField("_tmpos_center",clxtoastmessage._tmpos_center);
 //BA.debugLineNum = 25;BA.debugLine="Public CONST TMPOS_BOTTOM As Int = 2	'			\"			\"		\"";
clxtoastmessage._tmpos_bottom = BA.numberCast(int.class, 2);__ref.setField("_tmpos_bottom",clxtoastmessage._tmpos_bottom);
 //BA.debugLineNum = 26;BA.debugLine="Public CONST VPOS_TOP As Int = 0		'constant to ve";
clxtoastmessage._vpos_top = BA.numberCast(int.class, 0);__ref.setField("_vpos_top",clxtoastmessage._vpos_top);
 //BA.debugLineNum = 27;BA.debugLine="Public CONST VPOS_CENTER As Int = 1		'			\"			\"		\"";
clxtoastmessage._vpos_center = BA.numberCast(int.class, 1);__ref.setField("_vpos_center",clxtoastmessage._vpos_center);
 //BA.debugLineNum = 28;BA.debugLine="Public CONST VPOS_BOTTOM As Int = 2		'			\"			\"		\"";
clxtoastmessage._vpos_bottom = BA.numberCast(int.class, 2);__ref.setField("_vpos_bottom",clxtoastmessage._vpos_bottom);
 //BA.debugLineNum = 29;BA.debugLine="Public CONST HPOS_LEFT As Int = 0		'constant to h";
clxtoastmessage._hpos_left = BA.numberCast(int.class, 0);__ref.setField("_hpos_left",clxtoastmessage._hpos_left);
 //BA.debugLineNum = 30;BA.debugLine="Public CONST HPOS_CENTER As Int = 1		'			\"			\"		\"";
clxtoastmessage._hpos_center = BA.numberCast(int.class, 1);__ref.setField("_hpos_center",clxtoastmessage._hpos_center);
 //BA.debugLineNum = 31;BA.debugLine="Public CONST HPOS_RIGHT As Int = 2		'			\"			\"		\"";
clxtoastmessage._hpos_right = BA.numberCast(int.class, 2);__ref.setField("_hpos_right",clxtoastmessage._hpos_right);
 //BA.debugLineNum = 32;BA.debugLine="Private CONST arHpos(3) As String = Array As Stri";
clxtoastmessage._arhpos = RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("LEFT"),BA.ObjectToString("CENTER"),RemoteObject.createImmutable("RIGHT")});__ref.setField("_arhpos",clxtoastmessage._arhpos);
 //BA.debugLineNum = 33;BA.debugLine="Private CONST arVpos(3) As String = Array As Stri";
clxtoastmessage._arvpos = RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("TOP"),BA.ObjectToString("CENTER"),RemoteObject.createImmutable("BOTTOM")});__ref.setField("_arvpos",clxtoastmessage._arvpos);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _duplicatemap(RemoteObject __ref,RemoteObject _source) throws Exception{
try {
		Debug.PushSubsStack("DuplicateMap (clxtoastmessage) ","clxtoastmessage",5,__ref.getField(false, "ba"),__ref,236);
if (RapidSub.canDelegate("duplicatemap")) { return __ref.runUserSub(false, "clxtoastmessage","duplicatemap", __ref, _source);}
RemoteObject _m1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
Debug.locals.put("Source", _source);
 BA.debugLineNum = 236;BA.debugLine="Private Sub DuplicateMap(Source As Map) As Map";
Debug.ShouldStop(2048);
 BA.debugLineNum = 237;BA.debugLine="Dim m1 As Map";
Debug.ShouldStop(4096);
_m1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m1", _m1);
 BA.debugLineNum = 238;BA.debugLine="m1.Initialize";
Debug.ShouldStop(8192);
_m1.runVoidMethod ("Initialize");
 BA.debugLineNum = 239;BA.debugLine="For i = 0 To Source.Size - 1";
Debug.ShouldStop(16384);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_source.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 240;BA.debugLine="m1.Put(Source.GetKeyAt(i), Source.GetValueAt(i))";
Debug.ShouldStop(32768);
_m1.runVoidMethod ("Put",(Object)(_source.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))),(Object)(_source.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 242;BA.debugLine="Return m1";
Debug.ShouldStop(131072);
if (true) return _m1;
 BA.debugLineNum = 243;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _base) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clxtoastmessage) ","clxtoastmessage",5,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "clxtoastmessage","initialize", __ref, _ba, _base);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _l1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
Debug.locals.put("ba", _ba);
Debug.locals.put("Base", _base);
 BA.debugLineNum = 38;BA.debugLine="Public Sub Initialize(Base As B4XView)";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="mBase = Base";
Debug.ShouldStop(64);
__ref.setField ("_mbase" /*RemoteObject*/ ,_base);
 BA.debugLineNum = 40;BA.debugLine="mBase.Tag = Me";
Debug.ShouldStop(128);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 41;BA.debugLine="Dim l1 As Label";
Debug.ShouldStop(256);
_l1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("l1", _l1);
 BA.debugLineNum = 42;BA.debugLine="l1.Initialize(\"\")";
Debug.ShouldStop(512);
_l1.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 46;BA.debugLine="l1.WrapText = True";
Debug.ShouldStop(8192);
_l1.runMethod(true,"setWrapText",clxtoastmessage.__c.getField(true,"True"));
 BA.debugLineNum = 50;BA.debugLine="mLbl = l1";
Debug.ShouldStop(131072);
__ref.getField(false,"_mlbl" /*RemoteObject*/ ).setObject (_l1.getObject());
 BA.debugLineNum = 51;BA.debugLine="mPanel = xui.CreatePanel(\"\")";
Debug.ShouldStop(262144);
__ref.setField ("_mpanel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 52;BA.debugLine="mPanel.Visible = True";
Debug.ShouldStop(524288);
__ref.getField(false,"_mpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",clxtoastmessage.__c.getField(true,"True"));
 BA.debugLineNum = 53;BA.debugLine="mPanel.AddView(mLbl,5dip,0dip,mBase.Width-20dip,1";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mpanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mlbl" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, clxtoastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(BA.numberCast(double.class, clxtoastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),clxtoastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0)),(Object)(BA.numberCast(double.class, clxtoastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))))));
 BA.debugLineNum = 54;BA.debugLine="tempSettings = DuplicateMap(MakeDefaults)				'cre";
Debug.ShouldStop(2097152);
__ref.setField ("_tempsettings" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.clxtoastmessage.class, "_duplicatemap" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.clxtoastmessage.class, "_makedefaults" /*RemoteObject*/ ))));
 BA.debugLineNum = 55;BA.debugLine="TMList.initialize";
Debug.ShouldStop(4194304);
__ref.getField(false,"_tmlist" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 56;BA.debugLine="TMList.Add(DuplicateMap(tempSettings))					'save";
Debug.ShouldStop(8388608);
__ref.getField(false,"_tmlist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.clxtoastmessage.class, "_duplicatemap" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_tempsettings" /*RemoteObject*/ ))).getObject())));
 BA.debugLineNum = 57;BA.debugLine="displaying = False";
Debug.ShouldStop(16777216);
__ref.setField ("_displaying" /*RemoteObject*/ ,clxtoastmessage.__c.getField(true,"False"));
 BA.debugLineNum = 58;BA.debugLine="fading = False";
Debug.ShouldStop(33554432);
__ref.setField ("_fading" /*RemoteObject*/ ,clxtoastmessage.__c.getField(true,"False"));
 BA.debugLineNum = 59;BA.debugLine="timer1.Initialize(\"timer1\", 2000)						'timer def";
Debug.ShouldStop(67108864);
__ref.getField(false,"_timer1" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("timer1")),(Object)(BA.numberCast(long.class, 2000)));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makedefaults(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MakeDefaults (clxtoastmessage) ","clxtoastmessage",5,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("makedefaults")) { return __ref.runUserSub(false, "clxtoastmessage","makedefaults", __ref);}
RemoteObject _m1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 63;BA.debugLine="Private Sub MakeDefaults As Map";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="Dim m1 As Map";
Debug.ShouldStop(-2147483648);
_m1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m1", _m1);
 BA.debugLineNum = 65;BA.debugLine="m1.Initialize";
Debug.ShouldStop(1);
_m1.runVoidMethod ("Initialize");
 BA.debugLineNum = 67;BA.debugLine="m1.Put(\"pColor\",xui.Color_DarkGray)						'Backgro";
Debug.ShouldStop(4);
_m1.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pColor"))),(Object)((__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_DarkGray"))));
 BA.debugLineNum = 68;BA.debugLine="m1.Put(\"pBColor\",xui.Color_DarkGray)					'Backgro";
Debug.ShouldStop(8);
_m1.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pBColor"))),(Object)((__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_DarkGray"))));
 BA.debugLineNum = 69;BA.debugLine="m1.Put(\"pBWidth\", 0dip)									'Background borde";
Debug.ShouldStop(16);
_m1.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pBWidth"))),(Object)((clxtoastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 70;BA.debugLine="m1.Put(\"pBRadius\", 0dip)								'Background borde";
Debug.ShouldStop(32);
_m1.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pBRadius"))),(Object)((clxtoastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 71;BA.debugLine="m1.Put(\"pPos\", TMPOS_BOTTOM)";
Debug.ShouldStop(64);
_m1.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pPos"))),(Object)((__ref.getField(true,"_tmpos_bottom" /*RemoteObject*/ ))));
 BA.debugLineNum = 73;BA.debugLine="m1.Put(\"lTSize\", 15)									'Message label text";
Debug.ShouldStop(256);
_m1.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lTSize"))),(Object)(RemoteObject.createImmutable((15))));
 BA.debugLineNum = 74;BA.debugLine="m1.Put(\"lTColor\", (xui.Color_White))					'Message";
Debug.ShouldStop(512);
_m1.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lTColor"))),(Object)(((__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White")))));
 BA.debugLineNum = 75;BA.debugLine="m1.Put(\"lHAlign\", (HPOS_LEFT))							'Message lab";
Debug.ShouldStop(1024);
_m1.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lHAlign"))),(Object)(((__ref.getField(true,"_hpos_left" /*RemoteObject*/ )))));
 BA.debugLineNum = 76;BA.debugLine="m1.Put(\"lVAlign\", (VPOS_CENTER))						'Message la";
Debug.ShouldStop(2048);
_m1.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lVAlign"))),(Object)(((__ref.getField(true,"_vpos_center" /*RemoteObject*/ )))));
 BA.debugLineNum = 78;BA.debugLine="m1.Put(\"dShort\", 2000)									'Message  display";
Debug.ShouldStop(8192);
_m1.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dShort"))),(Object)(RemoteObject.createImmutable((2000))));
 BA.debugLineNum = 79;BA.debugLine="m1.Put(\"dLong\", 3000)									'Message  display t";
Debug.ShouldStop(16384);
_m1.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dLong"))),(Object)(RemoteObject.createImmutable((3000))));
 BA.debugLineNum = 80;BA.debugLine="Return m1";
Debug.ShouldStop(32768);
if (true) return _m1;
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _measuremultilinetextheight(RemoteObject __ref,RemoteObject _font,RemoteObject _width,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("MeasureMultilineTextHeight (clxtoastmessage) ","clxtoastmessage",5,__ref.getField(false, "ba"),__ref,216);
if (RapidSub.canDelegate("measuremultilinetextheight")) { return __ref.runUserSub(false, "clxtoastmessage","measuremultilinetextheight", __ref, _font, _width, _text);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Font", _font);
Debug.locals.put("Width", _width);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 216;BA.debugLine="Private Sub MeasureMultilineTextHeight (Font As Fo";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 217;BA.debugLine="Dim jo As JavaObject = Me";
Debug.ShouldStop(16777216);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(__ref);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 218;BA.debugLine="Return jo.RunMethod(\"MeasureMultilineTextHeight\",";
Debug.ShouldStop(33554432);
if (true) return BA.numberCast(double.class, _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("MeasureMultilineTextHeight")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_font.getObject()),(_text),(_width)}))));
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settmbackground(RemoteObject __ref,RemoteObject _backgroundcolor,RemoteObject _borderwidth,RemoteObject _bordercolor,RemoteObject _bordercornerradius) throws Exception{
try {
		Debug.PushSubsStack("SetTMBackground (clxtoastmessage) ","clxtoastmessage",5,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("settmbackground")) { return __ref.runUserSub(false, "clxtoastmessage","settmbackground", __ref, _backgroundcolor, _borderwidth, _bordercolor, _bordercornerradius);}
Debug.locals.put("BackgroundColor", _backgroundcolor);
Debug.locals.put("BorderWidth", _borderwidth);
Debug.locals.put("BorderColor", _bordercolor);
Debug.locals.put("BorderCornerRadius", _bordercornerradius);
 BA.debugLineNum = 99;BA.debugLine="Public Sub SetTMBackground(BackgroundColor As Obje";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="tempSettings.Put(\"pColor\",xui.PaintOrColorToColor";
Debug.ShouldStop(8);
__ref.getField(false,"_tempsettings" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pColor"))),(Object)((__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_backgroundcolor)))));
 BA.debugLineNum = 101;BA.debugLine="tempSettings.Put(\"pBColor\",xui.PaintOrColorToColo";
Debug.ShouldStop(16);
__ref.getField(false,"_tempsettings" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pBColor"))),(Object)((__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_bordercolor)))));
 BA.debugLineNum = 102;BA.debugLine="tempSettings.Put(\"pBWidth\", BorderWidth)";
Debug.ShouldStop(32);
__ref.getField(false,"_tempsettings" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pBWidth"))),(Object)((_borderwidth)));
 BA.debugLineNum = 103;BA.debugLine="tempSettings.Put(\"pBRadius\", BorderCornerRadius)";
Debug.ShouldStop(64);
__ref.getField(false,"_tempsettings" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pBRadius"))),(Object)((_bordercornerradius)));
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settmdefaults(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetTMDefaults (clxtoastmessage) ","clxtoastmessage",5,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("settmdefaults")) { return __ref.runUserSub(false, "clxtoastmessage","settmdefaults", __ref);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 87;BA.debugLine="Public Sub SetTMDefaults";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="Dim m As Map = TMList.Get(0)";
Debug.ShouldStop(8388608);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m.setObject(__ref.getField(false,"_tmlist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("m", _m);
 BA.debugLineNum = 89;BA.debugLine="tempSettings = DuplicateMap(m)";
Debug.ShouldStop(16777216);
__ref.setField ("_tempsettings" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.clxtoastmessage.class, "_duplicatemap" /*RemoteObject*/ ,(Object)(_m)));
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settmduration(RemoteObject __ref,RemoteObject _shortduration,RemoteObject _longduration) throws Exception{
try {
		Debug.PushSubsStack("SetTMDuration (clxtoastmessage) ","clxtoastmessage",5,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("settmduration")) { return __ref.runUserSub(false, "clxtoastmessage","settmduration", __ref, _shortduration, _longduration);}
Debug.locals.put("ShortDuration", _shortduration);
Debug.locals.put("LongDuration", _longduration);
 BA.debugLineNum = 93;BA.debugLine="Public Sub SetTMDuration(ShortDuration As Int, Lon";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="tempSettings.Put(\"dShort\", ShortDuration)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_tempsettings" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dShort"))),(Object)((_shortduration)));
 BA.debugLineNum = 95;BA.debugLine="tempSettings.Put(\"dLong\", LongDuration)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_tempsettings" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dLong"))),(Object)((_longduration)));
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settmposition(RemoteObject __ref,RemoteObject _apos) throws Exception{
try {
		Debug.PushSubsStack("SetTMPosition (clxtoastmessage) ","clxtoastmessage",5,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("settmposition")) { return __ref.runUserSub(false, "clxtoastmessage","settmposition", __ref, _apos);}
Debug.locals.put("aPos", _apos);
 BA.debugLineNum = 117;BA.debugLine="Public Sub SetTMPosition(aPos As Int)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="If aPos >=0 And aPos <= 2 Then tempSettings.Put(\"";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("g",_apos,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("k",_apos,BA.numberCast(double.class, 2))) { 
__ref.getField(false,"_tempsettings" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pPos"))),(Object)((_apos)));};
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settmtextprop(RemoteObject __ref,RemoteObject _asize,RemoteObject _halignment,RemoteObject _valignment,RemoteObject _acolor) throws Exception{
try {
		Debug.PushSubsStack("SetTMTextProp (clxtoastmessage) ","clxtoastmessage",5,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("settmtextprop")) { return __ref.runUserSub(false, "clxtoastmessage","settmtextprop", __ref, _asize, _halignment, _valignment, _acolor);}
Debug.locals.put("aSize", _asize);
Debug.locals.put("HAlignment", _halignment);
Debug.locals.put("VAlignment", _valignment);
Debug.locals.put("aColor", _acolor);
 BA.debugLineNum = 109;BA.debugLine="Public Sub SetTMTextProp(aSize As Double, HAlignme";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="tempSettings.Put(\"lTSize\", aSize)";
Debug.ShouldStop(8192);
__ref.getField(false,"_tempsettings" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lTSize"))),(Object)((_asize)));
 BA.debugLineNum = 111;BA.debugLine="If HAlignment >=0 And HAlignment <=2 Then tempSet";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("g",_halignment,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("k",_halignment,BA.numberCast(double.class, 2))) { 
__ref.getField(false,"_tempsettings" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lHAlign"))),(Object)(((_halignment))));};
 BA.debugLineNum = 112;BA.debugLine="If VAlignment >=0 And VAlignment <=2 Then tempSet";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("g",_valignment,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("k",_valignment,BA.numberCast(double.class, 2))) { 
__ref.getField(false,"_tempsettings" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lVAlign"))),(Object)(((_valignment))));};
 BA.debugLineNum = 113;BA.debugLine="tempSettings.Put(\"lTColor\", (xui.PaintOrColorToCo";
Debug.ShouldStop(65536);
__ref.getField(false,"_tempsettings" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lTColor"))),(Object)(((__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_acolor))))));
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showmessage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ShowMessage (clxtoastmessage) ","clxtoastmessage",5,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("showmessage")) { return __ref.runUserSub(false, "clxtoastmessage","showmessage", __ref);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _hpos = RemoteObject.createImmutable("");
RemoteObject _vpos = RemoteObject.createImmutable("");
RemoteObject _lduration = RemoteObject.createImmutable(0);
RemoteObject _sduration = RemoteObject.createImmutable(0);
RemoteObject _onerow = RemoteObject.createImmutable(0);
 BA.debugLineNum = 156;BA.debugLine="Private Sub ShowMessage";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="Dim m As Map = TMList.Get(1)										'item #1 =";
Debug.ShouldStop(268435456);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m.setObject(__ref.getField(false,"_tmlist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("m", _m);
 BA.debugLineNum = 159;BA.debugLine="mPanel.SetColorAndBorder(xui.PaintOrColorToColor(";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mpanel" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pColor"))))))),(Object)(BA.numberCast(double.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pBWidth")))))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pBColor"))))))),(Object)(BA.numberCast(double.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pBRadius")))))));
 BA.debugLineNum = 160;BA.debugLine="mLbl.TextSize = m.Get(\"lTSize\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mlbl" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(double.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lTSize"))))));
 BA.debugLineNum = 161;BA.debugLine="Dim hpos,vpos As String";
Debug.ShouldStop(1);
_hpos = RemoteObject.createImmutable("");Debug.locals.put("hpos", _hpos);
_vpos = RemoteObject.createImmutable("");Debug.locals.put("vpos", _vpos);
 BA.debugLineNum = 162;BA.debugLine="hpos = arHpos(m.Get(\"lHAlign\"))";
Debug.ShouldStop(2);
_hpos = __ref.getField(false,"_arhpos" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lHAlign"))))));Debug.locals.put("hpos", _hpos);
 BA.debugLineNum = 163;BA.debugLine="vpos = arVpos(m.Get(\"lVAlign\"))";
Debug.ShouldStop(4);
_vpos = __ref.getField(false,"_arvpos" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lVAlign"))))));Debug.locals.put("vpos", _vpos);
 BA.debugLineNum = 164;BA.debugLine="mLbl.SetTextAlignment(vpos, hpos)";
Debug.ShouldStop(8);
__ref.getField(false,"_mlbl" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(_vpos),(Object)(_hpos));
 BA.debugLineNum = 165;BA.debugLine="mLbl.TextColor = xui.PaintOrColorToColor(m.Get(\"l";
Debug.ShouldStop(16);
__ref.getField(false,"_mlbl" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lTColor")))))));
 BA.debugLineNum = 166;BA.debugLine="mLbl.Text = m.Get(\"lText\") 'Message";
Debug.ShouldStop(32);
__ref.getField(false,"_mlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lText"))))));
 BA.debugLineNum = 167;BA.debugLine="mPanelPos = m.Get(\"pPos\")";
Debug.ShouldStop(64);
__ref.setField ("_mpanelpos" /*RemoteObject*/ ,BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pPos"))))));
 BA.debugLineNum = 168;BA.debugLine="Private LDuration, SDuration As Int";
Debug.ShouldStop(128);
_lduration = RemoteObject.createImmutable(0);Debug.locals.put("LDuration", _lduration);
_sduration = RemoteObject.createImmutable(0);Debug.locals.put("SDuration", _sduration);
 BA.debugLineNum = 169;BA.debugLine="SDuration = m.get(\"dShort\")";
Debug.ShouldStop(256);
_sduration = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("dShort")))));Debug.locals.put("SDuration", _sduration);
 BA.debugLineNum = 170;BA.debugLine="LDuration = m.get(\"dLong\")";
Debug.ShouldStop(512);
_lduration = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("dLong")))));Debug.locals.put("LDuration", _lduration);
 BA.debugLineNum = 173;BA.debugLine="Dim onerow As Double = MeasureMultilineTextHeight";
Debug.ShouldStop(4096);
_onerow = __ref.runClassMethod (b4j.example.clxtoastmessage.class, "_measuremultilinetextheight" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"DefaultFont",(Object)(__ref.getField(false,"_mlbl" /*RemoteObject*/ ).runMethod(true,"getTextSize")))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(RemoteObject.createImmutable("a")));Debug.locals.put("onerow", _onerow);Debug.locals.put("onerow", _onerow);
 BA.debugLineNum = 174;BA.debugLine="mLbl.Height = MeasureMultilineTextHeight(fx.Defau";
Debug.ShouldStop(8192);
__ref.getField(false,"_mlbl" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (b4j.example.clxtoastmessage.class, "_measuremultilinetextheight" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"DefaultFont",(Object)(__ref.getField(false,"_mlbl" /*RemoteObject*/ ).runMethod(true,"getTextSize")))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mlbl" /*RemoteObject*/ ).runMethod(true,"getText"))),_onerow}, "+",1, 0));
 BA.debugLineNum = 185;BA.debugLine="mPanel.Height = mLbl.Height + 2dip 'accounts for";
Debug.ShouldStop(16777216);
__ref.getField(false,"_mpanel" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mlbl" /*RemoteObject*/ ).runMethod(true,"getHeight"),clxtoastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 0));
 BA.debugLineNum = 186;BA.debugLine="Select mPanelPos";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(__ref.getField(true,"_mpanelpos" /*RemoteObject*/ ),__ref.getField(true,"_tmpos_top" /*RemoteObject*/ ),__ref.getField(true,"_tmpos_center" /*RemoteObject*/ ),__ref.getField(true,"_tmpos_bottom" /*RemoteObject*/ ))) {
case 0: {
 BA.debugLineNum = 188;BA.debugLine="mBase.AddView(mPanel, 5dip, 5dip, mBase.Width-1";
Debug.ShouldStop(134217728);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, clxtoastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(BA.numberCast(double.class, clxtoastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),clxtoastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 0)),(Object)(__ref.getField(false,"_mpanel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 break; }
case 1: {
 BA.debugLineNum = 190;BA.debugLine="mBase.AddView(mPanel, 5dip,(mBase.Height-mPanel";
Debug.ShouldStop(536870912);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, clxtoastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_mpanel" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),clxtoastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 0)),(Object)(__ref.getField(false,"_mpanel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 break; }
case 2: {
 BA.debugLineNum = 192;BA.debugLine="mBase.AddView(mPanel, 5dip, mBase.Height-mPanel";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, clxtoastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_mpanel" /*RemoteObject*/ ).runMethod(true,"getHeight"),clxtoastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "--",2, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),clxtoastmessage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 0)),(Object)(__ref.getField(false,"_mpanel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 break; }
}
;
 BA.debugLineNum = 194;BA.debugLine="fading = tempSettings.get(\"tmfade\")";
Debug.ShouldStop(2);
__ref.setField ("_fading" /*RemoteObject*/ ,BA.ObjectToBoolean(__ref.getField(false,"_tempsettings" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tmfade"))))));
 BA.debugLineNum = 195;BA.debugLine="If fading Then	mPanel.SetVisibleAnimated(400, Tru";
Debug.ShouldStop(4);
if (__ref.getField(true,"_fading" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_mpanel" /*RemoteObject*/ ).runVoidMethod ("SetVisibleAnimated",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 400)),(Object)(clxtoastmessage.__c.getField(true,"True")));}
else {
__ref.getField(false,"_mpanel" /*RemoteObject*/ ).runVoidMethod ("SetVisibleAnimated",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(clxtoastmessage.__c.getField(true,"True")));};
 BA.debugLineNum = 196;BA.debugLine="displaying = True";
Debug.ShouldStop(8);
__ref.setField ("_displaying" /*RemoteObject*/ ,clxtoastmessage.__c.getField(true,"True"));
 BA.debugLineNum = 197;BA.debugLine="If tempSettings.get(\"tmdur\") Then timer1.Interval";
Debug.ShouldStop(16);
if (BA.ObjectToBoolean(__ref.getField(false,"_tempsettings" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tmdur"))))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_timer1" /*RemoteObject*/ ).runMethod(true,"setInterval",BA.numberCast(long.class, _lduration));}
else {
__ref.getField(false,"_timer1" /*RemoteObject*/ ).runMethod(true,"setInterval",BA.numberCast(long.class, _sduration));};
 BA.debugLineNum = 198;BA.debugLine="timer1.Enabled = True";
Debug.ShouldStop(32);
__ref.getField(false,"_timer1" /*RemoteObject*/ ).runMethod(true,"setEnabled",clxtoastmessage.__c.getField(true,"True"));
 BA.debugLineNum = 199;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _timer1_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("timer1_tick (clxtoastmessage) ","clxtoastmessage",5,__ref.getField(false, "ba"),__ref,202);
if (RapidSub.canDelegate("timer1_tick")) { __ref.runUserSub(false, "clxtoastmessage","timer1_tick", __ref); return;}
ResumableSub_timer1_tick rsub = new ResumableSub_timer1_tick(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_timer1_tick extends BA.ResumableSub {
public ResumableSub_timer1_tick(b4j.example.clxtoastmessage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.clxtoastmessage parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("timer1_tick (clxtoastmessage) ","clxtoastmessage",5,__ref.getField(false, "ba"),__ref,202);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 203;BA.debugLine="If fading Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 4;
if (__ref.getField(true,"_fading" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 204;BA.debugLine="mPanel.SetVisibleAnimated(400, False)";
Debug.ShouldStop(2048);
__ref.getField(false,"_mpanel" /*RemoteObject*/ ).runVoidMethod ("SetVisibleAnimated",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 400)),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 205;BA.debugLine="Sleep(500)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clxtoastmessage", "timer1_tick"),BA.numberCast(int.class, 500));
this.state = 13;
return;
case 13:
//C
this.state = 4;
;
 BA.debugLineNum = 206;BA.debugLine="fading = False";
Debug.ShouldStop(8192);
__ref.setField ("_fading" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 208;BA.debugLine="timer1.Enabled = False";
Debug.ShouldStop(32768);
__ref.getField(false,"_timer1" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 209;BA.debugLine="mPanel.RemoveViewFromParent";
Debug.ShouldStop(65536);
__ref.getField(false,"_mpanel" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 210;BA.debugLine="mBase.Tag = Null";
Debug.ShouldStop(131072);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",parent.__c.getField(false,"Null"));
 BA.debugLineNum = 211;BA.debugLine="TMList.RemoveAt(1)";
Debug.ShouldStop(262144);
__ref.getField(false,"_tmlist" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 212;BA.debugLine="If TMList.Size > 1 Then ShowMessage Else displayi";
Debug.ShouldStop(524288);
if (true) break;

case 5:
//if
this.state = 12;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_tmlist" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
this.state = 7;
;}
else {
this.state = 9;
;}if (true) break;

case 7:
//C
this.state = 12;
__ref.runClassMethod (b4j.example.clxtoastmessage.class, "_showmessage" /*RemoteObject*/ );
if (true) break;

case 9:
//C
this.state = 12;
__ref.setField ("_displaying" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 213;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _tmclearandshow(RemoteObject __ref,RemoteObject _message,RemoteObject _longduration,RemoteObject _fadeeffect) throws Exception{
try {
		Debug.PushSubsStack("TMClearAndShow (clxtoastmessage) ","clxtoastmessage",5,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("tmclearandshow")) { return __ref.runUserSub(false, "clxtoastmessage","tmclearandshow", __ref, _message, _longduration, _fadeeffect);}
RemoteObject _m1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
Debug.locals.put("Message", _message);
Debug.locals.put("LongDuration", _longduration);
Debug.locals.put("FadeEffect", _fadeeffect);
 BA.debugLineNum = 135;BA.debugLine="Public Sub TMClearAndShow(Message As String, LongD";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="timer1.Enabled = False";
Debug.ShouldStop(128);
__ref.getField(false,"_timer1" /*RemoteObject*/ ).runMethod(true,"setEnabled",clxtoastmessage.__c.getField(true,"False"));
 BA.debugLineNum = 137;BA.debugLine="displaying = False";
Debug.ShouldStop(256);
__ref.setField ("_displaying" /*RemoteObject*/ ,clxtoastmessage.__c.getField(true,"False"));
 BA.debugLineNum = 138;BA.debugLine="TMList.Clear";
Debug.ShouldStop(512);
__ref.getField(false,"_tmlist" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 139;BA.debugLine="Dim m1 As Map = DuplicateMap(MakeDefaults)";
Debug.ShouldStop(1024);
_m1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m1 = __ref.runClassMethod (b4j.example.clxtoastmessage.class, "_duplicatemap" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.clxtoastmessage.class, "_makedefaults" /*RemoteObject*/ )));Debug.locals.put("m1", _m1);Debug.locals.put("m1", _m1);
 BA.debugLineNum = 140;BA.debugLine="TMList.Add(m1)														'item #0 = defaults";
Debug.ShouldStop(2048);
__ref.getField(false,"_tmlist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_m1.getObject())));
 BA.debugLineNum = 141;BA.debugLine="For i = 0 To m1.Size - 1";
Debug.ShouldStop(4096);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_m1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 142;BA.debugLine="If Not(tempSettings.ContainsKey(m1.GetKeyAt(i)))";
Debug.ShouldStop(8192);
if (clxtoastmessage.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_tempsettings" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)(_m1.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))))))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_tempsettings" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(_m1.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))),(Object)(_m1.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i)))));};
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 146;BA.debugLine="tempSettings.Put(\"lText\", Message)";
Debug.ShouldStop(131072);
__ref.getField(false,"_tempsettings" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lText"))),(Object)((_message)));
 BA.debugLineNum = 147;BA.debugLine="tempSettings.Put(\"tmfade\", FadeEffect)";
Debug.ShouldStop(262144);
__ref.getField(false,"_tempsettings" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tmfade"))),(Object)((_fadeeffect)));
 BA.debugLineNum = 148;BA.debugLine="tempSettings.Put(\"tmdur\", LongDuration)";
Debug.ShouldStop(524288);
__ref.getField(false,"_tempsettings" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tmdur"))),(Object)((_longduration)));
 BA.debugLineNum = 149;BA.debugLine="TMList.Add(DuplicateMap(tempSettings))								'it";
Debug.ShouldStop(1048576);
__ref.getField(false,"_tmlist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.clxtoastmessage.class, "_duplicatemap" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_tempsettings" /*RemoteObject*/ ))).getObject())));
 BA.debugLineNum = 150;BA.debugLine="mPanel.RemoveViewFromParent";
Debug.ShouldStop(2097152);
__ref.getField(false,"_mpanel" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 151;BA.debugLine="mBase.Tag = Null";
Debug.ShouldStop(4194304);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",clxtoastmessage.__c.getField(false,"Null"));
 BA.debugLineNum = 152;BA.debugLine="ShowMessage";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.clxtoastmessage.class, "_showmessage" /*RemoteObject*/ );
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tmshow(RemoteObject __ref,RemoteObject _message,RemoteObject _longduration,RemoteObject _fadeeffect) throws Exception{
try {
		Debug.PushSubsStack("TMShow (clxtoastmessage) ","clxtoastmessage",5,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("tmshow")) { return __ref.runUserSub(false, "clxtoastmessage","tmshow", __ref, _message, _longduration, _fadeeffect);}
Debug.locals.put("Message", _message);
Debug.locals.put("LongDuration", _longduration);
Debug.locals.put("FadeEffect", _fadeeffect);
 BA.debugLineNum = 124;BA.debugLine="Public Sub TMShow (Message As String, LongDuration";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 126;BA.debugLine="tempSettings.Put(\"lText\", Message)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_tempsettings" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lText"))),(Object)((_message)));
 BA.debugLineNum = 127;BA.debugLine="tempSettings.Put(\"tmfade\", FadeEffect)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_tempsettings" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tmfade"))),(Object)((_fadeeffect)));
 BA.debugLineNum = 128;BA.debugLine="tempSettings.Put(\"tmdur\", LongDuration)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_tempsettings" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tmdur"))),(Object)((_longduration)));
 BA.debugLineNum = 129;BA.debugLine="TMList.Add(DuplicateMap(tempSettings))";
Debug.ShouldStop(1);
__ref.getField(false,"_tmlist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.clxtoastmessage.class, "_duplicatemap" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_tempsettings" /*RemoteObject*/ ))).getObject())));
 BA.debugLineNum = 130;BA.debugLine="If displaying Then Return";
Debug.ShouldStop(2);
if (__ref.getField(true,"_displaying" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 131;BA.debugLine="ShowMessage";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.clxtoastmessage.class, "_showmessage" /*RemoteObject*/ );
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}