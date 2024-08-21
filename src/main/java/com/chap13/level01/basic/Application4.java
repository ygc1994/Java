package com.chap13.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Application4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<String> idList = new HashSet<>();
        String str = "";

        while(true) {
            System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
            str = br.readLine();
            if(str.equals("exit")) {
                System.out.println("모든 학생의 ID : " + idList);

                break;
            } else if(idList.contains(str)) {
                System.out.println("이미 등록 된 ID입니다.");
            } else {
                idList.add(str);

                System.out.println("ID가 추가 되었습니다.");
            }
        }

    }
}