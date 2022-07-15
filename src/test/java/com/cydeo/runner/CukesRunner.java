package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html", // html report
                "me.jvt.cucumber.report.PrettyReports:target/cucumber", // cucumber report
                "json:target/cucumber-report.json"
        },
        features = "src/test/resources/features" ,
        glue = "com/cydeo/steps",
        dryRun = false,
        tags = "@smoke"
)
public class CukesRunner {
}