package com.example.demo.steps;

import com.example.demo.MySpringBootApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = MySpringBootApplication.class)
public class CucumberSpringConfiguration {
    // This class can remain empty; its purpose is to hold the annotations
}
