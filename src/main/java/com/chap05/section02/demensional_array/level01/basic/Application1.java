package com.chap05.section02.demensional_array.level01.basic;

public class Application1 {

    public static void main(String[] args) {

        int[][] arr = new int[3][4];
        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = num + 1;
                num++;

                if(num >= 1 && num <= 8) {
                    System.out.print(arr[i][j] + "  ");
                } else System.out.print(arr[i][j] + " ");
            }

            if(num >= 1 && num <= 8) {
                System.out.println("\b\b");
            } else System.out.println('\b');
        }

    }

}