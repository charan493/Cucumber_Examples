package com.cucumber.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Author: Srinivas srinivas_padmakar@yahoo.com
 * Cucumber Hooks which will run before and after a feature.
 */
public class Hooks {

    @Before
    public void Initialize() {
        System.out.println("Initialization test");
    }

    @After
    public void TearDown() {
        System.out.println("TearDown test");
    }
}
