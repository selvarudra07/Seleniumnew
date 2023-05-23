import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml;jsessionid=node03j7r4661vkmp152tj0kwrpxu2435648.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement checked=driver.findElement(By.xpath("//input[@id='j_idt87:console2:2']"));
		WebElement unchecked=driver.findElement(By.xpath("//input[@id='j_idt87:console2:2']"));
		
		boolean button1=checked.isSelected();
		boolean button2=unchecked.isSelected();
		
		System.out.println(button1);
		System.out.println(button2);
		
		driver.findElement(By.xpath("//label[text()='1-20 Years']")).click();
		
	}

}
