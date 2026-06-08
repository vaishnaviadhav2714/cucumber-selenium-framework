# SauceDemo UI Automation Framework

## About the Project

This project is a UI Automation Testing Framework developed for the SauceDemo application using Selenium WebDriver, Java, Cucumber BDD, TestNG, and Maven.

The framework follows the Page Object Model (POM) design pattern to provide better maintainability, reusability, and scalability of automated test scripts.

The framework supports configuration-based browser execution and automates key e-commerce user workflows such as login, product selection, cart management, checkout, logout, and product sorting validation.

---

## Tech Stack

* Java
* Selenium WebDriver
* Cucumber BDD
* TestNG
* Maven
* WebDriverManager
* Extent Reports
* Jenkins
* Git & GitHub

---

## Framework Features

* Page Object Model (POM) Design Pattern
* DriverFactory Implementation
* Config-Driven Framework
* Browser Configuration through config.properties
* Cross-Browser Support
  * Chrome
  * Edge
  * Firefox
* Reusable Utility Methods
* Hooks for Setup and Teardown
* Scenario Outline for Data-Driven Testing
* Extent Reporting
* Cucumber Reporting
* Screenshot Capture on Test Failure
* Jenkins Freestyle Job Integration
* Jenkins Pipeline Integration
* Scheduled Test Execution using Jenkins
* End-to-End E-Commerce Workflow Automation

---

## Test Scenarios Covered

### Login Module

* Valid Login Verification
* Invalid Login Validation
* Locked-Out User Validation
* Data-Driven Login Testing Using Scenario Outline

### Product Module

* Product Listing Verification
* Add Product to Cart
* Cart Badge Validation
* Product Sorting Validation
  * Name (A to Z)
  * Name (Z to A)
  * Price (Low to High)
  * Price (High to Low)

### Cart Module

* Verify Added Products in Cart
* Verify Cart Item Count

### Checkout Module

* Enter Checkout Information
* Complete Checkout Process
* Verify Order Confirmation

### Logout Module

* Verify User Logout Functionality

---

## Project Structure

```text
src/test/java

├── pages
├── stepdefinitions
├── hooks
├── factory
├── constants
├── reports
├── utils
└── runners

src/test/resources

├── features
└── config
```

---

## Configuration

The browser can be changed directly from the `config.properties` file:

```properties
browser=chrome
```

Supported values:

* chrome
* edge
* firefox

Example:

```properties
browser=edge
```

No code changes are required to execute tests on a different browser.

---

## How to Run the Project

### Clone Repository

```bash
git clone https://github.com/vaishnaviadhav2714/cucumber-selenium-framework.git
```

### Import Project

Import the project as a Maven Project in Eclipse or IntelliJ IDEA.

### Install Dependencies

```bash
mvn clean install
```

### Execute Tests

```bash
mvn test
```

OR

Run the `TestRunner` class directly from the IDE.

---

## Reports

### Extent Reports

Generated after execution for detailed reporting including screenshots for failed scenarios.

Location:

```text
target/extent-report.html
```

### Cucumber Reports

Generated after execution to provide BDD scenario-level results.

Location:

```text
target/cucumber-report.html
```

### TestNG Reports

Available under:

```text
target/surefire-reports
```

---

## Jenkins Integration

The framework is integrated with Jenkins using:

* Freestyle Job
* Pipeline Job
* Maven Build Execution
* GitHub Source Code Integration
* Scheduled Execution using Cron Expressions

Pipeline Stages:

1. Checkout Source Code
2. Build & Execute Tests
3. Archive Reports

---

## Future Enhancements

* Selenium Grid Execution
* Parallel Test Execution
* GitHub Webhook Integration for Automatic Builds

---

## Author

**Vaishnavi Adhav**

QA Automation Engineer

### Skills

* Selenium WebDriver
* Java
* Cucumber BDD
* TestNG
* Maven
* Jenkins
* Git & GitHub
* Automation Framework Development
