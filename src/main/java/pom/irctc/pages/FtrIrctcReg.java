package pom.irctc.pages;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FtrIrctcReg extends GenericWrappers {
	
	public FtrIrctcReg(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		
	}
	public FtrIrctcReg switchToFtrTrctc() {
		switchToLastWindow();
		return this;
	}
	
	
	public FtrIrctcReg enterUserId(String data) {
		enterByXpath("//*[@id='userId']", data);
		return this;
	}
	
	public FtrIrctcReg enterPassword(String data) {
		enterByXpath("//*[@id='password']", data);
		return this;
	}
	
	public FtrIrctcReg enterConfirmPassword(String data) {
		enterByXpath("//*[@id='cnfPassword']", data);
		return this;
	}
	
	/*public FtrIrctcReg clickOnSecurityQuestion() {
		clickByXpath("//*[@id='secQstn']");
		return this;
	}*/
	
	public FtrIrctcReg clickOnSecurityQuestionOption(String data) {
		selectVisibleTextByXpath("//select[@id='secQstn']", data);
		return this;
	}
	
	public FtrIrctcReg enterSecurityAnswer(String data) {
		enterByXpath("//*[@id='secAnswer']", data);
		return this;
	}
	
	public FtrIrctcReg clickODB() {
		clickByXpath("//*[@id='dateOfBirth']");
		
		return this;		
	}
	public FtrIrctcReg enterDOY(String DOBYear) {
		
		selectVisibleTextByXpath("//select[@data-handler='selectYear']", DOBYear);
		
		return this;		
	}
public FtrIrctcReg enterDOM(String DOBMonth) {
		
		
		selectVisibleTextByXpath("//select[@data-handler='selectMonth']", DOBMonth);
		
		return this;		
	}
public FtrIrctcReg enterDOB(String DOBDt) {
	
	
	clickByXpath("//td[@data-handler='selectDay']/a[text()='"+DOBDt+"']");
	return this;		
}
	public FtrIrctcReg clickOnGender(String data) {
		clickByXpath("//label[starts-with(@for,'gender') and contains(text(),'"+data+"')]");
		return this;		
	}
	public FtrIrctcReg clickOnMarital(String data) {
		clickByXpath("//label[text()='"+data+"']");
		return this;		
	}
	
	
	public FtrIrctcReg enterEmail(String data) {
		enterByXpath("//*[@id='email']", data);
		return this;
	}
	
	public FtrIrctcReg clickOnOccupation() {
		clickByXpath("//select[@id='occupation']");
		return this;
	}
		
	public FtrIrctcReg clickOnOccupationOption(String data) {
		selectVisibleTextByXpath("//select[@id='occupation']", data);
		return this;
	}
	
	public FtrIrctcReg enterFirstName(String data) {
		enterByXpath("//*[@id='fname']", data);
		return this;
	}
	
	public FtrIrctcReg enterMiddleName(String data) {
		enterByXpath("//*[@id='mname']", data);
		return this;
	}
	
	public FtrIrctcReg enterLastName(String data) {
		enterByXpath("//*[@id='lname']", data);
		return this;
	}

	public FtrIrctcReg clickOnNationality() {
		clickByXpath("//*[@id='natinality']");
		return this;
	}
	
	public FtrIrctcReg clickOnNationalityOption(String data) {
		selectVisibleTextByXpath("//select[@id='natinality']", data);
		return this;
	}
	public FtrIrctcReg scrolldown(String xpath,Keys Key) {
		enterByXpath("//html/body",Keys.PAGE_DOWN);
		return this;
	}

	public FtrIrctcReg enterFlatNo(String data) {
		enterByXpath("//*[@id='flatNo']", data);
		return this;
	}
	
	public FtrIrctcReg enterStreet(String data) {
		enterByXpath("//*[@id='street']", data);
		return this;
	}
	
	public FtrIrctcReg enterArea(String data) {
		enterByXpath("//*[@id='area']", data);
		return this;
	}
	
	public FtrIrctcReg clickOnCountry() {
		clickByXpath("//select[@id='country']");
		return this;
	}
	
	public FtrIrctcReg clickOnCountryOption(String data) {
		selectVisibleTextByXpath("//select[@id='country']", data);
		return this;
	}
	
	public FtrIrctcReg enterMobileNo(String data) {
		enterByXpath("//*[@id='mobile']", data);
		return this;
	}
	
	public FtrIrctcReg enterPinCode(String data) {
		enterByXpath("//input[@id='pincode']", data);
		return this;
	}
	
	public FtrIrctcReg clickOnCity() {
		clickByXpath("//select[@id='city']");
		return this;
	}
	
	public FtrIrctcReg clickOnCityOption(String data) {
		selectValueByXpath("//select[@id='city']", data);
		return this;		
	}
	
		public FtrIrctcReg clickOnState() {
		clickByXpath("//*[@id='state']");
		return this;
	}
	
	public FtrIrctcReg clickOnStateOption(String data) {
		selectVisibleTextByXpath("//*[@id='state']", data);
		return this;
	}
	
	public FtrIrctcReg clickOnPostOffice() {
		clickByXpath("//*[@id='postOffice']");
		return this;
	}
	
	public FtrIrctcReg clickOnPostOfficeOption(String data) {
		selectVisibleTextByXpath("//*[@id='postOffice']", data);
		return this;
	}
	
	public FtrIrctcReg clickOnCommunicationAddress() {
		clickByXpath("//input[@id='sameAddresses1']");
		return this;
	}
	
	public FtrIrctcReg enterOffFlatNo(String data) {
		enterByXpath("//*[@id='flatNoOffice']", data);
		return this;
	}
	
	public FtrIrctcReg enterOffStreet(String data) {
		enterByXpath("//*[@id='streetOffice']", data);
		return this;
	}
	
	public FtrIrctcReg enterOffArea(String data) {
		enterByXpath("//*[@id='areaOffice']", data);
		return this;
	}
	
	public FtrIrctcReg clickOnOffCountry() {
		clickByXpath("//select[@id='countryOffice']");
		return this;
	}
	
	public FtrIrctcReg clickOnOffCountryOption(String data) {
		selectVisibleTextByXpath("//select[@id='countryOffice']", data);
		return this;
	}
	
	public FtrIrctcReg enterOffMobileNo(String data) {
		enterByXpath("//*[@id='mobileOffice']", data);
		return this;
	}
	
	public FtrIrctcReg enterOffPinCode(String data) {
		enterByXpath("//*[@id='pincodeOffice']", data);
		return this;
	}
	
	public FtrIrctcReg clickOnOffCity() {
		clickByXpath("//*[@id='cityOffice']");
		return this;
	}
	
	public FtrIrctcReg clickOnOffCityOption(String data) {
		selectValueByXpath("//select[@id='cityOffice']",data);
		return this;		
	}
	
	public FtrIrctcReg clickOnOffState() {
		clickByXpath("//*[@id='stateOffice']");
		return this;
	}
	
	public FtrIrctcReg clickOnOffStateOption(String data) {
		selectValueByXpath("//select[@id='stateOffice']", data);
		return this;
	}
	
	public FtrIrctcReg clickOnOffPostOffice() {
		clickByXpath("//*[@id='postOfficeOffice']");
		return this;
	}
	
	public FtrIrctcReg clickOnOffPostOfficeOption(String data) {
		selectVisibleTextByXpath("//select[@id='postOfficeOffice']", data);
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
