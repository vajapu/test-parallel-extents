//package com.comcast.ucAppAutomation.businessDrivenTesting.cucumberOptions;
//
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
//
//import java.io.File;
//
//import org.junit.AfterClass;
//import org.junit.runner.RunWith;
//
//import com.cucumber.listener.Reporter;
//
//@CucumberOptions(features = "src/test/resources/features/", 
//				glue = {"com.comcast.ucAppAutomation.businessDrivenTesting.stepDefinitions"}, 
//				tags = {"~@Ignore"}, 
//				plugin = { "pretty", "html:target/cucumber-reports/cucumber-pretty",
//						"json:target/cucumber-reports/CucumberTestReport.json",
//						"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
//						"rerun:target/cucumber-reports/rerun.txt" }, strict=true, monochrome=false)
//
//@RunWith(Cucumber.class)
//public class TestRunner{
//	@AfterClass
//	public static void writeExtentReport() {
//		Reporter.loadXMLConfig(new File("D://Users//vajapu//workspace//test2artifact//extent-config.xml"));
//	}
//}