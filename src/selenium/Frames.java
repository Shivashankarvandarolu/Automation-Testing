package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_attributes_submit");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		driver.findElement(By.id("runbtn")).click();
		
	}

}
