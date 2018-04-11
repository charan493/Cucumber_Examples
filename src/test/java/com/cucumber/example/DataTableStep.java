package com.cucumber.example;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Author: Srinivas srinivas_padmakar@yahoo.com
 * Cucumber test example to fetch data from Data Tables in feature file.
 */
public class DataTableStep {

    @Given("^To Check Given From Table$")
    public void toCheckGivenFromTable(DataTable table) {
        List<List<String>> data = table.raw();
        System.out.println("Get " + data.get(1).get(0));
    }

    @And("^To Check And From Table$")
    public void toCheckAndFromTable(DataTable table) {
        List<List<String>> data = table.raw();
        System.out.println("Get " + data.get(1).get(0));
    }

    @When("^To Check When From Table$")
    public void toCheckWhenFromTable(DataTable table) {
        List<List<String>> data = table.raw();
        System.out.println("Get " + data.get(1).get(0));
    }

    @Then("^To Check Then From Table$")
    public void toCheckThenFromTable(DataTable table) {
        List<List<String>> data = table.raw();
        System.out.println("Get " + data.get(1).get(0));
    }
}