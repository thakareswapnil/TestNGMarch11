package TestNGFeature;

import org.dataloader.Try;
import org.testng.annotations.Test;

public class ExpectedExecption1 {
	                         //this is for praticular exception
	@Test(expectedExceptions = ArithmeticException.class)//to handle the exception we have to write 
	                                                     // exception name.class
	
	//	@Test(expectedExceptions = Exception.class)   this is generic can use in every  exception                                          
	
	public void loigntest() {
			System.out.println("hii");
			
			int i=100/0;//it will give arthmetic exception
			
			System.out.println("jai mata di");//the above test will pass but line no.18 will  not execute
		}
	
		
	}
	//by using try catch also we can handle the exception as like java 
//	try {
//		int i=100/0;
//	} catch (Exception e) {
//		// TODO: handle exception
//	}

