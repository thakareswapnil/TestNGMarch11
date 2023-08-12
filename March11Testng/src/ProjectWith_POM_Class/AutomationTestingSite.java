package ProjectWith_POM_Class;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationTestingSite {

	WebDriver driver;
	

	@SuppressWarnings("deprecation")
	@BeforeTest
	public void Loginpage() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("https://demo.automationtesting.in/Register.html");

	}

	@Test
	public void RegisterPage() {
		Actions action=new Actions(driver);
		assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Register')]")).isDisplayed());

		driver.findElement(By.xpath("//h2[contains(text(),'Register')]")).isDisplayed();

		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("swapnil");
      
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("thakare");
		
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("Murbad,Dist-Thane");
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("thakare789@gmail.com");
		
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("thakare789@gmail.com");
		
		WebElement gender=driver.findElement(By.xpath("//input[@type=\"radio\"]"));
		
		action.click(gender).perform();
		
		WebElement hobbies=driver.findElement(By.id("checkbox1"));
		
		action.click(hobbies).perform();
		
		driver.findElement(By.id("msdd")).sendKeys("Marathi");
		

	}

}


















