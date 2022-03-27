package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class ConfirmationPage extends GenericWrappers {
	
	
	public ConfirmationPage(RemoteWebDriver driver,ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
	}
	
public 	ConfirmationFramePage switchtoframe() {
	
	switchToframeid("iframeResult");
	return new ConfirmationFramePage(driver,test);
	
	
		
}
public 	ConfirmationPage switchtoConfirmationPage() {
	
	switchToLastWindow();
	return this;
	
	
		
}	
	


public 	ConfirmationHomePage clickHome() {
	
	clickByXpath("//a[@id='tryhome']");
	
	return new ConfirmationHomePage(driver,test);
}







}
