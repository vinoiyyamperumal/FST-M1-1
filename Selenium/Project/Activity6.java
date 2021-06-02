package finalActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity6 {

	WebDriver driver;
	

	@BeforeMethod
	public void beforeMethod() {
		//Create a new instance of the Firefox driver
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		//Open browser
		driver.get("https://alchemy.hguy.co/jobs/");

	}
	
	@Test
	public  void VerifyJobs() throws InterruptedException {

		WebElement jobs = driver.findElement(By.xpath("//li[@id ='menu-item-24']/a"));
		jobs.click();
		driver.findElement(By.xpath("//input[@id = 'search_keywords']")).sendKeys("Banking");
		driver.findElement(By.xpath("//input[@type= 'submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/ul/li[8]/a")).click();
		driver.findElement(By.xpath("//a[@rel = 'next']")).click();
		driver.findElement(By.xpath("//input[@type ='button']")).click();
		WebElement Email = driver.findElement(By.xpath("//a[@class = 'job_application_email']"));
		System.out.println(Email.getText());
		
	}
	
	@AfterMethod
	public void afterMethod() {

		driver.quit();
	}

}
