package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class scorebord_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,259);
if (RapidSub.canDelegate("application_error")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 259;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(4);
 BA.debugLineNum = 260;BA.debugLine="Return True";
Debug.ShouldStop(8);
if (true) return scorebord.__c.getField(true,"True");
 BA.debugLineNum = 261;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _asjo(RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("asJO (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,840);
if (RapidSub.canDelegate("asjo")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","asjo", _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 840;BA.debugLine="Private Sub asJO(o As JavaObject) As JavaObject";
Debug.ShouldStop(128);
 BA.debugLineNum = 841;BA.debugLine="Return o";
Debug.ShouldStop(256);
if (true) return _o;
 BA.debugLineNum = 842;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_a_begint_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("btn_a_begint_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,726);
if (RapidSub.canDelegate("btn_a_begint_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","btn_a_begint_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 726;BA.debugLine="Sub btn_a_begint_MouseReleased (EventData As Mouse";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 728;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_annuleer_nieuwe_partij_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("btn_annuleer_nieuwe_partij_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,774);
if (RapidSub.canDelegate("btn_annuleer_nieuwe_partij_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","btn_annuleer_nieuwe_partij_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 774;BA.debugLine="Sub btn_annuleer_nieuwe_partij_MouseReleased (Even";
Debug.ShouldStop(32);
 BA.debugLineNum = 775;BA.debugLine="pNieuwePartijDialog.Close(XUI.DialogResponse_Canc";
Debug.ShouldStop(64);
scorebord._pnieuwepartijdialog.runClassMethod (b4j.example.b4xdialog.class, "_close" /*RemoteObject*/ ,(Object)(scorebord._xui.getField(true,"DialogResponse_Cancel")));
 BA.debugLineNum = 777;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_b_begint_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("btn_b_begint_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,730);
if (RapidSub.canDelegate("btn_b_begint_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","btn_b_begint_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 730;BA.debugLine="Sub btn_b_begint_MouseReleased (EventData As Mouse";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 732;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_exit_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("btn_exit_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,389);
if (RapidSub.canDelegate("btn_exit_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","btn_exit_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 389;BA.debugLine="Sub btn_exit_MouseReleased (EventData As MouseEven";
Debug.ShouldStop(16);
 BA.debugLineNum = 390;BA.debugLine="ExitApplication";
Debug.ShouldStop(32);
scorebord.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 391;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_nieuwe_partij_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("btn_nieuwe_partij_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,765);
if (RapidSub.canDelegate("btn_nieuwe_partij_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","btn_nieuwe_partij_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 765;BA.debugLine="Sub btn_nieuwe_partij_MouseReleased (EventData As";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 766;BA.debugLine="pNieuwePartijDialog.Close(XUI.DialogResponse_Posi";
Debug.ShouldStop(536870912);
scorebord._pnieuwepartijdialog.runClassMethod (b4j.example.b4xdialog.class, "_close" /*RemoteObject*/ ,(Object)(scorebord._xui.getField(true,"DialogResponse_Positive")));
 BA.debugLineNum = 768;BA.debugLine="resetBoard(False)";
Debug.ShouldStop(-2147483648);
_resetboard(scorebord.__c.getField(true,"False"));
 BA.debugLineNum = 769;BA.debugLine="If chk_add_player.Checked Then";
Debug.ShouldStop(1);
if (scorebord._chk_add_player.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 770;BA.debugLine="iets";
Debug.ShouldStop(2);
_iets();
 };
 BA.debugLineNum = 772;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkmatchwonp1() throws Exception{
try {
		Debug.PushSubsStack("checkMatchWonP1 (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,669);
if (RapidSub.canDelegate("checkmatchwonp1")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","checkmatchwonp1");}
RemoteObject _caroms = RemoteObject.createImmutable(0);
RemoteObject _make = RemoteObject.createImmutable(0);
 BA.debugLineNum = 669;BA.debugLine="Sub checkMatchWonP1";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 670;BA.debugLine="Dim caroms, make As Int";
Debug.ShouldStop(536870912);
_caroms = RemoteObject.createImmutable(0);Debug.locals.put("caroms", _caroms);
_make = RemoteObject.createImmutable(0);Debug.locals.put("make", _make);
 BA.debugLineNum = 672;BA.debugLine="caroms = lbl_player_one_100.Text&lbl_player_one_1";
Debug.ShouldStop(-2147483648);
_caroms = BA.numberCast(int.class, RemoteObject.concat(scorebord._lbl_player_one_100.runMethod(true,"getText"),scorebord._lbl_player_one_10.runMethod(true,"getText"),scorebord._lbl_player_one_1.runMethod(true,"getText")));Debug.locals.put("caroms", _caroms);
 BA.debugLineNum = 673;BA.debugLine="make = lbl_player_one_make_100.text&lbl_player_on";
Debug.ShouldStop(1);
_make = BA.numberCast(int.class, RemoteObject.concat(scorebord._lbl_player_one_make_100.runMethod(true,"getText"),scorebord._lbl_player_one_make_10.runMethod(true,"getText"),scorebord._lbl_player_one_make_1.runMethod(true,"getText")));Debug.locals.put("make", _make);
 BA.debugLineNum = 675;BA.debugLine="If caroms >= make Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("g",_caroms,BA.numberCast(double.class, _make))) { 
 BA.debugLineNum = 676;BA.debugLine="Log($\"Speler 1 wint, nabeurt voor speler 2\"$)";
Debug.ShouldStop(8);
scorebord.__c.runVoidMethod ("Log",(Object)((RemoteObject.createImmutable("Speler 1 wint, nabeurt voor speler 2"))));
 };
 BA.debugLineNum = 678;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkmatchwonp2() throws Exception{
try {
		Debug.PushSubsStack("checkMatchWonP2 (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,680);
if (RapidSub.canDelegate("checkmatchwonp2")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","checkmatchwonp2");}
RemoteObject _caroms = RemoteObject.createImmutable(0);
RemoteObject _make = RemoteObject.createImmutable(0);
 BA.debugLineNum = 680;BA.debugLine="Sub checkMatchWonP2";
Debug.ShouldStop(128);
 BA.debugLineNum = 681;BA.debugLine="Dim caroms, make As Int";
Debug.ShouldStop(256);
_caroms = RemoteObject.createImmutable(0);Debug.locals.put("caroms", _caroms);
_make = RemoteObject.createImmutable(0);Debug.locals.put("make", _make);
 BA.debugLineNum = 683;BA.debugLine="caroms = lbl_player_two_100.Text&lbl_player_two_1";
Debug.ShouldStop(1024);
_caroms = BA.numberCast(int.class, RemoteObject.concat(scorebord._lbl_player_two_100.runMethod(true,"getText"),scorebord._lbl_player_two_10.runMethod(true,"getText"),scorebord._lbl_player_two_1.runMethod(true,"getText")));Debug.locals.put("caroms", _caroms);
 BA.debugLineNum = 684;BA.debugLine="make = lbl_player_two_make_100.text&lbl_player_tw";
Debug.ShouldStop(2048);
_make = BA.numberCast(int.class, RemoteObject.concat(scorebord._lbl_player_two_make_100.runMethod(true,"getText"),scorebord._lbl_player_two_make_10.runMethod(true,"getText"),scorebord._lbl_player_two_make_1.runMethod(true,"getText")));Debug.locals.put("make", _make);
 BA.debugLineNum = 686;BA.debugLine="If caroms >= make Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("g",_caroms,BA.numberCast(double.class, _make))) { 
 BA.debugLineNum = 687;BA.debugLine="Log($\"Speler 2 wint, geen nabeurt voor speler 1\"";
Debug.ShouldStop(16384);
scorebord.__c.runVoidMethod ("Log",(Object)((RemoteObject.createImmutable("Speler 2 wint, geen nabeurt voor speler 1"))));
 };
 BA.debugLineNum = 689;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _drawpromote(RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("drawPromote (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,790);
if (RapidSub.canDelegate("drawpromote")) { b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","drawpromote", _x, _y); return;}
ResumableSub_drawPromote rsub = new ResumableSub_drawPromote(null,_x,_y);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_drawPromote extends BA.ResumableSub {
public ResumableSub_drawPromote(b4j.example.scorebord parent,RemoteObject _x,RemoteObject _y) {
this.parent = parent;
this._x = _x;
this._y = _y;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.example.scorebord parent;
RemoteObject _x;
RemoteObject _y;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("drawPromote (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,790);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 791;BA.debugLine="pn_promote.SetLayoutAnimated(0, x, y, pn_promote.";
Debug.ShouldStop(4194304);
parent._pn_promote.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(_x),(Object)(_y),(Object)(parent._pn_promote.runMethod(true,"getWidth")),(Object)(parent._pn_promote.runMethod(true,"getHeight")));
 BA.debugLineNum = 792;BA.debugLine="Sleep(0)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("Sleep",scorebord.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "scorebord", "drawpromote"),BA.numberCast(int.class, 0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 794;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
public static RemoteObject  _edt_temaken_a_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("edt_temaken_a_TextChanged (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,734);
if (RapidSub.canDelegate("edt_temaken_a_textchanged")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","edt_temaken_a_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 734;BA.debugLine="Sub edt_temaken_a_TextChanged (Old As String, New";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 735;BA.debugLine="edt_temaken_a.Text =  func.testNumber(Old, New)";
Debug.ShouldStop(1073741824);
scorebord._edt_temaken_a.runMethod(true,"setText",scorebord._func.runMethod(true,"_testnumber" /*RemoteObject*/ ,(Object)(_old),(Object)(_new)));
 BA.debugLineNum = 736;BA.debugLine="edt_temaken_a.SetSelection(edt_temaken_a.Text.Len";
Debug.ShouldStop(-2147483648);
scorebord._edt_temaken_a.runVoidMethod ("SetSelection",(Object)(scorebord._edt_temaken_a.runMethod(true,"getText").runMethod(true,"length")),(Object)(scorebord._edt_temaken_a.runMethod(true,"getText").runMethod(true,"length")));
 BA.debugLineNum = 738;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edt_temaken_b_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("edt_temaken_b_TextChanged (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,740);
if (RapidSub.canDelegate("edt_temaken_b_textchanged")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","edt_temaken_b_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 740;BA.debugLine="Sub edt_temaken_b_TextChanged (Old As String, New";
Debug.ShouldStop(8);
 BA.debugLineNum = 741;BA.debugLine="edt_temaken_b.Text =  func.testNumber(Old, New)";
Debug.ShouldStop(16);
scorebord._edt_temaken_b.runMethod(true,"setText",scorebord._func.runMethod(true,"_testnumber" /*RemoteObject*/ ,(Object)(_old),(Object)(_new)));
 BA.debugLineNum = 742;BA.debugLine="edt_temaken_b.SetSelection(edt_temaken_b.Text.Len";
Debug.ShouldStop(32);
scorebord._edt_temaken_b.runVoidMethod ("SetSelection",(Object)(scorebord._edt_temaken_b.runMethod(true,"getText").runMethod(true,"length")),(Object)(scorebord._edt_temaken_b.runMethod(true,"getText").runMethod(true,"length")));
 BA.debugLineNum = 743;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrandomimage() throws Exception{
try {
		Debug.PushSubsStack("getRandomImage (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,170);
if (RapidSub.canDelegate("getrandomimage")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","getrandomimage");}
 BA.debugLineNum = 170;BA.debugLine="Sub getRandomImage";
Debug.ShouldStop(512);
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _iets() throws Exception{
try {
		Debug.PushSubsStack("iets (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,694);
if (RapidSub.canDelegate("iets")) { b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","iets"); return;}
ResumableSub_iets rsub = new ResumableSub_iets(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_iets extends BA.ResumableSub {
public ResumableSub_iets(b4j.example.scorebord parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.example.scorebord parent;
RemoteObject _dlg = RemoteObject.declareNull("b4j.example.b4xdialog");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("iets (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,694);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 695;BA.debugLine="Dim dlg As B4XDialog";
Debug.ShouldStop(4194304);
_dlg = RemoteObject.createNew ("b4j.example.b4xdialog");Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 696;BA.debugLine="dlg.Initialize (Base)";
Debug.ShouldStop(8388608);
_dlg.runClassMethod (b4j.example.b4xdialog.class, "_initialize" /*RemoteObject*/ ,scorebord.ba,(Object)(parent._base));
 BA.debugLineNum = 697;BA.debugLine="Dim p As B4XView = XUI.CreatePanel(\"\")";
Debug.ShouldStop(16777216);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = parent._xui.runMethod(false,"CreatePanel",scorebord.ba,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 698;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 600dip)";
Debug.ShouldStop(33554432);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))));
 BA.debugLineNum = 699;BA.debugLine="p.LoadLayout(\"players\")";
Debug.ShouldStop(67108864);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("players")),scorebord.ba);
 BA.debugLineNum = 700;BA.debugLine="dlg.Title = \"Spelers Invoer\"";
Debug.ShouldStop(134217728);
_dlg.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Spelers Invoer")));
 BA.debugLineNum = 701;BA.debugLine="dlg.PutAtTop = True 'put the dialog at the top of";
Debug.ShouldStop(268435456);
_dlg.setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 702;BA.debugLine="Wait For (dlg.ShowCustom(p, \"OK\", \"\", \"CANCEL\"))";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", scorebord.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "scorebord", "iets"), _dlg.runClassMethod (b4j.example.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 703;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 706;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
public static void  _complete(RemoteObject _result) throws Exception{
}
public static RemoteObject  _initpanels() throws Exception{
try {
		Debug.PushSubsStack("initPanels (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,148);
if (RapidSub.canDelegate("initpanels")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","initpanels");}
 BA.debugLineNum = 148;BA.debugLine="Sub initPanels";
Debug.ShouldStop(524288);
 BA.debugLineNum = 149;BA.debugLine="pNieuwePartijDialog.Initialize (Base)";
Debug.ShouldStop(1048576);
scorebord._pnieuwepartijdialog.runClassMethod (b4j.example.b4xdialog.class, "_initialize" /*RemoteObject*/ ,scorebord.ba,(Object)(scorebord._base));
 BA.debugLineNum = 150;BA.debugLine="pNieuwePartij = XUI.CreatePanel(\"\")";
Debug.ShouldStop(2097152);
scorebord._pnieuwepartij = scorebord._xui.runMethod(false,"CreatePanel",scorebord.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 151;BA.debugLine="pNieuwePartij.SetLayoutAnimated(0, 100dip, 0, 100";
Debug.ShouldStop(4194304);
scorebord._pnieuwepartij.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, scorebord.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100))))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, scorebord.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1000))))),(Object)(BA.numberCast(double.class, scorebord.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 800))))));
 BA.debugLineNum = 152;BA.debugLine="pNieuwePartij.LoadLayout(\"nieuwe_partij\")";
Debug.ShouldStop(8388608);
scorebord._pnieuwepartij.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("nieuwe_partij")),scorebord.ba);
 BA.debugLineNum = 153;BA.debugLine="pNieuwePartijDialog.Title = \"Nieuwe Partij\"";
Debug.ShouldStop(16777216);
scorebord._pnieuwepartijdialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Nieuwe Partij")));
 BA.debugLineNum = 154;BA.debugLine="pNieuwePartijDialog.PutAtTop = False 'put the dia";
Debug.ShouldStop(33554432);
scorebord._pnieuwepartijdialog.setField ("_putattop" /*RemoteObject*/ ,scorebord.__c.getField(true,"False"));
 BA.debugLineNum = 156;BA.debugLine="pn_promote_top = 1130 'pn_promote.Top";
Debug.ShouldStop(134217728);
scorebord._pn_promote_top = BA.numberCast(double.class, 1130);
 BA.debugLineNum = 157;BA.debugLine="pn_promote_left = 20 'pn_promote.Left";
Debug.ShouldStop(268435456);
scorebord._pn_promote_left = BA.numberCast(double.class, 20);
 BA.debugLineNum = 161;BA.debugLine="inactivecls.frm = frm";
Debug.ShouldStop(1);
scorebord._inactivecls.setField ("_frm" /*RemoteObject*/ ,scorebord._frm);
 BA.debugLineNum = 162;BA.debugLine="inactivecls.pn_promote = pn_promote";
Debug.ShouldStop(2);
scorebord._inactivecls.setField ("_pn_promote" /*RemoteObject*/ ,scorebord._pn_promote);
 BA.debugLineNum = 163;BA.debugLine="inactivecls.pnlWidth = pn_promote.Width";
Debug.ShouldStop(4);
scorebord._inactivecls.setField ("_pnlwidth" /*RemoteObject*/ ,scorebord._pn_promote.runMethod(true,"getWidth"));
 BA.debugLineNum = 164;BA.debugLine="inactivecls.pnlHeight = pn_promote.Height";
Debug.ShouldStop(8);
scorebord._inactivecls.setField ("_pnlheight" /*RemoteObject*/ ,scorebord._pn_promote.runMethod(true,"getHeight"));
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lastclick() throws Exception{
try {
		Debug.PushSubsStack("lastClick (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,287);
if (RapidSub.canDelegate("lastclick")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lastclick");}
 BA.debugLineNum = 287;BA.debugLine="Sub lastClick";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 288;BA.debugLine="inactivecls.lastClick = DateTime.Now";
Debug.ShouldStop(-2147483648);
scorebord._inactivecls.setField ("_lastclick" /*RemoteObject*/ ,scorebord.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 289;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_close_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbl_close_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,781);
if (RapidSub.canDelegate("lbl_close_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lbl_close_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 781;BA.debugLine="Sub lbl_close_MouseReleased (EventData As MouseEve";
Debug.ShouldStop(4096);
 BA.debugLineNum = 782;BA.debugLine="ExitApplication";
Debug.ShouldStop(8192);
scorebord.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 783;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_innings_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbl_innings_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,366);
if (RapidSub.canDelegate("lbl_innings_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lbl_innings_mousereleased", _eventdata);}
RemoteObject _points = RemoteObject.createImmutable(0);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 366;BA.debugLine="Sub lbl_innings_MouseReleased (EventData As MouseE";
Debug.ShouldStop(8192);
 BA.debugLineNum = 367;BA.debugLine="Dim points As Int = lbl_innings.Text";
Debug.ShouldStop(16384);
_points = BA.numberCast(int.class, scorebord._lbl_innings.runMethod(true,"getText"));Debug.locals.put("points", _points);Debug.locals.put("points", _points);
 BA.debugLineNum = 368;BA.debugLine="If EventData.PrimaryButtonPressed Then";
Debug.ShouldStop(32768);
if (_eventdata.runMethod(true,"getPrimaryButtonPressed").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 369;BA.debugLine="points = points + 1";
Debug.ShouldStop(65536);
_points = RemoteObject.solve(new RemoteObject[] {_points,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("points", _points);
 }else {
 BA.debugLineNum = 371;BA.debugLine="points = points - 1";
Debug.ShouldStop(262144);
_points = RemoteObject.solve(new RemoteObject[] {_points,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("points", _points);
 };
 BA.debugLineNum = 373;BA.debugLine="If points = -1 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_points,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 374;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 377;BA.debugLine="func.innigs = points";
Debug.ShouldStop(16777216);
scorebord._func._innigs /*RemoteObject*/  = _points;
 BA.debugLineNum = 378;BA.debugLine="lbl_innings.Text = func.padString(points, \"0\", 0,";
Debug.ShouldStop(33554432);
scorebord._lbl_innings.runMethod(true,"setText",scorebord._func.runMethod(true,"_padstring" /*RemoteObject*/ ,(Object)(BA.NumberToString(_points)),(Object)(BA.ObjectToString("0")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 379;BA.debugLine="func.calcMoyenne(lbl_player_one_moyenne, lbl_play";
Debug.ShouldStop(67108864);
scorebord._func.runVoidMethod ("_calcmoyenne" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_one_moyenne),(Object)(scorebord._lbl_player_two_moyenne));
 BA.debugLineNum = 380;BA.debugLine="func.processHs(\"all\")";
Debug.ShouldStop(134217728);
scorebord._func.runVoidMethod ("_processhs" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("all")));
 BA.debugLineNum = 381;BA.debugLine="func.inngSet = 1";
Debug.ShouldStop(268435456);
scorebord._func._inngset /*RemoteObject*/  = BA.numberCast(int.class, 1);
 BA.debugLineNum = 383;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_player_one_1_mouseentered(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbl_player_one_1_MouseEntered (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,419);
if (RapidSub.canDelegate("lbl_player_one_1_mouseentered")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lbl_player_one_1_mouseentered", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 419;BA.debugLine="Sub lbl_player_one_1_MouseEntered (EventData As Mo";
Debug.ShouldStop(4);
 BA.debugLineNum = 422;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_player_one_1_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbl_player_one_1_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,291);
if (RapidSub.canDelegate("lbl_player_one_1_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lbl_player_one_1_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 291;BA.debugLine="Sub lbl_player_one_1_MouseReleased (EventData As M";
Debug.ShouldStop(4);
 BA.debugLineNum = 292;BA.debugLine="setP1Name";
Debug.ShouldStop(8);
_setp1name();
 BA.debugLineNum = 293;BA.debugLine="If EventData.PrimaryButtonPressed Then";
Debug.ShouldStop(16);
if (_eventdata.runMethod(true,"getPrimaryButtonPressed").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 294;BA.debugLine="func.calcScorePlayerOne(1)";
Debug.ShouldStop(32);
scorebord._func.runVoidMethod ("_calcscoreplayerone" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)));
 }else 
{ BA.debugLineNum = 295;BA.debugLine="Else If EventData.SecondaryButtonPressed Then";
Debug.ShouldStop(64);
if (_eventdata.runMethod(true,"getSecondaryButtonPressed").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 296;BA.debugLine="func.calcScorePlayerOne(-1)";
Debug.ShouldStop(128);
scorebord._func.runVoidMethod ("_calcscoreplayerone" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, -(double) (0 + 1))));
 }}
;
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_player_one_10_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbl_player_one_10_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,301);
if (RapidSub.canDelegate("lbl_player_one_10_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lbl_player_one_10_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 301;BA.debugLine="Sub lbl_player_one_10_MouseReleased (EventData As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 302;BA.debugLine="setP1Name";
Debug.ShouldStop(8192);
_setp1name();
 BA.debugLineNum = 303;BA.debugLine="If EventData.PrimaryButtonPressed Then";
Debug.ShouldStop(16384);
if (_eventdata.runMethod(true,"getPrimaryButtonPressed").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 304;BA.debugLine="func.calcScorePlayerOne(10)";
Debug.ShouldStop(32768);
scorebord._func.runVoidMethod ("_calcscoreplayerone" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 10)));
 }else 
{ BA.debugLineNum = 305;BA.debugLine="Else If EventData.SecondaryButtonPressed Then";
Debug.ShouldStop(65536);
if (_eventdata.runMethod(true,"getSecondaryButtonPressed").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 306;BA.debugLine="func.calcScorePlayerOne(-10)";
Debug.ShouldStop(131072);
scorebord._func.runVoidMethod ("_calcscoreplayerone" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, -(double) (0 + 10))));
 }}
;
 BA.debugLineNum = 308;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_player_one_100_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbl_player_one_100_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,309);
if (RapidSub.canDelegate("lbl_player_one_100_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lbl_player_one_100_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 309;BA.debugLine="Sub lbl_player_one_100_MouseReleased (EventData As";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 310;BA.debugLine="setP1Name";
Debug.ShouldStop(2097152);
_setp1name();
 BA.debugLineNum = 311;BA.debugLine="If EventData.PrimaryButtonPressed Then";
Debug.ShouldStop(4194304);
if (_eventdata.runMethod(true,"getPrimaryButtonPressed").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 312;BA.debugLine="func.calcScorePlayerOne(100)";
Debug.ShouldStop(8388608);
scorebord._func.runVoidMethod ("_calcscoreplayerone" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 100)));
 }else 
{ BA.debugLineNum = 313;BA.debugLine="Else If EventData.SecondaryButtonPressed Then";
Debug.ShouldStop(16777216);
if (_eventdata.runMethod(true,"getSecondaryButtonPressed").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 314;BA.debugLine="func.calcScorePlayerOne(-100)";
Debug.ShouldStop(33554432);
scorebord._func.runVoidMethod ("_calcscoreplayerone" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, -(double) (0 + 100))));
 }}
;
 BA.debugLineNum = 316;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_player_one_active_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbl_player_one_active_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,361);
if (RapidSub.canDelegate("lbl_player_one_active_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lbl_player_one_active_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 361;BA.debugLine="Sub lbl_player_one_active_MouseReleased (EventData";
Debug.ShouldStop(256);
 BA.debugLineNum = 364;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_player_one_make_1_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbl_player_one_make_1_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,520);
if (RapidSub.canDelegate("lbl_player_one_make_1_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lbl_player_one_make_1_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 520;BA.debugLine="Sub lbl_player_one_make_1_MouseReleased (EventData";
Debug.ShouldStop(128);
 BA.debugLineNum = 521;BA.debugLine="setP1Name";
Debug.ShouldStop(256);
_setp1name();
 BA.debugLineNum = 522;BA.debugLine="func.playerOneMake(lbl_player_one_make_100, lbl_p";
Debug.ShouldStop(512);
scorebord._func.runVoidMethod ("_playeronemake" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_one_make_100),(Object)(scorebord._lbl_player_one_make_10),(Object)(scorebord._lbl_player_one_make_1),(Object)(_eventdata.runMethod(true,"getPrimaryButtonPressed")),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 523;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_player_one_make_10_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbl_player_one_make_10_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,514);
if (RapidSub.canDelegate("lbl_player_one_make_10_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lbl_player_one_make_10_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 514;BA.debugLine="Sub lbl_player_one_make_10_MouseReleased (EventDat";
Debug.ShouldStop(2);
 BA.debugLineNum = 515;BA.debugLine="setP1Name";
Debug.ShouldStop(4);
_setp1name();
 BA.debugLineNum = 516;BA.debugLine="func.playerOneMake(lbl_player_one_make_100, lbl_p";
Debug.ShouldStop(8);
scorebord._func.runVoidMethod ("_playeronemake" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_one_make_100),(Object)(scorebord._lbl_player_one_make_10),(Object)(scorebord._lbl_player_one_make_1),(Object)(_eventdata.runMethod(true,"getPrimaryButtonPressed")),(Object)(BA.numberCast(int.class, 10)));
 BA.debugLineNum = 518;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_player_one_make_100_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbl_player_one_make_100_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,509);
if (RapidSub.canDelegate("lbl_player_one_make_100_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lbl_player_one_make_100_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 509;BA.debugLine="Sub lbl_player_one_make_100_MouseReleased (EventDa";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 510;BA.debugLine="setP1Name";
Debug.ShouldStop(536870912);
_setp1name();
 BA.debugLineNum = 511;BA.debugLine="func.playerOneMake(lbl_player_one_make_100, lbl_p";
Debug.ShouldStop(1073741824);
scorebord._func.runVoidMethod ("_playeronemake" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_one_make_100),(Object)(scorebord._lbl_player_one_make_10),(Object)(scorebord._lbl_player_one_make_1),(Object)(_eventdata.runMethod(true,"getPrimaryButtonPressed")),(Object)(BA.numberCast(int.class, 100)));
 BA.debugLineNum = 512;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_player_one_name_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbl_player_one_name_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,473);
if (RapidSub.canDelegate("lbl_player_one_name_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lbl_player_one_name_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 473;BA.debugLine="Sub lbl_player_one_name_MouseReleased (EventData A";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 474;BA.debugLine="setP1Name";
Debug.ShouldStop(33554432);
_setp1name();
 BA.debugLineNum = 475;BA.debugLine="func.processHs(\"all\")";
Debug.ShouldStop(67108864);
scorebord._func.runVoidMethod ("_processhs" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("all")));
 BA.debugLineNum = 477;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_player_two_1_mouseentered(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbl_player_two_1_MouseEntered (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,452);
if (RapidSub.canDelegate("lbl_player_two_1_mouseentered")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lbl_player_two_1_mouseentered", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 452;BA.debugLine="Sub lbl_player_two_1_MouseEntered (EventData As Mo";
Debug.ShouldStop(8);
 BA.debugLineNum = 457;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_player_two_1_mouseexited(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbl_player_two_1_MouseExited (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,459);
if (RapidSub.canDelegate("lbl_player_two_1_mouseexited")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lbl_player_two_1_mouseexited", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 459;BA.debugLine="Sub lbl_player_two_1_MouseExited (EventData As Mou";
Debug.ShouldStop(1024);
 BA.debugLineNum = 463;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_player_two_1_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbl_player_two_1_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,326);
if (RapidSub.canDelegate("lbl_player_two_1_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lbl_player_two_1_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 326;BA.debugLine="Sub lbl_player_two_1_MouseReleased (EventData As M";
Debug.ShouldStop(32);
 BA.debugLineNum = 327;BA.debugLine="setP2Name";
Debug.ShouldStop(64);
_setp2name();
 BA.debugLineNum = 328;BA.debugLine="If EventData.PrimaryButtonPressed Then";
Debug.ShouldStop(128);
if (_eventdata.runMethod(true,"getPrimaryButtonPressed").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 329;BA.debugLine="func.calcScorePlayertwo(1)";
Debug.ShouldStop(256);
scorebord._func.runVoidMethod ("_calcscoreplayertwo" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)));
 }else 
{ BA.debugLineNum = 330;BA.debugLine="Else If EventData.SecondaryButtonPressed Then";
Debug.ShouldStop(512);
if (_eventdata.runMethod(true,"getSecondaryButtonPressed").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 331;BA.debugLine="func.calcScorePlayertwo(-1)";
Debug.ShouldStop(1024);
scorebord._func.runVoidMethod ("_calcscoreplayertwo" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, -(double) (0 + 1))));
 }}
;
 BA.debugLineNum = 333;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_player_two_10_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbl_player_two_10_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,334);
if (RapidSub.canDelegate("lbl_player_two_10_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lbl_player_two_10_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 334;BA.debugLine="Sub lbl_player_two_10_MouseReleased (EventData As";
Debug.ShouldStop(8192);
 BA.debugLineNum = 335;BA.debugLine="setP2Name";
Debug.ShouldStop(16384);
_setp2name();
 BA.debugLineNum = 336;BA.debugLine="If EventData.PrimaryButtonPressed Then";
Debug.ShouldStop(32768);
if (_eventdata.runMethod(true,"getPrimaryButtonPressed").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 337;BA.debugLine="func.calcScorePlayertwo(10)";
Debug.ShouldStop(65536);
scorebord._func.runVoidMethod ("_calcscoreplayertwo" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 10)));
 }else 
{ BA.debugLineNum = 338;BA.debugLine="Else If EventData.SecondaryButtonPressed Then";
Debug.ShouldStop(131072);
if (_eventdata.runMethod(true,"getSecondaryButtonPressed").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 339;BA.debugLine="func.calcScorePlayertwo(-10)";
Debug.ShouldStop(262144);
scorebord._func.runVoidMethod ("_calcscoreplayertwo" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, -(double) (0 + 10))));
 }}
;
 BA.debugLineNum = 341;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_player_two_100_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbl_player_two_100_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,342);
if (RapidSub.canDelegate("lbl_player_two_100_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lbl_player_two_100_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 342;BA.debugLine="Sub lbl_player_two_100_MouseReleased (EventData As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 343;BA.debugLine="setP2Name";
Debug.ShouldStop(4194304);
_setp2name();
 BA.debugLineNum = 344;BA.debugLine="If EventData.PrimaryButtonPressed Then";
Debug.ShouldStop(8388608);
if (_eventdata.runMethod(true,"getPrimaryButtonPressed").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 345;BA.debugLine="func.calcScorePlayertwo(100)";
Debug.ShouldStop(16777216);
scorebord._func.runVoidMethod ("_calcscoreplayertwo" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 100)));
 }else 
{ BA.debugLineNum = 346;BA.debugLine="Else If EventData.SecondaryButtonPressed Then";
Debug.ShouldStop(33554432);
if (_eventdata.runMethod(true,"getSecondaryButtonPressed").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 347;BA.debugLine="func.calcScorePlayertwo(-100)";
Debug.ShouldStop(67108864);
scorebord._func.runVoidMethod ("_calcscoreplayertwo" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, -(double) (0 + 100))));
 }}
;
 BA.debugLineNum = 349;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_player_two_make_1_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbl_player_two_make_1_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,558);
if (RapidSub.canDelegate("lbl_player_two_make_1_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lbl_player_two_make_1_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 558;BA.debugLine="Sub lbl_player_two_make_1_MouseReleased (EventData";
Debug.ShouldStop(8192);
 BA.debugLineNum = 559;BA.debugLine="func.playertwoMake(lbl_player_two_make_100, lbl_p";
Debug.ShouldStop(16384);
scorebord._func.runVoidMethod ("_playertwomake" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_two_make_100),(Object)(scorebord._lbl_player_two_make_10),(Object)(scorebord._lbl_player_two_make_1),(Object)(_eventdata.runMethod(true,"getPrimaryButtonPressed")),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 560;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_player_two_make_10_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbl_player_two_make_10_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,546);
if (RapidSub.canDelegate("lbl_player_two_make_10_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lbl_player_two_make_10_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 546;BA.debugLine="Sub lbl_player_two_make_10_MouseReleased (EventDat";
Debug.ShouldStop(2);
 BA.debugLineNum = 547;BA.debugLine="func.playertwoMake(lbl_player_two_make_100, lbl_p";
Debug.ShouldStop(4);
scorebord._func.runVoidMethod ("_playertwomake" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_two_make_100),(Object)(scorebord._lbl_player_two_make_10),(Object)(scorebord._lbl_player_two_make_1),(Object)(_eventdata.runMethod(true,"getPrimaryButtonPressed")),(Object)(BA.numberCast(int.class, 10)));
 BA.debugLineNum = 548;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_player_two_make_100_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbl_player_two_make_100_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,533);
if (RapidSub.canDelegate("lbl_player_two_make_100_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lbl_player_two_make_100_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 533;BA.debugLine="Sub lbl_player_two_make_100_MouseReleased (EventDa";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 535;BA.debugLine="func.playertwoMake(lbl_player_two_make_100, lbl_p";
Debug.ShouldStop(4194304);
scorebord._func.runVoidMethod ("_playertwomake" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_two_make_100),(Object)(scorebord._lbl_player_two_make_10),(Object)(scorebord._lbl_player_two_make_1),(Object)(_eventdata.runMethod(true,"getPrimaryButtonPressed")),(Object)(BA.numberCast(int.class, 100)));
 BA.debugLineNum = 536;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_player_two_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbl_player_two_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,264);
if (RapidSub.canDelegate("lbl_player_two_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lbl_player_two_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 264;BA.debugLine="Sub lbl_player_two_MouseReleased (EventData As Mou";
Debug.ShouldStop(128);
 BA.debugLineNum = 268;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_player_two_name_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbl_player_two_name_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,479);
if (RapidSub.canDelegate("lbl_player_two_name_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lbl_player_two_name_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 479;BA.debugLine="Sub lbl_player_two_name_MouseReleased (EventData A";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 480;BA.debugLine="setP2Name";
Debug.ShouldStop(-2147483648);
_setp2name();
 BA.debugLineNum = 481;BA.debugLine="func.processHs(\"all\")";
Debug.ShouldStop(1);
scorebord._func.runVoidMethod ("_processhs" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("all")));
 BA.debugLineNum = 482;BA.debugLine="func.inngSet = 0";
Debug.ShouldStop(2);
scorebord._func._inngset /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 483;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_reset_mouseentered(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbl_reset_MouseEntered (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,746);
if (RapidSub.canDelegate("lbl_reset_mouseentered")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lbl_reset_mouseentered", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 746;BA.debugLine="Sub lbl_reset_MouseEntered (EventData As MouseEven";
Debug.ShouldStop(512);
 BA.debugLineNum = 747;BA.debugLine="lbl_reset.Color =  0xFF69D79A";
Debug.ShouldStop(1024);
scorebord._lbl_reset.runMethod(true,"setColor",BA.numberCast(int.class, 0xff69d79a));
 BA.debugLineNum = 748;BA.debugLine="lbl_reset.TextColor = 0xFFFFFF00";
Debug.ShouldStop(2048);
scorebord._lbl_reset.runMethod(true,"setTextColor",BA.numberCast(int.class, 0xffffff00));
 BA.debugLineNum = 749;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_reset_mouseexited(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbl_reset_MouseExited (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,751);
if (RapidSub.canDelegate("lbl_reset_mouseexited")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lbl_reset_mouseexited", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 751;BA.debugLine="Sub lbl_reset_MouseExited (EventData As MouseEvent";
Debug.ShouldStop(16384);
 BA.debugLineNum = 752;BA.debugLine="lbl_reset.Color = 0xFFFF0000";
Debug.ShouldStop(32768);
scorebord._lbl_reset.runMethod(true,"setColor",BA.numberCast(int.class, 0xffff0000));
 BA.debugLineNum = 753;BA.debugLine="lbl_reset.TextColor = 0xFFFFFFFF";
Debug.ShouldStop(65536);
scorebord._lbl_reset.runMethod(true,"setTextColor",BA.numberCast(int.class, 0xffffffff));
 BA.debugLineNum = 754;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_reset_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbl_reset_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,756);
if (RapidSub.canDelegate("lbl_reset_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lbl_reset_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 756;BA.debugLine="Sub lbl_reset_MouseReleased (EventData As MouseEve";
Debug.ShouldStop(524288);
 BA.debugLineNum = 757;BA.debugLine="inactivecls.lastClick = DateTime.Now";
Debug.ShouldStop(1048576);
scorebord._inactivecls.setField ("_lastclick" /*RemoteObject*/ ,scorebord.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 758;BA.debugLine="nieuwePartij";
Debug.ShouldStop(2097152);
_nieuwepartij();
 BA.debugLineNum = 761;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lstplayeronescorelbl() throws Exception{
try {
		Debug.PushSubsStack("lstPlayerOneScoreLbl (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,270);
if (RapidSub.canDelegate("lstplayeronescorelbl")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lstplayeronescorelbl");}
RemoteObject _list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 270;BA.debugLine="Sub lstPlayerOneScoreLbl As List";
Debug.ShouldStop(8192);
 BA.debugLineNum = 271;BA.debugLine="Dim List As List";
Debug.ShouldStop(16384);
_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List", _list);
 BA.debugLineNum = 272;BA.debugLine="List.Initialize";
Debug.ShouldStop(32768);
_list.runVoidMethod ("Initialize");
 BA.debugLineNum = 273;BA.debugLine="List.AddAll(Array As Object(lbl_player_one_1, lbl";
Debug.ShouldStop(65536);
_list.runVoidMethod ("AddAll",(Object)(scorebord.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(scorebord._lbl_player_one_1.getObject()),(scorebord._lbl_player_one_10.getObject()),(scorebord._lbl_player_one_100.getObject()),(scorebord._lbl_player_one_moyenne.getObject()),(scorebord._b4xprogressbarp1)})))));
 BA.debugLineNum = 274;BA.debugLine="Return List";
Debug.ShouldStop(131072);
if (true) return _list;
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lstplayertwoscorelbl() throws Exception{
try {
		Debug.PushSubsStack("lstPlayerTwoScoreLbl (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,277);
if (RapidSub.canDelegate("lstplayertwoscorelbl")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","lstplayertwoscorelbl");}
RemoteObject _list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 277;BA.debugLine="Sub lstPlayerTwoScoreLbl As List";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 278;BA.debugLine="Dim List As List";
Debug.ShouldStop(2097152);
_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List", _list);
 BA.debugLineNum = 279;BA.debugLine="List.Initialize";
Debug.ShouldStop(4194304);
_list.runVoidMethod ("Initialize");
 BA.debugLineNum = 280;BA.debugLine="List.AddAll(Array As Object(lbl_player_two_1, lbl";
Debug.ShouldStop(8388608);
_list.runVoidMethod ("AddAll",(Object)(scorebord.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(scorebord._lbl_player_two_1.getObject()),(scorebord._lbl_player_two_10.getObject()),(scorebord._lbl_player_two_100.getObject()),(scorebord._lbl_player_two_moyenne.getObject()),(scorebord._b4xprogressbarp2)})))));
 BA.debugLineNum = 281;BA.debugLine="Return List";
Debug.ShouldStop(16777216);
if (true) return _list;
 BA.debugLineNum = 282;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainform_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("MainForm_MouseClicked (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,844);
if (RapidSub.canDelegate("mainform_mouseclicked")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","mainform_mouseclicked", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 844;BA.debugLine="Sub MainForm_MouseClicked (EventData As MouseEvent";
Debug.ShouldStop(2048);
 BA.debugLineNum = 845;BA.debugLine="If inactivecls.tmr_draw_promote.Enabled = True Th";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",scorebord._inactivecls.getField(false,"_tmr_draw_promote" /*RemoteObject*/ ).runMethod(true,"getEnabled"),scorebord.__c.getField(true,"True"))) { 
 BA.debugLineNum = 846;BA.debugLine="pn_promote.Top = pn_promote_top";
Debug.ShouldStop(8192);
scorebord._pn_promote.runMethod(true,"setTop",scorebord._pn_promote_top);
 BA.debugLineNum = 847;BA.debugLine="pn_promote_left = pn_promote_left";
Debug.ShouldStop(16384);
scorebord._pn_promote_left = scorebord._pn_promote_left;
 BA.debugLineNum = 849;BA.debugLine="inactivecls.lastClick = DateTime.Now";
Debug.ShouldStop(65536);
scorebord._inactivecls.setField ("_lastclick" /*RemoteObject*/ ,scorebord.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 850;BA.debugLine="inactivecls.enableTime(True)";
Debug.ShouldStop(131072);
scorebord._inactivecls.runClassMethod (b4j.example.inactiveclass.class, "_enabletime" /*RemoteObject*/ ,(Object)(scorebord.__c.getField(true,"True")));
 BA.debugLineNum = 851;BA.debugLine="inactivecls.enablePromote(False)";
Debug.ShouldStop(262144);
scorebord._inactivecls.runClassMethod (b4j.example.inactiveclass.class, "_enablepromote" /*RemoteObject*/ ,(Object)(scorebord.__c.getField(true,"False")));
 };
 BA.debugLineNum = 853;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _mousein_event(RemoteObject _m,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("mouseIn_Event (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,817);
if (RapidSub.canDelegate("mousein_event")) { b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","mousein_event", _m, _args); return;}
ResumableSub_mouseIn_Event rsub = new ResumableSub_mouseIn_Event(null,_m,_args);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_mouseIn_Event extends BA.ResumableSub {
public ResumableSub_mouseIn_Event(b4j.example.scorebord parent,RemoteObject _m,RemoteObject _args) {
this.parent = parent;
this._m = _m;
this._args = _args;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.example.scorebord parent;
RemoteObject _m;
RemoteObject _args;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("mouseIn_Event (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,817);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("m", _m);
Debug.locals.put("args", _args);
 BA.debugLineNum = 818;BA.debugLine="If promoteRunning = True Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent._promoterunning,parent.__c.getField(true,"True"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 819;BA.debugLine="pn_promote.Top = pn_promote_top";
Debug.ShouldStop(262144);
parent._pn_promote.runMethod(true,"setTop",parent._pn_promote_top);
 BA.debugLineNum = 820;BA.debugLine="pn_promote.left = pn_promote_left";
Debug.ShouldStop(524288);
parent._pn_promote.runMethod(true,"setLeft",parent._pn_promote_left);
 BA.debugLineNum = 821;BA.debugLine="Sleep(0)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("Sleep",scorebord.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "scorebord", "mousein_event"),BA.numberCast(int.class, 0));
this.state = 5;
return;
case 5:
//C
this.state = 4;
;
 BA.debugLineNum = 822;BA.debugLine="inactivecls.lastClick = DateTime.Now";
Debug.ShouldStop(2097152);
parent._inactivecls.setField ("_lastclick" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 823;BA.debugLine="inactivecls.enableTime(True)";
Debug.ShouldStop(4194304);
parent._inactivecls.runClassMethod (b4j.example.inactiveclass.class, "_enabletime" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 824;BA.debugLine="inactivecls.enablePromote(False)";
Debug.ShouldStop(8388608);
parent._inactivecls.runClassMethod (b4j.example.inactiveclass.class, "_enablepromote" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 825;BA.debugLine="promoteRunning = False";
Debug.ShouldStop(16777216);
parent._promoterunning = parent.__c.getField(true,"False");
 BA.debugLineNum = 827;BA.debugLine="Sleep(300)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("Sleep",scorebord.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "scorebord", "mousein_event"),BA.numberCast(int.class, 300));
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 829;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
public static RemoteObject  _mouseover(RemoteObject _n1) throws Exception{
try {
		Debug.PushSubsStack("MouseOver (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,831);
if (RapidSub.canDelegate("mouseover")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","mouseover", _n1);}
Debug.locals.put("n1", _n1);
 BA.debugLineNum = 831;BA.debugLine="private Sub MouseOver(n1 As Node)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 832;BA.debugLine="setHandler(n1,\"setOnMouseMoved\",\"mouseIn\")";
Debug.ShouldStop(-2147483648);
_sethandler(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _n1.getObject()),BA.ObjectToString("setOnMouseMoved"),RemoteObject.createImmutable("mouseIn"));
 BA.debugLineNum = 833;BA.debugLine="setHandler(n1,\"setOnMouseExited\",\"mouseOut\")";
Debug.ShouldStop(1);
_sethandler(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _n1.getObject()),BA.ObjectToString("setOnMouseExited"),RemoteObject.createImmutable("mouseOut"));
 BA.debugLineNum = 834;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _nieuwepartij() throws Exception{
try {
		Debug.PushSubsStack("nieuwePartij (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,709);
if (RapidSub.canDelegate("nieuwepartij")) { b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","nieuwepartij"); return;}
ResumableSub_nieuwePartij rsub = new ResumableSub_nieuwePartij(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_nieuwePartij extends BA.ResumableSub {
public ResumableSub_nieuwePartij(b4j.example.scorebord parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.example.scorebord parent;
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("nieuwePartij (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,709);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 717;BA.debugLine="Wait For (pNieuwePartijDialog.ShowCustom(pNieuweP";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","complete", scorebord.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "scorebord", "nieuwepartij"), parent._pnieuwepartijdialog.runClassMethod (b4j.example.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(parent._pnieuwepartij),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("")))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 718;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 723;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
public static RemoteObject  _playeroneperc(RemoteObject _perc) throws Exception{
try {
		Debug.PushSubsStack("playerOnePerc (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,525);
if (RapidSub.canDelegate("playeroneperc")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","playeroneperc", _perc);}
Debug.locals.put("perc", _perc);
 BA.debugLineNum = 525;BA.debugLine="Sub playerOnePerc(perc As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 526;BA.debugLine="lbl_player_one_perc.Text = perc";
Debug.ShouldStop(8192);
scorebord._lbl_player_one_perc.runMethod(true,"setText",_perc);
 BA.debugLineNum = 527;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playertwoperc(RemoteObject _perc) throws Exception{
try {
		Debug.PushSubsStack("playerTwoPerc (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,529);
if (RapidSub.canDelegate("playertwoperc")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","playertwoperc", _perc);}
Debug.locals.put("perc", _perc);
 BA.debugLineNum = 529;BA.debugLine="Sub playerTwoPerc(perc As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 530;BA.debugLine="lbl_player_two_perc.Text = perc";
Debug.ShouldStop(131072);
scorebord._lbl_player_two_perc.runMethod(true,"setText",_perc);
 BA.debugLineNum = 531;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pn_promote_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("pn_promote_MouseReleased (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,801);
if (RapidSub.canDelegate("pn_promote_mousereleased")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","pn_promote_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 801;BA.debugLine="Sub pn_promote_MouseReleased (EventData As MouseEv";
Debug.ShouldStop(1);
 BA.debugLineNum = 802;BA.debugLine="pn_promote.Top = pn_promote_top";
Debug.ShouldStop(2);
scorebord._pn_promote.runMethod(true,"setTop",scorebord._pn_promote_top);
 BA.debugLineNum = 803;BA.debugLine="pn_promote.left = pn_promote_left";
Debug.ShouldStop(4);
scorebord._pn_promote.runMethod(true,"setLeft",scorebord._pn_promote_left);
 BA.debugLineNum = 805;BA.debugLine="inactivecls.lastClick = DateTime.Now";
Debug.ShouldStop(16);
scorebord._inactivecls.setField ("_lastclick" /*RemoteObject*/ ,scorebord.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 806;BA.debugLine="inactivecls.enableTime(True)";
Debug.ShouldStop(32);
scorebord._inactivecls.runClassMethod (b4j.example.inactiveclass.class, "_enabletime" /*RemoteObject*/ ,(Object)(scorebord.__c.getField(true,"True")));
 BA.debugLineNum = 807;BA.debugLine="inactivecls.enablePromote(False)";
Debug.ShouldStop(64);
scorebord._inactivecls.runClassMethod (b4j.example.inactiveclass.class, "_enablepromote" /*RemoteObject*/ ,(Object)(scorebord.__c.getField(true,"False")));
 BA.debugLineNum = 808;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private fx As JFX";
scorebord._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 7;BA.debugLine="Private Dialog As B4XDialog";
scorebord._dialog = RemoteObject.createNew ("b4j.example.b4xdialog");
 //BA.debugLineNum = 8;BA.debugLine="Private Base As B4XView";
scorebord._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 10;BA.debugLine="Private XUI As XUI";
scorebord._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 11;BA.debugLine="Private frm As Form";
scorebord._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 12;BA.debugLine="Private inactivecls As inactiveClass";
scorebord._inactivecls = RemoteObject.createNew ("b4j.example.inactiveclass");
 //BA.debugLineNum = 13;BA.debugLine="Private clsCheckCfg As classCheckConfig";
scorebord._clscheckcfg = RemoteObject.createNew ("b4j.example.classcheckconfig");
 //BA.debugLineNum = 14;BA.debugLine="Private clsToast As clXToastMessage";
scorebord._clstoast = RemoteObject.createNew ("b4j.example.clxtoastmessage");
 //BA.debugLineNum = 16;BA.debugLine="Private pn_promote_top, pn_promote_left As Double";
scorebord._pn_promote_top = RemoteObject.createImmutable(0);
scorebord._pn_promote_left = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 17;BA.debugLine="Private promoteRunning As Boolean = False";
scorebord._promoterunning = scorebord.__c.getField(true,"False");
 //BA.debugLineNum = 18;BA.debugLine="Private pNieuwePartij As B4XView";
scorebord._pnieuwepartij = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private pNieuwePartijDialog As B4XDialog";
scorebord._pnieuwepartijdialog = RemoteObject.createNew ("b4j.example.b4xdialog");
 //BA.debugLineNum = 26;BA.debugLine="Private lbl_innings As Label";
scorebord._lbl_innings = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private lbl_player_one_10 As Label";
scorebord._lbl_player_one_10 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private lbl_player_one_1 As Label";
scorebord._lbl_player_one_1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private lbl_player_one_100 As Label";
scorebord._lbl_player_one_100 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private lbl_player_one_moyenne As Label";
scorebord._lbl_player_one_moyenne = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private lbl_player_two_moyenne As Label";
scorebord._lbl_player_two_moyenne = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private lbl_player_two_100 As Label";
scorebord._lbl_player_two_100 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private lbl_player_two_10 As Label";
scorebord._lbl_player_two_10 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private lbl_player_two_1 As Label";
scorebord._lbl_player_two_1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private btn_exit As B4XView";
scorebord._btn_exit = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private lbl_player_one_name As B4XView";
scorebord._lbl_player_one_name = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private lbl_player_two_name As B4XView";
scorebord._lbl_player_two_name = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private lbl_player_one_perc As Label";
scorebord._lbl_player_one_perc = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private lbl_player_one_make_100 As Label";
scorebord._lbl_player_one_make_100 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private lbl_player_one_make_10 As Label";
scorebord._lbl_player_one_make_10 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private lbl_player_one_make_1 As Label";
scorebord._lbl_player_one_make_1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private lbl_player_two_make_100 As Label";
scorebord._lbl_player_two_make_100 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private lbl_player_two_make_10 As Label";
scorebord._lbl_player_two_make_10 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private lbl_player_two_make_1 As Label";
scorebord._lbl_player_two_make_1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private lbl_player_two_perc As Label";
scorebord._lbl_player_two_perc = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private lbl_reset As B4XView";
scorebord._lbl_reset = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private jxui As XUI";
scorebord._jxui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 52;BA.debugLine="Private lbl_player_one_hs As Label";
scorebord._lbl_player_one_hs = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private lbl_player_two_hs As Label";
scorebord._lbl_player_two_hs = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private lbl_clock As B4XView";
scorebord._lbl_clock = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private clsTmr As timerClass";
scorebord._clstmr = RemoteObject.createNew ("b4j.example.timerclass");
 //BA.debugLineNum = 59;BA.debugLine="Private Label7 As Label";
scorebord._label7 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private edt_speler_a As TextField";
scorebord._edt_speler_a = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private edt_temaken_a As TextField";
scorebord._edt_temaken_a = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private edt_speler_b As TextField";
scorebord._edt_speler_b = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Private edt_temaken_b As TextField";
scorebord._edt_temaken_b = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 65;BA.debugLine="Private btn_a_begint As Button";
scorebord._btn_a_begint = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private btn_b_begint As Button";
scorebord._btn_b_begint = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 71;BA.debugLine="Private B4XProgressBarP1 As B4XProgressBar";
scorebord._b4xprogressbarp1 = RemoteObject.createNew ("b4j.example.b4xprogressbar");
 //BA.debugLineNum = 72;BA.debugLine="Private B4XProgressBarP2 As B4XProgressBar";
scorebord._b4xprogressbarp2 = RemoteObject.createNew ("b4j.example.b4xprogressbar");
 //BA.debugLineNum = 74;BA.debugLine="Private btn_nieuwe_partij As Button";
scorebord._btn_nieuwe_partij = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 75;BA.debugLine="Private btn_annuleer_nieuwe_partij As Button";
scorebord._btn_annuleer_nieuwe_partij = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 79;BA.debugLine="Private Label6 As Label";
scorebord._label6 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 80;BA.debugLine="Private lbl_close As B4XView";
scorebord._lbl_close = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 81;BA.debugLine="Private chk_add_player As CheckBox";
scorebord._chk_add_player = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
 //BA.debugLineNum = 82;BA.debugLine="Private img_random As ImageView";
scorebord._img_random = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 85;BA.debugLine="Private pn_p1_carom As Pane";
scorebord._pn_p1_carom = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
 //BA.debugLineNum = 87;BA.debugLine="Private pn_promote As Pane";
scorebord._pn_promote = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
 //BA.debugLineNum = 88;BA.debugLine="Private lbl_config_update As Label";
scorebord._lbl_config_update = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _resetboard(RemoteObject _bordstart) throws Exception{
try {
		Debug.PushSubsStack("resetBoard (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,582);
if (RapidSub.canDelegate("resetboard")) { b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","resetboard", _bordstart); return;}
ResumableSub_resetBoard rsub = new ResumableSub_resetBoard(null,_bordstart);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_resetBoard extends BA.ResumableSub {
public ResumableSub_resetBoard(b4j.example.scorebord parent,RemoteObject _bordstart) {
this.parent = parent;
this._bordstart = _bordstart;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.example.scorebord parent;
RemoteObject _bordstart;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("resetBoard (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,582);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("bordStart", _bordstart);
 BA.debugLineNum = 583;BA.debugLine="If bordStart Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 8;
if (_bordstart.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 585;BA.debugLine="Dim sf As Object = jxui.Msgbox2Async(\"Bord reset";
Debug.ShouldStop(256);
_sf = parent._jxui.runMethod(false,"Msgbox2Async",scorebord.ba,(Object)(BA.ObjectToString("Bord resetten?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Ja")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Nee")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 586;BA.debugLine="Wait For (sf) Msgbox_Result (Result As Int)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", scorebord.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "scorebord", "resetboard"), _sf);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 587;BA.debugLine="If Result = jxui.DialogResponse_Negative Then";
Debug.ShouldStop(1024);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent._jxui.getField(true,"DialogResponse_Negative")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 588;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 595;BA.debugLine="setCaromNumber(lbl_player_one_1, \"0\")";
Debug.ShouldStop(262144);
_setcaromnumber(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent._lbl_player_one_1.getObject()),RemoteObject.createImmutable("0"));
 BA.debugLineNum = 597;BA.debugLine="setCaromNumber(lbl_player_one_10, \"0\")";
Debug.ShouldStop(1048576);
_setcaromnumber(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent._lbl_player_one_10.getObject()),RemoteObject.createImmutable("0"));
 BA.debugLineNum = 599;BA.debugLine="setCaromNumber(lbl_player_one_100, \"0\")";
Debug.ShouldStop(4194304);
_setcaromnumber(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent._lbl_player_one_100.getObject()),RemoteObject.createImmutable("0"));
 BA.debugLineNum = 602;BA.debugLine="lbl_player_one_1.Text = \"0\"";
Debug.ShouldStop(33554432);
parent._lbl_player_one_1.runMethod(true,"setText",BA.ObjectToString("0"));
 BA.debugLineNum = 603;BA.debugLine="lbl_player_one_make_100.Text = \"0\"";
Debug.ShouldStop(67108864);
parent._lbl_player_one_make_100.runMethod(true,"setText",BA.ObjectToString("0"));
 BA.debugLineNum = 604;BA.debugLine="lbl_player_one_make_10.Text = \"0\"";
Debug.ShouldStop(134217728);
parent._lbl_player_one_make_10.runMethod(true,"setText",BA.ObjectToString("0"));
 BA.debugLineNum = 605;BA.debugLine="lbl_player_one_make_1.Text = \"0\"";
Debug.ShouldStop(268435456);
parent._lbl_player_one_make_1.runMethod(true,"setText",BA.ObjectToString("0"));
 BA.debugLineNum = 606;BA.debugLine="lbl_player_one_moyenne.Text = \"0.000\"";
Debug.ShouldStop(536870912);
parent._lbl_player_one_moyenne.runMethod(true,"setText",BA.ObjectToString("0.000"));
 BA.debugLineNum = 607;BA.debugLine="lbl_player_one_perc.Text = \"0.00%\"";
Debug.ShouldStop(1073741824);
parent._lbl_player_one_perc.runMethod(true,"setText",BA.ObjectToString("0.00%"));
 BA.debugLineNum = 609;BA.debugLine="lbl_innings.Text = \"000\"";
Debug.ShouldStop(1);
parent._lbl_innings.runMethod(true,"setText",BA.ObjectToString("000"));
 BA.debugLineNum = 612;BA.debugLine="lbl_player_two_100.Text = \"0\"";
Debug.ShouldStop(8);
parent._lbl_player_two_100.runMethod(true,"setText",BA.ObjectToString("0"));
 BA.debugLineNum = 613;BA.debugLine="lbl_player_two_10.Text = \"0\"";
Debug.ShouldStop(16);
parent._lbl_player_two_10.runMethod(true,"setText",BA.ObjectToString("0"));
 BA.debugLineNum = 614;BA.debugLine="lbl_player_two_1.Text = \"0\"";
Debug.ShouldStop(32);
parent._lbl_player_two_1.runMethod(true,"setText",BA.ObjectToString("0"));
 BA.debugLineNum = 615;BA.debugLine="lbl_player_two_make_100.Text = \"0\"";
Debug.ShouldStop(64);
parent._lbl_player_two_make_100.runMethod(true,"setText",BA.ObjectToString("0"));
 BA.debugLineNum = 616;BA.debugLine="lbl_player_two_make_10.Text = \"0\"";
Debug.ShouldStop(128);
parent._lbl_player_two_make_10.runMethod(true,"setText",BA.ObjectToString("0"));
 BA.debugLineNum = 617;BA.debugLine="lbl_player_two_make_1.Text = \"0\"";
Debug.ShouldStop(256);
parent._lbl_player_two_make_1.runMethod(true,"setText",BA.ObjectToString("0"));
 BA.debugLineNum = 618;BA.debugLine="lbl_player_two_perc.Text = \"0.00%\"";
Debug.ShouldStop(512);
parent._lbl_player_two_perc.runMethod(true,"setText",BA.ObjectToString("0.00%"));
 BA.debugLineNum = 619;BA.debugLine="lbl_player_two_moyenne.Text = \"0.000\"";
Debug.ShouldStop(1024);
parent._lbl_player_two_moyenne.runMethod(true,"setText",BA.ObjectToString("0.000"));
 BA.debugLineNum = 620;BA.debugLine="lbl_player_one_hs.Text = \"000\"";
Debug.ShouldStop(2048);
parent._lbl_player_one_hs.runMethod(true,"setText",BA.ObjectToString("000"));
 BA.debugLineNum = 621;BA.debugLine="lbl_player_two_hs.Text = \"000\"";
Debug.ShouldStop(4096);
parent._lbl_player_two_hs.runMethod(true,"setText",BA.ObjectToString("000"));
 BA.debugLineNum = 623;BA.debugLine="func.inngSet = 0";
Debug.ShouldStop(16384);
parent._func._inngset /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 624;BA.debugLine="func.innigs = 0";
Debug.ShouldStop(32768);
parent._func._innigs /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 625;BA.debugLine="func.scorePlayerOne = 0";
Debug.ShouldStop(65536);
parent._func._scoreplayerone /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 626;BA.debugLine="func.scorePlayerTwo = 0";
Debug.ShouldStop(131072);
parent._func._scoreplayertwo /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 627;BA.debugLine="func.playerOneToMake = 0";
Debug.ShouldStop(262144);
parent._func._playeronetomake /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 628;BA.debugLine="func.playertwoToMake = 0";
Debug.ShouldStop(524288);
parent._func._playertwotomake /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 629;BA.debugLine="func.playerOneHs = 0";
Debug.ShouldStop(1048576);
parent._func._playeronehs /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 630;BA.debugLine="func.playerTwoHs = 0";
Debug.ShouldStop(2097152);
parent._func._playertwohs /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 631;BA.debugLine="func.p1HsTemp = 0";
Debug.ShouldStop(4194304);
parent._func._p1hstemp /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 632;BA.debugLine="func.p2HsTemp = 0";
Debug.ShouldStop(8388608);
parent._func._p2hstemp /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 633;BA.debugLine="B4XProgressBarP1.Progress = 0";
Debug.ShouldStop(16777216);
parent._b4xprogressbarp1.runClassMethod (b4j.example.b4xprogressbar.class, "_setprogress" /*RemoteObject*/ ,BA.numberCast(float.class, 0));
 BA.debugLineNum = 634;BA.debugLine="B4XProgressBarP2.Progress = 0";
Debug.ShouldStop(33554432);
parent._b4xprogressbarp2.runClassMethod (b4j.example.b4xprogressbar.class, "_setprogress" /*RemoteObject*/ ,BA.numberCast(float.class, 0));
 BA.debugLineNum = 635;BA.debugLine="setP1Name";
Debug.ShouldStop(67108864);
_setp1name();
 BA.debugLineNum = 637;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _setcaromnumber(RemoteObject _v,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setCaromNumber (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,573);
if (RapidSub.canDelegate("setcaromnumber")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","setcaromnumber", _v, _value);}
Debug.locals.put("v", _v);
Debug.locals.put("value", _value);
 BA.debugLineNum = 573;BA.debugLine="Sub setCaromNumber(v As B4XView, value As String)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 576;BA.debugLine="v.Color = 0x00FFFFFF";
Debug.ShouldStop(-2147483648);
_v.runMethod(true,"setColor",BA.numberCast(int.class, 0x00ffffff));
 BA.debugLineNum = 577;BA.debugLine="v.Text = value";
Debug.ShouldStop(1);
_v.runMethod(true,"setText",_value);
 BA.debugLineNum = 580;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfontsize() throws Exception{
try {
		Debug.PushSubsStack("setFontSize (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,180);
if (RapidSub.canDelegate("setfontsize")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","setfontsize");}
 BA.debugLineNum = 180;BA.debugLine="Sub setFontSize";
Debug.ShouldStop(524288);
 BA.debugLineNum = 234;BA.debugLine="func.caromLabelCss(lbl_player_one_hs, \"labelWhite";
Debug.ShouldStop(512);
scorebord._func.runVoidMethod ("_caromlabelcss" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_one_hs),(Object)(RemoteObject.createImmutable("labelWhite")));
 BA.debugLineNum = 235;BA.debugLine="func.caromLabelCss(lbl_player_one_moyenne, \"label";
Debug.ShouldStop(1024);
scorebord._func.runVoidMethod ("_caromlabelcss" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_one_moyenne),(Object)(RemoteObject.createImmutable("labelWhite")));
 BA.debugLineNum = 236;BA.debugLine="func.caromLabelCss(lbl_player_one_perc, \"labelWhi";
Debug.ShouldStop(2048);
scorebord._func.runVoidMethod ("_caromlabelcss" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_one_perc),(Object)(RemoteObject.createImmutable("labelWhite")));
 BA.debugLineNum = 237;BA.debugLine="func.caromLabelCss(lbl_player_two_hs, \"labelWhite";
Debug.ShouldStop(4096);
scorebord._func.runVoidMethod ("_caromlabelcss" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_two_hs),(Object)(RemoteObject.createImmutable("labelWhite")));
 BA.debugLineNum = 238;BA.debugLine="func.caromLabelCss(lbl_player_two_moyenne, \"label";
Debug.ShouldStop(8192);
scorebord._func.runVoidMethod ("_caromlabelcss" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_two_moyenne),(Object)(RemoteObject.createImmutable("labelWhite")));
 BA.debugLineNum = 239;BA.debugLine="func.caromLabelCss(lbl_player_two_perc, \"labelWhi";
Debug.ShouldStop(16384);
scorebord._func.runVoidMethod ("_caromlabelcss" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_two_perc),(Object)(RemoteObject.createImmutable("labelWhite")));
 BA.debugLineNum = 240;BA.debugLine="func.caromLabelCss(lbl_innings, \"labelCarom\")";
Debug.ShouldStop(32768);
scorebord._func.runVoidMethod ("_caromlabelcss" /*RemoteObject*/ ,(Object)(scorebord._lbl_innings),(Object)(RemoteObject.createImmutable("labelCarom")));
 BA.debugLineNum = 241;BA.debugLine="func.caromLabelCss(lbl_player_one_100, \"labelCaro";
Debug.ShouldStop(65536);
scorebord._func.runVoidMethod ("_caromlabelcss" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_one_100),(Object)(RemoteObject.createImmutable("labelCarom")));
 BA.debugLineNum = 242;BA.debugLine="func.caromLabelCss(lbl_player_one_10, \"labelCarom";
Debug.ShouldStop(131072);
scorebord._func.runVoidMethod ("_caromlabelcss" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_one_10),(Object)(RemoteObject.createImmutable("labelCarom")));
 BA.debugLineNum = 243;BA.debugLine="func.caromLabelCss(lbl_player_one_1, \"labelCarom\"";
Debug.ShouldStop(262144);
scorebord._func.runVoidMethod ("_caromlabelcss" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_one_1),(Object)(RemoteObject.createImmutable("labelCarom")));
 BA.debugLineNum = 244;BA.debugLine="func.caromLabelCss(lbl_player_two_100, \"labelCaro";
Debug.ShouldStop(524288);
scorebord._func.runVoidMethod ("_caromlabelcss" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_two_100),(Object)(RemoteObject.createImmutable("labelCarom")));
 BA.debugLineNum = 245;BA.debugLine="func.caromLabelCss(lbl_player_two_10, \"labelCarom";
Debug.ShouldStop(1048576);
scorebord._func.runVoidMethod ("_caromlabelcss" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_two_10),(Object)(RemoteObject.createImmutable("labelCarom")));
 BA.debugLineNum = 246;BA.debugLine="func.caromLabelCss(lbl_player_two_1, \"labelCarom\"";
Debug.ShouldStop(2097152);
scorebord._func.runVoidMethod ("_caromlabelcss" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_two_1),(Object)(RemoteObject.createImmutable("labelCarom")));
 BA.debugLineNum = 247;BA.debugLine="func.caromLabelCss(lbl_player_one_make_100, \"labe";
Debug.ShouldStop(4194304);
scorebord._func.runVoidMethod ("_caromlabelcss" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_one_make_100),(Object)(RemoteObject.createImmutable("labelCarom")));
 BA.debugLineNum = 248;BA.debugLine="func.caromLabelCss(lbl_player_one_make_10, \"label";
Debug.ShouldStop(8388608);
scorebord._func.runVoidMethod ("_caromlabelcss" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_one_make_10),(Object)(RemoteObject.createImmutable("labelCarom")));
 BA.debugLineNum = 249;BA.debugLine="func.caromLabelCss(lbl_player_one_make_1, \"labelC";
Debug.ShouldStop(16777216);
scorebord._func.runVoidMethod ("_caromlabelcss" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_one_make_1),(Object)(RemoteObject.createImmutable("labelCarom")));
 BA.debugLineNum = 250;BA.debugLine="func.caromLabelCss(lbl_player_two_make_100, \"labe";
Debug.ShouldStop(33554432);
scorebord._func.runVoidMethod ("_caromlabelcss" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_two_make_100),(Object)(RemoteObject.createImmutable("labelCarom")));
 BA.debugLineNum = 251;BA.debugLine="func.caromLabelCss(lbl_player_two_make_10, \"label";
Debug.ShouldStop(67108864);
scorebord._func.runVoidMethod ("_caromlabelcss" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_two_make_10),(Object)(RemoteObject.createImmutable("labelCarom")));
 BA.debugLineNum = 252;BA.debugLine="func.caromLabelCss(lbl_player_two_make_1, \"labelC";
Debug.ShouldStop(134217728);
scorebord._func.runVoidMethod ("_caromlabelcss" /*RemoteObject*/ ,(Object)(scorebord._lbl_player_two_make_1),(Object)(RemoteObject.createImmutable("labelCarom")));
 BA.debugLineNum = 254;BA.debugLine="resetBoard(False)";
Debug.ShouldStop(536870912);
_resetboard(scorebord.__c.getField(true,"False"));
 BA.debugLineNum = 256;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sethandler(RemoteObject _ob,RemoteObject _eventname,RemoteObject _handlername) throws Exception{
try {
		Debug.PushSubsStack("setHandler (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,836);
if (RapidSub.canDelegate("sethandler")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","sethandler", _ob, _eventname, _handlername);}
Debug.locals.put("ob", _ob);
Debug.locals.put("eventName", _eventname);
Debug.locals.put("handlerName", _handlername);
 BA.debugLineNum = 836;BA.debugLine="private Sub setHandler(ob As JavaObject,eventName";
Debug.ShouldStop(8);
 BA.debugLineNum = 837;BA.debugLine="ob.RunMethod(eventName, Array(ob.CreateEventFromU";
Debug.ShouldStop(16);
_ob.runVoidMethod ("RunMethod",(Object)(_eventname),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_ob.runMethod(false,"CreateEventFromUI",scorebord.ba,(Object)(BA.ObjectToString("javafx.event.EventHandler")),(Object)(_handlername),(Object)((scorebord.__c.getField(true,"True"))))})));
 BA.debugLineNum = 838;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setp1name() throws Exception{
try {
		Debug.PushSubsStack("setP1Name (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,640);
if (RapidSub.canDelegate("setp1name")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","setp1name");}
 BA.debugLineNum = 640;BA.debugLine="Sub setP1Name";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 641;BA.debugLine="lbl_player_one_name.Color = 0xff3455db'0xFF69D79A";
Debug.ShouldStop(1);
scorebord._lbl_player_one_name.runMethod(true,"setColor",BA.numberCast(int.class, 0xff3455db));
 BA.debugLineNum = 642;BA.debugLine="lbl_player_two_name.Color = 0xFF001A01";
Debug.ShouldStop(2);
scorebord._lbl_player_two_name.runMethod(true,"setColor",BA.numberCast(int.class, 0xff001a01));
 BA.debugLineNum = 651;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setp2name() throws Exception{
try {
		Debug.PushSubsStack("setP2Name (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,653);
if (RapidSub.canDelegate("setp2name")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","setp2name");}
 BA.debugLineNum = 653;BA.debugLine="Sub setP2Name";
Debug.ShouldStop(4096);
 BA.debugLineNum = 654;BA.debugLine="lbl_player_two_name.Color = 0xff3455db'0xFF69D79A";
Debug.ShouldStop(8192);
scorebord._lbl_player_two_name.runMethod(true,"setColor",BA.numberCast(int.class, 0xff3455db));
 BA.debugLineNum = 655;BA.debugLine="lbl_player_one_name.Color = 0xFF001A01";
Debug.ShouldStop(16384);
scorebord._lbl_player_one_name.runMethod(true,"setColor",BA.numberCast(int.class, 0xff001a01));
 BA.debugLineNum = 664;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpromoterunning(RemoteObject _running) throws Exception{
try {
		Debug.PushSubsStack("setPromoteRunning (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,812);
if (RapidSub.canDelegate("setpromoterunning")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","setpromoterunning", _running);}
Debug.locals.put("running", _running);
 BA.debugLineNum = 812;BA.debugLine="Sub setPromoteRunning(running As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 813;BA.debugLine="promoteRunning = running";
Debug.ShouldStop(4096);
scorebord._promoterunning = _running;
 BA.debugLineNum = 814;BA.debugLine="Log(\"Promote Running \" & promoteRunning)";
Debug.ShouldStop(8192);
scorebord.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Promote Running "),scorebord._promoterunning)));
 BA.debugLineNum = 815;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _show() throws Exception{
try {
		Debug.PushSubsStack("show (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,92);
if (RapidSub.canDelegate("show")) { b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","show"); return;}
ResumableSub_show rsub = new ResumableSub_show(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_show extends BA.ResumableSub {
public ResumableSub_show(b4j.example.scorebord parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.example.scorebord parent;
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("show (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,92);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 94;BA.debugLine="frm.Initialize(\"frm\", 1920, 1080)";
Debug.ShouldStop(536870912);
parent._frm.runVoidMethod ("Initialize",scorebord.ba,(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, 1920)),(Object)(BA.numberCast(double.class, 1080)));
 BA.debugLineNum = 95;BA.debugLine="frm.RootPane.LoadLayout(\"scorebord\")";
Debug.ShouldStop(1073741824);
parent._frm.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",scorebord.ba,(Object)(RemoteObject.createImmutable("scorebord")));
 BA.debugLineNum = 96;BA.debugLine="frm.Stylesheets.Add(File.GetUri(File.DirAssets, \"";
Debug.ShouldStop(-2147483648);
parent._frm.runMethod(false,"getStylesheets").runVoidMethod ("Add",(Object)((parent.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("n205.css"))))));
 BA.debugLineNum = 97;BA.debugLine="setFontSize";
Debug.ShouldStop(1);
_setfontsize();
 BA.debugLineNum = 99;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
Debug.ShouldStop(4);
parent._frm.runVoidMethod ("SetFormStyle",(Object)(RemoteObject.createImmutable("UTILITY")));
 BA.debugLineNum = 105;BA.debugLine="frm.Show";
Debug.ShouldStop(256);
parent._frm.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 106;BA.debugLine="MouseOver(frm.RootPane)";
Debug.ShouldStop(512);
_mouseover(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), parent._frm.runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 108;BA.debugLine="Base = frm.RootPane";
Debug.ShouldStop(2048);
parent._base.setObject(parent._frm.runMethod(false,"getRootPane").getObject());
 BA.debugLineNum = 109;BA.debugLine="Dialog.Initialize (Base)";
Debug.ShouldStop(4096);
parent._dialog.runClassMethod (b4j.example.b4xdialog.class, "_initialize" /*RemoteObject*/ ,scorebord.ba,(Object)(parent._base));
 BA.debugLineNum = 111;BA.debugLine="func.SetFormCursor(frm, \"mouse.png\")";
Debug.ShouldStop(16384);
parent._func.runVoidMethod ("_setformcursor" /*RemoteObject*/ ,(Object)(parent._frm),(Object)(RemoteObject.createImmutable("mouse.png")));
 BA.debugLineNum = 112;BA.debugLine="parseConfig.parseConfig";
Debug.ShouldStop(32768);
parent._parseconfig.runVoidMethod ("_parseconfig" /*RemoteObject*/ );
 BA.debugLineNum = 114;BA.debugLine="clsTmr.Initialize(lbl_clock)";
Debug.ShouldStop(131072);
parent._clstmr.runClassMethod (b4j.example.timerclass.class, "_initialize" /*RemoteObject*/ ,scorebord.ba,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), parent._lbl_clock.getObject()));
 BA.debugLineNum = 115;BA.debugLine="inactivecls.Initialize";
Debug.ShouldStop(262144);
parent._inactivecls.runClassMethod (b4j.example.inactiveclass.class, "_initialize" /*RemoteObject*/ ,scorebord.ba);
 BA.debugLineNum = 116;BA.debugLine="clsCheckCfg.Initialize";
Debug.ShouldStop(524288);
parent._clscheckcfg.runClassMethod (b4j.example.classcheckconfig.class, "_initialize" /*RemoteObject*/ ,scorebord.ba);
 BA.debugLineNum = 117;BA.debugLine="clsToast.Initialize(frm.RootPane)";
Debug.ShouldStop(1048576);
parent._clstoast.runClassMethod (b4j.example.clxtoastmessage.class, "_initialize" /*RemoteObject*/ ,scorebord.ba,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent._frm.runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 120;BA.debugLine="func.lblInnings = lbl_innings";
Debug.ShouldStop(8388608);
parent._func._lblinnings /*RemoteObject*/  = parent._lbl_innings;
 BA.debugLineNum = 121;BA.debugLine="func.lbl_player_one_hs = lbl_player_one_hs";
Debug.ShouldStop(16777216);
parent._func._lbl_player_one_hs /*RemoteObject*/  = parent._lbl_player_one_hs;
 BA.debugLineNum = 122;BA.debugLine="func.lbl_player_two_hs = lbl_player_two_hs";
Debug.ShouldStop(33554432);
parent._func._lbl_player_two_hs /*RemoteObject*/  = parent._lbl_player_two_hs;
 BA.debugLineNum = 128;BA.debugLine="func.setP1CaromLables(lstPlayerOneScoreLbl)";
Debug.ShouldStop(-2147483648);
parent._func.runVoidMethod ("_setp1caromlables" /*RemoteObject*/ ,(Object)(_lstplayeronescorelbl()));
 BA.debugLineNum = 129;BA.debugLine="func.setP2CaromLables(lstPlayerTwoScoreLbl)";
Debug.ShouldStop(1);
parent._func.runVoidMethod ("_setp2caromlables" /*RemoteObject*/ ,(Object)(_lstplayertwoscorelbl()));
 BA.debugLineNum = 130;BA.debugLine="Wait For (funcInet.testInet) Complete (result As";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", scorebord.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "scorebord", "show"), parent._funcinet.runMethod(false,"_testinet" /*RemoteObject*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 132;BA.debugLine="Log($\"Has internet access is ${result}\"$)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Has internet access is "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_result))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 134;BA.debugLine="If result Then";
Debug.ShouldStop(32);
if (true) break;

case 1:
//if
this.state = 6;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 135;BA.debugLine="func.hasInternetAccess = True";
Debug.ShouldStop(64);
parent._func._hasinternetaccess /*RemoteObject*/  = parent.__c.getField(true,"True");
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 138;BA.debugLine="func.hasInternetAccess = False";
Debug.ShouldStop(512);
parent._func._hasinternetaccess /*RemoteObject*/  = parent.__c.getField(true,"False");
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 142;BA.debugLine="initPanels";
Debug.ShouldStop(8192);
_initpanels();
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
public static RemoteObject  _showpromote() throws Exception{
try {
		Debug.PushSubsStack("showPromote (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,786);
if (RapidSub.canDelegate("showpromote")) { return b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","showpromote");}
 BA.debugLineNum = 786;BA.debugLine="Sub showPromote";
Debug.ShouldStop(131072);
 BA.debugLineNum = 787;BA.debugLine="pn_promote.SetLayoutAnimated(0, 50dip, 50dip, pn_";
Debug.ShouldStop(262144);
scorebord._pn_promote.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, scorebord.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))))),(Object)(BA.numberCast(double.class, scorebord.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))))),(Object)(scorebord._pn_promote.runMethod(true,"getWidth")),(Object)(scorebord._pn_promote.runMethod(true,"getHeight")));
 BA.debugLineNum = 788;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _updatecfg() throws Exception{
try {
		Debug.PushSubsStack("updateCfg (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,855);
if (RapidSub.canDelegate("updatecfg")) { b4j.example.scorebord.remoteMe.runUserSub(false, "scorebord","updatecfg"); return;}
ResumableSub_updateCfg rsub = new ResumableSub_updateCfg(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_updateCfg extends BA.ResumableSub {
public ResumableSub_updateCfg(b4j.example.scorebord parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.example.scorebord parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("updateCfg (scorebord) ","scorebord",1,scorebord.ba,scorebord.mostCurrent,855);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 856;BA.debugLine="inactivecls.updatePromote";
Debug.ShouldStop(8388608);
parent._inactivecls.runClassMethod (b4j.example.inactiveclass.class, "_updatepromote" /*RemoteObject*/ );
 BA.debugLineNum = 857;BA.debugLine="lbl_config_update.Visible = True";
Debug.ShouldStop(16777216);
parent._lbl_config_update.runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 858;BA.debugLine="Sleep(5000)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("Sleep",scorebord.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "scorebord", "updatecfg"),BA.numberCast(int.class, 5000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 859;BA.debugLine="lbl_config_update.Visible = False";
Debug.ShouldStop(67108864);
parent._lbl_config_update.runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 860;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
}