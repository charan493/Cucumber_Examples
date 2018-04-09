package com.cucumber.example;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Srinivas srinivas_padmakar@yahoo.com
 * Cucumber test example for Scenario Outline.
 */
public class CustomClassTest {


    @Given("^To Check Given From Table Dynamically$")
    public void toCheckGivenIsFetched(DataTable table1) {
        List<Values> value;
        value = table1.asList(Values.class);
        for (Values getValue : value) {
            System.out.println("This is " + getValue.given);
        }
    }

    @And("^To Check And From Table Dynamically$")
    public void toCheckAndIsFetched(DataTable table2) {
        List<Values> value;
        value = table2.asList(Values.class);
        for (Values getValue : value) {
            System.out.println("This is " + getValue.and);
        }
    }

    @When("^To Check When From Table Dynamically$")
    public void toCheckWhenIsFetched(DataTable table3) {
        List<Values> value;
        value = table3.asList(Values.class);
        for (Values getValue : value) {
            System.out.println("This is " + getValue.when);
        }
    }

    @Then("^To Check Then From Table Dynamically$")
    public void toCheckThenIsFetched(DataTable table4) {
        List<Values> value;
        value = table4.asList(Values.class);
        for (Values getValue : value) {
            System.out.println("This is " + getValue.then);
        }
    }

    public class Values {
        String given;
        String and;
        String when;
        String then;

        public Values(String sendGiven, String sendAnd, String sendWhen, String sendThen) {
            given = sendGiven;
            and = sendAnd;
            when = sendWhen;
            then = sendThen;
        }
    }
}