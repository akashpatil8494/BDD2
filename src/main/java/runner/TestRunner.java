package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "E:\\Java By Kiran\\BDD\\src\\main\\java\\feature\\Login.feature",
		glue= {"stepdefinitions"},
		monochrome=true,
		strict=true,
		dryRun=false
		
		)


public class TestRunner {
	
	

}
