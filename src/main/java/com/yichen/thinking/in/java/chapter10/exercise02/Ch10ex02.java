package com.yichen.thinking.in.java.chapter10.exercise02;

public class Ch10ex02 {

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(new OuterString(Integer.toString(i)));
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}
