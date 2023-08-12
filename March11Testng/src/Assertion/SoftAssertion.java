package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	SoftAssert soft = new SoftAssert();

	@Test
	public void Demotest() {
		
		
		
		System.out.println("chaliye program shuru karte hai");
		
		soft.assertEquals("welcome", "welcome");//false still program will run and give output
		                                       //because in soft assertion if condition failed
		                                      //remaining program will execute.
		
		//soft.assertEquals(true, true);
		
		System.out.println("completed");
		
	  soft.assertAll();// this will show failed assertion
		                
	}
	@Test
	public void Demo() {
		// SoftAssert soft=new SoftAssert();
		System.out.println("hiii");

		soft.assertEquals("welcome", "welcome");

		soft.assertEquals(true, false);// false

		System.out.println("jai shreem ram");

		soft.assertAll();

	}
	
	
	
	
	
	
	
	

}
