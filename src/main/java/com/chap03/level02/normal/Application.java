package com.chap03.level02.normal;

import com.chap03.level02.normal.RandomMaker;

public class Application {
    public static void main(String[] args) {
        RandomMaker.randomNumber(-128, 127);
        RandomMaker.randomUpperAlpabet(10);
        RandomMaker.rockPaperScissors();
        RandomMaker.tossCoin();
    }
}