package com.cg.apiDemo;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidateGetRequest {
	
	RequestSpecification request;
	Response response;
	
	@BeforeSuite
	public void init()
	{
		//Endpoint==> BaseURI/Resource/Pathparameter ? Queryparameter
		
		RestAssured.baseURI="https://reqres.in";
		request=RestAssured.given();
		
		//param specifies query parameter
		request.param("page", "1");
		response= request.get("/api/users");
		
	}
	
	@Test(priority = 0)
	public void test1()
	{
		int StatusCode=response.statusCode();
		System.out.println(StatusCode);
	}
	
	@Test(priority = 1)
	public void test2()
	{
		System.out.println(response.statusLine());
	}


}
