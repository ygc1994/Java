package com.chap05.section01.array.level04.advanced;

import java.util.Random;
import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] arr1 = new int[4];
        int chance = 10;

        for (int i = 0; i < 4; i++) {
            int randomInt = random.nextInt(10);

            arr1[i] = randomInt;
        }

        while(chance > 0) {
            int temp = 0;
            int count = 0;
            int[] arr2 = new int[4];
            int num2 = 1000;
            int strike = 0;
            int ball = 0;

            System.out.println(chance + "회 남으셨습니다.");

            Scanner sc = new Scanner(System.in);
            System.out.print("4자리 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();

            temp = num1;

            while(temp > 0) {
                temp /= 10;
                count++;
            }

            if(count != 4) {
                System.out.println("4자리의 정수를 입력해야 합니다.");

                continue;
            }

            for (int i = 0; i < 4; i++) {
                arr2[i] = num1 / num2;
                num1 %= num2;
                num2 /= 10;
            }

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i == j && arr1[i] == arr2[j]) {
                        strike++;
                    } else if (arr1[i] == arr2[j]) {
                        ball++;
                    }
                }
            }

            chance--;

            if(strike == 4) {
                System.out.println("정답입니다.");

                return;
            } else {
                System.out.println("아쉽네요 " + strike + "S " + ball + "B " + "입니다.");
            }
        }

        System.out.println("10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다.");

    }

}