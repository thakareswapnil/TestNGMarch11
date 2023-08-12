package Dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderForFacebook {
	
	WebDriver driver;
	@Test(dataProvider = "logindata")
	public void  loginpage(String email,String password) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

		 driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys(email);
		
		driver.findElement(By.id("pass")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
	}
	
	@DataProvider(name="logindata")
	public Object[][] Logindata() {
		Object [][] data=new Object[2][2];
		
		data[0][0]="swapnilthakare";
		data[0][1]="asdfafd";
		
		data[1][0]="swapnilthakare";
		data[1][1]="asdfafd";
		
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
