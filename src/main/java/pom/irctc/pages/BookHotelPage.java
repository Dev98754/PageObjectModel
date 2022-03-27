package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class BookHotelPage extends GenericWrappers {

public BookHotelPage (RemoteWebDriver driver,ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
	}
	
public BookHotelPage switchToBookHotel() {
	switchToLastWindow();
	return this;
}
	
	
public ContinueBookPage clickOnFirstHotelDisplayed() {
		
		clickByXpath("//div[@class='mid-searchpack']");
		return new ContinueBookPage(driver,test);
	}
		

	
	

	
	
	
	
}
