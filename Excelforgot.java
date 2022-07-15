package project;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import project.ExcelUtility;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import com.google.common.base.Function;

public class Excelforgot {
   private WebDriver driver;
   private ExcelUtility utility;
 //  private Wait<WebDriver> wait;

   @DataProvider
   public String[][] getData() throws Exception {
   File src=new File("C:\\Users\\itctesting14\\Documents\\forgot.xlsx");
   FileInputStream fis=new FileInputStream(src);
   XSSFWorkbook wb=new XSSFWorkbook(fis);
   XSSFSheet sheet=wb.getSheet("forgot");
   int Rows=sheet.getPhysicalNumberOfRows();
   int cols=sheet.getRow(0).getLastCellNum();

   String[][] data=new String[Rows-1][cols];
   for(int i=0;i<Rows-1;i++)
   {
   for(int j=0;j<cols;j++)
   {
   DataFormatter df=new DataFormatter();
   data[i][j]= df.formatCellValue(sheet.getRow(i+1).getCell(j));

   }
   System.out.println();
   }
   wb.close();
   fis.close();
   return data;
   }
    
   @BeforeMethod
   public void setup() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
       this.driver = new ChromeDriver();

       driver.get("file:///C:/Users/itctesting14/Desktop/html/forgot.html");
//Thread.sleep(2000);
     

   
   }

   @Test(dataProvider = "getData")
   public void test(String username, String email,String new_pwd, String cnf_pwd ) throws Exception {
   
   
     this.driver.findElement(By.id("username")).sendKeys(username);
     Thread.sleep(1000);
     this.driver.findElement(By.id("email")).sendKeys(email);
     Thread.sleep(1000);
     this.driver.findElement(By.id("password")).sendKeys(new_pwd);
     Thread.sleep(1000);
     this.driver.findElement(By.id("confirmpassword")).sendKeys(cnf_pwd);
     
  this.driver.findElement(By.id("submit")).click();
//  this.driver.findElement(By.id("forgot password")).click();
     Thread.sleep(500);
 
 

   }

}

