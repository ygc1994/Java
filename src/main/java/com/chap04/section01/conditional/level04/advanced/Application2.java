package com.chap04.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("월 급여 입력 : ");
        int salary = sc.nextInt();
        System.out.print("매출액 입력 : ");
        int sale = sc.nextInt();

        double br = 0;
        int bouns = 0;
        int ts = 0;

        if(sale >= 50000000) {
            br = 0.05;
            ts = salary + (int) (sale * br);
        } else if(sale >= 30000000 && sale < 50000000) {
            br = 0.03;
            ts = salary + (int) (sale * br);
        } else if(sale >= 10000000 && sale < 30000000) {
            br = 0.01;
            ts = salary + (int) (sale * br);
        } else ts = salary;

        System.out.println("======================");
        System.out.println("매출액 : " + sale);
        System.out.println("보너스율 : " + (int) (br * 100) + "%");
        System.out.println("월 급여 : " + salary);
        System.out.println("보너스 금액 : " + (int) (sale * br));
        System.out.println("======================");
        System.out.println("총 급여 : " + ts);

    }

}