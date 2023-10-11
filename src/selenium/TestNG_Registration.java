package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Registration {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Setup() 
	{
		
		driver = new ChromeDriver();
		driver.get("https://practice.automationtesting.in/test-cases/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@Test(priority=1)
	public void Registration_Sign_in() throws InterruptedException 
	{
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.xpath("//*[@name='email' and @id='reg_email']")).sendKeys("Arjnasdf0ddsf7872021@gmail.com");
		driver.findElement(By.xpath("//*[@id='reg_password' and @name='password']")).sendKeys("Arjunarjun@0121");
		driver.findElement(By.name("register")).click();
		Assert.assertEquals(driver.getTitle(),"My Account – Automation Practice Site");
		
	}
	
	@Test(priority=2)
	public void Registration_with_invalid_EmailID() throws InterruptedException
	{
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.xpath("//*[@name='email' and @type='email']")).sendKeys("1222sd34@abcs");
		driver.findElement(By.xpath("//*[@id='reg_password' and @name='password']")).sendKeys("Arjunarjun@0121");
		driver.findElement(By.name("register")).click();
		WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(20));
		webdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Please provide a valid email address')]")));
		
	}
	
	@Test(priority=3)
	public void Registration_with_Empty_Emailid() throws InterruptedException
	{
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.xpath("//*[@name='email' and @id='reg_email']")).sendKeys("");
		driver.findElement(By.xpath("//*[@id='reg_password' and @name='password']")).sendKeys("Arjuna01321@gmail.com");
		driver.findElement(By.name("register")).click();
		WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(20));
		webdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),' Please provide a valid email address')]")));
		
	}
	
	@Test(priority=4)
	public void Registration_with_Empty_password() throws InterruptedException
	{
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.xpath("//*[@name='email' and @id='reg_email']")).sendKeys("Arjunas201321@gmail.com");
		driver.findElement(By.xpath("//*[@id='reg_password' and @name='password']")).sendKeys("");
		driver.findElement(By.name("register")).click();
		WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(20));
		webdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Please enter an account password')]")));
		
	}
	
	@Test(priority=5)
	public void Registration_with_Empty_Emailandpassword() throws InterruptedException
	{
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.xpath("//*[@name='email' and @id='reg_email']")).sendKeys("");
		driver.findElement(By.xpath("//*[@id='reg_password' and @name='password']")).sendKeys("");
		driver.findElement(By.name("register")).click();
		WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(20));
		webdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Please provide a valid email address')]")));
			
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	

}
