package FailedTestexecutor;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Demo2 {
	@Test
	public void Test5()
	{
		System.out.println("Test 5");
		assertEquals(false, true);//failed
	}
	
	//@Test(retryAnalyzer = FailedTestexecutor.RetryAnalyzer.class)
	@Test
	public void Test6()
	{
		System.out.println("Test 6");
		assertEquals(true, true);//true
	}
}
