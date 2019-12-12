package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xcombobox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.b4xcombobox", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xcombobox.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvvvvvvvv3 = "";
public Object _vvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvvvvv6 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public anywheresoftware.b4j.objects.ComboBoxWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public Object _vvvvvvvvvvvvvvvvvvvvvv2 = null;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
public b4j.example.cssutils _vvvvvvvv0 = null;
public b4j.example.dateutils _vvvvvvvvv1 = null;
public b4j.example.main _main = null;
public b4j.example.scorebord _vvvvvvvvv2 = null;
public b4j.example.func _vvvvvvvvv3 = null;
public b4j.example.parseconfig _vvvvvvvvv4 = null;
public b4j.example.funcinet _vvvvvvvvv5 = null;
public b4j.example.httputils2service _vvvvvvvvv6 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 56;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Width";
_vvvvvvvvvvvv5.GetView((int) (0)).SetLayoutAnimated((int) (0),0,0,_width,_height);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 4;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvv4 = new Object();
 //BA.debugLineNum = 5;BA.debugLine="Public mBase As B4XView";
_vvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private xui As XUI 'ignore";
_vvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 7;BA.debugLine="Private LastSelectedIndex As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
 //BA.debugLineNum = 9;BA.debugLine="Public cmbBox As ComboBox";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4j.objects.ComboBoxWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Public DelayBeforeChangeEvent As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
 //BA.debugLineNum = 19;BA.debugLine="Private DelayIndex As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
 //BA.debugLineNum = 20;BA.debugLine="Public Tag As Object";
_vvvvvvvvvvvvvvvvvvvvvv2 = new Object();
 //BA.debugLineNum = 21;BA.debugLine="Public B4iCancelButton As String = \"Cancel\"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "Cancel";
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _cmbbox_selectedindexchanged(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Private Sub CmbBox_SelectedIndexChanged(Index As I";
 //BA.debugLineNum = 122;BA.debugLine="RaiseEvent";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xbox = null;
 //BA.debugLineNum = 32;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 33;BA.debugLine="mBase = Base";
_vvvvvvvvvvvv5.setObject((java.lang.Object)(_base));
 //BA.debugLineNum = 34;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvvvvvvvvvvvvvvvvv2 = _vvvvvvvvvvvv5.getTag();
 //BA.debugLineNum = 34;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvvvvvvv5.setTag(this);
 //BA.debugLineNum = 35;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl.setObject((java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 37;BA.debugLine="cmbBox.Initialize(\"cmbBox\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Initialize(ba,"cmbBox");
 //BA.debugLineNum = 38;BA.debugLine="Dim xbox As B4XView = cmbBox";
_xbox = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xbox.setObject((java.lang.Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getObject()));
 //BA.debugLineNum = 39;BA.debugLine="xbox.Font = xlbl.Font";
_xbox.setFont(_xlbl.getFont());
 //BA.debugLineNum = 40;BA.debugLine="mBase.AddView(cmbBox, 0, 0, mBase.Width, mBase.He";
_vvvvvvvvvvvv5.AddView((javafx.scene.Node)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getObject()),0,0,_vvvvvvvvvvvv5.getWidth(),_vvvvvvvvvvvv5.getHeight());
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(int _index) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Public Sub GetItem(Index As Int) As String";
 //BA.debugLineNum = 99;BA.debugLine="Return cmbBox.Items.Get(Index)";
if (true) return BA.ObjectToString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getItems().Get(_index));
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public int  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Public Sub getSelectedIndex As Int";
 //BA.debugLineNum = 77;BA.debugLine="Return cmbBox.SelectedIndex";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getSelectedIndex();
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 25;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvv3 = _eventname;
 //BA.debugLineNum = 26;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvv4 = _callback;
 //BA.debugLineNum = 27;BA.debugLine="LastSelectedIndex = -1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) (-1);
 //BA.debugLineNum = 28;BA.debugLine="If xui.IsB4J Then DelayBeforeChangeEvent = 500";
if (_vvvvvvvvvvvv6.getIsB4J()) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = (int) (500);};
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public void  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
ResumableSub_RaiseEvent rsub = new ResumableSub_RaiseEvent(this);
rsub.resume(ba, null);
}
public static class ResumableSub_RaiseEvent extends BA.ResumableSub {
public ResumableSub_RaiseEvent(b4j.example.b4xcombobox parent) {
this.parent = parent;
}
b4j.example.b4xcombobox parent;
int _index = 0;
int _myindex = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 108;BA.debugLine="Dim index As Int = getSelectedIndex";
_index = parent._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4();
 //BA.debugLineNum = 109;BA.debugLine="If LastSelectedIndex = index Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5==_index) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 110;BA.debugLine="If DelayBeforeChangeEvent > 0 Then";
if (true) break;

case 7:
//if
this.state = 16;
if (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7>0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 111;BA.debugLine="DelayIndex = DelayIndex + 1";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (int) (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0+1);
 //BA.debugLineNum = 112;BA.debugLine="Dim MyIndex As Int = DelayIndex";
_myindex = parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
 //BA.debugLineNum = 113;BA.debugLine="Sleep(DelayBeforeChangeEvent)";
parent.__c.Sleep(ba,this,parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
this.state = 17;
return;
case 17:
//C
this.state = 10;
;
 //BA.debugLineNum = 114;BA.debugLine="If MyIndex <> DelayIndex Then Return";
if (true) break;

case 10:
//if
this.state = 15;
if (_myindex!=parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) return ;
if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 116;BA.debugLine="LastSelectedIndex = index";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _index;
 //BA.debugLineNum = 117;BA.debugLine="CallSub2(mCallBack, mEventName & \"_SelectedIndexC";
parent.__c.CallSubNew2(ba,parent._vvvvvvvvvvvv4,parent._vvvvvvvvvvvv3+"_SelectedIndexChanged",(Object)(_index));
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvv7(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Public Sub SetItems(Items As List)";
 //BA.debugLineNum = 61;BA.debugLine="cmbBox.Items.Clear";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getItems().Clear();
 //BA.debugLineNum = 62;BA.debugLine="cmbBox.Items.AddAll(Items)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getItems().AddAll(_items);
 //BA.debugLineNum = 72;BA.debugLine="If Items.Size > 0 Then setSelectedIndex(0)";
if (_items.getSize()>0) { 
_setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4((int) (0));};
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(int _i) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Public Sub setSelectedIndex(i As Int)";
 //BA.debugLineNum = 84;BA.debugLine="LastSelectedIndex = i";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _i;
 //BA.debugLineNum = 86;BA.debugLine="cmbBox.SelectedIndex = i";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setSelectedIndex(_i);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
