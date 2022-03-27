package pom.irctc.testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers{
	
	
		@BeforeClass
		public void beforeClass() {
			testCaseName = "TC001";
			testCaseDescription = "to verify IRCTC registration for the new user";
			author = "Mercy";
			category = "Smoke";	
			browserName = "chrome";
			url = "https://www.irctc.co.in/nget/train-search"; 
		
		}
		@Test
		public void irctcRegistration() {
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.clickOnRegister()
		.enterUserName("Sarah")
		 .enterUsePwd("Sar12!@#$")
		.enterConfPwd("Sar12!@#$")
		.clickOnPreferredlanguage()
		.clickOnPreferredLanguageOption("English")
		.clickOnSecurityQuestion()
		.clickOnSecurityQuestionOption("What was the name of your first school?")
	     .enterSecurityAns("Grace")
	     .scrolldown("//html/body",Keys.PAGE_DOWN)
		.clickOnContinue()
		//PERSONAL DETAILS
		.enterFirstName("Sarah")
		.enterMiddleName("Mariam")
		.enterLastName("Bewin")
        .clickOnSelectOccupation()
        .clickOnSelectOccupationOption("PUBLIC")
        .clickOndateofBirth("14-07-1987")
        
        .clickOnMaritalStatus("Married")
        .clickOnGender("Female")
        .enterEmail("mercybewin@gmail.com")
        .enterMobile("7845807579")
         .clickOnNationality()
         .clickOnNationalityOption("India")
         .clickOnContinue()
         //ADDRESS
         
         .enterResAddressLine1("House 14")
         .enterResAddressLine2("Balaji Street")
         .enterResAddressLine3("Karpaga Nagar")
         .enterResAddressLine3("Selaiyur")
         .enterResPinCode("600073")
         .clickOnResCity()
         .clickOnResCityOption("Kanchipuram")
         .clickOnResPostOffice()
         .clickOnResPostOfficeOption("Selaiyur S.O")
         .enterResMobile("7845807579")
         .clickOnofficeSameAsRes()
         //Office
         .enterOffAddress1("28-Prestige Apartment")
         .enterOffAddress2("Chikkajala")
         .enterOffAddress3("Forum Park")
         .clickOnOffCountry()
         .clickOnOffCountryOption("India")
         .enterOffPinCode("600073")
         .enterOffState("TAMILNADU")
         .enterOffCity("Kanchipuram")
          .enterOffPostOffice("Selaiyur S.O")
          .enterOffPhone("9840994820")
          .clickOnClose();
	
		
          
        
        
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
