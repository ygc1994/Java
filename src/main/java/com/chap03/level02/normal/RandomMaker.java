package com.chap03.level02.normal;

import java.util.Random;

public class RandomMaker {
    public static int randomNumber(int min, int max) {
        Random random = new Random();

        int num = random.nextInt(max - min + 1) + min;

        System.out.println(num);

        return 0;
    }

    public static String randomUpperAlpabet(int length) {
        for (int i = 1; i <= length; i++) {
            int num = (int) (Math.random() * 26) + 65;
            System.out.print((char) num);
        }

        System.out.println();

        return "";
    }

    public static String rockPaperScissors() {
        int num = (int) (Math.random() * 3) + 1;

        if (num == 1)
            System.out.println("가위");
        else if (num == 2)
            System.out.println("바위");
        else
            System.out.println("보");

        return "";
    }

    public static String tossCoin() {
        int num = (int) (Math.random() * 2) + 1;

        if (num == 1)
            System.out.println("앞면");
        else
            System.out.println("뒷면");

        return "";
    }
}