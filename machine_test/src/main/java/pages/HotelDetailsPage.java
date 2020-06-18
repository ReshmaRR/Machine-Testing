package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelDetailsPage {
	
	WebDriver driver;
	
	  public HotelDetailsPage(WebDriver driver)
	    {
	    	this.driver= driver;
	    	PageFactory.initElements(driver, this);
	    }
	
   
   @FindBy(xpath="//ul[@id='horizon-sticky-nav']//following::li[3]")
   WebElement availableroomsButton;
   @FindBy(xpath="//button[@type='submit']")
   WebElement bookNowButton;
   @FindBy(xpath="//a[@title='home']")
   WebElement homeButton;
  
   
  
   
   public void clickAvailableroomsButton() {
	  	 
	   availableroomsButton.click();
	   }
   
   public void clickOnBookNowButton() {
	  	 
	   bookNowButton.click();
	   }
   
   public void clickOnHomeButton() {
	  	 
	   homeButton.click();
	   }
   
   


}
