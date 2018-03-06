package IMDBFlow.Serenity.com.IMDBFlow.Serenity.com;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/java/IMDBFlow/FeatureFiles/Search.feature", glue="IMDBFlow/StepDefinations/IMDBRegistrationSD.java")
public class Runner {

}
