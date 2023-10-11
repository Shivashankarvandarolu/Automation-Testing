package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScript_alerts_and_popups {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");// Open URL
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@type='submit' and @name='proceed']")).click();
		Thread.sleep(3000);
		
		Alert unalert = driver.switchTo().alert();
		System.out.println(unalert);
		unalert.accept(); // clicks on ok btn
		
		
	}

}
