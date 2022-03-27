package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers {
	
	
	public LoginPage(RemoteWebDriver driver,ExtentTest test) {
		
		
		this.driver = driver;
		this.test = test;
	}
	
	
public LoginPage switchToLoginPage() {
		
		switchToLastWindow();
		
		return this;
	}
	public LoginPage clickOnGuestUserLogin() {
		
		clickByXpath("//a[text()='Guest User Login ']");
		
		return this;
	}
	
	
	public LoginPage enterEmail(String data) {
		
		enterByXpath("//input[@name='email']",data);
		
		
		return this;
	}
	
public LoginPage enterMobileNum(String data) {
		
		enterByXpath("//input[@name='mobileNo']",data);
		
		
		return this;	
	}
	
public IrctcHotelPage clickOnSubmit() {
	
	clickByXpath("(//button[text()='Login'])[2]");
	
	
	return new IrctcHotelPage(driver,test);	
}
	
	
	
	
	
}
