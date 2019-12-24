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
public b4j.example.funcinet _funcinet = null;
public b4j.example.getnode _getnode = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _initialize(b4j.example.timerclass __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.LabelWrapper _label) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="timerclass";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_label}));}
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Public Sub Initialize(label As Label)";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="tmr.Initialize(\"tmr\", 1000*60)";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"tmr",(long) (1000*60));
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="tmr.Enabled = True";
__ref._tmr /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="lbl = label";
__ref._lbl /*anywheresoftware.b4j.objects.LabelWrapper*/  = _label;
RDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="tmr_Tick";
__ref._tmr_tick /*String*/ (null);
RDebugUtils.currentLine=9699333;
 //BA.debugLineNum = 9699333;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.timerclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="timerclass";
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="Private tmr As Timer";
_tmr = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="End Sub";
return "";
}
public String  _tmr_tick(b4j.example.timerclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="timerclass";
if (Debug.shouldDelegate(ba, "tmr_tick", false))
	 {return ((String) Debug.delegate(ba, "tmr_tick", null));}
String _time = "";
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Private Sub tmr_Tick";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="Dim time As String";
_time = "";
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="DateTime.DateFormat=\"EEEE, dd MMMM yyyy HH:mm\"";
__c.DateTime.setDateFormat("EEEE, dd MMMM yyyy HH:mm");
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="time = \"     \" & DateTime.Date(DateTime.Now) 'fun";
_time = "     "+__c.DateTime.Date(__c.DateTime.getNow());
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="lbl.Text = time";
__ref._lbl /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_time);
RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="End Sub";
return "";
}
}