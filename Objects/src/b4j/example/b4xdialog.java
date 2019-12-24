package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xdialog extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xdialog", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xdialog.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _buttonsheight = 0;
public int _titlebarheight = 0;
public int _buttonwidth = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
public int _backgroundcolor = 0;
public int _overlaycolor = 0;
public int _bordercolor = 0;
public int _bordercornersradius = 0;
public int _borderwidth = 0;
public int _buttonscolor = 0;
public int _buttonstextcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _background = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _blurimageview = null;
public boolean _blurbackground = false;
public int _blurreducescale = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _mparent = null;
public Object _title = null;
public int _titlebarcolor = 0;
public int _titlebartextcolor = 0;
public int _bodytextcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _titlebar = null;
public boolean _putattop = false;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _titlebarfont = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _buttonsfont = null;
public int _buttonstextcolordisabled = 0;
public int _visibleanimationduration = 0;
public int[] _buttonsorder = null;
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
public boolean  _close(b4j.example.b4xdialog __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "close", true))
	 {return ((Boolean) Debug.delegate(ba, "close", new Object[] {_result}));}
RDebugUtils.currentLine=17694720;
 //BA.debugLineNum = 17694720;BA.debugLine="Public Sub Close (Result As Int) As Boolean";
RDebugUtils.currentLine=17694721;
 //BA.debugLineNum = 17694721;BA.debugLine="If getVisible Then";
if (__ref._getvisible /*boolean*/ (null)) { 
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="CallSubDelayed2(Me, \"CloseMessage\", Result)";
__c.CallSubDelayed2(ba,this,"CloseMessage",(Object)(_result));
RDebugUtils.currentLine=17694723;
 //BA.debugLineNum = 17694723;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=17694725;
 //BA.debugLineNum = 17694725;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=17694726;
 //BA.debugLineNum = 17694726;BA.debugLine="End Sub";
return false;
}
public String  _background_click(b4j.example.b4xdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "background_click", true))
	 {return ((String) Debug.delegate(ba, "background_click", null));}
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Private Sub Background_Click";
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="End Sub";
return "";
}
public String  _background_mouseclicked(b4j.example.b4xdialog __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "background_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "background_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Private Sub Background_MouseClicked (EventData As";
RDebugUtils.currentLine=17760257;
 //BA.debugLineNum = 17760257;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=17760258;
 //BA.debugLineNum = 17760258;BA.debugLine="End Sub";
return "";
}
public String  _background_touch(b4j.example.b4xdialog __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "background_touch", true))
	 {return ((String) Debug.delegate(ba, "background_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Private Sub Background_Touch (Action As Int, X As";
RDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="End Sub";
return "";
}
public b4j.example.bitmapcreator  _blur(b4j.example.b4xdialog __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "blur", true))
	 {return ((b4j.example.bitmapcreator) Debug.delegate(ba, "blur", new Object[] {_bmp}));}
long _n = 0L;
b4j.example.bitmapcreator _bc = null;
int _reducescale = 0;
int _count = 0;
b4j.example.bitmapcreator._argbcolor[] _clrs = null;
b4j.example.bitmapcreator._argbcolor _temp = null;
int _m = 0;
int _steps = 0;
int _y = 0;
int _x = 0;
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Private Sub Blur (bmp As B4XBitmap) As BitmapCreat";
RDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="Dim n As Long = DateTime.Now";
_n = __c.DateTime.getNow();
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=18087939;
 //BA.debugLineNum = 18087939;BA.debugLine="Dim ReduceScale As Int = BlurReduceScale";
_reducescale = __ref._blurreducescale /*int*/ ;
RDebugUtils.currentLine=18087940;
 //BA.debugLineNum = 18087940;BA.debugLine="bc.Initialize(bmp.Width / ReduceScale / bmp.Scale";
_bc._initialize(ba,(int) (_bmp.getWidth()/(double)_reducescale/(double)_bmp.getScale()),(int) (_bmp.getHeight()/(double)_reducescale/(double)_bmp.getScale()));
RDebugUtils.currentLine=18087941;
 //BA.debugLineNum = 18087941;BA.debugLine="bc.CopyPixelsFromBitmap(bmp)";
_bc._copypixelsfrombitmap(_bmp);
RDebugUtils.currentLine=18087942;
 //BA.debugLineNum = 18087942;BA.debugLine="Dim count As Int = 2";
_count = (int) (2);
RDebugUtils.currentLine=18087943;
 //BA.debugLineNum = 18087943;BA.debugLine="Dim clrs(3) As ARGBColor";
_clrs = new b4j.example.bitmapcreator._argbcolor[(int) (3)];
{
int d0 = _clrs.length;
for (int i0 = 0;i0 < d0;i0++) {
_clrs[i0] = new b4j.example.bitmapcreator._argbcolor();
}
}
;
RDebugUtils.currentLine=18087944;
 //BA.debugLineNum = 18087944;BA.debugLine="Dim temp As ARGBColor";
_temp = new b4j.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=18087945;
 //BA.debugLineNum = 18087945;BA.debugLine="Dim m As Int";
_m = 0;
RDebugUtils.currentLine=18087946;
 //BA.debugLineNum = 18087946;BA.debugLine="For steps = 1 To count";
{
final int step10 = 1;
final int limit10 = _count;
_steps = (int) (1) ;
for (;_steps <= limit10 ;_steps = _steps + step10 ) {
RDebugUtils.currentLine=18087947;
 //BA.debugLineNum = 18087947;BA.debugLine="For y = 0 To bc.mHeight - 1";
{
final int step11 = 1;
final int limit11 = (int) (_bc._mheight-1);
_y = (int) (0) ;
for (;_y <= limit11 ;_y = _y + step11 ) {
RDebugUtils.currentLine=18087948;
 //BA.debugLineNum = 18087948;BA.debugLine="For x = 0 To 2";
{
final int step12 = 1;
final int limit12 = (int) (2);
_x = (int) (0) ;
for (;_x <= limit12 ;_x = _x + step12 ) {
RDebugUtils.currentLine=18087949;
 //BA.debugLineNum = 18087949;BA.debugLine="bc.GetARGB(x, y, clrs(x))";
_bc._getargb(_x,_y,_clrs[_x]);
 }
};
RDebugUtils.currentLine=18087951;
 //BA.debugLineNum = 18087951;BA.debugLine="SetAvg(bc, 1, y, clrs, temp)";
__ref._setavg /*String*/ (null,_bc,(int) (1),_y,_clrs,_temp);
RDebugUtils.currentLine=18087952;
 //BA.debugLineNum = 18087952;BA.debugLine="m = 0";
_m = (int) (0);
RDebugUtils.currentLine=18087953;
 //BA.debugLineNum = 18087953;BA.debugLine="For x = 2 To bc.mWidth - 2";
{
final int step17 = 1;
final int limit17 = (int) (_bc._mwidth-2);
_x = (int) (2) ;
for (;_x <= limit17 ;_x = _x + step17 ) {
RDebugUtils.currentLine=18087954;
 //BA.debugLineNum = 18087954;BA.debugLine="bc.GetARGB(x + 1, y, clrs(m))";
_bc._getargb((int) (_x+1),_y,_clrs[_m]);
RDebugUtils.currentLine=18087955;
 //BA.debugLineNum = 18087955;BA.debugLine="m = (m + 1) Mod 3";
_m = (int) ((_m+1)%3);
RDebugUtils.currentLine=18087956;
 //BA.debugLineNum = 18087956;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
__ref._setavg /*String*/ (null,_bc,_x,_y,_clrs,_temp);
 }
};
 }
};
RDebugUtils.currentLine=18087959;
 //BA.debugLineNum = 18087959;BA.debugLine="For x = 0 To bc.mWidth - 1";
{
final int step23 = 1;
final int limit23 = (int) (_bc._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit23 ;_x = _x + step23 ) {
RDebugUtils.currentLine=18087960;
 //BA.debugLineNum = 18087960;BA.debugLine="For y = 0 To 2";
{
final int step24 = 1;
final int limit24 = (int) (2);
_y = (int) (0) ;
for (;_y <= limit24 ;_y = _y + step24 ) {
RDebugUtils.currentLine=18087961;
 //BA.debugLineNum = 18087961;BA.debugLine="bc.GetARGB(x, y, clrs(y))";
_bc._getargb(_x,_y,_clrs[_y]);
 }
};
RDebugUtils.currentLine=18087963;
 //BA.debugLineNum = 18087963;BA.debugLine="SetAvg(bc, x, 1, clrs, temp)";
__ref._setavg /*String*/ (null,_bc,_x,(int) (1),_clrs,_temp);
RDebugUtils.currentLine=18087964;
 //BA.debugLineNum = 18087964;BA.debugLine="m = 0";
_m = (int) (0);
RDebugUtils.currentLine=18087965;
 //BA.debugLineNum = 18087965;BA.debugLine="For y = 2 To bc.mHeight - 2";
{
final int step29 = 1;
final int limit29 = (int) (_bc._mheight-2);
_y = (int) (2) ;
for (;_y <= limit29 ;_y = _y + step29 ) {
RDebugUtils.currentLine=18087966;
 //BA.debugLineNum = 18087966;BA.debugLine="bc.GetARGB(x, y + 1, clrs(m))";
_bc._getargb(_x,(int) (_y+1),_clrs[_m]);
RDebugUtils.currentLine=18087967;
 //BA.debugLineNum = 18087967;BA.debugLine="m = (m + 1) Mod 3";
_m = (int) ((_m+1)%3);
RDebugUtils.currentLine=18087968;
 //BA.debugLineNum = 18087968;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
__ref._setavg /*String*/ (null,_bc,_x,_y,_clrs,_temp);
 }
};
 }
};
 }
};
RDebugUtils.currentLine=18087972;
 //BA.debugLineNum = 18087972;BA.debugLine="Log(\"Time: \" & (DateTime.Now - n))";
__c.Log("Time: "+BA.NumberToString((__c.DateTime.getNow()-_n)));
RDebugUtils.currentLine=18087973;
 //BA.debugLineNum = 18087973;BA.debugLine="Return bc";
if (true) return _bc;
RDebugUtils.currentLine=18087974;
 //BA.debugLineNum = 18087974;BA.debugLine="End Sub";
return null;
}
public String  _setavg(b4j.example.b4xdialog __ref,b4j.example.bitmapcreator _bc,int _x,int _y,b4j.example.bitmapcreator._argbcolor[] _clrs,b4j.example.bitmapcreator._argbcolor _temp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "setavg", true))
	 {return ((String) Debug.delegate(ba, "setavg", new Object[] {_bc,_x,_y,_clrs,_temp}));}
