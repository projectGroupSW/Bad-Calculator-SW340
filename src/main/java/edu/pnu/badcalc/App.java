package edu.pnu.badcalc;

import java.util.Scanner;

public class App {

    public static Calculator c = new Calculator();
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Bad Calculator v0.0.1");
        while (true) {
            System.out.print("> ");
            String line = s.nextLine();


            if (line.equals("quit")) break;

            try {
                double result = c.parseAndCompute(line);
                System.out.println("= " + result);
            } catch (Exception e) {

                System.out.println("err");
            }
        }
    }
}
