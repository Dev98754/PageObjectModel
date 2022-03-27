package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PromptAlertPage extends GenericWrappers {

	
	
public PromptAlertPage(RemoteWebDriver driver,ExtentTest test) {
	this.driver = driver;
	this.test = test;
}
	
	
	
public PromptAlertPage passName(String data) {
	
	alertsend(data);
		
		return this;
	}
	
	
public PromptAlertPage getName(String data) {
	
	getAlertTextNoSnap();
		
		return this;
	}
	
public PromptFramePage clickOnOk() {
	
acceptAlert();
		
		return new PromptFramePage(driver,test);
	}
	
public PromptFramePage clickOncancel() {
	
	dismissAlert();
		
		return new PromptFramePage(driver,test);
	}	
	
	
	
	
	
	
}
