package pdfclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autocompletelist {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("selenium");
				
		List<WebElement> lists=	driver.findElements(By.xpath("//ul/li[@class='sbct']"));
		
		System.out.println(lists.size());
		
		Thread.sleep(3000);
		
		for (WebElement names : lists) {
			
			String correctname=names.getText();
			System.out.println(correctname);
			
			if(correctname.equals("selenium testing"))
			{
			names.click();
			break;
			
			}
	}

}
}