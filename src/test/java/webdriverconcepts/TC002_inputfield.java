package webdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002_inputfield {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();//openthe application
		driver.manage().window().maximize();//maximise the window
        
		//open the google application
		driver.get("http://www.google.ca");
	
	     WebElement field = driver.findElement(By.name("q"));//find element
	     //entering value 
	     field.sendKeys("selenium session");
	     //capture value 
	    //String getvalue = driver.findElement(By.name("q")).getAttribute("value");
	  String getvalue = field.getAttribute("value");
	    if(getvalue.equalsIgnoreCase("selenium session"))
	    {
	    	System.out.println(getvalue);
	    }
	    else
	    {
	    	System.out.println("value is not entered");
	    }
	    field.clear();
	    driver.close();
		  //driver.findElement(By.name("q")).sendKeys("selenium topics");

	}

	private static By By(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
