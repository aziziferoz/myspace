package variousConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseHover {

	WebDriver driver;

	@BeforeMethod
	public void init() {

		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.dell.com/en-us");

	}

	@Test
	public void testMouseHover() {

		WebElement productElement=driver.findElement(By.xpath("//span[contains(text(),'Products')]"));
		WebElement monitorElement =driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[1]/ul/li[11]/a"));
		WebElement homeElement =driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[1]/ul/li[11]/ul/li[3]/a"));
		
		Actions action = new Actions(driver);
		action.moveToElement(productElement).build().perform();
		action.moveToElement(monitorElement).build().perform();
		homeElement.click();
		
		WebElement MonitorsElement =driver.findElement(By.xpath("//h1[contains(text(),'Monitors & Monitor Accessories')]"));
		
		String str = "Monitors & Monitor Accessories";
		Assert.assertEquals(MonitorsElement.getText(), str, "page not found");
		
	}
}
