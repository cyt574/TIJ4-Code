package com.yichen.thinking.in.java.chapter10.exercise01;

public class Outer {
    class Inner {

    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        inner = outer.inner();
    }
}
