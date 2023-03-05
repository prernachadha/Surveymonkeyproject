package webdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC009_frames {
      public static WebDriver driver;
      
	public static void main(String[] args) throws InterruptedException 
	{
		TC006_base fram = new TC006_base();
		driver = fram.openbrowser("chrome");
		driver.get("https://jqueryui.com/droppable/");
		
		//going into the frame
		driver.switchTo().frame(0);
        String text = driver.findElement(By.id("droppable")).getText();
        System.out.println(text);
        Thread.sleep(5000);
        
        //coming out of the frame
        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Selectable")).click();
        
	}

}
