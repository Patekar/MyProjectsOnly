package IMDBFlow.StepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.webdriver.WebDriverFacade;

public class Common {
	public class CommonSteps {
		
		@Managed
		WebDriverFacade driver;

		@Before
		public void setUp() {
			driver.manage().window().maximize();
		}
		
		@After
	    public void tearDown() {
	    	driver.quit();
	    }
		
	}


}
