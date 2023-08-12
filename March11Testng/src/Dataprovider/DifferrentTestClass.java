package Dataprovider;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DifferrentTestClass {
WebDriver driver;
	
	@Test(dataProvider = "Logindata",dataProviderClass = Dataprovider.DifferrentDataProvider.class)
	public void Logintest(String Uname,String PWd) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

		 driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement Username=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		
		Username.sendKeys(Uname);
		
		WebElement Password=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		Password.sendKeys(PWd);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	
	
	
	
	
	
	
	
	
}
