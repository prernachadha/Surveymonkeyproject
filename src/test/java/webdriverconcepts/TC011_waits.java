package webdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC011_waits {
     public static WebDriver driver;
     
	public static void main(String[] args) {
		
		TC006_base base = new TC006_base();
		commonmethod cm = new commonmethod();
		
		driver = base.openbrowser("chrome"); 
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		
		
		cm.waitmethod(driver, By.name("firstname"));
		
		/*WebDriverWait  wait = new WebDriverWait(driver ,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));*/
		
		driver.findElement(By.name("firstname")).sendKeys("Prerna");
		
		}

}
