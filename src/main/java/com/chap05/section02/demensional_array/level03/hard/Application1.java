package com.chap05.section02.demensional_array.level03.hard;

import java.util.Random;
import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int row;
        int column;
        char[][] ch;

        do {
            System.out.print("가로 행의 수를 입력하세요 : ");
            row = sc.nextInt();
            System.out.print("세로 열의 수를 입력하세요 : ");
            column = sc.nextInt();

            if(!(row >= 1 && row <= 10 && column >= 1 && column <= 10)) System.out.println(
                    "반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
        } while(!(row >= 1 && row <= 10 && column >= 1 && column <= 10));

        ch = new char[row][column];

        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[i].length; j++) {
                int randomInt = random.nextInt(26) + 65;

                ch[i][j] = (char) randomInt;

                System.out.print(ch[i][j] + " ");
            }

            System.out.println("\b");
        }

    }

}