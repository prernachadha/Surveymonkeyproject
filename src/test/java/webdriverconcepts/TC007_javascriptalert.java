package webdriverconcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC007_javascriptalert {
	  public static WebDriver  driver;

	public static void main(String[] args) {
		//calling methods
		TC006_base b1 =  new TC006_base();
		commonmethod cm = new commonmethod();
		
		 driver =     b1.openbrowser("edge");
		 
		 //opening application
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 
		 cm.clickmethod(driver.findElement(By.name("proceed"))); 
		 
		 String atext  = cm.alertmethod(driver);
		 
		 cm.handlealert(driver);
		 //handling alerts
		System.out.println("popup box is displaying "  +atext);
		
		if(atext.equalsIgnoreCase("Please enter a valid user name"))
		{
			System.out.println("message is displayed");
		}
		else
		{System.out.println("message is not displayed");
		}
		}
		

	}


