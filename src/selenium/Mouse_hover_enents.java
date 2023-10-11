package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover_enents {

public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ebay.com/");
	
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	// Mouse over events
	Actions builder = new Actions(driver);
	
	builder.moveToElement(driver.findElement(By.linkText("Fashion"))).build().perform();
	
	Thread.sleep(3000);
	
	builder.moveToElement(driver.findElement(By.linkText("Sports"))).build().perform();
	
	Thread.sleep(5000);
	driver.findElement(By.linkText("Cycling")).click();
}


}
