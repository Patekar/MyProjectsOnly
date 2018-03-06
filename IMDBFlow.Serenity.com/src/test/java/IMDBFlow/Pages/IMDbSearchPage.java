package IMDBFlow.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class IMDbSearchPage extends PageObject{
	@FindBy(css="#navTitleMenu span.downArrow")
	protected WebElementFacade navigationMoviesMenu;
	@FindBy(xpath="//a[text()='Most Popular TV Shows']")
	protected WebElementFacade popularTVShowsonIMDb;
	
	public IMDbSearchPage clickMostPopularTVShowsOnIMDb()
	{
		navigationMoviesMenu.click();
		new WebDriverWait(getDriver(),10).until(ExpectedConditions.elementToBeClickable(popularTVShowsonIMDb)).click();
		return this;
	}
	
	

}
