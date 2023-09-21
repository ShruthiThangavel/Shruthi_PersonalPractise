package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"Features"}, glue = {"StepDefinitions"}, plugin = {"pretty","junit: Report3"}, dryRun = false, monochrome = false, tags = "@P4")
public class TestRunner {
	/*feature - to give the folder name of feature file, glue - to give the package of step definition, plugin - for report generation,
	 * dryRun - if true runs only class without step def and asks to define , if false runs both calss with and without step def,
	 * monochrome- for clean console printing, tags - should be specified before scenario and which tag is included only that runs, name- a part of the scenario name shd be given and gthat runs
	 */
	

}