b4j.example.bitmapcreator._argbcolor _c = null;
RDebugUtils.currentLine=18153472;
 //BA.debugLineNum = 18153472;BA.debugLine="Private Sub SetAvg(bc As BitmapCreator, x As Int,";
RDebugUtils.currentLine=18153473;
 //BA.debugLineNum = 18153473;BA.debugLine="temp.Initialize";
_temp.Initialize();
RDebugUtils.currentLine=18153474;
 //BA.debugLineNum = 18153474;BA.debugLine="For Each c As ARGBColor In clrs";
{
final b4j.example.bitmapcreator._argbcolor[] group2 = _clrs;
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_c = group2[index2];
RDebugUtils.currentLine=18153475;
 //BA.debugLineNum = 18153475;BA.debugLine="temp.r = temp.r + c.r";
_temp.r = (int) (_temp.r+_c.r);
RDebugUtils.currentLine=18153476;
 //BA.debugLineNum = 18153476;BA.debugLine="temp.g = temp.g + c.g";
_temp.g = (int) (_temp.g+_c.g);
RDebugUtils.currentLine=18153477;
 //BA.debugLineNum = 18153477;BA.debugLine="temp.b = temp.b + c.b";
_temp.b = (int) (_temp.b+_c.b);
 }
};
RDebugUtils.currentLine=18153479;
 //BA.debugLineNum = 18153479;BA.debugLine="temp.a = 255";
_temp.a = (int) (255);
RDebugUtils.currentLine=18153480;
 //BA.debugLineNum = 18153480;BA.debugLine="temp.r = temp.r / 3";
_temp.r = (int) (_temp.r/(double)3);
RDebugUtils.currentLine=18153481;
 //BA.debugLineNum = 18153481;BA.debugLine="temp.g = temp.g / 3";
_temp.g = (int) (_temp.g/(double)3);
RDebugUtils.currentLine=18153482;
 //BA.debugLineNum = 18153482;BA.debugLine="temp.b = temp.b / 3";
_temp.b = (int) (_temp.b/(double)3);
RDebugUtils.currentLine=18153483;
 //BA.debugLineNum = 18153483;BA.debugLine="bc.SetARGB(x, y, temp)";
_bc._setargb(_x,_y,_temp);
RDebugUtils.currentLine=18153484;
 //BA.debugLineNum = 18153484;BA.debugLine="End Sub";
