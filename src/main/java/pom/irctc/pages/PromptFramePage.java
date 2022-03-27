package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PromptFramePage extends GenericWrappers {
	
	public PromptFramePage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	
	public PromptAlertPage clickOntry() {
		
		clickByXpathNoSnap("//html/body/button");	
		
		return new PromptAlertPage(driver,test);
	}
	
	
public PromptFramePage verifyTheMessage(String xpath,String data) {
		
		verifyTextByXpath("//p[text()='Hello Mercy! How are you today?']",data);	
		
		return new PromptFramePage(driver,test);
	}
	
public PromptMainPage refreshThePage() {
	
	refresh();
	
	return new PromptMainPage(driver,test);
}
	
public PromptFramePage verifyTheMessageForCancel(String xpath,String data) {
	
	verifyTextByXpath("//p[text()='User cancelled the prompt.']",data);	
	
	return new PromptFramePage(driver,test);
}
	
public PromptMainPage switchToMain() {
	
	defaultContent();
	
	return new PromptMainPage(driver,test);
}	
	
	
	
	
	
	
}
