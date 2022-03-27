package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC003";
		testCaseDescription = "to verify charter form of the new user";
		author = "Mercy";
		category = "Smoke";	
		browserName = "chrome";
		url= "https://www.irctc.co.in";   
			
		
		
	}
	
	
	
	
	
	
	
	
	@Test
	public void charterForm() {
		
         new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToAccomodation()
		.clickOnMenu()
		
		.clickOnCharter()
		.switchToCharter()
		.clickOnEnquiryForm()
		.enterNameOfApplicant("Sarah")
		.enterNameOfOrganization("Hewlett Packard")
		.enterAddress("No.14,Chrome Plaza")
        .enterMobileNumber("78458075")		
		.enterEmail("sarahbewin@gmail.com")
		.clickOnRequestOption("Saloon Charter")
		.enterOriginStation("Trivandrum")
		.enterDestinationStation("Chennai")
		.clickOnDateOfDeparture()
		.clickOnDateOfDepartureOption("21")
		.clickOnArrival()
		.clickOnArrivalOption("24")
		
		.enterDurationOfTours("2")
		.enterCoachDetails("S3")
		.enterNumOfPassengers("3")
		.enterpurposeofCharter("Business")
		.enteradditionalServices("Food")
		.clickOnSubmit()
		.displayifmobilenumnotvalid();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
