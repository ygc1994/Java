package com.chap04.section02.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();
        System.out.print("숫자를 입력하세요 : ");
        int push = sc.nextInt();

        char[] pwd = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            pwd[i] = str.charAt(i);

            if(str.charAt(i) != ' ') {
                while(push > 26) {
                    push -= 26;
                }

                pwd[i] = (char) (str.charAt(i) + push);

                while(!(pwd[i] >= 65 && pwd[i] <= 90 || pwd[i] >= 97 && pwd[i] <= 122)) {
                    pwd[i] -= 26;
                }
            }
        }

        System.out.println(pwd);

    }

}