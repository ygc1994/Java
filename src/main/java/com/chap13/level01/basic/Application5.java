package com.chap13.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Application5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        TreeSet<String> words = new TreeSet<>();
        String str = "";

        while(true) {
            System.out.print("단어 입력 ('exit' 입력 시 종료): ");
            str = br.readLine();

            if(str.equals("exit")) {
                System.out.println("정렬된 단어 : " + words);

                break;
            } else words.add(str);
        }

    }
}