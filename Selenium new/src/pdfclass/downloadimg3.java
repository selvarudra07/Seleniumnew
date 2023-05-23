package pdfclass;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class downloadimg3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[text()='Download']")).click();
		
		File filelocation=new File("C:\\Users\\Hemnath\\Downloads");
		
		File[] selectfile=filelocation.listFiles();
		
		for (File file : selectfile) {
			
			if(file.getName().equals("sampleFile.jpeg")) {
				System.out.println("true");
				break;
			}
		}

	}

}
