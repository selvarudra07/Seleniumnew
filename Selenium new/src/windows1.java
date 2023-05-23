import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node06e96ihzoenf5sklsrkdpgvtl69521.node0");

		String oldWindow= driver.getWindowHandle();	//current window

		WebElement firstbutton= driver.findElement(By.xpath("//*[@id=\'j_idt88:new\']/span"));
		firstbutton.click();
		Thread.sleep(3000);

		Set<String> handles= driver.getWindowHandles();	//all windows

		for (String newWindow : handles)	//hytrate all one by one windows to read
		{
			driver.switchTo().window(newWindow);	 //move to new window
		}
		
		WebElement elementbutton= driver.findElement(By.xpath("//*[@id=\'menuform:j_idt40\']/a/i[1]"));
		elementbutton.click();
		Thread.sleep(3000);
		driver.close();

		driver.switchTo().window(oldWindow);

		WebElement multiple= driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span"));
		multiple.click();
		Thread.sleep(3000);

		int numberofwindows=driver.getWindowHandles().size();
		System.out.println("No of windows opened:"+ numberofwindows);

		WebElement closewindow= driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']/span[2]"));
		closewindow.click();
		Thread.sleep(3000);
		
		Set<String> newwindowhandles= driver.getWindowHandles();

		for (String allwindows : newwindowhandles) {
			if (!allwindows.equals(oldWindow)) {
				driver.switchTo().window(allwindows);
				driver.close();
			}

		}
	}

}
