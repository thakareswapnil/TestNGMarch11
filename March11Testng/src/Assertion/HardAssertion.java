package Assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class HardAssertion {

	@Test
	public void Demo() {
		System.out.println("hello Bhailog");

		assertTrue(true);// pass

		System.out.println("hello public ");

		assertFalse(false);// pass

		assertEquals(false,true );// if this fail line below this will not execute

		System.out.println("by by public");
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
