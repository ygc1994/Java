package com.chap13.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Application1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> grades = new ArrayList<>();
        int grade = 0;
        int sum = 0;
        double avg = 0.0;
        String str = "y";

        while(str.equalsIgnoreCase("y")) {
            System.out.print("학생 성적 : ");
            grade = Integer.parseInt(br.readLine());
            System.out.print("추가 입력하려면 y : ");
            str = br.readLine();

            grades.add(grade);
        }

        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }

        avg = sum / grades.size();

        System.out.println("학생 인원 : " + grades.size());
        System.out.println("평균 점수 : " + avg);

    }
}