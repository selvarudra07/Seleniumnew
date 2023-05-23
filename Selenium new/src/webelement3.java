import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		boolean textselect=driver.findElement(By.xpath("//button[@type='submit']")).isSelected();
	
		if(textselect==true)
		{
			System.out.println("button is clicked");
		}
	
		else
		{
			System.out.println("button is not clicked");
		}
	}

}
