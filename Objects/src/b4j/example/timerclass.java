package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class timerclass extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.timerclass", this);
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
public b4j.example.funcinet _funcinet = null;
public b4j.example.getnode _getnode = null;
public b4j.example.parseconfig _parseconfig = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 3;BA.debugLine="Private tmr As Timer";
_tmr = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 5;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.LabelWrapper _label) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(label As Label)";
 //BA.debugLineNum = 10;BA.debugLine="tmr.Initialize(\"tmr\", 1000*60)";
_tmr.Initialize(ba,"tmr",(long) (1000*60));
 //BA.debugLineNum = 11;BA.debugLine="tmr.Enabled = True";
_tmr.setEnabled(__c.True);
 //BA.debugLineNum = 12;BA.debugLine="lbl = label";
_lbl = _label;
 //BA.debugLineNum = 13;BA.debugLine="tmr_Tick";
_tmr_tick();
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public String  _tmr_tick() throws Exception{
String _time = "";
 //BA.debugLineNum = 16;BA.debugLine="Private Sub tmr_Tick";
 //BA.debugLineNum = 17;BA.debugLine="Dim time As String";
_time = "";
 //BA.debugLineNum = 18;BA.debugLine="DateTime.DateFormat=\"EEEE, dd MMMM yyyy HH:mm\"";
__c.DateTime.setDateFormat("EEEE, dd MMMM yyyy HH:mm");
 //BA.debugLineNum = 19;BA.debugLine="time = \"     \" & DateTime.Date(DateTime.Now) 'fun";
_time = "     "+__c.DateTime.Date(__c.DateTime.getNow());
 //BA.debugLineNum = 20;BA.debugLine="lbl.Text = time";
_lbl.setText(_time);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
