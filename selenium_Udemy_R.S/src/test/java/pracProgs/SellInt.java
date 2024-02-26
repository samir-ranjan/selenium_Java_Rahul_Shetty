package pracProgs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SellInt {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Invoke Browser
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Udemy\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();


	}

	

}
