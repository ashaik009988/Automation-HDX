package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(		   
		    features={"src/main/resources/Features/Dating.feature"},
		    glue= {"com.cucumber.stepdefinitions"},
		   // dryRun=true,
			plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		              "pretty","html:target/cucumber-reports/report.html"},
			monochrome = true,
			publish = true	
			)


public class TestRunner {
	
}
  
