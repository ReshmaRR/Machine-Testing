package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSearchPage {
	
	WebDriver driver;
	
	  public HotelSearchPage(WebDriver driver)
	    {
	    	this.driver= driver;
	    	PageFactory.initElements(driver, this);
	    }
	
     @FindBy(xpath="//button[@class='btn btn-primary']")
     WebElement detailsButton;
     
     public void clickDetailsButton() {
    	 
    	 detailsButton.click();
     }
}
