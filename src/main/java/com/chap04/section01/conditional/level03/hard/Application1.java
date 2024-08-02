package com.chap04.section01.conditional.level03.hard;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int num2 = sc.nextInt();
        System.out.print("연산 기호를 입력하세요 : ");
        char op = sc.next().charAt(0);

        label:
        if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
            switch (op) {
                case '+': System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 + num2)); break label;
                case '-': System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 - num2)); break label;
                case '*': System.out.println(num1 + " " + op + " " + num2 + " = " + num1 * num2); break label;
                case '/': System.out.println(num1 + " " + op + " " + num2 + " = " + num1 / num2); break label;
                case '%': System.out.println(num1 + " " + op + " " + num2 + " = " + num1 % num2); break label;
            }
        } else System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");

    }

}