package wrappers;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ProjectWrappers extends GenericWrappers {

public String browserName;
public String url;

	
@BeforeSuite	
public void beforesuite() {
startReport();
}
@BeforeTest	
public void beforeTest() {
	//reserved
	
}

@BeforeMethod
public void beforeMethod() {
startTest(testCaseName, testCaseDescription);
invokeApp(browserName,url);

}
@AfterMethod
public void AfterMethod() {
closeAllBrowsers();	
}
@AfterClass
public void AfterClass() {
	endTest();
}	
@AfterTest	
public void AfterTest() {
	//reserved
}
@AfterSuite
public void AfterSuite() {
	endReport();	
	}
	
	
	
	
	
	
}
