package pdfclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hyperlinksexample2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement homepage=driver.findElement(By.linkText("Go to Dashboard"));
		homepage.click();

		driver.navigate().back();

		WebElement wheretogo=driver.findElement(By.partialLinkText("Find the URL"));
		String withoutclick=wheretogo.getAttribute("href");
		System.out.println("This page is going to" + withoutclick);

		WebElement brokenpage=driver.findElement(By.linkText("Broken?"));
		brokenpage.click();
		String titlename=driver.getTitle();

		if(titlename.contains("404")) {
			System.out.println("This page is broken");
		}else
		{
			System.out.println("This page is not broken");
		}

		driver.navigate().back();

		WebElement homepage1=driver.findElement(By.linkText("Go to Dashboard"));
		homepage1.click();

		List<WebElement> linkscount=driver.findElements(By.tagName("a"));
		int counts=linkscount.size();
		System.out.println(counts);
	}

}
