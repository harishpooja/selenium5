package seleniumPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet
{
	public static void main(String[] args) throws IOException 
	{
         String path = "E:\\ExcelProg.xlsx";
		
		//file read
		FileInputStream file = new FileInputStream(path);   
		
		//exception accept
		
				//workbook read
				XSSFWorkbook workbook = new XSSFWorkbook(file);             
				
				//exception aaccept
				
				//read sheet
				 XSSFSheet sheet = workbook.getSheet("E1");
				
				//read row
				 XSSFRow row = sheet.getRow(0);
				
				//read cell
				 XSSFCell cell = row.getCell(0);
				 
				 //data read
				String data = cell.getStringCellValue();
				System.out.println(data);
				
				
				

		
	}

}
