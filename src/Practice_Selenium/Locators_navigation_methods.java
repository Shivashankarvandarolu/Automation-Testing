package Practice_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_navigation_methods {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.navigate().to("https://demo.guru99.com/test/selenium-xpath.html");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//Absolute Xpath
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Arjun");
		
		//Relative Basic Xpath
		driver.findElement(By.name("uid"));
		driver.findElement(By.xpath("//*[@name='uid' and @type='text']"));
		driver.findElement(By.xpath("//input[@type='text']"));
		
		//contains() method in Xpath
		driver.findElement(By.xpath("//*[contains(@type,'sub')]"));
		driver.findElement(By.xpath("//*[contains(@name,'btnLog')]"));
		driver.findElement(By.xpath("//*[contains(@value,'LOG')]"));
		driver.findElement(By.xpath("//*[contains(@id,'message')]"));
		
		//or and And
		
		//xpath Starts-with
		driver.findElement(By.xpath("//label[starts-with(@id,'message')]"));
		
		// xpath text() function
		driver.findElement(By.xpath("//*[text(),'UserID']"));
		
		//Xpath axes methods
		
		// following
		//ancestor
		// preceding
		// Descendant
		//child
		//parent
		//self
		//following-sibling
		
	
		
		
		
	}
 
}
