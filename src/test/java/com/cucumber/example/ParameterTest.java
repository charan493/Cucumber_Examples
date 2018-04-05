package com.cucumber.example;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Author: Srinivas srinivas_padmakar@yahoo.com
 * Cucumber test example to get data from the feature file.
 */
public class ParameterTest {

    @When("^To Check When_ \"([^\"]*)\"$")
    public void to_Check_When_From_Feature(String When) {
        System.out.println("Get When " + When);
    }

    @Then("^To Check Then_ \"([^\"]*)\"$")
    public void to_Check_Then_From_Feature(String Then) {
        System.out.println("Get Then " + Then);
    }

    @Given("^To Check Given_ \"([^\"]*)\"$")
    public void to_Check_Given_From_Feature(String Given) {
        System.out.println("Get Given " + Given);
    }

    @And("^To Check And_ \"([^\"]*)\"$")
    public void to_Check_And_From_Feature(String And) {
        System.out.println("Get And " + And);
    }
}