package stepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import demo.Demo;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.GetSetterCourses;
import pojo.location;
import resourrces.APIResources;
import resourrces.TestDataBuild;
import resourrces.Utils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import pojo.GetSetterCourses;
import pojo.location;

import org.junit.runner.RunWith;


public class addplacee extends Utils{

	RequestSpecification res;
	RequestSpecification req;
	ResponseSpecification req2;
	Response res1;
	TestDataBuild data=new TestDataBuild();
	JsonPath js;
	Demo d=new Demo();
	static String place_id;
	
	
	@Given("^Add Place Payload \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void add_place_payload_something_something_something(String name, String language, String address) throws Throwable {
	req2=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();	
		
	res=given().spec(requestSpecification()).body(data.addplace(name, language, address));	
	
    }

	@When("^user calls \"([^\"]*)\" with \"([^\"]*)\" http request$")
    public void user_calls_something_with_something_http_request(String resources, String method) throws Throwable {
    	APIResources resourceAPI=APIResources.valueOf(resources);
    	if(method.equalsIgnoreCase("POST"))
    	{
  		res1=res.when().post(resourceAPI.getResource());
    	}
    	else if(method.equalsIgnoreCase("GET"))
    	{
    		res1=res.when().get(resourceAPI.getResource());
    	}
		System.out.println(res1);
		
    }

    @Then("^the API call got success with status 200$")
    public void the_api_call_got_success_with_status_200() throws Throwable {
    	assertEquals(res1.getStatusCode(),200);
    }

    private void assertequals(String string, String value) {
		// TODO Auto-generated method stub
		
	}

    
//	@Then("{string} in response body is {string}")
//	public void in_response_body_is(String keyValue, String Expectedvalue) {
//	    // Write code here that turns the phrase above into concrete actions
//	  
//	 assertEquals(getJsonPath(res1,keyValue),Expectedvalue);
//	}
//	
//    @And("^verify place_Id created maps to \"([^\"]*)\" using \"([^\"]*)\"$")
//    public void verify_placeid_created_maps_to_something_using_something(String expectedName, String resource) throws Throwable {
//	     place_id=getJsonPath(res1,"place_id");
//		 res=given().spec(requestSpecification()).queryParam("place_id",place_id);
//		 user_calls_something_with_something_http_request(resource,"GET");
//		  String actualName=getJsonPath(res1,"name");
//		  assertEquals(actualName,expectedName);
//		 
//	    
//	}
    
}