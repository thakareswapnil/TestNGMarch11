package Dataprovider;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class HashMap1WithDataprovider {
	WebDriver driver;
	@BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.facebook.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.xpath("//button[normalize-space()='Log In']")).click();

      //  String actualTitle = driver.getTitle();

       // Assert.a(actualTitle, "Log in to Facebook1", "Incorrect title");
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        HashMap<String, String> loginData = Logindata();
        Object[][] data = new Object[loginData.size()][2];
        int i = 0;
        for (String key : loginData.keySet()) {
            String[] arr = loginData.get(key).split(":");
            data[i][0] = arr[0];
            data[i][1] = arr[1];
            i++;
        }
        return data;
    }

    public static HashMap<String, String> Logindata() {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("A", "shradhha:shradhha123");
        hm.put("B", "suraj:suraj123");
        hm.put("C", "pallavi:pallavi123");
        hm.put("D", "poonam:poonam123");

        return hm;
    }

}
