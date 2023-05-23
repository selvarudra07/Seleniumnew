import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.leafground.com/radio.xhtml");


WebElement firstelement= driver.findElement(By.xpath("//*[@id=\'j_idt87:console1\']/tbody/tr/td[4]/div/div[2]/span"));
	
//if(firstelement.isSelected()) 
	firstelement.click();


WebElement secondelement= driver.findElement(By.xpath("//*[@id=\'j_idt87:city2\']/div/div[3]/div/div[2]/span"));
secondelement.click();
	}

}
