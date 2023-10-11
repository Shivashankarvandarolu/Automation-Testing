package Practice_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Xpath_Locator {
	
	WebDriver  driver;
	
	@BeforeMethod
	public void setup() {
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		 // driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		  driver.get("https://practice.automationtesting.in/my-account/");
		  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		//  driver.findElement(By.xpath("//div[@class='container']/select")).click();
		// driver.findElement(By.xpath("//div[@class='container']/select/child::option[@value='apple']")).click();
		  
		  
	}
	
	// Types of X-path
	@Test(enabled=false)
	public void Chapter1() {
		
	//Absolute X-path
		boolean AXpath= driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div/div[2]/div[1]/div[1]/div/div[1]/article/div/div/form/div[1]/h1")).isDisplayed();
		System.out.println("Register is Visible = " + AXpath);
	//Relative x-path
		boolean RXpath = driver.findElement(By.xpath("//h1[text()='Register']")).isDisplayed();
		System.out.println("Register is Visible = " +RXpath);
		
	}
	
	@Test(enabled=false) // X-path using Attributes
	
	public void chapter2() {
	  driver.findElement(By.cssSelector("input[value='Refresh']")).isDisplayed();
	  driver.findElement(By.xpath("//label[text()='Email']")).isDisplayed();
	  driver.findElement(By.linkText("Sign in into account")).isDisplayed();
	  int tagsize = driver.findElements(By.tagName("input")).size();
	  System.out.println(tagsize);
	  driver.findElement(By.xpath("//input[@type='password']")).isDisplayed();
	  boolean titleimage=driver.findElement(By.xpath("//img[@title='HYR']")).isDisplayed();
	  System.out.println(titleimage);
	  String title= driver.getTitle();
	  System.out.println(title);
	  driver.findElement(By.xpath("//a[@href='https://www.blogger.com/blogger.g?blogID=2026392825261642617&pli=1#']")).click();
	  
	}
	
	@Test (enabled=false)//X-path Operators (=,!=,<,<=,>,>=)
	public void chapter3() {
		//driver.findElement(By.xpath("//input[@maxlength=15]")).sendKeys("Shiva");
		//driver.findElement(By.xpath("//input[@maxlength!=15]")).sendKeys("Arjun");
		//driver.findElement(By.xpath("//input[@maxlength<15]")).sendKeys("Shankar");
		//List<WebElement> element = driver.findElement(By.xpath("//input[@maxlength<=15]"));
		
		//driver.findElement(By.xpath("//input[@maxlength>15]")).sendKeys("Alaska");
		//driver.findElement(By.xpath("//input[@maxlength>=15]")).sendKeys("Amaya");
		
	}
	
	@Test (enabled=false) // X-path Conditions (and, or, not)
	public void chapter4() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@maxlength=15 and  @name='name']")).sendKeys("Shiva");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@maxlength=15 and  @name='namee']")).clear();
		driver.findElement(By.xpath("//input[@maxlength=15 and  @name='name']")).clear();
		driver.findElement(By.xpath("//input[@maxlength=15 or  @name='namee']")).sendKeys("Arjun");
		driver.findElement(By.xpath("//input[@maxlength=15 and  @name='name' and @type='text']")).sendKeys("Arjun");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@maxlength=15 and  @name='name' or @type='teext']")).clear();
		driver.findElement(By.xpath("//input[@maxlength=15 and  @name='name' and @type='tesxt']")).sendKeys("Arjun");
		driver.findElement(By.xpath("//input[@maxlength=15 and  @name='name' not @type='tsext']")).sendKeys("Arjun");
	
	}
	
	@Test (enabled=false) //Xpath with Index
	public void chapter5() {
		String table_element = driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr/td)[22]")).getText();
		System.out.println(table_element);
		
	}
	
	@Test (enabled=false)// xpath with functions(contains, text,Starts-with,Normalize-space,Last,Position)
	
	public void chapter6() {
		driver.findElement(By.xpath("//a[text()='Sign in into account']")).getText();
		driver.findElement(By.xpath("//a[contains(text(),'Sign in in')]")).getText();
		driver.findElement(By.xpath("//h1[contains(text(),'Reg')]")).getText();
		driver.findElement(By.xpath("//div[contains(@class,'container signin')]")).getText();
		driver.findElement(By.xpath("//a[starts-with(text(),'Sign in into')]")).getText();
		driver.findElement(By.xpath("//div[starts-with(@class,'container sign')]")).getText();
		driver.findElement(By.xpath("//label[normalize-space(text())='First Name']"));
		driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[last()]")).getText();
		driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[position()=3]")).getText();
		driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[position()>3]")).getText();
		
		
	}
	
	@Test (enabled=false)//X-path axes Method
	public void chapter7() {
		driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']")).sendKeys("Shiva");
		driver.findElement(By.xpath("//label[text()='Email']/preceding-sibling::input[@maxlength=15]")).sendKeys("Arjun");
		driver.findElement(By.xpath("//div[@class='buttons']/child::button[text()='Register']")).getText();
		driver.findElement(By.xpath("//div[@class='buttons']/child::button[text()='Clear']")).getText();
		driver.findElement(By.xpath("//div[@class='buttons']/child::input[@value='Refresh']")).getText();
		driver.findElement(By.xpath("//td[text()='Francisco Chang']/following-sibling::td[text()='2000']")).getText();
		driver.findElement(By.xpath("//td[text()='Giovanni Rovelli']/preceding-sibling::td/child::input[@type='checkbox']")).getText();
		
		driver.findElement(By.xpath("//input[@type='text'][3]/preceding::label[normalize-space()='First Name']")).getText();
		driver.findElement(By.xpath("(//td[text()='Francisco Chang']/following::tr/td)[15]"));
		driver.findElement(By.xpath("//label[text()='First Name ']/preceding::a[text()='Tech News']"));
		
	}
		
	@Test
	public void chapter8() {
		driver.findElement(By.xpath("//input[@id='reg_email' and @type='email']")).sendKeys("jfjsdfkljnskjdfn@gmail");
		driver.findElement(By.xpath("//input[@id='reg_password' and @type='password']")).sendKeys("wdgqwergfwegweg");
		driver.findElement(By.xpath("//input[@name='register' and @type='submit']")).click();
		
		String Act_error_msg = driver.findElement(By.xpath("//div[@id='customer_login']/preceding::li[1]/strong[normalize-space(text()=' Please provide a valid email address.')]")).getText();
		System.out.println(Act_error_msg);
	}
	
	
	
	@AfterMethod	
	public void teardown() {
	//	driver.quit();
}
	

}
