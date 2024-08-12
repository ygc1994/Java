package com.chap04.section02.looping_and_branching.level03.hard;

import java.util.Random;
import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        Random random = new Random();

        int randomInt = random.nextInt(100) + 1;
        int num = 0;
        int count = 0;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("정수를 입력하세요 : ");
            num = sc.nextInt();

            if(num > randomInt) {
                System.out.println("입력하신 정수보다 작습니다.");

                count++;
            } else if (num < randomInt) {
                System.out.println("입력하신 정수보다 큽니다.");

                count++;
            } else {
                count++;

                System.out.println("정답입니다. " + count + "회 만에 정답을 맞추셨습니다.");
            }
        } while (num != randomInt);

    }

}