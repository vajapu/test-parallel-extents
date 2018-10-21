package com.comcast.ucAppAutomation.utils;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;
 
public class DriverFactory {
 
	public static RemoteWebDriver driver = null;
    public static WebDriverWait waitVar = null;
 
    public RemoteWebDriver createDriver(String cap) throws MalformedURLException, InterruptedException {
 
    	// set up appium
    			// Set up desired capabilities and pass the Android app-activity and
    			// app-package to Appium
    			DesiredCapabilities capabilities = new DesiredCapabilities();
    			String[] caps=cap.split(",");
    			for(String caplist: caps){
    				String[] capval=caplist.split(":-");
    				capabilities.setCapability(capval[0].trim(),capval[1].trim());
    			}
//    			capabilities.setCapability("browserName", "Android");
//    			capabilities.setCapability("udid", "51baca80");
//    			capabilities.setCapability("deviceName", "realDevice");
//    			capabilities.setCapability("platformName", "Android");
//    			capabilities.setCapability("app", "F:\\uday\\New folder\\New folder\\SBGameHacker_2.4.1.apk");
    			// Create RemoteWebDriver instance and connect to the Appium server
    			// It will launch the Calculator App in Android Device using the
    			// configurations specified in Desired Capabilities
    			try{
    			driver = new RemoteWebDriver(new URL(caps[caps.length-1].split(":-")[1]), capabilities);
    			}catch(Exception e){
    				Reporter.setTestRunnerOutput(("UNABLE TO LAUNCH DRIVER : "+ e.getMessage()));
    			}

    			waitVar = new WebDriverWait(driver, 90);
    			return driver;
    }
 
     public void teardown(){
         //close the app
         driver.quit();
     }
}