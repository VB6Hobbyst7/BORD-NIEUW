package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xdatetemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.b4xdatetemplate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xdatetemplate.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvvvvv6 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
public float _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0f;
public float _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0f;
public float _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0f;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _dayspanebg = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _dayspanefg = null;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvvvvvvv2 = null;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public long _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0L;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _daystitlespane = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnmonthleft = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnmonthright = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnyearleft = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnyearright = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblmonth = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblyear = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public b4j.example.b4xdialog _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
public b4j.example.cssutils _vvvvvvvv0 = null;
public b4j.example.dateutils _vvvvvvvvv1 = null;
public b4j.example.main _main = null;
public b4j.example.scorebord _vvvvvvvvv2 = null;
public b4j.example.func _vvvvvvvvv3 = null;
public b4j.example.parseconfig _vvvvvvvvv4 = null;
public b4j.example.funcinet _vvvvvvvvv5 = null;
public b4j.example.httputils2service _vvvvvvvvv6 = null;
public String  _btnmonth_click() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
int _m = 0;
 //BA.debugLineNum = 147;BA.debugLine="Private Sub btnMonth_Click";
 //BA.debugLineNum = 148;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn.setObject((java.lang.Object)(__c.Sender(ba)));
 //BA.debugLineNum = 149;BA.debugLine="Dim m As Int = 12 + month - 1 + btn.Tag";
_m = (int) (12+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2-1+(double)(BA.ObjectToNumber(_btn.getTag())));
 //BA.debugLineNum = 150;BA.debugLine="month = (m Mod 12) + 1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = (int) ((_m%12)+1);
 //BA.debugLineNum = 151;BA.debugLine="DrawDays";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return "";
}
public String  _btnyear_click() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
 //BA.debugLineNum = 141;BA.debugLine="Private Sub btnYear_Click";
 //BA.debugLineNum = 142;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn.setObject((java.lang.Object)(__c.Sender(ba)));
 //BA.debugLineNum = 143;BA.debugLine="year = year + btn.Tag";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+(double)(BA.ObjectToNumber(_btn.getTag())));
 //BA.debugLineNum = 144;BA.debugLine="DrawDays";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private xui As XUI";
_vvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 3;BA.debugLine="Private month, year As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
 //BA.debugLineNum = 4;BA.debugLine="Private boxW, boxH As Float";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0f;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0f;
 //BA.debugLineNum = 5;BA.debugLine="Private vCorrection As Float";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0f;
 //BA.debugLineNum = 6;BA.debugLine="Private tempSelectedDay As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
 //BA.debugLineNum = 7;BA.debugLine="Private dayOfWeekOffset As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
 //BA.debugLineNum = 8;BA.debugLine="Private daysInMonth As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
 //BA.debugLineNum = 9;BA.debugLine="Private DaysPaneBg As B4XView";
_dayspanebg = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private DaysPaneFg As B4XView";
_dayspanefg = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private cvs As B4XCanvas";
_vvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 12;BA.debugLine="Private cvsBackground As B4XCanvas";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 13;BA.debugLine="Private selectedDate As Long";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0L;
 //BA.debugLineNum = 14;BA.debugLine="Private selectedYear, selectedMonth, selectedDay";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
 //BA.debugLineNum = 15;BA.debugLine="Public HighlightedColor As Int = 0xFF001BBD";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = (int) (0xff001bbd);
 //BA.debugLineNum = 16;BA.debugLine="Public SelectedColor As Int = 0xFF0BA29B";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (int) (0xff0ba29b);
 //BA.debugLineNum = 17;BA.debugLine="Public DaysInMonthColor As Int = xui.Color_White";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _vvvvvvvvvvvv6.Color_White;
 //BA.debugLineNum = 18;BA.debugLine="Public DaysInWeekColor As Int = xui.Color_Gray";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvvvvvvvvvvv6.Color_Gray;
 //BA.debugLineNum = 19;BA.debugLine="Private cvsDays As B4XCanvas";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 20;BA.debugLine="Private DaysTitlesPane As B4XView";
_daystitlespane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Public FirstDay As Int = 0";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = (int) (0);
 //BA.debugLineNum = 22;BA.debugLine="Public MinYear = 1970, MaxYear = 2030 As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = (int) (1970);
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) (2030);
 //BA.debugLineNum = 23;BA.debugLine="Public btnMonthLeft As B4XView";
_btnmonthleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Public btnMonthRight As B4XView";
_btnmonthright = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Public btnYearLeft As B4XView";
_btnyearleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Public btnYearRight As B4XView";
_btnyearright = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Public lblMonth As B4XView";
_lblmonth = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Public lblYear As B4XView";
_lblyear = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private pnlDialog As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private months As List";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 31;BA.debugLine="Private mDialog As B4XDialog";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new b4j.example.b4xdialog();
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public String  _dayspanefg_touch(int _action,float _x,float _y) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
 //BA.debugLineNum = 154;BA.debugLine="Private Sub DaysPaneFg_Touch (Action As Int, X As";
 //BA.debugLineNum = 155;BA.debugLine="Dim p As B4XView = DaysPaneFg";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _dayspanefg;
 //BA.debugLineNum = 156;BA.debugLine="HandleMouse(X, Y, Action <> p.TOUCH_ACTION_UP)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_x,_y,_action!=_p.TOUCH_ACTION_UP);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(int _result) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(anywheresoftware.b4a.objects.B4XCanvas _c,int _clr,int _x,int _y) throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
 //BA.debugLineNum = 82;BA.debugLine="Private Sub DrawBox(c As B4XCanvas, clr As Int, x";
 //BA.debugLineNum = 83;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 84;BA.debugLine="r.Initialize(x * boxW, y * boxH, x * boxW + boxW,";
_r.Initialize((float) (_x*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4),(float) (_y*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5),(float) (_x*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4),(float) (_y*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5));
 //BA.debugLineNum = 85;BA.debugLine="c.DrawRect(r, clr, True, 1dip)";
_c.DrawRect(_r,_clr,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
long _firstdayofmonth = 0L;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _daysfont = null;
int _day = 0;
int _row = 0;
 //BA.debugLineNum = 57;BA.debugLine="Private Sub DrawDays";
 //BA.debugLineNum = 58;BA.debugLine="lblMonth.Text = months.Get(month - 1)";
_lblmonth.setText(BA.ObjectToString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Get((int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2-1))));
 //BA.debugLineNum = 59;BA.debugLine="lblYear.Text = year";
_lblyear.setText(BA.NumberToString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3));
 //BA.debugLineNum = 60;BA.debugLine="btnYearLeft.Enabled = year > MinYear";
_btnyearleft.setEnabled(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3>_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4);
 //BA.debugLineNum = 61;BA.debugLine="btnYearRight.Enabled = year < MaxYear";
_btnyearright.setEnabled(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3<_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5);
 //BA.debugLineNum = 62;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
_vvvvvvvvvvvvv2.ClearRect(_vvvvvvvvvvvvv2.getTargetRect());
 //BA.debugLineNum = 63;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ClearRect(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getTargetRect());
 //BA.debugLineNum = 64;BA.debugLine="Dim firstDayOfMonth As Long = DateUtils.setDate(y";
_firstdayofmonth = (long) (_vvvvvvvvv1._setdate(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,(int) (1))-1);
 //BA.debugLineNum = 65;BA.debugLine="dayOfWeekOffset = (7 + DateTime.GetDayOfWeek(firs";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (int) ((7+__c.DateTime.GetDayOfWeek(_firstdayofmonth)-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)%7);
 //BA.debugLineNum = 66;BA.debugLine="daysInMonth = DateUtils.NumberOfDaysInMonth(month";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvvvvvvvv1._numberofdaysinmonth(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
 //BA.debugLineNum = 67;BA.debugLine="If year = selectedYear And month = selectedMonth";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3==_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2==_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) { 
 //BA.debugLineNum = 69;BA.debugLine="DrawBox(cvs, SelectedColor, (selectedDay - 1 + d";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(_vvvvvvvvvvvvv2,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,(int) ((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6-1+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)%7),(int) ((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6-1+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)/(double)7));
 };
 //BA.debugLineNum = 72;BA.debugLine="Dim daysFont As B4XFont = xui.CreateDefaultBoldFo";
_daysfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_daysfont = _vvvvvvvvvvvv6.CreateDefaultBoldFont((float) (14));
 //BA.debugLineNum = 73;BA.debugLine="For day = 1 To daysInMonth";
{
final int step14 = 1;
final int limit14 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
_day = (int) (1) ;
for (;_day <= limit14 ;_day = _day + step14 ) {
 //BA.debugLineNum = 74;BA.debugLine="Dim row As Int = (day - 1 + dayOfWeekOffset) / 7";
_row = (int) ((_day-1+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)/(double)7);
 //BA.debugLineNum = 75;BA.debugLine="cvs.DrawText(day, (((dayOfWeekOffset + day - 1)";
_vvvvvvvvvvvvv2.DrawText(BA.NumberToString(_day),(((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0+_day-1)%7)+0.5)*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,(_row+0.5)*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,_daysfont,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 }
};
 //BA.debugLineNum = 78;BA.debugLine="cvsBackground.Invalidate";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Invalidate();
 //BA.debugLineNum = 79;BA.debugLine="cvs.Invalidate";
_vvvvvvvvvvvvv2.Invalidate();
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public long  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Public Sub getDate As Long";
 //BA.debugLineNum = 90;BA.debugLine="Return selectedDate";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4j.example.b4xdialog _dialog) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
 //BA.debugLineNum = 160;BA.debugLine="Return pnlDialog";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6;
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(double _x,double _y,boolean _move) throws Exception{
int _boxx = 0;
int _boxy = 0;
int _newselectedday = 0;
boolean _validday = false;
 //BA.debugLineNum = 114;BA.debugLine="Private Sub HandleMouse(x As Double, y As Double,";
 //BA.debugLineNum = 115;BA.debugLine="Dim boxX = x / boxW, boxY =  y / boxH As Int";
_boxx = (int) (_x/(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4);
_boxy = (int) (_y/(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5);
 //BA.debugLineNum = 116;BA.debugLine="Dim newSelectedDay As Int = boxY * 7 + boxX + 1 -";
_newselectedday = (int) (_boxy*7+_boxx+1-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 117;BA.debugLine="Dim validDay As Boolean = newSelectedDay > 0 And";
_validday = _newselectedday>0 && _newselectedday<=_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
 //BA.debugLineNum = 118;BA.debugLine="If move Then";
if (_move) { 
 //BA.debugLineNum = 119;BA.debugLine="If newSelectedDay = tempSelectedDay Then Return";
if (_newselectedday==_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7) { 
if (true) return "";};
 //BA.debugLineNum = 120;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ClearRect(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getTargetRect());
 //BA.debugLineNum = 121;BA.debugLine="tempSelectedDay = newSelectedDay";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _newselectedday;
 //BA.debugLineNum = 122;BA.debugLine="If validDay Then";
if (_validday) { 
 //BA.debugLineNum = 123;BA.debugLine="DrawBox(cvsBackground, HighlightedColor, boxX,";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,_boxx,_boxy);
 };
 }else {
 //BA.debugLineNum = 126;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ClearRect(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getTargetRect());
 //BA.debugLineNum = 127;BA.debugLine="If validDay Then";
if (_validday) { 
 //BA.debugLineNum = 128;BA.debugLine="SelectDay(newSelectedDay)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(_newselectedday);
 //BA.debugLineNum = 129;BA.debugLine="Hide";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
 };
 };
 //BA.debugLineNum = 133;BA.debugLine="cvsBackground.Invalidate";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Invalidate();
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6() throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Private Sub Hide";
 //BA.debugLineNum = 137;BA.debugLine="mDialog.Close(xui.DialogResponse_Positive)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*boolean*/ (_vvvvvvvvvvvv6.DialogResponse_Positive);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _p = null;
anywheresoftware.b4j.objects.JFX _fx = null;
 //BA.debugLineNum = 34;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 35;BA.debugLine="pnlDialog = xui.CreatePanel(\"\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvv6.CreatePanel(ba,"");
 //BA.debugLineNum = 36;BA.debugLine="pnlDialog.SetLayoutAnimated(0, 0, 0, 320dip,300di";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (320)),__c.DipToCurrent((int) (300)));
 //BA.debugLineNum = 37;BA.debugLine="pnlDialog.LoadLayout(\"DateTemplate\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.LoadLayout("DateTemplate",ba);
 //BA.debugLineNum = 38;BA.debugLine="pnlDialog.Tag = Me";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setTag(this);
 //BA.debugLineNum = 39;BA.debugLine="month = DateTime.GetMonth(DateTime.Now)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = __c.DateTime.GetMonth(__c.DateTime.getNow());
 //BA.debugLineNum = 40;BA.debugLine="year = DateTime.GetYear(DateTime.Now)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = __c.DateTime.GetYear(__c.DateTime.getNow());
 //BA.debugLineNum = 41;BA.debugLine="months = DateUtils.GetMonthsNames";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvv1._getmonthsnames();
 //BA.debugLineNum = 42;BA.debugLine="selectedDate = DateTime.Now";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = __c.DateTime.getNow();
 //BA.debugLineNum = 43;BA.debugLine="setDate(selectedDate)";
_setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
 //BA.debugLineNum = 44;BA.debugLine="cvs.Initialize(DaysPaneFg)";
_vvvvvvvvvvvvv2.Initialize(ba,_dayspanefg);
 //BA.debugLineNum = 45;BA.debugLine="cvsBackground.Initialize(DaysPaneBg)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Initialize(ba,_dayspanebg);
 //BA.debugLineNum = 46;BA.debugLine="boxW = cvs.TargetRect.Width / 7";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = (float) (_vvvvvvvvvvvvv2.getTargetRect().getWidth()/(double)7);
 //BA.debugLineNum = 47;BA.debugLine="boxH = cvs.TargetRect.Height / 6";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (float) (_vvvvvvvvvvvvv2.getTargetRect().getHeight()/(double)6);
 //BA.debugLineNum = 48;BA.debugLine="vCorrection = 5dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = (float) (__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 49;BA.debugLine="cvsDays.Initialize(DaysTitlesPane)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Initialize(ba,_daystitlespane);
 //BA.debugLineNum = 51;BA.debugLine="Dim p As Pane = DaysPaneFg";
_p = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_p.setObject((javafx.scene.layout.Pane)(_dayspanefg.getObject()));
 //BA.debugLineNum = 52;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 53;BA.debugLine="p.MouseCursor = fx.Cursors.HAND";
_p.setMouseCursor(_fx.Cursors.HAND);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(int _day) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Private Sub SelectDay(day As Int)";
 //BA.debugLineNum = 107;BA.debugLine="selectedDate = DateUtils.setDate(year, month, day";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvv1._setdate(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,_day);
 //BA.debugLineNum = 108;BA.debugLine="selectedDay = day";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _day;
 //BA.debugLineNum = 109;BA.debugLine="selectedMonth = month";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
 //BA.debugLineNum = 110;BA.debugLine="selectedYear = year";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(long _date) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Public Sub setDate(date As Long)";
 //BA.debugLineNum = 95;BA.debugLine="If lblYear.IsInitialized = False Then";
if (_lblyear.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 96;BA.debugLine="selectedDate = date";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _date;
 //BA.debugLineNum = 97;BA.debugLine="Return 'the date will be set after the layout is";
if (true) return "";
 };
 //BA.debugLineNum = 99;BA.debugLine="year = DateTime.GetYear(date)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = __c.DateTime.GetYear(_date);
 //BA.debugLineNum = 100;BA.debugLine="month = DateTime.GetMonth(date)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = __c.DateTime.GetMonth(_date);
 //BA.debugLineNum = 101;BA.debugLine="SelectDay(DateTime.GetDayOfMonth(date))";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(__c.DateTime.GetDayOfMonth(_date));
 //BA.debugLineNum = 102;BA.debugLine="lblYear.Text = year";
_lblyear.setText(BA.NumberToString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3));
 //BA.debugLineNum = 103;BA.debugLine="lblMonth.Text = months.Get(month - 1)";
_lblmonth.setText(BA.ObjectToString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Get((int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2-1))));
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public String  _show(b4j.example.b4xdialog _dialog) throws Exception{
anywheresoftware.b4a.objects.collections.List _days = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _daysfont = null;
int _i = 0;
String _d = "";
 //BA.debugLineNum = 163;BA.debugLine="Private Sub Show (Dialog As B4XDialog)";
 //BA.debugLineNum = 164;BA.debugLine="Dim days As List = DateUtils.GetDaysNames";
_days = new anywheresoftware.b4a.objects.collections.List();
_days = _vvvvvvvvv1._getdaysnames();
 //BA.debugLineNum = 165;BA.debugLine="Dim daysFont As B4XFont = xui.CreateDefaultBoldFo";
_daysfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_daysfont = _vvvvvvvvvvvv6.CreateDefaultBoldFont((float) (14));
 //BA.debugLineNum = 166;BA.debugLine="cvsDays.ClearRect(cvsDays.TargetRect)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ClearRect(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getTargetRect());
 //BA.debugLineNum = 167;BA.debugLine="For i = FirstDay To FirstDay + 7 - 1";
{
final int step4 = 1;
final int limit4 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+7-1);
_i = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 168;BA.debugLine="Dim d As String = days.Get(i Mod 7)";
_d = BA.ObjectToString(_days.Get((int) (_i%7)));
 //BA.debugLineNum = 169;BA.debugLine="cvsDays.DrawText(d.SubString2(0, 2), (i - FirstD";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.DrawText(_d.substring((int) (0),(int) (2)),(_i-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+0.5)*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,__c.DipToCurrent((int) (20)),_daysfont,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 }
};
 //BA.debugLineNum = 171;BA.debugLine="cvsDays.Invalidate";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Invalidate();
 //BA.debugLineNum = 172;BA.debugLine="mDialog = Dialog";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _dialog;
 //BA.debugLineNum = 173;BA.debugLine="DrawDays";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
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
