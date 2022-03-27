package utils;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
@Test
	public void generateReport() {
		
		//start report
	           ExtentReports report =    new ExtentReports("./reports/Result.html");
	           
	           //start test
	           ExtentTest test = report.startTest("TC001","to verify irctc registration");
	           test.assignAuthor("Mercy");
	           test.assignCategory("Functional");
	           
	           //log test steps
	           test.log(LogStatus.PASS, " The application got launched with the url succesfully");
	           test.log(LogStatus.FAIL, " The application didnot launch with the url succesfully");
	           test.log(LogStatus.PASS, " The application got launched with the url succesfully");
	           test.log(LogStatus.PASS, " The application got launched with the url succesfully");
	           test.log(LogStatus.PASS, " The application got launched with the url succesfully");
	           test.log(LogStatus.PASS, " The application got launched with the url succesfully");
	           test.log(LogStatus.PASS, " The application got launched with the url succesfully");
	           test.log(LogStatus.PASS, " The application got launched with the url succesfully");
	           test.log(LogStatus.PASS, " The application got launched with the url succesfully");
	           test.log(LogStatus.PASS, " The application got launched with the url succesfully");
	           test.log(LogStatus.PASS, " The application got launched with the url succesfully");
	           test.log(LogStatus.PASS, " The application got launched with the url succesfully");
	           //end test
	           
	           report.endTest(test);
	           //end Report
	           report.flush();
	           
	
		
	}

}
