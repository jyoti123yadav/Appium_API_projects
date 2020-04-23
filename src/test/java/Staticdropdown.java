import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","/Users/jyotiyadav/Desktop/MME/chromedriver");
		WebDriver driver =new ChromeDriver();
//		driver.get("https://www.spicejet.com/");
		
		driver.get("https://www.goindigo.in/aff.html?cid=Display|Affiliate|Icubes|1130_1007743-cg-8654814248045559380");
		System.out.println(driver.getTitle());
		Select s=new Select(driver.findElement(By.xpath("//input[@class=\"form-control hpBookingForm passengerInputField pax-class-count\"]")));
		s.selectByIndex(2);
		driver.findElement(By.xpath("//*[@name=\"passenger\"]")).click();

		for(int i=0;i<5;i++)
		{
		driver.findElement(By.xpath("(//span[@class=\"icon-plus\"][1])")).click();

		}
		
		
		
//		driver.findElement(By.xpath("(//div[@class = \"passenger-done-blck\"]//button)[1]")).click();
		
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("document.getElement(By.xpath('(//div[@class = \\\'passenger-done-blck\\\']//button)[1]\')).click()");
		
		

////		s.selectByValue("AED");
//		driver.findElement(By.id("divpaxinfo")).click();
//		try {
//			Thread.sleep(50);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		Select b=new Select(driver.findElement(By.xpath("//*[@name=\"ctl00$mainContent$ddl_Adult\"]")));
//		b.selectByValue("3");
		
		
	
		
		
		
	}
	
	
}
