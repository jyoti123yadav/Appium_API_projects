package files;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class sumvalidation {

	@Test
	public  void  sum()
	{
	
	JsonPath j=new JsonPath(payload.CoursePrice());
	
	int count=j.getInt("courses.size()");
	
	System.out.println(count);
	
	int w=0;
	
	
	for(int i=0;i<count;i++)
	{	
		int a=j.getInt("courses["+i+"].price");
		int e=j.getInt("courses["+i+"].copies");
		
		int amount=a*e;
		
		w+=amount;
		System.out.println(amount);
		
		
		}
	
	System.out.println(w);
	
	String t=j.getString("dashboard.purchaseAmount").toString();
	
	System.out.println(t);
	
	
	Assert.assertEquals(w, j);
	
	
	
	
	
	
	
}
	}

