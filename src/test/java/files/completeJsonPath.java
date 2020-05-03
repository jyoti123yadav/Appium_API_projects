package files;

import io.restassured.path.json.JsonPath;

public class completeJsonPath {

	public static void main(String[] args) {
		
		JsonPath j=new JsonPath(payload.CoursePrice());
		
		int count=j.getInt("courses.size()");
		
		System.out.println(count);
//		
//		int count1=j.getInt("dashboard.purchaseAmount");
//		
//		System.out.println(count1);
//		
//		
//		String count3=j.getString("courses[0].title");
//		
//		System.out.println(count3);
//		
//		
//	String count4=j.getString("courses[1].title");
//		
//		System.out.println(count4);
//		
//		
//		
//	String count5=j.getString("courses[2].title");
//		
//		System.out.println(count5);
//
//		
//		//get all the course title
//		
//		
//		for(int i=0;i<count;i++)
//		{
//			String a=j.get("courses["+i+"].title");
//			int e=j.get("courses.price["+i+"]");
//			System.out.println(a);
//			System.out.println(e);
//			
//		}
		
		
		for(int i=0;i<count;i++)
		{
			String a=j.get("courses["+i+"].title");
//			System.out.println(a);
			if(a.equalsIgnoreCase("RPA"))
			{
			int e=j.get("courses.price["+i+"]");
//			System.out.println(e);
			
			
			int k=j.get("courses.copies["+i+"]");
			System.out.println(k);
			break;
			
			}
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	
}
