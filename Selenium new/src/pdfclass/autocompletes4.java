package pdfclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autocompletes4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.name("p")).sendKeys("r");
		List<WebElement> lists=driver.findElements(By.xpath("//ul/li[@class='sa-item prog-sugg']"));
		System.out.println(lists.size());
		
		for (WebElement names : lists) {
			
			String dataname=names.getText();
			System.out.println(names.getText());
			
			if(names.getText().equals("ration card"))
			{
				names.click();
				break;
			}
			
		}
	}

}
