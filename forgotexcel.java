package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;

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
import org.testng.annotations.AfterClass;

public class forgotexcel {
WebDriver driver;
WebDriverWait wait;
HSSFWorkbook workbook;
HSSFSheet sheet;
XSSFCell cell;
  @Test
  public void contact() throws Exception {
 File src = new File("C:\\Users\\itctesting14\\Documents\\forgot.xlsx");
 FileInputStream fis = new FileInputStream(src);
 @SuppressWarnings("resource")
 XSSFWorkbook wb = new XSSFWorkbook(fis);
 XSSFSheet sheet1 = wb.getSheetAt(0);
 System.out.println("login to organ donation");
 XSSFCell cell1 = sheet1.getRow(1).getCell(0);
 driver.findElement(By.id("username")).sendKeys(cell1.getStringCellValue());
 Thread.sleep(1000);
 XSSFCell cell2 = sheet1.getRow(1).getCell(1);
 driver.findElement(By.id("email")).sendKeys(cell2.getStringCellValue());
 Thread.sleep(1000);
 XSSFCell cell3 = sheet1.getRow(1).getCell(2);
 driver.findElement(By.id("password")).sendKeys(cell3.getStringCellValue());
 Thread.sleep(1000);
 XSSFCell cell4 = sheet1.getRow(1).getCell(3);
 driver.findElement(By.id("confirmpassword")).sendKeys(cell4.getStringCellValue());
 Thread.sleep(1000);
 
 driver.findElement(By.id("submit")).click();
 Alert alert = driver.switchTo().alert();
 alert.accept();
  }
  @BeforeMethod
  public void beforeMethod() throws Exception{
 String path1 = "D:\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path1);
driver = new ChromeDriver();
driver.get("file:///C:/Users/itctesting14/Desktop/html/forgot.html");

  }

  @AfterMethod
  public void afterMethod() {
 //driver.close();
  }

  @BeforeClass
  public void beforeClass() {
 System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
 System.out.println("After Class");
  }

}


