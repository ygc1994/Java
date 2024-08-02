package com.chap05.section01.array.level01.basic;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        String[] sarr = new String[5];

        sarr[0] = "딸기";
        sarr[1] = "바나나";
        sarr[2] = "복숭아";
        sarr[3] = "키위";
        sarr[4] = "사과";

        Scanner sc = new Scanner(System.in);
        System.out.print("0부터 4까지의 정수를 입력하세요 : ");
        int num = sc.nextInt();

        if(num < 0 || num >= 5) {
            System.out.println("준비된 과일이 없습니다.");
        } else System.out.println(sarr[num]);

    }

}