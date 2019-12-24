package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xlongtexttemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xlongtexttemplate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xlongtexttemplate.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public b4j.example.customlistview _customlistview1 = null;
public Object _text = null;
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
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4j.example.b4xlongtexttemplate __ref,b4j.example.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=22872064;
 //BA.debugLineNum = 22872064;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=22872065;
 //BA.debugLineNum = 22872065;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=22872066;
 //BA.debugLineNum = 22872066;BA.debugLine="End Sub";
return null;
}
public String  _show(b4j.example.b4xlongtexttemplate __ref,b4j.example.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_dialog}));}
RDebugUtils.currentLine=22937600;
 //BA.debugLineNum = 22937600;BA.debugLine="Private Sub Show (Dialog As B4XDialog)";
RDebugUtils.currentLine=22937601;
 //BA.debugLineNum = 22937601;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4j.example.customlistview*/ ._clear();
RDebugUtils.currentLine=22937602;
 //BA.debugLineNum = 22937602;BA.debugLine="CustomListView1.AddTextItem(Text, \"\")";
__ref._customlistview1 /*b4j.example.customlistview*/ ._addtextitem(__ref._text /*Object*/ ,(Object)(""));
RDebugUtils.currentLine=22937603;
 //BA.debugLineNum = 22937603;BA.debugLine="CustomListView1.GetPanel(0).GetView(0).SetTextAli";
__ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel((int) (0)).GetView((int) (0)).SetTextAlignment("TOP","LEFT");
RDebugUtils.currentLine=22937604;
 //BA.debugLineNum = 22937604;BA.debugLine="Dialog.InternalAddStubToCLVIfNeeded(CustomListVie";
_dialog._internaladdstubtoclvifneeded /*String*/ (null,__ref._customlistview1 /*b4j.example.customlistview*/ ,__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor);
RDebugUtils.currentLine=22937605;
 //BA.debugLineNum = 22937605;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(b4j.example.b4xlongtexttemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=23003136;
 //BA.debugLineNum = 23003136;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=23003138;
 //BA.debugLineNum = 23003138;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xlongtexttemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlongtexttemplate";
RDebugUtils.currentLine=22675456;
 //BA.debugLineNum = 22675456;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=22675457;
 //BA.debugLineNum = 22675457;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=22675458;
 //BA.debugLineNum = 22675458;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=22675459;
 //BA.debugLineNum = 22675459;BA.debugLine="Public CustomListView1 As CustomListView";
_customlistview1 = new b4j.example.customlistview();
RDebugUtils.currentLine=22675460;
 //BA.debugLineNum = 22675460;BA.debugLine="Public Text As Object";
_text = new Object();
RDebugUtils.currentLine=22675461;
 //BA.debugLineNum = 22675461;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.b4xlongtexttemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _sv = null;
RDebugUtils.currentLine=22740992;
 //BA.debugLineNum = 22740992;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=22740993;
 //BA.debugLineNum = 22740993;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=22740994;
 //BA.debugLineNum = 22740994;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 300dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=22740995;
 //BA.debugLineNum = 22740995;BA.debugLine="mBase.LoadLayout(\"LongTextTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("LongTextTemplate",ba);
RDebugUtils.currentLine=22740996;
 //BA.debugLineNum = 22740996;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=22740997;
 //BA.debugLineNum = 22740997;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=22740998;
 //BA.debugLineNum = 22740998;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = 0xFF";
__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor = (int) (0xff555555);
RDebugUtils.currentLine=22740999;
 //BA.debugLineNum = 22740999;BA.debugLine="CustomListView1.DefaultTextColor = xui.Color_Whit";
__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=22741000;
 //BA.debugLineNum = 22741000;BA.debugLine="CustomListView1.sv.Color = 0xFF464646";
__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.setColor((int) (0xff464646));
RDebugUtils.currentLine=22741002;
 //BA.debugLineNum = 22741002;BA.debugLine="Dim sv As Node = CustomListView1.sv";
_sv = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
_sv.setObject((javafx.scene.Node)(__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getObject()));
RDebugUtils.currentLine=22741003;
 //BA.debugLineNum = 22741003;BA.debugLine="sv.StyleClasses.Add(\"b4xdialog\")";
_sv.getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=22741005;
 //BA.debugLineNum = 22741005;BA.debugLine="End Sub";
return "";
}
public String  _resize(b4j.example.b4xlongtexttemplate __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "resize", true))
	 {return ((String) Debug.delegate(ba, "resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=22806528;
 //BA.debugLineNum = 22806528;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
RDebugUtils.currentLine=22806529;
 //BA.debugLineNum = 22806529;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=22806530;
 //BA.debugLineNum = 22806530;BA.debugLine="CustomListView1.AsView.SetLayoutAnimated(0, 0, 0,";
__ref._customlistview1 /*b4j.example.customlistview*/ ._asview().SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=22806531;
 //BA.debugLineNum = 22806531;BA.debugLine="CustomListView1.Base_Resize(Width, Height)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._base_resize(_width,_height);
RDebugUtils.currentLine=22806532;
 //BA.debugLineNum = 22806532;BA.debugLine="End Sub";
return "";
}
}