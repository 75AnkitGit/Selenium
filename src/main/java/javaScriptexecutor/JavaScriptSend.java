package javaScriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptSend {

	public static void main(String[] args) throws InterruptedException {
		String url="http://www.seleniumframework.com/Practiceform/";
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Eclipse\\Selenium\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(5000);
		WebElement email=driver.findElement(By.xpath("//p/input[@name='email']"));
		js.executeScript("arguments[0].value='75an@mail.com';", email);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Subscribe']")).click();
		driver.close();
		
		

	}

}
