package com.yichen.thinking.in.java.chapter10.exercise03;

public class Ch10ex03 {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer("String Test").new Inner();
        System.out.println(inner);
    }
}
