package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AlertPage extends GenericWrappers {


public 	AlertPage(RemoteWebDriver driver,ExtentTest test) {
	
	this.driver = driver;
	this.test = test;
}
	
	
	
public AlertPage switchToAlert() {
		
		switchToLastWindow();
		return this;
	}
	
	
	public AlertPage getText() {
		
		getAlertTextNoSnap();
		return this;
	}
	
	public SimpleAlertFramePage accept() {
		
		acceptAlert();
		return new SimpleAlertFramePage(driver,test);
	}
	
	

	
	
	
}
