package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.PhPPage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC009";
		testCaseDescription = "to verify Php registration for the new user";
		author = "Mercy";
		category = "Smoke";	
		browserName = "chrome";
		url =  "https://www.phptravels.org/register.php"; 
		
		
		
	}
	
	
	
	@Test
	public void phpTravels() {
		
		new PhPPage(driver,test)
		.enterFirstName("Mercy")
		.enterLastName("Bewin")
		.enterEmail("mercybewin@gmail.com")
		.enterPhonenumber("7845807579")
		.enterCompanyName("SAVIO TECHNOLOGIES")
		.enterAddress("9th floor,Verizon Park")
		.enterAddress2("Karpaga Salai")
		.enterCity("Kanchipuram")
         .clickOnStateOption("TamilNadu")
		.enterPostcode("600073")
		.clickOnCountry("IN")
		.enterWhatsapp("9761237809")
         .clickOngeneratePassowrd()
         .clickOngenerateNewPassowrd()
         .copyToclipboard();
         
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
