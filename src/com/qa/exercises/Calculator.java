package com.qa.exercises;

public class Calculator {

    public int addition(int a, int b) {
        return a + b;
    }

    public int addition(int a, int b, int c) {
        return a + b + c;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }
    public double multiplication(double a, double b) {
        return a * b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public double division(double a, double b) {
        /* if (a < b) {
            System.out.println("The Division cannot be performed");
            return 0;
        } else {
            return a / b;
        } */
        return a / b;
    }


}
