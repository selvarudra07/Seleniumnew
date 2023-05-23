package pdfclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logos2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		boolean logo=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/a/img")).isEnabled();
		if(logo==true)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
	

}
