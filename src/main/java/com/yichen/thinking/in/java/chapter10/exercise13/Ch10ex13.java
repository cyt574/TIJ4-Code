package com.yichen.thinking.in.java.chapter10.exercise13;

public class Ch10ex13 {
    public Interface test() {
        return new Interface() {

            @Override
            public void test() {
                System.out.println("Test");
            }
        };
    }

    public static void main(String[] args) {
        Interface interface1 = new Ch10ex13().test();
    }
}
