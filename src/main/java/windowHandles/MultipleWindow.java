package windowHandles;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String url="http://demo.guru99.com/popup.php";
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Eclipse\\Selenium\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        String Parenthandle=driver.getWindowHandle();
        Set<String> set=driver.getWindowHandles();
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()) {
        	String child=itr.next();
        	if(!Parenthandle.equalsIgnoreCase(child)) {
        		driver.switchTo().window(child);
        		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("er@mail.com");
        		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
        	}
        	
        }
        driver.close();
	}

}
