package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class OTPVerifyPage extends GenericWrappers {

	public OTPVerifyPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
			
	}
	
	public OTPVerifyPage switchToOTP() {
		switchToLastWindow();
		return this;
	}
	public OTPVerifyPage clickOnVerify() {
	clickByXpath("//button[text()='Verify']");	
		
		return this;
	}
	
	
	
	public OTPVerifyPage verifyThemessage() {
		
		
		verifyTextByXpath("//span[text()='otp is required.']","otp is required.");
			
			return this;
		}
	
	
	
public OTPVerifyPage closebrowser() {
		
		
		closeAllBrowsers();
			
			return this;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
