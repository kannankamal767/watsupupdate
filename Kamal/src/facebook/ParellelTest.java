package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParellelTest {
	
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void Verifytitle(String browsername){
		if(browsername.equalsIgnoreCase("chrome")){
              System.setProperty("webdriver.chrome.driver","E:\\eclipse\\Drivers\\chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.get("https://www.facebook.com/");
			  driver.manage().window().maximize();
			
		}
		else if(browsername.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.bharatmatrimony.com/");
		driver.manage().window().maximize();
		
		
	}
		 
	
	
	
	
	}

}
