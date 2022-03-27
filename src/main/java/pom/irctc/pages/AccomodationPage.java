package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AccomodationPage extends GenericWrappers {
	
	public AccomodationPage(RemoteWebDriver driver,ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
	}
	public AccomodationPage switchToAccomodation() {
		switchToLastWindow();
	
		return this;
		
	}
	
	public MenuPage clickOnMenu() {
		clickByXpath("//*[@id='sidebarCollapse']");
		return new MenuPage(driver,test); 
	}
	
	public IrctcHotelPage clickOnHotel() {
		clickByXpath("//span[text()='Hotels']");
		
		return new IrctcHotelPage(driver,test);
	}
	
	
	
	public AccomodationPage closeMenu() {
		clickByXpath("//*[@id='dismiss']");
		return this;
	}





	
	
	

}
