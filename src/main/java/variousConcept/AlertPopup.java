package variousConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertPopup {
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
	public void testAlertPopup() {
		
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
		//Alert Popup code is in below;
		// driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().getText();
		// driver.switchTo().alert().sendKeys("Text");
		
		String alert = driver.switchTo().alert().getText();
		System.out.println(alert);
		driver.switchTo().alert().accept();
		
	}
	
}
