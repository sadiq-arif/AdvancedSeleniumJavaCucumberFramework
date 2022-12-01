import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/Login.feature"},
        plugin = {
                "pretty",
                "html:target/cucumber.html",
                "json:target/cucmber.json"
        },
        tags = "@smoke",
        publish = true
)
public class TestRunner {
}
