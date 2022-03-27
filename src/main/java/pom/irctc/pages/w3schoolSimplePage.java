package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class w3schoolSimplePage extends GenericWrappers {
	
	
	public w3schoolSimplePage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	
	
	
	public SimpleAlertFramePage switchtoframe() {
		
		switchToframeid("iframeResult");
		return new SimpleAlertFramePage(driver,test);
	}
	
	
	public w3HomePage clickOntryHome() {
		
		clickByXpath("//a[@id='tryhome']");	
			return new w3HomePage() ;
		}


}
