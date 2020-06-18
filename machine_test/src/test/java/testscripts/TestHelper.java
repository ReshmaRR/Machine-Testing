package testscripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestHelper {
	WebDriver driver;
	
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver","F:\\maven\\chromedriver_win32 (1)\\chromedriver.exe"); 
	  driver=new ChromeDriver();
	  driver.get("https://phptravels.com/demo");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
	  
  }

}
