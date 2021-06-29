import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Sasi
 *
 */
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//webdriver.chrome.driver//
		
		System.getProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}

}

