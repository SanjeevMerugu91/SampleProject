package stepDefinations;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MystepsForRegister {
//hot key to import all packages --->ctrl+shift+o
@Given("user is in the register page")
public void user_is_in_the_register_page() {
    System.out.println("user is inthe register page");
}
@When("user enter following details")
public void user_enter_following_details(io.cucumber.datatable.DataTable dt) {
   List<List<String>> cells = dt.cells();
  
  String fname = cells.get(0).get(0);
  String lname = cells.get(0).get(1);
  String email = cells.get(1).get(0);
  String phone = cells.get(1).get(1);
  System.out.println("user entered first name as "+fname+" and entred last name as "+lname+" and email as "+email+" and phone as "+phone);
}
@And("click on register button")
public void click_on_register_button() {
    System.out.println("clicked on register button");
}
@Then("account should be create sucessfully")
public void account_should_be_create_sucessfully() {
   System.out.println("Account created sucessfully");
}

}
