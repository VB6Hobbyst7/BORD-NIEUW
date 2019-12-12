package b4j.example;


import anywheresoftware.b4a.BA;

public class httputils2service extends Object{
public static httputils2service mostCurrent = new httputils2service();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.httputils2service", null);
		ba.loadHtSubs(httputils2service.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.httputils2service", ba);
		}
	}
    public static Class<?> getObject() {
		return httputils2service.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4h.okhttp.OkHttpClientWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public static anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public static String _vvvvvvvv1 = "";
public static int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public static b4j.example.cssutils _vvvvvvvv0 = null;
public static b4j.example.dateutils _vvvvvvvvv1 = null;
public static b4j.example.main _main = null;
public static b4j.example.scorebord _vvvvvvvvv2 = null;
public static b4j.example.func _vvvvvvvvv3 = null;
public static b4j.example.parseconfig _vvvvvvvvv4 = null;
public static b4j.example.funcinet _vvvvvvvvv5 = null;
public static String  _vvvvvvvv2(int _taskid,boolean _success,String _errormessage) throws Exception{
b4j.example.httpjob _job = null;
 //BA.debugLineNum = 107;BA.debugLine="Sub CompleteJob(TaskId As Int, success As Boolean,";
 //BA.debugLineNum = 111;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4j.example.httpjob)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get((Object)(_taskid)));
 //BA.debugLineNum = 112;BA.debugLine="TaskIdToJob.Remove(TaskId)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Remove((Object)(_taskid));
 //BA.debugLineNum = 113;BA.debugLine="job.success = success";
_job._vvvvvvvvvvvvvvvvvvvvv2 /*boolean*/  = _success;
 //BA.debugLineNum = 114;BA.debugLine="job.errorMessage = errorMessage";
_job._vvvvvvvvvvvvvvvvvvvvv5 /*String*/  = _errormessage;
 //BA.debugLineNum = 116;BA.debugLine="job.Complete(TaskId)";
_job._complete /*String*/ (_taskid);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responseerror(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,String _reason,int _statuscode,int _taskid) throws Exception{
b4j.example.httpjob _job = null;
 //BA.debugLineNum = 84;BA.debugLine="Sub hc_ResponseError (Response As OkHttpResponse,";
 //BA.debugLineNum = 85;BA.debugLine="Log($\"ResponseError. Reason: ${Reason}, Response:";
anywheresoftware.b4a.keywords.Common.Log(("ResponseError. Reason: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reason))+", Response: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_response.getErrorResponse()))+""));
 //BA.debugLineNum = 86;BA.debugLine="Response.Release";
_response.Release();
 //BA.debugLineNum = 87;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4j.example.httpjob)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get((Object)(_taskid)));
 //BA.debugLineNum = 88;BA.debugLine="job.Response = Response";
_job._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/  = _response;
 //BA.debugLineNum = 89;BA.debugLine="If Response.ErrorResponse <> \"\" Then";
if ((_response.getErrorResponse()).equals("") == false) { 
 //BA.debugLineNum = 90;BA.debugLine="CompleteJob(TaskId, False, Response.ErrorRespons";
_vvvvvvvv2(_taskid,anywheresoftware.b4a.keywords.Common.False,_response.getErrorResponse());
 }else {
 //BA.debugLineNum = 92;BA.debugLine="CompleteJob(TaskId, False, Reason)";
_vvvvvvvv2(_taskid,anywheresoftware.b4a.keywords.Common.False,_reason);
 };
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responsesuccess(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,int _taskid) throws Exception{
b4j.example.httpjob _job = null;
 //BA.debugLineNum = 69;BA.debugLine="Sub hc_ResponseSuccess (Response As OkHttpResponse";
 //BA.debugLineNum = 70;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4j.example.httpjob)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get((Object)(_taskid)));
 //BA.debugLineNum = 71;BA.debugLine="job.Response = Response";
_job._vvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/  = _response;
 //BA.debugLineNum = 72;BA.debugLine="Response.GetAsynchronously(\"response\", File.OpenO";
_response.GetAsynchronously(ba,"response",(java.io.OutputStream)(anywheresoftware.b4a.keywords.Common.File.OpenOutput(_vvvvvvvv1,BA.NumberToString(_taskid),anywheresoftware.b4a.keywords.Common.False).getObject()),anywheresoftware.b4a.keywords.Common.True,_taskid);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 11;BA.debugLine="Private hc As OkHttpClient";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private TaskIdToJob As Map";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 17;BA.debugLine="Public TempFolder As String";
_vvvvvvvv1 = "";
 //BA.debugLineNum = 18;BA.debugLine="Private taskCounter As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public static String  _response_streamfinish(boolean _success,int _taskid) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Private Sub Response_StreamFinish (Success As Bool";
 //BA.debugLineNum = 77;BA.debugLine="If Success Then";
if (_success) { 
 //BA.debugLineNum = 78;BA.debugLine="CompleteJob(TaskId, Success, \"\")";
_vvvvvvvv2(_taskid,_success,"");
 }else {
 //BA.debugLineNum = 80;BA.debugLine="CompleteJob(TaskId, Success, LastException.Messa";
_vvvvvvvv2(_taskid,_success,anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
 };
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Service_Create";
 //BA.debugLineNum = 33;BA.debugLine="TempFolder = File.DirTemp";
_vvvvvvvv1 = anywheresoftware.b4a.keywords.Common.File.getDirTemp();
 //BA.debugLineNum = 35;BA.debugLine="If hc.IsInitialized = False Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 40;BA.debugLine="hc.Initialize(\"hc\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Initialize("hc");
 };
 //BA.debugLineNum = 43;BA.debugLine="TaskIdToJob.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize();
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public static String  _submitjob(b4j.example.httpjob _job) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Public Sub SubmitJob(job As HttpJob)";
 //BA.debugLineNum = 57;BA.debugLine="If TaskIdToJob.IsInitialized = False Then Service";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
_service_create();};
 //BA.debugLineNum = 58;BA.debugLine="taskCounter = taskCounter + 1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6+1);
 //BA.debugLineNum = 59;BA.debugLine="TaskIdToJob.Put(taskCounter, job)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Put((Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6),(Object)(_job));
 //BA.debugLineNum = 60;BA.debugLine="If job.Username <> \"\" And job.Password <> \"\" Then";
if ((_job._vvvvvvvvvvvvvvvvvvvvv3 /*String*/ ).equals("") == false && (_job._vvvvvvvvvvvvvvvvvvvvv4 /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 61;BA.debugLine="hc.ExecuteCredentials(job.GetRequest, taskCounte";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.ExecuteCredentials(ba,_job._vvvvvvvvvvvvvvvvvvv3 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,_job._vvvvvvvvvvvvvvvvvvvvv3 /*String*/ ,_job._vvvvvvvvvvvvvvvvvvvvv4 /*String*/ );
 }else {
 //BA.debugLineNum = 63;BA.debugLine="hc.Execute(job.GetRequest, taskCounter)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Execute(ba,_job._vvvvvvvvvvvvvvvvvvv3 /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
 };
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
}
