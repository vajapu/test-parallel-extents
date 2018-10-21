package com.comcast.ucAppAutomation.businessDrivenTesting.cucumberOptions;
import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;

import com.comcast.ucAppAutomation.utils.CapabalityFactory;
import com.cucumber.listener.Reporter;

import cucumber.api.cli.Main;

//public class ParallelRunner {
//	public static void main(String[] args) throws Throwable {
//		run(1);
//		run(2);
//	        }
//	public static void run(int a){
//		String [] argv = new String[]{ "-g", "com.comcast.ucAppAutomation.businessDrivenTesting.stepDefinitions", "src/test/resources/features/"};
//		ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
//		byte exitstatus = Main.run(argv, contextClassLoader);
//		System.out.println(exitstatus);
//	}
//}


public class AppiumParallelExecution implements Runnable {
	//ThreadLocal<String> threadLocalValue = new ThreadLocal<>();
	String capability;
	
    public AppiumParallelExecution(String capability) {
    	this.capability=capability;
    }
   
    public static void main(String args[]) {
    	String[] capabilities={"987654","123456"};
    	for(String cap:capabilities){
        Runnable r1 = new AppiumParallelExecution(cap); //device id of first mobile device
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
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    @AfterClass
    private void pub() {
		// TODO Auto-generated method stub
    	Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Mac OSX");
        Reporter.setTestRunnerOutput("Sample test runner output message");
	}
}