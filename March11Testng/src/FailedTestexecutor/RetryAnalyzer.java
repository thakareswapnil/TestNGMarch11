package FailedTestexecutor;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	int count =0;  //failed
	int Retrylimit =4; //pass
	@Override
	public boolean retry(ITestResult result) {
          
		if(count<Retrylimit) {
			count++;  
			return true;
		}
		
		return false;
	}

	
}
