package britc.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="src/test/resources/features",
        glue={"britc"},
        plugin={"pretty",
                "html:target/cucumber-reports.html"
        },
        monochrome=true
)
public class DemoQARunnerTest extends AbstractTestNGCucumberTests {


}
