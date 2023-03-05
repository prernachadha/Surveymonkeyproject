package webdriverconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC015_tables {
      public static WebDriver driver;
	public static void main(String[] args) {
	    String exval = "Island Trading";
	    boolean status = true;
		TC006_base base = new TC006_base();
		driver = base.openbrowser("chrome");
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
        //finding row value by xpath
		String rowvalue =driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[1]")).getText();
		System.out.println(rowvalue);
		
		//count the number of rows
		List<WebElement> noofrows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
		System.out.println("total no of rows  " +noofrows.size());
		for(int i=0 ; i < noofrows.size(); i++)
		{
			String text = noofrows.get(i).getText();
			if(text.equalsIgnoreCase(exval))
			{
				status = true;
				break;
			}
			else
			{
				status= false;
			}
		}
			if(status == true)
			System.out.println("value is present");
			else
			System.out.println("value not present");	
		
		base.closebrowser();
	}
	}


