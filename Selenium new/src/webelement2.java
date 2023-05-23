import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement2 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		boolean textbox=driver.findElement(By.xpath("//input[@name='username']")).isDisplayed();
		if(textbox==true)
		{
			System.out.println("textbox is enable");
		}

		else
		{
			System.out.println("textbox is disable");
		}
	}

}
