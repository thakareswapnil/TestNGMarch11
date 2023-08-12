package Assertion;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FacebookAssertionExample {
	WebDriver driver;
	@Test
	 public void Setup() throws Throwable {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

	     driver = new ChromeDriver();
	     
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     driver.get("https://www.facebook.com/");
	     
	     driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("asdsdf@gmail.cokm" , Keys.ENTER);
	     //              Keys.ENTER   //this will press the enter key .    
	     
	     Thread.sleep(5000);
	     
	     //softassert
	     SoftAssert soft=new SoftAssert()
;
	     //title assertion
	      String actualtitle=driver.getTitle();
	      String expectedtitle="Log in to Facebook";
	     
	     soft.assertEquals(actualtitle, expectedtitle,"title is mismatch");
	     
	     //URL assertion
	     
	     String actualurl=driver.getCurrentUrl();
	     String expectedurl= "https://www.facebook.com/";
	     
	     soft.assertEquals(actualurl, expectedurl,"url is mismatch");
	     
	     
	     //text assertion
	     String actualtext=driver.findElement(By.xpath("//input[@name=\"email\"]")).getAttribute("value");
	      System.out.println(actualtext);
	     
	     
	     
	     
	     
	     
	     
	     
	 }
	 

}
