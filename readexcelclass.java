package readexceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcelclass {
	

	public static void main(String[] args) throws Exception {
		
		File scr=new File("C:\\exceldata\\testdata.xlsx");
		
		FileInputStream fis=new FileInputStream(scr);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);

		XSSFSheet sheet1=wb.getSheetAt(0);
		
		String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("Data from excel is" + data0);
		

}
}