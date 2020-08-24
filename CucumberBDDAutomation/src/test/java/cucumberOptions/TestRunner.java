package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Malkari Santhosh\\Documents\\eclipse\\CucumberBDDAutomation\\src\\test\\java\\Features\\login.feature", 
glue = "stepdefinations")
public class TestRunner {

}
