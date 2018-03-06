package IMDB.Test.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IMDBFlow.Pages.IMDbSearchPage;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchFeature extends ScenarioSteps {

	@FindBy(css="table.chart > tbody > tr > td.titleColumn")
	private List<WebElement> popularResultTitles;
	
	private WebDriver driver;
	public void PopularTVShowsResultsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickMostPopularTVShowsOnIMDb() {
		// TODO Auto-generated method stub
		boolean flag = false;
		CharSequence title = null;
		for (WebElement resTitle : popularResultTitles) {
			if(resTitle.getText().contains(title))
			{
				flag = true;
				resTitle.findElement(By.xpath(".//a")).click();
				break;
			}
		}
		if(!flag)
			Assert.fail("Specified title ["+title+"] was not found...!");
	}

}
