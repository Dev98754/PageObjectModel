package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.ConfirmationPage;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC011";
		testCaseDescription = "to verify confirmation alert";
		author = "Mercy";
		category = "Smoke";	
		browserName = "chrome";
		url = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";   
		
	}
	
	@Test
	public void w3schoolConfirmation() {
		
		new ConfirmationPage(driver,test)
		.switchtoframe()
		
		.clickOntry()

		.getText()
		.clickonOk()
	
		.verifythemessageOk()
		.refreshThepage()
	
		.switchtoframe()
	
		.clickOntry()
	
		.getText()
		.clickonOk()
	
		.clickOntry()

		.clickOncancel()
	
		.verifythemessageCancel()
		.switchtoHome()
	
		.clickHome()
		.switchToConfirmHomePage();
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
