package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class MakePaymentPage extends GenericWrappers {
	
	public MakePaymentPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test =test;
	}
	
	
	public MakePaymentPage switchToPaymentPage() {
		switchToLastWindow();
		return this;
	}
	public MakePaymentPage clickAgreeOption() {
		
		clickByXpath("//span[@class='checkmark']");
		return this;
	}
	
	
public OTPVerifyPage clickOnMakePayment() {
		
		clickByXpath("//button[text()='Make Payment']");
		return new OTPVerifyPage(driver,test);
	}	
	
	

}
