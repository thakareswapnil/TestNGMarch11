package Parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SimpleDemo {
	
	
	
	@Parameters({"a","b"})
	@Test
	public void sum(int a,int b) {
		System.out.println(a+b);
	}

}
