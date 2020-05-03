package resourrces;

import java.util.ArrayList;
import java.util.List;

import pojo.GetSetterCourses;
import pojo.location;

public class TestDataBuild {

	
	public GetSetterCourses addplace(String name,String language,String address)
	{
		GetSetterCourses x=new GetSetterCourses();
		x.setAccuracy(50);
		x.setAddress(address);
		x.setLanguage(language);
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
		x.setName(name);
		
		return x;
	
	}
	
	
}
