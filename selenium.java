package pracsel;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com");
		driver.findElement(By.id("username")).sendKeys("geethashetty");
		driver.findElement(By.id("password")).sendKeys("ghee@123");
		driver.findElement(By.id("login")).click();
		driver.close();
	}

}
