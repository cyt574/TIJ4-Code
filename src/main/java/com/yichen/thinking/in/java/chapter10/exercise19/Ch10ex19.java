package com.yichen.thinking.in.java.chapter10.exercise19;

public class Ch10ex19 {
    static class FirstStaticInnerClass {
        static class SecondStaticInnerClass {
            static class ThirdStaticInnerClass {

            }
        }
    }

    public static void main(String[] args) {
        new FirstStaticInnerClass.SecondStaticInnerClass.ThirdStaticInnerClass();
        new FirstStaticInnerClass.SecondStaticInnerClass();
        new FirstStaticInnerClass();
    }
}
