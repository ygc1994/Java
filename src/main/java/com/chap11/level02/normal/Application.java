package com.chap11.level02.normal;

import java.io.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("병합할 파일의 개수 입력 : ");
        int count = sc.nextInt();

        String[] str1 = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print(i + 1 + " 번째 파일 이름 입력 : ");
            str1[i] = sc.next();
        }

        System.out.print("병합 될 파일명 입력 : ");
        String str2 = sc.next();

        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(str2));

            for (int i = 0; i < count; i++) {
                try(BufferedReader reader = new BufferedReader(new FileReader(str1[i]))) {

                    String temp;

                    while((temp = reader.readLine()) != null) {
                        writer.write(temp + "\n");
                    }

                    if(i == count - 1) System.out.println("파일 병합이 완료 되었습니다.");

                } catch (IOException e) {
                    System.out.println("오류 : " + e.getMessage());
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if(writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

    }
}
