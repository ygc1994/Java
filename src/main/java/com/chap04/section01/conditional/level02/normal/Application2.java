package com.chap04.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        double height = sc.nextDouble();

        double bmi = weight / (height * height);

        if(bmi < 20) {
            System.out.println("당신은 저체중 입니다.");
        } else if(bmi >= 20 && bmi < 25) {
            System.out.println("당신은 정상체중 입니다.");
        } else if(bmi >= 25 && bmi < 30) {
            System.out.println("당신은 과체중 입니다.");
        } else System.out.println("당신은 비만 입니다.");

    }

}