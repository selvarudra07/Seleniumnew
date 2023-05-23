package pdfclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logos {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		boolean logo=driver.findElement(By.xpath("/html/body/div[2]/header/a")).isDisplayed();
		if(logo==true)
		{
			System.out.println("The Logo is Enable");
		}
		else
		{
			System.out.println("Logo is not Enable");
		}

	}

}
