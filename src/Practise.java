

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Practise {
	static IOSDriver<IOSElement> driver;
	public static IOSDriver<IOSElement> capabilities() throws MalformedURLException
	{
		
       DesiredCapabilities d = new DesiredCapabilities();
       d.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 8");
       d.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
       d.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.3");
       //d.setCapability(MobileCapabilityType.UDID), value);
       
       d.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
       //d.setCapability(MobileCapabilityType.APP, "///Users//qamac//Desktop//UICatalog.app");
       d.setCapability(MobileCapabilityType.APP, "//Users//qamac//Desktop//iTracker.app");
       driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),d);
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
       return driver;
       
       
	}

}
