package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserwindowpopup_Adevertisment_popup {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("vijay81");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("vijay81");
		driver.findElement(By.xpath("//*[@name='submit']")).click();
		driver.findElement(By.linkText("Flights")).click();
		
		driver.switchTo().frame("iframe");
		driver.close();
		driver.switchTo().defaultContent();
		

		
		

	}

}
