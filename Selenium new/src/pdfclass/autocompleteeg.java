package pdfclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autocompleteeg {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement browse=driver.findElement(By.id("yschsp"));
		browse.sendKeys("h");
		
		List<WebElement> lists=driver.findElements(By.xpath("//ul/li[@class='sa-item prog-sugg']"));
		System.out.println(lists.size());
		
		Thread.sleep(4000);
		for (WebElement names : lists) {
			String correctname=names.getText();
			System.out.println(correctname);
			
			if(correctname.equalsIgnoreCase("hotmail")) 
			{
				names.click();
				break;
				
			}
		}
	
	}

}
