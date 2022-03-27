package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FormCPage extends GenericWrappers {
	
	public FormCPage(RemoteWebDriver driver,ExtentTest test) {

      this.driver = driver;
      this.test = test;

	}

	
	
	public userRegistrationFormC clickOnSignUp() {
		
		clickByXpath("//a[text()='Sign Up (Registration)']");
		
		return new userRegistrationFormC(driver,test);
				}
	
	
public FormCPage waitforsometime() {
		
		waitProperty(5000);
		
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
