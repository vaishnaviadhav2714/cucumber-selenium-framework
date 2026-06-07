# SauceDemo Automation Framework

## About the Project

This project is a UI automation framework developed for the SauceDemo application using Selenium WebDriver, Java, Cucumber BDD, and TestNG.

The framework follows the Page Object Model (POM) design pattern and focuses on creating reusable, maintainable, and scalable automation tests.

## Tech Stack

- Java
- Selenium WebDriver
- Cucumber BDD
- TestNG
- Maven
- WebDriverManager
- Extent Reports
- Git

## Framework Features

- Page Object Model (POM)
- Reusable BasePage methods
- Config-driven test execution
- DriverFactory implementation using ThreadLocal
- FrameworkConstants for framework-level configurations
- Cucumber feature files and step definitions
- Hooks for test setup and teardown
- Extent Reporting
- End-to-end checkout workflow automation

## Automated Scenarios

### Login

- Valid user login
- Multiple user validation using Scenario Outline
- Invalid login validation

### Products

- Verify products page
- Add products to cart
- Validate cart badge count

### Cart

- Verify products added to cart

### Checkout

- Enter checkout information
- Complete order flow
- Validate successful order placement

## Project Structure

src/test/java

├── pages
│   ├── BasePage
│   ├── LoginPage
│   ├── ProductsPage
│   ├── CartPage
│   ├── CheckoutInformationPage
│   ├── CheckoutOverviewPage
│   └── CheckoutCompletePage
│
├── stepdefinitions
│   ├── LoginStepDefinition
│   ├── ProductsStepDefinition
│   ├── CartStepDefinition
│   └── CheckoutStepDefinition
│
├── hooks
│   └── Hooks
│
├── factory
│   └── DriverFactory
│
├── constants
│   └── FrameworkConstants
│
├── utils
│   ├── ConfigReader
│   ├── ExtentManager
│   └── ExtentTestManager
│
└── runners
    └── TestRunner

src/test/resources

├── features
│   ├── login.feature
│   ├── products.feature
│   ├── cart.feature
│   └── checkout.feature
│
└── config
    └── config.properties

## Execution

Run all tests:

mvn test

## Future Improvements

- Parallel execution using TestNG
- Cross-browser execution
- Jenkins CI/CD integration
- Selenium Grid support
- Docker executionThis project was created to demonstrate a scalable Selenium automation framework using Java, Cucumber BDD, TestNG, and Page Object Model design principles.This project was created to demonstrate a scalable Selenium automation framework using Java, Cucumber BDD, TestNG, and Page Object Model design principles.