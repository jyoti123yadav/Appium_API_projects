package stepDefinition;

import cucumber.api.java.Before;
import cucumber.runtime.StepDefinition;

public class hooks {

	
	@Before("@DeletePlace")
	public void beforeScenario() throws Throwable
	{
		addplacee m=new addplacee();
		if(addplacee.place_id== null)
		{
		m.add_place_payload_something_something_something("jyoti", "ENGLISH", "22 rohjh");
		m.user_calls_something_with_something_http_request("addPlaceAPI", "POST");
//		m.verify_placeid_created_maps_to_something_using_something("shetty", "POST");
		
	}
	}
	
	
	
}
