package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class First_Selenium_firefox {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.chrome","C:\\Softwares\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	}

}
