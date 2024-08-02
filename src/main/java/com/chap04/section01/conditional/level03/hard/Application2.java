package com.chap04.section01.conditional.level03.hard;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("과일 이름을 입력하세요 : ");
        String str = sc.nextLine();

        label:
        if(str.equals("사과") || str.equals("바나나") || str.equals("복숭아") || str.equals("키위")) {
            switch (str) {
                case "사과": System.out.println(str + "의 가격은 1000원 입니다."); break label;
                case "바나나": System.out.println(str + "의 가격은 3000원 입니다."); break label;
                case "복숭아": System.out.println(str + "의 가격은 2000원 입니다."); break label;
                case "키위": System.out.println(str + "의 가격은 5000원 입니다."); break label;
            }
        } else System.out.println("준비된 상품이 없습니다.");


    }

}