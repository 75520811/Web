package project;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class blooddonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/itctesting14/Desktop/html/login.html");
		
		driver.findElement(By.id("blooddonation")).click();
		driver.findElement(By.id("firstname")).sendKeys("geetha");
		driver.findElement(By.id("lastname")).sendKeys("a");
		WebElement dob1=driver.findElement(By.id("Birthday_Day"));
		dob1.sendKeys("17");
		WebElement dob2=driver.findElement(By.id("Birthday_Month"));
		dob2.sendKeys("Nov");
		WebElement dob3=driver.findElement(By.id("Birthday_Year"));
		dob3.sendKeys("2000");
		driver.findElement(By.id("email")).sendKeys("geetha@gmail.com");
		driver.findElement(By.id("numbers")).sendKeys("1234567890");
		WebElement radio= driver.findElement(By.id("female"));
		radio.click();
		driver.findElement(By.id("address")).sendKeys("#46 bangalore");
		driver.findElement(By.id("city")).sendKeys("bangalore");
		driver.findElement(By.id("pincode")).sendKeys("560050");
		WebElement ddrop = (WebElement) driver.findElement(By.id("text"));
		Select select = new Select(ddrop);
		select.selectByIndex(11);
		driver.findElement(By.id("country")).sendKeys("India");
		WebElement checkbox= driver.findElement(By.id("B+"));
		checkbox.click();
		driver.findElement(By.id("B+")).click();
		driver.findElement(By.id("aadhar")).sendKeys("123456789087");
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.id("alert")).click();


	}

}





