package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.HotelDetailsPage;
import pages.HotelSearchPage;
import pages.LogOutPage;
import pages.LoginPage;
import pages.MainPage;
import pages.RegisterationPage;

public class RegressionTest extends TestHelper {
	
	
  @Test
  public void firstTest() {
	  
	  MainPage mainPage= new MainPage(driver);
	  mainPage.clickHomePageButton();
	  HomePage homePage=new HomePage(driver);
	  homePage.selectDestination();
	  homePage.enteringCheckInAndOutDate();
	  homePage.selectingAdultAndChildNumber();
	  homePage.clickSearchButton();
	  HotelSearchPage hotelSearchPage =new HotelSearchPage(driver);
	  hotelSearchPage.clickDetailsButton();
	  HotelDetailsPage hotelDetailsPage =new HotelDetailsPage(driver);
	  hotelDetailsPage.clickAvailableroomsButton();
	  hotelDetailsPage.clickOnBookNowButton();
	  hotelDetailsPage.clickOnHomeButton();
	  HomePage homePages=new HomePage(driver);
	  Assert.assertEquals(homePages.gettingTextFromHomePage(), "DESTINATION");
	
  }
  
  @Test
  public void secondTest() {
	  
	  MainPage mainPage= new MainPage(driver);
	  mainPage.clickLoginButton();
	  LoginPage loginPage = new LoginPage(driver);
	  loginPage.clickRegisterButton();
	  RegisterationPage registerationPage = new RegisterationPage(driver);
	  registerationPage.enterPersonalInformation("RESHMA", "RAJAN", "reshma38rajan@gmail.com", "9495002644");
	  registerationPage.enterBillingAddress("Ellathukalathil house", "chingavanam", "kottayam", "kerala", "686531", "India");
	  registerationPage.enterAdditionalRequiredInformation("9495002644");
	  registerationPage.accountSecurity("ThMh0OJK(pV_", "ThMh0OJK(pV_");
	  registerationPage.clickingSubmitButton();
	  HomePage homePage=new HomePage(driver);
	  homePage.clickLogOutButton();
	  LogOutPage logOutPage = new LogOutPage(driver);
	  Assert.assertEquals(logOutPage.gettingLogOutText(), "logOutPage.gettingLogOutText()");
	  logOutPage.clickingHomeLink();
  }
}
