package com.chap09.level01.basic;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();

        String[] strarr = new String[] {};
        String[] worarr;
        String mfword = "";
        int count = 0;
        int num = 0;
        int temp = 0;

        strarr = str.toLowerCase().replaceAll("[^a-z]+", " ").split("\\s+");
        worarr = new String[strarr.length];

        label:
        for (int i = 0; i < strarr.length; i++) {
            for (int j = 0; j < num; j++) {
                if(strarr[i].equals(worarr[j])) continue label;
            }

            worarr[num++] = strarr[i];
            temp = 0;

            for (int k = i; k < strarr.length; k++) {
                if(strarr[k].equals(strarr[i])) temp++;
            }

            if(i == 0) System.out.println("===== 단어 빈도 =====");

            System.out.println(strarr[i] + ": " + temp);

            if(temp > count) {
                mfword = strarr[i];
                count = temp;
            }
        }

        System.out.println("가장 빈도 높은 단어 : " + mfword + " (" + count + " 번)");

    }
}