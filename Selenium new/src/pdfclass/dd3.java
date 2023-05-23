package pdfclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dd3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement drop=driver.findElement(By.id("day"));
		Select obj=new Select(drop);
		obj.selectByIndex(8);
		
		List<WebElement>listofoptions=obj.getOptions();
		int size=listofoptions.size();
		System.out.println("noof options :"+size);
	}

}
