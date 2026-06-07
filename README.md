# SauceDemo UI Automation Framework



## About the Project



This project is a UI automation testing framework developed for the SauceDemo application using Selenium WebDriver, Java, Cucumber BDD, TestNG, and Maven.



The framework follows the Page Object Model (POM) design pattern to ensure better maintainability, reusability, and scalability of test scripts.



---



## Tech Stack



- Java  

- Selenium WebDriver  

- Cucumber BDD  

- TestNG  

- Maven  

- WebDriverManager  



---



## Framework Features



- Page Object Model (POM) design pattern  

- Reusable utility methods  

- Config-driven framework  

- DriverFactory implementation  

- Hooks for setup and teardown  

- Scenario Outline for data-driven testing  

- End-to-end e-commerce workflow automation  



---



## Test Scenarios Covered



### Login Module

- Valid login functionality  

- Invalid login validation  

- Data-driven login testing  



### Product Module

- Product listing verification  

- Add product to cart  

- Cart badge validation  



### Cart Module

- Verify added products in cart  



### Checkout Module

- Enter user details  

- Complete order process  

- Validate order confirmation  



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



## How to Run the Project



### 1. Clone the repository

git clone https://github.com/your-username/cucumber-selenium-framework.git



### 2. Import project

Import as a Maven project in Eclipse or IntelliJ



### 3. Install dependencies

mvn clean install



### 4. Run tests

mvn test



OR execute TestRunner class directly



---



## Reports



- Cucumber Reports (if configured)

- TestNG reports available in target/surefire-reports



---



## Future Improvements



- Jenkins CI/CD integration  

- Cross-browser testing  

- Parallel execution  

- Selenium Grid support  







---



## Author



Automation Tester – Selenium | Java | Cucumber | TestNG