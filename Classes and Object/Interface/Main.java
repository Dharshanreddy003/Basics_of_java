class SmartHome
{
    final static class Device
    {
        final static int MAX_DEVICES=50;
        int Device_ID;
        String Device_Name;
        
        final static void getDeviceInfo()
        {
            Device_ID=15;
            Device_Name="Atom Berg Fan";
            
            return "Device ID : "+Device_ID+"\nDevice Name : "+Device_Name;
        }
    }
    final static class Configuration
    {
        final static int MAX_POWER_LIMIT=5000;
    }
}
abstract  class DeviceType
{
    static String getDeviceCategory(int Device_ID)
    {
        if(Device_ID<=25)
            return "FanDevice";
        else if(Device_ID>25)
            return "LightDevice";
        else
            return null;
    }
}
 
public class Main extends DeviceType
{
    static void display()
    {
	    SmartHome obj=new SmartHome();
	    
	    System.out.println(obj.getDeviceInfo());
		System.out.println("Device Category : "+DeviceType.getDeviceCategory(obj.Device_ID));
	}
	public static void main(String[] args)
	{
	    display();
	}
}