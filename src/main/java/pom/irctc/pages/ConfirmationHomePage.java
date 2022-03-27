package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class ConfirmationHomePage extends GenericWrappers {
	
	public ConfirmationHomePage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

public ConfirmationHomePage switchToConfirmHomePage() {
		
		switchToLastWindow();
		return this;
	}	
public ConfirmationHomePage close() {
		
		closeAllBrowsers();
		return this;
	}
	
	
	
	
	
	
	
	
	
}

