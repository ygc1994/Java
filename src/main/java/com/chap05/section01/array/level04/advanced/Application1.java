package com.chap05.section01.array.level04.advanced;

import java.util.Arrays;

public class Application1 {

    public static void main(String[] args) {

        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            int random = (int) (Math.random() * 45) + 1;
            arr[i] = random;

            for (int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr);
            System.out.print(arr[i] + " ");
        }

        System.out.print('\b');

    }

}