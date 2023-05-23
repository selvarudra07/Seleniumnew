package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjectModel.Loginpageobjects;
import PageObjectModel.myinfoobject;

public class myinfo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.net/login");
		
		PageFactory.initElements(driver, Loginpageobjects.class);
		
		Loginpageobjects.username.sendKeys("user@phptravels.com");
		Loginpageobjects.password.sendKeys("demouser");
		Loginpageobjects.button.click();
		
		PageFactory.initElements(driver, myinfoobject.class);
		
		myinfoobject.myprofile.click();
		myinfoobject.firstname.clear();
		myinfoobject.firstname.sendKeys("vinay");
		myinfoobject.lastname.clear();
		myinfoobject.lastname.sendKeys("ram");
		myinfoobject.phone.clear();
		myinfoobject.phone.sendKeys("1234567890");
				
		
//		WebElement username=driver.findElement(By.name("username"));
//		username.sendKeys("Admin");
//		
//		WebElement password=driver.findElement(By.name("password"));
//		password.sendKeys("admin123");
//		
//		WebElement button=driver.findElement(By.xpath("//button[text()=' Login ']"));
//		button.click();
//
//		WebElement myinfo=driver.findElement(By.xpath("//span[text()='My Info']"));
//		myinfo.click();
//		
//		WebElement firstname=driver.findElement(By.name("firstName"));
//		firstname.sendKeys("vinay");
//		
//		WebElement lastname=driver.findElement(By.name("lastName"));
//		lastname.sendKeys("ram");
//		
//		WebElement nickname=driver.findElement(By.xpath("//label[text()='Nickname']"));
//		nickname.sendKeys("siva");
	}
	
}
