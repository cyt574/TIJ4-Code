package com.yichen.thinking.in.java.chapter09;

interface StaticFinal {
    String RED = "red";
}

class Red implements StaticFinal {
    public Red() {
//        RED = "green";
    }
}

public class Chapter09Exercise17 {
    public static void main(String[] args) {
        System.out.println("Red.RED = " + Red.RED);
    }
}
