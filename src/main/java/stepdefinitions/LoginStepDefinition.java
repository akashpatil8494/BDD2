package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "E:\\Java By Kiran\\BDD\\src\\main\\java\\driver\\chromedriver.exe");
	   System.out.println("----------------------------");
	   WebDriver driver= new ChromeDriver();
	   driver.get("http:\\google.com");
	   
	}

	@When("^title is adminlte login$")
	public void title_is_adminlte_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


	
}
