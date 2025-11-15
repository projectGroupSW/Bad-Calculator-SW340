package edu.pnu.badcalc;

public class Calculator {

    public double last;

    // Correct addition
    public double add(double a, double b) {
        last = a + b;
        return last;
    }

    // Correct subtraction (no Math.abs)
    public double subtract(double a, double b) {
        last = a - b;
        return last;
    }

    // Correct multiplication without casting to int
    public double multiply(double a, double b) {
        last = a * b;
        return last;
    }

    // Division with proper zero check
    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Division by zero");
        }
        last = a / b;
        return last;
    }

    // Correct factorial implementation
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Parses and computes an expression of the form "a op b"
    public double parseAndCompute(String expr) {
        String[] t = expr.trim().split("\\s+");
        if (t.length != 3) {
            throw new IllegalArgumentException("Expression must be 'a op b'");
        }

        double a = Double.parseDouble(t[0]);
        String op = t[1];
        double b = Double.parseDouble(t[2]);

        if (op.equals("+")) return add(a, b);
        if (op.equals("-")) return subtract(a, b);
        if (op.equals("*")) return multiply(a, b);
        if (op.equals("/")) return divide(a, b);

        throw new IllegalArgumentException("Unknown operator: " + op);
    }
}
