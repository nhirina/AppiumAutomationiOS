import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class SafariBrowser {
	
	IOSDriver<IOSElement> driver;
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	@Test
public void brows() throws MalformedURLException
{
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.3");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
	driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://gmail.com");
}
	}


