import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		boolean logo=driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']")).isDisplayed();

		if(logo==true)
		{
			System.out.println("logo is displayed");
		}

		else
		{
			System.out.println("logo is not displayed");
		}

	}

}
