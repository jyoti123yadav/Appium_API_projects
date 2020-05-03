package files;
import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;
import pojo.GetCourse;
import pojo.api;

public class Oauth {
	
	
	public static void main(String[] args) {
		
		String[] coursetitle= {"selenium","api","protractor"};
		
		
		
	// Access token from UI 
		
		WebDriver driver = null;
		String url=driver.getCurrentUrl();
		String particularcode=url.split("code=")[1];
		String code=particularcode.split("&scope")[0];
		System.out.println(code);
		
		
		
		
		
	//access token from API 	
		
	String acesstokn=given().queryParam("code","").queryParam("client_id"," ")	.queryParam("client_secret", "").queryParam("redirect_url"," ").queryParam("grant_type"," ").when().post("").asString();
		
	JsonPath u=reusable.rawjson(acesstokn);
	String q=u.getString("access-token");
	System.out.println(q);

		
		
	GetCourse tokenurl=given().queryParam("access_token",acesstokn).when().get("").as(GetCourse.class);
	System.out.println(tokenurl);
	
	tokenurl.getLinkedln();
	
	
	ArrayList<String> a=new ArrayList<String>();
	
	
	
	List <api> apicourses=tokenurl.getCourses().getApi();
	for(int i=0;i<apicourses.size();i++)
	{
		if(apicourses.get(i).getCoursetitle().equalsIgnoreCase("Soap"))
		{
			apicourses.get(i).getPrice();
		}
	
	}
	
	List<String> expecteddlist=Arrays.asList(coursetitle);
	
	
}
	
}
