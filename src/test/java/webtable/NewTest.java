package webtable;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeTest
	  public void SetUp() {
		  String url="http://demo.guru99.com/test/web-table-element.php";
			System.setProperty("webdriver.chrome.driver", "D:\\Automation Eclipse\\Selenium\\Driver\\chromedriver.exe");
			
		    driver = new ChromeDriver();
			driver.navigate().to(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);	  
	  }
  @Test
  public void Table() {
	  List<WebElement> li=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
	 int row=li.size();
	
	for(int i=1;i<row;i++) { 
		List<WebElement> column=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td"));
		for(int j=0;j<column.size();j++) {
			System.out.print(column.get(j).getText().toString());
			System.out.print(" ");
		}
		System.out.println();
		
	}
	  
  }
  

  @AfterTest
  public void tearDown() {
	  driver.close();
  }

}
