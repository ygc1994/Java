package com.chap04.section01.conditional.level01.basic;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();

        if(num > 0) {
            System.out.println("양수다.");
        } else System.out.println("양수가 아니다.");

    }

}