package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
	@BeforeMethod
	public void Setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://practice.automationtesting.in/test-cases/");
	}
	
	@Test
	public void valid_username_password() throws InterruptedException
	{	
		String Parenthandle = driver.getWindowHandle();
		System.out.println("Parenthandle - :" + Parenthandle);
		driver.findElement(By.linkText("My Account")).click();
		Set <String> handles = driver.getWindowHandles();
		for(String handle : handles) {
			System.out.println(handle);
		}
		Thread.sleep(2000);
		//driver.findElement(By.id("dismiss-button")).click();
	}
	
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}
}
