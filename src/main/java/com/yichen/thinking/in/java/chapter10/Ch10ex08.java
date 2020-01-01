package com.yichen.thinking.in.java.chapter10;

public class Ch10ex08 {

    public class InnerClass {
        private String string = "String 1";
    }

    public static void main(String[] args) {
        System.out.println(new Ch10ex08().new InnerClass().string);;
    }
}
