package Parameterization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParameter {//if user did not provide any parameter in the xml file to field 
	                            //then it will
	
	WebDriver driver;
	@Parameters("browserName")
	@BeforeTest
	public void openbrowser(String browsername){
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
			
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        
	}
	
	@Parameters("URl")
	@Test
	public void Url(@Optional("https://www.facebook.com/") String url) {
		driver.get(url);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
