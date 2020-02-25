package TestRunner;

import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//import cucumber.api.testng.CucumberFeatureWrapper;
//import cucumber.api.junit.Cucumber;		
//import cucumber.api.testng.TestNGCucumberRunner;

//@RunWith(Cucumber.class)				
@CucumberOptions(features="C:\\Users\\TEMP\\git\\SaleniumCucumber\\Cucumber1\\Features\\Executor.feature",glue={"StepDefinition"}
,format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"})

@Test
public class TestRunner extends AbstractTestNGCucumberTests{
	
}
