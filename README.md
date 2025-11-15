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



