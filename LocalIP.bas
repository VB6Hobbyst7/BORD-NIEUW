B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Private jo As JavaObject
End Sub

Public Sub Initialize
	jo = Me
End Sub

Public Sub GetIP As List
	Return jo.RunMethod("GetIps", Null)
End Sub

#If Java
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import anywheresoftware.b4a.objects.collections.List;

public Object GetIps() throws Exception {
	List ips = new anywheresoftware.b4a.objects.collections.List();
	ips.Initialize();
	Enumeration e = NetworkInterface.getNetworkInterfaces();
	while(e.hasMoreElements())
	{
	    NetworkInterface n = (NetworkInterface) e.nextElement();
	    Enumeration ee = n.getInetAddresses();
	    while (ee.hasMoreElements())
	    {
	        InetAddress i = (InetAddress) ee.nextElement();
	        ips.Add(i.getHostAddress());
	    }
	}
	return ips.getObject();
}
#End If