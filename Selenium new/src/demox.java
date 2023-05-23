import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demo.automationtesting.in/Alerts.html");

		WebElement alertwithok= driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		alertwithok.click();
		Alert alert= driver.switchTo().alert();
		alert.accept();

		WebElement confirmbox= driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		confirmbox.click();
//		WebElement confirmclick=driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
//		confirmclick.click();
		Thread.sleep(3000);
		Alert confirmalert= driver.switchTo().alert();
		confirmalert.dismiss();

		WebElement promptbox= driver.findElement(By.xpath("//a[contains(text(),'Textbox')]"));
		promptbox.click();
//		WebElement promptalert= driver.findElement(By.xpath("//button[contains(text(),'demonstrate')]"));
//		promptalert.click();
		Alert prompt= driver.switchTo().alert();
		prompt.sendKeys("ram");
		prompt.accept();

	}

}
