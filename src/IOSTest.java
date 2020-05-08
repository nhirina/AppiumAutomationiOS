import java.net.MalformedURLException;

import org.openqa.selenium.Dimension;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;


public class IOSTest extends Practise{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		IOSDriver<IOSElement> driver = capabilities();
		/*driver.findElementByAccessibilityId("Alert Views").click();
		driver.findElementByAccessibilityId("Text Entry").click();
		driver.findElementByClassName("XCUIElemenTypeTextField").sendKeys("hello");
		driver.findElementByAccessibilityId("OK").click();
		driver.navigate().back();*/
		
		//Dimension size = driver.manage().window().getSize();
		//int x = size.getWidth()/2;
		//double starty = (int) (size.getHeight()*0.60);
		//double endy = (int) (size.getHeight()*0.10);
		//driver.swipe (x, starty, x, endy, 2000);
		driver.findElementByAccessibilityId("Steppers").click();
		driver.findElementByAccessibilityId("Increment").click();
		driver.findElementByAccessibilityId("Increment").click();
		System.out.println(driver.findElementsByClassName("XCUIElementTypeStaticText").get(1).getText());
		System.out.println(driver.findElementsByClassName("XCUIElementTypeStaticText").get(2).getText());
		System.out.println(driver.findElementsByClassName("XCUIElementTypeOther").get(0).getText());
		driver.findElementByAccessibilityId("Decrement").click();
		System.out.println(driver.findElementsByClassName("XCUIElementTypeStaticText").get(1).getText());
		driver.navigate().back();
		driver.findElementByAccessibilityId("AAPLPickerViewController").click();
		driver.findElementsByClassName("XCUIElementTypePickerWheel").get(1).sendKeys("220");
		driver.findElementByAccessibilityId("Red color component value").sendKeys("50");
		driver.findElementByXPath("//*[@name='Blue color component value']").sendKeys("130");
			
	}
}
