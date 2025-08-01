package nov20;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadCellData {

	public static void main(String[] args) throws Throwable{
		FileInputStream fi =new FileInputStream("D:\\Book.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Emp");
		int rc = ws.getLastRowNum();
		System.out.println("No of rows are::"+rc);
		String Employee = ws.getRow(5).getCell(0).getStringCellValue();
		String PASSWORD = ws.getRow(10).getCell(1).getStringCellValue();
		int eid = (int)ws.getRow(7).getCell(2).getNumericCellValue();
		System.out.println(Employee+" "+PASSWORD+" "+eid);
		fi.close();
		wb.close();

	}
}
