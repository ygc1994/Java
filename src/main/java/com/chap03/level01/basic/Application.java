package com.chap03.level01.basic;

import com.chap03.level01.basic.Calculator;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.checkMethod();
        calculator.sum1to10();
        calculator.checkMaxNumber(10, 20);
        calculator.sumTwoNumber(10, 20);
        calculator.minusTwoNumber(10, 5);
    }
}