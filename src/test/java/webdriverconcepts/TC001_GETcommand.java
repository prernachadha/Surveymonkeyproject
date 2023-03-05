package webdriverconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_GETcommand {

	public static void main(String[] args) {
		String title = "Google";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();//openthe application
		driver.manage().window().maximize();//maximise the window
        
		//open the google application
		driver.get("http://www.google.ca");
		String url = driver.getCurrentUrl();
		System.out.println("Cuttent URL is " + url);
		
		
		//capture title
		
		String capt =driver.getTitle();
		System.out.println(capt);
		if(title.equalsIgnoreCase(capt))
		{
			System.out.println("google application is opened");
		}
			else
				{System.out.println("google application is not opened");
		
			
		}
		
		driver.close();
		
	}

}
