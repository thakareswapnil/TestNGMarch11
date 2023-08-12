package TestNGFeature;

import org.testng.annotations.Test;

public class Day2 {
	@Test(groups ="Regression")
	public void Test1() {
		System.out.println("hello");
	}
	
	@Test(groups= {"Regression"},enabled = true)
	public void Test2() {
		System.out.println("Day2--Test2");
	}
	
	@Test(groups = {"smoke"})
	public void Test3() {
		System.out.println("Day2---Test3");
	}
	

}
