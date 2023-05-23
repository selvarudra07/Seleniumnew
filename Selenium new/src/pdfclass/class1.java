package pdfclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		WebElement name=driver.findElement(By.id("email"));
		name.sendKeys("gopal");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("123456789");
		WebElement button=driver.findElement(By.id("loginbutton"));
		button.click();

	}

}
