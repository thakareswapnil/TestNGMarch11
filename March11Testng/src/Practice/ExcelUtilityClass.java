package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilityClass {
	
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
     String path=null;
     
    public  ExcelUtilityClass(String path)
    {
    	this.path=path;
    }
    public int getrowcount(String sheetname) throws IOException {
    	fi=new FileInputStream(path);
    	workbook=new XSSFWorkbook(fi);
    	sheet=workbook.getSheet(sheetname);
    	int rowcount=sheet.getLastRowNum();
    	workbook.close();
    	fi.close();
    	return rowcount;
    	
    }
    public int getcellcount(String sheetname,int rownum) throws IOException {
    	fi=new FileInputStream(path);
    	workbook =new XSSFWorkbook(fi);	
    	sheet=workbook.getSheet(sheetname);
    	row=sheet.getRow(rownum);
    	int columncount=row.getLastCellNum();
    	
    	workbook.close();
    	fi.close();
    	return columncount;
    }
    public String getcellData(String sheetname,int rownum,int cellnum) throws IOException {
    	fi=new FileInputStream(path);
    	workbook =new XSSFWorkbook(fi);	
    	sheet=workbook.getSheet(sheetname);
    	row=sheet.getRow(rownum);
    	cell=row.getCell(cellnum);
    	
    	DataFormatter formatter=new DataFormatter();
    	String data;
    	data=formatter.formatCellValue(cell);
    	
    	return data;
    	
    }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}

