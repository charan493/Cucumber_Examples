package com.cucumber.example;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Author: Srinivas srinivas_padmakar@yahoo.com
 * Cucumber test basic example.
 */
public class ExampleStep {
    @Given("^To Check Given$")
    public void to_Check_Given() {
        System.out.println("Inside Given");
    }

    @And("^To Check And$")
    public void to_Check_And() {
        System.out.println("Inside And");
    }

    @When("^To Check When$")
    public void to_Check_When() {
        System.out.println("Inside When");
    }

    @Then("^To Check Then$")
    public void to_Check_Then() {
        System.out.println("Inside Then");
    }
}