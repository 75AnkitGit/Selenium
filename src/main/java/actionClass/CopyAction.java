package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyAction {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String url="http://demo.guru99.com/popup.php";
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Eclipse\\Selenium\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        
        
	}

}
