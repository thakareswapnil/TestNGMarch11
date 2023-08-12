package Demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	
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
	public void c() {
		String Title1=driver.getTitle();
		System.out.println(Title1);
		System.out.println("c");
	}
	
	@Test
	public void b() {
		boolean logo1=driver.findElement(By.xpath("//img[@src=\"/web/images/ohrm_branding.png?v=1683010990518\"]")).isDisplayed();
		
		System.out.println(logo1);
		System.out.println("b");
	}
	@Test
	public void a() {
    String logo1=driver.findElement(By.xpath("//h5[@class=\"oxd-text oxd-text--h5 orangehrm-login-title\"]")).getText();
		
		System.out.println(logo1);
		System.out.println("a");
		
	}
	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
