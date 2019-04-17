package com.verizon.stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.verizon.base.SingletonAction;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class CommonStepDefinitions {
	
	Logger logger = LogManager.getLogger(CommonStepDefinitions.class);
	
	
	@Before
	public void beforeScenario(Scenario scenario) throws Exception {	
		logger.info("Started the Scenario");
		SingletonAction.getExtentReport().intializeTestReport(scenario.getName());
	}
	
	@After
	public void embedScreenshot() {
		try {
			logger.info("After method executed");
		} catch(Exception e) {
			logger.error(e);
		}
	}
	
	
}
