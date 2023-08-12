package TestNGFeature;

import org.testng.annotations.Test;

public class Day1 {
	@Test
	public void Test1() {
		
		System.out.println("hello");
	}
	@Test(groups= {"smoke"})
	public void Test5() {
		System.out.println("Day 1---Test5");
	}

}
