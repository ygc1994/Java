package com.chap13.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Application6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> pb = new HashMap<>();
        StringTokenizer st;
        String str = "";
        String name = "";
        String pn = "";

        while(true) {
            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");
            str = br.readLine();

            if(str.equals("exit")) {
                break;
            } else if(str.equals("search")) {
                System.out.print("검색 할 이름 : ");
                name = br.readLine();

                pn = pb.get(name);

                if(pn != null) {
                    System.out.println(name + "씨의 전화번호 : " + pn);
                } else System.out.println(name + "씨의 번호는 등록 되어 있지 않습니다.");
            } else {
                st = new StringTokenizer(str);

                try {
                    name = st.nextToken();
                    pn = st.nextToken();
                    pb.put(name, pn);

                    System.out.println("추가 완료 : " + name + " " + pn);
                } catch (NoSuchElementException e) {
                    System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
                }
            }
        }

    }
}