package finalActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		// Create a new instance of the Firefox driver
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Open browser
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");

	}

	@Test
	public void PostJOb() throws InterruptedException {

		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		driver.findElement(By.xpath("//a[@class='wp-has-submenu wp-not-current-submenu menu-top menu-icon-job_listing menu-top-last']/div[3]")).click();
		driver.findElement(By.xpath("//a[@class='page-title-action']")).click();
	}
}
