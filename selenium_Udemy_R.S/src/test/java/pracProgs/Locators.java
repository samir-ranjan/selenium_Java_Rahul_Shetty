package pracProgs;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Automation_Testing\\\\Selenium_Udemy\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		//driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacadem");
		//driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(5000);
		//System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Samir");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("yoyo@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1234567891");
		//driver.findElement(By.xpath("//button[@class=\"reset-pwd-btn\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"go-to-login-btn\"]")).click();
		//driver.findElement(By.linkText(null))
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
			
		
		
		}
		

}
