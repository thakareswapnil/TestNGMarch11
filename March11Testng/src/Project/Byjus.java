package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Byjus {

	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void Setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	@Test
	public void profile() throws InterruptedException {

		driver.get("https://byjus.com/learn/account/login");

		driver.findElement(By.xpath("//input[@placeholder=\"Enter your mobile number\"]")).sendKeys("8888119573");

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		Thread.sleep(10000);

		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();

		Thread.sleep(5000);

		/*
		 * //driver.findElement(By.xpath("(//span[contains(text(),'9th Grade')])[1]")).
		 * click(); //Thread.sleep(2000); driver.findElement(By.
		 * xpath("//img[@class=\"d-none d-md-block nav-arrow-desktop\"]")).click();
		 * Thread.sleep(2000);
		 * 
		 * //my profile
		 * driver.findElement(By.xpath("//span[contains(text(), \"My profile\")]")).
		 * click(); Thread.sleep(2000);
		 * 
		 * //validating the first name String Name =
		 * driver.findElement(By.xpath("//input[@aria-label=\"fullName\"]")).getText();
		 * System.out.println(Name); String actualName = "Swapnil";
		 * if(Name.equals(actualName)) { System.out.println("Name is correct"); } else {
		 * System.out.println("Name is Incorrect"); }
		 * 
		 * //driver.findElement(By.xpath("//input[@aria-label=\"email\"]")).sendKeys(
		 * "bothalepallu@gmail.com"); //Thread.sleep(7000); // //click on calender
		 * driver.findElement(By.xpath("//input[@name=\"date_of_birth\"]")).click();
		 * Thread.sleep(3000);
		 * 
		 * // Select the Month WebElement month = driver.findElement(By.xpath(
		 * "//select[@class=\"react-datepicker__month-select\"]")); Select SC3 = new
		 * Select(month); SC3.selectByVisibleText("April"); Thread.sleep(3000);
		 * 
		 * // Select the Year WebElement year = driver.findElement(By.xpath(
		 * "//select[@class=\"react-datepicker__year-select\"]")); Select SC4 = new
		 * Select(year); SC4.selectByVisibleText("1996"); Thread.sleep(2000);
		 * 
		 * // Select the day
		 * driver.findElement(By.xpath("//div[contains(text(),\"10\")]")).click();
		 * Thread.sleep(3000);
		 * 
		 * // Using the Action class we can select the Gender Actions act = new
		 * Actions(driver); WebElement gender =
		 * driver.findElement(By.xpath("//input[@id=\"react-select-3-input\"]"));
		 * act.click(gender); act.sendKeys("Female").perform();
		 * act.sendKeys(Keys.ENTER).perform();
		 * 
		 * Thread.sleep(3000); // Using the same Action class act(Ref Variable) we can
		 * select the city name WebElement city =
		 * driver.findElement(By.xpath("//input[@id=\"react-select-4-input\"]"));
		 * act.click(city); act.sendKeys("Pune"); act.sendKeys(Keys.ENTER).perform();
		 * 
		 * 
		 * // Selecting the avatar
		 * 
		 * driver.findElement(By.xpath(
		 * "//img[@src=\"https://learn-assets.byjusweb.com/images/profile/edit.png\"]"))
		 * .click(); Thread.sleep(5000);
		 * 
		 * driver.findElement(By.xpath("(//img[@alt=\"profile icon\"])[4]")).click();
		 * Thread.sleep(3000);
		 * 
		 * // Save Button
		 * driver.findElement(By.xpath("//button[text()=\"Save\"]")).click();
		 * Thread.sleep(5000);
		 */

	}

	@AfterMethod

	public void End() throws InterruptedException {

		Thread.sleep(5000);

	}
}
