package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mystepdefinations {
	@Given("^user is in the login page$")
	public void user_is_in_the_login_page(){
		//selenium code to go to login page
		System.out.println("user  is in the login page for Gmail");
	}
	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
	  System.out.println("user Entered valid username and password");
	}
	@And("clicks on signin button")
	public void clicks_on_signin_button() {
	  System.out.println("Cliked on sigin button");
	}
	@Then("sucessfully login should happen")
	public void sucessfully_login_should_happen() {
	   System.out.println("Logged in sucessfully");
	}
	@When("user enter invalid username and password")
	public void user_enter_invalid_username_and_password() {
	  System.out.println("user entered invalid username and password");
	}
	@Then("sucessfully login should not happen")
	public void sucessfully_login_should_not_happen() {
	    System.out.println("Logged in not happened");
	}

	@When("user entered valid username as {string} and password as {string}")
	public void user_entered_valid_username_as_and_password_as(String cname, String cpassword) {
	   System.out.println("user entered username as "+cname+" and password as "+cpassword);
	}
	
	
}
