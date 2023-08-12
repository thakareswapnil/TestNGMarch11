package Dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Exceldata {
	
	@DataProvider(name="logindata")
	public String[][] data() throws IOException {
		File path=new File("C:\\Users\\HP\\eclipse-workspace\\11MarchMaven\\Data\\DataProviderWithParamerization.xlsx");
		//System.out.println(file.exists());
		FileInputStream fl=new FileInputStream(path);
		
		XSSFWorkbook wb=new XSSFWorkbook(fl);
		
		XSSFSheet sheet=wb.getSheet("Sheet");
		
		int row=sheet.getLastRowNum();
		
		int column=sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[row-1][column];
		for (int i = 0; i < row-1; i++) {
			for (int j = 0; j < column; j++) {
				DataFormatter df = new DataFormatter();
				data[i][j] =  df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		
		
 		for (String[] dataArr : data) {
 			System.out.println(Arrays.toString(dataArr));
 		}
		return data;
				
				
				
				
				
				
	}

}
