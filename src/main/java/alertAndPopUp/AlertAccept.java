package alertAndPopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAccept {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		String url="http://demo.guru99.com/test/delete_customer.php";
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Eclipse\\Selenium\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		System.out.print(alert.getText());
		
		Thread.sleep(5000);
		alert.accept();
		alert.accept();
		
		driver.close();
	}

}
