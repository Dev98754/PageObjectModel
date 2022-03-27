package pom.irctc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class CovidAlertPage extends GenericWrappers {
	
	public CovidAlertPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver= driver;
		this.test = test;
		
		
		
	}
	
	public HomePage clickOnOk() {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='OK']"))).click();
		
	
		return  new HomePage(driver,test);
		
	}

}
