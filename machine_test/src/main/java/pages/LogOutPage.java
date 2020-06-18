package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class LogOutPage {
	
	WebDriver driver;
	
	  public LogOutPage(WebDriver driver)
	    {
	    	this.driver= driver;
	    	PageFactory.initElements(driver, this);
	    }
	
       @FindBy(xpath="//div[@class='alert alert-success text-center']")
       WebElement logOutText;
       @FindBy(xpath="//li[@id='Primary_Navbar-Home']/a")
       WebElement homeLink;
       
       public String gettingLogOutText() {
    	   
    	   PageUtility.isElementLoaded(driver, logOutText, 9);
    	   return logOutText.getText();
       }
       
       public void clickingHomeLink() {
    	   
    	   homeLink.click();
       }

}
