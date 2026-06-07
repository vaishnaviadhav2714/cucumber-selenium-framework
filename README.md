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

src/test/java

├── pages  
├── stepdefinitions  
├── hooks  
├── factory  
├── constants  
├── utils  
└── runners  

src/test/resources

├── features  
└── config  

---

## Configuration

The browser can be changed directly from the config.properties file:

browser=chrome

Supported values:

* chrome
* edge
* firefox

Example:

browser=edge

No code changes are required to execute tests on a different browser.

---

## How to Run the Project

### Clone Repository

git clone https://github.com/your-username/saucedemo-ui-automation.git

### Import Project

Import the project as a Maven Project in Eclipse or IntelliJ IDEA.

### Install Dependencies

mvn clean install

### Execute Tests

mvn test

OR

Run the TestRunner class directly from the IDE.

---

## Reports

### Extent Reports

Generated after execution for detailed test reporting.

### TestNG Reports

Available under:

target/surefire-reports

---

## Future Enhancements

* Jenkins CI/CD Integration
* Selenium Grid Execution
* Parallel Test Execution

---

## Author
QA Automation Engineer

Skills:

* Selenium WebDriver
* Java
* Cucumber BDD
* TestNG
* Maven
* Automation Framework Development

