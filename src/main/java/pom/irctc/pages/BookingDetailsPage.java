package pom.irctc.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class BookingDetailsPage extends GenericWrappers {
	
	
	
	
	public BookingDetailsPage(RemoteWebDriver driver,ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
	}
	public BookingDetailsPage switchToBookingdetail() {
		
	switchToLastWindow();
		return this;
	}
	
	public BookingDetailsPage clickOnTitle(String num) {
		selectVisibleTextByXpath("//select[@name='title']", num);
	
		return this;
	}
	
	public BookingDetailsPage enterFirstName(String fname) {
		enterByXpath("//input[@name='firstName']", fname);
	
		return this;
	}
	public BookingDetailsPage enterLastName(String lname) {
		enterByXpath("//input[@name='lastName']", lname);
	
		return this;
	}
	public BookingDetailsPage clickOnState(String state) {
		selectVisibleTextByXpath("//select[@name='state']", state);
	
		return this;
	}
	public BookingDetailsPage clickOnGST(String Yes) {
		selectVisibleTextByXpath("//select[@name='gst']", Yes);
	
		return this;
	}
	
	public BookingDetailsPage enterGSTNum(String number) {
		enterByXpath("//input[@name='gstNumber']", number);
	
		return this;
	}
	public BookingDetailsPage enterCompanyName(String data) {
                enterByXpath("//input[@name='companyName']", data);
	
		return this;
	}
	public BookingDetailsPage enterCompanyAddress(String data) {
		enterByXpath("//input[@name='companyAddress']", data);
	
		return this;
	}
	
	
	
	
	
	
	public  BookingDetailsPage getHotelName(String data) {
		
		String hotelname =  getTextByXpath("//h5[text()='"+data+"']");
		
		return this ;
	}
	
   public  BookingDetailsPage getHotelPrice() {
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   String hotelPrice = getTextByXpath("//*[contains (@class, 'standard-price')]/div/div[2]/strong");
		
		
		return this;
	}
	
	public  BookingDetailsPage compareHotelName(String xpath,String hotelname) {
		
		 verifyTextByXpath("//div[@class='mid-searchpack']",hotelname);
		
		return this;
	}
	public  BookingDetailsPage verifyHotelPrice(String hotelprice) {
		
		verifyTextByXpath("//div[contains(@class,'faredetails-in-total')]/strong",hotelprice);
		
		return this ;
	}
	
	public MakePaymentPage clickOnContinue() {
		clickByXpath("//button[text()='Continue']");
	
		return new MakePaymentPage(driver,test);
	}
	
	public BookingDetailsPage clickContinue() {
		clickByXpath("//button[text()='Continue']");
	
		return this;
	}
	public BookingDetailsPage verifyGSTmessage() {
		verifyTextByXpath("//span[text()='Please Enter Valid GSt number']","Please Enter Valid GSt number");
		return this;
	}
	
	
	

	public BookingDetailsPage waitforsometime() {
		// TODO Auto-generated method stub
		return this;
	}


	public BookingDetailsPage close() {
		closeAllBrowsers();
			
			return this;
		}
	
	

}
