package Assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import graphql.Assert;

//hard assertation is throw execption instantly after failure of assertation and does not execute below code


public class Assertaion1 {
	WebDriver driver;
	 @BeforeMethod
	 public void Setup() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

	     driver = new ChromeDriver();
	     
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 }
	 
	 
	 @Test
	 public void LoginOrangeHRM() {
		 
	WebElement username=driver.findElement(By.xpath("//input[@name=\"username\"]")); 	 
	WebElement password=driver.findElement(By.xpath("//input[@name=\"password\"]"));
	
	
	//Assertrue
	Assert.assertTrue(username.isDisplayed());//this asserttrue condition is true then only it will enter username .
	username.sendKeys("Admin");
	
	assertTrue(password.isDisplayed());
	password.sendKeys("admin123");
	
	//Assertfalse
	assertFalse(username.isDisplayed());//this assertation will faile beacuse we write false but condition is 
	                                    //true.
	                                    //FAILED: Assertion.Assertaion1.LoginOrangeHRM
                                    //java.lang.AssertionError: expected [false] but found [true]
	username.sendKeys("Admin");
	
	assertFalse(password.isDisplayed());
	password.sendKeys("admin123");
	
	
   //   assertSame(username, password);
	//FAILED: Assertion.Assertaion1.LoginOrangeHRM
   //   java.lang.AssertionError: expected [[[ChromeDriver: chrome on WINDOWS (36f1def3037092982becf7533936dc16)] -> xpath: //input[@name="password"]]] but found [[[ChromeDriver: chrome on WINDOWS (36f1def3037092982becf7533936dc16)] -> xpath: //input[@name="username"]]]
	 
      
      boolean test=driver.findElement(By.xpath("//button[@type=\"submit\"]")).isDisplayed();
      assertEquals(test, true);
      
      System.out.println("end of the world");//this will print beacuse above condition is true and we write 
                                             //true --->assertEquals(test, true);
      
      ////this will not print beacuse above condition is true and we write 
      //false --->assertEquals(test, false);
      
      
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
