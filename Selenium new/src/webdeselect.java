import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webdeselect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dropdown=driver.findElement(By.id("cars"));
		Select obj=new Select(dropdown);
		obj.selectByIndex(0);
		obj.selectByIndex(1);
		obj.selectByIndex(2);
		obj.selectByIndex(3);
		Thread.sleep(3000);
		obj.deselectByVisibleText("Audi");
		obj.deselectByValue("opel");
		//obj.deselectAll();
		

	}

}
