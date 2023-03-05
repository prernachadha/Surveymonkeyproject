package webdriverconcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class commonmethod {
	
	public void switchtoframe(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	
	
	public void waitmethod(WebDriver driver, By locator)
	{
		WebDriverWait  wait = new WebDriverWait(driver ,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public String alertmethod(WebDriver driver)
	   {
		Alert amthd = driver.switchTo().alert();
		String atext = amthd.getText();
		return atext;
	       }
	
	public void handlealert(WebDriver driver)
	 {
	   Alert alt = driver.switchTo().alert();
	   alt.dismiss();
	 }

	public void clickmethod(WebElement element)
	    {
	      element.click();
	    }
	
	public void selectvaluefromdropdown(String no, WebElement element)
	     {
	       Select date= new Select(element);
           date.selectByVisibleText(no);
	     }
	public void selectvaluefromdropdown(int value, WebElement element)
          {
          Select month= new Select(element);
          month.selectByIndex(value);
          }
	

}


