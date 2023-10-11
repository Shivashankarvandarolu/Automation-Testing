package Practice_Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Javascript_alert_fileupload_alert {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[contains(@type,'sub')]")).click();
		
		driver.switchTo().alert().accept();
		
		driver.navigate().to("https://html.com/input-type-file/");
		
		WebDriverWait webwait = new WebDriverWait(driver, Duration.ofSeconds(30));
		webwait.until(ExpectedConditions.visibilityOfElementLocated(By.name("fileupload")));
		
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\Swapna\\Downloads\\Resume_New (3).doc");
		
		
		
		
		
		
	}
}
