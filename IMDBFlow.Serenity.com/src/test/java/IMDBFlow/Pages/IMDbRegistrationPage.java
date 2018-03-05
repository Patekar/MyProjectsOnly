package IMDBFlow.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class IMDbRegistrationPage extends PageObject

{
	
	@FindBy(css="a.create-account")
	WebElementFacade createNewAccountButton;
	public void createANewAccountButton()
	{
		
		createNewAccountButton.click();
	
}
}