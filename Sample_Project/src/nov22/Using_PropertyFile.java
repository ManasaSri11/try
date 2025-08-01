package nov22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_PropertyFile {
	WebDriver driver;
	Properties conpro;
	@Test
	public void startTest() throws Throwable
	{
		conpro = new Properties();
		conpro.load(new FileInputStream("Login.properties"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(conpro.getProperty("Url"));
		driver.findElement(By.xpath(conpro.getProperty("Objuser"))).sendKeys(conpro.getProperty("EnterUser"));
		driver.findElement(By.xpath(conpro.getProperty("Objpass"))).sendKeys(conpro.getProperty("EnterPass"));
		driver.findElement(By.xpath(conpro.getProperty("ObjLogin"))).click();
		Thread.sleep(3000);
		String Expected = "dashboard";
		String Actual = driver.getCurrentUrl();
		if((Actual).contains(Expected))
		{
			Reporter.log("Login success:::"+Expected+"  "+Actual,true);
		}
		else
		{
			String errormessage = driver.findElement(By.xpath(conpro.getProperty("ObjError"))).getText();
			Reporter.log(errormessage+" "+Expected+" "+Actual,true);
		}
		driver.quit();
	}
	

}
