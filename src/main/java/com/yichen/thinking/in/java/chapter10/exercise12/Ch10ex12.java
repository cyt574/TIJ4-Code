package com.yichen.thinking.in.java.chapter10.exercise12;

public class Ch10ex12 {



    public void hello() {
        new Object(){
            public void hello() {
                System.out.println("Hello World");
            }
        }.hello();
    }

    public static void main(String[] args) {
        new Ch10ex12().hello();
    }
}
