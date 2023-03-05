package webdriverconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC006_base {
	 
	public static WebDriver driver;
	
	/***
	 * To open browser based on test
	 * @param browsername
	 * @return
	 */
       public WebDriver openbrowser(String browsername)
       {
    	   if(browsername.equalsIgnoreCase("chrome"))
    	   {    	   
    	   WebDriverManager.chromedriver().setup();
    	   driver = new ChromeDriver();
    	   System.out.println("Chrome is installed");
    	   }
    	   else
    	   {    	   
    	   WebDriverManager.edgedriver().setup();
    	   driver = new EdgeDriver();
    	   System.out.println("Edge is installed");
    	   }
    	   driver.manage().window().maximize();
    	   return driver;
       }
       
       public void closebrowser() {
    	   driver.quit();
      
       }
       
}
