package com.chap05.section01.array.level03.hard;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("홀수인 양의 정수를 입력하세요 : ");
        int num = sc.nextInt();

        int count = 0;

        if (num % 2 == 0 || num < 0) {
            System.out.println("양수 혹은 홀수만 입력해야 합니다.");
        } else {
            int[] arr = new int[num];

            for (int i = 0; i < arr.length; i++) {
                if (i <= arr.length / 2) {
                    arr[i] = ++count;
                } else arr[i] = --count;

                System.out.print(arr[i] + " ");
            }
        }

        System.out.print('\b');

    }

}