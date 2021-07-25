package seleniumWait;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ImplicitWait {


	

	private WebDriver driver;
	private String baseUrl;
	private WebElement element;

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver", "D:\\\\Automation Eclipse\\\\Selenium\\\\Driver\\\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	baseUrl = "http://www.google.com";
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testUntitled() throws Exception {
	driver.get(baseUrl);
	element = driver.findElement(By.name("q"));
	element.sendKeys("Selenium WebDriver Interview questions");
	element.sendKeys(Keys.RETURN);
	List<WebElement> list = driver.findElements(By.className("_Rm"));
	System.out.println(list.size());

	}

	@AfterMethod
	public void tearDown() throws Exception {
	driver.quit();
	}
}

