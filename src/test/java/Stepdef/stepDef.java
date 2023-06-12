
package Stepdef;


import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDef {
	WebDriver driver;
	@Given("I am on the Login page URL {string}")
	public void i_am_on_the_login_page_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.get("https://www.orangehrm.com/");
		driver.getCurrentUrl();
System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I Click on Continue button")
	public void i_click_on_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I am logged in")
	public void i_am_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
}
