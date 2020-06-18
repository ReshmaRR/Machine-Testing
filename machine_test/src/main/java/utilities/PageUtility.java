package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtility {
	WebDriver driver;
	
   public static  WebElement isElementLoaded(WebDriver driver, WebElement elementToBeLoaded, int Time) {
		
		WebDriverWait wait= new WebDriverWait(driver, Time);
		WebElement Element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
		return Element;
		
	}

}
