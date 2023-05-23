import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actiondoubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/buttons");
		
		WebElement doublebutton= driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		Actions obj= new Actions(driver);
		obj.doubleClick(doublebutton).perform();
		
		WebElement rightclick= driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		obj.contextClick(rightclick).perform();
		
	}

}
