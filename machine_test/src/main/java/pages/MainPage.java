package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	
	WebDriver driver;
	
	  public MainPage(WebDriver driver)
	    {
	    	this.driver= driver;
	    	PageFactory.initElements(driver, this);
	    }
	
  @FindBy(xpath="//a[@href='//www.phptravels.net']")
  WebElement homePageButton;
  @FindBy(xpath="//a[@href='https://phptravels.org']")
  WebElement loginButton;
  
  public void clickHomePageButton() {
	  
	  homePageButton.click();
  }
  
  public void clickLoginButton() {
	  
	  loginButton.click();
  }

}
