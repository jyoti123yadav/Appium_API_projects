package pojo;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class specBuilderTest {

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
	
	
		RequestSpecification req=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("Key","qaclick123").setContentType(ContentType.JSON).build();
		
		ResponseSpecification req2=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();	
		
		RequestSpecification res=given().spec(req).body(x);
		Response res1=res.when().post("/maps/api/place/add/json").then().spec(req2).extract().response();
		
		String wo=res1.asString();
		System.out.println(wo);
		
		
		
	}
	

	
	
	
	
}
