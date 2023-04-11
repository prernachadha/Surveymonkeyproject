package testconcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc001_testngconcepts {
   public WebDriver driver;
	
   @BeforeMethod
   public void setup() throws IOException
	{
	   Properties prop = new Properties();
	   FileInputStream fis = new FileInputStream("C:\\Selenium\\Sellenium Programs\\SelleniumTopics\\configure.properties");
	   prop.load(fis);
	   String url1 = prop.getProperty("url");
	   
	   
	   
	   
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get(url1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
   
   @AfterMethod
   public void teardown()
   {
	   driver.quit();
   }
	
	@Test
	public void logindisplay()
	{
		String tit = driver.getTitle();
		System.out.println("Title is " +tit);
	}
    @Test
	public void password()
	{
		System.out.println("password is displayed");
	}
}
