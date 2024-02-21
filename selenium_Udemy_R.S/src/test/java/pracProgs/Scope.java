package pracProgs;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {
	
	

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation_Testing\\Selenium_Udemy\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Give me the count of links on a Page.
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Give me the count of links of footer section on a Page.
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//Give me the count of links of 1st coloum of footer section on a Page.
		
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		int AllLinks = columnDriver.findElements(By.tagName("a")).size();
		
		for(int i=1; i<AllLinks; i++)
		{
			String controlClick = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(controlClick);
			
			Thread.sleep(5000);
		}
			Set<String> winHandel= driver.getWindowHandles();
			Iterator<String> IT = winHandel.iterator();
			
			while(IT.hasNext())
			{
				driver.switchTo().window(IT.next());
				System.out.println(driver.getTitle());
			}
		

	}
	

}
