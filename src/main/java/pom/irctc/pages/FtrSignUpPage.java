package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FtrSignUpPage extends GenericWrappers {
	
	public FtrSignUpPage(RemoteWebDriver driver,ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
	}
	public FtrSignUpPage switchToFTRSignup() {
		switchToLastWindow();
		
		return this;
	}
	
	public FtrIrctcReg clickOnNewUserSignUp()
	
	{
		clickByXpath("//a[text()='New User? Signup']");
		return new FtrIrctcReg(driver,test);
	}

}
