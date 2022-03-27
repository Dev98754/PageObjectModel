package pom.irctc.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers {
	
	
	public RegistrationPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public RegistrationPage enterUserName(String data) {
		
		enterByXpath("//input[@id='userName']",data);
		return this;
	}
	
public RegistrationPage enterUsePwd(String data) {
	
	enterByXpath("//input[@id='usrPwd']",data);
	return this;	
}

public RegistrationPage enterConfPwd(String data) {
	enterByXpath("//input[@id='cnfUsrPwd']",data);
	return this;
	
	
}

public RegistrationPage clickOnPreferredlanguage() {

	clickByXpath("//span[text()='Preferred Language']");
	return this;
}

public RegistrationPage clickOnPreferredLanguageOption(String data) {
	clickByXpath("//span[text()='"+data+"']");
	return this;
	
}
public RegistrationPage scrolldown(String xpath,Keys PAGE_DOWN) {
	
	
	enterByXpath("//html/body","PAGE_DOWN");
	return this;
}

public RegistrationPage clickOnSecurityQuestion() {
	
	clickByXpath("//div[@class='ng-tns-c66-15 ui-dropdown ui-widget ui-state-default ui-corner-all']");
	return this;
}



public RegistrationPage clickOnSecurityQuestionOption(String data) {
	clickByXpath("//span[text()='"+data+"']");
	return this;
	
}

public RegistrationPage enterSecurityAns(String data) {
	enterByXpath("//input[@formcontrolname='secAns']",data);
	return this;
}

public RegistrationPage clickOnContinue() {
	clickByXpath("//button[@label='Continue']");
	return this;
}

public RegistrationPage enterFirstName(String data) {
	enterByXpath("//input[@id='firstName']",data);
	return this;
}


public RegistrationPage enterMiddleName(String data) {
	enterByXpath("//input[@id='middleName']",data);
	return this;
}

public RegistrationPage enterLastName(String data) {
	enterByXpath("//input[@id='lastname']",data);
	return this;
}

public RegistrationPage clickOnSelectOccupation() {
	clickByXpath("//span[text()='Select Occupation']");
	return this;
	
}
public RegistrationPage clickOnSelectOccupationOption(String data) {
	clickByXpath("//span[text()='"+data+"']");
	return this;
}




public RegistrationPage clickOndateofBirth(String dob) {
	
	enterByXpath("//input[@class='ng-tns-c59-17 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']",dob);
	return this;
	
}









public RegistrationPage clickOnMaritalStatus(String data) {
	
	clickByXpath("//label[text()='"+data+"']");
	return this;
	
}

public RegistrationPage clickOnGender(String data) {
	clickByXpath("//*[@formcontrolname='gender']/*/div[contains(@aria-label,'"+data+"')]");
	return this;
}

public RegistrationPage enterEmail(String data) {
	enterByXpath("//input[@id='email']", data);                     	
	return this;
}

public RegistrationPage enterMobile(String data) {
	enterByXpath("//*[@id='mobile']", data);
	return this;
}


public RegistrationPage clickOnNationality() {
	clickByXpath("//*[@formcontrolname='nationality']");
	return this;
}

public RegistrationPage clickOnNationalityOption(String data) {
	selectVisibleTextByXpath("//select[@formcontrolname='nationality']", data);
	return this;	
}

public RegistrationPage enterResAddressLine1(String data) {
	enterByXpath("//*[@id='resAddress1']", data);
	return this;
}

public RegistrationPage enterResAddressLine2(String data) {
	enterByXpath("//*[@id='resAddress2']", data);
	return this;
}

public RegistrationPage enterResAddressLine3(String data) {
	enterByXpath("//*[@id='resAddress3']", data);
	return this;
}

public RegistrationPage enterResPinCode(String data) {
	enterByXpath("//input[@formcontrolname='resPinCode']", data);
	return this;
}


public RegistrationPage enterResState(String data) {
	enterByXpath("//input[@id='resState']", data);
	return this;
}

public RegistrationPage clickOnResCity() {
	clickByXpath("//select[@formcontrolname='resCity']");
	return this;
}

public RegistrationPage clickOnResCityOption(String data) {
	selectVisibleTextByXpath("//select[@formcontrolname='resCity']", data);		
	return this;
}

public RegistrationPage clickOnResPostOffice() {
	clickByXpath("//select[@formcontrolname='resPostOff']");
	return this;
}

public RegistrationPage clickOnResPostOfficeOption(String data) {
	selectVisibleTextByXpath("//select[@formcontrolname='resPostOff']", data);
	return this;
}

public RegistrationPage enterResMobile(String data) {
	enterByXpath("//*[@id='resPhone']", data);
	return this;
}

public RegistrationPage clickOnofficeSameAsRes(){
	clickByXpath("//*[@id='no']");
	return this;
}

public RegistrationPage enterOffAddress1(String data) {
	enterByXpath("//*[@id='offAddress1']", data);
	return this;
}

public RegistrationPage enterOffAddress2(String data) {
	enterByXpath("//*[@id='offAddress2']", data);
	return this;
}

public RegistrationPage enterOffAddress3(String data) {
	enterByXpath("//*[@id='offAddress3']", data);
	return this;
}

public RegistrationPage clickOnOffCountry() {
	clickByXpath("//*[@formcontrolname='offCountry']");
	return this;
}

public RegistrationPage clickOnOffCountryOption(String data) {
	
	clickByXpath("//li[@aria-label='"+data+"']");
	return this;
}

public RegistrationPage enterOffPinCode(String data) {
	enterByXpath("//*[@id='offPinCode']", data);
	return this;
}

public RegistrationPage enterOffState(String data) {
	enterByXpath("//*[@id='offState']", data);
	return this;
}

public RegistrationPage enterOffCity(String data) {
	enterByXpath("//*[@id='offCity']", data);
	return this;
}

public RegistrationPage enterOffPostOffice(String data) {
	enterByXpath("//*[@id='offPostOff']", data);
	return this;
}

public RegistrationPage enterOffPhone(String data) {
	enterByXpath("//*[@id='offPhone']", data);
	return this;
}

public RegistrationPage clickOnRegisterButton() {
	clickByXpath("//button[@label='Register']");
	return this;
}

public RegistrationPage clickOnClose() {
	closeAllBrowsers();
	return this;
}










}
