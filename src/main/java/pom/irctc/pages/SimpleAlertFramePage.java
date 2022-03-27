package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SimpleAlertFramePage extends GenericWrappers {

	
public 	SimpleAlertFramePage(RemoteWebDriver driver,ExtentTest test) {
	
	this.driver = driver;
	this.test = test;
}
	
	public SimpleAlertFramePage switchToMainFrame() {
		
		switchToLastWindow();
		return this;
	}
	
	public AlertPage clickOntry() {
		clickByXpathNoSnap("//html/body/button");
		return new AlertPage(driver,test);
				
		
	}
	
	
	
public w3schoolSimplePage switchtoHome() {
		
		defaultContent();
		return new w3schoolSimplePage(driver,test);
	}


}
