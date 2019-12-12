package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xsignaturetemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.b4xsignaturetemplate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xsignaturetemplate.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvvvvvvv2 = null;
public float _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0f;
public float _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0f;
public float _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0f;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = false;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
public b4j.example.cssutils _vvvvvvvv0 = null;
public b4j.example.dateutils _vvvvvvvvv1 = null;
public b4j.example.main _main = null;
public b4j.example.scorebord _vvvvvvvvv2 = null;
public b4j.example.func _vvvvvvvvv3 = null;
public b4j.example.parseconfig _vvvvvvvvv4 = null;
public b4j.example.funcinet _vvvvvvvvv5 = null;
public b4j.example.httputils2service _vvvvvvvvv6 = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private xui As XUI";
_vvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 3;BA.debugLine="Public mBase As B4XView";
_vvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Private cvs As B4XCanvas";
_vvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 5;BA.debugLine="Private LastX, LastY As Float";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0f;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0f;
 //BA.debugLineNum = 6;BA.debugLine="Public StrokeWidth As Float = 2dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (float) (__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 7;BA.debugLine="Public StrokeColor As Int = xui.Color_Black";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvv6.Color_Black;
 //BA.debugLineNum = 8;BA.debugLine="Public TextColor As Int = 0xFFFF8800";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv3 = (int) (0xffff8800);
 //BA.debugLineNum = 9;BA.debugLine="Public BackgroundColor As Int = xui.Color_White";
_vvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvvvvvvvvvvv6.Color_White;
 //BA.debugLineNum = 10;BA.debugLine="Public AddDateAndTime As Boolean = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = __c.True;
 //BA.debugLineNum = 11;BA.debugLine="Public TextFont As B4XFont";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(int _result) throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
 //BA.debugLineNum = 53;BA.debugLine="Private Sub DialogClosed (Result As Int)";
 //BA.debugLineNum = 54;BA.debugLine="If Result = xui.DialogResponse_Positive And AddDa";
if (_result==_vvvvvvvvvvvv6.DialogResponse_Positive && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7) { 
 //BA.debugLineNum = 55;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(\"M\", TextFont";
_r = _vvvvvvvvvvvvv2.MeasureText("M",_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 56;BA.debugLine="Dim Baseline As Int = cvs.TargetRect.Bottom - r.";
_baseline = (int) (_vvvvvvvvvvvvv2.getTargetRect().getBottom()-_r.getHeight()-_r.getTop()-__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 57;BA.debugLine="cvs.DrawText($\"$DateTime{DateTime.Now}\"$, 2dip,";
_vvvvvvvvvvvvv2.DrawText((""+__c.SmartStringFormatter("datetime",(Object)(__c.DateTime.getNow()))+""),__c.DipToCurrent((int) (2)),_baseline,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvvvvvvvvvvvvvv3,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"LEFT"));
 };
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Public Sub getBitmap As B4XBitmap";
 //BA.debugLineNum = 50;BA.debugLine="Return cvs.CreateBitmap";
if (true) return _vvvvvvvvvvvvv2.CreateBitmap();
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4j.example.b4xdialog _dialog) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
 //BA.debugLineNum = 28;BA.debugLine="Return mBase";
if (true) return _vvvvvvvvvvvv5;
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 15;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
_vvvvvvvvvvvv5 = _vvvvvvvvvvvv6.CreatePanel(ba,"mBase");
 //BA.debugLineNum = 16;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 200dip)";
_vvvvvvvvvvvv5.SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (200)));
 //BA.debugLineNum = 17;BA.debugLine="cvs.Initialize(mBase)";
_vvvvvvvvvvvvv2.Initialize(ba,_vvvvvvvvvvvv5);
 //BA.debugLineNum = 18;BA.debugLine="TextFont = xui.CreateDefaultFont(14)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _vvvvvvvvvvvv6.CreateDefaultFont((float) (14));
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _mbase_touch(int _action,float _x,float _y) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Private Sub mBase_Touch (Action As Int, X As Float";
 //BA.debugLineNum = 37;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,_vvvvvvvvvvvv5.TOUCH_ACTION_DOWN,_vvvvvvvvvvvv5.TOUCH_ACTION_MOVE)) {
case 0: {
 //BA.debugLineNum = 39;BA.debugLine="LastX = X";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _x;
 //BA.debugLineNum = 40;BA.debugLine="LastY = Y";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _y;
 break; }
case 1: {
 //BA.debugLineNum = 42;BA.debugLine="cvs.DrawLine(LastX, LastY, X, Y, StrokeColor, S";
_vvvvvvvvvvvvv2.DrawLine(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_x,_y,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5);
 //BA.debugLineNum = 43;BA.debugLine="LastX = X";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _x;
 //BA.debugLineNum = 44;BA.debugLine="LastY = Y";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _y;
 //BA.debugLineNum = 45;BA.debugLine="cvs.Invalidate";
_vvvvvvvvvvvvv2.Invalidate();
 break; }
}
;
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(int _width,int _height) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
 //BA.debugLineNum = 22;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
_vvvvvvvvvvvv5.SetLayoutAnimated((int) (0),0,0,_width,_height);
 //BA.debugLineNum = 23;BA.debugLine="cvs.Resize(Width, Height)";
_vvvvvvvvvvvvv2.Resize(_width,_height);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _show(b4j.example.b4xdialog _dialog) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Private Sub Show (Dialog As B4XDialog) 'ignore";
 //BA.debugLineNum = 32;BA.debugLine="cvs.DrawRect(cvs.TargetRect, BackgroundColor, Tru";
_vvvvvvvvvvvvv2.DrawRect(_vvvvvvvvvvvvv2.getTargetRect(),_vvvvvvvvvvvvvvvvvvvvvvvvv1,__c.True,(float) (0));
 //BA.debugLineNum = 33;BA.debugLine="cvs.Invalidate";
_vvvvvvvvvvvvv2.Invalidate();
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "DIALOGCLOSED"))
	return _dialogclosed(((Number)args[0]).intValue());
if (BA.fastSubCompare(sub, "GETPANEL"))
	return _getpanel((b4j.example.b4xdialog) args[0]);
if (BA.fastSubCompare(sub, "SHOW"))
	return _show((b4j.example.b4xdialog) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
