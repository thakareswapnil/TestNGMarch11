package Practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Orangehrm { 

	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.edge.driver",
			"C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
	
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
	}
	
	@Test(dataProvider="LogData")
	public void loginTest(String user,String pwd)
	{
		
		
		WebElement txtEmail=driver.findElement(By.id("Email"));
		txtEmail.clear();
		txtEmail.sendKeys(user);
		
		
		WebElement txtPassword=driver.findElement(By.id("Password"));
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click(); //Login  button
		
		String exp_title="Dashboard / nopCommerce administration";
		String act_title=driver.getTitle();
		
//		if(exp.equals("Valid"))
//		{
//			if(exp_title.equals(act_title))
//			{
//				driver.findElement(By.linkText("Logout")).click();
//				Assert.assertTrue(true);
//			}
//			else
//			{
//				Assert.assertTrue(false);
//			}
//		}
//		else if(exp.equals("Invalid"))
//		{
//			if(exp_title.equals(act_title))
//			{
//				driver.findElement(By.linkText("Logout")).click();
//				Assert.assertTrue(false);
//			}
//			else
//			{
//				Assert.assertTrue(true);
//			}
//		}
//		
	}
	
	@DataProvider(name="LogData")
	public String [][] getData() throws IOException
	{
		/*String loginData[][]= {
								{"admin@yourstore.com","admin","Valid"},
								{"admin@yourstore.com","adm","Invalid"},
								{"adm@yourstore.com","admin","Invalid"},
								{"adm@yourstore.com","adm","Invalid"}
							};*/
		
		//get the data from excel
		String path="C:\\Users\\HP\\git\\11marchTestng\\March11Testng\\Data\\DataProviderWithParamerization.xlsx";
		ExcelUtilityClass xlutil=new ExcelUtilityClass(path);
		
		int totalrows=xlutil.getrowcount("Sheet1");
		int totalcols=xlutil.getcellcount("Sheet1",1);	
				
		String loginData[][]=new String[totalrows][totalcols];
			
		
		for(int i=1;i<=totalrows;i++) //1
		{
			for(int j=0;j<totalcols;j++) //0
			{
				loginData[i-1][j]=xlutil.getcellData("Sheet1", i, j);
			}
				
		}
		
		return loginData;
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
//	WebDriver driver;
//
//	@BeforeTest
//	public void OpenBrowser() 
//	{System.setProperty("webdriver.edge.driver",
//			"C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
//
//	driver = new ChromeDriver();
//	
//	driver.manage().window().maximize();
//	
//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//	}
//
//	@Test(dataProvider  ="Logindata")
//	public void Login(String Username, String Password, String result) {
//
//		
//
//		WebElement user = driver.findElement(By.xpath("//input[@name=\"username\"]"));
//		user.clear();
//		user.sendKeys(Username);
//
//		WebElement userpass = driver.findElement(By.xpath("//input[@name=\"password\"]"));
//		userpass.clear();
//		userpass.sendKeys(Password);
//		
//		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//
//		String exe_title = "OrangeHRM";
//
//		String act_title = driver.getTitle();
//
//		if (result.equals("valid")) {
//
//			if (act_title.equals(exe_title)) {
//
//				driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).click();
//
//				driver.findElement(By.xpath("(//ul[@class=\"oxd-dropdown-menu\"]//li)[4]")).click();
//
//				Assert.assertTrue(true);
//
//			} else {
//
//				assertTrue(false);
//			}
//		} else if (result.equals("invalid")) {
//			if (act_title.equals(exe_title)) {
//				
//				assertTrue(false);
//			} else {
//				Assert.assertTrue(true);
//			}
//		}
//
//	}
//
//	@DataProvider(name = "Logindata")
//	public String[][] logindata() throws IOException {
//
////		String logindataa[][] = { { "Admin", "admin123", "valid" },
////
////				{ "Admin123", "admin", "invalid" },
////
////				{ "Admin123", "admin456", "invalid" } };
//
//		// data from excelsheet from utilityclass
//		String path="C:\\Users\\HP\\eclipse-workspace\\11MarchMaven\\Data\\DataProviderWithParamerization.xlsx";
//		ExcelUtilityClass EUC=new ExcelUtilityClass(path);
//		int rowcount=EUC.getrowcount("Sheet1");
//		int cellcount=EUC.getcellcount("Sheet1", 1);
//		
//		String logindataa[][]=new String [rowcount][cellcount];
//		for(int i=1;i<=rowcount;i++) {//from 1 because we have to avoid headerfrom sheet
//			for(int j=0;j<cellcount;j++) {//cell will start from 0 only.
//				logindataa[i-1][j]=EUC.getcellData("Sheet1", i, j);
//			}    //here i-1 because array start from 0 and here i=1
//			     //to store data in 0 position we write i-1
//		}
//
//		return logindataa;
//
//	}
//
////	@AfterTest
////	public void teardown() {
////		driver.close();
////
////	}

}
