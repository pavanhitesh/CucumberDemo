package com.verizon.stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.verizon.base.SingletonAction;
import com.verizon.pageobjects.SeleniumhqPageObjects;
import com.verizon.utilities.TestStatus;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinitions {

	Logger logger = LogManager.getLogger(StepDefinitions.class);
	SeleniumhqPageObjects obj;

	@Given("^User navigate to given url \"([^\"]*)\"$")
	public void user_navigate_to_given_url(String url) throws Throwable {
		obj =new SeleniumhqPageObjects(SingletonAction.getActiveWebDriver());
		obj.navigate(url);
		SingletonAction.getExtentReport().insertStep("The Navigated URl", SingletonAction.getActiveWebDriver().getTitle(), TestStatus.PASS, 
				null, true);
	}

	@When("^user click on download link$")
	public void user_click_on_download_link() throws Throwable {
		obj.clickDownloadLnk();
		SingletonAction.getExtentReport().insertStep("The Navigated URl", SingletonAction.getActiveWebDriver().getTitle(), TestStatus.PASS, 
				null, true);

	}

	@Then("^user click on documentation link$")
	public void user_click_on_documentation_link() throws Throwable {
		obj.clickDocumentationLnk();
		SingletonAction.getExtentReport().insertStep("The Navigated URl", SingletonAction.getActiveWebDriver().getTitle(), TestStatus.PASS, 
				null, true);
	}

}
