package pom.irctc.pages;



import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PanIndiaPage extends GenericWrappers {

	
public 	PanIndiaPage(RemoteWebDriver driver,ExtentTest test) {
	this.driver = driver;
	this.test = test;

}
	
	
	
	public PanIndiaPage clickOnTitle(String title) {
		
		
		selectVisibleTextByXpath("//select[@id='pan_title']",title);
		return this;
	}
	
	
public PanIndiaPage enterFirstName(String fname) {
		
		
		enterByXpath("//input[@id='pan_firstname']",fname);
		return this;
	}
	
public PanIndiaPage enterMiddleName(String mname) {
	
	
	enterByXpath("//input[@id='pan_middlename']",mname);
	return this;
}
public PanIndiaPage enterLastName(String lname) {
	
	
	enterByXpath("//input[@id='pan_lastname']",lname);
	return this;
}
public PanIndiaPage enterFatherFirstName(String fatherfname) {
	
	
	enterByXpath("//input[@id='pan_fatherfirstname']",fatherfname);
	return this;
}
public PanIndiaPage enterFatherMiddleName(String fathermname) {
	
	
	enterByXpath("//input[@id='pan_fathermiddlename']",fathermname);
	return this;
}
public PanIndiaPage enterFatherLastName(String fatherlname) {
	
	
	enterByXpath("//input[@id='pan_fatherlastname']",fatherlname);
	return this;
}
public PanIndiaPage enterMobileNumber(String mobnum) {
	
	
	enterByXpath("//input[@id='pan_mobilenumber']",mobnum);
	return this;
}
public PanIndiaPage enterEmail(String email) {
	
	
	enterByXpath("//input[@id='pan_email']",email);
	return this;
}
public PanIndiaPage clickOnsourceOfIncome(String source) {
	
	
	selectVisibleTextByXpath("//select[@id='pan_sourceofincome']",source);
	return this;
}
public PanIndiaPage clickOnOffice() {
	
	
	clickByXpath("//input[@id='office']");
	return this;
}
public PanIndiaPage enterDateofBirth(String ddmmyyyy) {
	
	
	enterByXpath("//input[@id='pan_dob']",ddmmyyyy);
	return this;
}
public PanIndiaPage enterResidenceAddressline1(String addr1) {
	
	
	enterByXpath("//input[@id='pan_addressline1']",addr1);
	return this;
}
public PanIndiaPage enterResidenceAddressline2(String addr2) {
	
	
	enterByXpath("//input[@id='pan_addressline2']",addr2);
	return this;
}
public PanIndiaPage enterResidenceCity(String city) {
	
	
	enterByXpath("//input[@id='pan_cityname']",city);
	return this;
}
public PanIndiaPage clickOnResidenceState(String state) {
	
	
	selectVisibleTextByXpath("//select[@id='pan_state']",state);
	return this;
}
public PanIndiaPage enterResidencePincode(String pin) {
	
	
	enterByXpath("//input[@id='pan_pincode']",pin);
	return this;
}

public PanIndiaPage scrolldown(String xpath,Keys PAGE_DOWN) {
	
	enterByXpath("//html/body",PAGE_DOWN);

	return this;
}
	
public PanIndiaPage enterOfficeName(String name) {
	
	
	enterByXpath("//input[@id='pan_officename']",name);
	return this;
}
public PanIndiaPage enterOfficeAddressline1(String addr1) {
	
	
	enterByXpath("//input[@id='pan_officeaddressline1']",addr1);
	return this;
}
public PanIndiaPage enterOfficeAddressline2(String addr2) {
	
	
	enterByXpath("//input[@id='pan_officeaddressline2']",addr2);
	return this;
}
public PanIndiaPage enterOfficeCity(String city) {
	
	
	enterByXpath("//input[@id='pan_officecityname']",city);
	return this;
}
public PanIndiaPage clickOnOfficeState(String state) {
	
	
	selectVisibleTextByXpath("//select[@id='pan_officestate']",state);
	return this;
}
public PanIndiaPage enterOfficePincode(String pin) {
	
	
	enterByXpath("//input[@id='pan_officepincode']",pin);
	return this;
}
	
public PanIndiaPage clickIdentityProof(String data) {
	
	
	selectValueByXpath("//select[@id='pan_identityproof']",data);
	return this;
}
public PanIndiaPage clickAddressProof(String address) {
	
	
	selectVisibleTextByXpath("//select[@id='pan_addressproof']",address);
	return this;
}
public PanIndiaPage clickDOBProof(String dob) {
	
	
	selectVisibleTextByXpath("//select[@id='pan_DOBproof']",dob);
	return this;
}
public PanIndiaPage clickAdharProof(String adhar) {
	
	
	selectVisibleTextByXpath("//select[@id='pan_aadhaarproof']",adhar);
	return this;
}
public PanIndiaPage clickOfficeAddressProof(String officeaddress) {
	
	
	selectVisibleTextByXpath("//select[@id='pan_officeaddressproof']",officeaddress);
	return this;
}
public PanIndiaPage clickAgree() {
	
	
	clickByXpath("//input[@id='pan_source']");
	return this;
}
	
public PanIndiaPage close() {
	
	
	closeAllBrowsers();
	return this;
}


	
	
	
	
	
	
}
