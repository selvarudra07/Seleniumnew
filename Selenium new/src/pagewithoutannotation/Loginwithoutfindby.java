package pagewithoutannotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Loginwithoutfindby {
	
	public static WebElement email;
	public static WebElement pass;
	public static WebElement loginbutton;
@Test
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	
		PageFactory.initElements(driver, Loginwithoutfindby.class);
		email.sendKeys("Admin");
		pass.sendKeys("admin123");
		loginbutton.click();
	}
}
