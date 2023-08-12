package TestNGFeature;

import org.testng.annotations.Test;

public class Invocationcount {
	
	
	//this Invocationcount is like for loop. given number of time will execute the test case
	@Test(invocationCount = 5)
	public void Loginpage() {
		
		System.out.println("this is login page");
	}
	
	@Test(invocationCount = 2)
	public void Logout() {
		
		System.out.println("this is logout page");
	}

}
