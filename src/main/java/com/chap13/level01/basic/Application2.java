package com.chap13.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Application2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<String> urls = new LinkedList<>();
        String url = "";

        while(!url.equals("exit")) {
            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            url = br.readLine();

            urls.addFirst(url);

            if(urls.size() > 5) urls.remove(5);

            if(!url.equals("exit")) System.out.println("최근 방문 url : " + urls);
        }

    }
}