return "";
}
public String  _button_click(b4j.example.b4xdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "button_click", true))
	 {return ((String) Debug.delegate(ba, "button_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _b = null;
RDebugUtils.currentLine=17629184;
 //BA.debugLineNum = 17629184;BA.debugLine="Private Sub Button_Click";
RDebugUtils.currentLine=17629185;
 //BA.debugLineNum = 17629185;BA.debugLine="Dim b As B4XView = Sender";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper();
_b.setObject((java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="Close(b.Tag)";
__ref._close /*boolean*/ (null,(int)(BA.ObjectToNumber(_b.getTag())));
RDebugUtils.currentLine=17629187;
 //BA.debugLineNum = 17629187;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
RDebugUtils.currentLine=17039360;
 //BA.debugLineNum = 17039360;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=17039361;
 //BA.debugLineNum = 17039361;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="Public ButtonsHeight As Int = 40dip";
_buttonsheight = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=17039363;
 //BA.debugLineNum = 17039363;BA.debugLine="Public TitleBarHeight As Int = 30dip";
_titlebarheight = __c.DipToCurrent((int) (30));
RDebugUtils.currentLine=17039364;
 //BA.debugLineNum = 17039364;BA.debugLine="Private ButtonWidth As Int = 80dip";
_buttonwidth = __c.DipToCurrent((int) (80));
RDebugUtils.currentLine=17039365;
 //BA.debugLineNum = 17039365;BA.debugLine="Public Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17039366;
 //BA.debugLineNum = 17039366;BA.debugLine="Public BackgroundColor As Int = 0xFF555555 'base";
_backgroundcolor = (int) (0xff555555);
RDebugUtils.currentLine=17039367;
 //BA.debugLineNum = 17039367;BA.debugLine="Public OverlayColor As Int = 0xaa000000";
_overlaycolor = (int) (0xaa000000);
RDebugUtils.currentLine=17039368;
 //BA.debugLineNum = 17039368;BA.debugLine="Public BorderColor As Int = 0xff000000";
_bordercolor = (int) (0xff000000);
RDebugUtils.currentLine=17039369;
 //BA.debugLineNum = 17039369;BA.debugLine="Public BorderCornersRadius As Int = 2dip";
_bordercornersradius = __c.DipToCurrent((int) (2));
RDebugUtils.currentLine=17039370;
 //BA.debugLineNum = 17039370;BA.debugLine="Public BorderWidth As Int = 2dip";
_borderwidth = __c.DipToCurrent((int) (2));
RDebugUtils.currentLine=17039371;
 //BA.debugLineNum = 17039371;BA.debugLine="Public ButtonsColor As Int = 0xFF555555";
_buttonscolor = (int) (0xff555555);
RDebugUtils.currentLine=17039372;
 //BA.debugLineNum = 17039372;BA.debugLine="Public ButtonsTextColor As Int = 0xFF89D5FF";
_buttonstextcolor = (int) (0xff89d5ff);
RDebugUtils.currentLine=17039373;
 //BA.debugLineNum = 17039373;BA.debugLine="Private Background As B4XView";
_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17039374;
 //BA.debugLineNum = 17039374;BA.debugLine="Private BlurImageView As B4XView";
_blurimageview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17039375;
 //BA.debugLineNum = 17039375;BA.debugLine="Public BlurBackground As Boolean";
_blurbackground = false;
RDebugUtils.currentLine=17039376;
 //BA.debugLineNum = 17039376;BA.debugLine="Private BlurReduceScale As Int";
_blurreducescale = 0;
RDebugUtils.currentLine=17039377;
 //BA.debugLineNum = 17039377;BA.debugLine="Public mParent As B4XView";
_mparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17039378;
 //BA.debugLineNum = 17039378;BA.debugLine="Public Title As Object = \"\"";
_title = (Object)("");
RDebugUtils.currentLine=17039379;
 //BA.debugLineNum = 17039379;BA.debugLine="Public TitleBarColor As Int = 0xFF0083B8";
_titlebarcolor = (int) (0xff0083b8);
RDebugUtils.currentLine=17039380;
 //BA.debugLineNum = 17039380;BA.debugLine="Public TitleBarTextColor As Int";
_titlebartextcolor = 0;
RDebugUtils.currentLine=17039381;
 //BA.debugLineNum = 17039381;BA.debugLine="Public BodyTextColor As Int = xui.Color_White";
_bodytextcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=17039382;
 //BA.debugLineNum = 17039382;BA.debugLine="Public TitleBar As B4XView";
_titlebar = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17039383;
 //BA.debugLineNum = 17039383;BA.debugLine="Public PutAtTop As Boolean";
_putattop = false;
RDebugUtils.currentLine=17039384;
 //BA.debugLineNum = 17039384;BA.debugLine="Public TitleBarFont As B4XFont";
_titlebarfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=17039385;
 //BA.debugLineNum = 17039385;BA.debugLine="Public ButtonsFont As B4XFont";
_buttonsfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=17039386;
 //BA.debugLineNum = 17039386;BA.debugLine="Public ButtonsTextColorDisabled As Int = 0xFF8080";
_buttonstextcolordisabled = (int) (0xff808080);
RDebugUtils.currentLine=17039387;
 //BA.debugLineNum = 17039387;BA.debugLine="Public VisibleAnimationDuration As Int = 100";
_visibleanimationduration = (int) (100);
RDebugUtils.currentLine=17039388;
 //BA.debugLineNum = 17039388;BA.debugLine="Public ButtonsOrder() As Int = Array As Int(xui.D";
_buttonsorder = new int[]{__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Negative,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel};
RDebugUtils.currentLine=17039389;
 //BA.debugLineNum = 17039389;BA.debugLine="End Sub";
return "";
}
public boolean  _getvisible(b4j.example.b4xdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "getvisible", true))
	 {return ((Boolean) Debug.delegate(ba, "getvisible", null));}
RDebugUtils.currentLine=17367040;
 //BA.debugLineNum = 17367040;BA.debugLine="Public Sub getVisible As Boolean";
RDebugUtils.currentLine=17367041;
 //BA.debugLineNum = 17367041;BA.debugLine="Return Background.IsInitialized And Background.Pa";
if (true) return __ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized() && __ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized();
RDebugUtils.currentLine=17367042;
 //BA.debugLineNum = 17367042;BA.debugLine="End Sub";
return false;
}
public String  _createbutton(b4j.example.b4xdialog __ref,Object _text,int _code) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "createbutton", true))
	 {return ((String) Debug.delegate(ba, "createbutton", new Object[] {_text,_code}));}
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xbtn = null;
int _numberofbuttons = 0;
RDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Private Sub CreateButton (Text As Object, Code As";
RDebugUtils.currentLine=17432577;
 //BA.debugLineNum = 17432577;BA.debugLine="If Text = \"\" Then Return";
if ((_text).equals((Object)(""))) { 
if (true) return "";};
RDebugUtils.currentLine=17432579;
 //BA.debugLineNum = 17432579;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=17432583;
 //BA.debugLineNum = 17432583;BA.debugLine="btn.Initialize(\"Button\")";
_btn.Initialize(ba,"Button");
RDebugUtils.currentLine=17432584;
 //BA.debugLineNum = 17432584;BA.debugLine="Dim xbtn As B4XView = btn";
_xbtn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xbtn.setObject((java.lang.Object)(_btn.getObject()));
RDebugUtils.currentLine=17432585;
 //BA.debugLineNum = 17432585;BA.debugLine="InternalSetTextOrCSBuilderToLabel(xbtn, Text)";
__ref._internalsettextorcsbuildertolabel /*String*/ (null,_xbtn,_text);
RDebugUtils.currentLine=17432586;
 //BA.debugLineNum = 17432586;BA.debugLine="xbtn.Tag = Code";
_xbtn.setTag((Object)(_code));
RDebugUtils.currentLine=17432587;
 //BA.debugLineNum = 17432587;BA.debugLine="xbtn.SetColorAndBorder(ButtonsColor, 0dip, Border";
_xbtn.SetColorAndBorder(__ref._buttonscolor /*int*/ ,__c.DipToCurrent((int) (0)),__ref._bordercolor /*int*/ ,__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=17432588;
 //BA.debugLineNum = 17432588;BA.debugLine="xbtn.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xbtn.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=17432589;
 //BA.debugLineNum = 17432589;BA.debugLine="xbtn.TextColor = ButtonsTextColor";
_xbtn.setTextColor(__ref._buttonstextcolor /*int*/ );
RDebugUtils.currentLine=17432590;
 //BA.debugLineNum = 17432590;BA.debugLine="xbtn.Font = ButtonsFont";
_xbtn.setFont(__ref._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=17432591;
 //BA.debugLineNum = 17432591;BA.debugLine="Dim numberOfButtons As Int = Base.NumberOfViews '";
_numberofbuttons = __ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews();
RDebugUtils.currentLine=17432592;
 //BA.debugLineNum = 17432592;BA.debugLine="Base.AddView(xbtn, Base.Width - 4dip - numberOfBu";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_xbtn.getObject()),__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (4))-_numberofbuttons*(__ref._buttonwidth /*int*/ +__c.DipToCurrent((int) (5)))-__ref._buttonwidth /*int*/ ,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._buttonsheight /*int*/ -__c.DipToCurrent((int) (4)),__ref._buttonwidth /*int*/ ,__ref._buttonsheight /*int*/ );
RDebugUtils.currentLine=17432594;
 //BA.debugLineNum = 17432594;BA.debugLine="If Code = xui.DialogResponse_Cancel Then xbtn.Req";
if (_code==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel) { 
_xbtn.RequestFocus();};
RDebugUtils.currentLine=17432595;
 //BA.debugLineNum = 17432595;BA.debugLine="End Sub";
return "";
}
public String  _internalsettextorcsbuildertolabel(b4j.example.b4xdialog __ref,anywheresoftware.b4a.objects.B4XViewWrapper _xlbl,Object _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "internalsettextorcsbuildertolabel", true))
	 {return ((String) Debug.delegate(ba, "internalsettextorcsbuildertolabel", new Object[] {_xlbl,_text}));}
RDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Public Sub InternalSetTextOrCSBuilderToLabel(xlbl";
RDebugUtils.currentLine=18284546;
 //BA.debugLineNum = 18284546;BA.debugLine="xlbl.Text = Text";
_xlbl.setText(BA.ObjectToString(_text));
RDebugUtils.currentLine=18284556;
 //BA.debugLineNum = 18284556;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getbutton(b4j.example.b4xdialog __ref,int _resultcode) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "getbutton", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getbutton", new Object[] {_resultcode}));}
anywheresoftware.b4a.objects.B4XViewWrapper _b = null;
RDebugUtils.currentLine=17498112;
 //BA.debugLineNum = 17498112;BA.debugLine="Public Sub GetButton (ResultCode As Int) As B4XVie";
RDebugUtils.currentLine=17498113;
 //BA.debugLineNum = 17498113;BA.debugLine="For Each b As B4XView In Base.GetAllViewsRecursiv";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b.setObject((java.lang.Object)(group1.Get(index1)));
RDebugUtils.currentLine=17498114;
 //BA.debugLineNum = 17498114;BA.debugLine="If b.Tag = ResultCode Then Return b";
if ((_b.getTag()).equals((Object)(_resultcode))) { 
if (true) return _b;};
 }
};
RDebugUtils.currentLine=17498116;
 //BA.debugLineNum = 17498116;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Null));
