package finalActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 {

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
	public  void PostJOb() throws InterruptedException {

		WebElement PostaJob = driver.findElement(By.xpath("//a[contains(text(),'Post a Job')]"));
		PostaJob.click();
		driver.findElement(By.xpath("//a[@class ='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		driver.findElement(By.xpath("//input[@id='job_title']")).sendKeys("Testing");
		Thread.sleep(2000);
		driver.switchTo().frame("job_description_ifr");
		driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Testing");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@class='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='job_preview_submit_button']")).click();
		driver.findElement(By.xpath("//li[@id ='menu-item-24']/a")).click();
		Thread.sleep(2000);
		
	}
	
	@AfterMethod
	public void afterMethod() {

		driver.quit();
	}

}
