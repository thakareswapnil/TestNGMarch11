package TestNGFeature;

import org.testng.annotations.Test;

public class DependsOnMethod1 {
	
	
	@Test
	public void logintest() {
		System.out.println("logintest");
		int i =10/0;//due to this exception in logintest method this method will fali
		            //below given all method will we be skip by testng .
		           //result
                   //Default test
                  //Tests run: 4, Failures: 1, Skips: 3
	}
	
	@Test(dependsOnMethods = "logintest")
	public void Homepage() {
		System.out.println("Homepage");
		
	}
	@Test(dependsOnMethods = "logintest")
	public void Searchpage() {
		System.out.println("Searchpage");
		
	}
	@Test(dependsOnMethods = "logintest")
	public void Refreshpage() {
		System.out.println("Refreshpage");
		
	}
	
	
	
	
	
	
}
