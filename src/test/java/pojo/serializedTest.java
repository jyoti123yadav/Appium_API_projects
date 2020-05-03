package pojo;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

import files.payload;
import io.restassured.RestAssured;

public class serializedTest {

	public static void main(String[] args) {
		GetSetterCourses x=new GetSetterCourses();
		
		
		
		x.setAccuracy(50);
		x.setAddress("29, side layout, cohen 09");
		x.setLanguage("French-IN");
		
		
		location l=new location();
		l.setLang(-38.383494);
		l.setLat(33.427362);
		x.setLocation(l);
		
		
		x.setPhone_no("(+91) 983 893 3937");
		List <String> mylist=new ArrayList<String>();
		mylist.add("shoe park");
		mylist.add("shop");
		x.setTypes(mylist);
		x.setWebsite("http://google.com");
		x.setName("Frontline house");
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response =given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").body(x).when().post("maps/api/place/add/json").then().assertThat().statusCode(200).extract().response().asString();
		System.out.println(response);
		
		
	}
	

	
	
	
	
}
