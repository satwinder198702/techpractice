package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(


        features = "Feature",
        glue = "steps"

)
public class stepsRunner extends AbstractTestNGCucumberTests {
}
