package pdfclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hyperlinksexample {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement dashboard=driver.findElement(By.linkText("Go to Dashboard"));
		dashboard.click();
		
		driver.navigate().back();
		
		WebElement withoutclicking=driver.findElement(By.partialLinkText("Find the URL"));
		String wheretogo=withoutclicking.getAttribute("href");
		System.out.println("this ink is going to" + wheretogo);
		
		Thread.sleep(3000);
		
		WebElement brokenlink=driver.findElement(By.linkText("Broken?"));
		brokenlink.click();
		
		String title=driver.getTitle();
		if(title.contains("404")) {
			System.out.println("This link is broken");
		}
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		WebElement dashboard1=driver.findElement(By.linkText("Go to Dashboard"));
		dashboard1.click();
		
		driver.navigate().back();
		
		List<WebElement> nooflinks=driver.findElements(By.tagName("a"));
		int count=nooflinks.size();
		System.out.println(count);
	}
	

}
