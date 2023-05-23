
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class google {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
ChromeOptions options=new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/s?k=login+amazon+account&adgrpid=59671903835&ext_vrnc=hi&gclid=EAIaIQobChMIg-aQ2p2v-QIVSZJmAh1YSgrKEAAYASAAEgJU1vD_BwE&hvadid=398134035836&hvdev=c&hvlocphy=9061927&hvnetw=g&hvqmt=e&hvrand=13122101049172007853&hvtargid=kwd-837441119212&hydadcr=24542_1971411&tag=googinhydr1-21&ref=pd_sl_2cwzc6x246_e");

	}

}
