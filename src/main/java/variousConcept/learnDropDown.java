package variousConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class learnDropDown {

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
	public void homeWork() {
		
		// the code for DropDown is;
		// Select sel = new Select(); DropDown Class/object
		//sel.selectByVisibleText("value"); DropDown Method
		WebElement userNameElement =driver.findElement(By.xpath("//input[@id='username']"));
		WebElement passwordElement =driver.findElement(By.xpath("//input[@id='password']"));
		WebElement loginButtonElement =driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
		
		userNameElement.sendKeys("demo@techfios.com");
		passwordElement.sendKeys("abc123");
		loginButtonElement.click();
		
		WebElement customerElement =driver.findElement(By.xpath("//span[contains(text(),'Customers')]"));
		customerElement.click();
		
		WebElement addCustomerElement =driver.findElement(By.xpath("//a[contains(text(),'Add Customer')]"));
		addCustomerElement.click();
		
		WebElement contactsElement =driver.findElement(By.xpath("//h2[contains(text(),' Contacts ')]"));
		
		WebElement conutryElement = driver.findElement(By.xpath("//select[@id='cid']"));
		
		Select sel = new Select(conutryElement);
		sel.selectByVisibleText("Techfios");
		
		
		
		
		
		
		
		
		
//		String str = "Contacts";
//		Assert.assertEquals(contactsElement.getText(), str, "Contacts page not found");
//	
//		WebElement fullNameElement =driver.findElement(By.xpath("//input[@id='account']"));
//		fullNameElement.sendKeys("Ajmal");
		
//		WebElement companyElement =driver.findElement(By.xpath("//select[@id='cid']"));
//		
//		Select sel = new Select(companyElement);
//		sel.selectByVisibleText("Techfios");
//
//		WebElement emailElement =driver.findElement(By.xpath("//input[@name='email']"));
//		emailElement.sendKeys("abc123@techfios.com");
//		
//		WebElement phoneElement =driver.findElement(By.xpath("//input[@name='phone']"));
//		phoneElement.sendKeys("56235689");
//		
//		WebElement addressElement =driver.findElement(By.xpath("//input[@name='address']"));
//		addressElement.sendKeys("542 N mcarthur BLLVD");
//		
//		WebElement cityElement =driver.findElement(By.xpath("//input[@name='city']"));
//		cityElement.sendKeys("Richardson");
//		
//		WebElement stateElement =driver.findElement(By.xpath("//input[@id='state']"));
//		stateElement.sendKeys("Tx");
//		
//		WebElement zipElement =driver.findElement(By.xpath("//input[@id='zip']"));
//		zipElement.sendKeys("89565");
//		
//		WebElement countryElement =driver.findElement(By.xpath("//select[@name='country']"));
//		Select sel2 = new Select(countryElement);
//		sel2.selectByVisibleText("Afghanistan");
//		
//		WebElement tagsElement =driver.findElement(By.xpath("//select[@id='tags']"));
//		Select sel3 = new Select(tagsElement);
//		sel3.selectByVisibleText("My tags");
		
}
}
