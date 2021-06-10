import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // Path to the feature files
        features = {"src/test/resources/features"},

        // Specify the step definition package name
        glue = {"StepDefinition", "DriverWrapper"},

        tags = {"@regression"}
)
public class TestRunner {
}