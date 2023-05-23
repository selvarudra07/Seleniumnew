package pdfclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.switchTo().frame(0);
		WebElement button1=driver.findElement(By.id("Click"));
		button1.click();

		String text=driver.findElement(By.id("Click")).getText();
		System.out.println(text);

		driver.switchTo().defaultContent();

		List<WebElement> totalframes=driver.findElements(By.tagName("iframe"));
		int sizes=totalframes.size();
		System.out.println(sizes);
	
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement nestedbutton=driver.findElement(By.id("Click1"));
		nestedbutton.click();
	}

}
