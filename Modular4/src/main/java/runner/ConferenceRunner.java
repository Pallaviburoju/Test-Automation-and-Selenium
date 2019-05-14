package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\Eclipse2\\Modular4\\src\\main\\java\\feature\\RegisterPaymentDetails.feature", 
                 glue = {"stepDefinition" }
                )
public class ConferenceRunner {

}
