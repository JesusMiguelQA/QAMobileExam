package com.nttdata.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Tienda.feature",
        glue = "com.nttdata.stepsdefinitions",
        plugin = {"html:target/cucumber-reports/cucumber-html-report",
                "json:target/cucumber-reports/cucumber.json"},
        tags = "@shopping"
)
public class CucumberTestSuite {
}