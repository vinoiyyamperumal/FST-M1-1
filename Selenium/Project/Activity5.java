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

public class Activity5 {

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
	public  void VerifyJobs() {

		WebElement jobs = driver.findElement(By.xpath("//li[@id ='menu-item-24']/a"));
		jobs.click();
		String  printHeading= driver.getTitle();

		System.out.println("Webpage heading is: " + printHeading);
		Assert.assertEquals("Jobs – Alchemy Jobs", printHeading);
	}

	@AfterMethod
	public void afterMethod() {

		driver.quit();
	}
}

