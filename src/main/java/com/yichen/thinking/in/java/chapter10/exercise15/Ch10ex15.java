package com.yichen.thinking.in.java.chapter10.exercise15;

public class Ch10ex15 {
    public static void main(String[] args) {
        FirstClass firstClass1 = SecondClass.getFirstClassMethod1();
        firstClass1.f();
        FirstClass firstClass2 = SecondClass.getFirstClassMethod2();
        firstClass2.f();
    }
}
