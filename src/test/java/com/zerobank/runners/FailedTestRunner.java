package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/failed-html-report.html"
        },
        features = "@target/rerun.txt",
        glue = "com/zerobank/stepDefs"
)

public class FailedTestRunner {

}
