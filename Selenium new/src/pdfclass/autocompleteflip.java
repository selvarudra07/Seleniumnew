package pdfclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autocompleteflip {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("s");
		
		List<WebElement> lists=	driver.findElements(By.xpath("//ul/li[@class='Y5N33s']"));
		System.out.println(lists.size());
		
		for (WebElement webElement : lists) {
			
			if(webElement.getText().equals("shoes")) {
				webElement.click();
				System.out.println("true");
				break;
			}
		}
	}

}
