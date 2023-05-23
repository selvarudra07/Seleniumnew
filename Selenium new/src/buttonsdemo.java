import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class buttonsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://demoqa.com/buttons");

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

WebElement doubleclick= driver.findElement(By.xpath("//button[text()='Double Click Me']"));
Actions a=new Actions(driver);
a.doubleClick(doubleclick).perform();

WebElement rightclick= driver.findElement(By.xpath("//button[text()='Right Click Me']"));
a.contextClick(rightclick).perform();

WebElement click= driver.findElement(By.xpath("//button[text()='Click Me']"));
click.click();
	}

}
