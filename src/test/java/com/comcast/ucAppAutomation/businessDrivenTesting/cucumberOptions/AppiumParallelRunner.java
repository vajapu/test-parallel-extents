package com.comcast.ucAppAutomation.businessDrivenTesting.cucumberOptions;
import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.comcast.ucAppAutomation.utils.CapabalityFactory;
import com.cucumber.listener.Reporter;
import cucumber.api.cli.Main;

public class AppiumParallelRunner implements Runnable {
	String capability;
	
    public AppiumParallelRunner(String capability) {
    	this.capability=capability;
    }
   
    public static void main(String args[]) {
    	String[] capabilities={"browserName:-Android,udid:-51baca80,deviceName:-VibeK5,platformName:-Android,app:-F:\\uday\\New folder\\New folder\\SBGameHacker_2.4.1.apk,url:-http://127.0.0.1:4723/wd/hub",
    							"browserName:-Android,udid:-0123456789ABCDEF,deviceName:-mmx,platformName:-Android,app:-F:\\uday\\New folder\\New folder\\SBGameHacker_2.4.1.apk,url:-http://127.0.0.1:4724/wd/hub"};
    	for(String cap: capabilities){
        Runnable r1 = new AppiumParallelRunner(cap);
        new Thread(r1).start();
        }
    }
    
    public void run() {
    	CapabalityFactory cr=new CapabalityFactory();
    	cr.setCapability(capability);
    	String [] argv = new String[]{ "--plugin", "pretty", 
    								   "--plugin", "html:target/cucumber-reports/cucumber-pretty",
    								   "--plugin", "json:target/cucumber-reports/CucumberTestReport.json",
    								   "--plugin", "com.cucumber.listener.ExtentCucumberFormatter:output/report.html",
    								   "-g", "com.comcast.ucAppAutomation.businessDrivenTesting.stepDefinitions", "src/test/resources/features/"};
		ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
		try {
			byte exitstatus = Main.run(argv, contextClassLoader);
			Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	        Reporter.setSystemInfo("user", System.getProperty("user.name"));
	        Reporter.setSystemInfo("os", "Mac OSX");
	        Reporter.setTestRunnerOutput(""); //Logs displayed from here
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}