package StepDefinitions;

import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;


public class loginclass {
	
	@Given("^user is on the Amazon website$")
	
	public void user_is_on_Home_Page() {
	WebDriver driver= new FirefoxDriver();
	driver.get("http://www.amazon.in");

	}
		
	}