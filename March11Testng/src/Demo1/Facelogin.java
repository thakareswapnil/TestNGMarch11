package Demo1;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facelogin {
	WebDriver driver;
	
	
	@Test(dataProvider = "logindata")
	public void Loginpage(){
		
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://www.facebook.com/");
	
	String Name =Logindata().get("B");

	String arr[] = Name.split(":");

	driver.findElement(By.id("email")).sendKeys(arr[0]);

	driver.findElement(By.id("pass")).sendKeys(arr[1]);

	driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	}

	@DataProvider(name="Logindata")
		public static HashMap<String, String> Logindata() {

			HashMap<String, String> hm = new HashMap<String, String>();
			hm.put("A", "Ketan:Ketan123");
			hm.put("B", "Akash:Akash123");
			hm.put("C", "swapnil:swapnil123");
			hm.put("D", "thakare:thakare123");
			
			return hm;
		}
}
