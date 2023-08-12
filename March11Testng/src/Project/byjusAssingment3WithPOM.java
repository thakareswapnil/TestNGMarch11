package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class byjusAssingment3WithPOM {
	WebDriver driver;

	public byjusAssingment3WithPOM(WebDriver driver) { // this driver is used to access the webelement
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='home-btn']")
	public WebElement Button;

	@FindBy(xpath = "//input[@id=\"name-input\"]")
	public WebElement Name;

	@FindBy(xpath = "//input[@data-error=\"Enter Your Number Correctly\"]")
	public WebElement PhoneNo;

	@FindBy(xpath = "//button[contains(text(),\"Send OTP\")]")
	public WebElement OTP;

	@FindBy(id = "formCity")
	public WebElement city;

	@FindBy(id = "formCenter")
	public WebElement center;

	public void Goto() {
		driver.get("https://byjus.com/btc/");
	}

	public void Login1() {
		Button.click();
	}

	public void Name1(String N_Name) {
		Name.sendKeys(N_Name);
	}

	public void Phone(String P_PhoneNo) {
		PhoneNo.sendKeys(P_PhoneNo);
	}

	public void OTP_Click() {
		OTP.click();}
		//city
	
	
		public void CityClick() {
			city.click();
			Select select = new Select(city);
			select.selectByValue("Ambala");
		}
		
		//center
		public void CenterClick() {
			center.click();
			Select select1 = new Select(center);
			select1.selectByValue("344");

		}
		
		
		}


