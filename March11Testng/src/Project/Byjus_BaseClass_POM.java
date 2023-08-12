package Project;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Byjus_BaseClass_POM {
	@Test
	public void setup() throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\OneDrive\\Desktop\\Testing\\Automation Testing\\installetion\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		byjusAssingment3WithPOM BP = new byjusAssingment3WithPOM(driver);
		BP.Goto();
		BP.Login1();
		

		String path = "C:\\Users\\HP\\eclipse-workspace\\March11Testng\\Data\\Book_Session.xlsx";
		FileInputStream file = new FileInputStream(path);
//		XSSFWorkbook workbook = new XSSFWorkbook(file);
//
//		XSSFSheet Sheet = workbook.getSheetAt(2);

		Sheet Data = WorkbookFactory.create(file).getSheet("Sheet1");
		

		String Name = Data.getRow(1).getCell(0).getStringCellValue();
		BP.Name1(Name);

		double PhoneNo = Data.getRow(1).getCell(1).getNumericCellValue();
		long phoneNoLong = (long) PhoneNo; // convert to long if needed
		BP.Phone(String.valueOf(phoneNoLong));

		BP.OTP_Click();
		Thread.sleep(10000);

		BP.CityClick();
		
		BP.CenterClick();
//		WebElement city = driver.findElement(By.id("formCity"));
//		city.click();
//		Select select = new Select(city);
//		select.selectByValue("Ambala");
		Thread.sleep(3000);

//		WebElement center = driver.findElement(By.id("formCenter"));
//		center.click();
//		Select select1 = new Select(center);
//		select1.selectByValue("344");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id=\"class-five\"]")).click();

		driver.findElement(By.xpath("//button[@class=\"btn modal-form-submit-btn\"]")).click();

//    String PhoneNo = Data.getRow(1).getCell(1).getStringCellValue();
//    BP.Phone(PhoneNo);
//    

	}
}
