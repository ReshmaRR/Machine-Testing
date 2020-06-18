package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class RegisterationPage {
	
	WebDriver driver;
	
	  public RegisterationPage(WebDriver driver)
	    {
	    	this.driver= driver;
	    	PageFactory.initElements(driver, this);
	    }
	
   @FindBy(xpath="//input[@id='inputFirstName']")
   WebElement firstNameField;
   @FindBy(xpath="//input[@id='inputLastName']")
   WebElement lastNameField;
   @FindBy(xpath="//input[@id='inputEmail']")
   WebElement emailId;
   @FindBy(xpath="//input[@id='inputPhone']")
   WebElement phoneNumber;
   @FindBy(xpath="//input[@id='inputAddress1']")
   WebElement streetAddress;
   @FindBy(xpath="//input[@id='inputAddress2']")
   WebElement streetAddress2;
   @FindBy(xpath="//input[@id='inputCity']")
   WebElement city;
   @FindBy(xpath="//input[@id='stateinput']")
   WebElement state;
   @FindBy(xpath="//input[@id='inputPostcode']")
   WebElement postcode;
   @FindBy(xpath="//select[@id='inputCountry']")
   WebElement country;
   @FindBy(xpath="//input[@id='inputNewPassword1']")
   WebElement password;
   @FindBy(xpath="//input[@id='inputNewPassword2']")
   WebElement confirmPassword;
   @FindBy(xpath="//select[@id='customfield1']")
   WebElement findUsField;
   @FindBy(xpath="//input[@id='customfield2']")
   WebElement Number;
   @FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
   WebElement captcha;
   @FindBy(xpath="//input[@type='submit']")
   WebElement submitButton;
   
   
   public void enterPersonalInformation(String firstName, String lastName, String email, String number) {
	   
	   PageUtility.isElementLoaded(driver, firstNameField, 9);
	   firstNameField.sendKeys(firstName);
	   lastNameField.sendKeys(lastName);
	   emailId.sendKeys(email);
	   phoneNumber.sendKeys(number);
   }
   
   
   public void enterBillingAddress(String address1, String address2, String cityName, String stateName, String postcodeNumber, String countryName) {
	   streetAddress.sendKeys(address1);
	   streetAddress2.sendKeys(address2);
	   city.sendKeys(cityName);
	   state.sendKeys(stateName);
	   postcode.sendKeys(postcodeNumber);
	   country.sendKeys(countryName);
	   }
   
   public void enterAdditionalRequiredInformation(String num) {
	   
	   Select dropdown= new Select(findUsField);
	   dropdown.selectByValue("Friend");
	   Number.sendKeys(num);
	   }
   
   public void accountSecurity(String Password, String conPassword) {
	   password.sendKeys(Password);
	   confirmPassword.sendKeys(conPassword);
	   }
   
   public void clickingSubmitButton() {
	   
	   captcha.click();
	   submitButton.click();
	   
   }
   
}
