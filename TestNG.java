package pracsel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG {
  @Test
  public void tstmd() {
	  String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/itctesting14/Desktop/html/log.html");
		
		driver.findElement(By.id("create an account")).click();
		driver.findElement(By.id("text")).sendKeys("geetha");
		driver.findElement(By.id("Username")).sendKeys("ghee");
		driver.findElement(By.id("email")).sendKeys("geetha@gmail.com");
		driver.findElement(By.id("numbers")).sendKeys("1234567890 ");
		driver.findElement(By.id("password")).sendKeys("Ghee@123");
		driver.findElement(By.id("confirmpassword")).sendKeys("Ghee@123");
		WebElement radio= driver.findElement(By.id("female"));
		radio.click();
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.id("email")).sendKeys("geetha@gmail.com");
		driver.findElement(By.id("password")).sendKeys("ghee123");
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.id("alert")).click();
		
  }
  @BeforeMethod
  public void beforeMethod() {
	  String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
WebDriver driver= new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
