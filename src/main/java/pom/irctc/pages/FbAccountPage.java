package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FbAccountPage extends GenericWrappers {

	
	
	public FbAccountPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	
	
	public FbAccountPage enterFirstName(String fname) {
	enterByXpath("//input[@name='firstname']",fname);																																																																													
		
		return this;
	}
	
	public FbAccountPage enterLastName(String lname) {
		enterByXpath("//input[@name='lastname']",lname);																																																																													
			
			return this;
		}
		
	public FbAccountPage enterEmail(String email) {
		enterByXpath("//input[@name='reg_email__']",email);																																																																												
			
			return this;
		}
		
	public FbAccountPage enterConfirmEmail(String confirmemail) {
		enterByXpath("//input[@name='reg_email_confirmation__']",confirmemail);																																																																												
			
			return this;
		}
		
	public FbAccountPage enterPassword(String password) {
		enterByXpath("//input[@id='password_step_input']",password);																																																																												
			
			return this;
		}
		
	public FbAccountPage clickOnDateofBirth() {
		clickByXpath("//select[@id='day']");
		return this;
		}
	public FbAccountPage clickOnDateofBirthOption(String dobDate) {
		selectVisibleTextByXpath("//select[@id='day']",dobDate);
		return this;
		}
	public FbAccountPage clickOnMonthofBirth() {
		clickByXpath("//select[@id='month']");
		return this;
		
	}
	
	public FbAccountPage clickOnMonthofBirthOption(String dobMonth) {
		selectVisibleTextByXpath("//select[@id='month']",dobMonth);
		return this;
		
	}
	public FbAccountPage clickOnYearofBirth() {
		clickByXpath("//select[@id='year']");
		return this;
		
	}
	
	public FbAccountPage clickOnYearofBirthOption(String dobYear) {
		selectVisibleTextByXpath("//select[@id='year']",dobYear);
		return this;
		
	}
	
	
	public FbAccountPage clickOnGender(String gen) {
		clickByXpath("//label[text()='"+gen+"']");																																																																													
			return this;
		}
		
	public FbAccountPage clickOnSignup() {
		clickByXpath("//button[text()='Sign Up']");																																																																													
			
			return this;
		}
		
	
	public FbAccountPage close() {
		closeAllBrowsers();																																																																												
			
			return this;
		}
	
	
	
	
	
	
	
	
	
	
	
}
