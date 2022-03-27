package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PhPPage extends GenericWrappers {
	
	
	public  PhPPage(RemoteWebDriver driver,ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
		
		
		
	}

	
	public PhPPage enterFirstName(String fname) {
		
		enterByXpath("//input[@id='inputFirstName']",fname);
		return this;
			
	}
	
	
  public PhPPage enterLastName(String lname) {
		
		enterByXpath("//input[@id='inputLastName']",lname);
		return this;
			
	}
	
  public PhPPage enterEmail(String lname) {
		
		enterByXpath("//input[@id='inputEmail']",lname);
		return this;
			
	}
	
  
  
  public PhPPage enterPhonenumber(String phnum) {
		
		enterByXpath("//input[@id='inputPhone']",phnum);
		return this;
			
	}
  
	public PhPPage enterCompanyName(String comp) {
		enterByXpath("//input[@id='inputCompanyName']",comp);
		return this;
	}
	
	public PhPPage enterAddress(String addr1) {
		
		enterByXpath("//input[@id='inputAddress1']",addr1);
		return this;
		
		
	}
	
public PhPPage enterAddress2(String addr2) {
		
		enterByXpath("//input[@id='inputAddress2']",addr2);
		return this;	
	}
	
public PhPPage enterCity(String city) {
	
	enterByXpath("//input[@id='inputCity']",city);
	return this;	
}	
	



public PhPPage clickOnStateOption(String state) {
	
	enterByXpath("//input[@id='stateinput']",state);
	return this;	
}		
public PhPPage enterPostcode(String pin) {
	enterByXpath("//input[@id='inputPostcode']",pin);
	return this;
}

public PhPPage clickOnCountry(String country) {
	selectValueByXpath("//select[@id='inputCountry']",country);
	return this;
}

public PhPPage enterWhatsapp(String phn) {
	enterByXpath("//input[@id='customfield2']",phn);
	return this;
}

public PhPPage clickOngeneratePassowrd() {
	clickByXpath("(//button[contains(@class,'btn btn-default btn-sm')])[1]");
	return this;
}

public PhPPage clickOngenerateNewPassowrd() {
	clickByXpath("//button[@class='btn btn-default btn-sm']");
	return this;
}

 
public PhPPage copyToclipboard() {
	clickByXpath("//button[@id='btnGeneratePasswordInsert']");
	return this;
}

public PhPPage close() {
	closeAllBrowsers();
	return this;
}






}
