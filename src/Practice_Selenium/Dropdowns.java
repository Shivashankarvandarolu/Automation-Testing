package Practice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dropdowns {
	
	public WebDriver driver;
	
	@Test
	public void setup() throws InterruptedException {
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		/*
		 * driver.get("https://demo.guru99.com/test/newtours/register.php");
		 * Select Country = new
		 * Select(driver.findElement(By.xpath("//select[@name='country']"))); //
		 * Country.selectByIndex(2); Country.selectByVisibleText("ARUBA");
		 */
		
		driver.get("https://www.ebay.com/");
		//driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		Thread.sleep(300);
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//div[@class='hl-cat-nav__expander']//preceding::a[text()='Electronics'][1]"))).build().perform();
		//driver.findElement(By.xpath("//a[contains(text(),'Electric Vehicles')]")).click();
	}

}
