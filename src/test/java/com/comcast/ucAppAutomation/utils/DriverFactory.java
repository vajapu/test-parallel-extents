//package com.comcast.ucAppAutomation.utils;
//
//import io.appium.java_client.AppiumDriver;
//import java.io.File;
//import java.net.MalformedURLException;
//import java.net.URL;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
// 
//public class DriverFactory {
// 
////    public static RemoteWebDriver driver = null;
//	public static String driver = null;
//    public static WebDriverWait waitVar = null;
// 
//    public void createDriver(String udid) throws MalformedURLException, InterruptedException {
// 
//    	// set up appium
//    			// Set up desired capabilities and pass the Android app-activity and
//    			// app-package to Appium
////    			DesiredCapabilities capabilities = new DesiredCapabilities();
////    			capabilities.setCapability("browserName", "Android");
////    			capabilities.setCapability("udid", udid);
////    			capabilities.setCapability("deviceName", "realDevice");
////    			capabilities.setCapability("platformName", "Android");
////    			capabilities.setCapability("app", "F:\\uday\\New folder\\New folder\\SBGameHacker_2.4.1.apk");
////    			// Create RemoteWebDriver instance and connect to the Appium server
////    			// It will launch the Calculator App in Android Device using the
////    			// configurations specified in Desired Capabilities
////    			try{
////    			driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
////    			}catch(Exception e){
////    				System.out.println("jasgdjh");
////    			}
////
////    			waitVar = new WebDriverWait(driver, 90);
//    	driver=udid;
//    }
// 
//     public void teardown(){
//         //close the app
//         //driver.quit();
//     }
//}