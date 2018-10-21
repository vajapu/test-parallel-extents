package com.comcast.ucAppAutomation.businessDrivenTesting.stepDefinitions;

import cucumber.api.java.en.Given;

public class Feature2Steps {
	@Given("^multiply numbers \"([^\"]*)\" and \"([^\"]*)\"$")
	public void multiply_numbers_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		 System.err.println("multiply : "+(Integer.parseInt(string2)* Integer.parseInt(string)));
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@Given("^divide numbers \"([^\"]*)\" and \"([^\"]*)\"$")
	public void divide_numbers_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		 System.err.println("divide : "+(Integer.parseInt(string2)/Integer.parseInt(string)));
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
