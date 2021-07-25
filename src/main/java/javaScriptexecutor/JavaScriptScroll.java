package javaScriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptScroll {

	public static void main(String[] args) throws InterruptedException {
		String url="http://moneyboats.com/";
		System.setProperty("webdriver.chrome.driver", "D:\\\\Automation Eclipse\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(5000);
		driver.close();

	}

}
