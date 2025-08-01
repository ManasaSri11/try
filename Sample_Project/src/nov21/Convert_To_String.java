package nov21;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Convert_To_String {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("D:\\Book.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		XSSFSheet ws =wb.getSheetAt(0);
		int rc = ws.getLastRowNum();
		System.out.println("No of rows::"+rc);
		for(int i=1;i<=rc;i++)
		{
if(wb.getSheet("Emp").getRow(i).getCell(2).getCellType()==CellType.NUMERIC)
{
	int Celldata = (int) wb.getSheet("Emp").getRow(i).getCell(2).getNumericCellValue();
String eid = String.valueOf(Celldata);
System.out.println(eid);
}
fi.close();
wb.close();
		}
}
}
