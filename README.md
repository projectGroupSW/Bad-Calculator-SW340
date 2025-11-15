# Bad Calculator – SW340 SQA Project

A simple Java calculator project provided with intentional bugs and bad practices.
This project was used to practice:
- Running a Maven project
- Detecting bugs and code smells
- Refactoring Java code
- Writing JUnit test cases
- Generating JaCoCo coverage reports
- Using SonarCloud for code quality analysis

## Requirements
- Java 17 or higher
- Apache Maven
- IntelliJ IDEA (recommended)
- GitHub + SonarCloud account

##Project Structure

src/
  main/
    java/
      edu/
        pnu/
          badcalc/
            App.java            // Main console application
            Calculator.java     // Calculator logic (refactored)

  test/
    java/
      edu/
        pnu/
          badcalc/
            AppTest.java          // Application test
            CalculatorTest.java   // Unit tests for operations

pom.xml

## How to Run the Project

# 1) Run all tests (JUnit)
mvn test

# 2) Generate JaCoCo coverage report
mvn verify
# The report will appear at:
# target/site/jacoco/index.html

# 3) Run the application (IntelliJ)
# Right-click App.java → Run


## JUnit Tests
The project includes tests for:
- add()
- subtract()
- multiply()
- divide()
- divide() exception (division by zero)
- factorial()
- parseAndCompute("a op b")  # tests simple expressions like "3 + 2"

## JaCoCo Coverage
After adding test cases:
- Calculator.java reached ~100% method coverage
- Overall project coverage increased significantly

## SonarCloud Analysis
- New Code passed the Quality Gate
- No bugs or vulnerabilities in the refactored code
- Old bad code still shows issues (expected for the assignment)

## Notes
- The original project contained bugs by design.
- Refactoring and testing improved code quality, readability, and reliability.
- This README summarizes how to run, test, and evaluate the project.
