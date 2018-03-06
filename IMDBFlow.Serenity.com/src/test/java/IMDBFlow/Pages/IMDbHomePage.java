package IMDBFlow.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("http://www.imdb.com/")
public class IMDbHomePage extends PageObject {
	@FindBy(id="nblogin")
	protected WebElementFacade otherSignInoptionss;
	
	public void clickOtherSignInOptionsLinkk() {
		otherSignInoptionss.click();
		
	}
	
	
}
