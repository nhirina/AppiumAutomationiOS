import java.net.MalformedURLException;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class iTracker_log_iPhone extends Capabilities_iPhone {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		IOSDriver<IOSElement> driver = capabilities();
		Thread.sleep(4000);
		driver.findElementByAccessibilityId("usernameTextfield").sendKeys("test");
        driver.findElementByAccessibilityId("passwordTextfield").sendKeys("test");
        driver.findElementByAccessibilityId("signInButton").click();
        
        
        driver.hideKeyboard();
        
        

 	}

}
