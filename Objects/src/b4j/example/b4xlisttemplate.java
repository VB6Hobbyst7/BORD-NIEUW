package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xlisttemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.b4xlisttemplate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xlisttemplate.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvv5 = null;
public b4j.example.customlistview _customlistview1 = null;
public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = "";
public b4j.example.b4xdialog _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
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
 //BA.debugLineNum = 4;BA.debugLine="Public CustomListView1 As CustomListView";
_customlistview1 = new b4j.example.customlistview();
 //BA.debugLineNum = 5;BA.debugLine="Public Options As List";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Public SelectedItem As String";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = "";
 //BA.debugLineNum = 7;BA.debugLine="Private xDialog As B4XDialog";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new b4j.example.b4xdialog();
 //BA.debugLineNum = 8;BA.debugLine="Public AllowMultiSelection As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
 //BA.debugLineNum = 9;BA.debugLine="Public SelectionColor As Int = 0xAA0086FF";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = (int) (0xaa0086ff);
 //BA.debugLineNum = 10;BA.debugLine="Public SelectedItems As List";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 11;BA.debugLine="Public MultiSelectionMinimum As Int = 0";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (int) (0);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public String  _customlistview1_itemclick(int _index,Object _value) throws Exception{
b4j.example.customlistview._clvitem _item = null;
 //BA.debugLineNum = 76;BA.debugLine="Private Sub CustomListView1_ItemClick (Index As In";
 //BA.debugLineNum = 77;BA.debugLine="If Value = \"\" Then Return";
if ((_value).equals((Object)(""))) { 
if (true) return "";};
 //BA.debugLineNum = 78;BA.debugLine="If AllowMultiSelection Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) { 
 //BA.debugLineNum = 79;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
_item = _customlistview1._getrawlistitem(_index);
 //BA.debugLineNum = 80;BA.debugLine="SelectItem (Item, True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(_item,__c.True);
 }else {
 //BA.debugLineNum = 82;BA.debugLine="SelectedItem = Value";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = BA.ObjectToString(_value);
 //BA.debugLineNum = 83;BA.debugLine="SelectedItems.Clear";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Clear();
 //BA.debugLineNum = 84;BA.debugLine="SelectedItems.Add(Value)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Add(_value);
 //BA.debugLineNum = 85;BA.debugLine="xDialog.Close(xui.DialogResponse_Positive)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*boolean*/ (_vvvvvvvvvvvv6.DialogResponse_Positive);
 };
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(int _result) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4j.example.b4xdialog _dialog) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
 //BA.debugLineNum = 38;BA.debugLine="Return mBase";
if (true) return _vvvvvvvvvvvv5;
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _sv = null;
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 15;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
_vvvvvvvvvvvv5 = _vvvvvvvvvvvv6.CreatePanel(ba,"mBase");
 //BA.debugLineNum = 16;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 300dip)";
_vvvvvvvvvvvv5.SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (300)));
 //BA.debugLineNum = 17;BA.debugLine="mBase.LoadLayout(\"ListTemplate\")";
_vvvvvvvvvvvv5.LoadLayout("ListTemplate",ba);
 //BA.debugLineNum = 18;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
_vvvvvvvvvvvv5.SetColorAndBorder(_vvvvvvvvvvvv6.Color_Transparent,0,(int) (0),0);
 //BA.debugLineNum = 19;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
_customlistview1._sv.SetColorAndBorder(_vvvvvvvvvvvv6.Color_Transparent,0,(int) (0),0);
 //BA.debugLineNum = 20;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = 0xFF";
_customlistview1._defaulttextbackgroundcolor = (int) (0xff555555);
 //BA.debugLineNum = 21;BA.debugLine="CustomListView1.DefaultTextColor = xui.Color_Whit";
_customlistview1._defaulttextcolor = _vvvvvvvvvvvv6.Color_White;
 //BA.debugLineNum = 23;BA.debugLine="Dim sv As Node = CustomListView1.sv";
_sv = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
_sv.setObject((javafx.scene.Node)(_customlistview1._sv.getObject()));
 //BA.debugLineNum = 24;BA.debugLine="sv.StyleClasses.Add(\"b4xdialog\")";
_sv.getStyleClasses().Add((Object)("b4xdialog"));
 //BA.debugLineNum = 26;BA.debugLine="Options.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Initialize();
 //BA.debugLineNum = 27;BA.debugLine="SelectedItems.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Initialize();
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(int _width,int _height) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
 //BA.debugLineNum = 32;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
_vvvvvvvvvvvv5.SetLayoutAnimated((int) (0),0,0,_width,_height);
 //BA.debugLineNum = 33;BA.debugLine="CustomListView1.Base_Resize(Width, Height)";
