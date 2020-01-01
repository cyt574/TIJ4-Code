package com.yichen.thinking.in.java.chapter10.exercise02;

public class OuterString {
    public String string;

    public OuterString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }
}
