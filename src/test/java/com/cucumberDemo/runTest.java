package com.cucumberDemo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


/**
 * Created by quentin on 9/23/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {
            "pretty", "html:target/cucumber"},
        features="Feature/"
)
public class runTest {}
