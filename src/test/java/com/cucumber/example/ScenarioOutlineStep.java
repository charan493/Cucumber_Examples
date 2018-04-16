package com.cucumber.example;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Author: Srinivas srinivas_padmakar@yahoo.com
 * Cucumber test example for Scenario Outline.
 */
public class ScenarioOutlineStep {

    @Given("^To Check given From Table ([^\"]*) is fetched$")
    public void toCheckGivenIsFetched(String getGiven) {
        System.out.println("This is from table " + getGiven);
    }

    @And("^To Check and From Table ([^\"]*) is fetched$")
    public void toCheckAndIsFetched(String getAnd) {
        System.out.println("This is from table " + getAnd);
    }

    @When("^To Check when From Table ([^\"]*) is fetched$")
    public void toCheckWhenIsFetched(String getWhen) {
        System.out.println("This is from table " + getWhen);
    }

    @Then("^To Check then From Table ([^\"]*) is fetched$")
    public void toCheckThenIsFetched(String getThen) {
        System.out.println("This is from table " + getThen);
    }
}