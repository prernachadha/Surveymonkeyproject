package webdriverconcepts;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_012_action {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		TC006_base fram = new TC006_base();
		commonmethod cm = new commonmethod();
		
		driver = fram.openbrowser("chrome");
		driver.get("https://jqueryui.com/droppable/");
		
		//driver.findElement(By.name("s")).sendKeys("selenium");
		
		//cm.switchtoframe(driver, 0);
		//action performed
		Actions action = new Actions(driver);
		action.sendKeys((driver.findElement(By.name("s"))),"Java").build().perform();
		action.click(driver.findElement(By.linkText("JS Foundation"))).build().perform();
		/*action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();*/
		
		/*action.moveToElement(driver.findElement(By.linkText("JS Foundation"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Members")).click();*/
		

	}

}
