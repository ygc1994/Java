package com.chap04.section02.looping_and_branching.level02.normal;

public class Application2 {
    public static void main(String[] args) {

        char ch = 'a';
        int sum = 0;

        for (int i = 0; i <= 25; i++) {
            sum = ch + i;
            System.out.print((char) sum);
        }

    }

}