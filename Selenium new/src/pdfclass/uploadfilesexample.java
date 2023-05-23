package pdfclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfilesexample {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node0529420yfpodtvi8gmnfizp9d482477.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("j_idt88:j_idt89")).click();
		
		String filelocation="C:\\Users\\Hemnath\\Downloads\\sampleFile.jpeg";
		
		StringSelection selection=new StringSelection(filelocation);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		//We use robot actions because this process is running out of the selenium page(DOB)
		//i.e; windows process such as copy paste process so we use this process.
		
		Robot robot=new Robot();
		//Virtual keyboard process..
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}

