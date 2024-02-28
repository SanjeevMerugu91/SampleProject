package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java",
                               glue="stepDefinations",
                               dryRun=false,
                              tags="@sanity or @smoke",
                              plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunner extends AbstractTestNGCucumberTests{

}

//@run
//not @run
//@reg or @smoke
//@reg and @smoke


