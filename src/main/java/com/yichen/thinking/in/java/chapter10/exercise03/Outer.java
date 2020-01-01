package com.yichen.thinking.in.java.chapter10.exercise03;

public class Outer {

    private String string;

    public Outer(String string) {
        this.string = string;
    }

    class Inner {
        @Override
        public String toString() {
            return string;
        }
    }

    public Inner inner() {
        return new Inner();
    }
}
