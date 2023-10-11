package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Locator {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//id Locator
		//driver.findElement(By.id("gh-ac")).sendKeys("Shirts");
		
		// name locator
		//driver.findElement(By.name("_nkw")).sendKeys("Shirts");
		
		// className Locator
		//driver.findElement(By.className("gh-sb")).click();
		
		//cssSelector Locator with name attribute
		
		//driver.findElement(By.cssSelector("input[name='_nkw']")).sendKeys("Shirts");
		//driver.findElement(By.cssSelector("[name='_nkw']")).sendKeys("shirts");
		//driver.findElement(By.cssSelector("*[name='_nkw']")).sendKeys("Shorts");
	
		//cssSelector Locator with ID attribute
		//driver.findElement(By.cssSelector("input[id='gh-ac']")).sendKeys("Shiva");
		//driver.findElement(By.cssSelector("*[id='gh-ac']")).sendKeys("Shiva");
		//driver.findElement(By.cssSelector("[id='gh-ac']")).sendKeys("Arjun");
		
		//cssSelector locator with Classname
		//driver.findElement(By.cssSelector("input[class='gh-tb ui-autocomplete-input']")).sendKeys("Shiva");
		//driver.findElement(By.cssSelector("*[class='gh-tb ui-autocomplete-input']")).sendKeys("Shiva");
		//driver.findElement(By.cssSelector("input[role='combobox']")).sendKeys("Arjun");
		
		//xpath
		
		//Absolute xpath
		//driver.findElement(By.xpath("/html/body/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[1]/div[1]/div/input[1]")).sendKeys("Winter wear");
		
		//Relative xpath
		//driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Rainy Season");
		//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Summer");
		//driver.findElement(By.xpath("//*[@type='text']")).clear();
		//driver.findElement(By.xpath("//*[@type='text' and @id='gh-ac']")).sendKeys("Sports");
		//driver.findElement(By.xpath("//*[@type='submit' or @value='search']")).click();
		
		// Tagname locator
		//int alinkcount = driver.findElements(By.tagName("a")).size();
		//int inputlinkcount = driver.findElements(By.tagName("input")).size();
		//System.out.println(alinkcount);
		//System.out.println(inputlinkcount);
		
		//linktext locator
		//driver.findElement(By.linkText("Collectibles and Art")).click();
		
		//partialLinkTexr locator
		//driver.findElement(By.partialLinkText("Collectible")).click();
		
		//mousehover events
		
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.linkText("Electronics"))).build().perform();
		driver.findElement(By.linkText("Apple")).click();	
		
		
		

		
		
		
	}

}
