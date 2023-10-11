package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumlocators {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
	//	Id
	//	name
	//	Classname
	//	cssselector
	//	tagname
	//	xpath
	//	LinkText
	//	PartialLinkText  
		
		driver.get("https://www.ebay.com/");
		
		//  driver.findElement(By.id("APjFqb")).sendKeys("Testing");
	   //	driver.findElement(By.name("q")).sendKeys("Testing");
		    
		//	driver.findElement(By.className("gLFyf")).sendKeys("Testing");
		//	driver.findElement(By.name("_nkw")).sendKeys("Testing");
		driver.findElement(By.className("gh-tb ui-autocomplete-input")).sendKeys("Testing");  //this locator can't find with 2 words
			
			//driver.findElement(By.cssSelector("input[classname = 'gh-tb ui-autocomplete-input']")).sendKeys("Testing");
			
		
		
		
		
	}

}
