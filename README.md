# Bad Calculator – SW340 Software Quality Assurance Project

This project is part of the SW340 Software Quality Assurance course.  
The provided **Bad Calculator** application contains several intentional bugs, code smells, and poor coding practices.  
The goal of this project was to analyze the project, identify issues, apply refactoring, write unit tests, and verify improvements using JaCoCo and SonarCloud.

---

##  Project Objectives
- Run and understand the existing Calculator project  
- Identify bugs and bad practices  
- Refactor and improve code quality  
- Write JUnit test cases  
- Generate JaCoCo coverage report  
- Analyze code quality using SonarCloud  
- Compare results before and after the refactor  

---

##  Tools Used
- **Java 17**
- **Apache Maven**
- **IntelliJ IDEA**
- **JUnit 5**
- **JaCoCo** (Coverage)
- **SonarCloud** (Static Analysis)
- **GitHub** 

---


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


## Identified Problems in the Original Code & How They Were Fixed:

| Problem (Before Refactor)                | Type of Problem       | Fix Applied (After Refactor)                                                                 |
|------------------------------------------|------------------------|------------------------------------------------------------------------------------------------|
| Excessive use of System.out.println      | Bad Practice          | Removed unnecessary prints from Calculator and kept all output handling inside App only.       |
| Complex loop structure in App            | Poor Code Quality     | Simplified the loop, reduced branching, and removed unnecessary conditions.                    |
| No handling for division by zero         | Bug                   | Added a clear validation and threw `ArithmeticException("Division by zero")`.                  |
| Factorial did not validate negative numbers | Bug                 | Added validation: `if (n < 0) throw new IllegalArgumentException("n must be >= 0")`.          |
| Multiple code smells across the project  | Poor Code Quality     | Refactored methods, improved naming, reformatted code, and fixed major SonarCloud issues.      |


##  JUnit Tests
Tests were created **before and after refactoring**.

### Tests Cover:
- `add()`
- `subtract()`
- `multiply()`
- `divide()`
- `divide()` exception test (division by zero)
- `factorial()`
- `parseAndCompute("a op b")`
- Invalid input tests

These tests helped confirm correct behavior after fixing the code.

---

## 🔹 JaCoCo Coverage Results
After adding the test cases:

- Calculator.java: 100% coverage  
- Overall project coverage: increased significantly  
- JaCoCo confirmed that all major functions are fully tested

---

## SonarCloud Results

### Before Refactoring:
- Quality Gate: FAILED
- Coverage: 3.7%
- Many code smells and maintainability issues

### After Refactoring:
- Quality Gate (New Code): PASSED
- Code smells reduced
- Better structure, readability, and reliability

🔗 **SonarCloud Report:**  
https://sonarcloud.io/summary/new_code?id=projectGroupSW_Bad-Calculator-SW340




