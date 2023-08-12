package Dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DPwithExcelSheet {
 WebDriver driver;
	
 @Test(dataProvider = "logindata",dataProviderClass =Exceldata.class)
  public void OrangeHrm(String username,String password) {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

	    driver= new ChromeDriver();
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 // Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
	    
	    driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
	    
	    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	  
  }
	
	
	
	
}
