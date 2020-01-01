package com.yichen.thinking.in.java.chapter10.exercise04;

public class Ch10ex04 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        Selector selector = sequence.selector();
        System.out.println(sequence == selector.sequence());
    }
}
