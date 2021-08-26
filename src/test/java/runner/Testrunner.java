package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/",
        glue = {"seleniumgluecode"},
        plugin = {"json:test/report/cucumber_report.json"}
)
public class Testrunner {
    @AfterClass
    public static void finishTest() {
        try {
            String[] args = new String[] {"/bin/bash", "-c", "npm run report"};
            Runtime.getRuntime().exec(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
