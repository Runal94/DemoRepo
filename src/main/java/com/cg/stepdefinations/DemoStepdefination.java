package com.cg.stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoStepdefination {
	
	@Given("^is given a URI with resource and query parameter$")
	public void is_given_a_URI_with_resource_and_query_parameter() throws Throwable {
	    System.out.println("Inside Given");
	}

	@When("^we use Get method$")
	public void we_use_Get_method() throws Throwable {
		System.out.println("Inside When");
	}

	@Then("^get statuscode as (\\d+)$")
	public void get_statuscode_as(int arg1) throws Throwable {
		System.out.println("Inside Then"); 
	}



}
