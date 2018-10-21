package com.comcast.ucAppAutomation.businessDrivenTesting.stepDefinitions;


import com.cucumber.listener.Reporter;

import cucumber.api.java.en.Given;

public class Feature1Steps {
	
	@Given("^add numbers \"([^\"]*)\" and \"([^\"]*)\"$")
	public void add_numbers_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    System.err.println("Add : "+(Integer.parseInt(string2)+ Integer.parseInt(string))+"   "+Thread.currentThread().getId());
	    Reporter.addStepLog(String.valueOf(Thread.currentThread().getId()));
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Given("^substract numbers \"([^\"]*)\" and \"([^\"]*)\"$")
	public void substract_numbers_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println("Substract : "+(Integer.parseInt(string2)-Integer.parseInt(string))+"  "+Thread.currentThread().getId());
	}
}
