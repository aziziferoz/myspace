package variousConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alertpopopexcersice {
WebDriver driver;
	
	@BeforeMethod
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
	}
	
	@Test
	public void testAlertpopop() {
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().alert().dismiss();
		
		
	}
}
