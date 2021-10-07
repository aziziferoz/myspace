package variousConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class learnKeyboardEvent {
WebDriver driver;
	
	@BeforeMethod
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://techfios.com/billing/?ng=admin/");
		
	}
	
	@Test
	public void testKeyboardEvent() {
		
		
		WebElement userNameElement =driver.findElement(By.xpath("//input[@id='username']"));
		WebElement passwordElement =driver.findElement(By.xpath("//input[@id='password']"));
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
		
		userNameElement.sendKeys("demo@techfios.com");
		passwordElement.sendKeys("abc123");
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		
}
}
