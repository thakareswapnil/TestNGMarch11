package Project;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Byjus2 {
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeTest
	public void Setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(
				"https://byjus.com/byjus-classes-book-free-60-mins-class/?utm_source=google&utm_mode=CPA&utm_campaign=K10-IN");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	@Test
	public void ValidateClass() throws InterruptedException {

		// scroll till the list box
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement element = driver.findElement(By.xpath("(//h2[@class=\"section-title\"])[3]"));

		System.out.println(element.getText());

		js.executeScript("arguments[0].scrollIntoView(true);", element);
		// list box for select the class
		WebElement std = driver.findElement(By.xpath("//select[@class=\"form-control video-selection\"]"));

		driver.findElement(By.xpath("//option[@value=\"5\"]")).click();
//		Select select = new Select(std);
//		select.selectByVisibleText("Class 6");
//		Thread.sleep(4000);

		String actualclass = std.getText();
		System.out.println(actualclass);
		String expectedclass = "Class 5";

		// assertEquals(actualclass, expectedclass);
		if (actualclass.equals(expectedclass)) {
			System.out.println("it is a write class");
		} else {
			System.out.println("it is wrong class");
		}

		//for clas 5
		driver.findElement(By.xpath("(//a[@class=\"video-thumbnail\"])[3]")).click();
		
//for class 6		driver.findElement(By.xpath("(//a[@class=\"video-thumbnail\"])[5]")).click();

		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[@class=\"close\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"close\"]")).click();
	}

}
