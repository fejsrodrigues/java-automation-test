package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        strict = true,
        glue = {"gherkin/stepDefinition", "gherkin/hook"},
        tags = {""},
        plugin = {"pretty",
                "json:target/json-cucumber-reports/cukejson.json",
                "testng:target/testng-cucumber-reports/cuketestng.xml"

        },
        features = "features/")
public class Runner extends AbstractTestNGCucumberTests {
//public class Runner extends AbstractTestNGCucumberParallelTests {
}
