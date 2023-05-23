package pdfclass;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scanner {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the browsername");
		String browser=obj.nextLine();
		WebDriver driver = null;
		if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\geckodriver-v0.31.0-win64.exe");
			driver=new FirefoxDriver();
		}

		else
			if(browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			else
			{
				System.out.println("Invalid Browser");
			}

		driver.close();
	}

}
