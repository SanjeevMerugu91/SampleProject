package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/Amzon1.feature",
						glue="stepDefinations",
						plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunner1 extends AbstractTestNGCucumberTests {
	@DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

