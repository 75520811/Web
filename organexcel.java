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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class organexcel {
WebDriver driver;
WebDriverWait wait;
HSSFWorkbook workbook;
HSSFSheet sheet;
XSSFCell cell;
private char[] cell6;
  @Test
  public void contact() throws Exception {
 File src = new File("C:\\Users\\itctesting14\\Documents\\organ.xlsx");
 FileInputStream fis = new FileInputStream(src);
 @SuppressWarnings("resource")
 XSSFWorkbook wb = new XSSFWorkbook(fis);
 XSSFSheet sheet1 = wb.getSheetAt(0);
 System.out.println("login to organ donation");
 XSSFCell cell = sheet1.getRow(0).getCell(0);
 driver.findElement(By.id("firstname")).sendKeys(cell.getStringCellValue());
 Thread.sleep(1000);
 XSSFCell cell1 = sheet1.getRow(0).getCell(1);
 driver.findElement(By.id("lastname")).sendKeys(cell1.getStringCellValue());
 Thread.sleep(1000);
 WebElement dob1=driver.findElement(By.id("Birthday_Day"));
 dob1.sendKeys("17");
 WebElement dob2=driver.findElement(By.id("Birthday_Month"));
 dob2.sendKeys("Nov");
 WebElement dob3=driver.findElement(By.id("Birthday_Year"));
 dob3.sendKeys("2000");
 XSSFCell cell2 = sheet1.getRow(0).getCell(2);
 driver.findElement(By.id("email")).sendKeys(cell2.getStringCellValue());
 Thread.sleep(1000);
 XSSFCell cell3 = sheet1.getRow(0).getCell(3);
 driver.findElement(By.id("numbers")).sendKeys(String.valueOf(cell3));
 Thread.sleep(1000);
 WebElement radioBoxSelect=driver.findElement(By.id( "female"));
 Boolean isSelect=radioBoxSelect.isSelected();
 if(isSelect==false) {
 radioBoxSelect.click();
 }
 XSSFCell cell4 = sheet1.getRow(0).getCell(4);
 driver.findElement(By.id("address")).sendKeys(cell4.getStringCellValue());
 Thread.sleep(1000);
 XSSFCell cell5 = sheet1.getRow(0).getCell(5);
 driver.findElement(By.id("city")).sendKeys(cell5.getStringCellValue());
 Thread.sleep(1000);
 XSSFCell cell6 = sheet1.getRow(0).getCell(6);
 driver.findElement(By.id("pincode")).sendKeys(String.valueOf(cell6));
 Thread.sleep(1000);
 WebElement ddrop = (WebElement) driver.findElement(By.id("state"));
 Select select = new Select(ddrop);
 select.selectByIndex(11);
 driver.findElement(By.id("country")).sendKeys("country");
 WebElement checkbox= driver.findElement(By.id("B+"));
 checkbox.click();
 driver.findElement(By.id("B+")).click();
 WebElement checkbox1= driver.findElement(By.id("kidney"));
 checkbox1.click();
 Thread.sleep(1000);
 XSSFCell cell7 = sheet1.getRow(0).getCell(8);
 driver.findElement(By.id("aadhar")).sendKeys(cell7.getStringCellValue());
 Thread.sleep(1000);
 driver.findElement(By.id("submit")).click();
  }
  @BeforeMethod
  public void beforeMethod() throws Exception{
 String path1 = "D:\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path1);
driver = new ChromeDriver();
driver.get("file:///C:/Users/itctesting14/Desktop/html/organ.html");

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


