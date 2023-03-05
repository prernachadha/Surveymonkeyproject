package webdriverconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC004_link {
 static boolean status= true;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
	         driver.get("https://www.facebook.com/");
	         driver.manage().window().maximize();
	          
	             List<WebElement> linkn = driver.findElements(By.tagName("a"));
	             int lks= linkn.size();
	             System.out.println(lks);
	          
	             for(int i=0 ; i< lks; i++)
	             {
	            	String text = linkn.get(i).getText();
	            	if(text.equalsIgnoreCase("Create new account"))
	            	{
	            		
	            		status = true;
	            		//System.out.println("pass");
	            		break;
	            	}else
	            		
	            		{status = false;
	            		//System.out.println("fail");
	            	}
	             }
	             if (status == true)
	            		 System.out.println("pass");
	             else 
	            	System.out.println("fail");
	             /* if(text.isEmpty() == false) {
	              System.out.println(text);}
	             }*/
	          /*WebElement emailid = driver.findElement(By.name("email"));
	          emailid.sendKeys("pchadha79@gmail.com");
	        String mail  = emailid.getAttribute("value");
	          System.out.println(mail);*/
	          //driver.findElement(By.name("email")).clear();
	             
	          //finding link
	          String lnktext  = driver.findElement(By.linkText("Create a Page")).getText();
	          //System.out.println(lnktext);
	          //driver.findElement(By.linkText("Create a Page")).click();
	          
	          
	          
	          driver.close();
	          
	          
	         

	}

}
