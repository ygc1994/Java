package com.chap03.level01.basic;

public class Calculator {
    public void checkMethod() {
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10() {
        int num = 0;

        for (int i = 1; i <= 10; i++)
            num = num + i;

        System.out.println("1부터 10까지의 합 : " + num);

        return 0;
    }

    public void checkMaxNumber(int a, int b) {
        int num = java.lang.Math.max(a, b);

        System.out.println("두 수 중 큰 수는 " + num + "이다.");
    }

    public int sumTwoNumber(int a, int b) {
        int num = a + b;

        System.out.println("10과 20의 합은 : " + num);

        return 0;
    }

    public int minusTwoNumber(int a, int b) {
        int num = a - b;

        System.out.println("10과 5의 차는 : " + num);

        return 0;
    }
}