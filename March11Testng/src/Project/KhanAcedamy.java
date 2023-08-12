package Project;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class KhanAcedamy {
	
	WebDriver driver;
	SoftAssert soft=new SoftAssert();
	@BeforeTest
	public void OpenBrowser() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

		    driver= new ChromeDriver();
		    
		    driver.get("https://www.khanacademy.org/");
		    
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 // Thread.sleep(3000);
		  
	}
	
	@Test(priority=1)
	public void clickonLogin() {
		 driver.findElement(By.xpath("//a[@id=\"login-or-signup\"]")).click();
	}
	
	@Test(priority=2)
	public void Login() throws InterruptedException {
		 driver.findElement(By.xpath("//input[@data-test-id=\"identifier-field\"]")).sendKeys("thakare7587@gmail.com");
		 
		 driver.findElement(By.xpath("//input[@data-test-id=\"password-field\"]")).sendKeys("Venom@456");
		 
		 driver.findElement(By.xpath("//button[@data-test-id=\"log-in-submit-button\"]")).click();
		 
		 
	}
	@Test(priority=3)
	public void Edit() throws InterruptedException {
		Thread.sleep(6000);
		// driver.findElement(By.xpath("//span[@class=\"empty-field pure-hidden-xs\"]")).click();
		driver.findElement(By.xpath("//span[@class=\"_19lfck2n\"]")).click();
		   Thread.sleep(5000);
	}
	
	@Test(priority=4)
	public void ValidateUser() throws InterruptedException {
		  //String ActualName=driver.findElement(By.xpath("//*[@id=\"top-header-container\"]/nav/div/div[3]/div[1]/button/span/span")).getText();
	String username=	driver.findElement(By.xpath("//input[@id=\"nickname\"]")).getText();
		
	String nickname=driver.findElement(By.xpath("//input[@id=\"username\"]")).getText();
	
		    
		    if(username.equals(nickname)) {
		    	
		    	System.out.println("user is correct");
		    }
		    else {
		    	System.out.println("user not is not correct");
		    }
		
		driver.findElement(By.xpath("(//button[@type=\"button\"])[4]")).click();    
		    
	}
	@Test(priority=5)//to print all links present on page
	public void AllLinks() throws InterruptedException 
	{
		driver.findElement(By.xpath("//span[@data-test-id=\"learn-menu-button\"]")).click();
		Thread.sleep(5000);
		List<WebElement>alllinks=driver.findElements(By.xpath("//ul[@class=\"_121xeo4\"]//li"));
	    System.out.println(alllinks.size());
	    for(int i=0;i<alllinks.size();i++) {
	    	System.out.println(alllinks.get(i).getText());
	    }
	    
	    
	    	
	 }
	
	@Test(priority=6)
	public void SelectClass() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Class 5')]")).click();
		String actualClasName=driver.findElement(By.xpath("//h1[@data-test-id=\"unit-block-title\"]")).getText();	
		 
		String expectedClassName="Class1 5 math (India)";
		
		//hard assertion
	//	assertEquals(actualClasName, expectedClassName);//if it is true then following code will run 
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@role=\"button\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class=\"_1lrvdlvw\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"input-with-examples-bnVtZXJpYy1pbnB1dCAx\"]")).sendKeys("561");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@data-test-id=\"exercise-check-answer\"]")).click();
		
		String massage=driver.findElement(By.xpath("//div[@role=\"alert\"]")).getText();
		System.out.println(massage);
		
		
		if(massage==("Not quite!\r\n"+ "Try again, Get help, or skip for now.")) {
			System.out.println("some is incorrect");
		}
		else {
			System.out.println("some is correct");
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	

//	public void TearDown() {
//		driver.close();
//	}
	}

