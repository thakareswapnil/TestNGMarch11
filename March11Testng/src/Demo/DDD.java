package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DDD {
	@Test
	public void data() throws IOException {

		File file = new File(
				"C:\\Users\\HP\\eclipse-workspace\\11MarchMaven\\Data\\DataProviderWithParamerization.xlsx");

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int row = sheet.getLastRowNum();
		System.out.println(row);

		int colum = sheet.getRow(0).getLastCellNum();
		System.out.println(colum);
		
		String data[][] = new String[row][colum];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j <colum; j++) {
//				DataFormatter df = new DataFormatter();
//				data[i][j] = df.formatCellValue(sheet.getRow(i).getCell(j));
//				System.out.println(data);
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
		}

		
	}
}
