package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PromptMainPage extends GenericWrappers {
	
	
	
	
	
public  PromptMainPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		
		

	}
	public PromptFramePage switchToFrame() {
		
		switchToframeid("iframeResult");
		
		return new PromptFramePage(driver,test);
	}
	
	
public PromptHomePage clickOnTryHome() {
		
		clickByXpath("//a[@id='tryhome']");
		
		return new PromptHomePage(driver,test);
	}
	

	
	
	
	
	
	
	

}
