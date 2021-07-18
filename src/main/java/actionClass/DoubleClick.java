package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		String url="http://demo.guru99.com/test/simple_context_menu.html";
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Eclipse\\Selenium\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		WebElement el=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions act=new Actions(driver);
		act.doubleClick(el).build().perform();
		Alert al=driver.switchTo().alert();
		al.accept();
		System.out.println(el.getText());
		Thread.sleep(5000);
		driver.close();

	}

}
