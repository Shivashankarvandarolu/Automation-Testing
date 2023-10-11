package selenium;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Demo {

		@Test
		public void Registration() throws IOException{
			
			System.setProperty("webdriver.driver.gecko","C:\\Softwares\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://demo.guru99.com/selenium/newtours/");
			driver.findElement(By.linkText("REGISTER")).click();
			
			//Excel handling
			
			FileInputStream fis = new FileInputStream("C:\\Users\\Swapna\\OneDrive\\Desktop\\Mercury.xlsx");
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			XSSFSheet sh = wb.getSheet("Sheet5");
			
			int rowcount = sh.getLastRowNum();
			
			
			for(int i=1; i<=rowcount ; i++)
			{
				
				XSSFRow rw = sh.getRow(i);
				String F_Name = rw.getCell(0).toString();
				String L_Name = rw.getCell(1).toString();
				String Phn = rw.getCell(2).toString();
				String email = rw.getCell(3).toString();
				String  Add = rw.getCell(4).toString();
				String City =rw.getCell(5).toString();
				String Sta = rw.getCell(6).toString();
				String pc = rw.getCell(7).toString();
				String Coun = rw.getCell(8).toString();
				String uname = rw.getCell(9).toString();
				String pw = rw.getCell(10).toString();
				String cpw = rw.getCell(11).toString();
				
				
			// Registration
			
			driver.findElement(By.name("firstName")).sendKeys(F_Name);
			driver.findElement(By.name("lastName")).sendKeys(L_Name);
			driver.findElement(By.name("phone")).sendKeys(Phn);
			driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys(email);
			driver.findElement(By.xpath("//input[@name=\"address1\"]")).sendKeys(Add);
			driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys(City);
			driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys(Sta);
			driver.findElement(By.xpath("//input[@name=\"postalCode\"]")).sendKeys(pc);
			
			Select Country = new Select(driver.findElement(By.name("country")));
			Country.selectByVisibleText(Coun);
			
			driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(uname);
			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(pw);
			driver.findElement(By.xpath("//input[@name=\"confirmPassword\"]")).sendKeys(cpw);
			driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
			
			String Act_String =driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).getText();
			
			String Exp = "Thank you for registering. You may now sign-in using the user name and password you've just entered.";
			
			driver.findElement(By.linkText("REGISTER")).click();
			
			Assert.assertEquals(Act_String, Exp);
			
			}
		}
		
}



