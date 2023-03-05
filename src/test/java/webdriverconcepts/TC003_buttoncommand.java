package webdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC003_buttoncommand {

	public static void main(String[] args) {
	
    WebDriverManager.chromedriver().setup();

      WebDriver driver = new ChromeDriver();
         driver.get("http://www.facebook.com");
          driver.manage().window().maximize();
          
          //count number of links
          
        
          //finding element
          WebElement login   = driver.findElement(By.name("login"));
        
        //check if button is displayed
           
        //System.out.println(driver.findElement(By.name("login")).isDisplayed());
          boolean status = login.isDisplayed();
          System.out.println(status);
          
          //click
          login.click();
          
        //driver.close();
           
    	
    
    
	}

}
