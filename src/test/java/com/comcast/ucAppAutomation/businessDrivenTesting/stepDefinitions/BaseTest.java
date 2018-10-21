package com.comcast.ucAppAutomation.businessDrivenTesting.stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.Scenario;
import com.comcast.ucAppAutomation.utils.CapabalityFactory;
import com.comcast.ucAppAutomation.utils.DriverFactory;
import com.cucumber.listener.Reporter;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseTest {
	public static DriverFactory df = new DriverFactory();
	private static RemoteWebDriver driver;
	

	@Before
	public void before(Scenario scenario) {
		CapabalityFactory cr = new CapabalityFactory();
		long threadId = Thread.currentThread().getId();
		String processName = ManagementFactory.getRuntimeMXBean().getName();
		Reporter.assignAuthor(
				"Running&nbsp;&nbsp;with&nbsp;&nbsp;configuration&nbsp;&nbsp;:<p>" + cr.getCapability() + "<p>");
		try {
			this.driver=df.createDriver(cr.getCapability());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Started in thread: " + threadId + ", in JVM: " + processName);
	}

	@After
	public void after(Scenario scenario){
		System.err.println("after scenario");
		try {
			Reporter.addScreenCaptureFromPath(getScreenshot(scenario.getName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		df.teardown();
	}

	public static String getScreenshot(String screenshotName) throws Exception {
		// below line is just to append the date format with the screenshot name
		// to avoid duplicate names
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots"
		// under src folder
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName + dateName
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		// Returns the captured file path
		return destination;
	}
}