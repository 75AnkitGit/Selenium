package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMouseHover {

	public static void main(String[] args) throws InterruptedException {
		String url="https://demoqa.com/menu/";
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Eclipse\\Selenium\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		WebElement menuOption = driver.findElement(By.xpath(".//div[contains(text(),'Music')]"));
		
		act.moveToElement(menuOption).build().perform();
		Thread.sleep(5000);
		driver.close();
		

	}

}
