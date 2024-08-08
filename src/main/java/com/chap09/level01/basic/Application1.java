package com.chap09.level01.basic;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str1 = sc.nextLine();

        String[] strArr = str1.split(" ");

        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < strArr.length; i++) {
            sb.append(strArr[i].substring(0, 1).toUpperCase());
            sb.append(strArr[i].substring(1).toLowerCase());
            sb.append(" ");

            count++;
        }

        System.out.print("변환된 문자열 : " + sb);
        System.out.println('\b');
        System.out.println("총 단어 개수: " + count);

    }
}