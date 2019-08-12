package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;
  @Test
  @Parameters({"url","emailid","pwd"})
  public void facebook(String url,String emailid,String pwd) {
	  
	  System.setProperty("webdriver.chrome.driver","E:\\eclipse\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys(emailid);
	  driver.findElement(By.id("pass")).clear();
	  driver.findElement(By.id("pass")).sendKeys(pwd);
	  
	  
	  
	  
	  
	  
	  
  }
}
