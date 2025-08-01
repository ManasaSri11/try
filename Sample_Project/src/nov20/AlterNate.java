package nov20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AlterNate {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi= new FileInputStream("D:\\Book.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws= wb.getSheet("Emp");
		int rc = ws.getLastRowNum();
		System.out.println("No.of rows are::"+rc);
		XSSFRow row = ws.getRow(11);
		XSSFCell C1 = row.getCell(0);
		XSSFCell C2 = row.getCell(1);
		XSSFCell C3 = row.getCell(2);
		String Employee = C1.getStringCellValue();
		String PASSWORD = C2.getStringCellValue();
		int eid = (int)C3.getNumericCellValue();
		System.out.println(Employee+" "+PASSWORD+" "+eid);
		fi.close();
		wb.close();
	}

}
