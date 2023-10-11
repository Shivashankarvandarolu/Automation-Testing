package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ObjectRepository_Desgin_Pattern {
	
	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.driver.gecko","C:\\Softwares\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://demo.guru99.com/selenium/newtours/");
	
	FileInputStream fis = new FileInputStream("F:\\Automation Testing\\QA_shiva\\AT_Web\\src\\selenium\\object.property");
	Properties p = new Properties();
	p.load(fis);
	
	
	
	driver.findElement(By.name(p.getProperty("un"))).sendKeys("vijay81");
	driver.findElement(By.xpath(p.getProperty("pw"))).sendKeys("vijay81");
	driver.findElement(By.xpath(p.getProperty("sign-in"))).click();
	
	// Reserving Flight
	driver.findElement(By.linkText(p.getProperty("link"))).click();
	driver.findElement(By.xpath(p.getProperty("triptype"))).click();
	
	Select Passen = new Select(driver.findElement(By.name(p.getProperty("p_count"))));
	Passen.selectByIndex(1);
	
	Select from = new Select(driver.findElement(By.name(p.getProperty("dept"))));
	from.selectByVisibleText("Frankfurt");
	
	Select to = new Select(driver.findElement(By.name(p.getProperty("arri"))));
	to.selectByVisibleText("Paris");
	
	driver.findElement(By.xpath(p.getProperty("service"))).click();
	
	Select a_line = new Select(driver.findElement(By.name(p.getProperty("airlinetype"))));
	a_line.selectByVisibleText("Pangea Airlines");
	
	driver.findElement(By.name(p.getProperty("continue"))).click();
	
	
	}
}
