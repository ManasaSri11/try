package nov20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CountRowsCells {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("D:\\Book.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Emp");
		XSSFRow row = ws.getRow(0);
		int rc=ws.getLastRowNum();
		int cc=row.getLastCellNum();
		System.out.println("No of rows are::"+rc);
		System.out.println("No.of cells are::"+cc);
		fi.close();
		wb.close();
	}

}
