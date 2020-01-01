package com.yichen.thinking.in.java.chapter10.exercise15;

public class SecondClass {
    public static FirstClass getFirstClassMethod1() {
        return new FirstClass("FirstClass create By method1");
    }

    public static FirstClass getFirstClassMethod2() {
        return new FirstClass("FirstClass create By method2") {
            @Override
            public void f() {
                super.f();
                System.out.println("additional method");
            }
        };
    }
}
