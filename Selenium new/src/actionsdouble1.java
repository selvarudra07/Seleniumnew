import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsdouble1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://demoqa.com/buttons");

WebElement doubleclick=driver.findElement(By.xpath("//*[text()='Double Click Me']"));
Actions obj=new Actions(driver);
obj.doubleClick(doubleclick).perform();

WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
obj.contextClick(rightclick).perform();
	}

}
