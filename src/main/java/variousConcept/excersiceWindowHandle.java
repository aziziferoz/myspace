package variousConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class excersiceWindowHandle {
WebDriver driver;
	
	@BeforeMethod
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.yahoo.com/?guccounter=1");
		
	}
	
	@Test
	public void testWindowHandle() {
		
		driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("richland college");
		String handle1 =driver.getWindowHandle();
		System.out.println(handle1);
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='ybar-search']")).click();
		String handle2 =driver.getWindowHandle();
		System.out.println(handle2);
		
		driver.findElement(By.xpath("//a[contains(text(),'Richland Community College - Discover')]")).click();
		String handle3 =driver.getWindowHandle();
		//driver.switchTo().window(handle3);	
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//div[@class='main-menu__btn']")).click();
		String handle4=driver.getWindowHandle();
		driver.switchTo().window(handle4);
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
