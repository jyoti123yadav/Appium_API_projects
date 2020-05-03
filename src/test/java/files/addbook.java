package files;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class addbook {
	
	
	
	private final String isbn="isbn"+  getRandomInteger();
	
	private final String aisle="aisle"+  getRandomInteger();

    
    /**
     * Generates Random integer.
     *
     * @return Generated random integer.
     */
    private int getRandomInteger() {
        Random ranInt = new Random();
        return ranInt.nextInt(1000);
    }
	

    
//	@Test(dataProvider="qoq")
    @Test
//	public void addbook(String isbn,String aisle )
    public void addbook() throws IOException
	{
		String a=RestAssured.baseURI="http://216.10.245.166";
		given().header("Content-Type","application/json").body(GenerateStringFromResources(" ")).when().post("/Library/Addbook.php").then().log().all().statusCode(200).extract().response().asString();
		System.out.println(a);
		
		JsonPath js=reusable.rawjson(a);
		System.out.println(js);
		String id=js.get("ID");
		System.out.println(id);	 
	}
	
//	@DataProvider(name="qoq")
//	public Object[][] getddata()
//	{
//		return new Object[][] {{"hg","234"},{"werr","12345"},{"khgd","1234345"}};
//	}
    
    
    public static String GenerateStringFromResources(String path) throws IOException
    {
    	return new String(Files.readAllBytes(Paths.get(path)));
    }
    
	
	
}
