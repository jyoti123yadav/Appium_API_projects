package files;

import io.restassured.path.json.JsonPath;

public class reusable {

	
	public static JsonPath rawjson(String response)
	{
		JsonPath js3=new JsonPath(response);
		return js3;
	}
	
	
}
