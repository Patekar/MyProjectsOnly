package IMDBFlow.StepDefinations;

import IMDB.Test.steps.SearchFeature;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IMDBSearchSD {


SearchFeature Search;

@Given("^The \"([^\"]*)\" is opened$")
public void the_is_opened(String arg1) throws Exception {
	
	
}


@Given("^I am on HomePage$")
public void i_am_on_HomePage() throws Exception {
    
}

@When("^selecting (.*) in (.*)$")
public void selecting_in(String arg1, String arg2) throws Exception {

	Search.clickMostPopularTVShowsOnIMDb();
	
    
}

@When("^Click on \"([^\"]*)\"$")
public void click_on(String arg1) throws Exception {
    
}

@Then("^I verify that creator name is \"([^\"]*)\" in results$")
public void i_verify_that_creator_name_is_in_results(String arg1) throws Exception {
   
}


}
