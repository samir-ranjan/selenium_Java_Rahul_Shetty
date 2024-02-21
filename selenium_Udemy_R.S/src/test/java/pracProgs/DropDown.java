package pracProgs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation_Testing\\Selenium_Udemy\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
//		int i = 1;
//		while(i<=5)
//		{
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}
//		for(int i=1;i<5;i++)
//		{
//			driver.findElement(By.id("hrefIncAdt")).click();
//
//		}
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//
//		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[text()=' Bengaluru (BLR)']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();

		//driver.findElement(By.xpath("(//a[text()=' Chennai (MAA)'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[text()=' Chennai (MAA)']")).click();


	}

}
