package com.kodilla;

public class Calculator {
    public double subtractionAfromB(double a, double b) {
        System.out.println(a - b);
        return a - b;
    }
    public double addAtoB(double a, double b) {
        System.out.println(a + b);
        return a + b;
    }
    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        calculator.addAtoB(2, 4);
    }
}