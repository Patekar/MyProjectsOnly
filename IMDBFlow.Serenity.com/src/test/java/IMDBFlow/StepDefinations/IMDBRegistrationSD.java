package IMDBFlow.StepDefinations;

import IMDB.Test.steps.NavigatingUser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IMDBRegistrationSD {

	NavigatingUser User;
	
	@Given("^I am on Homepage$")
	public void i_am_on_Homepage() throws Exception {
		User.iAmOnHomepage();
	   
	}


	@When("^I click on (.*)$")
	public void i_click_on(String arg1) throws Exception {
		
		User.clickOnOtherSignInOptions();
		User.createANewAccount();
    
	}

	@When("^filling the registration form$")
	public void filling_the_registration_form() throws Exception {
		
	    
	}

	@Then("^I verify that newly registered user is able to login to the application$")
	public void i_verify_that_newly_registered_user_is_able_to_login_to_the_application() throws Exception {
	  
	}

	@When("^I click LogOut from the application$")
	public void i_click_LogOut_from_the_application() throws Exception {
	   
	}

	@Then("^I verify user's logout state\\.$")
	public void i_verify_user_s_logout_state() throws Exception {
	   
	}

}