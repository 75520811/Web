package project;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class aboutus {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
        WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/itctesting14/Desktop/html/login.html");
		driver.findElement(By.id("aboutus")).click();

}
}
