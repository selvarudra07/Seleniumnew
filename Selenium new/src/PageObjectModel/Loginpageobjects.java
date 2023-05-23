package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpageobjects {
	
	@FindBy(name="email")
	public static WebElement username;
	@FindBy(name="password")
	public static WebElement password;
	@FindBy(xpath="//span[text()='Login']")
	public static WebElement button;
		
	
	
	/*public static WebElement max(WebDriver driver) {
		driver.manage().window().maximize();
		return null;
	}

	public static void time(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("username"));
	}
	
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.name("password"));
	}
	
	public static WebElement button(WebDriver driver) {
		return driver.findElement(By.xpath("//button[text()=' Login ']"));
	}*/
}
