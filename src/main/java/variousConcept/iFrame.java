package variousConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iFrame {
WebDriver driver;
	
	@BeforeMethod
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		
	}
	
	@Test
	public void testiFrame() {
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("java.awt")).click();
		//below line of code will take us back to the default page
		driver.switchTo().parentFrame();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[contains(text(),'Adjustable')]")).click();
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("classFrame");
		
		String str = "Interface Adjustable";
		WebElement adjustable =driver.findElement(By.xpath("//h2[@title='Interface Adjustable']"));
		Assert.assertEquals(adjustable.getText(), str, "Not Available");
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
		driver.quit();
	}
	
	
}
