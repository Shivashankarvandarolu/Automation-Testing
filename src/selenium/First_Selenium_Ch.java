package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class First_Selenium_Ch {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.driver.chrome","C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/selenium/newtours/");
		driver.findElement(By.linkText("REGISTER")).click();
		
		//Excel handling
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Swapna\\OneDrive\\Desktop\\Mercury.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("Sheet5");
		
		int rowcount = sh.getLastRowNum();
		System.out.println(rowcount);
		
		for(int i=1; i<=rowcount ; i++)
		{
			
			XSSFRow rw = sh.getRow(i);
			
			
		// Registration
		
		driver.findElement(By.name("firstName")).sendKeys("Arjun");
		driver.findElement(By.name("lastName")).sendKeys("Abhimanyu");
		driver.findElement(By.name("phone")).sendKeys("8740932608");
		driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("Arjunabhimanyu@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"address1\"]")).sendKeys("Mbnr");
		driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("Mahbubnagar");
		driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys("509001");
		driver.findElement(By.xpath("//input[@name=\"postalCode\"]")).sendKeys("08542");
		
		Select Country = new Select(driver.findElement(By.name("country")));
		Country.selectByVisibleText("ALGERIA");
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("Arjun");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Arjun");
		driver.findElement(By.xpath("//input[@name=\"confirmPassword\"]")).sendKeys("Arjun");
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		
		String Act_String =driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).getText();
		
		String Exp = "Thank you for registering. You may now sign-in using the user name and password you've just entered.";
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		if(Act_String.contentEquals(Exp))
		{
			System.out.println("Test Passd = Registration Success");
		}
		else
		{
			System.out.println("Test Failed");
		}
		}
	}
	
	

}
