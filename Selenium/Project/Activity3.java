package finalActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {

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
	public void VerifyUrl() {

		WebElement image = driver.findElement(By.xpath("//img[@class = 'attachment-large size-large wp-post-image']"));
		String printUrl = image.getAttribute("src");
		System.out.println("URL of the image is: " + printUrl);
		driver.quit();
	}
}
