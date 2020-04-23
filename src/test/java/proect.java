import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class proect {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/jyotiyadav/Desktop/MME/chromedriver");
		WebDriver driver =new ChromeDriver();
//		driver.get("https://www.spicejet.com/");
		
		driver.get("https://docs.google.com/forms/d/e/1FAIpQLSfumeIpiFEyQ0Y3Cd5yXLoakhwkMgh2vXAJ97wP6Py9eL3xrw/viewform");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//input[@class=\"quantumWizTextinputPaperinputInput exportInput\"])[1]")).sendKeys("yoti");
		
		WebElement radio1 = driver.findElement(By.xpath("(//div[@class=\"appsMaterialWizToggleRadiogroupOffRadio exportOuterCircle\"])[1]"));
		radio1.click();
		
		
		
		//18 age	
		WebElement radio18 = driver.findElement(By.xpath("(//div[@class=\"appsMaterialWizToggleRadiogroupOnRadio exportInnerCircle\"])[3]"));
		radio18.click();	
		
		
				
	WebElement salariedemployee = driver.findElement(By.xpath("(//div[@class=\"appsMaterialWizToggleRadiogroupOffRadio exportOuterCircle\"])[9]"));
	salariedemployee.click();			
		
	
	WebElement doyouhaveIICIC = driver.findElement(By.xpath("(//div[@class=\"appsMaterialWizToggleRadiogroupOffRadio exportOuterCircle\"])[12]"));
	doyouhaveIICIC.click();

	WebElement Bankrep = driver.findElement(By.xpath("(//div[@class=\"quantumWizTogglePapercheckboxEl appsMaterialWizTogglePapercheckboxCheckbox docssharedWizToggleLabeledControl freebirdThemedCheckbox freebirdThemedCheckboxDarkerDisabled freebirdFormviewerViewItemsCheckboxControl\"])[2]"));
	Bankrep.click();		
			
	
			
	 }
		
		
		
		
		
	}
	

