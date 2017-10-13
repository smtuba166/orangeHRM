package com.TestRunner;


	import cucumber.api.CucumberOptions;
	import cucumber.api.testng.AbstractTestNGCucumberTests;
	@CucumberOptions(
			features = {"feature/Orange"},
			glue = {"com.StepDef"}
			)
	public class testRunner extends AbstractTestNGCucumberTests{

	}

