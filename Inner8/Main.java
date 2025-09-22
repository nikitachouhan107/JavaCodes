package com.Inner8;

public class Main {
    public static void main(String[] args) {
        Calculator.Addition obj = new Calculator().new Addition();
        System.out.println("Sum = " + obj.add(5, 7));
    }
}
