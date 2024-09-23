
# Spring Boot Cucumber RestAssured Project

## Overview
This project is a basic Spring Boot application that leverages **Cucumber** and **Rest Assured** for API testing. It also generates test reports in multiple formats: **Pretty HTML**, **JSON**, and **Extent Reports**. The project is designed to be flexible and works with both **Maven** and **Gradle** build tools.

The integration allows seamless execution of tests with scenarios tagged by Azure DevOps (ADO) test case IDs. After execution, the results can be posted back to ADO for tracking.

## Key Features
- **Cucumber**: Behavior-driven development (BDD) tool for defining test scenarios in a human-readable format.
- **Rest Assured**: Library for testing RESTful APIs.
- **Reporting**: Generates Pretty HTML, JSON, and Extent Reports after test execution.
- **Maven and Gradle Support**: Build and run tests using either Maven or Gradle.
- **Azure DevOps Integration**: Easily extendable to push test results to ADO Test Plans.

## Project Structure
```
springboot-cucumber-restassured/
│
├── pom.xml                     # Maven build file
├── build.gradle                 # Gradle build file
├── src
│   ├── main
│   │   └── java/com/example/demo
│   │       └── DemoApplication.java  # Spring Boot main application class
│   ├── test
│   │   └── java/com/example/demo/steps
│   │       └── StepDefinitions.java  # Step definitions for Cucumber scenarios
│   └── test/resources
│       └── features
│           └── api_test.feature  # Cucumber feature file for testing
├── reports                      # Directory for generated test reports
└── README.md                    # Project overview and setup instructions
```

## Dependencies
This project includes the following dependencies:
- **Spring Boot** for the main application framework.
- **Cucumber** for writing feature files and scenarios.
- **Rest Assured** for API testing.
- **JUnit** as the test runner.
- **Cucumber Reporting** for generating reports in HTML, JSON, and Extent formats.

## How to Set Up and Run the Project

### 1. Clone the Repository
First, clone this repository to your local machine:
```bash
git clone https://github.com/your-repo/springboot-cucumber-restassured.git
cd springboot-cucumber-restassured
```

### 2. Build and Run Tests with Maven
To run the tests using Maven, execute the following commands:
```bash
# Build the project
mvn clean install

# Run the Cucumber tests
mvn test
```

### 3. Build and Run Tests with Gradle
To run the tests using Gradle, execute the following commands:
```bash
# Build the project
./gradlew build

# Run the Cucumber tests
./gradlew test
```

### 4. Test Reports
After running the tests, reports will be generated in the `reports` directory:
- **Pretty HTML Report**: An easy-to-read report.
- **JSON Report**: Useful for programmatic parsing and integration with external tools.
- **Extent Report**: A visually appealing and detailed report of the test execution.

### 5. Azure DevOps Integration
To integrate the results with Azure DevOps (ADO):
- Each scenario in the `feature` file can be tagged with the Azure DevOps test case ID (e.g., `@ADO_TC_12345`).
- After execution, you can use the Azure DevOps REST API to update the test case results in the corresponding Test Plan.

You can automate this process in your CI/CD pipeline by using **GitHub Actions** or **Azure Pipelines**.

## Running in GitHub Actions
To run the tests as part of a GitHub Actions pipeline, create a `.github/workflows/test.yml` file with the following content:

```yaml
name: Run Cucumber Tests

on:
  push:
    branches:
      - main

jobs:
  test:
    runs-on: ubuntu-latest

    steps:
    - name: Checkout code
      uses: actions/checkout@v2

    - name: Set up JDK 11
      uses: actions/setup-java@v1
      with:
        java-version: '11'

    - name: Build with Maven
      run: mvn clean install

    - name: Run Cucumber Tests
      run: mvn test
```

Modify this pipeline to suit your project structure or to use Gradle instead of Maven.

### Azure DevOps Pipeline
You can set up an Azure DevOps pipeline with similar steps to run the tests and upload the results to Azure DevOps Test Plans using the Azure REST API.

---

## Contact
For any issues or questions, feel free to raise an issue in the repository or reach out to the maintainers.
