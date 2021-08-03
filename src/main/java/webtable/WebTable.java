package webtable;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class WebTable {
  @Test
  public void f() {
  }
  @BeforeTest
  public void SetUp() {
	  String url="https://www.seleniumeasy.com/test/basic-checkbox-demo.html";
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Eclipse\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver;
	    driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void tearDown() {
  }

}
