package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class MenuPage extends GenericWrappers {
	
	
	public MenuPage(RemoteWebDriver driver,ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
	}
	
	public FtrSignUpPage clickOnBookYourCoachTrain() {
		clickByXpath("//a[text()='Book Your Coach/Train']");
		return new FtrSignUpPage(driver,test);
	}
	
	public CharterPage clickOnCharter() {
		clickByXpath("//a[text()='Charter']");
		return new CharterPage(driver,test);
	}
	
	
	
	
	
	

}
