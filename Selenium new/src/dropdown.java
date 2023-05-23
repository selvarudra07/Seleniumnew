import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.leafground.com/select.xhtml;jsessionid=node0axw2p8nwl08t1buzu700j683838993.node0");
	
	WebElement dropDown1=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
	Select select = new Select(dropDown1);
select.selectByIndex(1);

//select.selectByValue("ui-selectonemenu-label");

select.selectByVisibleText("Cypress");

List<WebElement> listofoptions=select.getOptions();
int size= listofoptions.size();
System.out.println("Number of elements: "+ size);

dropDown1.sendKeys("Puppeteer");

WebElement multiSelect=driver.findElement(By.xpath("//input[@placeholder='Choose Course']"));
Select multiSelectBox=new Select(multiSelect);
multiSelectBox.selectByIndex(1);
multiSelectBox.selectByIndex(2);
multiSelectBox.selectByIndex(3);
	}
	

}
