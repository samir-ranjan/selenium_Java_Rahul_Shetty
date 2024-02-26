package pracProgs;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation_Testing\\Selenium_Udemy\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		 
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> IT = windows.iterator();
		String parentWin = IT.next();
		String childWin = IT.next();
		
		driver.switchTo().window(childWin);
		
		
		System.out.println(windows);
		Thread.sleep(2000);
		
		//WebElement para = driver.findElement(By.xpath("//a[text()='mentor@rahulshettyacademy.com']"));
		//String para = driver.findElement(By.cssSelector(".im-para.red")).getText();
		String para = driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
		System.out.println(para);
		
		//Extracting mailID From Para.
		String MailID = para.split("at")[1].trim().split(" ")[0].trim();
		System.out.println(MailID);
		
		//Taking window handle to Parent Win.
		driver.switchTo().window(parentWin);
		
		driver.findElement(By.id("username")).sendKeys(MailID);
		
	}

	

}
