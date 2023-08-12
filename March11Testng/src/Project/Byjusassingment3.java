package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Byjusassingment3 {
	WebDriver driver;

	@BeforeMethod
	public void Setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://byjus.com/btc/");
		
		Thread.sleep(15000);
		driver.findElement(By.xpath("(//button[@class=\"close\"])[2]")).click();
		
	}

	@Test
	public void Boolsession() throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		
		
		
		driver.findElement(By.id("home-btn")).click();

		driver.findElement(By.xpath("//input[@id=\"name-input\"]")).sendKeys("swapnil thakare");

		driver.findElement(By.xpath("//input[@placeholder=\"Mobile Number\"]")).sendKeys("8888119573");
		
		//options.addArguments("--disable-notification");
		
	//WebElement popup=	driver.findElement(By.xpath("//img[@id=\"register-popup-widget\"]"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'×')]")).click();

		driver.findElement(By.xpath("//button[@class=\"otp-btn\"]")).click();

		Thread.sleep(20000);

		WebElement city = driver.findElement(By.id("formCity"));
		city.click();
		Select select = new Select(city);
		select.selectByValue("Ambala");
		Thread.sleep(3000);

		
		WebElement center = driver.findElement(By.id("formCenter"));
		center.click();
		Select select1 = new Select(center);
		select1.selectByValue("344");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@id=\"class-five\"]")).click();

		driver.findElement(By.xpath("//button[@class=\"btn modal-form-submit-btn\"]")).click();

	}

}
