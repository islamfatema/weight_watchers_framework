package framework;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author fatemaislam
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = { "pretty", "html:target/site/cucumber-pretty" },
	
		snippets = cucumber.api.SnippetType.CAMELCASE,

		features = {"features"},
	
		tags = { "@wwfeature" },
	
		glue = { "stepdefinition" })

  public class TestRunner {

}
