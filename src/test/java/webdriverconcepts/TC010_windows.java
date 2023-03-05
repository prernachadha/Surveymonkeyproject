package webdriverconcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC010_windows {
   public static WebDriver driver;
   
	public static void main(String[] args) throws InterruptedException
	{
      TC006_base base = new TC006_base();
      driver = base.openbrowser("chrome");
      
      driver.get("https://www.facebook.com/");
      
      driver.findElement(By.linkText("Create new account")).click();
      
      String title= driver.getTitle();
      System.out.println(title);
      Thread.sleep(5000);
      driver.findElement(By.linkText("Cookies Policy")).click();
      
      Set<String> ids = driver.getWindowHandles();
      Iterator<String> itr = ids.iterator();
      String first = itr.next();
      String second = itr.next();
      System.out.println(first);
      System.out.println(second);
      driver.switchTo().window(second);
      System.out.println(driver.getTitle());
      Thread.sleep(5000);
    driver.findElement(By.linkText("View printable version")).click();
    
    driver.quit();


	}

}
