package alertAndCheckBox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoMode {

	public static void main(String[] args) {
		String url="https://www.seleniumeasy.com/test/basic-checkbox-demo.html";
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Eclipse\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver;
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		 driver=new ChromeDriver(options);
	     driver.get(url);
		 driver.close();
		 
		 for(int i=0;i<5;i++) {
			 String str="//table[@class='dataTable']/tbody/tr["+i+"]/td";
			System.out.println(str); 
		 }
		 

	}

}
