package com.chap05.section01.array.level02.normal;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 하나 입력하세요 : ");
        String str = sc.nextLine();
        System.out.print("검색할 문자를 입력하세요 : ");
        char ch = sc.next().charAt(0);

        char[] carr = str.toCharArray();
        int count = 0;

        for (int i = 0; i < carr.length; i++) {
            if (ch == carr[i]) count++;
        }

        System.out.println("입력하신 문자열 " + str + "에서 찾으시는 문자 " + ch + "은 " + count + "개 입니다.");

    }

}