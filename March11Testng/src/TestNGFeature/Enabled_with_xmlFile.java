package TestNGFeature;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Enabled_with_xmlFile {//total test 5 enabled =true-->3 this will executed 
	                   //             enabled flase--->2 this will not 
                        //result will be like this 
                       //	Default test
                       //    Tests run: 3, Failures: 0, Skips: 0
	WebDriver driver;
	@BeforeClass
	public void Setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("hii");
		
	}
	@Test
	public void B() {
		boolean logo1=driver.findElement(By.xpath("//img[@src=\"/web/images/ohrm_branding.png?v=1683010990518\"]")).isDisplayed();
		
		System.out.println(logo1);
		System.out.println("bbbb");
	}

	@Test()

	public void A() {
    System.out.println("aaa");
		
	}
	
	@Test()
	public void Test1() {
		
		System.out.println("Test1");
	}
	
	
	@Test()
	public void Test2() {
		System.out.println("Test2");
	}
	
	@Test()
	public void Test3() {
		System.out.println("Test3");
	}
	
	
	@AfterClass
	
	
	public void Teardown() throws InterruptedException {
		//Thread.sleep(4000);
		System.out.println("teardown");
		driver.quit();
		
	}
	

}


