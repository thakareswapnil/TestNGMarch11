package Demo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.asynchttpclient.netty.ws.NettyWebSocket;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class MultipleWindowHandle {
   WebDriver driver;
   @Test
	public void window() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

	driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String parentid = driver.getWindowHandle();
		System.out.println(parentid);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[@href=\"https://www.linkedin.com/company/orangehrm/mycompany/\"]")).click();

		driver.findElement(By.xpath("//a[@href=\"https://www.facebook.com/OrangeHRM/\"]")).click();

		driver.findElement(By.xpath("//a[@href=\"https://twitter.com/orangehrm?lang=en\"]")).click();

		driver.findElement(By.xpath("//a[@href=\"https://www.youtube.com/c/OrangeHRMInc\"]")).click();

		Set<String> links = driver.getWindowHandles();
		List<String> handle=new ArrayList<String>(links);
		
		findwindow("OrangeHRM | LinkedIn",handle);
		
	}

	public void findwindow(String windowname, List<String> handle) {

		for (String e : handle) {
             String name=driver.switchTo().window(e).getTitle();
			if(name.contains(windowname)) {
				System.out.println("right window");
				
//				WebDriver mainid=driver.switchTo().window(e);
//				System.out.println(mainid);
				driver.switchTo().window(name);
			}
			else {
				System.out.println("wrong window");
			}
			
		
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
