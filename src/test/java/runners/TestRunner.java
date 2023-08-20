package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:reports/html-reports/cucumber.html",
                "json:reports/json-reports/cucumber.json",
                "junit:reports/xml.reports/cucumber.xml",
                "pretty"
        },

        features = "src/test/resources/features",
        glue = {"stepDefinitions","hooks"},
        tags = "@shopFilterByPrice",
        dryRun = false

)


public class TestRunner {


}
