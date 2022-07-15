package pracsel;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/itctesting14/Desktop/html/log.html");
		
		driver.findElement(By.id("create")).click();
		driver.findElement(By.id("fullname")).sendKeys("geetha");
		driver.findElement(By.id("username")).sendKeys("ghee");
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

	
	}

