package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class userRegistrationFormC extends GenericWrappers {
	
	public userRegistrationFormC(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
	
	}

	
	public userRegistrationFormC enterUserID(String userid) {
		
		enterByXpath("//input[@Id='u_id']",userid);
		
		return this;
	}
	

public userRegistrationFormC enterpassword(String pwd) {
	
	enterByXpath("//input[@name='u_pwd']",pwd);
	
	return this;
}	
public userRegistrationFormC enterconfirmpassword(String confirm) {
	
	enterByXpath("//input[@name='u_repwd']",confirm);
	
	return this;
}

public userRegistrationFormC enterSecurityQuestion(String data) {
	
	selectVisibleTextByXpath("//select[@id='u_secques']",data);
	
	return this;
}
public userRegistrationFormC enterSecurityAnswer(String ans) {
	
	enterByXpath("//input[@name='u_secans']",ans);
	
	return this;
}
public userRegistrationFormC enterName(String name) {
	
	enterByXpath("//input[@name='u_name']",name);
	
	return this;
}
public userRegistrationFormC clickOnGender(String gen) {
	
	selectVisibleTextByXpath("//select[@id='u_gender']",gen);
	
	return this;
}


public userRegistrationFormC clickOnDateOfBirth(String dob) {
	
	enterByXpath("//input[@id='u_dob']",dob);
	
	return this;
}
public userRegistrationFormC enterDesignation(String desig) {
	
	enterByXpath("//input[@id='u_designation']",desig);
	
	return this;
}
public userRegistrationFormC enterEmailid(String emailid) {
	
	enterByXpath("//input[@id='u_emailid']",emailid);
	
	return this;
}
public userRegistrationFormC enterMobile(String mobilenum) {
	
	enterByXpath("//input[@id='u_mobile']",mobilenum);
	
	return this;
}
public userRegistrationFormC enterPhone(String phone) {
	
	enterByXpath("//input[@id='u_phone']",phone);
	
	return this;
}
public userRegistrationFormC clickOnNationality(String nationality) {
	
	selectVisibleTextByXpath("//select[@id='u_nationality']",nationality);
	
	return this;
}
public userRegistrationFormC enterHotelName(String name) {
	
	enterByXpath("//input[@id='name']",name);
	
	return this;
}
public userRegistrationFormC enterHotelCapacity(String cap) {
	
	enterByXpath("//input[@id='capacity']",cap);
	
	return this;
}
public userRegistrationFormC enterAddress(String address) {
	
	enterByXpath("//textarea[@id='address']",address);
	
	return this;
}
public userRegistrationFormC clickOnState() {
	
	clickByXpath("//select[@id='state']");
	
	return this;
}
public userRegistrationFormC clickOnStateOption(String state) {
	
	selectValueByXpath("//select[@id='state']",state);
	
	return this;
}
public userRegistrationFormC clickOnCity() {
	
	clickByXpath("//select[@id='city_distr']");
	
	return this;
}
public userRegistrationFormC clickOnCityOption(String city) {
	
	selectValueByXpath("//select[@name='city_distr']",city);
	
	return this;
}
public userRegistrationFormC clickOnAccomodationType() {
	
	clickByXpath("//select[@id='acco_type']");
	
	return this;
}
public userRegistrationFormC clickOnAccomodationTypeOption(String accom) {
	
	selectValueByXpath("//select[@id='acco_type']",accom);
	
	return this;
}
public userRegistrationFormC clickOnAccomodationGrade(String grade) {
	
	enterByXpath("//select[@id='star_rat']",grade);
	
	return this;
}
public userRegistrationFormC enterHotelEmail(String HotelEmail) {
	
	enterByXpath("//input[@name='email']",HotelEmail);
	
	return this;
}
public userRegistrationFormC enterHotelMobile(String HotelMob) {
	
	enterByXpath("//input[@id='mcontact']",HotelMob);
	
	return this;
}
public userRegistrationFormC enterHotelContact(String contact) {
	
	enterByXpath("//input[@id='contact']",contact);
	
	return this;
}

public userRegistrationFormC enterPassengeroneName(String name) {
	
	enterByXpath("//input[@name='name_o']",name);
	
	return this;
}
public userRegistrationFormC enterPassengeroneAddress(String address) {
	
	enterByXpath("//input[@name='address_o']",address);
	
	return this;
}
public userRegistrationFormC clickOnPassengeroneState(String state) {
	
	selectValueByXpath("//select[@id='state_o']",state);
	
	return this;
}
public userRegistrationFormC clickOnPassengeroneCity(String city) {
	
	selectValueByXpath("//select[@id='citydistr_o']",city);
	
	return this;
}
public userRegistrationFormC enterPassengeroneEmailid(String email) {
	
	enterByXpath("//input[@name='emailid_o']",email);
	
	return this;
}
public userRegistrationFormC enterPassengeronePhone(String phone) {
	
	enterByXpath("//input[@name='phoneno_o']",phone);
	
	return this;
}
public userRegistrationFormC enterPassengeroneMobile(String mobile) {
	
	enterByXpath("//input[@name='mobile_o']",mobile);
	
	return this;
}
public userRegistrationFormC clickAdd() {
	
	clickByXpath("(//input[@name='add'])[1]");
	
	return this;
}
public userRegistrationFormC enterPassengertwoname(String data) {
	
	enterByXpath("//input[@name='name_o']",data);
	
	return this;
}
public userRegistrationFormC enterPassengertwoAddress(String addres) {
	
	enterByXpath("//input[@name='address_o']",addres);
	
	return this;
}
public userRegistrationFormC enterPassengertwoState(String state) {
	
	selectValueByXpath("//select[@name='state_o']",state);
	
	return this;
}
public userRegistrationFormC enterPassengertwocity(String city) {
	
	selectValueByXpath("//select[@id='citydistr_o']",city);
	
	return this;
}
public userRegistrationFormC enterPassengertwoEmailid(String email) {
	
	enterByXpath("//input[@name='emailid_o']",email);
	
	return this;
}
public userRegistrationFormC enterPassengertwoPhone(String  number) {
	
	enterByXpath("//input[@name='phoneno_o']",number);
	
	return this;
}
public userRegistrationFormC enterPassengertwoMobile(String mobile) {
	
	enterByXpath("//input[@name='mobile_o']",mobile);
	
	return this;
}

public userRegistrationFormC enterPassengerthreename(String data) {
	
	enterByXpath("//input[@name='name_o']",data);
	
	return this;
}
public userRegistrationFormC enterPassengerthreeAddress(String addres) {
	
	enterByXpath("//input[@name='address_o']",addres);
	
	return this;
}
public userRegistrationFormC enterPassengerthreeState(String state) {
	
	selectValueByXpath("//select[@name='state_o']",state);
	
	return this;
}
public userRegistrationFormC enterPassengerthreecity(String city) {
	
	selectValueByXpath("//select[@id='citydistr_o']",city);
	
	return this;
}
public userRegistrationFormC enterPassengerthreeEmailid(String email) {
	
	enterByXpath("//input[@name='emailid_o']",email);
	
	return this;
}
public userRegistrationFormC enterPassengerthreePhone(String  number) {
	
	enterByXpath("//input[@name='phoneno_o']",number);
	
	return this;
}
public userRegistrationFormC enterPassengerthreeMobile(String mobile) {
	
	enterByXpath("//input[@name='mobile_o']",mobile);
	
	return this;
}

public userRegistrationFormC clickOnclose() {
	
closeAllBrowsers();
	
	return this;
}














































	
	
	
	
	
	
	
	
	
	
	
	
	
}
