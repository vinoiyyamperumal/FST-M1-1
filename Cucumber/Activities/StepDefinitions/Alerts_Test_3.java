package StepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class Alerts_Test_3 {
	  WebDriver driver;
	  WebDriverWait wait;
	  Alert alert;
	  
	  @Given("^User is on the page$")
	  public void user_is_on_page() {
	  driver= new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/javascript-alerts");
	  	  }
	  
	  @When("^User clicks the Simple Alert button$")
	  public void simple() {
		  driver.findElement(By.id("simple")).click();
	  }
	  @When("^User clicks the Confirm Alert button$")
	  public void Confirmation() {
		  driver.findElement(By.id("confirm")).click();
	  }
	  @When("^User clicks the Prompt Alert button$")
	  public void Prompt() {
		  driver.findElement(By.id("prompt")).click();
	  }
	  
	 @Then("^Alert opens$")
	 public void switch_alert() {
		 alert= driver.switchTo().alert() ;
	 }
	 @And("^Read the text from it and print it$")
	    public void readAlert() {
	        System.out.println("Alert says: " + alert.getText());
	    }
	 
	    @And("^Write a custom message in it$")
	    public void writeToPrompt() {
	        alert.sendKeys("Custom Message");
	    }
	 
	    @And("^Close the alert$")
	    public void closeAlert() {
	        alert.accept();
	    }
	 
	    @And("^Close the alert with Cancel$")
	    public void closeAlertWithCAncel() {
	        alert.dismiss();
	    }
	 
	    @And("^Close Browser$")
	    public void closeBrowser() {
	        driver.close();
	    }
	}