package com.divya.automationcucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


@CucumberOptions(features = "./src/test/resources/features", 
				glue = {"com.divya.automationcucumber.stepdefinition" },
				tags = { "~@Ignore" }, 
				format = { "pretty",
							"html:target/cucumber-reports/cucumber-pretty", 
							"json:target/cucumber-reports/CucumberTestReport.json",
							"rerun:target/cucumber-reports/rerun.txt" }
				)
public class TestRunner extends AbstractTestNGCucumberTests {

	private TestNGCucumberRunner testNGCucumberRunner;
	
	private final static Logger LOGGER = Logger.getLogger(TestRunner.class);

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		LOGGER.info("Test runner set up initiated");
	}

	
	
	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		
		LOGGER.info("Test runner tests started");
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
		
	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {
		testNGCucumberRunner.finish();
		LOGGER.info("Test runner tests ended");
	}

}
