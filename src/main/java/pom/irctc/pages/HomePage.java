package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	
	public HomePage(RemoteWebDriver driver,ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
	}

	
	public RegistrationPage clickOnRegister() {
		clickByXpath("//a[contains(text(),'REGISTER')]");
		return new RegistrationPage(driver,test);
	}
	
	
	public HomePage mouseHoverOnHolidays() {
		mouseHoverByXPath("//a[text()=' HOLIDAYS ']");
		return this;
	}
	
	
public HomePage mouseHoverOnStays() {
		mouseHoverByXPath("//a[contains(@aria-label,'Sub Menu of Holiday, Stays')]/span[text()='Stays']");
		return this;
	}
	
	public AccomodationPage clickOnLounge() {
		clickByXpath("//a[starts-with(@aria-label,'Sub Menu of Stays, Lounge.')]/span[text()='Lounge']");
	
		return new AccomodationPage(driver,test);
		
	}
	
	
}
