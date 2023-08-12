package ListenerClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestCases1 {
	
	@Test
	public void Test1() {
		System.out.println("first test.....");
		assertTrue(true);
	}
	
	@Test
	public void Test2() {
		System.out.println("Second test.....");
		assertTrue(false);
	}
}
