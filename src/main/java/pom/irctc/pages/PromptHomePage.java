package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PromptHomePage extends GenericWrappers {

	public PromptHomePage(RemoteWebDriver driver,ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
	}
	public PromptHomePage close() {
		
		closeAllBrowsers();
		return new PromptHomePage(driver,test);
	}
	
	
	
	
	
	
	
	
	
	
	
}
