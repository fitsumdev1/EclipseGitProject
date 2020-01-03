package Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		 DesiredCapabilities dc = new DesiredCapabilities();

	        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator"); // Android Emulator

	        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

	        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");

	        dc.setCapability("appPackage", "com.android.calculator2");
	        dc.setCapability("appActivity", "com.android.calculator2.Calculator"); // This is Launcher activity of your app
	                                                                                // (you can get it from apk info app)

	        URL url = new URL("http://127.0.0.1:4723/wd/hub");

	        AndroidDriver driver = new AndroidDriver(url, dc);

	        Thread.sleep(5000);
	        driver.findElementById("com.android.calculator2:id/digit_7").click();
	        Thread.sleep(2000);
	        driver.findElementById("com.android.calculator2:id/op_add").click();
	        Thread.sleep(2000);
	        driver.findElementById("com.android.calculator2:id/digit_8").click();
	        Thread.sleep(2000);
	        driver.findElementById("com.android.calculator2:id/eq").click();
	        Thread.sleep(2000);
	        String actual= driver.findElementById("com.android.calculator2:id/result").getText();
	       
	       if(actual.equals("15")) {
	    	   System.out.println("Test case got passed");
	       }
	       else {
	    	   System.out.println("Test case got failed");
	       }
	        

	}

}
