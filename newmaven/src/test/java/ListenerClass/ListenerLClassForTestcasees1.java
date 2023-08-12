package ListenerClass;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListenerLClassForTestcasees1 extends TestListenerAdapter{
	
	public void onTestStart(ITestResult re) {
		System.out.println("Test Started");
		
	}
	public void onTestSuccess(ITestResult re) {
		System.out.println("Test Success");
		
	}
	public void onTestFailure(ITestResult re) {
		System.out.println("Test failed");
		
	}
	public void onTestSkipped(ITestResult re) {
		System.out.println("Test Skipped");
		
	}
}