RDebugUtils.currentLine=17498117;
 //BA.debugLineNum = 17498117;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.b4xdialog __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
anywheresoftware.b4j.object.JavaObject _node = null;
anywheresoftware.b4a.objects.collections.List _stylesheets = null;
RDebugUtils.currentLine=17104896;
 //BA.debugLineNum = 17104896;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
RDebugUtils.currentLine=17104897;
 //BA.debugLineNum = 17104897;BA.debugLine="BlurBackground = False";
__ref._blurbackground /*boolean*/  = __c.False;
RDebugUtils.currentLine=17104898;
 //BA.debugLineNum = 17104898;BA.debugLine="If xui.IsB4i Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
RDebugUtils.currentLine=17104899;
 //BA.debugLineNum = 17104899;BA.debugLine="BlurReduceScale = 3";
__ref._blurreducescale /*int*/  = (int) (3);
 }else 
{RDebugUtils.currentLine=17104900;
 //BA.debugLineNum = 17104900;BA.debugLine="Else If xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=17104901;
 //BA.debugLineNum = 17104901;BA.debugLine="BlurReduceScale = 1";
__ref._blurreducescale /*int*/  = (int) (1);
 }else 
{RDebugUtils.currentLine=17104902;
 //BA.debugLineNum = 17104902;BA.debugLine="Else if xui.IsB4A Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
RDebugUtils.currentLine=17104903;
 //BA.debugLineNum = 17104903;BA.debugLine="BlurReduceScale = 3";
__ref._blurreducescale /*int*/  = (int) (3);
 }}}
;
RDebugUtils.currentLine=17104905;
 //BA.debugLineNum = 17104905;BA.debugLine="mParent = Parent";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _parent;
RDebugUtils.currentLine=17104907;
 //BA.debugLineNum = 17104907;BA.debugLine="Dim node As JavaObject = mParent";
_node = new anywheresoftware.b4j.object.JavaObject();
_node.setObject((java.lang.Object)(__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=17104908;
 //BA.debugLineNum = 17104908;BA.debugLine="Dim stylesheets As List = node.RunMethodJO(\"getSc";
_stylesheets = new anywheresoftware.b4a.objects.collections.List();
_stylesheets.setObject((java.util.List)(_node.RunMethodJO("getScene",(Object[])(__c.Null)).RunMethod("getStylesheets",(Object[])(__c.Null))));
RDebugUtils.currentLine=17104909;
 //BA.debugLineNum = 17104909;BA.debugLine="stylesheets.Add(File.GetUri(File.DirAssets, \"Dial";
_stylesheets.Add((Object)(__c.File.GetUri(__c.File.getDirAssets(),"Dialog.css")));
RDebugUtils.currentLine=17104911;
 //BA.debugLineNum = 17104911;BA.debugLine="TitleBarFont = xui.CreateDefaultBoldFont(16)";
__ref._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (16));
RDebugUtils.currentLine=17104912;
 //BA.debugLineNum = 17104912;BA.debugLine="ButtonsFont = xui.CreateDefaultBoldFont(15)";
__ref._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (15));
RDebugUtils.currentLine=17104913;
 //BA.debugLineNum = 17104913;BA.debugLine="TitleBarTextColor = xui.Color_White";
__ref._titlebartextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=17104914;
 //BA.debugLineNum = 17104914;BA.debugLine="End Sub";
return "";
}
public String  _internaladdstubtoclvifneeded(b4j.example.b4xdialog __ref,b4j.example.customlistview _customlistview1,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "internaladdstubtoclvifneeded", true))
	 {return ((String) Debug.delegate(ba, "internaladdstubtoclvifneeded", new Object[] {_customlistview1,_color}));}
b4j.example.customlistview._clvitem _lastitem = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _height = 0;
RDebugUtils.currentLine=18219008;
 //BA.debugLineNum = 18219008;BA.debugLine="Public Sub InternalAddStubToCLVIfNeeded(CustomList";
RDebugUtils.currentLine=18219009;
 //BA.debugLineNum = 18219009;BA.debugLine="If CustomListView1.Size = 0 Then Return";
