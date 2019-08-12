package facebook;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pageopened {
 @Test
 public void loginpage() throws InterruptedException{
	 

	 System.setProperty("webdriver.chrome.driver","E:\\eclipse\\Drivers\\chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 driver.get("https://www.bharatmatrimony.com/");
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,1400)");
	  Thread.sleep(5000);
	  js.executeScript("window.scrollBy(0,-1400)");
	  Thread.sleep(5000);
	  
	 
	 
	// Pageobject pm=new Pageobject(driver);
	 //pm.typepassword("kamal");
	 //pm.typeusername("454545");
	// pm.clicklogin();
 }


}
