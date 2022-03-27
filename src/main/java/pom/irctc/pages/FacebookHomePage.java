package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FacebookHomePage extends GenericWrappers {
	
	
	public FacebookHomePage(RemoteWebDriver driver,ExtentTest test) {
		this.driver =driver;
		this.test = test;
		
	}

	
	public FbAccountPage clickOnCreateNewAccount() {
		
		clickByXpath("//a[text()='Create New Account']");
		
		return new FbAccountPage(driver,test) ;
	}
	
	

	
	
	
}
