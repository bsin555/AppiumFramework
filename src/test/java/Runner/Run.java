package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//features/features.feature",
		glue="stepsDef",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty"}
		
		)



public class Run {
	
	

}
