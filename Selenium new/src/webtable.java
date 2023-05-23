import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.leafground.com/table.xhtml;jsessionid=node01rbd4qapxmtvw1rbz1f1sr3wlb264175.node0");
		String text=driver.findElement(By.xpath("//span[text()='Brazil']")).getText();
		System.out.println(text);
	}

}
