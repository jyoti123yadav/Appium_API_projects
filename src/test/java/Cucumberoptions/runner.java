package Cucumberoptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/jyotiyadav/Practise/YOYO/src/test/java/features/placeValidation.feature",plugin="json:target/jsonReports/cucumber-report.json",glue= {"stepDefinition"})
public class runner {

}
