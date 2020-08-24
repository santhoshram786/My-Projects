package com.api.tests;



import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;



public class RestAssuredTest {
	
	@Test
	public void Season1()
	{
		given().
		when().get("http://ergast.com/api/f1/2008/circuits.json").
		then().
		assertThat().
		statusCode(200).and().
		body("MRData.CircuitTable.Circuits.circuitId", hasSize(18)).and().
		header("content-length", equalTo("4142"));
	}

}		
