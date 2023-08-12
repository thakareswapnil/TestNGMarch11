package Parameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Facebook {
	WebDriver driver;
	
	
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://www.facebook.com/");
       
        
	}
	
	
	@Parameters({"email","password"})
    @Test	
	public void LoginPage(String email,String password) {
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
