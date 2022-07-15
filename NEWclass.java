package readexceldata;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NEWclass {
public static void main (String [] args) throws IOException{
FileInputStream fis = new FileInputStream("C:\\exceldata\\testdata.xlsx");
@SuppressWarnings("resource")
XSSFWorkbook workbook = new XSSFWorkbook(fis);
XSSFSheet sheet = workbook.getSheetAt(0);
for(int i=0;i<=6;i++) {
for(int j=0;j<=3;j++) {
System.out.println(sheet.getRow(i).getCell(j));
}
}
}
}



	