if (_customlistview1._getsize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=18219010;
 //BA.debugLineNum = 18219010;BA.debugLine="Dim LastItem As CLVItem = CustomListView1.GetRawL";
_lastitem = _customlistview1._getrawlistitem((int) (_customlistview1._getsize()-1));
RDebugUtils.currentLine=18219011;
 //BA.debugLineNum = 18219011;BA.debugLine="If LastItem.Offset + LastItem.Panel.Height < Cust";
if (_lastitem.Offset+_lastitem.Panel.getHeight()<_customlistview1._asview().getHeight()) { 
RDebugUtils.currentLine=18219013;
 //BA.debugLineNum = 18219013;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"stub\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"stub");
RDebugUtils.currentLine=18219014;
 //BA.debugLineNum = 18219014;BA.debugLine="p.Color = Color";
_p.setColor(_color);
RDebugUtils.currentLine=18219015;
 //BA.debugLineNum = 18219015;BA.debugLine="Dim Height As Int = CustomListView1.AsView.Heigh";
_height = (int) (_customlistview1._asview().getHeight()-_lastitem.Offset-_lastitem.Panel.getHeight()-__c.DipToCurrent((int) (3)));
RDebugUtils.currentLine=18219016;
 //BA.debugLineNum = 18219016;BA.debugLine="If xui.IsB4J Then Height = Height + 5";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
_height = (int) (_height+5);};
RDebugUtils.currentLine=18219017;
 //BA.debugLineNum = 18219017;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, CustomListView1.AsV";
_p.SetLayoutAnimated((int) (0),0,0,_customlistview1._asview().getWidth(),_height);
RDebugUtils.currentLine=18219018;
 //BA.debugLineNum = 18219018;BA.debugLine="CustomListView1.Add(p, \"\")";
_customlistview1._add(_p,(Object)(""));
RDebugUtils.currentLine=18219019;
 //BA.debugLineNum = 18219019;BA.debugLine="CustomListView1.sv.ScrollViewContentHeight = Cus";
_customlistview1._sv.setScrollViewContentHeight(_customlistview1._sv.getScrollViewContentHeight()-_customlistview1._getdividersize());
 };
RDebugUtils.currentLine=18219021;
 //BA.debugLineNum = 18219021;BA.debugLine="End Sub";
return "";
}
public String  _resize(b4j.example.b4xdialog __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "resize", true))
	 {return ((String) Debug.delegate(ba, "resize", new Object[] {_width,_height}));}
int _top = 0;
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Public Sub Resize (Width As Int, Height As Int)";
RDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="Dim Top As Int = Round(Background.Height / 2 - Ba";
_top = (int) (__c.Round(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=17956867;
 //BA.debugLineNum = 17956867;BA.debugLine="If PutAtTop Then Top = 20dip";
if (__ref._putattop /*boolean*/ ) { 
_top = __c.DipToCurrent((int) (20));};
RDebugUtils.currentLine=17956868;
 //BA.debugLineNum = 17956868;BA.debugLine="Background.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=17956869;
 //BA.debugLineNum = 17956869;BA.debugLine="Base.SetLayoutAnimated(200, Round(Background.Widt";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (200),__c.Round(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2),_top,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=17956870;
 //BA.debugLineNum = 17956870;BA.debugLine="If xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=17956871;
 //BA.debugLineNum = 17956871;BA.debugLine="UpdateBlur";
__ref._updateblur /*String*/ (null);
 };
RDebugUtils.currentLine=17956873;
 //BA.debugLineNum = 17956873;BA.debugLine="End Sub";
return "";
}
public String  _updateblur(b4j.example.b4xdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "updateblur", true))
	 {return ((String) Debug.delegate(ba, "updateblur", null));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _source = null;
b4j.example.bitmapcreator _blurred = null;
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Private Sub UpdateBlur";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="If BlurBackground = False Then Return";
if (__ref._blurbackground /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="Background.Visible = False";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=18022403;
 //BA.debugLineNum = 18022403;BA.debugLine="Dim source As B4XBitmap = Background.Parent.Snaps";
_source = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_source = __ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().Snapshot();
RDebugUtils.currentLine=18022404;
 //BA.debugLineNum = 18022404;BA.debugLine="If source.Width > Background.Width Or source.Heig";
if (_source.getWidth()>__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth() || _source.getHeight()>__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=18022405;
 //BA.debugLineNum = 18022405;BA.debugLine="source = source.Crop(0, 0, Background.Width, Bac";
_source = _source.Crop((int) (0),(int) (0),(int) (__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(int) (__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=18022407;
 //BA.debugLineNum = 18022407;BA.debugLine="Background.Visible = True";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=18022408;
 //BA.debugLineNum = 18022408;BA.debugLine="BlurImageView.SetLayoutAnimated(0, 0, 0, Backgrou";
__ref._blurimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=18022409;
 //BA.debugLineNum = 18022409;BA.debugLine="Dim blurred As BitmapCreator = Blur(source)";
_blurred = __ref._blur /*b4j.example.bitmapcreator*/ (null,_source);
RDebugUtils.currentLine=18022410;
 //BA.debugLineNum = 18022410;BA.debugLine="blurred.SetBitmapToImageView(blurred.Bitmap, Blur";
_blurred._setbitmaptoimageview(_blurred._getbitmap(),__ref._blurimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=18022411;
 //BA.debugLineNum = 18022411;BA.debugLine="End Sub";
return "";
}
public String  _setbuttonstate(b4j.example.b4xdialog __ref,int _resultcode,boolean _enabled) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "setbuttonstate", true))
	 {return ((String) Debug.delegate(ba, "setbuttonstate", new Object[] {_resultcode,_enabled}));}
anywheresoftware.b4a.objects.B4XViewWrapper _b = null;
RDebugUtils.currentLine=17563648;
 //BA.debugLineNum = 17563648;BA.debugLine="Public Sub SetButtonState (ResultCode As Int, Enab";
RDebugUtils.currentLine=17563649;
 //BA.debugLineNum = 17563649;BA.debugLine="Dim b As B4XView = GetButton(ResultCode)";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper();
_b = __ref._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_resultcode);
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="If b.IsInitialized Then";
if (_b.IsInitialized()) { 
RDebugUtils.currentLine=17563651;
 //BA.debugLineNum = 17563651;BA.debugLine="b.Enabled = Enabled";
_b.setEnabled(_enabled);
RDebugUtils.currentLine=17563652;
 //BA.debugLineNum = 17563652;BA.debugLine="If Enabled Then b.TextColor = ButtonsTextColor E";
if (_enabled) { 
_b.setTextColor(__ref._buttonstextcolor /*int*/ );}
else {
_b.setTextColor(__ref._buttonstextcolordisabled /*int*/ );};
 };
RDebugUtils.currentLine=17563654;
 //BA.debugLineNum = 17563654;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _show(b4j.example.b4xdialog __ref,Object _text,Object _yes,Object _no,Object _cancel) throws Exception{
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "show", new Object[] {_text,_yes,_no,_cancel}));}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_text,_yes,_no,_cancel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.example.b4xdialog parent,b4j.example.b4xdialog __ref,Object _text,Object _yes,Object _no,Object _cancel) {
this.parent = parent;
this.__ref = __ref;
this._text = _text;
this._yes = _yes;
this._no = _no;
this._cancel = _cancel;
this.__ref = parent;
}
b4j.example.b4xdialog __ref;
b4j.example.b4xdialog parent;
Object _text;
Object _yes;
Object _no;
Object _cancel;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xdialog";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=17235969;
 //BA.debugLineNum = 17235969;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17235970;
 //BA.debugLineNum = 17235970;BA.debugLine="p = xui.CreatePanel(\"\")";
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=17235971;
 //BA.debugLineNum = 17235971;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 300dip, 100dip)";
_p.SetLayoutAnimated((int) (0),0,0,parent.__c.DipToCurrent((int) (300)),parent.__c.DipToCurrent((int) (100)));
RDebugUtils.currentLine=17235972;
 //BA.debugLineNum = 17235972;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=17235973;
 //BA.debugLineNum = 17235973;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=17235975;
 //BA.debugLineNum = 17235975;BA.debugLine="lbl.WrapText = True";
