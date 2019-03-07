package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(

//		glue = {"stepdefs"},
//		features = {"classpath:features"},
//		features = {"src/test/resources/features/[CUCABLE:FEATURE].feature"}
//		plugin = {"json:src/test/resources/cucumber-report/[CUCABLE:RUNNER].json"}
		)


@RunWith(Cucumber.class)
public class cucumberrunnerClass {

}



