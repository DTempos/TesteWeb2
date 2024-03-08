package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(	monochrome = true,
					dryRun = false,
					features = { "src/test/resources/features" },
					glue = { "stepsDefinition" },
					plugin = { 
								"html:target/cucumber-reports",
								"json:target/cucumber.json",
//								"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/report.html"
							},
					tags = "@CT02"
				)

public class RunnerTest {

}

