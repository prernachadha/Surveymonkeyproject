package webdriverconcepts;

import java.util.List;

import org.jsoup.Connection.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC005_dropdown {
   public static  WebDriver driver;
     
	public static void main(String[] args) throws InterruptedException {
	  
		TC006_base ca = new TC006_base();
	    driver	= ca.openbrowser("chrome");
	 	driver.get("https://www.facebook.com/");
	 	driver.findElement(By.linkText("Create new account")).click();
	 	Thread.sleep(5000);
	 	
	    commonmethod  common = new commonmethod();
        common.selectvaluefromdropdown(10, driver.findElement(By.id("day")));
        common.selectvaluefromdropdown("May", driver.findElement(By.id("month")));
        common.selectvaluefromdropdown("1979",driver.findElement(By.id("year")));
    
    
    
	
	}
}
	/*Boolean status = true;
	//select day
	Select day = new Select(driver.findElement(By.id("day")));
	     day.selectByValue("26");
	//select month
	 Select month   = new Select(driver.findElement(By.id("month")));
	    month.selectByVisibleText("May");
	//select year
	    
	 Select year= new Select(driver.findElement(By.id("year")));
	      year.selectByValue("1979");
	      List<WebElement> option = year.getOptions();
	         int size     = option.size();
	         System.out.println(size);
	         for(int i=0 ; i < size; i++)
	         {
	          String value= option.get(i).getText();
	          System.out.println(value);
	          String value1 = "2020";
	          if(value.equalsIgnoreCase(value1)) {
	        	   	status=true;
	        	    break;
	                }
	         else {
	      		status=false;
	              }
	          }
	        if(status == true)
        	{
	        System.out.println("year is present");
        	}
	        else
        	{
	        	System.out.println("year not present");
        	}
	        ca.closebrowser();
	}
}*/
        	

       