package Parameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Orangehrm {
	WebDriver driver;
	
	@BeforeClass
	public void openbrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        
	}
	@Parameters("url")
	@Test
	public void URL(String url) {
		driver.get(url);
	}

	@Parameters({"Username","Password"})
	@Test
	public void EnterLogin_Details(String username,String password)  {
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        
	}
	
//	@Test
//	public void NevigateToMyinfo() throws InterruptedException {
//		
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[6]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@Test
//	public void MyinfoCheck() {
//		String name=driver.findElement(By.xpath("//h6[@class=\"oxd-text oxd-text--h6 --strong\"]")).getText();
//	    System.out.println(name);
//	}
//	
	
	
	@AfterClass
	public void Teardown() {
		driver.close();
	}
	
	
	

}
