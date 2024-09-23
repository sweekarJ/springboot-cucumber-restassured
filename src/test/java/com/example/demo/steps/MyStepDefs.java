package com.example.demo.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyStepDefs {
    private static final Logger logger = LoggerFactory.getLogger(MyStepDefs.class);

    @Given("I have a precondition")
    public void i_have_a_precondition() {
        // Your code here
    }

    @When("I perform a GET request to the API")
    public void i_perform_an_action() {
        // Your code here
        logger.info("running blank step");
    }

    @Then("the response status should be 200")
    public void i_expect_a_result() {
        // Your code here
        logger.info("running blank step");
    }
}
