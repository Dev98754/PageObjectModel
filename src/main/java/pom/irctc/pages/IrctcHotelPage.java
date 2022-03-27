package pom.irctc.pages;


import org.openqa.selenium.remote.RemoteWebDriver;


import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcHotelPage extends GenericWrappers {
	
public IrctcHotelPage(RemoteWebDriver driver,ExtentTest test) {
	this.driver = driver;
	this.test = test;
}

	
public LoginPage clickOnLogin() {


	clickByXpath("//a[text()='Login']");
	
	return new LoginPage(driver,test);
}
	
public IrctcHotelPage switchToIRCTC() {
	
	
	switchToLastWindow();	
		
		return this;
	}
	public IrctcHotelPage enterCityName(String data) {
		
		
	enterByXpath("//input[@id='filterText']", data);	
		
		return this;
	}
	
	public IrctcHotelPage clickOnCityOption() {
		
		
		clickByXpath("//div[@class='left_city']");	
			
			return this;
		}
	
	
public IrctcHotelPage clickOncheckInDate() {
		
		
		clickByXpath("//input[@name='dt12']");	
			
			return this;
		}
	
	
public IrctcHotelPage clickOncheckInDateOption(String date) {
	
	
	clickByXpath("//span[text()='"+date+"']");	
		
		return this;
	}
	
public IrctcHotelPage clickOncheckOutDate() {
	
	
	clickByXpath("//input[@name='dt13']");	
		
		return this;
	}


public IrctcHotelPage clickOncheckOutDateOption(String date) {


clickByXpath("//span[text()='"+date+"']");	
	
	return this;
}

public IrctcHotelPage clickOnRoomGuest() {
	
	clickByXpath("//input[@id='user-data-wrapper-id']");
	return this;
}
	
	
public IrctcHotelPage clickOnRoomOptions(String data) {
	
	selectVisibleTextByXpath("//select[@name='hotelRoom']",data);
	return this;
}	
	
	
public IrctcHotelPage clickOnAdultoptions(String data) {
	
	selectVisibleTextByXpath("//select[@name='hotelAdult']",data);
	return this;
}	

public IrctcHotelPage clickOnChildrenoptions(String data) {
	
	selectVisibleTextByXpath("//select[@name='hotelChild']",data);
	return this;
}	

public IrctcHotelPage clickOnDone() {
	
	clickByXpath("//button[text()='Done']");
	return this;
}



public BookHotelPage clickOnFindHotel() {
	
	clickByXpath("//button[text()='Find Hotel ']");
	return new BookHotelPage(driver,test) ;
}



















	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
