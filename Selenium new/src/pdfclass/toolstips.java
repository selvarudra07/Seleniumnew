package pdfclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolstips {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().window().maximize();
		
		WebElement name=driver.findElement(By.id("toolTipTextField"));
		
		String tooltip=name.getAttribute("placeholder");
		System.out.println(tooltip);

	}

}
