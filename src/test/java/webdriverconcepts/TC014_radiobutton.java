package webdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC014_radiobutton {
   public static WebDriver driver;
   
	public static void main(String[] args) {
		TC006_base fram = new TC006_base();
				
		driver = fram.openbrowser("chrome");
		driver.get("https://jqueryui.com/droppable/");
	    
		driver.findElement(By.linkText("Checkboxradio")).click(); 
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//label[@for='radio-3']")).click();
	}

}
