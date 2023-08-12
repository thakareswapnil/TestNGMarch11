package Demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class CrossBrowser2 {
//Firefox,gecko
	WebDriver driver;

	@Parameters("Browsername")
	@Test
	public void OpenBrowser1(String Browsername) {
		if (Browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (Browsername.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

			driver = new EdgeDriver();

//		} else if (Browsername.equalsIgnoreCase("Edge")) {
//			System.setProperty("webdriver.edge.driver",
//				"C:\\Users\\HP\\OneDrive\\Desktop\\Testin\\Automation Testing\\installetion\\Microsoft Edge\\edgedriver_win64.edgedriver.exe");
//
//			driver = new EdgeDriver();
//
//		}

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");

		driver.findElement(
				By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]"))
				.click();

	}

	}}
