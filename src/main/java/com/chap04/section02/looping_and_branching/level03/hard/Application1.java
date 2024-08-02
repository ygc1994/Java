package com.chap04.section02.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        int num1;
        int num2 = 0;

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("2보다 큰 정수를 하나 입력하세요 : ");
            num1 = sc.nextInt();

            if(num1 < 2) {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            } else break;
        }

        for (int i = 1; i <= num1; i++) {
            if(num1 % i == 0) {
                num2++;
            }
            if(num2 >= 3) {
                System.out.println("소수가 아니다.");
                break;
            }
        }

        if(num2 < 3) System.out.println("소수다.");

    }

}