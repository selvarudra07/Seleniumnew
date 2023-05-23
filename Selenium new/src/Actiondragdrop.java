import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiondragdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement drag=driver.findElement(By.xpath("//*[text()=' 5000 ']"));
		WebElement drop=driver.findElement(By.xpath("//*[@id='amt7']"));
		Actions obj=new Actions(driver);
		obj.dragAndDrop(drag, drop).perform();
		
	}

}
