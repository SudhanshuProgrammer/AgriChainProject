# AgriChainProject
> This is AgriChain project assignment

## Problem 1
> Given a string, find the length of the longest substring without repeating characters. For example, the longest substring without repeating letters for "abcabcbb" is "abc", for which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1


---

> Note: Please open file to see the code `Problem2/LongestSubstringWithoutRepeating.java` 


## Problem 2 

> Assume there is a website https://agrichain.com which does exactly the same thing as problem 1, it takes the input on home page and then on click of submit button, it navigates to different page where it prints the output for longest substring without repeating letters.

> TASK: 
Write all test cases you would be doing to test the above website. 
Categorise those cases in manual (you would be doing manually) and automation (you would be automating).
Write web automation script for any one test case that you have mentioned above with high level automation framework(folder/directory structure) to explain which goes where (browser initialisation, web elements, test scenario etc).

### Agrichain Testing Framework
#### Overview
This repository contains the testing framework for the Agrichain application, focused primarily on testing the functionality of the "Longest Substring Without Repeating Letters" feature. The framework is built using Java, Selenium for browser automation, Cucumber for Behavior Driven Development (BDD), and TestNG for test execution.

#### Technologies Used
- **Java**: The core programming language used for the framework.
- **Selenium**: For automating web applications for testing purposes.
- **Cucumber**: For writing test cases in a human-readable format using Gherkin syntax.
- **TestNG**: For test configuration, execution, and reporting.
- **Maven**: For project management and dependency management.

#### Directory Structure
```
src/
│
├── test/
│ ├── java/
│ │ ├── stepDefinitiopns/ # Step definitions for Cucumber tests
│ │ │ └── LongestSubstringSteps.java
│ │ ├── pageObject/ # Page object classes for web pages
│ │ │ └── HomePage.java
│ │ ├── testRunners/ # TestNG runner classes
│ │ │ └── TestNGRunner.java
│ │ └── utils/ # Utility classes (e.g., WebDriver manager)
│ │ └── WebDriverManager.java
│ │
│ └── resources/
│ └── features/ # Cucumber feature files
│ └── longest_substring.feature
│
└── pom.xml # Maven project file
```

#### Setting Up the Framework

#### Installation Steps

> Clone the Repository: 
`git clone <repository-url>`
 `cd <repository-folder>`
 
> Build the Project:
 ```mvn clean install```
 This command will download all necessary dependencies specified in the pom.xml.
---

#### Running Cucumber Tests

You can run the Cucumber tests in multiple ways:

   > Using the IDE:
   > If you are using an IDE like IntelliJ IDEA or Eclipse
  > you can right-click on the `TestNGRunner.java`  file and select `Run` to execute your tests.
---
  > Using Maven Command:
   You can also run the tests using Maven from the command line:
   `mvn test`

   
