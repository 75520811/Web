package TestNG;

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

public class projectdonation {
	WebDriver driver;
  @Test(priority=2)
  public void userlogin() throws Exception {
  {
			// TODO Auto-generated method stub
	     //String path1="D:\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", path1);
		//WebDriver driver= new ChromeDriver();
	    driver.get("file:///C:/Users/itctesting14/Desktop/html/log.html");
	    Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("geetha@gmail.com");
		driver.findElement(By.id("password")).sendKeys("ghee123");
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.id("alert")).click();

		}
  }

@Test(priority=5)
public void adminlogin() throws Exception {
	// TODO Auto-generated method stub
	//String path1="D:\\chromedriver.exe";
			//System.setProperty("webdriver.chrome.driver", path1);
			//WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/itctesting14/Desktop/html/admin.html");
	driver.findElement(By.id("email")).sendKeys("geetha@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.id("password")).sendKeys("Team1@1");
	Thread.sleep(1000);
	driver.findElement(By.id("submit")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("alert")).click();
	driver.close();

}
@Test(priority=1)
public void register() throws Exception {
	        //String path1="D:\\chromedriver.exe";
			//System.setProperty("webdriver.chrome.driver", path1);
			//WebDriver driver= new ChromeDriver();
    driver.get("file:///C:/Users/itctesting14/Desktop/html/log.html");
	driver.findElement(By.id("create an account")).click();
	driver.findElement(By.id("text")).sendKeys("geetha");
	Thread.sleep(1000);
	driver.findElement(By.id("Username")).sendKeys("ghee");
	Thread.sleep(1000);
	driver.findElement(By.id("email")).sendKeys("geetha@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.id("numbers")).sendKeys("1234567890 ");
	Thread.sleep(1000);
	driver.findElement(By.id("password")).sendKeys("Ghee1234");
	Thread.sleep(1000);
	driver.findElement(By.id("confirmpassword")).sendKeys("Ghee1234");
	Thread.sleep(1000);
	WebElement radio= driver.findElement(By.id("female"));
	radio.click();
	Thread.sleep(1000);
	driver.findElement(By.id("submit")).click();
	driver.close();
	
}
@Test(priority=3)
public void blooddonation() throws Exception {
	//String path1="D:\\chromedriver.exe";
			//System.setProperty("webdriver.chrome.driver", path1);
			//WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/itctesting14/Desktop/html/login.html");
	driver.findElement(By.id("organdonation")).click();
	driver.findElement(By.id("firstname")).sendKeys("geetha");
	Thread.sleep(1000);
	driver.findElement(By.id("lastname")).sendKeys("a");
	Thread.sleep(1000);
	WebElement dob1=driver.findElement(By.id("Birthday_Day"));
	dob1.sendKeys("17");
	WebElement dob2=driver.findElement(By.id("Birthday_Month"));
	dob2.sendKeys("Nov");
	WebElement dob3=driver.findElement(By.id("Birthday_Year"));
	dob3.sendKeys("2000");
	driver.findElement(By.id("email")).sendKeys("geetha@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.id("numbers")).sendKeys("1234567890");
	Thread.sleep(1000);
	WebElement radio= driver.findElement(By.id("female"));
	radio.click();
	Thread.sleep(1000);
	driver.findElement(By.id("address")).sendKeys("#46 bangalore");
	Thread.sleep(1000);
	driver.findElement(By.id("city")).sendKeys("bangalore");
	Thread.sleep(1000);
	driver.findElement(By.id("pincode")).sendKeys("560050");
	Thread.sleep(1000);
	driver.findElement(By.id("State")).sendKeys("karnataka");
	Thread.sleep(1000);
	driver.findElement(By.id("country")).sendKeys("India");
	Thread.sleep(1000);
	WebElement checkbox= driver.findElement(By.id("B+"));
	checkbox.click();
	driver.findElement(By.id("B+")).click();
	Thread.sleep(1000);
	WebElement checkbox1= driver.findElement(By.id("kidney"));
	checkbox1.click();
	driver.findElement(By.id("kidney")).click();
	driver.findElement(By.id("aadhar")).sendKeys("123456789087");
	Thread.sleep(1000);
	driver.findElement(By.id("submit")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("alert")).click();
	driver.close();
}
@Test(priority=4)

	public void aboutus() throws Exception {
	         //String path1="D:\\chromedriver.exe";
			//System.setProperty("webdriver.chrome.driver", path1);
			//WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/itctesting14/Desktop/html/login.html");
		Thread.sleep(1000);
		driver.findElement(By.id("aboutus")).click();
		driver.close();

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
