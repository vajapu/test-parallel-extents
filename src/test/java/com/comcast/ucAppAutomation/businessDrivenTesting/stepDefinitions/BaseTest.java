package com.comcast.ucAppAutomation.businessDrivenTesting.stepDefinitions;

import java.lang.management.ManagementFactory;

import cucumber.api.Scenario;
import com.comcast.ucAppAutomation.utils.CapabalityFactory;
import com.cucumber.listener.Reporter;

import cucumber.api.java.Before;

public class BaseTest{

	@Before
	public void before(Scenario scenario) {
		CapabalityFactory cr= new CapabalityFactory();
	    long threadId = Thread.currentThread().getId();
	    String processName = ManagementFactory.getRuntimeMXBean().getName();
	    Reporter.assignAuthor("with capability "+cr.getCapability());
	    System.out.println("Started in thread: " + threadId + ", in JVM: " + processName);
	}
}