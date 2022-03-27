package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class ContinueBookPage extends GenericWrappers {

	
	public ContinueBookPage (RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test =test;
		
	}
	
	
	public ContinueBookPage switchToContinuebook() {
		
		switchToLastWindow();
		return this;
	}
	
public  ContinueBookPage getNameofHotel(String xpath) {
	
	 getTextByXpath("//div[@class='mid-searchpack']");
	
	return this;
}



public  ContinueBookPage getPriceofHotel(String xpath) {
	
	
	 getTextByXpath("//*[contains (@class,'standard-price')]/div/div[2]/strong");
	
	return this;
}	

	
public  BookingDetailsPage clickOnContinuetoBook() {
	
	 clickByXpath("//button[@class='btn btn-radius-none yellow-gradient my-2']");
	
	return new BookingDetailsPage(driver,test) ;
}	

	
	
}
