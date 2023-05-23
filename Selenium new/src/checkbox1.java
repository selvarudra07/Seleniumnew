import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checkbox1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		WebElement java= driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[1]/div/div[2]"));
		java.click();
		
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']")).click();
		WebElement multiple=driver.findElement(By.xpath("//h5[text()='Select Multiple']"));
		Select obj=new Select(multiple);
		obj.selectByIndex(1);
		obj.selectByIndex(4);
		obj.selectByIndex(5);
		
				
	}

}
