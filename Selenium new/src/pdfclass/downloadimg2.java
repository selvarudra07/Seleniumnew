package pdfclass;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class downloadimg2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("downloadButton")).click();
		File obj=new File("C:\\Users\\Hemnath\\Downloads");
		File[] filenames=obj.listFiles();
		
		for (File file : filenames) {
			if(file.getName().equals("Sample File.Jpeg")) {
			System.out.println("file is downloaded");
			break;
	
			}
		}

	}

}
