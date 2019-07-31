package com.Demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/SampleFolder/NewFile.feature",glue="com.Demo",
plugin="json:target\\cucumber.json",tags= {"@login or @regression"})


public class RunnerClass {

}