_customlistview1._base_resize(_width,_height);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(b4j.example.customlistview._clvitem _item,boolean _toggle) throws Exception{
int _index = 0;
boolean _selected = false;
 //BA.debugLineNum = 59;BA.debugLine="Private Sub SelectItem (Item As CLVItem, Toggle As";
 //BA.debugLineNum = 60;BA.debugLine="Dim index As Int = SelectedItems.IndexOf(Item.Val";
_index = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.IndexOf(_item.Value);
 //BA.debugLineNum = 61;BA.debugLine="Dim Selected As Boolean = index > -1";
_selected = _index>-1;
 //BA.debugLineNum = 62;BA.debugLine="If Toggle Then Selected = Not(Selected)";
if (_toggle) { 
_selected = __c.Not(_selected);};
 //BA.debugLineNum = 63;BA.debugLine="If Selected Then";
if (_selected) { 
 //BA.debugLineNum = 64;BA.debugLine="If Not(Toggle) Then Item.Panel.Color = Selection";
if (__c.Not(_toggle)) { 
_item.Panel.setColor(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);};
 //BA.debugLineNum = 65;BA.debugLine="Item.Color = CustomListView1.DefaultTextBackgrou";
_item.Color = _customlistview1._defaulttextbackgroundcolor;
 //BA.debugLineNum = 66;BA.debugLine="If index = -1 Then SelectedItems.Add(Item.Value)";
if (_index==-1) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Add(_item.Value);};
 }else {
 //BA.debugLineNum = 68;BA.debugLine="Item.Color = SelectionColor";
_item.Color = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6;
 //BA.debugLineNum = 69;BA.debugLine="If Not(Toggle) Then Item.Panel.Color = CustomLis";
if (__c.Not(_toggle)) { 
_item.Panel.setColor(_customlistview1._defaulttextbackgroundcolor);};
 //BA.debugLineNum = 70;BA.debugLine="If index > -1 Then SelectedItems.RemoveAt(index)";
if (_index>-1) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.RemoveAt(_index);};
 };
 //BA.debugLineNum = 72;BA.debugLine="xDialog.SetButtonState(xui.DialogResponse_Positiv";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*String*/ (_vvvvvvvvvvvv6.DialogResponse_Positive,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getSize()>=_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.example.b4xdialog _dialog) throws Exception{
ResumableSub_Show rsub = new ResumableSub_Show(this,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.example.b4xlisttemplate parent,b4j.example.b4xdialog _dialog) {
this.parent = parent;
this._dialog = _dialog;
}
b4j.example.b4xlisttemplate parent;
b4j.example.b4xdialog _dialog;
Object _opt = null;
int _i = 0;
b4j.example.customlistview._clvitem _item = null;
anywheresoftware.b4a.BA.IterableList group3;
int index3;
int groupLen3;
int step8;
int limit8;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 42;BA.debugLine="xDialog = Dialog";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _dialog;
 //BA.debugLineNum = 43;BA.debugLine="CustomListView1.Clear";
parent._customlistview1._clear();
 //BA.debugLineNum = 44;BA.debugLine="For Each opt As Object In Options";
if (true) break;

case 1:
//for
this.state = 4;
group3 = parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
index3 = 0;
groupLen3 = group3.getSize();
this.state = 12;
if (true) break;

case 12:
//C
this.state = 4;
if (index3 < groupLen3) {
this.state = 3;
_opt = group3.Get(index3);}
if (true) break;

case 13:
//C
this.state = 12;
index3++;
if (true) break;

case 3:
//C
this.state = 13;
 //BA.debugLineNum = 45;BA.debugLine="CustomListView1.AddTextItem(opt, opt)";
parent._customlistview1._addtextitem(_opt,_opt);
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 47;BA.debugLine="If AllowMultiSelection Then";

case 4:
//if
this.state = 11;
if (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 48;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,this,(int) (20));
this.state = 14;
return;
case 14:
//C
this.state = 7;
;
 //BA.debugLineNum = 49;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
if (true) break;

case 7:
//for
this.state = 10;
step8 = 1;
limit8 = (int) (parent._customlistview1._getsize()-1);
_i = (int) (0) ;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 10;
if ((step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8)) this.state = 9;
if (true) break;

case 16:
//C
this.state = 15;
_i = ((int)(0 + _i + step8)) ;
if (true) break;

case 9:
//C
this.state = 16;
 //BA.debugLineNum = 50;BA.debugLine="Dim item As CLVItem = CustomListView1.GetRawLis";
_item = parent._customlistview1._getrawlistitem(_i);
 //BA.debugLineNum = 51;BA.debugLine="SelectItem (item, False)";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(_item,parent.__c.False);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = -1;
;
 //BA.debugLineNum = 54;BA.debugLine="Dialog.InternalAddStubToCLVIfNeeded(CustomListVie";
_dialog._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*String*/ (parent._customlistview1,parent._customlistview1._defaulttextbackgroundcolor);
 //BA.debugLineNum = 55;BA.debugLine="SelectedItem = \"\"";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = "";
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "DIALOGCLOSED"))
	return _dialogclosed(((Number)args[0]).intValue());
if (BA.fastSubCompare(sub, "GETPANEL"))
	return _getpanel((b4j.example.b4xdialog) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
