package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class loginexcel {
  WebDriver driver;
  WebDriverWait wait;
  HSSFWorkbook workbook;
  HSSFSheet sheet;
  XSSFCell cell;
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }
 
  @BeforeMethod
	  public void beforeMethod1() throws Exception{
	  String path1="D:\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
      WebDriver driver=new ChromeDriver();
      driver.get("file:///C:/Users/itctesting14/Desktop/html/log.html");
  }
@Test
 
public void login() throws Exception{
File src = new File("C:\\Users\\itctesting14\\Documents\\Book1.xlsx");
FileInputStream fis = new FileInputStream(src);
@SuppressWarnings("resource")
XSSFWorkbook wb = new XSSFWorkbook(fis);
XSSFSheet sheet1 = wb.getSheetAt(0);
System.out.println("login to organ donation");
XSSFCell cell = sheet1.getRow(0).getCell(1);
driver.findElement(By.id("email")).sendKeys(cell.getStringCellValue());
XSSFCell cell1 = sheet1.getRow(1).getCell(1);
driver.findElement(By.id("password")).sendKeys(cell1.getStringCellValue());
driver.findElement(By.id("submit")).click();
Alert alert = driver.switchTo().alert();
alert.accept();
}

  @AfterMethod
  public void afterMethod() {
	  //driver.close();
  }

  
  @AfterClass
  public void afterClass() {
	  System.out.println("Ater Class");
  }
  }
