# SauceDemoAutomation
“Selenium TestNG Automation Framework for SauceDemo website with Extent Reports and Page Object Model.”
## Overview
This project is an **End-to-End Selenium Automation Framework** using **Java**, **TestNG**, and **Page Object Model (POM)** structure. It includes automated test cases, reports, and screenshots for better test management. 
## Features
- **Page Object Model (POM)** for maintainable and scalable test scripts  
- **TestNG** for test execution and reporting  
- **Extent Reports / HTML Reports** for test results  
- **Screenshots on Test Failure**  
- Compatible with Chrome, Firefox (WebDriver)  
- Easily extendable for new test cases
- ## Project Structure
- <pre>AISeleniumProject/
│
├── src/ # Test scripts and page objects
├── pom.xml # Maven dependencies
├── reports/ # ExtentReports HTML reports
├── screenshots/ # Screenshots of failed tests
├── test-output/ # TestNG reports
└── README.md # Project overview</pre>
## Installation & Setup
1. Clone the repository:  
   git clone https://github.com/Venkateshwarlu03/SauceDemoAutomation.git

2. Open in IntelliJ IDEA or Eclipse as a Maven project  

3. Install dependencies from pom.xml  

4. Run tests via TestNG or Maven:
   mvn clean test
   ## Usage
- Modify src/test/java/pages and src/test/java/tests to add new test cases  
- Reports will be generated in reports/ folder  
- Screenshots will appear in screenshots/ folder
## Contact
Author: Venkat  
GitHub: [Venkateshwarlu03](https://github.com/Venkateshwarlu03)

This framework can be used as a template for professional Selenium automation projects, suitable for learning, interviews, and real-world testing.

