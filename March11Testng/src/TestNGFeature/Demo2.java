package TestNGFeature;

import org.testng.annotations.Test;

public class Demo2 {
	@Test(groups = "smoke")
	public void e() {
		
		
		System.out.println("eee");
	}

	@Test(groups = "hp")
	public void f() {
		System.out.println("fff");
	}

}
