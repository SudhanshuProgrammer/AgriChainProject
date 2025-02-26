# AgriChainProject
> This is AgriChain project assignment
> #
---
## Problem 1
> Given a string, find the length of the longest substring without repeating characters. For example, the longest substring without repeating letters for "abcabcbb" is "abc", for which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1

#### Concepts
> Sliding Window Technique: This technique involves maintaining a window (defined by two pointers) that can expand and contract as needed to explore the substring. In this case, one pointer (end) expands the window by iterating through the string, while another pointer (start) adjusts the beginning of the window to ensure no repeating characters are present.

>Character Index Tracking: An array (charIndex) is used to keep track of the last seen index of each character in the ASCII range (0-127). This allows for quick lookups to determine if a character has been seen before within the current window.

#### Code Logic 
> Initialization:
`maxLength:` This variable keeps track of the maximum length of substrings found without repeating characters.
`start:` This pointer marks the beginning of the current substring being evaluated.
`charIndex:` An array of size 128 (to accommodate all ASCII characters) is initialized to store the last index where each character was found. Iterating Through the String:

> A for loop runs from 0 to s.length() - 1, where end is the current index of the character being evaluated. `currentChar` stores the character at the current end index. Updating the Start Index:

> The start index is updated to ensure that it always points to the first character of the current substring without repeating characters. This is done using:
``` start = Math.max(start, charIndex[currentChar]);```
Here, `charIndex[currentChar]` gives the last index where currentChar was seen. If this index is greater than or equal to `start`, it means we have found a repeating character, and we need to move start to the right of this index. Calculating the Current Length:

>The current length of the substring is calculated as:
`maxLength = Math.max(maxLength, end - start + 1);`
This calculates the length of the current substring from start to end. Updating the Last Seen Index:

> After evaluating the current character, the last seen index of currentChar is updated:
`charIndex[currentChar] = end + 1;`
This stores the index of the next character position (end + 1) for future reference. Returning the Result:

> After the loop completes, the function returns `maxLength`, which contains the length of the longest substring without repeating characters.

##### Example Walkthrough
``` For the input string "abcabcbb":```
>The algorithm starts with start = 0 and iterates through each character.
When it encounters 'a', 'b', and 'c', it updates maxLength to 3 when it reaches 'c'.
Upon encountering the second 'a', it updates start to the index right after the first 'a', effectively shrinking the window and continuing to check for new characters.

##### Note: Please open below file to see the code 
`Problem2/LongestSubstringWithoutRepeating.java` 

---
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

   