_lbl.setWrapText(parent.__c.True);
RDebugUtils.currentLine=17235981;
 //BA.debugLineNum = 17235981;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl.setObject((java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=17235982;
 //BA.debugLineNum = 17235982;BA.debugLine="p.AddView(xlbl, 5dip, 0, p.Width - 10dip, p.Heigh";
_p.AddView((javafx.scene.Node)(_xlbl.getObject()),parent.__c.DipToCurrent((int) (5)),0,_p.getWidth()-parent.__c.DipToCurrent((int) (10)),_p.getHeight());
RDebugUtils.currentLine=17235983;
 //BA.debugLineNum = 17235983;BA.debugLine="xlbl.TextColor = BodyTextColor";
_xlbl.setTextColor(__ref._bodytextcolor /*int*/ );
RDebugUtils.currentLine=17235984;
 //BA.debugLineNum = 17235984;BA.debugLine="xlbl.Font = TitleBarFont";
_xlbl.setFont(__ref._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=17235985;
 //BA.debugLineNum = 17235985;BA.debugLine="InternalSetTextOrCSBuilderToLabel(xlbl, Text)";
__ref._internalsettextorcsbuildertolabel /*String*/ (null,_xlbl,_text);
RDebugUtils.currentLine=17235986;
 //BA.debugLineNum = 17235986;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"LEFT\")";
_xlbl.SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=17235987;
 //BA.debugLineNum = 17235987;BA.debugLine="Wait For (ShowCustom(p, Yes, No, Cancel)) Complet";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xdialog", "show"), __ref._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,_yes,_no,_cancel));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (int) result[1];
;
RDebugUtils.currentLine=17235988;
 //BA.debugLineNum = 17235988;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=17235989;
 //BA.debugLineNum = 17235989;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _showcustom(b4j.example.b4xdialog __ref,anywheresoftware.b4a.objects.B4XViewWrapper _content,Object _yes,Object _no,Object _cancel) throws Exception{
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "showcustom", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "showcustom", new Object[] {_content,_yes,_no,_cancel}));}
ResumableSub_ShowCustom rsub = new ResumableSub_ShowCustom(this,__ref,_content,_yes,_no,_cancel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ShowCustom extends BA.ResumableSub {
public ResumableSub_ShowCustom(b4j.example.b4xdialog parent,b4j.example.b4xdialog __ref,anywheresoftware.b4a.objects.B4XViewWrapper _content,Object _yes,Object _no,Object _cancel) {
this.parent = parent;
this.__ref = __ref;
this._content = _content;
this._yes = _yes;
this._no = _no;
this._cancel = _cancel;
this.__ref = parent;
}
b4j.example.b4xdialog __ref;
b4j.example.b4xdialog parent;
anywheresoftware.b4a.objects.B4XViewWrapper _content;
Object _yes;
Object _no;
Object _cancel;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
anywheresoftware.b4j.objects.ImageViewWrapper _iv = null;
boolean _includetitle = false;
int _temptitlebarheight = 0;
int _height = 0;
int _width = 0;
int _top = 0;
boolean _removetitle = false;
int _i = 0;
int _btype = 0;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
int _result = 0;
anywheresoftware.b4a.BA.IterableList group1;
int index1;
int groupLen1;
int step43;
int limit43;
anywheresoftware.b4a.BA.IterableList group71;
int index71;
int groupLen71;
anywheresoftware.b4a.BA.IterableList group75;
int index75;
int groupLen75;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xdialog";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17301505;
 //BA.debugLineNum = 17301505;BA.debugLine="For Each v As B4XView In mParent.GetAllViewsRecur";
if (true) break;

case 1:
//for
this.state = 8;
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
group1 = __ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
index1 = 0;
groupLen1 = group1.getSize();
this.state = 60;
if (true) break;

case 60:
//C
this.state = 8;
if (index1 < groupLen1) {
this.state = 3;
_v.setObject((java.lang.Object)(group1.Get(index1)));}
if (true) break;

case 61:
//C
this.state = 60;
index1++;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=17301506;
 //BA.debugLineNum = 17301506;BA.debugLine="If v.Tag <> Null And v.Tag = \"b4xdialog_backgrou";
if (true) break;

case 4:
//if
this.state = 7;
if (_v.getTag()!= null && (_v.getTag()).equals((Object)("b4xdialog_background"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=17301507;
 //BA.debugLineNum = 17301507;BA.debugLine="v.RemoveViewFromParent";
_v.RemoveViewFromParent();
RDebugUtils.currentLine=17301508;
 //BA.debugLineNum = 17301508;BA.debugLine="Exit";
this.state = 8;
if (true) break;
 if (true) break;

case 7:
//C
this.state = 61;
;
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=17301511;
 //BA.debugLineNum = 17301511;BA.debugLine="Dim Background As B4XView = xui.CreatePanel(\"back";
parent._background = new anywheresoftware.b4a.objects.B4XViewWrapper();
parent._background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"background");
RDebugUtils.currentLine=17301512;
 //BA.debugLineNum = 17301512;BA.debugLine="Background.Tag = \"b4xdialog_background\"";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("b4xdialog_background"));
RDebugUtils.currentLine=17301513;
 //BA.debugLineNum = 17301513;BA.debugLine="If BlurBackground Then";
if (true) break;

case 9:
//if
this.state = 14;
if (__ref._blurbackground /*boolean*/ ) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=17301514;
 //BA.debugLineNum = 17301514;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=17301515;
 //BA.debugLineNum = 17301515;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=17301516;
 //BA.debugLineNum = 17301516;BA.debugLine="BlurImageView = iv";
__ref._blurimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setObject((java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=17301517;
 //BA.debugLineNum = 17301517;BA.debugLine="Background.AddView(BlurImageView, 0, 0, Backgrou";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._blurimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=17301518;
 //BA.debugLineNum = 17301518;BA.debugLine="Background.Color = xui.Color_Transparent";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=17301520;
 //BA.debugLineNum = 17301520;BA.debugLine="Background.Color = OverlayColor";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._overlaycolor /*int*/ );
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=17301526;
 //BA.debugLineNum = 17301526;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=17301527;
 //BA.debugLineNum = 17301527;BA.debugLine="UpdateBlur";
__ref._updateblur /*String*/ (null);
RDebugUtils.currentLine=17301528;
 //BA.debugLineNum = 17301528;BA.debugLine="Base = xui.CreatePanel(\"\")";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=17301529;
 //BA.debugLineNum = 17301529;BA.debugLine="Base.SetColorAndBorder(BackgroundColor, BorderWid";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._backgroundcolor /*int*/ ,__ref._borderwidth /*int*/ ,__ref._bordercolor /*int*/ ,__ref._bordercornersradius /*int*/ );
RDebugUtils.currentLine=17301530;
 //BA.debugLineNum = 17301530;BA.debugLine="Base.RequestFocus";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
RDebugUtils.currentLine=17301531;
 //BA.debugLineNum = 17301531;BA.debugLine="Dim IncludeTitle As Boolean = Title <> \"\"";
_includetitle = (__ref._title /*Object*/ ).equals((Object)("")) == false;
RDebugUtils.currentLine=17301532;
 //BA.debugLineNum = 17301532;BA.debugLine="Dim TempTitleBarHeight As Int = 0";
_temptitlebarheight = (int) (0);
RDebugUtils.currentLine=17301533;
 //BA.debugLineNum = 17301533;BA.debugLine="If IncludeTitle Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_includetitle) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=17301534;
 //BA.debugLineNum = 17301534;BA.debugLine="TempTitleBarHeight = TitleBarHeight";
_temptitlebarheight = __ref._titlebarheight /*int*/ ;
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=17301536;
 //BA.debugLineNum = 17301536;BA.debugLine="Dim height As Int = Content.Height + ButtonsHeigh";
_height = (int) (_content.getHeight()+__ref._buttonsheight /*int*/ +parent.__c.DipToCurrent((int) (3))+parent.__c.DipToCurrent((int) (3))+_temptitlebarheight);
RDebugUtils.currentLine=17301537;
 //BA.debugLineNum = 17301537;BA.debugLine="Dim width As Int = Content.Width + 4dip";
_width = (int) (_content.getWidth()+parent.__c.DipToCurrent((int) (4)));
RDebugUtils.currentLine=17301538;
 //BA.debugLineNum = 17301538;BA.debugLine="Dim Top As Int = Round(Background.Height / 2 - he";
_top = (int) (parent.__c.Round(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-_height/(double)2));
RDebugUtils.currentLine=17301539;
 //BA.debugLineNum = 17301539;BA.debugLine="Dim RemoveTitle As Boolean";
_removetitle = false;
RDebugUtils.currentLine=17301540;
 //BA.debugLineNum = 17301540;BA.debugLine="If PutAtTop Then";
if (true) break;

case 19:
//if
this.state = 28;
if (__ref._putattop /*boolean*/ ) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=17301541;
 //BA.debugLineNum = 17301541;BA.debugLine="Top = 20dip";
_top = parent.__c.DipToCurrent((int) (20));
RDebugUtils.currentLine=17301542;
 //BA.debugLineNum = 17301542;BA.debugLine="If Background.Height - Top - height < 200dip The";
if (true) break;

case 22:
//if
this.state = 27;
if (__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_top-_height<parent.__c.DipToCurrent((int) (200))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
_removetitle = parent.__c.True;
if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;
;
RDebugUtils.currentLine=17301544;
 //BA.debugLineNum = 17301544;BA.debugLine="If RemoveTitle Or Background.Height < height Then";

case 28:
//if
this.state = 31;
if (_removetitle || __ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()<_height) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=17301545;
 //BA.debugLineNum = 17301545;BA.debugLine="Top = 1dip";
_top = parent.__c.DipToCurrent((int) (1));
RDebugUtils.currentLine=17301546;
 //BA.debugLineNum = 17301546;BA.debugLine="IncludeTitle = False";
_includetitle = parent.__c.False;
RDebugUtils.currentLine=17301547;
 //BA.debugLineNum = 17301547;BA.debugLine="height = height - TempTitleBarHeight - 3dip";
_height = (int) (_height-_temptitlebarheight-parent.__c.DipToCurrent((int) (3)));
RDebugUtils.currentLine=17301548;
 //BA.debugLineNum = 17301548;BA.debugLine="TempTitleBarHeight = 0";
_temptitlebarheight = (int) (0);
 if (true) break;

case 31:
//C
this.state = 32;
;
RDebugUtils.currentLine=17301550;
 //BA.debugLineNum = 17301550;BA.debugLine="Background.AddView(Base, Round(Background.Width /";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),parent.__c.Round(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-_width/(double)2),_top,parent.__c.Round(_width),parent.__c.Round(_height));
RDebugUtils.currentLine=17301552;
 //BA.debugLineNum = 17301552;BA.debugLine="For i = ButtonsOrder.Length - 1 To 0 Step - 1";
if (true) break;

case 32:
//for
this.state = 43;
step43 = -1;
limit43 = (int) (0);
_i = (int) (__ref._buttonsorder /*int[]*/ .length-1) ;
this.state = 62;
if (true) break;

case 62:
//C
this.state = 43;
if ((step43 > 0 && _i <= limit43) || (step43 < 0 && _i >= limit43)) this.state = 34;
if (true) break;

case 63:
//C
this.state = 62;
_i = ((int)(0 + _i + step43)) ;
if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=17301553;
 //BA.debugLineNum = 17301553;BA.debugLine="Dim btype As Int = ButtonsOrder(i)";
_btype = __ref._buttonsorder /*int[]*/ [_i];
RDebugUtils.currentLine=17301554;
 //BA.debugLineNum = 17301554;BA.debugLine="Select btype";
if (true) break;

case 35:
//select
this.state = 42;
switch (BA.switchObjectToInt(_btype,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Negative,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive)) {
case 0: {
this.state = 37;
if (true) break;
}
case 1: {
this.state = 39;
if (true) break;
}
case 2: {
this.state = 41;
if (true) break;
}
}
if (true) break;

case 37:
//C
this.state = 42;
RDebugUtils.currentLine=17301556;
 //BA.debugLineNum = 17301556;BA.debugLine="CreateButton(Cancel, btype)";
__ref._createbutton /*String*/ (null,_cancel,_btype);
 if (true) break;

case 39:
//C
this.state = 42;
RDebugUtils.currentLine=17301558;
 //BA.debugLineNum = 17301558;BA.debugLine="CreateButton(No, btype)";
__ref._createbutton /*String*/ (null,_no,_btype);
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=17301560;
 //BA.debugLineNum = 17301560;BA.debugLine="CreateButton(Yes, btype)";
__ref._createbutton /*String*/ (null,_yes,_btype);
 if (true) break;

case 42:
//C
this.state = 63;
;
 if (true) break;
if (true) break;

case 43:
//C
this.state = 44;
;
RDebugUtils.currentLine=17301563;
 //BA.debugLineNum = 17301563;BA.debugLine="Base.Visible = False";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=17301564;
 //BA.debugLineNum = 17301564;BA.debugLine="If IncludeTitle Then";
if (true) break;

case 44:
//if
this.state = 47;
if (_includetitle) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=17301565;
 //BA.debugLineNum = 17301565;BA.debugLine="TitleBar = xui.CreatePanel(\"TitleBar\")";
__ref._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"TitleBar");
RDebugUtils.currentLine=17301566;
 //BA.debugLineNum = 17301566;BA.debugLine="TitleBar.Color = TitleBarColor";
__ref._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._titlebarcolor /*int*/ );
RDebugUtils.currentLine=17301567;
 //BA.debugLineNum = 17301567;BA.debugLine="Base.AddView(TitleBar, 2dip, 2dip, Content.Width";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),parent.__c.DipToCurrent((int) (2)),parent.__c.DipToCurrent((int) (2)),_content.getWidth(),_temptitlebarheight);
RDebugUtils.currentLine=17301568;
 //BA.debugLineNum = 17301568;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=17301569;
 //BA.debugLineNum = 17301569;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=17301570;
 //BA.debugLineNum = 17301570;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl.setObject((java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=17301571;
 //BA.debugLineNum = 17301571;BA.debugLine="InternalSetTextOrCSBuilderToLabel(xlbl, Title)";
__ref._internalsettextorcsbuildertolabel /*String*/ (null,_xlbl,__ref._title /*Object*/ );
RDebugUtils.currentLine=17301572;
 //BA.debugLineNum = 17301572;BA.debugLine="xlbl.TextColor = TitleBarTextColor";
_xlbl.setTextColor(__ref._titlebartextcolor /*int*/ );
RDebugUtils.currentLine=17301573;
 //BA.debugLineNum = 17301573;BA.debugLine="xlbl.Font = TitleBarFont";
_xlbl.setFont(__ref._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=17301574;
 //BA.debugLineNum = 17301574;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=17301575;
 //BA.debugLineNum = 17301575;BA.debugLine="TitleBar.AddView(xlbl, 0, 0, TitleBar.Width, Tit";
__ref._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_xlbl.getObject()),0,0,__ref._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 if (true) break;

case 47:
//C
this.state = 48;
;
RDebugUtils.currentLine=17301577;
 //BA.debugLineNum = 17301577;BA.debugLine="Content.RemoveViewFromParent";
_content.RemoveViewFromParent();
RDebugUtils.currentLine=17301578;
 //BA.debugLineNum = 17301578;BA.debugLine="Base.AddView(Content, 2dip, 2dip + TempTitleBarHe";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_content.getObject()),parent.__c.DipToCurrent((int) (2)),parent.__c.DipToCurrent((int) (2))+_temptitlebarheight,_content.getWidth(),_content.getHeight());
RDebugUtils.currentLine=17301579;
 //BA.debugLineNum = 17301579;BA.debugLine="Base.SetVisibleAnimated(VisibleAnimationDuration,";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(ba,__ref._visibleanimationduration /*int*/ ,parent.__c.True);
RDebugUtils.currentLine=17301580;
 //BA.debugLineNum = 17301580;BA.debugLine="For Each v As B4XView In Background.GetAllViewsRe";
if (true) break;

case 48:
//for
this.state = 51;
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
group71 = __ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
index71 = 0;
groupLen71 = group71.getSize();
this.state = 64;
if (true) break;

case 64:
//C
this.state = 51;
if (index71 < groupLen71) {
this.state = 50;
_v.setObject((java.lang.Object)(group71.Get(index71)));}
if (true) break;

case 65:
//C
this.state = 64;
index71++;
if (true) break;

case 50:
//C
this.state = 65;
RDebugUtils.currentLine=17301581;
 //BA.debugLineNum = 17301581;BA.debugLine="v.Enabled = True";
_v.setEnabled(parent.__c.True);
 if (true) break;
if (true) break;

case 51:
//C
this.state = 52;
;
RDebugUtils.currentLine=17301583;
 //BA.debugLineNum = 17301583;BA.debugLine="Wait For CloseMessage (Result As Int)";
parent.__c.WaitFor("closemessage", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xdialog", "showcustom"), null);
this.state = 66;
return;
case 66:
//C
this.state = 52;
_result = (int) result[1];
;
RDebugUtils.currentLine=17301584;
 //BA.debugLineNum = 17301584;BA.debugLine="For Each v As B4XView In Background.GetAllViewsRe";
if (true) break;

case 52:
//for
this.state = 55;
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
group75 = __ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
index75 = 0;
groupLen75 = group75.getSize();
this.state = 67;
if (true) break;

case 67:
//C
this.state = 55;
if (index75 < groupLen75) {
this.state = 54;
_v.setObject((java.lang.Object)(group75.Get(index75)));}
if (true) break;

case 68:
//C
this.state = 67;
index75++;
if (true) break;

case 54:
//C
this.state = 68;
RDebugUtils.currentLine=17301585;
 //BA.debugLineNum = 17301585;BA.debugLine="v.Enabled = False";
_v.setEnabled(parent.__c.False);
 if (true) break;
if (true) break;

case 55:
//C
this.state = 56;
;
RDebugUtils.currentLine=17301587;
 //BA.debugLineNum = 17301587;BA.debugLine="Base.SetVisibleAnimated(VisibleAnimationDuration,";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(ba,__ref._visibleanimationduration /*int*/ ,parent.__c.False);
RDebugUtils.currentLine=17301588;
 //BA.debugLineNum = 17301588;BA.debugLine="If VisibleAnimationDuration > 0 Then";
if (true) break;

case 56:
//if
this.state = 59;
if (__ref._visibleanimationduration /*int*/ >0) { 
this.state = 58;
}if (true) break;

case 58:
//C
this.state = 59;
RDebugUtils.currentLine=17301589;
 //BA.debugLineNum = 17301589;BA.debugLine="Sleep(VisibleAnimationDuration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xdialog", "showcustom"),__ref._visibleanimationduration /*int*/ );
this.state = 69;
return;
case 69:
//C
this.state = 59;
;
 if (true) break;

case 59:
//C
this.state = -1;
;
RDebugUtils.currentLine=17301591;
 //BA.debugLineNum = 17301591;BA.debugLine="Background.RemoveViewFromParent";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=17301592;
 //BA.debugLineNum = 17301592;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=17301593;
 //BA.debugLineNum = 17301593;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _showtemplate(b4j.example.b4xdialog __ref,Object _dialogtemplate,Object _yes,Object _no,Object _cancel) throws Exception{
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "showtemplate", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "showtemplate", new Object[] {_dialogtemplate,_yes,_no,_cancel}));}
ResumableSub_ShowTemplate rsub = new ResumableSub_ShowTemplate(this,__ref,_dialogtemplate,_yes,_no,_cancel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ShowTemplate extends BA.ResumableSub {
public ResumableSub_ShowTemplate(b4j.example.b4xdialog parent,b4j.example.b4xdialog __ref,Object _dialogtemplate,Object _yes,Object _no,Object _cancel) {
this.parent = parent;
this.__ref = __ref;
this._dialogtemplate = _dialogtemplate;
this._yes = _yes;
this._no = _no;
this._cancel = _cancel;
this.__ref = parent;
}
b4j.example.b4xdialog __ref;
b4j.example.b4xdialog parent;
Object _dialogtemplate;
Object _yes;
Object _no;
Object _cancel;
anywheresoftware.b4a.objects.B4XViewWrapper _content = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xdialog";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=17170433;
 //BA.debugLineNum = 17170433;BA.debugLine="Dim content As B4XView = CallSub2(DialogTemplate,";
_content = new anywheresoftware.b4a.objects.B4XViewWrapper();
_content.setObject((java.lang.Object)(parent.__c.CallSubDebug2(ba,_dialogtemplate,"GetPanel",parent)));
RDebugUtils.currentLine=17170434;
 //BA.debugLineNum = 17170434;BA.debugLine="CallSub2(DialogTemplate, \"Show\", Me)";
parent.__c.CallSubDebug2(ba,_dialogtemplate,"Show",parent);
RDebugUtils.currentLine=17170435;
 //BA.debugLineNum = 17170435;BA.debugLine="Wait For (ShowCustom(content , Yes, No, Cancel))";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xdialog", "showtemplate"), __ref._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_content,_yes,_no,_cancel));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (int) result[1];
;
RDebugUtils.currentLine=17170436;
 //BA.debugLineNum = 17170436;BA.debugLine="CallSub2(DialogTemplate, \"DialogClosed\", Result)";
parent.__c.CallSubDebug2(ba,_dialogtemplate,"DialogClosed",(Object)(_result));
RDebugUtils.currentLine=17170437;
 //BA.debugLineNum = 17170437;BA.debugLine="PutAtTop = False";
__ref._putattop /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=17170438;
 //BA.debugLineNum = 17170438;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=17170439;
 //BA.debugLineNum = 17170439;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _stub_click(b4j.example.b4xdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdialog";
if (Debug.shouldDelegate(ba, "stub_click", true))
	 {return ((String) Debug.delegate(ba, "stub_click", null));}
RDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Private Sub Stub_Click";
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="End Sub";
return "";
}
}