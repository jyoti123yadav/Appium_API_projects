//
//import java.net.MalformedURLException;
//import java.util.concurrent.TimeUnit;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
//import org.openqa.selenium.WebElement;
//
//import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
//import io.appium.java_client.TouchAction;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
//import static java.time.Duration.ofSeconds;
//import static io.appium.java_client.touch.offset.ElementOption.element;
//
//public class swipedemo extends Base {
//
//	public static void main(String[] args) throws MalformedURLException {
//		// TODO Auto-generated method stub
//		AndroidDriver<AndroidElement> driver = capabilities("emulator");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
//	    driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
//	    driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
//	    driver.findElementByXPath("//*[@content-desc='9']").click();
//	    TouchAction t=new TouchAction(driver);
//	     //long press //on element// 2 sec// move to another element and you release
//	    WebElement first=driver.findElementByXPath("//*[@content-desc='15']");
//	    WebElement second=driver.findElementByXPath("//*[@content-desc='45']");
//	
//
//t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();
//	
//
//		
//		
//		 WebElement a=driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
//		a.click();
//		
//		
//		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
//		
//	     WebElement source=driver.findElementsByClassName("android.view.View").get(0);
//	     WebElement destination=driver.findElementsByClassName("android.view.View").get(1);
//	     
//	     
////	     TouchAction t = new TouchAction(driver);
//	     //longpress(source)/move(destination)//release
////	     t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
//	     t.longPress(element(source)).moveTo(element(destination)).release().perform();
//		
//		
//		
//		
//	}
//
//}
