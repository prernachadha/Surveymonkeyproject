package testngconcepts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC004_orangehrmapplication {
       WebDriver driver;
	   
       
       @BeforeMethod
       public void setup() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Selenium\\Sellenium Programs\\SelleniumTopics\\config.properties");
		prop.load(fis);
		String appURL =  prop.getProperty("url");
		
    	   
    	   
    	   
    	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(appURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
       
	@Test(priority = 1)
	public void gettitle()
	{
		String title = driver.getTitle();
		System.out.println("Title is   " +title);
		Assert.assertEquals(title, "OrangeHRM" , "application is not opened");
		System.out.println("application is opened");
		}
	@Test(priority=2)
	public void forgotpassword()
	{
		driver.findElement(By.xpath("//div[@class = 'orangehrm-login-forgot']")).click();
		System.out.println("forgot password is clicked");
		//Assert.assertEquals(driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")), "Reset Password", "Reset password button not there");
		//System.out.println("Reset password page is displayed");
		driver.findElement(By.name("username")).sendKeys("Admin");
		Assert.assertEquals(driver.findElement(By.xpath("//button[@type = 'submit']")).getText(), "Reset Password", "Reset page not opened");
		System.out.println("Reset password button is displayed");
		
		//driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
	}
	
	
		
	}
	


