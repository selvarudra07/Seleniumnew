package pdfclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class2 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("gopal");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("gopal@ymail,com");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("12 west st");
		JavascriptExecutor obj=(JavascriptExecutor)driver;
		obj.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("12 west st madras");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();

	}

}
