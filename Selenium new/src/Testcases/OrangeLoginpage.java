package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjectModel.Loginpageobjects;

public class OrangeLoginpage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.net/login");
		
		
		PageFactory.initElements(driver, Loginpageobjects.class);
		
		Loginpageobjects.username.sendKeys("user@phptravels.com");
		Loginpageobjects.password.sendKeys("demouser");
		Loginpageobjects.button.click();
		
//		WebElement name=driver.findElement(By.name("username"));
//		name.sendKeys("Admin");
//		
//		WebElement password=driver.findElement(By.name("password"));
//		password.sendKeys("admin123");
//		
//		WebElement button=driver.findElement(By.xpath("//button[text()=' Login ']"));
//		button.click();
	}

}
