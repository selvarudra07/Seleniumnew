import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio22 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml;jsessionid=node03j7r4661vkmp152tj0kwrpxu2435648.node0");
		
		WebElement clicked=driver.findElement(By.xpath("//input[@id='j_idt87:console2:2']"));
		WebElement  unclicked=driver.findElement(By.xpath("//input[@id='j_idt87:console2:1']"));
		
		boolean option1=clicked.isSelected();
		boolean option2=unclicked.isSelected();
		
		System.out.println(option1);
		System.out.println(option2);
		
		driver.findElement(By.xpath("//label[text()='41-60 Years']")).click();
	}

}
