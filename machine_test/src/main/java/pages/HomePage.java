package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class HomePage {
	
	WebDriver driver;
	
	  public HomePage(WebDriver driver)
	    {
	    	this.driver= driver;
	    	PageFactory.initElements(driver, this);
	    }
	
   @FindBy(xpath="//input[@class='select2-input'][1]")
   WebElement destination;
   @FindBy(xpath="//input[@id='checkin']")
   WebElement checkInDate;
   @FindBy(xpath="//input[@id='checkout']")
   WebElement checkOutDate;
   @FindBy(xpath="//button[@class='btn btn-white bootstrap-touchspin-up ']")
   WebElement adultsButton;
   @FindBy(xpath="//button[@class='btn btn-white bootstrap-touchspin-up '][2]")
   WebElement childButton;
   @FindBy(xpath="//button[@type='submit']")
   WebElement searchButton;
   @FindBy(xpath="//a[@href='/logout.php']")
   WebElement logoutButton;
   @FindBy(xpath="//label[@class='fr']")
   WebElement homePageText;
   
   
   public void selectDestination() {
	   
	   PageUtility.isElementLoaded(driver, destination, 9);
	   destination.sendKeys("dubai");
   }
   
   public void enteringCheckInAndOutDate() {
	   
	   checkInDate.sendKeys("09/07/20 ");
	   checkOutDate.sendKeys("15/07/20");
   }
   
   public void selectingAdultAndChildNumber() {
	   
	   PageUtility.isElementLoaded(driver, adultsButton, 4);
	   adultsButton.click();
	   childButton.click();
	   childButton.click();
   }
   
   public void clickSearchButton() {
	   
	   searchButton.click();
   }
   
public void clickLogOutButton() {
	   
	logoutButton.click();
   }

public String gettingTextFromHomePage() {
 	 
	   return homePageText.getText();
	   }
   


}
