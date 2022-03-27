package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class ConfirmAlertPage extends GenericWrappers {

	public ConfirmAlertPage(RemoteWebDriver driver,ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
	}
	
public ConfirmAlertPage switchToAlert() {
		
		
		switchToLastWindow();
		
		return this;
	}
	public ConfirmAlertPage getText() {
		
		
		getAlertTextNoSnap();
		
		return this;
	}
	
public ConfirmationFramePage clickonOk() {
		
		
		acceptAlert();
		
		return new ConfirmationFramePage(driver,test);
	}
	
public ConfirmationFramePage clickOncancel() {
	
	
	dismissAlert();
	
	return new ConfirmationFramePage(driver,test);
}

	
	
	
}
