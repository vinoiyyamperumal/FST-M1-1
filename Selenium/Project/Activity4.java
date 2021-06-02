package finalActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {

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
	public void Verify2ndHeading() {

		WebElement heading = driver.findElement(By.xpath("//article[@id='post-16']/div/h2"));
		String printHeading = heading.getText();
		System.out.println("Webpage heading is: " + printHeading);
		Assert.assertEquals("Quia quis non", printHeading);
	}

	@AfterMethod
	public void afterMethod() {

		driver.quit();
	}
}
