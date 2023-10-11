package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Mercury_Login_Flight_Reservation {

	@Test
	public void Login() {
		System.setProperty("webdriver.driver.gecko","C:\\Softwares\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/selenium/newtours/");
		
		// Login
		driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("vijay81");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("vijay81");
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		
		// Reserving Flight
		driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.xpath("//input[@value=\"oneway\"]")).click();
		
		Select Passen = new Select(driver.findElement(By.name("passCount")));
		Passen.selectByIndex(1);
		
		Select from = new Select(driver.findElement(By.name("fromPort")));
		from.selectByVisibleText("Frankfurt");
		
		Select to = new Select(driver.findElement(By.name("toPort")));
		to.selectByVisibleText("Paris");
		
		driver.findElement(By.xpath("//input[@value=\"Coach\"]")).click();
		
		Select a_line = new Select(driver.findElement(By.name("airline")));
		a_line.selectByVisibleText("Pangea Airlines");
		
		driver.findElement(By.name("findFlights")).click();
		
	}
}
