package files;

import static io.restassured.RestAssured.*;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;

public class JIRAapi {

	
	public static void main(String[] args) {
		
		
		RestAssured.baseURI="http://localhost:8080/";
		
		
		SessionFilter session=new SessionFilter();
		
		String a=given().pathParam("id", "10101").log().all().filter(session).header("Content-Type","application/json").body(" ").when().post("").then().extract().response().asString();
		
		
		//add attachment
		
		given().header("Content-Type","application/json").pathParam("id", "10101").multiPart("file",new File("")).log().all().filter(session).when().post("").then().extract().response().asString();
		
		
		
		
	}
	
	
}
