package Practice_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frame_hyr {
	WebDriver  driver;
	
	@BeforeMethod
	public void setup() {
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		  System.out.println("parent = " + driver.getTitle());

	}
	
	@Test
	public void frame() {
		driver.findElement(By.xpath("//h1[normalize-space()='Frames Practice']/following::input[@id='name']")).sendKeys("Text1");
		
		//driver.switchTo().frame("frm1");
		//Select Course_DD = new Select(driver.findElement(By.id("selectnav1")));
		//Course_DD.selectByVisibleText("-- Automation Testing");
			
		//driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("//h1[normalize-space()='Frames Practice']/following::input[@id='name']")).clear();
		//driver.findElement(By.xpath("//h1[normalize-space()='Frames Practice']/following::input[@id='name']")).sendKeys("Text2");

		//driver.switchTo().frame("frm1");
		//Select Course_DDD = new Select(driver.findElement(By.id("selectnav1")));
		//Course_DDD.selectByVisibleText("YouTube Courses");
		
	//	driver.switchTo().frame("frm2");
	//	System.out.println("Frame2 Title= " +driver.getTitle());
	//	driver.findElement(By.id("//input[@id='firstName']")).sendKeys("Arjunudu");
		
		
	//	driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frm3"); // frame3
		driver.findElement(By.id("name")).sendKeys("Shankar");
		
		driver.switchTo().frame("frm1");
		Select menu = new Select(driver.findElement(By.id("selectnav2")));
		menu.selectByVisibleText("Home");
		
		//driver.switchTo().defaultContent();
		//driver.findElement(By.id("name")).clear();

		
		
	}
	
}
