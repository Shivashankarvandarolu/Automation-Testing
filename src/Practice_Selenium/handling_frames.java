package Practice_Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class handling_frames {

		
		WebDriver driver ;
		@BeforeMethod
		public void Setup() {
			driver = new FirefoxDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		}
		@Test
		public void windowhandle() {
			
			String Parentwindowhandle = driver.getWindowHandle();
			System.out.println("Parentwindowhandle - "  + Parentwindowhandle);
			
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Abhimanyu");
			driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
			
			
			Set<String>windowHandles = driver.getWindowHandles();
			for(String windowHandle : windowHandles) 
			{
				System.out.println(windowHandle);
			}
			
		}
		
		
	}

