package pdfclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class butns {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		Actions obj=new Actions(driver);
		obj.doubleClick(doubleclick).perform();
		
		WebElement rightclick=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		Actions obj1=new Actions(driver);
		obj1.contextClick(rightclick).perform();

	}

}
