package nov21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FormatingCell {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("D:\\Book.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		XSSFSheet ws =wb.getSheetAt(0);
		int rc = ws.getLastRowNum();
		System.out.println("No of rows::"+rc);
		for(int i=1;i<=rc;i++)
		{
			ws.getRow(i).createCell(3).setCellValue("Pass");
			XSSFCellStyle style = wb.createCellStyle();
			XSSFFont font = wb.createFont();
			font.setColor(IndexedColors.GREEN.getIndex());
			font.setBold(true);
			style.setFont(font);
			ws.getRow(i).getCell(3).setCellStyle(style);
		}
		fi.close();
		FileOutputStream fo= new FileOutputStream("D:\\\\Results.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
		

	}

}
