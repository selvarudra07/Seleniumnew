import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

driver.get("https://www.instagram.com/accounts/login/");

WebElement username= driver.findElement(By.name("username"));
username.sendKeys("test@123");

WebElement password= driver.findElement(By.name("password"));
password.sendKeys("123456789");

WebElement loginButton= driver.findElement(By.xpath("//*[@id='loginForm']/div/div[3]/button/div"));
loginButton.click();
	}

}
