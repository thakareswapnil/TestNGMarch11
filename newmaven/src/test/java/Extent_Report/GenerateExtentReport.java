package Extent_Report;

import static org.testng.Assert.assertTrue;

import java.io.File;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GenerateExtentReport {
	ExtentReports extent;// specify location of the report
	ExtentTest test;// what details should be populate in the report

	@BeforeTest
	public void startReport() {
		extent = new ExtentReports("C:\\Users\\HP\\git\\TestNGMarch11\\newmaven\\test-output\\MyrReport.html");
		extent.addSystemInfo("Host name", "LocalHost");
		extent.addSystemInfo("Enviroment", "QA");
		extent.addSystemInfo("User name", "Swapnil");
		extent.loadConfig(new File("C:\\Users\\HP\\git\\TestNGMarch11\\newmaven\\extet-config.xml"));
	}

	@Test
	public void demoReportPass() {
		test = extent.startTest("demoReportPass");// This line creates a new test entry in the report with the name
													// "demoReportPass."
		assertTrue(true);
		test.log(LogStatus.PASS, "Assert pass as condition is true");
	}

	@Test
	public void demoReportFail() {
		test = extent.startTest("demoReport");
		assertTrue(false);
		test.log(LogStatus.FAIL, "Assert fail as condition is false");
	}

	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, result.getThrowable());
		}
		extent.endTest(test);
	}

	@AfterTest
	public void endreport() {
		extent.flush();
	}

}
