package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.PromptMainPage;
import wrappers.ProjectWrappers;

public class TC012 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC012";
		testCaseDescription = "to verify prompt alert";
		author = "Mercy";
		category = "Smoke";	
		browserName = "chrome";
		url = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";   
		
	}
	
	@Test
	
	public void  PromptAlert() {
		
	
		new PromptMainPage(driver,test)
		
		.switchToFrame()
		.clickOntry()
		.passName("Mercy")
		.getName("Mercy")
		.clickOnOk()
		.verifyTheMessage("//p[@id='demo']", "Mercy")
		
	    .refreshThePage()
	    .switchToFrame()
	    .clickOntry()
		.passName("Mercy")
		.getName("Mercy")
		.clickOncancel()
		.verifyTheMessageForCancel("//p[@id='demo']", "Mercy")
		.switchToMain()
		.clickOnTryHome();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
