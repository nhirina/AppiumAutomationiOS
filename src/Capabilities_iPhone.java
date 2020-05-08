import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilities_iPhone {
	static IOSDriver<IOSElement> driver;
	public static IOSDriver<IOSElement> capabilities() throws MalformedURLException {

	DesiredCapabilities d = new DesiredCapabilities();
	
   d.setCapability(MobileCapabilityType.DEVICE_NAME,"iaapa's iPhone");
    d.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
    d.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.3");
    d.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
    d.setCapability(MobileCapabilityType.UDID, "0432d5e1e54ee38b0a8d257511d00db249d28c51");
    //d.setCapability(MobileCapabilityType.UDID, "0432d5e1e54ee38b0a8d257511d00db249d28c51");
    d.setCapability("xcodeOrgid", "2SCT4C2973");
    d.setCapability("xcodeSigningId", "iPhone Developer");
    d.setCapability("updateWDABundleId", "com.facebook.WebDriverAgentLib");
    d.setCapability("bundleId","com.accesso.iTracker");
    driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),d);
    d.setCapability(MobileCapabilityType.APP, "///Users//qamac//Desktop//iTracker.ipa");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
    
    
    
}
}