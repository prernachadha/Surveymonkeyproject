package testconcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc002_Orange {
	public  WebDriver driver;
	
    @BeforeMethod
	public void setup() throws IOException
	{
    	Properties prop = new Properties();
    	FileInputStream fis = new FileInputStream("C:\\Selenium\\Sellenium Programs\\SelleniumTopics\\conf.properties");
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
	@Test(enabled=false)
    public void title()
    {
    	String tit = driver.getTitle();
    	System.out.println("title is "+tit);
    }
    @Test
	public void forgotpassword()
	  {
	String pass=	driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).getText();
	System.out.println("element clicked is "+pass);
	Assert.assertEquals(pass, "Forgot your password?", "Element clicked is not forgot password");
	System.out.println("Element clicked is forgot password");
    	}
    @Test(priority=1)
    public void login()
              {
    	driver.findElement(By.name("username")).sendKeys("Admin");
    	driver.findElement(By.name("password")).sendKeys("admin123");
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    	String dash = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
    	System.out.println("we are on "+dash+ "page");
    	Assert.assertEquals(dash, "Dashboard", "login is not clicked");
    	System.out.println("Login is clicked");
        }
	
	
    
}
