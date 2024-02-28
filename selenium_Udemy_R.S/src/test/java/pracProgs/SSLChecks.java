//package pracProgs;
//
//public class SSLChecks {
//
//}


package pracProgs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLChecks {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation_Testing\\Selenium_Udemy\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize(); 
		driver.get("https://www.expired.badssl.com/");
		System.out.println(driver.getTitle());;
		

		
				

	}

}