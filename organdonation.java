package project;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class organdonation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/itctesting14/Desktop/html/login.html");
		
		driver.findElement(By.id("organdonation")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("First_name")).sendKeys("geetha");
		Thread.sleep(1000);
		driver.findElement(By.id("Last_name")).sendKeys("a");
		Thread.sleep(1000);
		driver.findElement(By.id("date")).sendKeys("17-11-2000");
		driver.findElement(By.id("Email_Id")).sendKeys("geetha@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Mobile_Number")).sendKeys("1234567890");
		WebElement radio= driver.findElement(By.id("female"));
		radio.click();
		Thread.sleep(1000);
		driver.findElement(By.id("Address")).sendKeys("#46 bangalore");
		Thread.sleep(1000);
		driver.findElement(By.id("City")).sendKeys("bangalore");
		Thread.sleep(1000);
		driver.findElement(By.id("Pincode")).sendKeys("560050");
		Thread.sleep(1000);
		WebElement ddrop = (WebElement) driver.findElement(By.id("state"));
		Select select = new Select(ddrop);
		select.selectByIndex(11);
		Thread.sleep(1000);
		driver.findElement(By.id("country")).sendKeys("India");
		Thread.sleep(1000);
		WebElement checkbox= driver.findElement(By.id("B+"));
		checkbox.click();
		driver.findElement(By.id("B+")).click();
		WebElement checkbox1= driver.findElement(By.id("kidney"));
		checkbox1.click();
		Thread.sleep(1000);
		driver.findElement(By.id("adhaar")).sendKeys("123456789087");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("alert")).click();
		


	}

}


