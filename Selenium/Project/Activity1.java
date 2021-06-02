package finalActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;
	
	@BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/");
    }
	
	@Test
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		
		 Assert.assertEquals("Alchemy Jobs – Job Board Application", title);
	}
	
      
	@AfterMethod
	public void afterMethod() {
		
		driver.quit();
	}
}
