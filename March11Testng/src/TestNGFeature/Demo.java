package TestNGFeature;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
//	@Test(dependsOnMethods = "b")
//	public void a() {
//
//		System.out.println("aaa");
//
//	}

	@Parameters()
	@Test()
	public void b() {
		
		
	
		//assertTrue(false);
		System.out.println("bbb");
	}

	@Test(groups = "smoke")
	public void d() {
		System.out.println("ddd");
	}

	@Test(groups = "hp")
	public void c() {
		System.out.println("ccc");
	}
//
//	@Test()
//	public void e() {
//		System.out.println("EEE");
//	}

}
