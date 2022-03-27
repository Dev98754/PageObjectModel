package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.FormCPage;
import wrappers.ProjectWrappers;


public class TC006 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC006";
		testCaseDescription = "to verify user registration for FormC";
		author = "Mercy";
		category = "Smoke";	
		browserName = "chrome";
		url = "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";   
		
		
		
	}
	
	@Test
	public void FormC() {
		
		
		new FormCPage(driver,test)
		.clickOnSignUp()
		.enterUserID("MERCYBEWIN123")
		.enterpassword("MERm123!")
		.enterconfirmpassword("MERm123!")
		.enterSecurityQuestion("What is the name of your favorite book?")
		.enterSecurityAnswer("Padamaoadam")
		.enterName("Sarah")
		.clickOnGender("Female")
		.clickOnDateOfBirth("14/07/1987")
		.enterDesignation("Software Tester")
		.enterEmailid("sarahbewin@gmail.com")
		.enterMobile("7845807579")
		.enterPhone("0442451099")
		.clickOnNationality("INDIA")
		.enterHotelName("Taj Coromondel")
		.enterHotelCapacity("100")
		.enterAddress("Sector-6,B-Wing")
	   .clickOnCity()
	    .clickOnStateOption("28")
		.clickOnCity()
		 .clickOnCityOption("4C")
		 .clickOnAccomodationType()
		  .clickOnAccomodationTypeOption("H")
		
		.clickOnAccomodationGrade(" Two Star")
		.enterHotelEmail("mercybewin@gmail.com")
		.enterHotelMobile("7845807579")
		.enterHotelContact("0442451099")
		.enterPassengeroneName("Meena")
		.enterPassengeroneAddress("Building No.9,Plaza Mall")
		.clickOnPassengeroneState("28")
		.clickOnPassengeroneCity("9D")
		.enterPassengeroneEmailid("meena12@gmail.com")
		.enterPassengeronePhone("0442451099")
		.enterPassengeroneMobile("7845807579")
		.clickAdd()
		.enterPassengertwoname("Jacob")
		.enterPassengertwoAddress("9th Floor,Logos Plaza")
		.enterPassengertwoState("28")
		.enterPassengertwocity("7D")
		.enterPassengertwoEmailid("remya12@gmail.com")
		.enterPassengertwoPhone("0442671099")
		.enterPassengertwoMobile("9088907650")
		.clickAdd()
		.enterPassengerthreename("Loria")
		.enterPassengerthreeAddress("Floor-2,Verizon")
		.enterPassengerthreeState("28")
		.enterPassengerthreecity("11D")
		.enterPassengerthreeEmailid("loe12@gmail.com")
		.enterPassengerthreePhone("0442349088")
		.enterPassengerthreeMobile("9054880930")		
		.clickOnclose();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
