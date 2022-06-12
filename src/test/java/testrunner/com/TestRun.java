package testrunner.com;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/",
		glue="stepdefinitions.com",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html: test-output"},
		tags= {"@sanity"}
		

		
		)
public class TestRun {
   //if we want to execute all ff then feature=".//Feature/",
   //if we want to execute 2 or 3 ff then feature={".//Feature/login.feature","f2","f3"},
   //we can run project by pom.xml just add maven compiler plugin to pom.xpl
   //tags={"sanity","regression"} if want execute more
}
