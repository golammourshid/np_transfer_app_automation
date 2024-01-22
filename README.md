# EVR NP Transfer APP Automation

### Key Technologies

* TESTNG
* Selenium
* Allure [for report generation]
* Java-client [as Appium]


## Project Build Reference
### Prerequisite

* `gradle version 5.2.1`
* `jdk 11`
* `Connect phone via USB`
* `Start Appium server in Port: 4723 & Host: 0.0.0.0`

### Basic Gradle Commands

* Clean existing output and build test: **gradle clean test**

### Basic Allure Commands

* Download allure
* After build run this command to generate report with allure: **allure generate allure-results --clean -output**
* After successful report generation, to see the results: **allure serve allure-results**

### Contributors

* Golam Mourshid <golammourshid100@gmail.com>
