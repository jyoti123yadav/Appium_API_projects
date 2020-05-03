package appium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> capabilities(String app) throws IOException {

		
		
		FileInputStream  fis=new FileInputStream(System.getProperty("user.dir")+"/Users/jyotiyadav/Practise/YOYO/src/main/java/appium/ApiDemos.apk");
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		AndroidDriver<AndroidElement> driver=capabilities("ApiDemos");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		File appDir = new File("src/main/java");
		File APP = new File(appDir, (String)prop.get(app));
		
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		String browser =(String)prop.get("BROWSER_NAME");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, browser);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		capabilities.setCapability(MobileCapabilityType.VERSION, "10.0");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Copy_of_Pixel_3_API_29");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.APP, APP.getAbsolutePath());
		capabilities.setCapability("newCommandTimeout", 3000);
		capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		capabilities.setCapability("autoGrantPermissions", "true");
//		capabilities.setCapability("appPackage", "com.nobroker.app");
//		capabilities.setCapability("appActivity", "com.nobroker.app.activities.NBSplashScreen");

		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		Homepage y=new Homepage(driver);
		y.preferences.click();
		
		Dependency w=new Dependency(driver);
		w.preferencesdependencies.click();

		return driver;
		
	
	}

}