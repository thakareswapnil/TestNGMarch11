package Demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Demo_Testng_Annotaions {
	@BeforeSuite
	  public void Setup() {
		  System.out.println("@BeforeSuite--setup systemproperty");
		  
	  }
	@BeforeTest
	  public void URL() {
		System.out.println("@BeforeTest--->Entert URL");
	  }
	 @BeforeClass
	  public void Launchbrowser() {
		 System.out.println("@BeforeClass-->Launchbrowser");
	  }
	 @BeforeMethod
	   public void Login()
	   {System.out.println("\"@BeforeMethod--->login application\");");
	 
	  }
	 @Test
	  public void GoogleTitle1() {
		 
		 System.out.println("@test--->googletitle1");
		  }
  
	 @Test
	  public void facebooktitle() {
		 
		 System.out.println("@test--->facebook");
		  }

  @AfterMethod
  public void Logout() {
	   System.out.println("\"@afterMethod--->logout application\");");
	 
	  }
	  
  
  @AfterClass
  public void closebrowser() {
	  System.out.println("@afterclass-->close browser");
	  
  }

  

  @AfterTest
  public void deletecookies() {
	  System.out.println("@aftertest-->deletecookies");
  }

  

  @AfterSuite
  public void logout1() {
	  System.out.println("@aftersuite--->logout1");
  }

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
