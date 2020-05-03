package restAssuredPractise;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static org.hamcrest.Matcher.*;

import org.testng.Assert;

import files.payload;
import files.reusable;

import static io.restassured.RestAssured.*;

public class rest {

	
	public static void main(String[] args) {
		
	RestAssured.baseURI="https://rahulshettyacademy.com";
	String response =given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").body(payload.addplace()).when().post("maps/api/place/add/json").then().assertThat().statusCode(200).extract().response().asString();
	System.out.println(response);
	JsonPath js=new JsonPath(response);
	String place_id=js.getString("place_id");
	System.out.println(place_id);
	
	String newaddress="70 winter walk, USA";	
		
	String responseput=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").body("{\n" + 
			"\"place_id\":\""+place_id+"\",\n" + 
			"\"address\":\""+newaddress+"\",\n" + 
			"\"key\":\"qaclick123\"\n" + 
			"}\n" + 
			"").when().put("maps/api/place/update/json").then().assertThat().statusCode(200).extract().response().asString();	
	System.out.println(responseput);
	JsonPath js2=new JsonPath(responseput);
	
	
	
	String responseget=given().queryParam("key", "qaclick123").queryParam("place_id", place_id).when().get("maps/api/place/get/json").then().assertThat().log().all().statusCode(200).extract().response().asString();
	System.out.println(responseget);
	
	JsonPath js3=reusable.rawjson(responseget);
	String adress1=js3.getString("address");
	System.out.println(adress1);
	
	
	Assert.assertEquals(adress1, newaddress);
	
	
	
	
	}
	
	
	
}
