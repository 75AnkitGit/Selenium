package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		String url="https://www.seleniumeasy.com/test/drag-and-drop-demo.html";
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Eclipse\\Selenium\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		WebElement source=driver.findElement(By.xpath("//span[text()='Draggable 1']"));
		WebElement dest=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions act=new Actions(driver);
	   act.clickAndHold(source).moveToElement(dest).release(dest).build().perform();
	   Thread.sleep(5000);
	   driver.close();
		

	}

}
