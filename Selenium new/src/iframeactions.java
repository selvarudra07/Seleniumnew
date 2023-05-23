import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeactions {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://leafground.com/frame.xhtml;jsessionid=node01asj2m8kimi5y1eaf7ru74js8f254073.node0");
		driver.switchTo().frame(0);
		WebElement button1=driver.findElement(By.id("Click"));
		button1.click();
		String text=driver.findElement(By.id("Click")).getText();
		System.out.println(text);

		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement button2=driver.findElement(By.id("Click"));
		button2.click();
		driver.switchTo().defaultContent();

		List<WebElement> totalframes=	driver.findElements(By.tagName("iframe"));
		int size=	totalframes.size();
		System.out.println(size);

	}

}
