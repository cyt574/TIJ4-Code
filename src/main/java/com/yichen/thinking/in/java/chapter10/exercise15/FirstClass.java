package com.yichen.thinking.in.java.chapter10.exercise15;

public class FirstClass {
    private String name;
    public FirstClass(String name) {
        this.name = name;
    }

    private FirstClass() {

    }

    public void f() {
        System.out.println(name);;
    }
}
