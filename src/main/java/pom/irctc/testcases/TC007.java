package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.FacebookHomePage;

import wrappers.ProjectWrappers;


public class TC007 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC007";
		testCaseDescription = "to verify Facebook registration for the new user";
		author = "Mercy";
		category = "Smoke";	
		browserName = "chrome";
		url = "https://www.facebook.com";   
		
	}
    @Test
	public void FacebookSignup() {
		
		new FacebookHomePage(driver,test)
	   .clickOnCreateNewAccount()
	     .enterFirstName("Mercy")
	     .enterLastName("Bewin")
	     .enterEmail("mercybewin@gmail.com")
	     .enterConfirmEmail("mercybewin@gmail.com")
	     .enterPassword("merM234!")
	     .clickOnDateofBirth()
	     .clickOnDateofBirthOption("14")
	     .clickOnMonthofBirth()
	     .clickOnMonthofBirthOption("Jul")
	     .clickOnYearofBirth()
	     .clickOnYearofBirthOption("1987")
	     .clickOnGender("Female")
	     .close();
		 
	     
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
