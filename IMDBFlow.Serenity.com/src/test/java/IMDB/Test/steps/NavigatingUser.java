package IMDB.Test.steps;

import IMDBFlow.Pages.IMDbHomePage;
import IMDBFlow.Pages.IMDbRegistrationPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;



public class NavigatingUser extends ScenarioSteps {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	IMDbHomePage Homepage;
	IMDbRegistrationPage RegistrationPage;
	
	@Step
	public void iAmOnHomepage() {
	
		Homepage.open();}
	
	@Step
	public void clickOnOtherSignInOptions()
	{
		Homepage.clickOtherSignInOptionsLinkk();
	}
	
	@Step
	public void createANewAccount()
	{
		RegistrationPage.createANewAccountButton();
	}
		
		
	

}
