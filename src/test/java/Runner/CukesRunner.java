package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "html:target/default-cucumber-reports", "json:target/cucmber.json" }, 
		features = { "src/test/resources/features" },
		glue = { "StepDef" }, 
		dryRun = false, 
		monochrome = true)

public class CukesRunner {

}
