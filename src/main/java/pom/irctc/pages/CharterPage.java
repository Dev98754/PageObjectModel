package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers {
	
	
	public CharterPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		
		
	}
public CharterPage switchToCharter() {
		
	switchToLastWindow();
		return this;
	}
	
	public CharterPage clickOnEnquiryForm() {
		
		clickByXpath("//a[text()='Enquiry Form']");
		return this;
	}
	
	
	public CharterPage enterNameOfApplicant(String data) {
		
	enterByXpath("//input[@name='name']",data);	
		
		return this;
				
	}
	
	public CharterPage enterNameOfOrganization(String data) {
		
		enterByXpath("//input[@name='organization']",data);
		return this;
			
	}
	
	public CharterPage enterAddress(String data) {
		
		enterByXpath("//input[@name='address']",data);
		return this;
	}
	
	public CharterPage enterMobileNumber(String data) {
		
		enterByXpath("//input[@name='mobile']",data);
		
		return this;
	}
	
	
	
	public CharterPage enterEmail(String data) {
		enterByXpath("//input[@name='email']",data);
		return this;
	}
	
	public CharterPage clickOnRequest() {
		clickByXpath("//select[starts-with(@name,'requestFor')]");
		return this;
	}
	
	public CharterPage clickOnRequestOption(String data) {
		selectVisibleTextByXpath("//select[starts-with(@name,'requestFor')]","Saloon Charter");
		return this;
	}
	public CharterPage enterOriginStation(String data) {
		
		enterByXpath("//input[@name='originStation']",data);
		return this;
	}
	
	public CharterPage enterDestinationStation(String data) {
		
		enterByXpath("//input[@name='destnStation']",data);
		return this;
	}
	
	public CharterPage clickOnDateOfDeparture() {
	clickByXpath("//input[@name='checkInDate']");	
		
		return this;
	}
	
	public CharterPage clickOnDateOfDepartureOption(String data) {
		
	clickByXpath("//span[text()='"+data+"']");	
		
		return this;
	}
	
	
	
	public CharterPage clickOnArrival() {
		clickByXpath("//input[@name='checkOutDate']");	
			
			return this;
		}
		
		public CharterPage clickOnArrivalOption(String data) {
			
		clickByXpath("(//span[text()='"+data+"'])[2]");	
			
			return this;
		}
	
	public CharterPage enterDurationOfTours(String data) {
			
			enterByXpath("//input[@name='durationPeriod']","data");	
				
				return this;	
	}

	public CharterPage enterCoachDetails(String data) {
		
		enterByXpath("//input[@name='coachDetails']","data");	
			
			return this;	
}
	
	public CharterPage enterNumOfPassengers(String data) {
		enterByXpath("//input[@name='numPassenger']",data);
		
		return this;
	}
	public CharterPage enterpurposeofCharter(String data) {
		enterByXpath("//textarea[@name='charterPurpose']",data);
		
		return this;
	}
	
	public CharterPage enteradditionalServices (String data) {
		enterByXpath("//textarea[@name='services']",data);
		
		return this;
	}
		
	
	public CharterPage clickOnSubmit() {
		clickByXpath("//button[@type='Submit']");
		return this;
	}
	public CharterPage displayifmobilenumnotvalid() {
		verifyTextByXpath("//span[text()='Mobile no. not valid']","Mobile no. not valid");
		
		return this;
		
		
	}
	
	public CharterPage clickOnClose() {
		
		clickByXpath("//*[@id='dismiss']");
		return this;
		
		
		
		
	}
	   
	
	
}






