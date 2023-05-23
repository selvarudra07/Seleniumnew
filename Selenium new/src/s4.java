import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://twitter.com/i/flow/login");

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

WebElement username= driver.findElement(By.name("text"));
username.sendKeys("abc123456@gmail.com");
WebElement next= driver.findElement(By.xpath("//*[contains(text(),'Next')]"));
next.click();

WebElement name=driver.findElement(By.name("text"));
name.sendKeys("asdf12345");

WebElement login=driver.findElement(By.xpath("//span[text()='Next']"));
login.click();

//WebElement password= driver.findElement(By.name("password"));
//password.sendKeys("12345789262");	
//
//WebElement login= driver.findElement(By.xpath("//span[text()='Log in']"));
//login.click();
	}

}
