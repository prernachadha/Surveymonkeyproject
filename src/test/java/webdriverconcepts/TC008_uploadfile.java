package webdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;

public class TC008_uploadfile {
     public static  WebDriver driver;
	public static void main(String[] args) {
		
		commonmethod cm = new commonmethod();
		TC006_base open = new TC006_base();
		driver = open.openbrowser("chrome");
		  driver.get("http://the-internet.herokuapp.com/upload");
		  driver.findElement(By.name("file")).sendKeys("C:\\Users\\pchad\\OneDrive\\Desktop\\Tekinspire\\DefectReport (1).xlsx");
       
		  cm.clickmethod(driver.findElement(By.id("file-submit")));
		  
		  
	}

}
