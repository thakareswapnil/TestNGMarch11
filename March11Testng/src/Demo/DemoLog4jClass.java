package Demo;

import java.time.Duration;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.log4testng.Logger;



public class DemoLog4jClass {

	public static void main(String[] args) {
		
	Logger logger=Logger.getLogger(DemoLog4jClass.class);
		DOMConfigurator.configure("log4j1.xml");
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
              
		WebDriver driver = new ChromeDriver();
		
		 logger.info("open");

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
		 logger.info("close");

	}

}
