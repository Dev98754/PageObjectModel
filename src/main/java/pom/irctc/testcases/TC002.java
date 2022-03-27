package pom.irctc.testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;


public class TC002 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC002";
		testCaseDescription = "to verify Registration Form  for the new user";
		author = "Mercy";
		category = "Smoke";	
		browserName = "chrome";
		url = "https://www.irctc.co.in/nget/train-search";  
		
		
		
	}
	
	
	@Test
	public void bookCoach() {
		
		new CovidAlertPage(driver,test)
		
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToAccomodation()
		.clickOnMenu()
		.clickOnBookYourCoachTrain()
		.switchToFTRSignup()
		
		.clickOnNewUserSignUp()
		.switchToFtrTrctc()
		.enterUserId("Sarah")
		.enterPassword("Manasi1@!#")
		.enterConfirmPassword("Manasi1@!#")
		.clickOnSecurityQuestionOption("What was the name of your first school?")
	
	     .enterSecurityAnswer("N.V.H.S.S")
		.clickODB()
		.enterDOY("1987")
		.enterDOM("Jul")
		.enterDOB("14")
		.clickOnGender("Female")
		.clickOnMarital("Married")
		.enterEmail("mercybewin@gmail.com")
		.clickOnOccupation()
		.clickOnOccupationOption("Public")
		.enterFirstName("Sarah")
		.enterMiddleName("Mariam")
		.enterLastName("Bewin")
		.clickOnNationalityOption("Indian")
		.scrolldown("//html/body",Keys.PAGE_DOWN)
		.enterFlatNo("14-Karpaga Nagar")
		.enterStreet("Balaji Street")
		.enterArea("Tambaram")
		.clickOnCountryOption("India")
		.enterMobileNo("7845807579")
		.enterPinCode("600073")
		.clickOnCity()
		.clickOnCityOption("Kanchipuram")
		.clickOnState()
		.clickOnStateOption("TAMIL NADU")
		.clickOnPostOfficeOption("Selaiyur S.O")
		.clickOnCommunicationAddress()
		.enterOffFlatNo("15")
		.enterOffStreet("Vishweshwarayya Street")
		.enterOffArea("Al-Ghubra")
		 .clickOnOffCountryOption("India")
		 .enterOffMobileNo("7845807579")
		 .enterOffPinCode("600073")
		 .clickOnCityOption("Kanchipuram")
		 .clickOnStateOption("TAMIL NADU")
	
         .clickOnPostOfficeOption("Rajakilpakkam B.O");
         
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
		

}
