package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class ConfirmationFramePage extends GenericWrappers {

	public ConfirmationFramePage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public 	ConfirmAlertPage clickOntry() {
		
		clickByXpathNoSnap("/html/body/button");
		
		return new  ConfirmAlertPage(driver,test);
			
	}
	
	public 	ConfirmationFramePage verifythemessageOk() {
		
		verifyTextByXpath("//p[text()='You pressed OK!']","You pressed OK!");
		
		return this;
	}
	
public 	ConfirmationFramePage switchToConfirmFrame() {
		
		switchToLastWindow();
		
		return this;
	}
	
	public 	ConfirmationFramePage verifythemessageCancel() {
		
		verifyTextByXpath("//p[text()='You pressed Cancel!']","You pressed Cancel!");
		
		return this;
	}

	public 	ConfirmationPage switchtoHome() {
		
		switchtoHome();
		return new ConfirmationPage(driver,test);
		
		
			
	}
	public 	ConfirmationPage refreshThepage() {
		
		refresh();
		
		return new ConfirmationPage(driver,test) ;
	}

	
	
}
