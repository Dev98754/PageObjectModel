package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.w3schoolSimplePage;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers {
    @BeforeClass
	public void beforeClass() {
		testCaseName = "TC010";
		testCaseDescription = "to verify simeple alert functionality";
		author = "Mercy";
		category = "Smoke";	
		browserName = "chrome";
		url = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";   	
	}
	
	
	
	@Test
	public void simpleAlert() {
		
new w3schoolSimplePage(driver,test) 
		
		
		.switchtoframe()
	    .clickOntry()
		.getText()
		.accept()
		.switchtoHome()
		.clickOntryHome()
		.switchToNext();
		
	
	
		
		
		
		
		
	}
	
	
}
