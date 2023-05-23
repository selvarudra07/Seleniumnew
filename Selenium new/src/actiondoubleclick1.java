import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actiondoubleclick1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/buttons");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

WebElement doublebutton=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
Actions obj=new Actions(driver);
obj.doubleClick(doublebutton).perform();

WebElement rightclickbutton=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
obj.contextClick(rightclickbutton).perform();


	}

}
