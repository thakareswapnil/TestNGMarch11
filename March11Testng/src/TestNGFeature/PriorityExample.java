package TestNGFeature;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityExample {
	
	WebDriver driver;
	@BeforeMethod
	public void Setup() {//1,2,-1,0 if this is proority then -1 will execute first
		                          //then 0,1,2 and default priority is 0 always 
		                          
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@Test(priority=1)
	public void c() {
		String Title1=driver.getTitle();
		System.out.println(Title1);
		System.out.println("cccc");
	}
	
	@Test
	public void b() {
		boolean logo1=driver.findElement(By.xpath("//img[@src=\"/web/images/ohrm_branding.png?v=1683010990518\"]")).isDisplayed();
		
		System.out.println(logo1);
		System.out.println("bbbb");
	}
	@Test
	public void a() {
//    driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
//    driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
//    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    System.out.println("aaa");
		
	}
	@Test(priority=-2)
	public void d() {
		System.out.println("DDDDDD");
	}
	@Test
	public void e() {
		System.out.println("EEEE");
	}
	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
