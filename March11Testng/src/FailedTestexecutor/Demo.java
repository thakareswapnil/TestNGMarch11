package FailedTestexecutor;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo {
    SoftAssert soft=new SoftAssert();
	//@Test(retryAnalyzer = FailedTestexecutor.RetryAnalyzer.class)
	@Test
	public void Test1() {
		System.out.println("Test 1");
		//assertEquals(true, false);//failed
		soft.assertEquals(false, true);
		System.out.println("hii1");
		soft.assertAll();
	}
	//@Test(retryAnalyzer = FailedTestexecutor.RetryAnalyzer.class)
	@Test
	public void Test2() {
		System.out.println("Test 2");
		
		assertEquals(false, true);//failed
		System.out.println("hii2");
	}
	//@Test(retryAnalyzer = FailedTestexecutor.RetryAnalyzer.class)
	@Test
	public void Test3() {
		System.out.println("Test 3");
		
		assertEquals(true, true);//true
		System.out.println("hii3");
	}
}
