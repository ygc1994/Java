package com.chap11.level01.basic;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원본 파일의 이름을 입력하세요 : ");
        String str1 = sc.nextLine();
        System.out.print("복사 파일의 이름을 입력하세요 : ");
        String str2 = sc.nextLine();

        try (FileReader fr = new FileReader(str1)) {

            int value;

            while ((value = fr.read()) != -1) {
                try (FileWriter fw = new FileWriter(str2, true)) {

                    fw.write(value);

                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.println("파일 복사가 성공적으로 완료 되었습니다.");

        } catch (IOException e) {
            System.out.println("오류 : " + e.getMessage());
        }

    }
}