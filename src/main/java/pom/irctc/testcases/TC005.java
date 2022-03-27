package pom.irctc.testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC005";
		testCaseDescription = "to verify GST validation";
		author = "Mercy";
		category = "Smoke";	
		browserName = "chrome";
		url = " https://www.irctc.co.in";   
		
	}
	
	

	@Test
	public void bookHotelGSTValidation() {
		
new CovidAlertPage(driver,test)
		
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToAccomodation()
		.clickOnHotel()
		.switchToIRCTC()
		
		.clickOnLogin()
		.switchToLoginPage()
		.clickOnGuestUserLogin()
		.enterEmail("mercybewin@gmail.com")
		.enterMobileNum("7845807579")
		.clickOnSubmit()
		
		.enterCityName("Alleppey")
		.clickOnCityOption()
		.clickOncheckInDate()
		.clickOncheckInDateOption("22")

		
		.clickOncheckOutDate()
        .clickOncheckOutDateOption("23")
        .clickOnRoomGuest()
        .clickOnRoomOptions("1")
        .clickOnAdultoptions("3")
        .clickOnChildrenoptions("0")
        .clickOnDone()
        .clickOnFindHotel()
       .switchToBookHotel()
        
        
        .clickOnFirstHotelDisplayed()
       
       .switchToContinuebook()
        .getNameofHotel("Treebo Tryst Palmyra Milford")
       
        .getPriceofHotel("//*[contains (@class, 'standard-price')]/div/div[2]/strong")
        .clickOnContinuetoBook()
        .switchToBookingdetail()
        .clickOnTitle("Mrs")
        .enterFirstName("Sarah")
        .enterLastName("Abraham")
        .clickOnState("TAMIL NADU")
        .clickOnGST("Yes")
        .enterGSTNum("22509A1123")
         .enterCompanyName("Hewlett Packard")
         .enterCompanyAddress("9th floor,Atlantic Building")
         .clickContinue()
         .switchToBookingdetail()
         
         .verifyGSTmessage();
        
        
        
       
        
         
         
       
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
