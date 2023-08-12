package Dataprovider;

import org.testng.annotations.DataProvider;

public class DifferrentDataProvider {
	
	
	@DataProvider(name = "Logindata")
	public Object[][] LoginData() {
		Object LoginD[][] = { { "admin@yourstore.com", "admin"},
				            { "admin@yourstore1.com", "admin" } };
		return LoginD;

	}

}
