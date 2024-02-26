package pracProgs;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarTest 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation_Testing\\Selenium_Udemy\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		String date = "15";
		String month = "6";
		String year = "2024";
		
		
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
		Thread.sleep(5000);
		
		WebElement datePick = driver.findElement(By.xpath("//button[@class='react-date-picker__calendar-button react-date-picker__button']/../.."));
		datePick.click();
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", datePick);
		
		
		
	}

}
