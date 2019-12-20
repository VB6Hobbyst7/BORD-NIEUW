package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class timerclass extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.timerclass", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.timerclass.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.Timer _tmr = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
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
public String  _initialize(b4j.example.timerclass __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.LabelWrapper _label) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="timerclass";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_label}));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Public Sub Initialize(label As Label)";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="tmr.Initialize(\"tmr\", 1000*60)";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"tmr",(long) (1000*60));
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="tmr.Enabled = True";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="lbl = label";
__ref._lbl /*anywheresoftware.b4j.objects.LabelWrapper*/  = _label;
RDebugUtils.currentLine=6160388;
 //BA.debugLineNum = 6160388;BA.debugLine="tmr_Tick";
__ref._tmr_tick /*String*/ (null);
RDebugUtils.currentLine=6160389;
 //BA.debugLineNum = 6160389;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.timerclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="timerclass";
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="Private tmr As Timer";
_tmr = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=6094853;
 //BA.debugLineNum = 6094853;BA.debugLine="End Sub";
return "";
}
public String  _tmr_tick(b4j.example.timerclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="timerclass";
if (Debug.shouldDelegate(ba, "tmr_tick", false))
	 {return ((String) Debug.delegate(ba, "tmr_tick", null));}
String _time = "";
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Private Sub tmr_Tick";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="Dim time As String";
_time = "";
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="DateTime.DateFormat=\"EEEE, dd MMMM yyyy HH:mm\"";
__c.DateTime.setDateFormat("EEEE, dd MMMM yyyy HH:mm");
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="time = \"     \" & DateTime.Date(DateTime.Now) 'fun";
_time = "     "+__c.DateTime.Date(__c.DateTime.getNow());
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="lbl.Text = time";
__ref._lbl /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_time);
RDebugUtils.currentLine=6225925;
 //BA.debugLineNum = 6225925;BA.debugLine="End Sub";
return "";
}
}