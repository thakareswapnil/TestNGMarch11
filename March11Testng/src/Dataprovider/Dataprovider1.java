package Dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider1 {
	
	WebDriver driver;
	
	@Test(dataProvider = "Logindata")
	public void Logintest(String Uname,String PWd) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

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
	
	@DataProvider(name="Logindata")
	public Object[][] LoginData(){
		Object data[] []=new Object[5][2];
		
		//correctUN and CorrectPWD
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		//correctUN & incorrectPWD
		data[1][0]="Admin";
		data[1][1]="admin12";
		
		//incorrectUN & correctPWD
		data[2][0]="Admin1";
		data[2][1]="admin123";
		
		//incorrectUN & incorrectPWD
		data[3][0]="Admin1";
		data[3][1]="admin1233";
		
		//emptyUN & correctPWD
		data[4][0]=" ";
		data[4][1]="admin123";
		return data;
		
		
		
	}

}
