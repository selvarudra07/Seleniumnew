import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
WebDriver driver= new ChromeDriver();

driver.get("https://www.instagram.com/accounts/login/");

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

WebElement username = driver.findElement(By.name("username"));
username.sendKeys("gopal");

WebElement password = driver.findElement(By.name("password"));
password.sendKeys("123456789");

driver.findElement(By.xpath("//div[text()='Log In']")).click();

	}

}
