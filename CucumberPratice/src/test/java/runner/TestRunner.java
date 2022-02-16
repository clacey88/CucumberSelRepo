package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)  /runs the test using Junit
@CucumberOptions(features = {"src/test/java/Features"},glue = "Steps", plugin = {"pretty","html:target/site/cucumber-reports","json:target/cucumber-reports/Cucumber.json"},monochrome = true) //links feature files and step files
public class TestRunner extends AbstractTestNGCucumberTests { //runs test using TestNg
}
