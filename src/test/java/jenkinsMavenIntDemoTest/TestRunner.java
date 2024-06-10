package jenkinsMavenIntDemoTest;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features",
		glue = {"jenkinsMavenIntDemoTest"},
		plugin = {"pretty", "json:target/report.json"},
		tags= "@Smoke"
//		,dryRun = true
		)
public class TestRunner {

}
