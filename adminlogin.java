package project;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class adminlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/itctesting14/Desktop/html/admin.html");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("geetha@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Team1@1");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.id("alert")).click();

	}
}
