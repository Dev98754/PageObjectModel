package pom.irctc.testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.PanIndiaPage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC008";
		testCaseDescription = "to verify registration for PAN INDIA user";
		author = "Mercy";
		category = "Smoke";	
		browserName = "chrome";
		url = "https://panind.com/india/new_pan/";   
		
	}
    @Test
	
	
	public void PanIndia() {
		
		new PanIndiaPage(driver,test)
		.clickOnTitle("MRS.")
		.enterFirstName("Mercy")
		.enterMiddleName("Bewin")
		.enterLastName("Jacob")
		.enterFatherFirstName("Jacon")
		.enterFatherMiddleName("John")
		.enterFatherLastName("Abraham")
		.enterMobileNumber("7845807579")
		.enterEmail("mercybewin@gmail.com")
		.clickOnsourceOfIncome("Salary")
		.clickOnOffice()
		.enterDateofBirth("14071987")
		.enterResidenceAddressline1("14-Balaji Street")
		.enterResidenceAddressline2("Karpaga Nagar")
		.enterResidenceCity("Kanchipuram")
		.clickOnResidenceState("Tamil Nadu")
		.enterResidencePincode("600073")
    
		.enterOfficeName("Cerner healthCare")
        .enterOfficeAddressline1("Vishwapeed Street")
        .enterOfficeAddressline2("Prestige Apartment")
        .scrolldown("//html/body",Keys.PAGE_DOWN)
        .enterOfficeCity("Kanchipuram")
        .clickOnOfficeState("Tamil Nadu")
         .enterOfficePincode("600073")
         .clickIdentityProof("4")
         .clickAddressProof("Aadhar Card issued by UIDAI(In Copy)")
         .clickDOBProof("Matriculation certificate or mark sheet of recognised board (In Copy)")
         .clickAdharProof("Copy of Aadhaar Card / Letter")
         .clickOfficeAddressProof("Bank statement carrying Office Address")
         
         .close()	;	
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
