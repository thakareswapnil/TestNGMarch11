package TestNGFeature;

import org.testng.annotations.Test;

public class Timeout {

	@Test(timeOut =3000)//The timeOut attribute in TestNG is used to determine the maximum time permitted 
                       //for a test method to execute. If the test method takes longer than the given time, 
                        //	TestNG will label it as a failed test and terminate the execution.  
                       //	The value of the timeout attribute defines in milliseconds.
	
	
	public void loigntest() {
		for(; ;) {//this is infinite for loop to stop this loop 
			      // we have to add timeout of 10000(10 second )
			      //so this for loop will stop after given time
			System.out.println("hii");
		}
	}
	
}
