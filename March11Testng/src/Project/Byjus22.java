package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Byjus22 {
	WebDriver driver;

	@Test
	public void Offline() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("https://byjus.com/");

		driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("swapnil thakare");

		driver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys("8888119573");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@class=\"btn\"]")).click();

		Thread.sleep(15000);

		//Actions action = new Actions(driver);
       
		WebElement state = driver.findElement(By.xpath("//select[@name=\"state\"]"));

		//action.click(state).sendKeys("Maharashtra").perform();

		Thread.sleep(5000);

		Select sl = new Select(state);
		 sl.selectByValue("Maharashtra");

		 
		 Thread.sleep(5000);
		WebElement grade = driver.findElement(By.xpath("(//select[@class=\"form-control\"])[2]"));
		grade.click();
		Select sl1 = new Select(grade);

		sl1.selectByVisibleText("Class 5");

		// action.click(grade).sendKeys("Class 5").perform();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@id='ftcOfflineScheduleClass']")).click();
		
		Thread.sleep(5000);
		
		WebElement city=driver.findElement(By.xpath("(//select[@class=\"form-control\"])[5]"));
		city.click()
;		Select sl2 = new Select(city);

        sl2.selectByVisibleText("Thane");
        
        Thread.sleep(5000);
        
        WebElement center=driver.findElement(By.xpath("//select[@name=\"center-offline\"]"));
        center.click();
        Select sl3 = new Select(center);
        sl3.selectByVisibleText("Thane-Kasarvadavli");
        Thread.sleep(2000);
        WebElement data=driver.findElement(By.xpath("//input[@min=\"2023-07-12\"]"));
        data.click();
        
        
        Thread.sleep(2000);
        WebElement slot=driver.findElement(By.xpath("//select[@name=\"slot-offline\"]"));
        slot.click();
        Thread.sleep(2000);
        Select sl5 = new Select(slot);
        sl5.selectByVisibleText("12 PM - 2 PM");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id=\"schedule-offline-session-btn\"]")).click();
        
        
        
        
        
        
        
        
        
        
        
        
        
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
