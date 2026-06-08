# SauceDemo UI Automation Framework

## About the Project

This project is a UI Automation Testing Framework developed for the SauceDemo application using Selenium WebDriver, Java, Cucumber BDD, TestNG, and Maven.

The framework follows the Page Object Model (POM) design pattern to improve maintainability, reusability, and scalability of automated test scripts.

The framework automates key e-commerce workflows including login, product selection, cart validation, checkout, logout, and product sorting functionality.

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

* Page Object Model (POM)
* DriverFactory for browser management
* Configuration-driven framework using properties file
* Cross-browser execution support

  * Chrome
  * Edge
  * Firefox
* Reusable utility methods
* Cucumber Hooks for setup and teardown
* Scenario Outline for data-driven testing
* Extent Reports
* Cucumber Reports
* Screenshot capture on test failure
* End-to-end e-commerce workflow automation
* Jenkins integration for automated execution

---

## Test Scenarios Covered

### Login Module

* Valid Login Verification
* Invalid Login Validation
* Locked-Out User Validation
* Data-Driven Login Testing

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

The browser can be changed from the `config.properties` file.

Example:

```properties
browser=chrome
```

Supported browsers:

* chrome
* edge
* firefox

---

## How to Run the Project

### Clone Repository

```bash
git clone https://github.com/vaishnaviadhav2714/cucumber-selenium-framework.git
```

### Install Dependencies

```bash
mvn clean install
```

### Execute Tests

```bash
mvn test
```

Or run the TestRunner class directly from Eclipse or IntelliJ.

---

## Reports

### Extent Report

Generated after execution and includes:

* Test execution summary
* Pass/Fail status
* Failure screenshots

Location:

```text
target/extent-report.html
```

### Cucumber Report

Generated after execution to provide scenario-level results.

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

The framework is integrated with Jenkins for automated test execution.

Current Jenkins setup includes:

* Freestyle Job
* Pipeline Job
* GitHub Repository Integration
* Maven Build Execution
* Scheduled Test Execution

The pipeline performs the following steps:

1. Checkout latest code from GitHub
2. Execute automation tests using Maven
3. Generate execution reports
4. Archive build artifacts

Tests can be triggered manually or through scheduled execution.

---

## Future Enhancements

* Parallel Test Execution
* Selenium Grid Integration
  
---

## Author

Vaishnavi Adhav

SDET II (Software Development Engineer in Test)

### Skills

* Selenium WebDriver
* Java
* Cucumber BDD
* TestNG
* Maven
* Jenkins
* Git & GitHub
* Automation Framework Development
